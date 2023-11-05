package Service;

import jakarta.jws.*;

@WebService
public class CalculatriceWS {
    @WebMethod(operationName = "somme")
    public double somme(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a + b;
    }
}
