package testautomation.Module5_ApiTesting.AllTasks;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Task02_2_POST {
	
	@BeforeClass
	public void setup() {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/";
	}
	
	List<String> inputResources = List.of("posts", "comments", "albums", "photos", "todos", "users");


	@Test(priority=1)
	public void testPOSTForPostsResource()
	{
		String input = "{\r\n"
				+ "    \"userId\": 10,\r\n"
				+ "    \"id\": 101,\r\n"
				+ "    \"title\": \"created_at nam consequatur ea labore ea harum\",\r\n"
				+ "    \"body\": \"cupiditate quo est a modi nesciunt soluta\\nipsa voluptas error itaque dicta in\\nautem qui minus magnam et distinctio eum\\naccusamus ratione error aut\"\r\n"
				+ "  }";
		
		
		Response res =given()
				.body(input)
				.when()
				.post(inputResources.get(0))
				.then()
				.statusCode(201)
				.extract().response();
		
		int id = res.jsonPath().get("id");
		Assert.assertEquals(id, 101);
		
		given().pathParam("id", "101")
		.when()
		.get(inputResources.get(0)+"/"+"{"+"id"+"}")
		.then()
		.statusCode(200)
		.extract().response();
	}
	
	@Test(priority=2)
	public void testPOSTForCommentsResource()
	{
		String input = "{\r\n"
				+ "    \"postId\": 100,\r\n"
				+ "    \"id\": 501,\r\n"
				+ "    \"name\": \"ex eaque eum natus\",\r\n"
				+ "    \"email\": \"created_Emma@joanny.ca\",\r\n"
				+ "    \"body\": \"perspiciatis quis doloremque\\nveniam nisi eos velit sed\\nid totam inventore voluptatem laborum et eveniet\\naut aut aut maxime quia temporibus ut omnis\"\r\n"
				+ "  }";
		
		
		Response res =given()
				.body(input)
				.when()
				.post(inputResources.get(1))
				.then()
				.statusCode(201)
				.extract().response();
		
		int id = res.jsonPath().get("id");
		Assert.assertEquals(id, 501);
		
		given().pathParam("id", "501")
		.when()
		.get(inputResources.get(1)+"/"+"{"+"id"+"}")
		.then()
		.statusCode(200)
		.extract().response();

	}
	
	@Test(priority=3)
	public void testPOSTForAlbumsResource()
	{
		String input = "{\r\n"
				+ "    \"userId\": 10,\r\n"
				+ "    \"id\": 100,\r\n"
				+ "    \"title\": \"created_enim repellat iste\"\r\n"
				+ "  }";
		
		
		Response res =given()
				.body(input)
				.when()
				.post(inputResources.get(2))
				.then()
				.statusCode(201)
				.extract().response();
		
		int id = res.jsonPath().get("id");
		Assert.assertEquals(id, 101);
		
		given().pathParam("id", "101")
		.when()
		.get(inputResources.get(2)+"/"+"{"+"id"+"}")
		.then()
		.statusCode(200)
		.extract().response();

	}
	
	@Test(priority=4)
	public void testPOSTForPhotosResource()
	{
		String input = " {\r\n"
				+ "    \"albumId\": 100,\r\n"
				+ "    \"id\": 5001,\r\n"
				+ "    \"title\": \"error quasi sunt cupiditate voluptate ea odit beatae\",\r\n"
				+ "    \"url\": \"https://via.placeholder.com/600/6dd9cb\",\r\n"
				+ "    \"thumbnailUrl\": \"https://via.placeholder.com/150/6dd9cb\"\r\n"
				+ "  }";
		
		
		Response res =given()
				.body(input)
				.when()
				.post(inputResources.get(3))
				.then()
				.statusCode(201)
				.extract().response();
		
		int id = res.jsonPath().get("id");
		Assert.assertEquals(id, 5001);
		
		given().pathParam("id", "5001")
		.when()
		.get(inputResources.get(3)+"/"+"{"+"id"+"}")
		.then()
		.statusCode(200)
		.extract().response();
	}
	
	@Test(priority=5)
	public void testPOSTForTodosResource()
	{
		String input = "{\r\n"
				+ "    \"userId\": 10,\r\n"
				+ "    \"id\": 201,\r\n"
				+ "    \"title\": \"created_ipsam aperiam voluptates qui\",\r\n"
				+ "    \"completed\": false\r\n"
				+ "  }";
		
		
		Response res =given()
				.body(input)
				.when()
				.post(inputResources.get(4))
				.then()
				.statusCode(201)
				.extract().response();
		
		int id = res.jsonPath().get("id");
		Assert.assertEquals(id, 201);
		
		given().pathParam("id", "201")
		.when()
		.get(inputResources.get(4)+"/"+"{"+"id"+"}")
		.then()
		.statusCode(200)
		.extract().response();
	}
	
	@Test(priority=6)
	public void testPOSTForUserssResource()
	{
		String input = "{\r\n"
				+ "    \"id\": 11,\r\n"
				+ "    \"name\": \"Clementina DuBuque\",\r\n"
				+ "    \"username\": \"Moriah.Stanton\",\r\n"
				+ "    \"email\": \"created_Rey.Padberg@karina.biz\",\r\n"
				+ "    \"address\": {\r\n"
				+ "      \"street\": \"Kattie Turnpike\",\r\n"
				+ "      \"suite\": \"Suite 198\",\r\n"
				+ "      \"city\": \"Lebsackbury\",\r\n"
				+ "      \"zipcode\": \"31428-2261\",\r\n"
				+ "      \"geo\": {\r\n"
				+ "        \"lat\": \"-38.2386\",\r\n"
				+ "        \"lng\": \"57.2232\"\r\n"
				+ "      }\r\n"
				+ "    },\r\n"
				+ "    \"phone\": \"024-648-3804\",\r\n"
				+ "    \"website\": \"ambrose.net\",\r\n"
				+ "    \"company\": {\r\n"
				+ "      \"name\": \"Hoeger LLC\",\r\n"
				+ "      \"catchPhrase\": \"Centralized empowering task-force\",\r\n"
				+ "      \"bs\": \"target end-to-end models\"\r\n"
				+ "    }\r\n"
				+ "  }";
		
		
		Response res =given()
				.body(input)
				.when()
				.post(inputResources.get(5))
				.then()
				.statusCode(201)
				.extract().response();
		
		int id = res.jsonPath().get("id");
		Assert.assertEquals(id, 11);
		
		given().pathParam("id", "11")
		.when()
		.get(inputResources.get(5)+"/"+"{"+"id"+"}")
		.then()
		.statusCode(200)
		.extract().response();
	}
}