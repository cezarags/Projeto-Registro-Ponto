package br.dev.cezar.pontointeligente.dtos

import br.dev.cezar.pontointeligente.enums.PerfilEnum
import org.jetbrains.annotations.NotNull
import org.springframework.data.annotation.Id

class FuncionarioDTO (
    @NotNull
    val nome: String,

    val email: String,
    val senha: String,
    val cpf: String,
    val perfil: PerfilEnum,
    val empresa: String,
    val valorHora: Double? =0.0,
    val qtdHorasTrabalhoDia: Float? =0.0f,
    val qtdHorasAlmoco: Float? =0.0f,

)
