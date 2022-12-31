import java.util.Scanner;

public class Cuscuz {
    No first;
    No last;
    int size;

    Cuscuz() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public class No {
        int numero;
        char naipe;
        No prox;

        public No(int num, char nai){
            this.numero = num;
            this.naipe = nai;
            this.prox = null;
        }
    }

    public void enQueue(String carta) {
        int num = Character.getNumericValue(carta.charAt(0));
        // System.out.println(num);
        No novoNo = new No(num, carta.charAt(1));
        
        if (last == null) {     
            last = novoNo;
        }else{
            last.prox = novoNo; //nesse caso esse nó é o futuro penultimo. O ponteiro next DO FUTURO PENULTIMO recebe novoNo
            last = novoNo;      //atualizando o ultimo nó com o novoNo
        }

        if (first == null) {
            first = novoNo;
        }
        size += 1;
    }

    public void printQueue(){
        No aux = first;
        // char num = aux.numero;
        String result = "";
        // System.out.println(numAux);
        // String pt = aux.naipe;
        int n = aux.numero;
        // System.out.println(n);
        result = result.concat(String.valueOf(aux.numero)).concat(Character.toString(aux.naipe)).concat(" ");

        // System.out.println(result);
        while(aux != null){
            result += (int)aux.numero + aux.naipe + " ";
            aux = aux.prox;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int numPlayers = in.nextInt();
        Cuscuz c = new Cuscuz();
        String op = in.nextLine();
        String[] o = op.split(" "); 

        if(o[0].equals("DEA")){
            int i = 1;
            c.enQueue(o[1]);
            c.printQueue();
            // while(o[i] != null){
            //     c.enQueue(o[i]);
            //     i++;
            // }            
        }

        // c.enQueue(20);
        // c.enQueue(30);
        // c.enQueue(10);
        // c.enQueue(0);
        // c.printQueue();
    }
}

// 7E 5C 5C 5P 3P 1E 1E 1P 9O 9C 5E 7C
// 7E 2O 3E 9C 5P 9C 2O 1C 4O 8E 5P 8C 7C 7O 7O
// 7E 5C 5C 5P 3P 1E 1E 1P 9O 9C 5E 7C 4E 2O 3P 1C
// 7E 5C 5C 5P 3P 1E 1E 1P 9O 9C 5E 7C 4E 2O 3P 1C 3O 4O 1O 1O
// 7E 2O 3E 9C 5P 9C 2O 1C 4O 8E 5P 8C 7C 7O 7O 7E 5E 4E 1E 3O 9P 7E 5C 5C 5E 6E
// 1E 1C 2P 3O 7C

// 2
// DEA 7E 7E
// DEA 2O 5C
// DEA 3E 5C
// DEA 9C 5P
// DEA 5P 3P
// DEA 9C 1E
// DEA 2O 1E
// DEA 1C 1P
// DEA 4O 9O
// DEA 8E 9C
// DEA 5P 5E
// DEA 8C 7C
// PRT 1
// DEA 7C 4E
// DEA 7O 2O
// DEA 7O 3P
// PRT 0
// DEA 7E 1C
// PRT 1
// DEA 5E 3O
// DEA 4E 4O
// DEA 1E 1O
// DEA 3O 1O
// PRT 1
// DEA 9P 1C
// DEA 7E 9E
// DEA 5C 5C
// DEA 5C 6P
// DEA 5E 6E
// DEA 6E 8P
// DEA 1E 1O
// DEA 1C 4P
// DEA 2P 2O
// DEA 3O 5O
// DEA 7C 5C
// PRT 0
// DEA 6C 3O
// PRT 1
// DEA 9C 6O
// DEA 4P 8P
// PRT 0
// DEA 2E 4E
// DEA 3C 5C
// DEA 1O 5E
// DEA 1P 8O
// DEA 4E 7P
// PRT 0
// PRT 0
// DEA 9P 6O
// DEA 7E 5P
// PRT 0
// DEA 4O 8P
// DEA 4C 9O
// PRT 0
// DEA 1O 7C
// DEA 4E 2E
// DEA 6E 7E
// DEA 4O 2O
// DEA 2P 4C
// DEA 9C 2O
// DEA 5P 8C
// DEA 9E 1O
// PRT 0
// DEA 6P 8C
// DEA 3E 9C
// DEA 4E 1E
// DEA 1C 5P
// DEA 2P 8C
// DEA 7C 1O
// PRT 1
// PRT 0
// DEA 7C 4E
// DEA 2P 1P
// PRT 1
// DEA 5P 8O
// DEA 4P 8C
// DEA 2P 8P
// DEA 3P 3O
// DEA 3C 1P
// DEA 2C 4O
// DEA 1C 8C
// DEA 7O 6E
// DEA 1P 6P
// DEA 9C 5O
// DEA 6E 6P
// DEA 5E 9C
// DEA 9P 9O
// PRT 0
// DEA 8P 5P
// PRT 1
// DEA 5P 4O
// PRT 0
// DEA 3O 9P
// DEA 3O 4O
// DEA 7O 6P
// DEA 5C 3C
// DEA 3C 4P
// PRT 1
// END
