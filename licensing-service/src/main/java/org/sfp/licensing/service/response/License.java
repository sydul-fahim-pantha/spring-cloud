

package org.sfp.licensing.service.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class License {
	private String id;
	private String productName;
	private String type;
	private String orgId;
	
}
