package com.zoho.crm.api.org;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class ActionWrapper implements Model
{
	private List<Object> org;

	private HashMap<String, Integer> keyModified = new HashMap<String, Integer>();


	/**
	 * The method to get the value of org
	 * @return An instance of List<Object>
	 */
	public List<Object> getOrg()
	{
		return  this.org;

	}

	/**
	 * The method to set the value to org
	 * @param org An instance of List<Object>
	 */
	public void setOrg(List<Object> org)
	{
		 this.org = org;

		 this.keyModified.put("org", 1);

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