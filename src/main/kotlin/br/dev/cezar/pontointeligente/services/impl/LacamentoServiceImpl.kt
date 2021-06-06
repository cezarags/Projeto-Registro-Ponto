package br.dev.cezar.pontointeligente.services.impl

import br.dev.cezar.pontointeligente.models.Lancamento
import br.dev.cezar.pontointeligente.repository.LancamentoRepository
import br.dev.cezar.pontointeligente.services.LancamentoService
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.repository.findByIdOrNull

class LacamentoServiceImpl(val lancamentoRepository: LancamentoRepository): LancamentoService {

    override fun buscarporFuncionarioId(funcionarioId: String, pageRequest: PageRequest): Page<Lancamento> =
        lancamentoRepository.findByFuncionarioId(funcionarioId, pageRequest)

    override fun buscarPorId(id: String): Lancamento? = lancamentoRepository.findByIdOrNull(id)

    override fun persistencia(lancamento: Lancamento): Lancamento = lancamentoRepository.save(lancamento)

    override fun remover(id: String)  = lancamentoRepository.deleteById(id)
}