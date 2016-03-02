package com.EmployeeRegi

import java.util.Date;

class Employee {
	
	Long id
	String name
	String surname
	String fatherName
	String gender
	String dateOfBirth
	String qualification
	String mobileNumber
	String alternateMobile
	String email
	String permanentAddress
	String presentAddress
	String joining
	String experience
	String designation
	String from
	String to
	String status
	String empId
	String ref
	Date createdDate

    static constraints = {
		
		id()
		name(blank:false)
		surname(blank:false)
		fatherName(blank:false)
		gender(maxSize:10)
		dateOfBirth(nullable:false)
		qualification(maxSize:50)
		mobileNumber(maxSize:25)
		alternateMobile(maxSize:25)
		email(blank:false)
		permanentAddress(maxSize:50)
		presentAddress(maxSize:50)
		joining(maxSize:50)
		experience(maxSize:50)
		designation(maxSize:50)
		from(maxSize:50)
		to(maxSize:50)
		status(maxSize:50)
		empId(blank:false)
		ref(maxSize:50)
		createdDate(nullable:false)
		
    }
	
}
