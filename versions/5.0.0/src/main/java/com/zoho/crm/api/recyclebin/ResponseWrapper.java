package com.zoho.crm.api.recyclebin;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class ResponseWrapper implements Model, ResponseHandler
{
	private List<RecycleBin> recycleBin;

	private Info info;

	private HashMap<String, Integer> keyModified = new HashMap<String, Integer>();


	/**
	 * The method to get the value of recycleBin
	 * @return An instance of List<RecycleBin>
	 */
	public List<RecycleBin> getRecycleBin()
	{
		return  this.recycleBin;

	}

	/**
	 * The method to set the value to recycleBin
	 * @param recycleBin An instance of List<RecycleBin>
	 */
	public void setRecycleBin(List<RecycleBin> recycleBin)
	{
		 this.recycleBin = recycleBin;

		 this.keyModified.put("recycle_bin", 1);

	}

	/**
	 * The method to get the value of info
	 * @return An instance of Info
	 */
	public Info getInfo()
	{
		return  this.info;

	}

	/**
	 * The method to set the value to info
	 * @param info An instance of Info
	 */
	public void setInfo(Info info)
	{
		 this.info = info;

		 this.keyModified.put("info", 1);

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