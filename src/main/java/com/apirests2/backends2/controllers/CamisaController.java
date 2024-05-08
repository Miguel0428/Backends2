package com.apirests2.backends2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirests2.backends2.models.Camisa;
import com.apirests2.backends2.repositories.CamisaRepository;

@RestController
@RequestMapping("/api/camisas")
public class CamisaController {
  @Autowired
  private CamisaRepository camisaRepository;

  @GetMapping("/all")
  public List<Camisa> obtenerTodasLasCamisas() {
    return camisaRepository.findAll();
  }

  @GetMapping("/{id}")
  public Camisa obtenerCamisaPorId(@PathVariable Long id) {
    return camisaRepository.findById(id).orElse(null);
  }

  @PostMapping("/add/camisa")
  public Camisa crearCamisa(@RequestBody Camisa camisa) {

    return camisaRepository.save(camisa);
  }

  @PutMapping("/update-camisa/{id}")
  public Camisa actualizarCamisa(@PathVariable Long id, @RequestBody Camisa camisa) {
    camisa.setId(id);
    return camisaRepository.save(camisa);

  }

  @DeleteMapping("/delete-camisa/{id}")

    public void borrarCamisa(@PathVariable Long id){
      camisaRepository.deleteById(id);
    
  }

}
