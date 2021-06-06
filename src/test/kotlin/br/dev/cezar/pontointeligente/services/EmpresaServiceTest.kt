package br.dev.cezar.pontointeligente.services


import br.dev.cezar.pontointeligente.models.Empresa
import br.dev.cezar.pontointeligente.repository.EmpresaRepository

import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.runner.RunWith
import org.mockito.BDDMockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.data.mongo.AutoConfigureDataMongo
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureDataMongo
class EmpresaServiceTest {

    @Autowired
    val empresaService: EmpresaService?  = null

    @MockBean  // cria uma copia para não acessar de fato o banco de dados diretamente
    private val empresaRepository: EmpresaRepository? = null
    private val CNPJ ="51463645000100"

    @Before //anotação para configuração executa sempre antes de cada teste
    @Throws(Exception::class)
    fun setUp() {
        BDDMockito.given(empresaRepository?.findByCnpj(CNPJ)).willReturn(empresa())
        BDDMockito.given(empresaRepository?.save(empresa())).willReturn(empresa())
        // para cada chamando chamando um repository me retorno uma empresa
    }

    @Test
    fun testBuscarEmpresaPorCnpj(){
        val empresa: Empresa? = empresaService?.buscarPorCnpj(CNPJ)
        Assertions.assertNotNull(empresa)
    }

    @Test
    fun testPersistirEmpresa(){
        val empresa: Empresa? = empresaService?.persistir(empresa())
        Assertions.assertNotNull(empresa)
    }

    private fun empresa(): Empresa = Empresa("Razão Sócial", "51463645000100")
}