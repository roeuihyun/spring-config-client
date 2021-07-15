package roeuihyun.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigClientController {
    //
    @Value("${namoosori.value}")
    private String configStr;

    //
    public String test(){
        return configStr;
    }
}
