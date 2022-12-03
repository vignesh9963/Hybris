/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 25-Jul-2022, 11:52:37 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.sap.productconfig.occ;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


import java.util.Objects;
/**
 * Representation of an attribute value in the context of the configuration overview
 */
@ApiModel(value="CCPAttributeValueOverview", description="Representation of an attribute value in the context of the configuration overview")
public  class OverviewCsticValueWsDTO  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** Language dependent attribute name<br/><br/><i>Generated property</i> for <code>OverviewCsticValueWsDTO.characteristic</code> property defined at extension <code>sapproductconfigocc</code>. */
@ApiModelProperty(name="characteristic", value="Language dependent attribute name", example="Accessories") 	
	private String characteristic;

	/** Language dependent value name<br/><br/><i>Generated property</i> for <code>OverviewCsticValueWsDTO.value</code> property defined at extension <code>sapproductconfigocc</code>. */
@ApiModelProperty(name="value", value="Language dependent value name", example="Extra Audio Package") 	
	private String value;
	
	public OverviewCsticValueWsDTO()
	{
		// default constructor
	}
	
	public void setCharacteristic(final String characteristic)
	{
		this.characteristic = characteristic;
	}

	public String getCharacteristic() 
	{
		return characteristic;
	}
	
	public void setValue(final String value)
	{
		this.value = value;
	}

	public String getValue() 
	{
		return value;
	}
	

}