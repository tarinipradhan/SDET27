package practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.collections.Objects;

public class DataProviderPracticeTest {
    

	@Test(dataProvider="getData")
	public void readDataproviderPracticetest(String Name,int Num,String Type ) {
		System.out.println("lap name-->"+Name+"--Num-->"+Num+"--good R bad-->"+Type);
	}
	
	
	
	@DataProvider
	public Object[][] getData(){
			
	Object[][] objArr =new Object[5][3];
			
	    objArr[0][0]="Dell";
	    objArr[0][1] =10;
	    objArr[0][2]="gd";
	    
	    objArr[1][0]="lenevo";
	    objArr[1][1] =15;
	    objArr[1][2]="bd";
	    
	    objArr[2][0]="Apple";
	    objArr[2][1] =20;
	    objArr[2][2]="gd";
	    
	    objArr[3][0]="HP";
	    objArr[3][1] =25;
	    objArr[3][2]="gd";
	    
	    objArr[4][0]="ASUS";
	    objArr[4][1] =55;
	    objArr[4][2]="gd";
	    
	    
	    return objArr;
	    
			
			}
			
}




