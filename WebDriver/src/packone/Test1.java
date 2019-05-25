package packone;

public class Test1 {

	public static void main(String[] args) throws Exception{
		
		Methods m=new Methods();
		m.launchApp("http://facebook.com","C:\\Users\\DELL\\Desktop\\WD9\\fb.png");
		m.elementPresent("email", true);
		m.elementPresent("pass", false);
		m.elementPresent("day", true);
		m.closeApp();		
		m.launchApp("http://bharatmatrimony.com","C:\\Users\\DELL\\Desktop\\WD9\\BM.png");
		m.elementPresent("NAME", false);
		m.closeApp();
		
		
		

	}

}
