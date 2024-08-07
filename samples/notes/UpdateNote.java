package samples.notes;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.zoho.api.authenticator.OAuthToken;
import com.zoho.api.authenticator.Token;
import com.zoho.crm.api.Initializer;
import com.zoho.crm.api.dc.USDataCenter;
import com.zoho.crm.api.dc.DataCenter.Environment;
import com.zoho.crm.api.modules.MinifiedModule;
import com.zoho.crm.api.notes.APIException;
import com.zoho.crm.api.notes.ActionHandler;
import com.zoho.crm.api.notes.ActionResponse;
import com.zoho.crm.api.notes.ActionWrapper;
import com.zoho.crm.api.notes.BodyWrapper;
import com.zoho.crm.api.notes.NotesOperations;
import com.zoho.crm.api.notes.ParentId;
import com.zoho.crm.api.notes.SuccessResponse;
import com.zoho.crm.api.util.APIResponse;
import com.zoho.crm.api.util.Model;

public class UpdateNote
{
	public static void updateNote(Long noteId) throws Exception
	{
		NotesOperations notesOperations = new NotesOperations();
		BodyWrapper bodyWrapper = new BodyWrapper();
		List<com.zoho.crm.api.notes.Note> notes = new ArrayList<com.zoho.crm.api.notes.Note>();
		com.zoho.crm.api.notes.Note note = new com.zoho.crm.api.notes.Note();
		note.setNoteTitle("Contacted12");
		note.setNoteContent("Need to do further tracking12");
		ParentId parentRecord = new ParentId();
		parentRecord.setId(3477061650001l);
		MinifiedModule module = new MinifiedModule();
		module.setId(34770612175l);
		module.setAPIName("Leads");
		parentRecord.setModule(module);
		note.setParentId(parentRecord);
		notes.add(note);
		bodyWrapper.setData(notes);
		APIResponse<ActionHandler> response = notesOperations.updateNote(noteId, bodyWrapper);
		if (response != null)
		{
			System.out.println("Status Code: " + response.getStatusCode());
			if (response.isExpected())
			{
				ActionHandler actionHandler = response.getObject();
				if (actionHandler instanceof ActionWrapper)
				{
					ActionWrapper actionWrapper = (ActionWrapper) actionHandler;
					List<ActionResponse> actionResponses = actionWrapper.getData();
					for (ActionResponse actionResponse : actionResponses)
					{
						if (actionResponse instanceof SuccessResponse)
						{
							SuccessResponse successResponse = (SuccessResponse) actionResponse;
							System.out.println("Status: " + successResponse.getStatus().getValue());
							System.out.println("Code: " + successResponse.getCode().getValue());
							System.out.println("Details: ");
							for (Map.Entry<String, Object> entry : successResponse.getDetails().entrySet())
							{
								System.out.println(entry.getKey() + ": " + entry.getValue());
							}
							System.out.println("Message: " + successResponse.getMessage().getValue());
						}
						else if (actionResponse instanceof APIException)
						{
							APIException exception = (APIException) actionResponse;
							System.out.println("Status: " + exception.getStatus().getValue());
							System.out.println("Code: " + exception.getCode().getValue());
							System.out.println("Details: ");
							if (exception.getDetails() != null)
							{
								for (Map.Entry<String, Object> entry : exception.getDetails().entrySet())
								{
									System.out.println(entry.getKey() + ": " + entry.getValue());
								}
							}
							System.out.println("Message: " + exception.getMessage().getValue());
						}
					}
				}
				else if (actionHandler instanceof APIException)
				{
					APIException exception = (APIException) actionHandler;
					System.out.println("Status: " + exception.getStatus().getValue());
					System.out.println("Code: " + exception.getCode().getValue());
					System.out.println("Details: ");
					for (Map.Entry<String, Object> entry : exception.getDetails().entrySet())
					{
						System.out.println(entry.getKey() + ": " + entry.getValue());
					}
					System.out.println("Message: " + exception.getMessage().getValue());
				}
			}
			else
			{
				Model responseObject = response.getModel();
				Class<? extends Model> clas = responseObject.getClass();
				Field[] fields = clas.getDeclaredFields();
				for (Field field : fields)
				{
					field.setAccessible(true);
					System.out.println(field.getName() + ":" + field.get(responseObject));
				}
			}
		}
	}

	public static void main(String[] args)
	{
		try
		{
			Environment environment = USDataCenter.PRODUCTION;
			Token token = new OAuthToken.Builder().clientID("Client_Id").clientSecret("Client_Secret").refreshToken("Refresh_Token").build();
			new Initializer.Builder().environment(environment).token(token).initialize();
			Long noteId = 3477061005001l;
			updateNote(noteId);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
