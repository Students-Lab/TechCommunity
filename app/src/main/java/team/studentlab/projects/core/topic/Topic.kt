package team.studentlab.projects.core.topic

import androidx.core.util.Supplier
import team.studentlab.projects.core.user.User

class Topic (
    val owner: User,
    val title: String,
    val subTitle: String,
    val label: TopicLabels
) {

    private var likes: Int = 0;
    private var unlikes: Int = 0;
    private var comments: MutableList<TopicComments> = mutableListOf();

    public fun addComment(topicComments: TopicComments){
        comments.add(topicComments)
    }

    public fun addComment(topicComments: Supplier<TopicComments>){
        comments.add(topicComments.get())
    }

}