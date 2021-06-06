package br.dev.cezar.pontointeligente.services.impl

import br.dev.cezar.pontointeligente.models.Funcionario
import br.dev.cezar.pontointeligente.repository.FuncionarioRepository
import br.dev.cezar.pontointeligente.services.FuncionarioService
import java.util.*

class FuncionarioServiceImpl(val funcionarioRepository: FuncionarioRepository):  FuncionarioService {

    override fun persistir(funcionario: Funcionario): Funcionario = funcionarioRepository.save(funcionario)

    override fun buscaPorCPf(cpf: String): Funcionario? = funcionarioRepository.findByCpf(cpf)

    override fun buscarPorEmail(email: String): Funcionario? = funcionarioRepository.findByEmail(email)

    override fun buscarPorId(id: String): Funcionario = funcionarioRepository.findById(id).get()


}