package team.studentlab.projects

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import team.studentlab.projects.ui.parts.RecentPost
import team.studentlab.projects.ui.parts.TopBar
import team.studentlab.projects.ui.theme.TechCommunityTheme

class MainActivity : ComponentActivity() {

    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TechCommunityTheme {
                Scaffold(
                    topBar = { TopBar() },
                    content = { RecentPost() }
                )
            }
        }
    }

}
