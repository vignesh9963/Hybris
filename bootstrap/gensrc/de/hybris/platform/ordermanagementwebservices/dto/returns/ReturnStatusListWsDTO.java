/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 25-Jul-2022, 11:52:33 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ordermanagementwebservices.dto.returns;

import java.io.Serializable;
import java.util.List;


import java.util.Objects;
public  class ReturnStatusListWsDTO  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ReturnStatusListWsDTO.statuses</code> property defined at extension <code>ordermanagementwebservices</code>. */
	
	private List<String> statuses;
	
	public ReturnStatusListWsDTO()
	{
		// default constructor
	}
	
	public void setStatuses(final List<String> statuses)
	{
		this.statuses = statuses;
	}

	public List<String> getStatuses() 
	{
		return statuses;
	}
	

}