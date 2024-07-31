package com.example.datatransfer.ui.view.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import com.example.datatransfer.R

val rainbowColors = listOf(
//    Color.Red,
//    Color.Yellow,
//    Color.Green,
    Color.Black,
    Color.Magenta
)

//@Preview
@Composable
fun InputTextComponent(
    text: String,
    onInputTextChanged: (String) -> Unit
) {
    val context = LocalContext.current
//    var text by remember { mutableStateOf("") }

    val brush = Brush.linearGradient(colors = rainbowColors)

    OutlinedTextField(
        singleLine = true,
        value = text,
        onValueChange = { onInputTextChanged(it) },
        modifier =
        Modifier
            .fillMaxWidth()
            .heightIn(min = 20.dp, max = 120.dp)
            .padding(10.dp),
        textStyle = TextStyle(brush = brush),

        placeholder = {
            Text(text = "Escribe algo ✨")
        },
        keyboardActions = KeyboardActions {

        },
        maxLines = 6,
        shape = RoundedCornerShape(8.dp),
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color(ContextCompat.getColor(context, R.color.orange)),
            unfocusedIndicatorColor = Color(
                ContextCompat.getColor(
                    context,
                    R.color.grey_title_border
                )
            ),
            cursorColor = Color(ContextCompat.getColor(context, R.color.orange)),
            focusedContainerColor = Color(ContextCompat.getColor(context, R.color.grey_title)),
            focusedLabelColor = Color(ContextCompat.getColor(context, R.color.orange)),
            unfocusedLabelColor = Color.Black,
            unfocusedPlaceholderColor = Color.LightGray,
            unfocusedContainerColor = Color(ContextCompat.getColor(context, R.color.grey_title))
        )
    )
}