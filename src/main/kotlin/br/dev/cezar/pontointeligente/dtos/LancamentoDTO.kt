package br.dev.cezar.pontointeligente.dtos

import br.dev.cezar.pontointeligente.enums.TipoEnum
import org.springframework.data.annotation.Id
import java.util.*

data class LancamentoDTO (
    val data: Date,
    val tipo: TipoEnum,
    val funcionarioId: String,
    val descricao: String? = "",
    val localizacao: String? ="",
    val id: String? = null
)




