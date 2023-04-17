package edu.gean.dio.springjpa.service;

import edu.gean.dio.springjpa.entity.AvaliacaoFisica;
import edu.gean.dio.springjpa.entity.form.AvaliacaoFisicaForm;
import edu.gean.dio.springjpa.entity.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface IAvaliacaoFisicaService {
  AvaliacaoFisica create(AvaliacaoFisicaForm form);
  AvaliacaoFisica get(Long id);
  List<AvaliacaoFisica> getAll();
  AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);
  void delete(Long id);
}
