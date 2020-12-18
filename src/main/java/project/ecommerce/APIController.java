package project.ecommerce;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.ecommerce.client.Client;
import project.ecommerce.client.ClientRepository;

@RestController
@RequestMapping(path = "")
public class APIController {

    @Autowired
    private ClientRepository clientRepository;

    @PostMapping("/login")
    public String signIn(@RequestBody Client client) {

        Client clientTmp = clientRepository.findByLogin(client.getLogin())
                .orElseThrow(() -> new RuntimeException("Password or Login are wrong"));

        if (!clientTmp.getPasswd().equals(client.getPasswd())) {
            throw new RuntimeException("Password or Login are wrong");
        } else {
            String access_token = "";
            if (clientTmp.getRole().equals("admin")) {
                HttpResponse<String> response = Unirest.post("https://dev-dplo3lsd.eu.auth0.com/oauth/token")
                        .header("content-type", "application/json")
                        .body("{\"client_id\":\"Mpg9y6794mbs0vYTn4PmJbCaafrii2FG\"," +
                                "\"client_secret\":\"jn7rzEfOwkO9S5Qe5JJo7Sin8fWv0UV-nXoCHgy8k4IzIVzDiTKrLCeNPLoPnSgp\"," +
                                "\"audience\":\"https://e-commerce/api/v1\"," +
                                "\"grant_type\":\"client_credentials\"," +
                                "\"scope\":\"admin client\"}")
                        .asString();
                access_token = response.getBody().toString();
            } else if (clientTmp.getRole().equals("client")) {
                HttpResponse<String> response = Unirest.post("https://dev-dplo3lsd.eu.auth0.com/oauth/token")
                        .header("content-type", "application/json")
                        .body("{\"client_id\":\"EdQIXD7EWfItNKWsh5yzn16XNL927vme\"," +
                                "\"client_secret\":\"HG0UDbjW8dYt3jRzdRSzbMjBXWKL69vzpUkuOC6dsKNxcN4HQgNKSuwqGY5uK4Ck\"," +
                                "\"audience\":\"https://e-commerce/api/v1\"," +
                                "\"grant_type\":\"client_credentials\"," +
                                "\"scope\":\"client\"}")
                        .asString();
                access_token = response.getBody().toString();
            } else {
                access_token = "false";
            }
            return access_token;
        }
    }
}