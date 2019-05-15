package com.bijay.servlet.app.utility;

public class StringUtility {

	public static boolean hasContent(String string) {
		if (string == null || string.trim().equals("")) {
			return false;
		}
		return true;
	}
}
