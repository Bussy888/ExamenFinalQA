package estructuraAPI.factoryRequestC;

import io.restassured.response.Response;

public interface IRequest {

    Response send(RequestInfo request);
}
