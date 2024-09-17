package team.studentlab.projects.core.models.topic

import team.studentlab.projects.core.models.user.User

class TopicComments(val owner: User, val message: String, val like: Int, val unlike: Int){
}