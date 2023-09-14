import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class Stack {

    ArrayList< String> stackArray = new ArrayList< String>();
    public static void main(String [] args)
    {
        menu();
    }

    public static  void menu()
    {
        Scanner clavier = new Scanner(System.in);
        System.out.println("faites un choix 1-ajouter un element -2 retire le dernier element - 3 voir l'etat de a stack -4 quitter");
        int choice  = clavier.nextInt();
        Stack s = new Stack();
        do {
            switch (choice)
            {
                case 1:
                    s.push();
                    break;
                case 2 :
                    s.pop();
                    break;
                case 3:
                    s.seeAllElement();
                case 4:
                    System.out.println("exit...");
                    break;
            }
        }while(choice!=4);



    }
    public void push()
    {
        Scanner clavier = new Scanner(System.in);
        System.out.println("ajouter un nouvel element ?");
        String newElement  =clavier.nextLine();
        stackArray.add(newElement);
        menu();
    }

    private  void pop()
    {
        int index = tchekSize();
        if (index!=0)
        {
            stackArray.remove(index-1);
        }else
        {
            System.out.println("la stack est vide");
        }

        menu();
    }

    private  boolean tchekEmpty()
    {
        int index = stackArray.size();
        boolean result=false ;
        if (index == 0)
        {
            result = true;
        }
        return result;
    }

    private int tchekSize()
    {
        int index = stackArray.size();
        return index;

    }

    private void seeAllElement()
    {


        if (tchekSize()!=0)
        {
              for (int i= 0;i<stackArray.size();i++)
              {
                 System.out.println(i);
              }
        }else
        {
            System.out.println("Aucun element dans la stack");
        }

        menu();
    }
}
