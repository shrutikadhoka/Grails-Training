package com.krixi

import DiskStorageSystem.Folder
import DiskStorageSystem.HardDisk

/* Schema for drive */
class Drive {

    String name

    static belongsTo = [hardDisk: HardDisk]
    static hasMany = [folders: Folder]
    static constraints = {
    }

    static saveDriveData(def jsonObject) {

        return new Drive(
                name: jsonObject.name
        )
    }
}
