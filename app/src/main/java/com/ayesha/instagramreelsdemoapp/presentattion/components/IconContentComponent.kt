package com.ayesha.instagramreelsdemoapp.presentattion.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ayesha.instagramreelsdemoapp.R


@Composable
fun IconContentComponent() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            modifier = Modifier.size(40.dp),
            painter = painterResource(id = R.drawable.ic_like),
            contentDescription = stringResource(id = R.string.like)
        )
        Text(
            text = "809K",
            color = Color.White,
            fontSize = 14.sp
        )
        Spacer(modifier = Modifier.height(10.dp))
        //Comment Section

        Image(
            modifier = Modifier.size(40.dp),
            painter = painterResource(id = R.drawable.ic_comment),
            contentDescription =  stringResource(id = R.string.comment)
        )
        Text(
            text = "3,907",
            color = Color.White,
            fontSize = 14.sp
        )
        Spacer(modifier = Modifier.height(10.dp))

        //Share Section

        Image(
            modifier = Modifier.size(40.dp),
            painter = painterResource(id = R.drawable.ic_share),
            contentDescription =  stringResource(id = R.string.share)
        )
        Text(
            text = "1.8M",
            color= Color.White,
            fontSize = 14.sp
        )
        Spacer(modifier = Modifier.height(10.dp))

        Image(
            modifier = Modifier
                .size(34.dp)
                .border(2.dp, Color.White, RoundedCornerShape(5.dp)),
            painter = painterResource(id = R.drawable.naruto),
            contentDescription = stringResource(id = R.string.song_Icon),
            contentScale = ContentScale.Crop,
        )
        Spacer(modifier = Modifier.height(10.dp))

    }
}