package ac4y.indicator.service.publish;
import javax.xml.ws.Endpoint;

import ac4y.indicator.service.web.Ac4yIndicatorWebService;

public class Publisher {

	public static void main(String[] args) {
		   Endpoint.publish(args[0], new Ac4yIndicatorWebService()); // "http://localhost:9999/Ac4yRepositoryWebService"
	}

}