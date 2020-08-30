import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.fullteaching.backend.course.Course;
import com.fullteaching.backend.user.User;
import com.fullteaching.backend.coursedetails.CourseDetails;

public class testCourseDetails {
	
	@Test
	public void CourseDetails() {
		User professor = new User("Joao", "1234", "John", "picture2", "teacher");
		Course curso = new Course("Programacao Java", "imagem Java", professor);
		CourseDetails detalhes = new CourseDetails(curso);
		
		assertNotNull(detalhes);
		
	}

}
