import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnimalMethods animalMethods = new AnimalMethods();

        Animal jacare = new Animal("Jacare", "Reptil", "Carnivoro", 300.0);
        Animal cobra = new Animal("Cobra", "Reptil", "Carnivoro", 50.0);
        Animal galinha = new Animal("Galinha", "Ave", "Onivoro", 3.0);
        Animal cachorro = new Animal("Cachorro", "Mamifero", "Carnivoro", 25.0);
        Animal girafa = new Animal("Girafa", "Mamifero", "Herbivoro", 1500.0);
        Animal vaca = new Animal("Vaca", "Mamifero", "Herbivoro", 700.0);
        Animal gaviao = new Animal("Gaviao", "Ave", "Carnivoro", 5.0);

        List<Animal> animais = new ArrayList<>(Arrays.asList(jacare, cobra, galinha, cachorro, girafa, vaca, gaviao));


        System.out.println("\nLista de animais:");
        animais.stream().forEach(System.out::println);

        System.out.println("\nExiba os animais carnivoros e nao repteis:");
        animalMethods.carnivorosNaoRepteis(animais);

        System.out.println("\nExiba os animais carnivoros do menor para o maior peso:");
        animalMethods.carnivorosPorPeso(animais);

        System.out.println("\nExiba o animal mais pesado:");
        animalMethods.animalMaisPesado(animais);

        System.out.println("\nExiba o mamifero mais leve:");
        animalMethods.mamiferoMaisLeve(animais);

        System.out.println("\nExiba os animais carnivoros acima de 30kg:");
        animalMethods.carnivorosAcima30(animais, 30.0);
    }
}