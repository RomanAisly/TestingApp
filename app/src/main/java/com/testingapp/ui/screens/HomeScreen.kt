package com.testingapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.testingapp.R
import com.testingapp.ui.components.CardView
import com.testingapp.ui.components.SearchBar
import com.testingapp.ui.viewmodels.HomeScreenViewModel

@Composable
fun HomeScreen(modifier: Modifier = Modifier, vm: HomeScreenViewModel = viewModel()) {
    val offers = vm.offers.collectAsState()
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        SearchBar(modifier = modifier)

        LazyRow {
            items(offers.value.size) {
                CardView(
                    text = offers.value[it].title,
                    mockResponse = offers.value[it]
                )
            }
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

@Preview(showBackground = true)
@Composable
fun Preview(modifier: Modifier = Modifier) {
    HomeScreen()
}