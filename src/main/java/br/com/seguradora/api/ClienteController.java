package br.com.seguradora.api;

import br.com.seguradora.exception.NegocioException;
import br.com.seguradora.persistence.entity.Cliente;
import br.com.seguradora.service.ClienteService;
import br.com.seguradora.vo.ClienteVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientes")
@Api(value = "Controller Clientes", description = "API responsável por disponibilizar recursos dos Clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    @ApiOperation(value = "Método responsável por salvar um Cliente")
    public ResponseEntity<Cliente> gravar(
            @ApiParam(value = "Objeto ClienteVO para cadastro de um Cliente")
            @RequestBody ClienteVO vo) throws NegocioException {
        return ResponseEntity.ok(clienteService.gravar(vo));
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity excluir(
            @ApiParam(value = "ID da conta do qual o objeto será excluido", required = true)
            @PathVariable("id") Long id) throws NegocioException {
        clienteService.excluir(id);
        return ResponseEntity.noContent().build();
    }
}
