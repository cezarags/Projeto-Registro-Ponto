package br.dev.cezar.pontointeligente.utils

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class SenhaUtils {

  //  fun gerarBcryptAntiga(senha: String) : String
  //  { return BCryptPasswordEncoder().encode(senha)}

    fun gerarBcrypt(senha: String) : String = BCryptPasswordEncoder().encode(senha)


}