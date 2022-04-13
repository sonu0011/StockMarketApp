package com.sonu.stockmarketapp.presentation.company_listings.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sonu.stockmarketapp.domain.model.CompanyListing

@Composable
fun CompanyItem(
    company: CompanyListing,
    modifier: Modifier = Modifier
) {

    Column(modifier = modifier) {
        Row(modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = company.name,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier.weight(1f),
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp,
                color = MaterialTheme.colors.onBackground,
            )

            Text(
                text = company.exchange,
                fontWeight = FontWeight.Light,
                color = MaterialTheme.colors.onBackground
            )
        }

        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "(${company.symbol})",
            fontStyle = FontStyle.Italic,
            color = MaterialTheme.colors.onBackground
        )
    }

}