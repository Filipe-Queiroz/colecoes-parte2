import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Filipe", "Masculino"));
        pessoas.add(new Pessoa("Beatriz", "Feminino"));
        pessoas.add(new Pessoa("Arthur", "Masculino"));
        pessoas.add(new Pessoa("Bruna", "Feminino"));
        pessoas.add(new Pessoa("Bartolomeu", "Masculino"));
        pessoas.add(new Pessoa("Julia", "Feminino"));
        pessoas.add(new Pessoa("Leon", "Masculino"));
        pessoas.add(new Pessoa("Melissa", "Feminino"));
        pessoas.add(new Pessoa("Raimundo", "Masculino"));
        pessoas.add(new Pessoa("Mariana", "Feminino"));

        pessoas.sort((p1, p2) -> p1.getSexo().compareTo(p2.getSexo()));

        System.out.println("Sexo Feminino:");
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getSexo().equalsIgnoreCase("Feminino")) {
                System.out.println(pessoa);
            }
        }

        System.out.println("\nSexo Masculino:");
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getSexo().equalsIgnoreCase("Masculino")) {
                System.out.println(pessoa);
            }
        }
    }
}
