package com.krixi

import grails.transaction.Transactional

@Transactional
class DemoService {

    def addEmployeeToDB(String name, int rollNo, String role) {
        println ">>>>>> " + rollNo

        Employee employee = new Employee(rollNo: rollNo, name: name)
        employee.addToRoles(new Role(name: role))

        employee.save(flush: true, failOnError: true)


    }

    def getEmployee() {

//        def emp = Employee.get(2)
        def emp = Employee.findByName("Shrutika")
        println "Name : " + emp.name + "  RollNo : " + emp.rollNo
        emp
    }

    def deleteEmployee(int id) {

        def emp = Employee.get(id)
//        println "Name : "+ emp.name + "  RollNo : " + emp.rollNo
        emp.delete(flush: true)

    }

    def updateEmployee(int id) {

        def emp = Employee.get(id)
        emp.name = "Sayali"
        emp.save()

    }


    def addChildToDB() {

        Father f = new Father(fatherName: "father")

        Child c = new Child(childName: "child")

        Mother m = new Mother(motherName: "mother")
        f.addToChild(Child: c)
        m.addToChild(Child: c)
        f.save(flush: true, failOnError: true)
        m.save(flush: true, failOnError: true)


    }

}
