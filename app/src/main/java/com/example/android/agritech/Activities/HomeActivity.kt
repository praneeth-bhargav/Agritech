package com.example.android.agritech.Activities

import Classes.Crops
import android.content.Intent
import android.graphics.LightingColorFilter
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android.agritech.Activities.ui.theme.AgritechTheme
import com.example.android.agritech.Activities.ui.theme.black
import com.example.android.agritech.Activities.ui.theme.primaryLightColor
import com.example.android.agritech.R
import java.net.CookieHandler
import kotlin.math.round
import kotlin.random.Random
val randomLightColors= listOf<Color>(
    Color(0xFF98EC92),
    Color(0xFF7fffd4),
    Color(0xFF80C710),
    Color(0xFF399E03),
    Color(0xFFD7E647),
    Color(0xFF9BE248),
    Color(0xFF88D62D),
    Color(0xFFB8F1B0),
    Color(0xFF00FFAB),
    Color(0xFFE3FCBF),
    Color(0xFF40DFEF),
)
class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}




