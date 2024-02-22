package com.ankit.ducktales.features.auth.login

sealed class LoginUiEvent {
    data class EmailChanged(val email: String) : LoginUiEvent()
    data class PasswordChanged(val password: String) : LoginUiEvent()

    data object Login : LoginUiEvent()
    data object ForgotPassword : LoginUiEvent()

    data object SignUp:LoginUiEvent()

}