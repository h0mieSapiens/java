import java.util.Scanner;//importamos el escaner
public class Game{

    public static void main(String args[])
    {

        Character mario= new Character( "(M)", 100, 30, 20);
        //aqui estoy dandole las caracteristicas al personaje
        Character toad= new Character("(T)",200,50,50);
        Scanner sc=new Scanner(System.in);
        Scanner sc1= new Scanner(System.in);
        
        System.out.println("Select 1 for Mario or 2 for toad");
        System.out.println("select an option:");
        int op=sc.nextInt();

      
       switch(op){
        case 1:
        mario.printing();
        system.out.println("attack times:")
        int x=sc1.nextInt();
        for(int 1=0;1<x)
        break;

        case 2:
        toad.printing();
        system.out.println("attack times:")
        int x=sc1.nextInt();
        for(int 1=0;1<x)
        break:




       }


    }




}