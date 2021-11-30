package br.com.seguradora.service;

import br.com.seguradora.exception.NegocioException;
import br.com.seguradora.persistence.entity.Cliente;
import br.com.seguradora.vo.ClienteVO;

public interface ClienteService {

    Cliente gravar(ClienteVO vo) throws NegocioException;

    void excluir(Long id) throws NegocioException;
}
