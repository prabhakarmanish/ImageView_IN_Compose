package prabhakar.manish.newcomposeproject

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BasicImage() {
    Image(
        painter = painterResource(id = R.drawable.one),
        contentDescription = "Basic Image",
        modifier = Modifier.border(1.dp, Color.Black),
        contentScale = ContentScale.Crop // Adjust how the image fits
    )
}
