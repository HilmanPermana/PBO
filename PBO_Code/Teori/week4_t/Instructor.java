package week4_t;

public class Instructor 
{
	private Course[] courses = new Course[3]; //up to 3 courses per instructor
	private int numberOfCourses = 0; //number of courses taught by instructor
	
	public Course[] getCourses()
	{
		return courses;
	}
	
	//add courses to instructors
	public void setCourses(Course course)
	{
		this.courses[numberOfCourses] = course;
		numberOfCourses++;
	}
	
	//print courses taught by instructors
	public void printCourses()
	{
		for (int i = 0; i < courses.length; i++)
		{
			if (courses[i] != null)
			{
				System.out.println(courses[i]);
			}
		}
	}
	
	@Override
	public String toString()
	{
		return "Instructor{" + "courses" + courses + '}';
	}
	
}
