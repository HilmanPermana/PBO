package week4_t;

public class Course {
	private String courseName = "Unknown";

	public String getCourseName()
	{
		return courseName;
	}
	
	public void setCourseName(String coursename) 
	{
		this.courseName = courseName;
	}
	
	@Override
	public String toString()
	{
		return "Course{" + "courseName" + courseName + '}';
	}
	
	
}
