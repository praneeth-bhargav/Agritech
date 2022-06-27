package Classes

import android.media.Image
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import com.example.android.agritech.R

data class Crops(

    val name: String,
    var price:Int,
    var quantity:Int,
    val imageId:Int=R.drawable.crops

    ) {

}