package com.test.githubactiondemo.util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StingUtilTest {

	@Test
	void reverse() {
		assertEquals("cba", StingUtil.reverse("abc"));
		assertEquals("", StingUtil.reverse(""));
		assertNull(StingUtil.reverse(null));
		assertEquals("a", StingUtil.reverse("a"));
	}
}