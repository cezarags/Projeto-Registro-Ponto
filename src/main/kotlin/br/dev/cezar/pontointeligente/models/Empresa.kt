package br.dev.cezar.pontointeligente.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document              // No mongo utilizamos @Document para sinalizar que é uma entidade.
data class Empresa (
    val razaoSocial: String,
    val cnpj: String,
    @Id val id: String? = null
        )