package com.example.android.agritech.Activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android.agritech.Activities.ui.theme.AgritechTheme
import com.example.android.agritech.Activities.ui.theme.primaryDarkColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var phoneNoTextState by remember {
                mutableStateOf("")
            }
            var passwordTextState by remember {
                mutableStateOf("")
            }

            val mContext=LocalContext.current
            AgritechTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//           LocalContext.
//           current.
//           startActivity(Intent(LocalContext.current,LoginActivity::class.java))
                    Column(
                        modifier = Modifier
                            .fillMaxSize(), verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "Agritech", fontSize = 50.sp)
                        Spacer(modifier = Modifier.height(30.dp))
                        OutlinedTextField(value = phoneNoTextState,
                            onValueChange = {
                            phoneNoTextState = it
                        },
                         label = {
                            Text(text = "Phone Number")
                        },
                         shape = RoundedCornerShape(20.dp),
                            placeholder = {
                                Text(text = "Phone Number")
                            })
                        //========================
                        Spacer(modifier = Modifier.height(20.dp))
                        OutlinedTextField(value = passwordTextState, onValueChange = {
                            passwordTextState = it
                        }, label = {
                            Text(text = "Password")
                        }, shape = RoundedCornerShape(20.dp), placeholder = {
                            Text(text = "Password")
                        },visualTransformation = PasswordVisualTransformation())
//                        ======================

                        //========================
                        Spacer(modifier = Modifier.height(10.dp))
                        //TODO 1
                        Button(onClick = {
                            mContext.startActivity(Intent(mContext,BottomNavBarActivity::class.java))
                        }) {
                            Text(text = "Sign in")
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        Text(text = "Don't have an Account? Sign up!",color= primaryDarkColor,
                        modifier = Modifier.clickable { mContext.
                        startActivity(Intent(mContext,SignUpActivity::class.java)) })
                    }
                }

            }
        }
    }
}

