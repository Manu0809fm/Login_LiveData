# 📲 Login LiveData App

Aplicación de ejemplo en Android (Kotlin) que implementa un sistema de login con validación en tiempo real utilizando **LiveData**, **ViewModel** y **Material Design**.

---

## 🚀 Funcionalidades

- ✅ Validación de correo electrónico (solo `@gmail.com`)
- ✅ Validación de contraseña (requiere al menos un carácter especial como `@, #, $, %, &, *`, etc.)
- ✅ Interfaz moderna con Material Design (`TextInputLayout`, `MaterialButton`)
- ✅ Mensajes de error directamente en los campos
- ✅ Navegación a una nueva pantalla (`HomeActivity`) al validar correctamente
- ✅ Animación de entrada (`fade in`) al cambiar de pantalla

---

## 🧱 Tecnologías utilizadas

- Kotlin
- Android Jetpack ViewModel & LiveData
- ViewBinding
- Material Design Components
- ConstraintLayout

---

## 🖥️ Estructura del proyecto
📁 app/
┣ 📁 java/com/example/login_livedata/
┃ ┣ 📄 MainActivity.kt
┃ ┣ 📄 HomeActivity.kt
┃ ┗ 📄 LoginViewModel.kt
┣ 📁 res/layout/
┃ ┣ 📄 activity_main.xml
┃ ┗ 📄 activity_home.xml
┗ 📄 AndroidManifest.xml

---

## 🔄 Flujo de uso

1. El usuario ingresa su correo y contraseña.
2. Se valida que:
   - El correo tenga el formato `nombre@gmail.com`.
   - La contraseña contenga al menos un carácter especial.
3. Si es válido, el usuario es redirigido a la pantalla principal (`HomeActivity`).
4. Si hay errores, se muestran directamente en los campos correspondientes.

---

## 🛠️ Configuraciones necesarias

### build.gradle (app)

Asegúrate de incluir:

```groovy
buildFeatures {
    viewBinding true
}

dependencies {
    implementation 'com.google.android.material:material:1.11.0' // o más reciente
}
📸 Capturas de pantalla
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/46817340-6cbf-4fc8-b0c5-a275c7b44976" />
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/252c7464-48d9-4942-adda-c252a6b9d1f0" />
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/5454a804-4b47-48f2-9e85-dc57cf19cfd4" />
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/b8696768-8a70-4e68-baf5-cbaafa4e136b" />



