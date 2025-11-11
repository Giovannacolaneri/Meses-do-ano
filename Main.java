
// Declaração do Enum "Mes"
// Cada constante representa um mês do ano.
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

// Classe principal
public class Main {
    public static void main(String[] args) {
        
        // Criação de uma variável do tipo Mes e atribuição de um valor específico
        Mes mesAtual = Mes.NOVEMBRO;

        // Exibe o mês atual
        System.out.println("Mês atual: " + mesAtual);

        // Estrutura condicional para identificar a estação do ano
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

        // Exibe todos os meses definidos no Enum
        System.out.println("\nLista completa de meses do ano:");
        for (Mes m : Mes.values()) {
            System.out.println("- " + m);
        }
    }
}
