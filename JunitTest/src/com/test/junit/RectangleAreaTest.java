package com.test.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleAreaTest {

	@Test
	public void RectangleArea() {
		Area area = new Area();
		assertEquals("RectangleArea",8,area.rectangleArea(2, 4));
	}

}
