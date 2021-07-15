package roeuihyun.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
    //
    @Value("$(test.str)")
    private String configStr;

    //
    public String test(){
        return configStr;
    }
}
