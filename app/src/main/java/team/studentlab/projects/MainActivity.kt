package team.studentlab.projects

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import team.studentlab.projects.ui.screens.Init
import team.studentlab.projects.ui.theme.TechCommunityTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TechCommunityTheme {
                Init();
            }
        }
    }

}
