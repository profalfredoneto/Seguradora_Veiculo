package br.com.seguradora.service.impl;

import br.com.seguradora.exception.NegocioException;
import br.com.seguradora.persistence.entity.Cliente;
import br.com.seguradora.persistence.repository.ClienteRepository;
import br.com.seguradora.service.ClienteService;
import br.com.seguradora.vo.ClienteVO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente gravar(ClienteVO vo) throws NegocioException {
        return clienteRepository.save(
                Cliente.builder()
                        .id(vo.getId())
                        .cpf(vo.getCpf())
                        .nome(vo.getNome())
                        .cidade(vo.getCidade())
                        .uf(vo.getUf())
                        .build()
        );
    }

    @Override
    public void excluir(Long id) throws NegocioException {
        clienteRepository.delete(clienteRepository.findById(id).orElseThrow(() -> new NegocioException("Cliente inválido")));
    }
}
