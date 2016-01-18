package com.krixi

/* Schema for child */
class Child {

    String childName            // child name

    static belongsTo = [father: Father, mother: Mother]
//    static belongsTo = [mother: Mother]

    static constraints = {
    }
}
