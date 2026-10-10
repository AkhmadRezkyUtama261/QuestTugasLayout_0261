package com.example.questtugaslayout_0261

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLayoutScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 48.dp, bottom = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.title_prodi),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.text_primary)
            )

            Text(
                text = stringResource(id = R.string.title_univ),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.text_primary),
                modifier = Modifier.padding(top = 2.dp, bottom = 20.dp)
            )

            // Card 1: Gray background, cursive, no phone, yellow address
            CustomCard(
                cardBackgroundRes = R.color.card_gray,
                nameRes = R.string.nama_mahasiswa,
                addressRes = R.string.alamat_turi,
                addressColorRes = R.color.text_yellow,
                phoneRes = null,
                isCursive = true
            )

            // Card 2: Purple background, phone, yellow address
            CustomCard(
                cardBackgroundRes = R.color.card_purple,
                nameRes = R.string.nama_mahasiswa,
                addressRes = R.string.alamat_kasihan,
                addressColorRes = R.color.text_yellow,
                phoneRes = R.string.no_telepon,
                isCursive = false
            )

            // Card 3: Blue background, phone, white address
            CustomCard(
                cardBackgroundRes = R.color.card_blue,
                nameRes = R.string.nama_mahasiswa,
                addressRes = R.string.alamat_depok,
                addressColorRes = R.color.white,
                phoneRes = R.string.no_telepon,
                isCursive = false
            )

            // Card 4: Green background, phone, white address
            CustomCard(
                cardBackgroundRes = R.color.card_green,
                nameRes = R.string.nama_mahasiswa,
                addressRes = R.string.alamat_gamping,
                addressColorRes = R.color.white,
                phoneRes = R.string.no_telepon,
                isCursive = false
            )
        }

        Text(
            text = stringResource(id = R.string.copyright_text),
            fontSize = 12.sp,
            color = colorResource(id = R.color.text_secondary),
            modifier = Modifier.padding(bottom = 12.dp)
        )
    }
}
