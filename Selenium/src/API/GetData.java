package API;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetData {

	public static void main(String[] args) {
		RestAssured.baseURI="https://reqres.in/";
		RequestSpecification res = RestAssured.given();
		Response a = res.request(Method.GET,"/api/users/2");
		String b = a.asString();
		JsonPath c = new JsonPath(b);
		

	}

}
