import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AnimalMethods {
    public List<Animal> carnivorosNaoRepteis(List<Animal> animais) {
        return animais.stream()
                .filter(animal -> animal.getAlimentacao().equals("Carnivoro"))
                .filter(animal -> !animal.getClasse().equals("Reptil"))
                .collect(Collectors.toList());
    }
    public List<Animal> carnivorosPorPeso(List<Animal> animais) {
        return animais.stream()
                .filter(animal -> animal.getAlimentacao().equals("Carnivoro"))
                .sorted(Comparator.comparing(animal -> animal.getPeso()))
                .collect(Collectors.toList());
    }

    public Animal animalMaisPesado(List<Animal> animais) {
        Optional<Animal> animalOp = animais.stream()
                .max(Comparator.comparing(animal -> animal.getPeso()));
        Animal animalMaisPesado = new Animal().update(animalOp);
        return animalMaisPesado;
    }

    public Animal mamiferoMaisLeve(List<Animal> animais) {
        Optional<Animal> mamiferoOp = animais.stream().filter(animal -> animal.getClasse().equals("Mamifero"))
                .min(Comparator.comparing(animal -> animal.getPeso()));
        Animal mamiferoMaisLeve = new Animal().update(mamiferoOp);
        return mamiferoMaisLeve;
    }

    public List<Animal> carnivorosAcimaX(List<Animal> animais, Double peso) {
        return animais.stream().filter(animal -> animal.getAlimentacao().equals("Carnivoro"))
                .filter(animal -> animal.getPeso()>peso).collect(Collectors.toList());
    }
}
