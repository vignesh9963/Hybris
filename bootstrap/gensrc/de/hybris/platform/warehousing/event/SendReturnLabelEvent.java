/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 25-Jul-2022, 11:52:34 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.warehousing.event;

import java.io.Serializable;
import de.hybris.platform.servicelayer.event.events.AbstractEvent;

import de.hybris.platform.returns.model.ReturnRequestModel;

public  class SendReturnLabelEvent  extends AbstractEvent 
{


	/** <i>Generated property</i> for <code>SendReturnLabelEvent.returnRequest</code> property defined at extension <code>warehousing</code>. */
	
	private ReturnRequestModel returnRequest;
	
	public SendReturnLabelEvent()
	{
		super();
	}

	public SendReturnLabelEvent(final Serializable source)
	{
		super(source);
	}
	
	public void setReturnRequest(final ReturnRequestModel returnRequest)
	{
		this.returnRequest = returnRequest;
	}

	public ReturnRequestModel getReturnRequest() 
	{
		return returnRequest;
	}
	


}
