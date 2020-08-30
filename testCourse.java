import static org.junit.Assert.*;

import org.junit.Test;

import com.fullteaching.backend.course.Course;
import com.fullteaching.backend.user.User;

public class testCourse {
	
	@Test
	public void testEquals() {
		User professor = new User("Joao", "1234", "John", "picture2", "teacher");
		
		Course curso = new Course("Programacao Java", "imagem Java", professor);
		assertTrue(curso.equals(curso));
	}
	
	@Test
	public void testEqualsNull() {
		User professor = new User("Joao", "1234", "John", "picture2", "teacher");
		
		Course curso = new Course("Programacao Java", "imagem Java", professor);
		assertFalse(curso.equals(null));
	}
	
	@Test
	public void testToString() {
		User professor = new User("Joao", "1234", "John", "picture2", "teacher");
		
		Course curso = new Course("Programacao Java", "imagem Java", professor);
		assertEquals("Course[title: \"" + curso.getTitle() + "\", teacher: \"" + professor.getNickName() + "\", #attenders: " + curso.getAttenders().size() + ", #sessions: " + curso.getSessions().size() + "]", curso.toString());
	}

}
