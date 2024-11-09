package com.testingapp.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.testingapp.data.remote.response.Offer
import com.testingapp.ui.screens.HomeScreen
import com.testingapp.ui.theme.green

@Composable
fun CardView(
    modifier: Modifier = Modifier,
//    icon: ImageVector,
    text: String,
    clickableText: String? = null,
//    backFroIconColor: Color,
//    tintColor: Color,
    mockResponse: Offer
) {

    Card {
        Column(
            modifier = modifier.padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
//            Box(
//                modifier = modifier
//                    .clip(MaterialTheme.shapes.extraLarge)
//                    .background(backFroIconColor)
//            ) {
//                Icon(
//                    imageVector = icon,
//                    contentDescription = "",
//                    tint = tintColor,
//                    modifier = modifier.padding(3.dp)
//                )
//            }
            Text(text = mockResponse.title, color = MaterialTheme.colorScheme.onSurface)
            Text(text = mockResponse.button.text, color = green)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview(modifier: Modifier = Modifier) {
    HomeScreen()
}