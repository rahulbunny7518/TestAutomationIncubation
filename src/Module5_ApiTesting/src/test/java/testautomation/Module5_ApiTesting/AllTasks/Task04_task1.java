package testautomation.Module5_ApiTesting.AllTasks;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Task04_task1 {
	@BeforeClass
	public void setUp() {
		RestAssured.baseURI = "https://wearecommunity.io/api";
		//RestAssured.baseURI = "https://events.epam.com/api";
		RestAssured.basePath = "/v2";
	}

	@Test
	public void verifyEvents() {
		Response response = RestAssured.get("/events");
		//Response response = RestAssured.given().when().get("/events").then().extract().response();
		List<String> namesOfEvents = response.jsonPath().get("events.findAll{it.language=='En'}.title");

		System.out.println(namesOfEvents);

		Assert.assertEquals(namesOfEvents.get(0), "English Speaking Events");
		Assert.assertEquals(namesOfEvents.get(1), "IWD 2024");

	}
}
