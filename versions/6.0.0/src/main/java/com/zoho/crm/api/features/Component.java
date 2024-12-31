package com.zoho.crm.api.features;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class Component implements Model
{
	private String apiName;

	private Boolean moduleSupported;

	private Detail details;

	private String featureLabel;

	private HashMap<String, Integer> keyModified = new HashMap<String, Integer>();


	/**
	 * The method to get the value of apiName
	 * @return A String representing the apiName
	 */
	public String getAPIName()
	{
		return  this.apiName;

	}

	/**
	 * The method to set the value to apiName
	 * @param apiName A String representing the apiName
	 */
	public void setAPIName(String apiName)
	{
		 this.apiName = apiName;

		 this.keyModified.put("api_name", 1);

	}

	/**
	 * The method to get the value of moduleSupported
	 * @return A Boolean representing the moduleSupported
	 */
	public Boolean getModuleSupported()
	{
		return  this.moduleSupported;

	}

	/**
	 * The method to set the value to moduleSupported
	 * @param moduleSupported A Boolean representing the moduleSupported
	 */
	public void setModuleSupported(Boolean moduleSupported)
	{
		 this.moduleSupported = moduleSupported;

		 this.keyModified.put("module_supported", 1);

	}

	/**
	 * The method to get the value of details
	 * @return An instance of Detail
	 */
	public Detail getDetails()
	{
		return  this.details;

	}

	/**
	 * The method to set the value to details
	 * @param details An instance of Detail
	 */
	public void setDetails(Detail details)
	{
		 this.details = details;

		 this.keyModified.put("details", 1);

	}

	/**
	 * The method to get the value of featureLabel
	 * @return A String representing the featureLabel
	 */
	public String getFeatureLabel()
	{
		return  this.featureLabel;

	}

	/**
	 * The method to set the value to featureLabel
	 * @param featureLabel A String representing the featureLabel
	 */
	public void setFeatureLabel(String featureLabel)
	{
		 this.featureLabel = featureLabel;

		 this.keyModified.put("feature_label", 1);

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