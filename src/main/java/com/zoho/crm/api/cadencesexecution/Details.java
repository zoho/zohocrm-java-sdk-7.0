package com.zoho.crm.api.cadencesexecution;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class Details implements Model
{
	private String name;

	private Template template;

	private HashMap<String, Integer> keyModified = new HashMap<String, Integer>();


	/**
	 * The method to get the value of name
	 * @return A String representing the name
	 */
	public String getName()
	{
		return  this.name;

	}

	/**
	 * The method to set the value to name
	 * @param name A String representing the name
	 */
	public void setName(String name)
	{
		 this.name = name;

		 this.keyModified.put("name", 1);

	}

	/**
	 * The method to get the value of template
	 * @return An instance of Template
	 */
	public Template getTemplate()
	{
		return  this.template;

	}

	/**
	 * The method to set the value to template
	 * @param template An instance of Template
	 */
	public void setTemplate(Template template)
	{
		 this.template = template;

		 this.keyModified.put("template", 1);

	}

	/**
	 * The method to check if the user has modified the given key
	 * @param key A String representing the key
	 * @return An Integer representing the modification
	 */
	public Integer isKeyModified(String key)
	{
		if((( this.keyModified.containsKey(key))))
		{
			return  this.keyModified.get(key);

		}
		return null;

	}

	/**
	 * The method to mark the given key as modified
	 * @param key A String representing the key
	 * @param modification An Integer representing the modification
	 */
	public void setKeyModified(String key, Integer modification)
	{
		 this.keyModified.put(key, modification);

	}
}