package reqresAPI;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TC_01_ListUser {
	
	Response apiResponse;
	@Test
	public void verifyListUserTest() {
		
		
		
		apiResponse = RestAssured.get("https://reqres.in/api/users");
		
		
		
		
		
		System.out.println("================================================================");
		
		System.out.println("Status Code: ********* " + apiResponse.getStatusCode());
		System.out.println("ResponseTime: " + apiResponse.getTime() + " msec");
		System.out.println("getStatusLine: " + apiResponse.getStatusLine());
		System.out.println("getContentType: " + apiResponse.getContentType());			//application/json; charset=utf-8

		
		
		
		
		
		
		Assert.assertEquals(apiResponse.getStatusCode(), 200);
		
		
	}
	
//	@Test
//	public void verifyContentType() {
//		
//		Assert.assertTrue(apiResponse.getContentType().contains("json"));
//		
//	}
	

}
