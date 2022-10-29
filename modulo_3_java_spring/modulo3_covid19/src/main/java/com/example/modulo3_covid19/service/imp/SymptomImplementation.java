package com.example.modulo3_covid19.service.imp;
import com.example.modulo3_covid19.model.Sintoma;
import com.example.modulo3_covid19.service.ISymptomService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class SymptomImplementation implements ISymptomService {
    private static final List<Sintoma> listSymptom = new ArrayList<>(List.of(
            new Sintoma(1, "Gripe", 2),
            new Sintoma(2, "Febre", 3),
            new Sintoma(3, "Dor no Corpo", 3),
            new Sintoma(4, "Coceira", 2),
            new Sintoma(5, "Falta de Ar", 5),
            new Sintoma(6, "Coriza", 1)
    ));

    @Override
    public Sintoma getSintomaByName(String name) {
        return listSymptom
                .stream()
                .filter(s -> s.getNome().equalsIgnoreCase(name))
                .findFirst().get();
    }
    @Override
    public List<Sintoma> getAllSymption() {
        return SymptomImplementation.listSymptom;
    }


    @Override
    public Sintoma saveSintoma(Sintoma sintoma) {
        listSymptom.add(sintoma);
        return sintoma;
    }
}
