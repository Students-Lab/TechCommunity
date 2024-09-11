package team.studentlab.projects.ui.parts

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import team.studentlab.projects.R

@Composable
fun RecentPost() {
    LazyColumn(Modifier.padding(top = 140.dp)) {
        item {
            PostCard("Carlos", "Dono");
        }
        item {
            PostCard("Eduardo", "Gerente");
        }
    }
}



@Composable
private fun PostCard(username: String, role: String) {
    var jumpToPost = remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .padding(25.dp)
            .clip(RoundedCornerShape(20.dp))
            .fillMaxWidth()
            .defaultMinSize(100.dp)
            .background(Color.White)
    ) {
        Box(modifier = Modifier.padding(20.dp)) {
            Column {
                Row {
                    Box(
                        modifier = Modifier
                            .size(48.dp)
                            .clip(RoundedCornerShape(50.dp))
                    ) {
                        val image = painterResource(id = R.mipmap.images)
                        Image(
                            image,
                            contentDescription = "My Profile Image",
                            modifier = Modifier.size(100.dp)
                        )
                    }

                    Spacer(modifier = Modifier.size(20.dp))

                    Column {
                        Text(username)
                        Text(role)
                    }
                }

                Row(
                    Modifier
                        .padding(top = 20.dp, bottom = 20.dp)
                ) {
                    Text(
                        LoremIpsum(500).values.joinToString(),
                        maxLines = 20,
                        overflow = TextOverflow.Ellipsis,
                        onTextLayout = { textLayoutResult: TextLayoutResult ->
                            jumpToPost.value = textLayoutResult.hasVisualOverflow
                        }
                    )
                }

                if (jumpToPost.value) {
                    Button(
                        onClick = { /* Handle jump action here */ },
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .clip(RoundedCornerShape(10.dp)),
                        border = BorderStroke(1.5.dp, Color.LightGray),
                        colors = ButtonColors(Color.White, Color.Gray, Color.Gray, Color.Gray),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text("Continuar Leitura",
                            modifier = Modifier
                                .padding(
                                    top = 5.dp,
                                    bottom = 5.dp,
                                    start = 15.dp,
                                    end = 15.dp
                                ))
                    }
                }

                Row(
                    Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(),
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth(0.6f),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            Icons.Filled.FavoriteBorder,
                            contentDescription = "Notifications",
                            modifier = Modifier
                                .size(32.dp)
                                .clickable {

                                }
                        )
                    }

                    Box(
                        modifier = Modifier.fillMaxWidth(0.5f),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            Icons.AutoMirrored.Filled.Send,
                            contentDescription = "Notifications",
                            modifier = Modifier.size(32.dp)
                        )
                    }
                }
            }
        }
    }
}
