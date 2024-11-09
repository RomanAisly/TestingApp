package com.testingapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ListAlt
import androidx.compose.material.icons.rounded.Person
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.testingapp.R
import com.testingapp.ui.components.CardView
import com.testingapp.ui.components.SearchBar
import com.testingapp.ui.theme.blue
import com.testingapp.ui.theme.green
import com.testingapp.ui.theme.lightBlue
import com.testingapp.ui.theme.lightGreen
import com.testingapp.ui.theme.lightYellow
import com.testingapp.ui.theme.yellow
import com.testingapp.ui.viewmodels.HomeScreenViewModel

@Composable
fun HomeScreen(modifier: Modifier = Modifier, vm: HomeScreenViewModel = viewModel()) {
    val mockResponse by vm.mockResponse.collectAsState()
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        SearchBar(modifier = modifier)

        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
                .horizontalScroll(state = rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            CardView(
                icon = Icons.Rounded.Person,
                text = "Vacancies near with you",
                backFroIconColor = lightBlue,
                tintColor = blue,
            )
//            CardView(
//                icon = Icons.Rounded.Star,
//                text = "Up resume in search",
//                clickableText = "Up",
//                backFroIconColor = lightYellow,
//                tintColor = yellow
//            )
//            CardView(
//                icon = Icons.AutoMirrored.Rounded.ListAlt,
//                text = "Template work or resume",
//                backFroIconColor = lightGreen,
//                tintColor = green
//            )
        }


        Text(
            text = stringResource(R.string.vacancies_for_you),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .padding(vertical = 18.dp)
                .padding(start = 12.dp)
        )
    }
}