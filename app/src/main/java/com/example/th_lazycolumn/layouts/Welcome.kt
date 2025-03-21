package com.example.th_lazycolumn.layouts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.th_lazycolumn.R
import com.example.th_lazycolumn.ui.theme.Blue_btn
import androidx.compose.ui.text.font.FontWeight as fontWeight

@Composable
fun Welcome(navController: NavController) {
    Column(
        Modifier
            .padding(20.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Spacer(Modifier.weight(1f))

        Image(
            painter = painterResource(id = R.drawable.jetpack_compose_logo),
            contentDescription = "jetpack_compose_logo",
            Modifier.size(200.dp)
        )

        Text(
            text = "Navigation",
            fontSize = 25.sp,
            fontWeight = fontWeight.Bold,
        )
        Spacer(modifier = Modifier.padding(5.dp))

        Text(
            text = "is a framework that simplifies the implementation of navigation between different UI components (activities, fragments, or composables) in an app",
            textAlign = TextAlign.Center,
        )
        Spacer(modifier = Modifier.weight(1f))
        Button(
            colors = ButtonDefaults.buttonColors(
                containerColor = Blue_btn,
                contentColor = Color.White
            ),
            modifier = Modifier
                .size(250.dp, 50.dp)
                .padding()
                .height(50.dp)
            ,
            onClick = {navController.navigate("list")},


        ) {
            Text(
                text = "PUSH",
                fontSize = 18.sp,
                fontWeight = fontWeight.Bold,

                )
        }
        Spacer(modifier = Modifier.weight(0.4f))

    }

}