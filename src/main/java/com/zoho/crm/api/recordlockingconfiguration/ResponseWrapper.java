package com.zoho.crm.api.recordlockingconfiguration;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;
import java.util.List;

public class ResponseWrapper implements Model, ResponseHandler
{
	private List<RecordLock> recordLockingConfigurations;

	private HashMap<String, Integer> keyModified = new HashMap<String, Integer>();


	/**
	 * The method to get the value of recordLockingConfigurations
	 * @return An instance of List<RecordLock>
	 */
	public List<RecordLock> getRecordLockingConfigurations()
	{
		return  this.recordLockingConfigurations;

	}

	/**
	 * The method to set the value to recordLockingConfigurations
	 * @param recordLockingConfigurations An instance of List<RecordLock>
	 */
	public void setRecordLockingConfigurations(List<RecordLock> recordLockingConfigurations)
	{
		 this.recordLockingConfigurations = recordLockingConfigurations;

		 this.keyModified.put("record_locking_configurations", 1);

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