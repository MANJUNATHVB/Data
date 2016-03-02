package com.EmployeeRegi



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class EmployeeController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
	
	LoginController logincontroller

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Employee.list(params), model:[employeeInstanceCount: Employee.count()]
    }

    def show(Employee employeeInstance) {
        respond employeeInstance
    }

    def create() {
        respond new Employee(params)
    }

    @Transactional
    def save(Employee employeeInstance) {
        if (employeeInstance == null) {
            notFound()
            return
        }

        if (employeeInstance.hasErrors()) {
            respond employeeInstance.errors, view:'create'
            return
        }

        employeeInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'employee.label', default: 'Employee'), employeeInstance.id])
                redirect employeeInstance
            }
            '*' { respond employeeInstance, [status: CREATED] }
        }
    }

    def edit(Employee employeeInstance) {
        respond employeeInstance
    }

    @Transactional
    def change(Employee employeeInstance) {
        if (employeeInstance == null) {
            notFound()
            return
        }

        if (employeeInstance.hasErrors()) {
            respond employeeInstance.errors, view:'updateOne'
            return
        }

        employeeInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Employee.label', default: 'Employee'), employeeInstance.id])
                redirect employeeInstance
            }
            '*'{ respond employeeInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Employee employeeInstance) {

        if (employeeInstance == null) {
            notFound()
            return
        }

        employeeInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Employee.label', default: 'Employee'), employeeInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'employee.label', default: 'Employee'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }

	def myservice() {
		log.info("Employee Controller myservice action")
		def responseData = new HashMap<>()
		def result,url
		def mode=params.mode
		def myaction = params.myaction
		def id=params.id
		def name=params.name
		def surname=params.surname
		def fatherName=params.fatherName
		def gender=params.gender
		def dateOfBirth=params.dateOfBirth
		def qualification=params.qualification
		def mobileNumber=params.mobileNumber
		def alternateMobile=params.alternateMobile
		def email=params.email
		def permanentAddress=params.permanentAddress
		def presentAddress=params.presentAddress
		def joining=params.joining
		def experience=params.experience
		def designation=params.designation
		def status="NA"
		def empId="NA"
		def ref=params.ref
		def createdDate=params.createdDate
		
		def from;
		def fresher;
		def to;
		
		if(joining == "experience")
		{
			from=params.from
			to=params.to
			experience=params.experience
			designation=params.designation
		}
		else{
		
		if(joining == "fresher")
		{
		from="NA"
		to="NA"
		experience="NA"
		designation="NA"
		}
	}
		
		if( ! (isValid(myaction) && isValid(mode))){
			responseData.put(getMessages('default.status.label'),getMessages('default.error.message'))
			responseData.put(getMessages('default.message.label'),getMessages('default.params.missing'))
			logincontroller.renderPage(mode, url, responseData)
			return
		}

		
			if(myaction.equals("save")) {
			if( ! (isValid(id)&& isValid(name)&& isValid(surname) && isValid(fatherName)&& isValid(fatherName)&& isValid(gender)&&
				isValid(dateOfBirth)&& isValid(qualification)&& isValid(mobileNumber)&& isValid(alternateMobile)&& isValid(email)&&
				isValid(permanentAddress)&& isValid(presentAddress)&& isValid(joining)&& isValid(experience)&& isValid(designation)&&
				isValid(from)&& isValid(to)&& isValid(status)&& isValid(empId)&& isValid(ref)&& isValid(createdDate))){
				responseData.put(getMessages('default.status.label'),getMessages('default.error.message'))
				responseData.put(getMessages('default.message.label'),getMessages('default.params.missing'))
				logincontroller.renderPage(mode, url, responseData)
				return
			}
			else {
				log.info("***********Employee controller*****")
				log.info(name)
				log.info(surname)
				log.info(fatherName)
				log.info(gender)
				log.info(dateOfBirth)
				log.info(qualification)
				log.info(mobileNumber)
				log.info(alternateMobile)
				log.info(email)
				log.info(permanentAddress)
				log.info(presentAddress)
				log.info(joining)
				log.info(experience)
				log.info(designation)
				log.info(status)
				log.info(empId)
				log.info(ref)
				log.info(createdDate)
				log.info("************************")
				result=EmployeeService.save(id,name,surname,fatherName,gender,dateOfBirth,qualification,mobileNumber,alternateMobile,
							email,permanentAddress,presentAddress,joining,experience,designation,from,to,status,empId,ref,createdDate)
				log.info("****&&&&&&")
				log.info(result)
			}
		}
		if(myaction.equals("update")) {
			if( ! (isValid(id)&& isValid(name)&& isValid(surname) && isValid(fatherName)&& isValid(fatherName)&& isValid(gender)&&
				isValid(dateOfBirth)&& isValid(qualification)&& isValid(mobileNumber)&& isValid(alternateMobile)&& isValid(email)&&
				isValid(permanentAddress)&& isValid(presentAddress)&& isValid(joining)&&  isValid(experience)&& isValid(designation)&&
				isValid(from)&& isValid(to)&& isValid(status)&& isValid(empId)&& isValid(ref)&& isValid(createdDate))){
				responseData.put(getMessages('default.status.label'),getMessages('default.error.message'))
				responseData.put(getMessages('default.message.label'),getMessages('default.params.missing'))
				logincontroller.renderPage(mode, url, responseData)
				return
			}
			else {
				result=EmployeeService.update(id,name,surname,fatherName,gender,dateOfBirth,qualification,mobileNumber,alternateMobile,
							email,permanentAddress,presentAddress,joining,experience,designation,from,to,status,empId,ref,createdDate)
			}
		}
		if(myaction.equals("delete")) {
			result=EmployeeService.delete(id)
		}
		
		logincontroller.renderPage(mode, url, result)
		
		}
		
		def isValid(param){
			if(null == param || param.trim() == "")
				return false
			return true
			}
			def getMessages(code) {
				return message(code : code)
			}
		
		}
		
			
		
