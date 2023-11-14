package com.example.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.crm.model.Veiculo;
import com.example.crm.repository.VeiculoRepository;

@RestController
@RequestMapping("/veiculos")
public class ClienteController {
	
	@Autowired
	private VeiculoRepository veiculoRepository;
	
	@GetMapping
	public List <Veiculo> listar() {
		return veiculoRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Veiculo adicionar(@RequestBody Veiculo veiculo) {
		return veiculoRepository.save(veiculo);
	}
	
	@DeleteMapping
	public void Deleta(@RequestBody Veiculo veiculo) {
		veiculoRepository.delete(veiculo);
	}
	
	@PutMapping
    public ResponseEntity<?> Atualiza(@RequestBody Veiculo veiculo) {
    try {
        Veiculo veiculoAtualizado = veiculoRepository.save(veiculo);
        return ResponseEntity.ok(veiculoAtualizado); 
    } catch (Exception e) {
        String mensagemErro = "Erro ao atualizar!";
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(mensagemErro);
      }
	}
}
