package OopsConcepts;

public class student {
	
	int rollno;
	String sname;
	char Grade;
	String school="SV School";
	
	void printData()
	{
		System.out.println(rollno);
		System.out.println(sname);
		System.out.println(Grade);
		System.out.println(school);
	}
	
	void setStudentData(int rno,String name,char gr)
	{
		rollno=rno;
		sname=name;
		Grade=gr;
	}
}
