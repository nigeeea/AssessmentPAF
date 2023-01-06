package vttp2022.paf.assessment.eshop.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vttp2022.paf.assessment.eshop.models.Customer;
import vttp2022.paf.assessment.eshop.models.Order;
import vttp2022.paf.assessment.eshop.models.OrderStatus;
import vttp2022.paf.assessment.eshop.respositories.CustomerRepository;

@Service
public class WarehouseService {

	@Autowired CustomerRepository customerRepo;

	// You cannot change the method's signature
	// You may add one or more checked exceptions
	public OrderStatus dispatch(Order order) {

		// TODO: Task 4

		OrderStatus os = new OrderStatus();
		return os;
	}

	public Optional<Customer> findCustomerByName(String name){
		return customerRepo.findCustomerByName(name);
	}
}
