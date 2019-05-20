
package org.sfp.licensing.service.controller;

import org.sfp.licensing.service.response.License;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/org/{orgId}/licenses")
public class LicenseServiceConroller {

	@GetMapping("/{licenseId}")
	public License getLicense(@PathVariable String orgId, @PathVariable String licenseId) {
		return License.builder()
					  .id(licenseId)
					  .productName("productName")
					  .type("type")
					  .orgId(orgId)
					  .build();
	}
	
	@GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
