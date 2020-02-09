package pe.kreatec.workmanagerexample.repository

import pe.kreatec.workmanagerexample.model.User
import javax.inject.Singleton

@Singleton
class UserRepository constructor(

) {
    fun getUser() = User() // room / retrofit
}