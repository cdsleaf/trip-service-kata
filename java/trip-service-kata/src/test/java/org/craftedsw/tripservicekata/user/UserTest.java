package org.craftedsw.tripservicekata.user;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.craftedsw.tripservicekata.trip.UserBuilder;
import org.junit.Test;

public class UserTest {
	
	private static final User BOB = new User();
	private static final User PAUL = new User();

	@Test public void
	should_inform_when_users_are_not_friends(){
		User user = UserBuilder.aUser()
				.friendWith(BOB)
				.build();
		
		assertThat(user.isFriendsWith(PAUL), is(false));
	}
	
	@Test public void
	should_inform_when_users_are_friends(){
		User user = UserBuilder.aUser()
				.friendWith(BOB, PAUL)
				.build();
		
		assertThat(user.isFriendsWith(PAUL), is(true));
	}
}
