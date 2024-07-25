// program 2

// if we override the toString method it show the actual detail of obj.
// if we dont override the method or we write as obj.toString() it shows the reference of object.


class Student
{
	String name;
	String location;
	String branch;

	Student(String name, String location,String branch)
	{
		this.name=name;
		this.location=location;
		this.branch=branch;
	}

	@Override
	public String toString()
	{
		return "my name is "+this.name +"i m from "+this.location+"branch is "+this.branch;
	}
}

class Studentdriver
{
	public static void main(String[] args) 
	{
		Student obj=new Student("vaish","pune","civil");
		System.out.println(obj.toString());
	}
}//my name is vaishi m from punebranch is civil