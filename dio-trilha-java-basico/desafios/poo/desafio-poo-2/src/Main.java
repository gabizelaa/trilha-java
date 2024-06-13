import com.br.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição curso Javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria de Java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devGabi = new Dev();
        devGabi.setNome("Gabriela");
        devGabi.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gabi: " + devGabi.getConteudosInscritos());

        devGabi.progredir();
        devGabi.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Gabi: " + devGabi.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Gabi: " + devGabi.getConteudosConcluidos());
        System.out.println("XP: " + devGabi.calcularTotalXp());

        System.out.println("-------");

        Dev devLucas = new Dev();
        devLucas.setNome("João");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Lucas: " + devLucas.getConteudosInscritos());

        devLucas.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Lucas: " + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Lucas: " + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularTotalXp());
    }
}