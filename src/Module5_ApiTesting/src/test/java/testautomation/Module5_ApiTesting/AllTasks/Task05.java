package testautomation.Module5_ApiTesting.AllTasks;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Task05 {
	
	@BeforeClass
	public void setup() {
		RestAssured.baseURI = "https://dummy.restapiexample.com/";
	}
	
	@Test(priority=1)
	public void getListOfEmployees() {
		Response response = given()
				.when()
				.get("api/v1/employees")
				.then()
				.statusCode(200)
				.contentType("application/json")
				.extract().response();
		
		response.prettyPrint();
	
		List<String> employeesIds = response.jsonPath().get("data.id");
		
		assertEquals(employeesIds.size(), 24);
	
		//System.out.println("Number of Employees :"+ employeesIds.size());
	}
	
	@Test(priority=2)
	public void creatingAnEmployeeWithPost() {
		String input ="{\r\n"
				+ "    \"id\": 47,\r\n"
				+ "    \"employee_name\": \"Raina\",\r\n"
				+ "    \"employee_salary\": 250000,\r\n"
				+ "    \"employee_age\": 40,\r\n"
				+ "    \"profile_image\": \"\"\r\n"
				+ "}";
		
		given()
		.body(input)
		.when()
		.post("api/v1/create")
		.then()
		.statusCode(201)
		.contentType("application/json")
		.extract().response();
		
		Response response = given()
				.when()
				.get("api/v1/employees")
				.then()
				.statusCode(200)
				.contentType("application/json")
				.extract().response();
		
		List<String> employeesIds = response.jsonPath().get("data.id");
		
		assertEquals(employeesIds.size(), 25);
	}
	
	@Test(priority=3)
	public void getDetailsOfNewlyCreatedEmployee() {
		
		Response res =given().pathParam("id","47")
		.when()
		.get("api/v1/employee/{id}")
		.then()
		.statusCode(200)
		.contentType("application/json")
		.extract().response();
		
		HashMap<String, String> hm= res.jsonPath().get("data");
		
		Assert.assertEquals(hm.get("id"), "47");
		Assert.assertEquals(hm.get("name"), "Raina");
		Assert.assertEquals(hm.get("salary"), "250000");
		Assert.assertEquals(hm.get("age"), "40");
	}
	
	@Test(priority=4)
	public void updateDetailsOfNewlyCreatedEmployee() {
		
		String input = "{\r\n"
				+ "    \"id\": 47,\r\n"
				+ "    \"employee_name\": \"Suresh\",\r\n"
				+ "    \"employee_salary\": 350000,\r\n"
				+ "    \"employee_age\": 45,\r\n"
				+ "    \"profile_image\": \"\"\r\n"
				+ "}";
		
		given()
			.pathParam("id","47")
			.body(input)
		.when()
			.put("api/v1/update/{id}")
		.then()
			.statusCode(200)
			.contentType("application/json")
			.extract().response();
	}
	
	@Test(priority=5)
	public void getUpdatedDetailsOfNewlyCreatedEmployee() {
		
		Response res =given().pathParam("id","47")
		.when()
		.get("api/v1/employee/{id}")
		.then()
		.statusCode(200)
		.contentType("application/json")
		.extract().response();
		
		HashMap<String, String> hm= res.jsonPath().get("data");
		
		Assert.assertEquals(hm.get("id"), "47");
		Assert.assertEquals(hm.get("name"), "Suresh");
		Assert.assertEquals(hm.get("salary"), "350000");
		Assert.assertEquals(hm.get("age"), "45");	
	}
	
	@Test(priority=6)
	public void deleteNewlyCreatedEmployee() {
		
		given().pathParam("id","47")
		.when()
		.get("api/v1/delete/{id}")
		.then()
		.statusCode(200)
		.contentType("application/json")
		.extract().response();
	}
}