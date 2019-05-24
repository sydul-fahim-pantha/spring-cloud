
package org.sfp.organization.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/org/{orgId}")
public class OrgServiceConroller {

	@GetMapping("/")
    public String getOrg(@PathVariable String orgId) {
        return orgId;
    }
}
