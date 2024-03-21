package testautomation.Module5_ApiTesting.AllTasks;

import static io.restassured.RestAssured.given;

import java.util.*;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Task02_1 {
	@BeforeClass
	public void setup() {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/";
	}
	
	List<String> inputResources = List.of ("posts", "comments", "albums", "photos", "todos", "users");
	
	
	@Test(priority=1)
	public void testNumberOfResourcesForPosts()
	{
		List<String> res=given()
				.when()
				.get(inputResources.get(0))
				.then()
				.statusCode(200)
				.extract().jsonPath().getList("");
		
		System.out.println(res.size());
		
		int length =res.size();

		Assert.assertEquals(length, 100);
	}
	
	@Test(priority=2)
	public void testNumberOfResourcesForComments()
	{
		List<String> res=given()
				.when()
				.get(inputResources.get(1))
				.then()
				.statusCode(200)
				.extract().jsonPath().getList("");
		
		System.out.println(res.size());
		
		int length =res.size();

		Assert.assertEquals(length, 500);
	}
	
	@Test(priority=3)
	public void testNumberOfResourcesForAlbums()
	{
		List<String> res=given()
				.when()
				.get(inputResources.get(2))
				.then()
				.statusCode(200)
				.extract().jsonPath().getList("");
		
		System.out.println(res.size());
		
		int length =res.size();

		Assert.assertEquals(length, 100);
	}
	
	@Test(priority=4)
	public void testNumberOfResourcesForPhotos()
	{
		List<String> res=given()
				.when()
				.get(inputResources.get(3))
				.then()
				.statusCode(200)
				.extract().jsonPath().getList("");
		
		System.out.println(res.size());
		
		int length =res.size();

		Assert.assertEquals(length, 5000);
	}
	
	@Test(priority=5)
	public void testNumberOfResourcesForTodos()
	{
		List<String> res=given()
				.when()
				.get(inputResources.get(4))
				.then()
				.statusCode(200)
				.extract().jsonPath().getList("");
		
		System.out.println(res.size());
		
		int length =res.size();

		Assert.assertEquals(length, 200);
	}
	
	@Test(priority=5)
	public void testNumberOfResourcesForUsers()
	{
		List<String> res=given()
				.when()
				.get(inputResources.get(5))
				.then()
				.statusCode(200)
				.extract().jsonPath().getList("");
		
		System.out.println(res.size());
		
		int length =res.size();

		Assert.assertEquals(length, 10);
	}
	
	

}

