package this_Static;

//When class and local variable has same name then this keyword is used differentiate between class variable and local variable
public class thiskeyword {
	
	int x,y;//class variable /instance variable
	
	void setData(int x,int y)//local variables
	{
		this.x=x;
		this.y=y;
	}
	void display()
	{
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiskeyword s=new thiskeyword();
		s.setData(100,200);
		s.display();
	}

}
