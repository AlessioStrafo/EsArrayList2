//Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con 12 elementi e stamparlo in console.
//Mettere in ordine la collezione e stampare il risultato

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student studente1 = new Student("Mario", 20);
        Student studente2 = new Student("Marta", 21);
        Student studente3 = new Student("Romina", 22);
        Student studente4 = new Student("Pietro", 26);
        Student studente5 = new Student("Maria", 25);
        Student studente6 = new Student("Marco", 18);
        Student studente7 = new Student("Denny", 19);
        Student studente8 = new Student("Giovanni", 24);
        Student studente9 = new Student("alessio", 32);
        Student studente10 = new Student("Ilenia", 29);
        Student studente11 = new Student("Samu", 31);
        Student studente12 = new Student("Francesco", 24);

        List<Student> studente = Arrays.asList(studente1, studente2, studente3, studente4, studente5,
                studente6, studente7, studente8, studente9, studente10, studente11, studente12);
        System.out.println(studente);
        studente.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.nome.compareToIgnoreCase(o2.nome);
            }
        });
        System.out.println(studente);
//        studente.sort(Comparator.comparing(Student :: getNome,String.CASE_INSENSITIVE_ORDER));
//        System.out.println(studente);
    }
}