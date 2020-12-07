package es.masmovil.lib.orchestration.order;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;

@Data
public class OrderRSDTO {

	private String identifier;
	
	private CustomerRSDTO customerDto;

	private List<PhoneRSDTO> listPhoneDto;

	private BigDecimal totalPrice;

}
