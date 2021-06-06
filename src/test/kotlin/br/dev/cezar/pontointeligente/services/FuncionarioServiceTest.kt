package br.dev.cezar.pontointeligente.services

import br.dev.cezar.pontointeligente.enums.PerfilEnum
import br.dev.cezar.pontointeligente.models.Funcionario
import br.dev.cezar.pontointeligente.repository.FuncionarioRepository
import br.dev.cezar.pontointeligente.utils.SenhaUtils
import com.sun.jna.platform.win32.OaIdl
import org.junit.Before
import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.runner.RunWith
import org.mockito.BDDMockito
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner
import java.util.*

@RunWith(SpringRunner::class)
@SpringBootTest
class FuncionarioServiceTest {
    @MockBean
    private val funcionarioRepository: FuncionarioRepository? = null

    @Autowired
    private val funcionarioService: FuncionarioService? = null

    private val email: String = "email@email.com"
    private val cpf: String = "34234855948"
    private val id: String = "1"

    @Before
    @Throws(Exception::class)
    fun setUp() {
        BDDMockito.given(funcionarioRepository?.save(Mockito.any(Funcionario::class.java)))
            .willReturn(funcionario())
        BDDMockito.given(funcionarioRepository?.findById(id)).willReturn(Optional.of(funcionario()))
        BDDMockito.given(funcionarioRepository?.findByEmail(email)).willReturn(funcionario())
        BDDMockito.given(funcionarioRepository?.findByCpf(cpf)).willReturn(funcionario())
    }
    @Test
    fun testPersistirFuncionario(){
        val funcionario: Funcionario? = this.funcionarioService?.persistir(funcionario())
        Assertions.assertNotNull(funcionario)
    }

    fun testBuscarFuncionarioporId(){
        val funcionario: Funcionario? = this.funcionarioService?.buscarPorId(id)
        Assertions.assertNotNull(funcionario)
    }

    fun testBuscarFuncionarioPorEmail(){
        val funcionario: Funcionario? = this.funcionarioService?.buscarPorEmail(email)
        Assertions.assertNotNull(funcionario)
    }


    fun testBuscarFuncionarioPorCpf(){
        val funcionario: Funcionario? = this.funcionarioService?.buscaPorCPf(cpf)
        Assertions.assertNotNull(funcionario)
    }

    private fun funcionario(): Funcionario =
        Funcionario("Nome", email, SenhaUtils().gerarBcrypt("123456"),
            cpf, PerfilEnum.ROLE_USUARIO, id)
}