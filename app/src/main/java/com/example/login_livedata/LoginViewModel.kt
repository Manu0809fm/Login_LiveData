package com.example.login_livedata
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
class LoginViewModel : ViewModel() {

    val emailError = MutableLiveData<String?>()
    val passwordError = MutableLiveData<String?>()
    val loginSuccess = MutableLiveData<Boolean>()

    fun validateLogin(email: String, password: String) {
        var isValid = true

        if (!email.matches(Regex("^[A-Za-z0-9._%+-]+@gmail\\.com$"))) {
            emailError.value = "Ingrese un correo válido de Gmail"
            isValid = false
        } else {
            emailError.value = null
        }

        if (!password.contains(Regex("[@#\$%^&+=!¿?*]"))) {
            passwordError.value = "La contraseña debe tener al menos un carácter especial"
            isValid = false
        } else {
            passwordError.value = null
        }

        loginSuccess.value = isValid
    }
}
