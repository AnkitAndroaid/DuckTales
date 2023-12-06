package com.ankit.ducktales.theme.components

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import com.ankit.ducktales.theme.DuckTalesTheme

@Composable
fun AppBar(
    title:String,
    navIcon:ImageVector ?= null,
    onNav:()->Unit={

    }
){
    TopAppBar(colors = TopAppBarDefaults.topAppBarColors(
        containerColor = MaterialTheme.colorScheme.primaryContainer,
        titleContentColor = MaterialTheme.colorScheme.primary
    ),

        title = {
            Text(text = title)

        }, navigationIcon = {
            navIcon?.let {
                IconButton(onClick = { onNav() }) {
                    Icon(navIcon, contentDescription =  "Nav Icon")
                    
                }

            }
        }
    )
}

@Composable
@DuckTalesPreview
private fun AppBarPreview() {
    DuckTalesTheme {
        Surface {
            AppBar(title = "Mini Tales")
        }
    }
}


