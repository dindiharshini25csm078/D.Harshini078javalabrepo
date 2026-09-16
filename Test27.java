class Student
{
    private int id;
    private String name;

    public Student(int id, String name)
	{
        this.id = id;
        this.name = name;
    }
    public void show()
	{
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }
}
public class Test27
{
	public static void main(String[] args)
	{
		Student s=new Student(118,"Teju");
		s.show();
	}
}
	
	