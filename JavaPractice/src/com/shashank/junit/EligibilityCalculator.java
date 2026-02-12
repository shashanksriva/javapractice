package com.shashank.junit;

public class EligibilityCalculator {

    EmployeeInfo employeeInfo= new EmployeeInfo();

    public boolean eligibleForHike(EmployeeInfo empInfo) {
        if (empInfo.employeeInfoValidator()) {
            return empInfo.salary > 24000 && (empInfo.designation.equals("Manager") ||
                    empInfo.designation.equals("Manager"));
        } else {
            throw new IllegalArgumentException("Incorrect Employee Info passed");
        }
    }
}