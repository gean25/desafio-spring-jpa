package edu.gean.dio.springjpa.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvaliacaoFisicaForm {

  private Long alunoId;

  private double peso;

  private double altura;
}
