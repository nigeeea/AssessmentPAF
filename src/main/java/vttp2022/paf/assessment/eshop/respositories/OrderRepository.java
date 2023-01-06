package vttp2022.paf.assessment.eshop.respositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;

import vttp2022.paf.assessment.eshop.models.Order;

public class OrderRepository {

	@Autowired JdbcTemplate jdbcTemplate;
	// TODO: Task 3

	public ResponseEntity<String> saveOrder(Order o){

		//covert the order to a string
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST)
							.contentType(MediaType.APPLICATION_JSON)
							.body("errorrrr");
	}
}
