package testautomation.Module5_ApiTesting.AllTasks;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Task02_2_DELETE {
	
	@BeforeClass
	public void setup() {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/";
	}
	
	
	List<String> inputResources = List.of("posts", "comments", "albums", "photos", "todos", "users");
	
	@Test(priority=1)
	public void testDELETEForPostsResource()
	{
		given().pathParam("id", "99")
				.when()
				.delete(inputResources.get(0)+"/"+"{"+"id"+"}")
				.then()
				.statusCode(200)
				.extract().response();
		
		Response res =given().pathParam("id", "99")
				.when()
				.get(inputResources.get(0)+"/"+"{"+"id"+"}")
				.then()
				.statusCode(404)
				.extract().response();
		
		Assert.assertEquals(res, null);
	}
	
	@Test(priority=2)
	public void testDELETEForCommentsResource()
	{
		given().pathParam("id", "499")
				.when()
				.delete(inputResources.get(1)+"/"+"{"+"id"+"}")
				.then()
				.statusCode(200)
				.extract().response();
		
		Response res =given().pathParam("id", "499")
				.when()
				.get(inputResources.get(1)+"/"+"{"+"id"+"}")
				.then()
				.statusCode(404)
				.extract().response();
		
		Assert.assertEquals(res, null);
	}
	
	@Test(priority=3)
	public void testDELETEForAlbumsResource()
	{
		given().pathParam("id", "99")
				.when()
				.delete(inputResources.get(2)+"/"+"{"+"id"+"}")
				.then()
				.statusCode(200)
				.extract().response();
		
		Response res =given().pathParam("id", "99")
				.when()
				.get(inputResources.get(2)+"/"+"{"+"id"+"}")
				.then()
				.statusCode(404)
				.extract().response();
		
		Assert.assertEquals(res, null);
	}
	
	@Test(priority=4)
	public void testDELETEForPhotosResource()
	{
		given().pathParam("id", "4999")
				.when()
				.delete(inputResources.get(3)+"/"+"{"+"id"+"}")
				.then()
				.statusCode(200)
				.extract().response();
		
		Response res =given().pathParam("id", "4999")
				.when()
				.get(inputResources.get(3)+"/"+"{"+"id"+"}")
				.then()
				.statusCode(404)
				.extract().response();
		
		Assert.assertEquals(res, null);
	}
	
	@Test(priority=5)
	public void testDELETEForTodosResource()
	{
		given().pathParam("id", "199")
				.when()
				.delete(inputResources.get(4)+"/"+"{"+"id"+"}")
				.then()
				.statusCode(200)
				.extract().response();
		
		Response res =given().pathParam("id", "199")
				.when()
				.get(inputResources.get(4)+"/"+"{"+"id"+"}")
				.then()
				.statusCode(404)
				.extract().response();
		
		Assert.assertEquals(res, null);
	}
	
	@Test(priority=6)
	public void testDELETEForUsersResource()
	{
		given().pathParam("id", "9")
				.when()
				.delete(inputResources.get(5)+"/"+"{"+"id"+"}")
				.then()
				.statusCode(200)
				.extract().response();
		
		Response res =given().pathParam("id", "99")
				.when()
				.get(inputResources.get(5)+"/"+"{"+"id"+"}")
				.then()
				.statusCode(404)
				.extract().response();
		
		Assert.assertEquals(res, null);
	}
}
