package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Address;

@RestController
@RequestMapping("/address")
public class AddressOperationController {
	
	@GetMapping("/send")
	public ResponseEntity<Address> sendData(){
		Address adds=new Address("atharv home", 405, 444605);
		return new ResponseEntity<Address>(adds,HttpStatus.OK);
	}

}
