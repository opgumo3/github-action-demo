package com.test.githubactiondemo.util;

import lombok.NoArgsConstructor;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class StingUtil {

	public static String reverse(String input) {
		if (input == null) {
			return null;
		}
		return new StringBuilder(input).reverse().toString();
	}
}
