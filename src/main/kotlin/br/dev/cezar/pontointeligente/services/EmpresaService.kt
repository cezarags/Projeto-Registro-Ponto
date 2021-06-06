package br.dev.cezar.pontointeligente.services

import br.dev.cezar.pontointeligente.models.Empresa
import br.dev.cezar.pontointeligente.repository.EmpresaRepository

interface EmpresaService {

    fun buscarPorCnpj(cnpj: String): Empresa?

    fun persistir(empresa: Empresa): Empresa
}