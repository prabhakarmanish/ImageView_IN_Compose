package prabhakar.manish.newcomposeproject

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


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
