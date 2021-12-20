import com.crm.genericUtility.JavaUtility;

public class Testjavautility {
	public static void main(String[] args) {
		
		JavaUtility date=new JavaUtility();
		String dt=date.getDateandTime();
		System.out.println(dt);
		String yyyy=date.CalenderdateFormat();
//		System.out.println(yyyy);
		String calender=date.CalenderdateFormat();
		System.out.println(calender);
	}
	

}
