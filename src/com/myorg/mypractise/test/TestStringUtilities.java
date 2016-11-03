/**
 * 
 */
package com.myorg.mypractise.test;

import org.junit.Test;

import com.myorg.mypractise.StringUtilities;

/**
 * @author ashjosh
 *
 */
public class TestStringUtilities {

	@Test
	public void test() {
		//fail("Not yet implemented");
		String myString = "This is my sentence where I need to remove a character";
		String charToRemove = "e";
		StringUtilities stringUtils = new StringUtilities();
		String customRemoveString = stringUtils.removeChars(myString, charToRemove.charAt(0));
		System.out.println(customRemoveString);
		String javaRemovedString = myString.replace(charToRemove, "");
		System.out.println(javaRemovedString);
	}

}
