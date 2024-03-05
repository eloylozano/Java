package Ejercicio01;

public class Encuesta {
    private String Pregunta;
    private String OpcionA;
    private String OpcionB;
    private int VotosA;
    private int VotosB;

    public Encuesta(String pregunta, String opcionA, String opcionB, int votosA, int votosB) {
        Pregunta = pregunta;
        OpcionA = opcionA;
        OpcionB = opcionB;
        VotosA = votosA;
        VotosB = votosB;
    }

    public int incA() {
        return VotosA++;
    }

    public int incB() {
        return VotosB++;
    }

    public void total_Votos() {
        int totalVotos = VotosA + VotosB;
        if (VotosA == 0) {
            System.out.println("\nEl resultado de votos es: ");
            System.out.println(" · Votos A: 0%");
            System.out.println(" · Votos B: 100%");
        } else if (VotosB == 0) {
            System.out.println("\nEl resultado de votos es: ");
            System.out.println(" · Votos A: 100%");
            System.out.println(" · Votos B: 0%");
        } else {
            System.out.println("\nEl resultado de votos es: ");
            System.out.println(" · Votos A: " + Math.round((double)VotosA / totalVotos * 100) + "%. Con un tota de: "+ VotosA + " votos.");
            System.out.println(" · Votos B: " + Math.round((double)VotosB / totalVotos * 100) + "%. Con un tota de: "+ VotosB + " votos.");
        }
    }

}
