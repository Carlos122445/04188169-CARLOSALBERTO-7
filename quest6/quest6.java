class Professor {
    String nome;
    Professor(String nome) {
        this.nome = nome;
    }
}

class Turma {
    int codigo;
    Professor professor;

    void setProfessor(Professor p) {
        this.professor = p;
    }

    void resumo() {
        System.out.println("Turma: " + codigo + " | Professor: " + professor.nome);
    }
}

public class quest6 {
    public static void main(String[] args) {
        Professor p1 = new Professor("Carlos");
        Turma t1 = new Turma();
        t1.codigo = 101;
        t1.setProfessor(p1);
        t1.resumo();
    }
}
