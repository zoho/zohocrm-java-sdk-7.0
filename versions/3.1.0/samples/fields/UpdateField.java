package samples.fields;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.zoho.api.authenticator.OAuthToken;
import com.zoho.api.authenticator.Token;
import com.zoho.crm.api.Initializer;
import com.zoho.crm.api.ParameterMap;
import com.zoho.crm.api.fields.Tooltip;
import com.zoho.crm.api.fields.Unique;
import com.zoho.crm.api.dc.USDataCenter;
import com.zoho.crm.api.fields.APIException;
import com.zoho.crm.api.fields.ActionHandler;
import com.zoho.crm.api.fields.ActionResponse;
import com.zoho.crm.api.fields.ActionWrapper;
import com.zoho.crm.api.fields.BodyWrapper;
import com.zoho.crm.api.fields.Crypt;
import com.zoho.crm.api.fields.External;
import com.zoho.crm.api.fields.Fields;
import com.zoho.crm.api.fields.FieldsOperations;
import com.zoho.crm.api.fields.PickListValue;
import com.zoho.crm.api.fields.FieldsOperations.CreateFieldParam;
import com.zoho.crm.api.fields.Profile;
import com.zoho.crm.api.fields.SuccessResponse;
import com.zoho.crm.api.dc.DataCenter.Environment;
import com.zoho.crm.api.util.APIResponse;
import com.zoho.crm.api.util.Model;

public class UpdateField
{
	public static void updateField(Long layoutId, String module, Long fieldId) throws Exception
	{
		FieldsOperations fieldsOperations = new FieldsOperations();
		BodyWrapper bodyWrapper = new BodyWrapper();
		List<Fields> fields = new ArrayList<Fields>();
		
		/**Sample Input: Field Type - Text*/
		Fields field = new Fields();
		field.setFieldLabel("SDK");
		field.setDisplayLabel("SDK");
		field.setDataType("text");
		field.setLength(180);
		Tooltip toolTip = new Tooltip();
		toolTip.setName("static_text");
		toolTip.setValue("Enter your name");
		field.setTooltip(toolTip);
		Unique unique = new Unique();
		unique.setCasesensitive("false");
		field.setUnique(unique);
		Crypt crypt = new Crypt();
		crypt.setMode("decryption");
		field.setCrypt(crypt);
		External external = new External();
		external.setType("user");
		external.setShow(true);
		field.setExternal(external);
		List<Profile> profiles = new ArrayList<Profile>();
		Profile profile = new Profile();
		profile.setId(34770610026014l);
		profile.setPermissionType("read_write");
		profiles.add(profile);
		field.setProfiles(profiles);
		fields.add(field);
		/** end*/
		
		/**Sample Input: Field Type - Picklist */
		Fields picklistfield = new Fields();
		picklistfield.setFieldLabel("Select Region5");
		picklistfield.setDataType("picklist");
		Tooltip toolTip1 = new Tooltip();
		toolTip1.setName("info_icon");
		toolTip1.setValue("Select your region here");
		picklistfield.setTooltip(toolTip1);
		picklistfield.setLength(120);
		List<Profile> picklistfieldprofiles = new ArrayList<Profile>();
		Profile profile1 = new Profile();
		profile1.setId(753477395001l);
		profile1.setPermissionType("read_write");
		picklistfieldprofiles.add(profile1);
		
		List<PickListValue> picklistvalues = new ArrayList<PickListValue>();
		
		// Sample for adding picklist values to picklist field.
		PickListValue picklistvalue = new PickListValue();
		picklistvalue = new PickListValue();
		picklistvalue.setDisplayValue("Left");
		picklistvalue.setActualValue("IN_Left");
		picklistvalues.add(picklistvalue);
		
		picklistvalue = new PickListValue();
		picklistvalue.setDisplayValue("Top");
		picklistvalue.setActualValue("IN_Top");
		picklistvalues.add(picklistvalue);
		
		picklistvalue = new PickListValue();
		picklistvalue.setDisplayValue("Down");
		picklistvalue.setActualValue("IN_Down");
		picklistvalues.add(picklistvalue);
		
		// Sample for updating the picklistvalue in picklist field.
		PickListValue picklistvalue1 = new PickListValue();
		picklistvalue1.setDisplayValue("South_Updated");
		picklistvalue1.setActualValue("IN_South");
		picklistvalue1.setId(75347706075l);
		picklistvalues.add(picklistvalue1);
		
		// Sample for removing the picklist value from picklist field.
		PickListValue picklistvalue2 = new PickListValue();
		picklistvalue2.setDisplayValue("West");
		picklistvalue2.setActualValue("IN_West");
		picklistvalue2.setId(7534776071l);
		picklistvalue2.setDelete(true);
		picklistvalues.add(picklistvalue2);
		
		picklistfield.setPickListValues(picklistvalues);
		picklistfield.setProfiles(picklistfieldprofiles);
		picklistfield.setPickListValuesSortedLexically(true);
		picklistfield.setEnableColourCode(true);
		fields.add(picklistfield);
		
		bodyWrapper.setFields(fields);
		ParameterMap paramInstance = new ParameterMap();
		paramInstance.add(CreateFieldParam.MODULE, "Leads");
		APIResponse<ActionHandler> response = fieldsOperations.updateField(fieldId, bodyWrapper, paramInstance);
		if (response != null)
		{
			System.out.println("Status Code: " + response.getStatusCode());
			if (response.isExpected())
			{
				ActionHandler actionHandler = response.getObject();
				if (actionHandler instanceof ActionWrapper)
				{
					ActionWrapper actionWrapper = (ActionWrapper) actionHandler;
					List<ActionResponse> actionResponses = actionWrapper.getFields();
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
							System.out.println("Message: " + successResponse.getMessage());
						}
						else if (actionResponse instanceof APIException)
						{
							APIException exception = (APIException) actionResponse;
							System.out.println("Status: " + exception.getStatus().getValue());
							System.out.println("Code: " + exception.getCode().getValue());
							System.out.println("Details: ");
							for (Map.Entry<String, Object> entry : exception.getDetails().entrySet())
							{
								System.out.println(entry.getKey() + ": " + entry.getValue());
							}
							System.out.println("Message: " + exception.getMessage());
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
					System.out.println("Message: " + exception.getMessage());
				}
			}
			else
			{
				Model responseObject = response.getModel();
				Class<? extends Model> clas = responseObject.getClass();
				Field[] fields1 = clas.getDeclaredFields();
				for (Field field1 : fields1)
				{
					field1.setAccessible(true);
					System.out.println(field1.getName() + ":" + field1.get(responseObject));
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
			String moduleAPIName = "Leads";
			Long layoutId = 7534770167l;
			Long fieldId = 75347706070l;
			updateField(layoutId, moduleAPIName, fieldId);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
