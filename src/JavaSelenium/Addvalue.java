package JavaSelenium;

public class Addvalue 
{
    String Firstname ="Yuvaraj";
    String Lastname ="Murugesan";
    public String Firstname()
    {
    	String name3 = Firstname+Lastname;
		return name3;
    }
	public static void main(String[] args) 
	{
	 	// TODO Auto-generated method stub
		//Object declaration
		Addvalue value = new Addvalue();
        String name4 = value.Firstname();
        
        String name5 = "Mr."+name4;
        System.out.println(name5);
		
	}

}
