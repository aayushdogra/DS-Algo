package encapsulatioIntroduction;

public class Student 
{
  private String name;
  private int age;
 
  public int getAge() {
	return age;
}
	public void setAge(int age) 
	{
		if(age>20) 
		{
			System.out.println("You are to old for a school");
		}
		else
		this.age = age;
    }
}
