package br.dev.cezar.pontointeligente.services

import br.dev.cezar.pontointeligente.models.Lancamento
import org.springframework.data.domain.AbstractPageRequest
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest

interface LancamentoService {

    fun  buscarporFuncionarioId(funcionarioId: String, pageRequest: PageRequest): Page<Lancamento>

    fun buscarPorId(id: String): Lancamento?

    fun persistencia(lancamento : Lancamento) :Lancamento

    fun remover(id: String)
}