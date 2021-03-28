package com.nalediapps.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nalediapps.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
        }
    }
}

@Composable
fun NewsStory() {
    MaterialTheme {
    Column(modifier = Modifier.padding(16.dp)) {
        // image
        Image(
            painter = painterResource(R.drawable.matsieng_footprints),
            contentDescription = "matsieng's footprints",
            modifier = Modifier
                .height(180.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(4.dp)),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(16.dp))
        // text description
        Text("A day at Matsieng's Footprints " +
            "Legend says that the first ancestor of the Batswana, " +
            "Matsieng, was one-legged giant man",
        style = typography.h6,
        maxLines = 2,
        overflow = TextOverflow.Ellipsis)
        Text("Kgatleng, Botswana",
        style = typography.body2)
        Text("December, 2019",
        style = typography.body2)
    }
    }
}

@Preview
@Composable
fun PreviewNewsStory()  {
    NewsStory()
}

// create greeting composable function
// To make a function composable, add the @Composable annotation
@Composable
fun Greeting(name: String) {
    Text("Hello $name!")
}

/** preview your composable functions within the IDE
    the composable function must not take any parameters
    Add the @Preview annotation before @Composable
 **/
@Preview
@Composable
fun PreviewGreeting() {
    Greeting("Ratie")
}

