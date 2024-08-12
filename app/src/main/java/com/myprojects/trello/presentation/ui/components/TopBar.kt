package com.myprojects.trello.presentation.ui.components

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable

@Composable
fun TopBar(
    title: String,
    navigation: @Composable () -> Unit
    ) {
    TopAppBar(
        title = { Text(text = title) },
        navigationIcon = { navigation() }
        )
}