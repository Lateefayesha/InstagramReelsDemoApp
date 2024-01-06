package com.ayesha.instagramreelsdemoapp.presentattion.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.ayesha.instagramreelsdemoapp.R

@Composable
fun BottomBarComponent() {
    BottomAppBar(
        containerColor = Color.Black,
        contentColor = Color.White,
        modifier = Modifier.height(50.dp)
    ) {
        Icon(
            modifier = Modifier
                .size(26.dp)
                .weight(1f),
            painter = painterResource(id = R.drawable.ic_home),
            contentDescription = stringResource(id = R.string.home),
        )
        Icon(
            modifier = Modifier
                .size(26.dp)
                .weight(1f),
            painter = painterResource(id = R.drawable.ic_search),
            contentDescription = stringResource(id = R.string.search),
        )
        Icon(
            modifier = Modifier
                .size(26.dp)
                .weight(1f),
            painter = painterResource(id = R.drawable.ic_add),
            contentDescription = stringResource(id = R.string.add),
        )
        Icon(
            painter =  painterResource(id = R.drawable.ic_reel),
            contentDescription = stringResource(id = R.string.reels)
        )
        Box(
            modifier = Modifier.weight(1f),
            contentAlignment = Alignment.Center
        ){
            Image(
                modifier = Modifier
                    .size(33.dp)
                    .background(Color.White, CircleShape),
                painter = painterResource(id = R.drawable.naruto),
                contentDescription = stringResource(id = R.string.profile) )
        }

    }

}