package in.anits.cse;
 class Student 
{
    private int    rollNo;
    private String name;
    public Student(int r, String n)
	{ 
	rollNo = r; name = n;
	}
    public void show()
	{
        System.out.println("Roll: " + rollNo + " | Name: " + name);
    }
}
public class Test26
{
    public static void main(String[] args)
	{
        Student s = new Student(101, "Rahul");
        s.show();
    }
}