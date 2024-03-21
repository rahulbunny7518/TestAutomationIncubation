package testautomation.Module5_ApiTesting.AllTasks;

import static io.restassured.RestAssured.given;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Task02_2_PUT {
	
	@BeforeClass
	public void setup() {
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/";
	}
	
	
	List<String> inputResources = List.of("posts", "comments", "albums", "photos", "todos", "users");


	@Test(priority=1)
	public void testPUTForPostsResource()
	{
		String input = "{{\r\n"
				+ "    \"userId\": 10,\r\n"
				+ "    \"id\": 100,\r\n"
				+ "    \"title\": \"MODIFIED-at nam consequatur ea labore ea harum\",\r\n"
				+ "    \"body\": \"cupiditate quo est a modi nesciunt soluta\\nipsa voluptas error itaque dicta in\\nautem qui minus magnam et distinctio eum\\naccusamus ratione error aut\"\r\n"
				+ "  }}";
	
			given().pathParam("id", "100")
				.body(input)
				.when()
				.put(inputResources.get(0)+"/"+"{"+"id"+"}")
				.then()
				.statusCode(200);
			
			String updatedTitle = given().pathParam("id", "100")
					.when()
					.get(inputResources.get(0)+"/"+"{"+"id"+"}")
					.then()
					.statusCode(200)
					.extract().jsonPath().getString("title"); 
		//System.out.println(res.prettyPrint());

		Assert.assertEquals(updatedTitle, "MODIFIED-at nam consequatur ea labore ea harum");
	}
	
	@Test(priority=2)
	public void testPUTForCommentsResource()
	{
		String input = "{{\r\n"
				+ "    \"postId\": 100,\r\n"
				+ "    \"id\": 500,\r\n"
				+ "    \"name\": \"ex eaque eum natus\",\r\n"
				+ "    \"email\": \"modified_Emma@joanny.ca\",\r\n"
				+ "    \"body\": \"perspiciatis quis doloremque\\nveniam nisi eos velit sed\\nid totam inventore voluptatem laborum et eveniet\\naut aut aut maxime quia temporibus ut omnis\"\r\n"
				+ "  }}";
	
			given().pathParam("id", "500")
				.body(input)
				.when()
				.put(inputResources.get(1)+"/"+"{"+"id"+"}")
				.then()
				.statusCode(200);
			
			String updatedEmail = given().pathParam("id", "500")
					.when()
					.get(inputResources.get(1)+"/"+"{"+"id"+"}")
					.then()
					.statusCode(200)
					.extract().jsonPath().getString("email"); 

		Assert.assertEquals(updatedEmail, "modified_Emma@joanny.ca");
	}
	
	@Test(priority=3)
	public void testPUTForAlbumsResource()
	{
		String input = "{\r\n"
				+ "    \"userId\": 10,\r\n"
				+ "    \"id\": 100,\r\n"
				+ "    \"title\": \"modified_enim repellat iste\"\r\n"
				+ "  }";
	
			given().pathParam("id", "100")
				.body(input)
				.when()
				.put(inputResources.get(2)+"/"+"{"+"id"+"}")
				.then()
				.statusCode(200);
			
			String updatedTitle = given().pathParam("id", "100")
					.when()
					.get(inputResources.get(2)+"/"+"{"+"id"+"}")
					.then()
					.statusCode(200)
					.extract().jsonPath().getString("title"); 

		Assert.assertEquals(updatedTitle, "modified_enim repellat iste");
	}
	
	@Test(priority=4)
	public void testPUTForPhotosResource()
	{
		String input = "{\r\n"
				+ "    \"albumId\": 100,\r\n"
				+ "    \"id\": 5000,\r\n"
				+ "    \"title\": \"modified_error quasi sunt cupiditate voluptate ea odit beatae\",\r\n"
				+ "    \"url\": \"https://via.placeholder.com/600/6dd9cb\",\r\n"
				+ "    \"thumbnailUrl\": \"https://via.placeholder.com/150/6dd9cb\"\r\n"
				+ "  }";
	
			given().pathParam("id", "5000")
				.body(input)
				.when()
				.put(inputResources.get(3)+"/"+"{"+"id"+"}")
				.then()
				.statusCode(200);
			
			String updatedTitle = given().pathParam("id", "5000")
					.when()
					.get(inputResources.get(3)+"/"+"{"+"id"+"}")
					.then()
					.statusCode(200)
					.extract().jsonPath().getString("title"); 
	
		Assert.assertEquals(updatedTitle, "modified_error quasi sunt cupiditate voluptate ea odit beatae");
	}
	
	@Test(priority=5)
	public void testPUTForTodosResource()
	{
		String input = "{\r\n"
				+ "    \"userId\": 10,\r\n"
				+ "    \"id\": 200,\r\n"
				+ "    \"title\": \"modified_ipsam aperiam voluptates qui\",\r\n"
				+ "    \"completed\": false\r\n"
				+ "  }";
	
			given().pathParam("id", "200")
				.body(input)
				.when()
				.put(inputResources.get(4)+"/"+"{"+"id"+"}")
				.then()
				.statusCode(200);
			
			String updatedTitle = given().pathParam("id", "200")
					.when()
					.get(inputResources.get(4)+"/"+"{"+"id"+"}")
					.then()
					.statusCode(200)
					.extract().jsonPath().getString("title"); 
	
		Assert.assertEquals(updatedTitle, "modified_ipsam aperiam voluptates qui");
	}
	
	@Test(priority=6)
	public void testPUTForUsersResource()
	{
		String input = "{\r\n"
				+ "    \"id\": 10,\r\n"
				+ "    \"name\": \"Clementina DuBuque\",\r\n"
				+ "    \"username\": \"Moriah.Stanton\",\r\n"
				+ "    \"email\": \"modified_Rey.Padberg@karina.biz\",\r\n"
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
	
			given().pathParam("id", "10")
				.body(input)
				.when()
				.put(inputResources.get(5)+"/"+"{"+"id"+"}")
				.then()
				.statusCode(200);
			
			String updatedEmail = given().pathParam("id", "10")
					.when()
					.get(inputResources.get(5)+"/"+"{"+"id"+"}")
					.then()
					.statusCode(200)
					.extract().jsonPath().getString("email"); 

		Assert.assertEquals(updatedEmail, "modified_Rey.Padberg@karina.biz");
	}

}