package com.example.clase3_registerlogin.ui.theme

import com.example.clase3_registerlogin.ButtonOtherColor
import com.example.clase3_registerlogin.CustomButton
import com.example.clase3_registerlogin.EmailInput
import com.example.clase3_registerlogin.PasswordInput
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Login(navController: NavHostController) {
    val email = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(60.dp))
        Text(
            text = "Login",
            style = TextStyle(
                fontSize = 38.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.padding(bottom = 16.dp)
        )

        EmailInput(
            value = email.value,
            onValueChange = { email.value = it }
        )

        PasswordInput(
            value = password.value,
            onValueChange = { password.value = it }
        )

        CustomButton(
            text = "Next",
            onClick = {  }
        )

        Spacer(modifier = Modifier.height(270.dp))

        Text(
            text = "Not registered?",
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.padding(top = 16.dp, bottom = 0.dp)
        )

        ButtonOtherColor(
            text = "Register",
            onClick = { navController.navigate("Register") }
        )
    }
}