package testautomation.Module5_ApiTesting.AllTasks;


import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class Task02_2_GET {

	@BeforeClass
	public void setup() {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/";
	}
	
	
	List<String> inputResources = List.of("posts", "comments", "albums", "photos", "todos", "users");
	

	@Test
	public void testGETForPostsResource()
	{
		Response res=given().pathParam("id", "1")
				.when()
				.get(inputResources.get(0)+"/"+"{"+"id"+"}")
				.then()
				.statusCode(200)
				.extract().response();

		String actualTitle = res.jsonPath().get("title");

		Assert.assertEquals(actualTitle, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit");

	}
	
	@Test
	public void testGETForCommentsResource()
	{
		Response res=given().pathParam("postId", "1")
				.when()
				.get(inputResources.get(1)+"/"+"{"+"postId"+"}")
				.then()
				.statusCode(200)
				.extract().response();

		String actualEmail = res.jsonPath().get("email");

		Assert.assertEquals(actualEmail, "Eliseo@gardner.biz");

	}
	
	@Test
	public void testGETForAlbumsResource()
	{
		Response res=given().pathParam("id", "1")
				.when()
				.get(inputResources.get(2)+"/"+"{"+"id"+"}")
				.then()
				.statusCode(200)
				.extract().response();

		String actualTitle = res.jsonPath().get("title");

		Assert.assertEquals(actualTitle, "quidem molestiae enim");

	}
	
	@Test
	public void testGETForPhotosResource()
	{
		Response res=given().pathParam("id", "1")
				.when()
				.get(inputResources.get(3)+"/"+"{"+"id"+"}")
				.then()
				.statusCode(200)
				.extract().response();

		String actualTitle = res.jsonPath().get("title");

		Assert.assertEquals(actualTitle, "accusamus beatae ad facilis cum similique qui sunt");
	}
	
	@Test
	public void testGETForTodosResource()
	{
		Response res=given().pathParam("id", "1")
				.when()
				.get(inputResources.get(4)+"/"+"{"+"id"+"}")
				.then()
				.statusCode(200)
				.extract().response();

		String actualTitle = res.jsonPath().get("title");

		Assert.assertEquals(actualTitle, "delectus aut autem");
	}
	
	@Test
	public void testGETForUsersResource()
	{
		Response res=given().pathParam("id", "1")
				.when()
				.get(inputResources.get(5)+"/"+"{"+"id"+"}")
				.then()
				.statusCode(200)
				.extract().response();

		String actualName = res.jsonPath().get("name");

		Assert.assertEquals(actualName, "Leanne Graham");
	}

}