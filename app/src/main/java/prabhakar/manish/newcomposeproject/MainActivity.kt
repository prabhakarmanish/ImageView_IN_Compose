package prabhakar.manish.newcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column {
                BasicImage()
                ImageWithRoundedCorners(modifier = Modifier.padding(top = 30.dp))
                CircularImage()
                CircularImageWithBorder()
                ImageWithTextOverlay()
                BlurredImage()
            }
        }
    }
}

@Composable
fun BasicImage() {
    Image(
        painter = painterResource(id = R.drawable.one),
        contentDescription = "Basic Image",
        modifier = Modifier.border(1.dp, Color.Black),
        contentScale = ContentScale.Crop // Adjust how the image fits
    )
}

@Composable
fun ImageWithRoundedCorners(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = R.drawable.one),
        contentDescription = "Rounded Image",
        modifier = Modifier
            .size(150.dp)
            .clip(RoundedCornerShape(20.dp))
            .padding(2.dp, 2.dp, 0.dp, 0.dp)
            .border(1.dp, Color.Black), // Apply rounded corners
        contentScale = ContentScale.Crop
    )
}

@Composable
fun CircularImage() {
    Image(
        painter = painterResource(id = R.drawable.one),
        contentDescription = "Circular Image",
        modifier = Modifier
            .size(120.dp)
            .padding(2.dp, 2.dp, 0.dp, 0.dp)
            .clip(CircleShape)
            .border(2.dp, Color.Black), // Apply circular clipping
        contentScale = ContentScale.Crop
    )
}


@Composable
fun CircularImageWithBorder() {
    Image(
        painter = painterResource(id = R.drawable.one),
        contentDescription = "Circular Image with Border",
        modifier = Modifier
            .size(120.dp)
            .clip(CircleShape)
            .border(2.dp, Color.Red, CircleShape), // Add a border
        contentScale = ContentScale.Crop
    )
}

@Composable
fun ImageWithTextOverlay() {
    Box(
        modifier = Modifier
            .size(200.dp)
            .clip(RoundedCornerShape(16.dp))
    ) {
        // Background image
        Image(
            painter = painterResource(id = R.drawable.one),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .border(2.dp, Color.Black)
        )

        // Text overlay
        Text(
            text = "Overlay Text",
            color = Color.Red,
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier
                .align(Alignment.Center)
                .padding(8.dp),
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun BlurredImage() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.one),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .blur(radius = 10.dp)
        )
    }
}