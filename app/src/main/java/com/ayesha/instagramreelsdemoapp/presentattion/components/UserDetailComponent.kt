package com.ayesha.instagramreelsdemoapp.presentattion.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ayesha.instagramreelsdemoapp.R


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun UserDetailsComponent(modifier: Modifier = Modifier) {

    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = modifier
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            //Profile Pic
            Image(
                painter = painterResource(id = R.drawable.naruto),
                contentDescription = stringResource(id = R.string.profile_picture),
                modifier = Modifier
                    .size(36.dp)
                    .background(Color.White, CircleShape)

            )
            Spacer(modifier = Modifier.width(5.dp))
            //User Name
            Text(
                text = "naruto.uzumaki",
                color = Color.White,
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.width(10.dp))
            //Follow Button
            Text(
                text = "Follow",
                color = Color.White,
                modifier = Modifier
                    .border(
                        BorderStroke(1.dp, Color.White),
                        RoundedCornerShape(6.dp),

                        )
                    .padding(
                        horizontal = 15.dp,
                        vertical = 2.dp
                    ),
                fontSize = 14.sp
            )

        }

        Spacer(modifier = Modifier.height(10.dp))
        //Caption

        Text(
            text = "Hello Otaku!",
            color = Color.White,
            modifier = Modifier.padding(start = 5.dp),
            fontSize = 14.sp
        )

        Spacer(modifier = Modifier.height(10.dp))

        // Liked
        Text(
            text = "Liked by garam.dimag and 129,585 others",
            color = Color.White,
            modifier = Modifier.padding(start = 5.dp),
            fontSize = 12.sp,
        )

        Spacer(modifier = Modifier.height(10.dp))

        //Sound Track
        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color.Transparent,
            ),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Gray)
                    .padding(horizontal = 10.dp, vertical = 4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_music),
                    contentDescription = stringResource(id = R.string.music),
                    modifier = Modifier.size(18.dp)

                )
                Text(
                    maxLines = 1,
                    modifier = Modifier.basicMarquee(),
                    text = "Arjit singh, Nikhita gandhi, Amitabh Bhattacharya - tere pyar mein",
                    color = Color.White,
                    fontSize = 12.sp,
                )
            }

        }

        Spacer(modifier = Modifier.height(10.dp))


    }
}