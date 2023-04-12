import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Animal {
    private String nome;
    private String classe;
    private String alimentacao;
    private Double peso;

    public Animal() {
    }

    public Animal(String nome, String classe, String reproducao, Double peso) {
        this.nome = nome;
        this.classe = classe;
        this.alimentacao = reproducao;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public Animal update (Optional<Animal> animalOP) {
        Animal animal = animalOP.get();
        return animal;
    }


    @Override
    public String toString() {
        return nome + " - Classe: "
                + classe
                + ", Tipo de reproducao: "
                + alimentacao
                + ", Peso médio: "
                + peso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(nome, animal.nome) && Objects.equals(classe, animal.classe) && Objects.equals(alimentacao, animal.alimentacao) && Objects.equals(peso, animal.peso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, classe, alimentacao, peso);
    }
}
