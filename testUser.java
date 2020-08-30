import static org.junit.Assert.*;

import org.junit.Test;

import com.fullteaching.backend.user.User;

public class testUser {
	@Test
	public void testEquals() {
		User user = new User("Joaquim", "123456", "jq", "picture1", "teacher");
		assertTrue(user.equals(user));
	}
	
	@Test
	public void testEqualsNull() {
		User user = new User("Joaquim", "123456", "jq", "picture1", "teacher");
		
		assertFalse(user.equals(null));
	}
	
	@Test
	public void testHashCode() {
		User user = new User("Joaquim", "123456", "jq", "picture1", "teacher");
		assertEquals(user.hashCode(), user.hashCode());
	}
	
	@Test
	public void testToString() {
		User user = new User("Joaquim", "123456", "jq", "picture1", "teacher");
		assertEquals("jq", user.toString());
	}

}
