package com.testingapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.testingapp.R
import com.testingapp.ui.screens.HomeScreen
import com.testingapp.ui.theme.green

@Composable
fun CardView(
    modifier: Modifier = Modifier,
    icon: ImageVector = ImageVector.vectorResource(id = R.drawable.ic_launcher_foreground),
    text: String = "",
    clickableText: String? = null,
    backFroIconColor: Color = MaterialTheme.colorScheme.surface,
    tintColor: Color = MaterialTheme.colorScheme.onSurface,
) {

    Card {
        Column(
            modifier = modifier.padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Box(
                modifier = modifier
                    .clip(MaterialTheme.shapes.extraLarge)
                    .background(backFroIconColor)
            ) {
                Icon(
                    imageVector = icon,
                    contentDescription = "",
                    tint = tintColor,
                    modifier = modifier.padding(3.dp)
                )
            }
            Text(text = text, color = MaterialTheme.colorScheme.onSurface)
            Text(text = clickableText?: "", color = green)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview(modifier: Modifier = Modifier) {
    HomeScreen()
}