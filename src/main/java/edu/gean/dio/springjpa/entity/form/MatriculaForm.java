package edu.gean.dio.springjpa.entity.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class MatriculaForm {

  @NotNull(message = "Preencha o campo corretamente")
  @Positive(message = "O Id do aluno precisa ser positivo.")
  private Long alunoId;

}
