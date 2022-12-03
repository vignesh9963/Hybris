/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 25-Jul-2022, 11:52:27 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.productconfig.runtime.mock.data;

import java.io.Serializable;


import java.util.Objects;
public  class ConfigurationId  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>ConfigurationId.uid</code> property defined at extension <code>sapproductconfigruntimemock</code>. */
	
	private String uid;

	/** <i>Generated property</i> for <code>ConfigurationId.productId</code> property defined at extension <code>sapproductconfigruntimemock</code>. */
	
	private String productId;

	/** <i>Generated property</i> for <code>ConfigurationId.variantId</code> property defined at extension <code>sapproductconfigruntimemock</code>. */
	
	private String variantId;
	
	public ConfigurationId()
	{
		// default constructor
	}
	
	public void setUid(final String uid)
	{
		this.uid = uid;
	}

	public String getUid() 
	{
		return uid;
	}
	
	public void setProductId(final String productId)
	{
		this.productId = productId;
	}

	public String getProductId() 
	{
		return productId;
	}
	
	public void setVariantId(final String variantId)
	{
		this.variantId = variantId;
	}

	public String getVariantId() 
	{
		return variantId;
	}
	

}