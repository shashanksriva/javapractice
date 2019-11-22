package com.example.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 
 * Build a Hospital Service which will display the below Hospital details.

 

- Id

- Name

- City

- Rating

 

1) Retrieve a specific hospital data with the id as parameter

2) Retrieve all hospitals

3) Add a new hospital

4) Update an existing hospital data

5) Delete a particular hospital
 

Use an Embedded database h2 and add a Basic Authentication to the API. 

 * @author shashasr
 *
 */
@Service
public class HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;


    public List<Hospital> getAllHospitals(){
        return null;
    }

    public Hospital getHospital(int id){
        return null;
    }

    public void addHospital(Hospital hospital){

    }

    public void updateHospital(Hospital hospital){

    }

    public void deleteHospital(Hospital hospital) {

    }
}
