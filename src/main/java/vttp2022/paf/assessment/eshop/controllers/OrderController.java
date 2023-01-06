package vttp2022.paf.assessment.eshop.controllers;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import vttp2022.paf.assessment.eshop.models.Customer;
import vttp2022.paf.assessment.eshop.models.LineItem;
import vttp2022.paf.assessment.eshop.models.Order;
import vttp2022.paf.assessment.eshop.services.WarehouseService;

@RestController
@RequestMapping(path = "/")
public class OrderController {

	@Autowired 
	private WarehouseService warehouseSvc;
	@PostMapping(path = "/api/order")
	public ResponseEntity<String> saveOrder(@RequestBody MultiValueMap<String, String> form , Model model){
		
		String name = form.getFirst("name");
		Optional<Customer> cust = warehouseSvc.findCustomerByName(name);

		if(cust.isPresent()){
			Customer c = cust.get();

			//creating the order object
			Order order = new Order();
			order.setAddress(c.getAddress());
			order.setCustomer(c);
			order.setDeliveryId(UUID.randomUUID().toString().substring(0,8));
			order.setEmail(c.getEmail());
			
			LineItem lineItem = new LineItem();
			lineItem.setItem(form.getFirst("item"));
			
			lineItem.setQuantity(Integer.parseInt(form.getFirst("quantity")));
			
			List<LineItem> lineItemzxc = new LinkedList<>();
			lineItemzxc.add(lineItem);
			order.setLineItems(lineItemzxc);
			order.setName(c.getName());

			Date date = new Date();    
			order.setOrderDate(date);
			order.setOrderId(UUID.randomUUID().toString().substring(0,8));

			order.setStatus(name);

			//saving the order object
			//.............

			JsonObject response = Json.createObjectBuilder().add("name", c.getName())
															.add("email", c.getEmail())
															.add("address", c.getAddress())
															.build();

			
				return ResponseEntity.status(HttpStatus.OK)
													.contentType(MediaType.ALL)
													.body(response.toString());
		}
		else{

			String responseValue = "Customer " + name + " not found";

			JsonObject response = Json.createObjectBuilder()
										.add("error", responseValue).build();
			return ResponseEntity.status(HttpStatus.FORBIDDEN)
									.contentType(MediaType.APPLICATION_JSON)
									.body(response.toString());
		}
	}

	//TODO: Task 3

	@GetMapping(path = "/api/order/{name}/status")
	public ResponseEntity<String> searchOrders(){


		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
								.contentType(MediaType.APPLICATION_JSON)
								.body("dddd");
	}

		

}
