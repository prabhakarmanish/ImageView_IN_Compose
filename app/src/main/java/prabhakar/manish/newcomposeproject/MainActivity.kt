package prabhakar.manish.newcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
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
