/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.impex.jalo;

import de.hybris.bootstrap.annotations.UnitTest;
import de.hybris.platform.impex.jalo.imp.ValueLine;

import java.util.Collections;

import org.apache.commons.lang.StringUtils;
import org.junit.Assert;
import org.junit.Test;



/**
 * Test ValueLine's typeCode cell splitting.
 */
@UnitTest
public class ValueLineSplitTypeCodeCellTest
{
	private static final String EMPTY_VALUE = StringUtils.EMPTY;
	private static final String LOCATION = "location";
	private static final String TYPECODE = "typeCode";
	private static final String UNRESOLVED_COMMENT = "unresolvedComment";
	private static final String PROCESSED_ITEM_PK = "1234567890";
	private static final String UNRECOVERABLE = "true";
	private static final String CONFLICTING_ITEM_PK = "9876543210";
	private static final int LINE_NUMBER = 123;
	private static final String TYPECODE_NOT_UNRECOVERABLE_STRING = TYPECODE + "," + PROCESSED_ITEM_PK + "," + EMPTY_VALUE
			+ "," + EMPTY_VALUE + "," + UNRESOLVED_COMMENT;
	private static final String TYPECODE_NOT_UNRECOVERABLE_WITHOUT_COMMENT_STRING = TYPECODE + "," + PROCESSED_ITEM_PK + ","
			+ EMPTY_VALUE + "," + CONFLICTING_ITEM_PK + "," + EMPTY_VALUE;

	private static final String TYPECODE_UNRECOVERABLE_STRING = TYPECODE + "," + PROCESSED_ITEM_PK + "," + UNRECOVERABLE + "," + CONFLICTING_ITEM_PK + ","
			+ UNRESOLVED_COMMENT;
	private static final String TYPECODE_UNRECOVERABLE_WITHOUT_COMMENT_STRING = TYPECODE + "," + PROCESSED_ITEM_PK + ","
			+ UNRECOVERABLE + "," + CONFLICTING_ITEM_PK + "," + EMPTY_VALUE;


	@Test
	public void testOnlyTypecode()
	{
		final ValueLine valueLine = new ValueLine(null, TYPECODE, Collections.emptyMap(), LINE_NUMBER, LOCATION);
		Assert.assertEquals(TYPECODE, valueLine.getTypeCode());
		Assert.assertEquals(LINE_NUMBER, valueLine.getLineNumber());
		Assert.assertEquals(LOCATION, valueLine.getLocation());
		Assert.assertNull(valueLine.getProcessedItemPK());
		Assert.assertFalse(valueLine.isUnrecoverable());
		Assert.assertFalse(valueLine.isUnresolved());
		valueLine.markUnresolved();
		Assert.assertTrue(valueLine.isUnresolved());
		Assert.assertEquals(StringUtils.EMPTY, valueLine.getUnresolvedReason());
	}

	@Test
	public void testTypeCodeNotUnrecoverableWithoutComment()
	{
		final ValueLine valueLine = new ValueLine(null, TYPECODE_NOT_UNRECOVERABLE_WITHOUT_COMMENT_STRING, Collections.emptyMap(),
				LINE_NUMBER, LOCATION);
		Assert.assertEquals(TYPECODE, valueLine.getTypeCode());
		Assert.assertEquals(LINE_NUMBER, valueLine.getLineNumber());
		Assert.assertEquals(LOCATION, valueLine.getLocation());
		Assert.assertEquals(PROCESSED_ITEM_PK, valueLine.getProcessedItemPK().toString());
		Assert.assertFalse(valueLine.isUnrecoverable());
		Assert.assertFalse(valueLine.isUnresolved());
		valueLine.markUnresolved();
		Assert.assertTrue(valueLine.isUnresolved());
		Assert.assertEquals(StringUtils.EMPTY, valueLine.getUnresolvedReason());
	}

	@Test
	public void testTypeCodeNotUnrecoverableWithComment()
	{
		final ValueLine valueLine = new ValueLine(null, TYPECODE_NOT_UNRECOVERABLE_STRING, Collections.emptyMap(), LINE_NUMBER,
				LOCATION);
		Assert.assertEquals(TYPECODE, valueLine.getTypeCode());
		Assert.assertEquals(LINE_NUMBER, valueLine.getLineNumber());
		Assert.assertEquals(LOCATION, valueLine.getLocation());
		Assert.assertEquals(PROCESSED_ITEM_PK, valueLine.getProcessedItemPK().toString());
		Assert.assertFalse(valueLine.isUnrecoverable());
		Assert.assertFalse(valueLine.isUnresolved());
		valueLine.markUnresolved();
		Assert.assertTrue(valueLine.isUnresolved());
		Assert.assertEquals(UNRESOLVED_COMMENT, valueLine.getUnresolvedReason());
	}

	@Test
	public void testTypeCodeUnrecoverableWithoutComment()
	{
		final ValueLine valueLine = new ValueLine(null, TYPECODE_UNRECOVERABLE_WITHOUT_COMMENT_STRING, Collections.emptyMap(),
				LINE_NUMBER, LOCATION);
		Assert.assertEquals(TYPECODE, valueLine.getTypeCode());
		Assert.assertEquals(LINE_NUMBER, valueLine.getLineNumber());
		Assert.assertEquals(LOCATION, valueLine.getLocation());
		Assert.assertEquals(PROCESSED_ITEM_PK, valueLine.getProcessedItemPK().toString());
		Assert.assertTrue(valueLine.isUnrecoverable());
		Assert.assertFalse(valueLine.isUnresolved());
		valueLine.markUnresolved();
		Assert.assertTrue(valueLine.isUnresolved());
		Assert.assertEquals(StringUtils.EMPTY, valueLine.getUnresolvedReason());
	}

	@Test
	public void testTypeCodeUnrecoverableWithComment()
	{
		final ValueLine valueLine = new ValueLine(null, TYPECODE_UNRECOVERABLE_STRING, Collections.emptyMap(), LINE_NUMBER,
				LOCATION);
		Assert.assertEquals(TYPECODE, valueLine.getTypeCode());
		Assert.assertEquals(LINE_NUMBER, valueLine.getLineNumber());
		Assert.assertEquals(LOCATION, valueLine.getLocation());
		Assert.assertEquals(PROCESSED_ITEM_PK, valueLine.getProcessedItemPK().toString());
		Assert.assertTrue(valueLine.isUnrecoverable());
		Assert.assertFalse(valueLine.isUnresolved());
		valueLine.markUnresolved();
		Assert.assertTrue(valueLine.isUnresolved());
		Assert.assertEquals(UNRESOLVED_COMMENT, valueLine.getUnresolvedReason());
	}

}
