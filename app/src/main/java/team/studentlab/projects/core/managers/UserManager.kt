package team.studentlab.projects.core.managers

import team.studentlab.projects.core.models.user.User
import java.util.UUID

class UserManager() {

    private val users : MutableMap<UUID, User> = mutableMapOf();

    fun addUser(user: User){
        users[UUID.randomUUID()] = user;
    }

    //Idk
    fun getUser(name: String) : User?{
        return users.values.find { user: User -> user.name == name }
    }

    fun getUsers(): Map<UUID, User> {
        return users;
    }
}