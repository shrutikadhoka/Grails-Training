package com.krixi

/* Schema for father */
class Father {

    String fatherName        // father name

    static hasMany = [child: Child]

    static constraints = {
    }
}
