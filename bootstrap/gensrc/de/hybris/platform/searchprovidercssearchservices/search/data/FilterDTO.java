/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 25-Jul-2022, 11:52:32 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.searchprovidercssearchservices.search.data;

import java.io.Serializable;
import de.hybris.platform.searchprovidercssearchservices.search.data.AbstractQueryDTO;


import java.util.Objects;
public  class FilterDTO  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>FilterDTO.query</code> property defined at extension <code>searchprovidercssearchservices</code>. */
	
	private AbstractQueryDTO query;
	
	public FilterDTO()
	{
		// default constructor
	}
	
	public void setQuery(final AbstractQueryDTO query)
	{
		this.query = query;
	}

	public AbstractQueryDTO getQuery() 
	{
		return query;
	}
	

}