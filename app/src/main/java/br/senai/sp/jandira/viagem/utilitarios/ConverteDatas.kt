package br.senai.sp.jandira.viagem.utilitarios

import androidx.compose.runtime.Composable
import java.time.LocalDate

@Composable
fun encurtadorDeDatas(dataChegada: LocalDate, dataPartida: LocalDate): String {

    var diaChegada = dataChegada.dayOfMonth
    var mesChegada = dataChegada.month.toString()
    var mesChegadaAbreviado = mesChegada.substring(0..2)


    var diaPartida = dataPartida.dayOfMonth
    var mesPartida = dataPartida.month.toString()
    var mesPartidaAbreviado = mesPartida.substring(0..2)

    return "$diaChegada $mesChegadaAbreviado - $diaPartida $mesPartidaAbreviado"

}