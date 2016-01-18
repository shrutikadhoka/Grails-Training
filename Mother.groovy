package com.krixi

/* Schema for mother */
class Mother {

    String motherName

    static hasMany = [child: Child]

    static constraints = {
    }
}
