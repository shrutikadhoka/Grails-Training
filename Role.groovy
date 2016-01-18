package com.krixi

/* Schema for role */
class Role {

    String name
    static belongsTo = [employee: Employee]
    static constraints = {
    }
}
