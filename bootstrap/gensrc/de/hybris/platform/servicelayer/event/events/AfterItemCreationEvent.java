/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 25-Jul-2022, 11:52:30 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.servicelayer.event.events;

import java.io.Serializable;

import de.hybris.platform.servicelayer.event.events.AbstractPersistenceEvent;

public  class AfterItemCreationEvent extends AbstractPersistenceEvent 
{


	/** <i>Generated property</i> for <code>AfterItemCreationEvent.typeCode</code> property defined at extension <code>core</code>. */
	
	private String typeCode;
	
	public AfterItemCreationEvent()
	{
		super();
	}

	public AfterItemCreationEvent(final Serializable source)
	{
		super(source);
	}
	
	public void setTypeCode(final String typeCode)
	{
		this.typeCode = typeCode;
	}

	public String getTypeCode() 
	{
		return typeCode;
	}
	


}
