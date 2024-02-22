package com.ankit.ducktales.features.auth.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.ankit.ducktales.features.auth.R
import com.ankit.ducktales.theme.DuckTalesTheme
import com.ankit.ducktales.theme.components.AppTextField
import com.ankit.ducktales.theme.components.DuckTalesPreview


@Composable
fun LoginScreen() {
    Login()
}

@Composable
fun Login() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {

        // Logo in center on top of column
        Icon(
            modifier = Modifier
                .align(CenterHorizontally)
                .padding(top = 42.dp, bottom = 32.dp), painter = painterResource(
                id = R.drawable.splash_logo
            ), contentDescription = "My Logo"
        )

        // Edit Text for Login Id
        AppTextField(value = "91ankitgupta@gmail.com", label = R.string.email,
            hint = "yourname@domain.com",
            leadingIcon = Icons.Filled.Email,
            imeAction = ImeAction.Next, onValueChanged = {

            })

        // Edit Text for password
        AppTextField(value = "1234@5", label = R.string.password,
            hint = "password",
            leadingIcon = Icons.Filled.Lock,
            imeAction = ImeAction.Done, onValueChanged = {

            })

        // Forgot password
        Row(modifier = Modifier.fillMaxWidth()) {
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .weight(1f)
            ) {
                Text(
                    text = stringResource(
                        id = R.string.forgot_password
                    ), style = MaterialTheme.typography.bodyLarge
                )

                Text(
                    text = stringResource(
                        id = R.string.click_here_to_reset
                    ), style = MaterialTheme.typography.bodySmall
                )
            }
            Button(modifier = Modifier
                .weight(1f)
                .padding(start = 64.dp),onClick = { /*TODO*/ }) {
                Icon(painter = painterResource(id = android.R.drawable.ic_media_ff), contentDescription = "login")

            }

        }

    }
}

@DuckTalesPreview
@Composable
private fun LoginPreview() {

    DuckTalesTheme {
        Surface() {
            Login()
        }
    }
}