package edu.gean.dio.springjpa.service.impl;

import edu.gean.dio.springjpa.entity.Aluno;
import edu.gean.dio.springjpa.entity.AvaliacaoFisica;
import edu.gean.dio.springjpa.entity.form.AvaliacaoFisicaForm;
import edu.gean.dio.springjpa.entity.form.AvaliacaoFisicaUpdateForm;
import edu.gean.dio.springjpa.repository.AlunoRepository;
import edu.gean.dio.springjpa.repository.AvaliacaoFisicaRepository;
import edu.gean.dio.springjpa.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;
    @Autowired
    private AlunoRepository alunoRepository;
    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return null;
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
