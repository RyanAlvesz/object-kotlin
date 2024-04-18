package br.senai.sp.jandira.viagem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.viagem.modelo.Viagem
import br.senai.sp.jandira.viagem.repositorio.ViagemRepositorio
import br.senai.sp.jandira.viagem.ui.theme.ViagemTheme
import br.senai.sp.jandira.viagem.utilitarios.encurtadorDeDatas

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViagemTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    val viagens = ViagemRepositorio().listarTodasAsViagens()

    LazyColumn(){
        items(viagens){
            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp, 4.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.Black
                )
            ) {
                Column (
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(12.dp)
                ) {
                    Surface (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Image(painter = if (it.imagem == null) painterResource(id = R.drawable.noimg) else it.imagem!! , contentDescription = "", contentScale = ContentScale.Crop)
                    }
                    Spacer(modifier = Modifier.height(12.dp))
                    Text(text = "${it.destino}, ${it.dataChegada.year}", fontWeight = FontWeight.SemiBold, color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = "${it.descricao}", color = Color.White)
                    Spacer(modifier = Modifier.height(8.dp))
                    Row (
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(text = encurtadorDeDatas(dataChegada = it.dataChegada, dataPartida = it.dataPartida), color = Color.White, fontWeight = FontWeight.SemiBold)
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ViagemTheme {
        Greeting()
    }
}