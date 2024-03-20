package module4_java8.Task02_Task03;

public class Response {
	private String body;
	private int statusCode;
	private String responseType;
	
	public Response(String body, int statusCode, String responseType) {
        this.body = body;
        this.statusCode = statusCode;
        this.responseType = responseType;
    }
	
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getResponseType() {
		return responseType;
	}
	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}
	
	@Override
	public String toString() {
		return "[body ="+this.body+" , statusCode ="+this.statusCode+" , responseType = "+this.responseType+"]";
	}
}
