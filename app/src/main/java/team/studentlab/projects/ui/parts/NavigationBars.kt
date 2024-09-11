package team.studentlab.projects.ui.parts

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import team.studentlab.projects.R

@Composable
fun Init() {
    Column(
        modifier = Modifier
            .background(Color(238, 238, 238, 255))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(20.dp))
                .size(130.dp)
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp, top = 10.dp)
            ) {
                NavBar();
            }
        }

        Column(
            modifier = Modifier
                .background(Color(238, 238, 238, 255))
                .padding(top = 10.dp, start = 20.dp, end = 20.dp)
        ) {
            RecentPost();
        }
    }

}

@Composable
fun TopBar(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .size(130.dp)
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .padding(start = 20.dp, end = 20.dp, top = 10.dp)
        ) {
            NavBar();
        }
    }
}

@Composable
private fun NavBar() {
    Row(
        modifier = Modifier
            .padding(top = 40.dp, bottom = 20.dp)
            .fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.fillMaxWidth()
        ) {

            Box(
                modifier = Modifier
                    .size(60.dp)
                    .clip(RoundedCornerShape(50.dp))
            ) {

                val image = painterResource(id = R.mipmap.images)
                Image(
                    image, contentDescription = "My Profile Image", modifier = Modifier.size(100.dp)
                )
            }

            Spacer(Modifier.size(25.dp))

            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(50.dp))
                    .border(
                        width = 2.dp,
                        color = Color(129, 129, 129, 57),
                        RoundedCornerShape(100.dp)
                    )
                    .size(250.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        modifier = Modifier.size(60.dp), contentAlignment = Alignment.Center
                    ) {
                        Icon(Icons.Filled.Search, contentDescription = "Searching")
                    }
                }
            }

            Box() {
                Box(
                    modifier = Modifier.size(60.dp), contentAlignment = Alignment.Center
                ) {
                    Icon(
                        Icons.Filled.MailOutline,
                        contentDescription = "Notifications",
                        modifier = Modifier.size(32.dp)
                    )
                }
            }
        }
    }
}
