/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 25-Jul-2022, 11:52:34 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.searchprovidercssearchservices.search.data;

import java.io.Serializable;


import java.util.Objects;
public  class NamedSortDTO  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>NamedSortDTO.id</code> property defined at extension <code>searchprovidercssearchservices</code>. */
	
	private String id;

	/** <i>Generated property</i> for <code>NamedSortDTO.name</code> property defined at extension <code>searchprovidercssearchservices</code>. */
	
	private String name;
	
	public NamedSortDTO()
	{
		// default constructor
	}
	
	public void setId(final String id)
	{
		this.id = id;
	}

	public String getId() 
	{
		return id;
	}
	
	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	

}