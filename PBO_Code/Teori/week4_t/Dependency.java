package week4_t;

public class Dependency 
{
	
	/**
	 * 
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		Instructor instructor = new Instructor();
		Course java = new Course();
		java.setCourseName("Introduction to Java Programming");
		Course c = new Course();
		c.setCourseName("Programming C");
		
		//adding two courses for one instructor
		instructor.setCourses(java);
		instructor.setCourses(c);
		
		//print number of courses taught by instructor
		//System.out.println(instructor.toString());
		
		instructor.printCourses();
	}
}