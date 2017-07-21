package org.craftedsw.tripservicekata.trip;

import org.craftedsw.tripservicekata.exception.CollaboratorCallException;
import org.craftedsw.tripservicekata.user.User;
import org.junit.Test;

public class TripDAOTest {
	@Test(expected = CollaboratorCallException.class) public void
	should_throw_exception_when_retrieving_user_trip(){
		new TripDAO().tripsBy(new User());
	}
}
