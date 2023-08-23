import java.util.Scanner;

public class Votos {
    private int conteoVotos;
    private int conteoDenegados;

    private int opcion;

    public Votos(){
        Scanner leerOpcion = new Scanner(System.in);
        System.out.println("Ingrese su Voto");
        System.out.println("1. Aprobar");
        System.out.println("2. Denegar");
        opcion = leerOpcion.nextInt();
        if(opcion == 1){
            setConteoVotos(1);
            System.out.println("Votos Aprobado ");
        }else if (opcion == 2) {
            setConteoDenegados(1);
            //System.out.println("Votos Denegado");

        }

    }

    public int getConteoVotos() {
        return conteoVotos;
    }

    public void setConteoVotos(int conteoVotos) {
        this.conteoVotos = conteoVotos;
    }

    public int getConteoDenegados() {
        return conteoDenegados;
    }

    public void setConteoDenegados(int conteoDenegados) {
        this.conteoDenegados = conteoDenegados;
    }
}
