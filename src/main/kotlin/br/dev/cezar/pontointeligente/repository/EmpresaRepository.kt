package br.dev.cezar.pontointeligente.repository

import br.dev.cezar.pontointeligente.models.Empresa
import org.springframework.data.mongodb.repository.MongoRepository

interface EmpresaRepository : MongoRepository< Empresa, String> {

    fun findByCnpj(cnpj: String): Empresa ?


}