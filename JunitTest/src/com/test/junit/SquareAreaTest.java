package com.test.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SquareAreaTest {

	@Test
	public void testSquareArea() {
		Area area = new Area();
		assertEquals("SquareArea",4,area.squareArea(2));
	
	}

}
