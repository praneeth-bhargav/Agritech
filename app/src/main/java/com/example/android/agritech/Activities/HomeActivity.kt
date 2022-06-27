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
            var selectedItem by remember { mutableStateOf(0) }
            var mContext= LocalContext.current
            AgritechTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    Column(Modifier.fillMaxSize()) {
                        Column(
                            Modifier
                                .fillMaxSize()
                                .padding(top = 10.dp)
                        ) {
                            Row(
                                Modifier
                                    .fillMaxWidth()
                                    .weight(0.05f)
                                    .padding(bottom = 1.dp,start=5.dp,end=5.dp),
                                horizontalArrangement = Arrangement.SpaceBetween

                            ) {
                                Text(text = "Home", fontSize = 24.sp, modifier = Modifier.padding(horizontal = 5.dp))
                                Button(onClick = { /*TODO*/ }) {
                                    Text(text = "Logout", fontSize = 16.sp)
                                }
                            }
                            Divider(
                                thickness = 2.dp,
                                color = Color.Black,
                                modifier = Modifier.padding(horizontal = 5.dp, vertical = 5.dp)
                            )
                            Box(modifier = Modifier
                                .weight(0.4f)
                                .background(color = Color.Cyan)){
                            }
//                        Displaying crops
                            Divider(color = Color.Black)
                            Text(
                                text = "Today’s Market Prices",
                                fontSize = 32.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(vertical = 2.dp)
                            )
                            Column(modifier = Modifier
                                .verticalScroll(rememberScrollState())
                                .weight(0.5f)
                            ) {
                                DisplayCard(Crops("Potato", 23, 20,R.drawable.potato))
                                DisplayCard(Crops("Tomato", 18, 20,R.drawable.tomato))
                                DisplayCard(Crops("Spinach", 23, 20,R.drawable.spinach))
                                DisplayCard(Crops("Potato", 23, 20,R.drawable.moong))
                                DisplayCard(Crops("Potato", 23, 20,R.drawable.potato))
                                DisplayCard(Crops("Tomato", 18, 20,R.drawable.tomato))
                                DisplayCard(Crops("Spinach", 23, 20,R.drawable.spinach))
                                DisplayCard(Crops("Potato", 23, 20,R.drawable.moong))
                            }
                            val configuration = LocalConfiguration.current

                            val screenHeight = configuration.screenHeightDp.dp
                            val screenWidth = configuration.screenWidthDp.dp
                            BottomNavigation(modifier = Modifier.width(screenWidth)){
                                val items = listOf("Home", "Dashboard", "Orders","Profile")
                                items.forEachIndexed { index, item ->
                                    BottomNavigationItem(
                                        icon = { Icon(Icons.Filled.Star , contentDescription = null) },
                                        label = { Text(item) },
                                        selected = selectedItem == index,
                                        onClick = { selectedItem = index
                                            when (selectedItem){
                                                0->{

                                                }
                                                1->{
                                                    mContext.startActivity(Intent(mContext,DashboardActivity::class.java))
                                                }
                                                2->{
                                                    mContext.startActivity(Intent(mContext,OrdersActivity::class.java))
                                                }
                                                3->{
                                                    mContext.startActivity(Intent(mContext,ProfileActivity::class.java))
                                                }
                                            }
                                        }
                                    )
                                }
                            }
                        }





                }
            }
        }
    }
}

@Composable
fun DisplayCard(crop:Crops) {
    Card(elevation = 5.dp, shape = RoundedCornerShape(15.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp, horizontal = 10.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .background(
                color = randomLightColors.random()
            )
            .padding(5.dp)){
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Image(
                    painterResource(id = crop.imageId),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(60.dp)
                )
                Spacer(modifier = Modifier.width(5.dp))
//                Name and Quantity
                Column {
                    Text(text = "${crop.name}",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(text= buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = black,
                                fontSize = 20.sp

                            )){
                            //append()
                        }
                        withStyle(
                            style = SpanStyle(


                            )
                        ){
                            append("Quantity: ${crop.quantity}")
                        }

                    })
                    //Text(text = "Quantity: ${crop.quantity}")
                }
            }
//            Price
            Text(text= buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = black,
                        fontSize = 20.sp

                    )){
                    append("Price: ")
                }
                append("${crop.price} Rs/- Per Kg")

            })


        }

    }

}


