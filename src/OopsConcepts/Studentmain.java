package OopsConcepts;
import OopsConcepts.Employee;
import OopsConcepts.EmployeeMain;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student s1 = new student();
		/*
		s1.rollno=1;
		s1.sname="Michael";
		s1.Grade='A';
		s1.printData();
		
		Employee emp2=new Employee();
		emp2.empid=2;
		emp2.empname="Mike";
		emp2.job="Manager";
		emp2.sal=50000;
		emp2.display();	
		*/
		s1.setStudentData(1, "Mike", 'A');
		s1.printData();
	}

}
