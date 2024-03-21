package testautomation.Module5_ApiTesting.AllTasks;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class Task03_task1 {
	
	@Test
	public void addingPetAndVerifying() {
		String input = "{\r\n"
				+ "  \"id\": 12345,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 1,\r\n"
				+ "    \"name\": \"dog\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"snoopie\",\r\n"
				+ "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n"
				+ "  ],\r\n"
				+ "  \"tags\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"pending\"\r\n"
				+ "}";


	   given()
		.body(input)
		.when()
		.post("https://petstore.swagger.io/#/pet")
		.then()
		.statusCode(201)
		.extract().response();
		
		Response res = given()
				.when()
				.get("https://petstore.swagger.io/v2/pet/12345")
				.then()
				.statusCode(200)
				.contentType("application/json")
				.extract().response();
		
//		System.out.println(res.prettyPrint());
		
		String petName = res.jsonPath().get("category.name");
		Assert.assertEquals(petName, "dog");
		
		String name = res.jsonPath().get("name");
		Assert.assertEquals(name, "snoopie");
		
		String status = res.jsonPath().get("status");
		Assert.assertEquals(status, "pending");		
	}
}