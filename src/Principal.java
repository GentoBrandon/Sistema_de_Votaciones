import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        Diputado Diputado1 = new Diputado("Mariano Gento", 1200, "Vamos");
        System.out.println(Diputado1);

        Ley Salud = new Ley("Aumento Salarial 2023", "8-2022", new Date());
        System.out.println(Salud);


        Votos voto1 = new Votos();
        System.out.println(Salud.getNombre());
        System.out.println("Aprobados: ");
        System.out.println(voto1.getConteoVotos());
        System.out.println("Denegados: ");
        System.out.println(voto1.getConteoDenegados());
    }
}
