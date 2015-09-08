/*
 * pcGenGUIQuasvinTest.java
 * Copyright 2015 (C) Andrew Maitland <amaitland@users.sourceforge.net>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 * Created on 09/07/2015
 *
 * $Id$
 */
package pcgen.inttest.game_35e;

import junit.framework.Test;
import junit.framework.TestSuite;
import pcgen.inttest.PcgenFtlTestCase;

/**
 * Tests a 35e Psion.
 * See the PCG file for details
 */
@SuppressWarnings("nls")
public class pcGenGUIQuasvinTest extends PcgenFtlTestCase
{

	/**
	 * 
	 */
	public pcGenGUIQuasvinTest()
	{
		super("35e_quasvin");
	}

	/**
	 * standard JUnit style constructor
	 * 
	 * @param name
	 */
	public pcGenGUIQuasvinTest(String name)
	{
		super(name);
	}

	/**
	 * @return A <tt>TestSuite</tt>
	 */
	public static Test suite()
	{
		return new TestSuite(pcGenGUIQuasvinTest.class);
	}

	/**
	 * Loads and outputs the character.
	 * 
	 * @throws Exception If an error occurs.
	 */
	public void testQuasvin() throws Exception
	{
		runTest("Quasvin", "35e");
	}
}
