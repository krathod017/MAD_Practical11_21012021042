package com.example.mad_practical11_21012021042

class Contact (var id:String, var lat:String, var long:String, var name:String, var phone:String,var address:String) {

    companion object {

        var contactArray: List<Contact> = ArrayList()
    }
}