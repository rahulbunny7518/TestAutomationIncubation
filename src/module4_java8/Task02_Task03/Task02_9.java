package module4_java8.Task02_Task03;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Task02_9 {
	public static void main(String[] args) {
		Predicate<Response> predicate = product -> product.getStatusCode() == 400 || product.getResponseType().equalsIgnoreCase("JSON");

		List<Response> list = new ArrayList<>();
		list.add(new Response("body1", 400, "JSON"));
		list.add(new Response("body2", 100, "JSON"));
		list.add(new Response("body3", 400, "JSON"));
		list.add(new Response("body4", 200, "XML"));

		for (Response response : list) {
			if (predicate.test(response)) {
				System.out.println(response);
			}
		}
	}
}
