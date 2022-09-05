//Objeto retardado
//Programação procedural

class apanhando{
    public static void main(String args[]){
        System.out.println("Socorro, estou apanhando pelo JAVA CAFEÍNA");

        System.out.println("Lascou");
        }
}

/*TELEVISÃO
ATRIBUTOS / Caracterísitcas
    Resolução
    Tamanho
    Tensão
    Modelo
    Material
    Frequência
    
MÉTODOS / Ações
    Ligar
    Desligar
    Aumentar volume
    Diminuir volume
    Trocar canal
    Conectar lan
    Acessar Internet
    Gravar
    Exibit Imagem

    */

class ProjectCar{
    public static void main(String args[]){
        System.out.println("Eu sou um carro!\nVRRRRRRRRRRRUMMMMMMMMM VRRRRRRRRRRRRUUUUUUUMMMMMMMMMMMMMMMMMM VRRRRRRRRRRRRRRRRUUUUUUUUUUMMMMMMMMMMMMMMM VRRRRRRRRRRRUUUUUUUUMMMMMMMM");
    }
}

// class talocoin{
//     public static void main(String[] args){
//         Scanner scan = new Scanner(System.in);
//         System.out.println("Qual é seu nome?");
//         String name = scan.next();
//         System.out.println("Heloo World!" +name);
//     }
// }

class CADEVOCE{
    private int gasorina = 0;

    public int abastecer(int number){
        return gasorina += number;
    }

    public int consumir(int number){
        return gasorina -= number;
    }

    public void zerar(){
        gasorina = 0;
    }

    public void printar(){
        System.out.println(gasorina);
    }
}