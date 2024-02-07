import java.util.Comparator;

public class Student {
    public String nome;
    public int eta;

    public Student(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public int getEta() {
        return eta;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }

}
