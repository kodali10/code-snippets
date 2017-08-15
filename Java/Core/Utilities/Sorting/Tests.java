package com.kodali.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class Tests {
	@Test
	public void test() {
		// Created three user objects
		Users user = new Users();
		user.setUserName("citi");
		user.setPassWord("password");

		Users user2 = new Users();
		user2.setUserName("bofa");
		user2.setPassWord("passcode");

		Users user3 = new Users();
		user3.setUserName("discover");
		user3.setPassWord("passcode");

		Users user4 = new Users();
		user4.setUserName("amex");
		user4.setPassWord("passcode");

		// Addeduser objects to list in mixed order
		List<Users> list = new ArrayList<Users>();
		list.add(user);
		list.add(user2);
		list.add(user3);
		list.add(user4);
		// Sort the user objects in list as alphabetical order
		Collections.sort(list);

		// testing whether the user objects are sorted or not.
		assertThat(list.get(0).getUserName(), is("amex"));
		assertThat(list.get(1).getUserName(), is("bofa"));
		assertThat(list.get(2).getUserName(), is("citi"));
		assertThat(list.get(3).getUserName(), is("discover"));
	}

	@Test
	public void test2() {
		String str1 = "amex";
		String str2 = "Disco";
		String str3 = "citi";
		String str4 = "bofa";
		List<String> list = new ArrayList<String>();
		list.add(str1);
		list.add(str2);
		list.add(str3);
		list.add(str4);
		// Collections.sort(list);
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				return o1.compareToIgnoreCase(o2);
			}

		});
		assertThat(list.get(0), is("amex"));
		assertThat(list.get(1), is("bofa"));
		assertThat(list.get(2), is("citi"));
		assertThat(list.get(3), is("Disco"));
	}

}
/*
 * Sorting
 * 
 * Two interfaces comparator & comparable
 * 
 * When to use these Comparable is used to sort elements in a custom order: In
 * the above program we tried to sort users objects, but we don't have any valid
 * code to sort. So we written a custom code to sort.
 * 
 * *****
 * When to use these Comparator: We cannot extend classes which are declared
 * final. So we can't create a custom sorting code to strings. To overcome this
 * Collections.sort() will have two models of arguments. One way we can pass
 * list as an argument and in another way we can pass list & comparator
 *****
 */
