package com.tasarimcalismasi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tasarimcalismasi.ui.theme.TasarimCalismasiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TasarimCalismasiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Deneme()
                }
            }
        }
    }
}

@Composable
fun Deneme() {
    /*Row (verticalAlignment = Alignment.Top) {
        Text(text = "It's time!",
            modifier = Modifier.padding(all = 20.dp/*(istersen top , end, start da kullanabilirsin)*/)
            ,Color.Yellow)
         Box(
                modifier = Modifier
                    .size(40.dp, 80.dp)
                    .background(Color.Red)
            )
            Spacer(modifier = Modifier.size(15.dp))
            Box(
                modifier = Modifier
                    .size(60.dp, 120.dp)
                    .background(Color.Green)
            )
            Spacer(modifier = Modifier.size(15.dp))
            Box {
                Box(
                    modifier = Modifier
                        .size(95.dp, 150.dp)
                        .background(Color.Red)
                )
                Box(
                    modifier = Modifier
                        .size(90.dp, 140.dp)
                        .background(Color.Yellow)
                )
                Box(
                    modifier = Modifier
                        .size(85.dp, 130.dp)
                        .background(Color.Black)
                )
                Box(
                    modifier = Modifier
                        .size(80.dp, 120.dp)
                        .background(Color.Blue)
                )
                Box(
                    modifier = Modifier
                        .size(75.dp, 110.dp)
                        .background(Color.Magenta)
                )
                Box(
                    modifier = Modifier
                        .size(70.dp, 100.dp)
                        .background(Color.Cyan)
                ) {
                    Text(text = "Naber?", modifier = Modifier.align(Alignment.Center),Color.Red)
                }
        }
    }*/

    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally) {
        yazi(icerik = stringResource(id = R.string.TextYazi), yaziBoyutu = 15 )
        Button(onClick = { }) {
            yazi(icerik = stringResource(id = R.string.ButtonYazi), yaziBoyutu = 35)
        }

    }

}
@Composable         //KIRMIZI KARE
fun kirmiziKare(){
    Box(modifier = Modifier
        .size(100.dp)
        .background(Color.Red))
}

@Composable         //MAVİ KARE
fun maviKare(){
    Box(modifier = Modifier
        .size(100.dp)
        .background(Color.Blue))
}
@Composable         //SARI KARE
fun sariKare(){
    Box(modifier = Modifier
        .size(100.dp)
        .background(Color.Yellow))
}
@Composable         //YAZI
fun yazi(icerik : String , yaziBoyutu : Int){
    Text(text = icerik, fontSize = yaziBoyutu.sp)

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TasarimCalismasiTheme {
Deneme()
    }
}