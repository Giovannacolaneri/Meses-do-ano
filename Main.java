enum Mes {
    JANEIRO,
    FEVEREIRO,
    MARCO,
    ABRIL,
    MAIO,
    JUNHO,
    JULHO,
    AGOSTO,
    SETEMBRO,
    OUTUBRO,
    NOVEMBRO,
    DEZEMBRO
}

public class Main {
    public static void main(String[] args) {
        Mes mesAtual = Mes.NOVEMBRO;

        System.out.println("Mês atual: " + mesAtual);

        switch (mesAtual) {
            case DEZEMBRO:
            case JANEIRO:
            case FEVEREIRO:
                System.out.println("Estamos no verão!");
                break;
            case MARCO:
            case ABRIL:
            case MAIO:
                System.out.println("Estamos no outono!");
                break;
            case JUNHO:
            case JULHO:
            case AGOSTO:
                System.out.println("Estamos no inverno!");
                break;
            case SETEMBRO:
            case OUTUBRO:
            case NOVEMBRO:
                System.out.println("Estamos na primavera!");
                break;
        }

        System.out.println("\nLista completa de meses do ano:");
        for (Mes m : Mes.values()) {
            System.out.println("- " + m);
        }
    }
}
