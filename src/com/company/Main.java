package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        Dictionar dictionar = new Dictionar();
        char alege;

        Cuvant unCuvant;

        while (true) {

            System.out.println("Alege una dintre optiuniile:\n1.Adauga un cuvant\n2.Sterge cuvant\n3.Gaseste cuvant\n4.Vezi MapLista");
            alege = sc.next().charAt(0);

            sc.nextLine();
            switch (alege) {
                case '1':
                    System.out.println("Ce cuvant vrei sa introduci?");
                    String cuvant = sc.nextLine();

                    System.out.println("Introdu traducerea: ");
                    String traducere = sc.nextLine();

                    System.out.println("Introdu antonimul: ");
                    String antonim = sc.nextLine();

                    boolean succes = dictionar.adaugaInLista(cuvant, traducere, antonim);

                    if(!succes)
                        System.out.println("Cuvantul exista deja!");
                    else
                        System.out.println("Cuvantul a fost adaugat!");

                    break;

                case '2':
                    System.out.println("Ce cuvant vrei sa stergi?");
                    cuvant = sc.nextLine();

                    succes = dictionar.stergeDinLista(cuvant);

                    if(!succes)
                        System.out.println("Cuvantul nu exista in lista");
                    else
                        System.out.println("Cuvantul a fost sters");
                    break;

                case '3':
                    System.out.println("Ce cuvant vrei sa cauti?");
                    cuvant = sc.nextLine();

                    unCuvant = dictionar.gasesteCuvant(cuvant);

                    if(unCuvant == null)
                        System.out.println("Nu am gasit cuvantul");

                    else
                        System.out.println(unCuvant);
                    break;

                case '4':
                    System.out.println("Map lista este : \n" + dictionar.mapCuvinte);
                    break;


                default:
                    System.out.println("Nu ai introdus corect!");

            }

            System.out.println("Marimea listei este " + dictionar.mapCuvinte.size());

            System.out.println("Mai vrei sa faci alta metoda? da/nu");
            String cauta = sc.nextLine();
            if(cauta.equals("nu"))
                break;
        }

    }
}
