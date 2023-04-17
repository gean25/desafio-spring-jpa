package edu.gean.dio.springjpa.service;

import edu.gean.dio.springjpa.entity.AvaliacaoFisica;
import edu.gean.dio.springjpa.entity.form.AlunoForm;
import edu.gean.dio.springjpa.entity.Aluno;
import edu.gean.dio.springjpa.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {
  Aluno create(AlunoForm form);
  Aluno get(Long id);
  List<Aluno> getAll();
  Aluno update(Long id, AlunoUpdateForm formUpdate);
  void delete(Long id);

  List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}
