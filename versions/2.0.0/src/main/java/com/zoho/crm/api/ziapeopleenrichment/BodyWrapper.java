package com.zoho.crm.api.ziapeopleenrichment;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class BodyWrapper implements Model
{
	private List<ZiaPeopleEnrichment> ziapeopleenrichment;

	private HashMap<String, Integer> keyModified = new HashMap<String, Integer>();


	/**
	 * The method to get the value of ziapeopleenrichment
	 * @return An instance of List<ZiaPeopleEnrichment>
	 */
	public List<ZiaPeopleEnrichment> getZiapeopleenrichment()
	{
		return  this.ziapeopleenrichment;

	}

	/**
	 * The method to set the value to ziapeopleenrichment
	 * @param ziapeopleenrichment An instance of List<ZiaPeopleEnrichment>
	 */
	public void setZiapeopleenrichment(List<ZiaPeopleEnrichment> ziapeopleenrichment)
	{
		 this.ziapeopleenrichment = ziapeopleenrichment;

		 this.keyModified.put("__zia_people_enrichment", 1);

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