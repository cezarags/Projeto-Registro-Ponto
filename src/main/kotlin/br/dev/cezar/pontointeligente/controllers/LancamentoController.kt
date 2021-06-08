package br.dev.cezar.pontointeligente.controllers

import br.dev.cezar.pontointeligente.models.Lancamento
import br.dev.cezar.pontointeligente.response.Response
import br.dev.cezar.pontointeligente.services.FuncionarioService
import br.dev.cezar.pontointeligente.services.LancamentoService
import br.dev.cezar.pontointeligente.services.impl.LacamentoServiceImpl
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import javax.naming.Binding
import br.dev.cezar.pontointeligente.dtos.LancamentoDTO as LancamentoDTO1

@RestController
@RequestMapping("/api/lancamentos")
class LancamentoController (val lancamentoService: LancamentoService,
                            val funcionarioService: FuncionarioService){

    private val dateFormat = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))

    @Value("\${paginacao.qtd_por_pagina}")
    val atdPorPagina: Int = 15

    fun adicionar(@RequestBody lancamentoDTO: LancamentoDTO1) {


    }
}


