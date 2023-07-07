package com.example.wtnews

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wtnews.ui.theme.WTNewsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WTNewsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    WTNewsApp()
                }
            }
        }
    }
}

@Composable
fun WTNewsApp(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Image(
            painter = painterResource(id = R.drawable.wt_news_banner),
            contentDescription = null
        )
        Text(
            text = stringResource(id = R.string.headline_one),
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = stringResource(id = R.string.article_one),
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text (
            text = stringResource(id = R.string.headline_two),
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = stringResource(id = R.string.article_two),
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun WTNewsPreview() {
    WTNewsTheme {
        WTNewsApp()
    }
}