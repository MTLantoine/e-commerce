package project.ecommerce;

import project.ecommerce.Client;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api", produces = MediaType.APPLICATION_JSON_VALUE)
// For simplicity of this sample, allow all origins. Real applications should configure CORS for their use case.
@CrossOrigin(origins = "*")
public class APIController {

    @GetMapping(value = "/public")
    public Client publicEndpoint() {
        return new Client("All good. You DO NOT need to be authenticated to call /api/public.");
    }

    @GetMapping(value = "/private")
    public Client privateEndpoint() {
        return new Client("All good. You can see this because you are Authenticated.");
    }

    @GetMapping(value = "/private-scoped")
    public Client privateScopedEndpoint() {
        return new Client("All good. You can see this because you are Authenticated with a Token granted the 'read:messages' scope");
    }
}