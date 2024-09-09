package team.studentlab.projects.core.user

import java.util.UUID

class User (
    val name: String,
    val age: Int,
    val email: String,
    val password: String,
    val uuid: UUID
){
}