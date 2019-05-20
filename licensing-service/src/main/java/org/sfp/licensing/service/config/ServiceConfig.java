package org.sfp.licensing.service.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties("tracer")
@Data
public class ServiceConfig {
	private String property;
}
