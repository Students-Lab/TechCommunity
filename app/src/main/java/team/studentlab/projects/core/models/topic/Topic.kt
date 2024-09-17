package team.studentlab.projects.core.models.topic

import androidx.core.util.Supplier
import team.studentlab.projects.core.models.user.User

class Topic (
    val owner: User,
    val title: String,
    val subTitle: String,
    val label: TopicLabels
) {

    private var likes: Int = 0;
    private var likeByUser: MutableList<User> = mutableListOf();

    private var unlikes: Int = 0;
    private var unlikeByUser: MutableList<User> = mutableListOf();

    private var comments: MutableList<TopicComments> = mutableListOf();

    public fun addComment(topicComments: TopicComments){
        comments.add(topicComments)
    }

    public fun addComment(topicComments: Supplier<TopicComments>){
        comments.add(topicComments.get())
    }

    public fun like(user: User){

        if (unlikeByUser.contains(user)){
            unlikes-=1;
            unlikeByUser.remove(user);
        }

        likes+=1;
        likeByUser.add(user);
    }

    public fun unlike(user: User){

        if (likeByUser.contains(user)){
            likes-=1;
            likeByUser.remove(user);
        }

        unlikes+=1;
        unlikeByUser.add(user);
    }


}