package br.dev.cezar.pontointeligente.dtos

import javax.print.DocFlavor

data class CadastroPfDTO (
    val nome: String,
    val email: String,
    val senha: String,
    val cpf: String,
    val cnpj: String,
    val empresaId: String,

    val valorHora: String? = null,
    val qtdHorasTrabalhoDia: String? = null,
    val qtdHorasAlmoco: String? = null,
    val id: String? = null
        )
