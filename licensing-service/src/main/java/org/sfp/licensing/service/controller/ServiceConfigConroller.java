
package org.sfp.licensing.service.controller;

import org.sfp.licensing.service.config.ServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/profile")
public class ServiceConfigConroller {
	
	@Autowired
	private ServiceConfig config;

	@GetMapping
    public String configProperty() {
        return config.getProperty();
    }
}
