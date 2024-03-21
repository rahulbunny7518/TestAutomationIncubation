package testautomation.Module5_ApiTesting.AllTasks;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Task04_task2 {
	@BeforeClass
	public void setUp() {
		RestAssured.baseURI = "http://api.openweathermap.org";
		RestAssured.basePath = "/data/2.5/weather";
	}

	@Test
	public void getWeatherDetails() {
		given().queryParam("q", "hyderabad").queryParam("appid", "547ee1495b18999b528ff3fd1b3faf0f")
		.when().get()
		.then().log().all();
	}

	@Test
	public void verifyWeatherDetails() {
		Response response = given().queryParam("lat", 17.3753).queryParam("lon", 78.4744)
				.queryParam("appid", "547ee1495b18999b528ff3fd1b3faf0f")
				.when().get()
				.then().extract().response();
		//response.prettyPrint();

		JsonPath responseInJson = response.jsonPath();

		String name = responseInJson.get("name");
		Assert.assertEquals(name, "Hyderabad");

		String country = responseInJson.get("sys.country");
		Assert.assertEquals(country, "IN");

		float temp_min = responseInJson.get("main.temp_min");
		Assert.assertTrue(temp_min > 0);

		float temp = responseInJson.get("main.temp");
		Assert.assertTrue(temp > 0);
	}
}
