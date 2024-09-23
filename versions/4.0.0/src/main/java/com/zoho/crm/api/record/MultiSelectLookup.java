package com.zoho.crm.api.record;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.Map;

public class MultiSelectLookup implements Model
{
	private Long id;

	private Map<String, Object> fieldname;

	private Map<String, Object> hasMore;

	private HashMap<String, Integer> keyModified = new HashMap<String, Integer>();


	/**
	 * The method to get the value of id
	 * @return A Long representing the id
	 */
	public Long getId()
	{
		return  this.id;

	}

	/**
	 * The method to set the value to id
	 * @param id A Long representing the id
	 */
	public void setId(Long id)
	{
		 this.id = id;

		 this.keyModified.put("id", 1);

	}

	/**
	 * The method to get the value of fieldname
	 * @return An instance of Map<String,Object>
	 */
	public Map<String, Object> getFieldname()
	{
		return  this.fieldname;

	}

	/**
	 * The method to set the value to fieldname
	 * @param fieldname An instance of Map<String,Object>
	 */
	public void setFieldname(Map<String, Object> fieldname)
	{
		 this.fieldname = fieldname;

		 this.keyModified.put("fieldName", 1);

	}

	/**
	 * The method to get the value of hasMore
	 * @return An instance of Map<String,Object>
	 */
	public Map<String, Object> getHasMore()
	{
		return  this.hasMore;

	}

	/**
	 * The method to set the value to hasMore
	 * @param hasMore An instance of Map<String,Object>
	 */
	public void setHasMore(Map<String, Object> hasMore)
	{
		 this.hasMore = hasMore;

		 this.keyModified.put("$has_more", 1);

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