package com.zoho.crm.api.ziaenrichment;

import com.zoho.crm.api.util.Model;
import java.util.HashMap;

public class ScrapyActionWrapper implements Model
{
	private ScrapyActionResponse scrapyFeedback;

	private HashMap<String, Integer> keyModified = new HashMap<String, Integer>();


	/**
	 * The method to get the value of scrapyFeedback
	 * @return An instance of ScrapyActionResponse
	 */
	public ScrapyActionResponse getScrapyFeedback()
	{
		return  this.scrapyFeedback;

	}

	/**
	 * The method to set the value to scrapyFeedback
	 * @param scrapyFeedback An instance of ScrapyActionResponse
	 */
	public void setScrapyFeedback(ScrapyActionResponse scrapyFeedback)
	{
		 this.scrapyFeedback = scrapyFeedback;

		 this.keyModified.put("scrapy_feedback", 1);

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