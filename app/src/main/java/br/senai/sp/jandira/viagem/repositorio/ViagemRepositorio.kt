package br.senai.sp.jandira.viagem.repositorio

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.viagem.R
import br.senai.sp.jandira.viagem.modelo.Viagem
import java.time.LocalDate

class ViagemRepositorio {

    @Composable
    fun listarTodasAsViagens(): List<Viagem> {

         val londres = Viagem(
             id = 1,
             destino = "Londres",
             descricao = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million.",
             dataChegada = LocalDate.of(2019, 2, 18),
             dataPartida = LocalDate.of(2019, 2, 21),
             imagem = painterResource(id = R.drawable.london)
         )

        val salvador = Viagem(
            id = 2,
            destino = "Salvador",
            descricao = "Salvador, a capital do estado da Bahia no nordeste do Brasil, é conhecida pela arquitetura colonial portuguesa, pela cultura afrobrasileira e pelo litoral tropical.",
            dataChegada = LocalDate.of(2021, 8, 4),
            dataPartida = LocalDate.of(2021, 8, 8),
            imagem = painterResource(id = R.drawable.salvador)
        )

        val coneyIsland = Viagem(
            id = 3,
            destino = "Coney Island",
            descricao = "Coney Island é uma península, anteriormente uma ilha, localizada no distrito de Brooklyn, Nova Iorque, Estados Unidos.",
            dataChegada = LocalDate.of(2022, 1, 12),
            dataPartida = LocalDate.of(2022, 1, 18),
            imagem = painterResource(id = R.drawable.coney_island)
        )

        val ottawa = Viagem(
            id = 4,
            destino = "Ottawa",
            descricao = "Ottawa é a capital do Canadá, localizada na província de Ontário (sudeste do país), perto da cidade de Montreal e da fronteira com os Estados Unidos.",
            dataChegada = LocalDate.of(2021, 10, 6),
            dataPartida = LocalDate.of(2021, 12, 6)
        )

        val amsterdam = Viagem(
            id = 5,
            destino = "Amsterdam",
            descricao = "Amsterdã é a capital da Holanda, conhecida por seu patrimônio artístico, um elaborado sistema de canais e casas estreitas com telhados de duas águas, legados da era dourada do século XVII na cidade.",
            dataChegada = LocalDate.of(2023, 12, 25),
            dataPartida = LocalDate.of(2024, 3, 6),
            imagem = painterResource(id = R.drawable.amsterdam)
        )

        return listOf(londres, salvador, coneyIsland, ottawa, amsterdam)

    }

}