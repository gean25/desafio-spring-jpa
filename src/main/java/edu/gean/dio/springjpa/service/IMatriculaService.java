package edu.gean.dio.springjpa.service;

import edu.gean.dio.springjpa.entity.form.MatriculaForm;
import edu.gean.dio.springjpa.entity.Matricula;

import java.util.List;

public interface IMatriculaService {
  Matricula create(MatriculaForm form);
  Matricula get(Long id);
  List<Matricula> getAll();
  void delete(Long id);

}
