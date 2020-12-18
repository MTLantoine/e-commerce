package project.ecommerce;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
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
            HttpResponse<String> response = Unirest.post("https://dev-dplo3lsd.eu.auth0.com/oauth/token")
                    .header("content-type", "application/json")
                    .body("{\"client_id\":\"EdQIXD7EWfItNKWsh5yzn16XNL927vme\"," +
                            "\"client_secret\":\"HG0UDbjW8dYt3jRzdRSzbMjBXWKL69vzpUkuOC6dsKNxcN4HQgNKSuwqGY5uK4Ck\"," +
                            "\"audience\":\"https://e-commerce/api/v1\"," +
                            "\"grant_type\":\"client_credentials\"}")
                    .asString();
            return response.getBody().toString();
        }
    }
}