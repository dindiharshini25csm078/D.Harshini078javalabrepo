package csm078;
public class Student 
{
    private int rollNo;
    private String name;

    public Student(int r, String n) { rollNo = r; name = n; }

    public static void main(String[]args)
	{
		Student student=new Student(118,"swathi");
        System.out.println("Roll: " + student.rollNo + " | Name: " + student.name);
    }
}