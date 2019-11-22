package com.example.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/test/")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;



public @ResponseBody Hospital getHospital(@PathVariable("id") int id) throws Exception {

        return null;
    }


public @ResponseBody List<Hospital> getAllHospitals() throws Exception {
		return null;
    }



public ResponseEntity<String> addHospital(@RequestBody Hospital hospital  ) {

	return null;
}


public ResponseEntity<String> updateHospital(@RequestBody Hospital hospital) {
	
	return null;
}


public ResponseEntity<String> deleteHospital(@RequestBody Hospital hospital) {

	return null;
}

}
