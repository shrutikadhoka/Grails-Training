package com.krixi

class SampleController {

    def demoService

    def index() {
        render new Date()
    }

    def saveEmployee() {            // Store emp in DB
        println "........... saveEmployee ............"

        String name = "Shrutika"    //params.name
        int rollNo = 1     // params.rollNo

        Employee e = demoService.addEmployeeToDB(name, rollNo, "Java Developer")    // Call service method to save emp
        e.addToRoles(new Role(name: "Grails Developer"))                            // Add roles to emp
        e.addToRoles(new Role(name: "Web Developer"))
        e.save()
        demoService.addEmployeeToDB("Minal", 2, "QA")
        demoService.addEmployeeToDB("Purva", 3, "Grails Developer")
        demoService.addEmployeeToDB("Shilpa", 4, "Website Developer")
        demoService.addEmployeeToDB("Swapnali", 5, "QA")
        demoService.addEmployeeToDB("Mayuri", 6, "Grails Developer")

//        render "Name : "+ e.name + "  RollNo : " + e.rollNo + "Added"
        render "Record Added Succesfully"
    }

    def searchEmployee() {                          // Find a particular Employee in table
        Employee e = demoService.getEmployee()
        render "Name : " + e.name + "  RollNo : " + e.rollNo
    }

    def removeEmployee() {                  // Deletes an employee from table

        demoService.deleteEmployee(10)
        render "Employee Deleted Successfully"
    }

    def changeEmployee() {              // Modifies an existing employee
        demoService.updateEmployee(8)
    }

    def insertChild() {                 // Adds child to parent
        demoService.addChildToDB()
        render "Record Added Succesfully"
    }


}
