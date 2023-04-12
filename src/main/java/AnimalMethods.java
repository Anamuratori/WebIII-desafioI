import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class AnimalMethods {
    public void carnivorosNaoRepteis(List<Animal> animais) {
        animais.stream()
                .filter(animal -> animal.getAlimentacao().equals("Carnivoro"))
                .filter(animal -> !animal.getClasse().equals("Reptil"))
                .forEach(System.out::println);
    }
    public void carnivorosPorPeso(List<Animal> animais) {
        animais.stream()
                .filter(animal -> animal.getAlimentacao().equals("Carnivoro"))
                .sorted(Comparator.comparing(animal -> animal.getPeso()))
                .forEach(System.out::println);
    }

    public void animalMaisPesado(List<Animal> animais) {
        Optional<Animal> animalOp = animais.stream()
                .max(Comparator.comparing(animal -> animal.getPeso()));
        Animal animalMaisPesado = new Animal().update(animalOp);
        System.out.println(animalMaisPesado);
    }

    public void mamiferoMaisLeve(List<Animal> animais) {
        Optional<Animal> mamiferoOp = animais.stream().filter(animal -> animal.getClasse().equals("Mamifero"))
                .min(Comparator.comparing(animal -> animal.getPeso()));
        Animal mamiferoMaisLeve = new Animal().update(mamiferoOp);
        System.out.println(mamiferoMaisLeve);
    }

    public void carnivorosAcima30(List<Animal> animais, Double peso) {
        animais.stream().filter(animal -> animal.getAlimentacao().equals("Carnivoro"))
                .filter(animal -> animal.getPeso()>peso).forEach(System.out::println);
    }
}
