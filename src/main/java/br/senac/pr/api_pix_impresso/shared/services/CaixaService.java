package br.senac.pr.api_pix_impresso.shared.services;

import java.util.List;

import org.springframework.stereotype.Service;

import br.senac.pr.api_pix_impresso.caixa.JdbcCaixaRepository;
import br.senac.pr.api_pix_impresso.shared.models.Caixa;

@Service
public class CaixaService implements BaseService<Caixa, Long> {
  private JdbcCaixaRepository caixaRepository;

  public CaixaService(JdbcCaixaRepository caixaRepository) {
    this.caixaRepository = caixaRepository;
  }

  public int save(Caixa caixa) {
    // regras de negócio
    if (caixa == null) {
      throw new Error("Dados do caixa inválidos");
    }

    if (caixa.getSaldo() <= 0) {
      throw new Error("Saldo não pode ser menor ou igual a zero");
    }
    return caixaRepository.save(caixa);
  }

  public List<Caixa> findAll() {
    return caixaRepository.findAll();
  }

  public void updateSaldoCaixa(Caixa caixa) {
    caixaRepository.update(caixa);
  }

  public void update(Caixa caixa) {
    if (caixa == null) {
      throw new Error("Dados do caixa inválidos");
    }

    if (caixa.getId() <= 0 || caixa.getId() == null) {
      throw new Error("ID do caixa inválido");
    }
    // TODO - Finalizar o método update no repository

  }

  public Caixa findById(Long id) {
    return caixaRepository.findById(id).orElse(null);
  }

  public void deleteById(Long id) {
    caixaRepository.deleteById(id);
  }
}