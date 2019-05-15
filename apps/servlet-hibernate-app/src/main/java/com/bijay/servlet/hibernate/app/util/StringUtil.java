package com.bijay.servlet.hibernate.app.util;

public class StringUtil {

	public static boolean hasContent(String string) {
		if (string == null || string.trim().equals("")) {
			return false;
		}
		return true;
	}
}
