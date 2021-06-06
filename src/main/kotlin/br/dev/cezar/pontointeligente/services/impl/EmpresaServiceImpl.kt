package br.dev.cezar.pontointeligente.services.impl

import br.dev.cezar.pontointeligente.models.Empresa
import br.dev.cezar.pontointeligente.repository.EmpresaRepository
import br.dev.cezar.pontointeligente.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService {



    override fun buscarPorCnpj(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

    override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)


}