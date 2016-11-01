package com.myorg.mypractise;

public class StringUtilities {

	public String removeChars(String myString, char charToRemove) {
		StringBuilder myBuilder = new StringBuilder();
		if (myString != null) {
			char[] charArray = myString.toCharArray();

			for (char eachChar : charArray) {
				if (!(charToRemove == eachChar)) {
					myBuilder.append(eachChar);
				}
			}
		}

		return myBuilder.toString();
	}

	public static void main(String[] args) {
		String myString = "String to Remove";
		StringUtilities stringUtils = new StringUtilities();
		String customRemoveString = stringUtils.removeChars(myString, 'e');
		System.out.println(customRemoveString);
		String javaRemovedString = myString.replace("e", "");
		System.out.println(javaRemovedString);

	}

}
