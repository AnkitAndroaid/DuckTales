package com.ankit.ducktales.features.auth.splash

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.ankit.ducktales.features.auth.R
import com.ankit.ducktales.theme.DuckTalesTheme
import com.ankit.ducktales.theme.components.DuckTalesPreview

@Composable
fun SplashScreen(){
 Splash()
}



@Composable
fun Splash(){
    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
       Icon(painter = painterResource(R.drawable.splash_logo), contentDescription = "duck tales" )
    }

}


@DuckTalesPreview
@Composable
private fun SplashPreview(){
    DuckTalesTheme {
        Surface(modifier = Modifier.fillMaxSize()){
        Splash()
        }
    }
}