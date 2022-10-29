package com.example.modulo3_covid19.service.imp;

import com.example.modulo3_covid19.model.Pessoa;
import com.example.modulo3_covid19.service.IPessoaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PessoaImplementation implements IPessoaService {
    private static final List<Pessoa> listPessoas = new ArrayList<>(
            List.of(
                    new Pessoa(1, "Heitor", "Guedes", 24),
                    new Pessoa(2, "Betinna", "Nunes", 64),
                    new Pessoa(3, "Carlos", "Markus", 34),
                    new Pessoa(4, "Marinu", "Fred", 14),
                    new Pessoa(5, "Ana", "Carol", 21),
                    new Pessoa(6, "Bruna", "Rogerio", 26),
                    new Pessoa(7, "Nina", "Rogerio", 76)
            )
    );

    @Override
    public List<Pessoa> getAll() {
        return listPessoas;
    }

    @Override
    public List<Pessoa> getPeopleRisk() {
        return listPessoas.stream().filter(p -> p.getIdade() >= 60).collect(Collectors.toList());

    }


}
