package com.krixi

/* Schema for employee */
class Employee {

    String name;
    int rollNo
//    static belongsTo = [organisation: Organisation]
    static hasMany = [roles: Role]
    static constraints = {
    }
}
