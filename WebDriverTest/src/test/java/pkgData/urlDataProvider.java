package pkgData;

import org.testng.annotations.DataProvider;

public class urlDataProvider {
	@DataProvider(name= "pagesUrl")
	  public static Object[][] pages() {
		  return new Object[][]{
			  {"http://www.google.com"},
			  {"http://www.yahoo.com"}, 
			  {"http://www.facebook.com"}, 
			  {"http://www.ebay.com"} 
		  };
		  
	  }
	@DataProvider(name= "month")
	public static Object[][] SelectMonth() {
		  return new Object[][]{
			  {"JanUser1","JanPass","Jan"},
			  {"FebUser1","FebPass","Feb"}, 
			  {"MarUser1","MarPass","Mar"}, 
			  {"AprUser1","AprPass","Apr"},
			  {"MayUser1","MayPass","May"}, 
			  {"JunUser1","JunPass","Jun"}, 
			  {"JulUser1","JulPass","Jul"},
			  {"AugUser1","AugPass","Aug"},
			  {"SepUser1","SepPass","Sep"}, 
			  {"OctUser1","OctPass","Oct"}, 
			  {"NovUser1","NovPass","Nov"},
			  {"DecUser1","DecPass","Dec"}
		  };
		  
	  }
}
