package com.example.android.agritech.Activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android.agritech.Activities.ui.theme.AgritechTheme

class SignUpActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var phoneNoTextState by remember {
                mutableStateOf("")
            }
            var passwordTextState by remember {
                mutableStateOf("")
            }
            var cPasswordTextState by remember {
                mutableStateOf("")
            }
            var mContext= LocalContext.current
            AgritechTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
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
                        }, visualTransformation = PasswordVisualTransformation()
                        )
                        //========================
                        Spacer(modifier = Modifier.height(20.dp))
                        OutlinedTextField(value = cPasswordTextState, onValueChange = {
                            cPasswordTextState = it
                        }, label = {
                            Text(text = "Confirm Password")
                        }, shape = RoundedCornerShape(20.dp), placeholder = {
                            Text(text = "Confirm Password")
                        },visualTransformation = PasswordVisualTransformation())
                        Spacer(modifier = Modifier.height(10.dp))
                        //TODO 2
                        Button(onClick = { }) {
                            Text(text = "Sign up")
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        Text(text = "Already have an account? Click here",color= Color(0xFF32cb00),
                            modifier = Modifier.clickable { mContext.
                            startActivity(Intent(mContext,MainActivity::class.java)) })
                    }
                }
            }
        }
    }
}

