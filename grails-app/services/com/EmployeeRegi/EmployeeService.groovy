package com.EmployeeRegi

import grails.transaction.Transactional

@Transactional
class EmployeeService {

    def grailsApplication
	
		def getInstance() {
			log.info("EmployeeService getInstance ")
			try{
				return new Employee()
			}
			catch(Exception e) {
				log.info("EmployeeService getInstance Exception::"+e)
			}
		}
		
		def save(Employee EmployeeInstance) {
			log.info("EmployeeService save-Object ")
			try{
				if(EmployeeInstance == null) {
					return false
				}
				else{
					EmployeeInstance.save flush:true
					return true
				}
			}
			catch(Exception e) {
				log.info("EmployeeService save-Object Exception::"+e)
			}
		}
		def save(id,name,surname,fatherName,gender,dateOfBirth,qualification,mobileNumber,alternateMobile,
					email,permanentAddress,presentAddress,joining,experience,designation,from,to,status,empId,ref,createdDate){
			log.info("EmployeeService save-params ")
			def resultData=new HashMap<>()
			String []args=["Employee"]
			try{
				def check=Employee.findById(id,name,surname,fatherName,gender,dateOfBirth,qualification,mobileNumber,alternateMobile,
					email,permanentAddress,presentAddress,joining,experience,designation,from,to,status,empId,ref,createdDate)
				if(!check){
					def EmployeeInstance=getInstance()
					if(EmployeeInstance){
						EmployeeInstance.id=id.toLong()
						EmployeeInstance.name=name
						EmployeeInstance.surname=surname
						EmployeeInstance.fatherName=fatherName
						EmployeeInstance.grnder=gender
						EmployeeInstance.dateOfBirth=dateOfBirth
						EmployeeInstance.qualification=qualification
						EmployeeInstance.mobileNumber=mobileNumber
						EmployeeInstance.alternateMobile=alternateMobile
						EmployeeInstance.email=email
						EmployeeInstance.permanentAddress=permanentAddress
						EmployeeInstance.presentAddress=presentAddress
						EmployeeInstance.joining=joining
						EmployeeInstance.experience=experience
						EmployeeInstance.designation=designation
						EmployeeInstance.from=from
						EmployeeInstance.to=to
						EmployeeInstance.status="NA"
						EmployeeInstance.empId="NA"
						EmployeeInstance.ref=ref
						EmployeeInstance.createdDate=createdDate
						def sts= save(EmployeeInstance)
						if(sts){
							resultData.put(getMessage("default.status.label"),getMessage("default.success.message"))
							resultData.put(getMessage("default.message.label"),getMessage("default.insertion.successmessage",args))
						}
						else{
							resultData.put(getMessage("default.status.label"),getMessage("default.error.message"))
							resultData.put(getMessage("default.message.label"),getMessage("default.insertion.errormessage",args))
						}
					}
					else {
						resultData.put(getMessage("default.status.label"),getMessage("default.error.message"))
						resultData.put(getMessage("default.message.label"),getMessage("default.object.notfound",args))
					}
				}
				else{
					resultData.put(getMessage("default.status.label"),getMessage("default.error.message"))
					resultData.put(getMessage("default.message.label"),getMessage("default.object.alreadyexist",args))
				}
				return resultData
			}
			catch(Exception e) {
				log.info("EmployeeService save Exception::"+e)
			}
		}
		def change(id,name,surname,fatherName,gender,dateOfBirth,qualification,mobileNumber,alternateMobile,
					email,permanentAddress,presentAddress,joining,experience,designation,from,to,status,empId,ref,createdDate){
			log.info("EmployeeService change")
			def resultData=new HashMap<>()
			String []args=["Employee"]
			try{
				def EmployeeInstance=Employee.findById(id)
				if(EmployeeInstance) {
					EmployeeInstance.id=id.toLong()
						EmployeeInstance.name=name
						EmployeeInstance.surname=surname
						EmployeeInstance.fatherName=fatherName
						EmployeeInstance.gender=gender
						EmployeeInstance.dateOfBirth=dateOfBirth
						EmployeeInstance.qualification=qualification
						EmployeeInstance.mobileNumber=mobileNumber
						EmployeeInstance.alternateMobile=alternateMobile
						EmployeeInstance.email=email
						EmployeeInstance.permanentAddress=permanentAddress
						EmployeeInstance.presentAddress=presentAddress
						EmployeeInstance.joining=joining
						EmployeeInstance.experience=experience
						EmployeeInstance.designation=designation
						EmployeeInstance.from=from
						EmployeeInstance.to=to
						EmployeeInstance.status=status
						EmployeeInstance.empId=empId
						EmployeeInstance.ref=ref
						EmployeeInstance.createdDate=createdDate
					
					def sts1=save(EmployeeInstance)
					if(sts1){
						resultData.put(getMessage("default.status.label"),getMessage("default.success.message"))
						resultData.put(getMessage("default.message.label"),getMessage("default.change.successmessage",args))
					}
					else{
						resultData.put(getMessage("default.status.label"),getMessage("default.error.message"))
						resultData.put(getMessage("default.message.label"),getMessage("default.change.errormessage",args))
					}
				}
				else {
					resultData.put(getMessage("default.status.label"),getMessage("default.error.message"))
					resultData.put(getMessage("default.message.label"),getMessage("default.object.notfound",args))
				}
				return resultData
			}
			catch(Exception e) {
				log.info("EmployeeService change Exception")
			}
		}
		def delete(id) {
			log.info("EmployeeService delete")
			def resultData=new HashMap<>()
			String []args=["Employee"]
			try{
				def EmployeeInstance=Employee.findById(id)
				if(EmployeeInstance) {
					EmployeeInstance.delete flush:true
					resultData.put(getMessage("default.status.label"),getMessage("default.success.message"))
					resultData.put(getMessage("default.message.label"),getMessage("default.delete.successmessage",args))
				}
				else{
					resultData.put(getMessage("default.status.label"),getMessage("default.error.message"))
					resultData.put(getMessage("default.message.label"),getMessage("default.delete.errormessage",args))
				}
				return resultData
			}
			catch(Exception e) {
				log.info("EmployeeService delete Exception::"+e)
			}
		}
		def getMessage(String code) {
			return getMessage(code,null)
		}
	
		def getMessage(String code,String[] args) {
			def appCtx = grailsApplication.getMainContext()
			return appCtx.getMessage(code,args,Locale.default)
		}
}

