import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.*;
import java.util.stream.Collectors;

public class AnimalMethodsTest {
    AnimalMethods animalMethods = new AnimalMethods();
    Animal jacare = new Animal("Jacare", "Reptil", "Carnivoro", 300.0);
    Animal cobra = new Animal("Cobra", "Reptil", "Carnivoro", 50.0);
    Animal galinha = new Animal("Galinha", "Ave", "Onivoro", 3.0);
    Animal cachorro = new Animal("Cachorro", "Mamifero", "Carnivoro", 25.0);
    Animal girafa = new Animal("Girafa", "Mamifero", "Herbivoro", 1500.0);
    Animal vaca = new Animal("Vaca", "Mamifero", "Herbivoro", 700.0);
    Animal gaviao = new Animal("Gaviao", "Ave", "Carnivoro", 5.0);

    List<Animal> animais = new ArrayList<>(Arrays.asList(jacare, cobra, galinha, cachorro, girafa, vaca, gaviao));

    @Test
    public void carnivorosNaoRepteisTeste () {
        List<Animal> esperado = new ArrayList<>(Arrays.asList(cachorro, gaviao));

        List<Animal> obtido = animalMethods.carnivorosNaoRepteis(animais);
        Assertions.assertEquals(esperado, obtido);

    }

    @Test
    public void carnivorosPorPesoTeste () {
        List<Animal> esperado = new ArrayList<>(Arrays.asList(gaviao, cachorro, cobra, jacare));

        List<Animal> obtido = animalMethods.carnivorosPorPeso(animais);
        Assertions.assertEquals(esperado, obtido);
    }
    @Test
    public void animalMaisPesadoTeste () {
        Animal esperado = girafa;

        Animal obtido = animalMethods.animalMaisPesado(animais);
        Assertions.assertEquals(esperado, obtido);
    }
    @Test
    public void mamiferoMaisLeveTeste () {
        Animal esperado = cachorro;

        Animal obtido = animalMethods.mamiferoMaisLeve(animais);
        Assertions.assertEquals(esperado, obtido);
    }
    @Test
    public void carnivorosAcimaXTeste() {
        List<Animal> esperado = new ArrayList<>(Arrays.asList(jacare, cobra));

        List<Animal> obtido = animalMethods.carnivorosAcimaX(animais, 30.0);
        Assertions.assertEquals(esperado, obtido);
    }
}
