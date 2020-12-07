package es.masmovil.lib.orchestration.order.client;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import es.masmovil.lib.orchestration.order.OrderRSDTO;

@ConditionalOnProperty(name = "api.ms.url.orchestration.order")
@FeignClient(name = "orchestrationOrderFeignClient", url = "${api.ms.url.orchestration.order}", 
	decode404 = true)
public interface OrchestrationOrderFeignClient {

	@PostMapping
	ResponseEntity<OrderRSDTO> orchestrateOrder(@RequestBody OrderRSDTO orderRSDTO);

}
