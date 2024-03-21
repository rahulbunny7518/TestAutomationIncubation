package testautomation.Module5_ApiTesting.AllTasks;

import java.util.List;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Task03_task2 {
	
	@BeforeClass
	public void setup() {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/";
	}
	
	
	@Test
	public void testNumberOfResourcesForUsers()
	{
		Response res = RestAssured.given()
				.when()
				.get("/users")
				.then()
				.statusCode(200)
				.extract().response();
		
		int numberOfUsers =res.jsonPath().getList("").size();
		
		Assert.assertTrue(numberOfUsers > 3);
	

		List<String> names = res.jsonPath().getList("name");
		
		long countOfUserWithSpecifiedName = names.stream().filter( t-> t.equals("Ervin Howell")).count();
		
		Assert.assertEquals(countOfUserWithSpecifiedName, 1);
	}
}