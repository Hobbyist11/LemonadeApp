package com.example.lemonade

import android.graphics.Paint.Align
import android.os.Bundle
import android.view.Gravity
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Insert function here
                    LemonadeApp()
                }
            }
        }
    }
}


@Preview
@Composable
fun LemonadeApp(){
    LemonadeWithText()
}


@Composable
fun LemonadeWithText(modifier: Modifier = Modifier) {
    var number by remember {
        mutableStateOf(1)
    }
    var squeeze by remember {
        mutableStateOf(0)
    }

    var(imageId, txtId, contentDescriptionId) = when (number){
        1 -> Triple(R.drawable.lemon_tree,R.string.tap,"Description")
        2 -> Triple(R.drawable.lemon_squeeze, R.string.keep_tap, "Description")
        3 -> Triple(R.drawable.lemon_drink, R.string.drink,"Description")
        4 -> Triple(R.drawable.lemon_restart, R.string.restart_txt,"")
        else -> Triple(R.drawable.lemon_tree, R.string.tap, "Desc")

    }
    Column(
        modifier = modifier.clickable (onClick ={} ),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
            Text(
                text = stringResource(id = R.string.app_name),
                textAlign = TextAlign.Center,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .background(color = Color.hsl(46f,.85f,.67f))
                    .fillMaxWidth(1f)
                    .fillMaxHeight(.07f)
            )
            Spacer(modifier = Modifier.height(170.dp))
            Image(
                painter = painterResource(id = imageId),
                contentDescription = "Displays image",
                modifier = Modifier
                    .background(color = Color.hsl(128f, .89f, .92f,),
                    shape = RoundedCornerShape(16.dp))
                    .clickable(onClick = {})
                    .size(250.dp)

            )
            Spacer(modifier = Modifier.height(16.dp))
                Text(stringResource(id =txtId ))

        }

    }





























/*
@Composable
fun TopPanel(modifier: Modifier = Modifier){
    Column {
        Surface(color = Color.hsl(46f,.85f,.63f), modifier = Modifier
            .fillMaxWidth(1f)) {
            Text(text = stringResource(id = R.string.app_name),
            textAlign = TextAlign.Center,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(20.dp)
            )
        }
    }
}

@Composable
fun BottomPanel(modifier: Modifier = Modifier){
val image = painterResource(id = R.drawable.lemon_tree)
    Image(painter = image, contentDescription = "Lemonade tree",
    modifier = Modifier
        .background(
            color = Color.hsl(128f, .89f, .92f,),
            shape = RoundedCornerShape(16.dp)
        )
        .size(250.dp)
    )
    Text(text = stringResource(id = R.string.tap),
    textAlign = TextAlign.Justify, fontSize = 18.sp, modifier = Modifier
            .padding(top = 40.dp))


}

@Composable
fun LemonadeView(){
Column(
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,
) {

    TopPanel()
    Spacer(modifier = Modifier.height(250.dp))
    BottomPanel()
}
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LemonadeTheme {
        LemonadeView()
    }
}
 */