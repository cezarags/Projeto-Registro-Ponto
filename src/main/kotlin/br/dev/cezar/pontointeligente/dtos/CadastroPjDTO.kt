package br.dev.cezar.pontointeligente.dtos

data class CadastroPjDTO (
    val nome: String,
    val email: String,
    val senha: String,
    val cpf: String,
    val cnpj: String,
    val razaoSocial: String,
    val id: String? = null
        )