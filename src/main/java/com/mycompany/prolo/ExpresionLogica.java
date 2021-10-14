/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prolo;

import java.util.Scanner;

/**
 *
 * @author mssyo
 */
public class ExpresionLogica {

    public ExpresionLogica() {
            Scanner leer=new Scanner(System.in);

        System.out.println("La expresion a realizar es [(p->q)^p]->q");
        String expresion=leer.nextLine();
        String a []={"v","v","f","f"};
        String b []={"v","f","v","f"};
        String []c=new String[4];
        //operacion cuando se niega la operacion    
        if (expresion.charAt(0) == '0') {

            System.out.println("(p->q)");
            for (int i = 0; i < a.length; i++) {
                if (a[i].equals("v") && b[i].equals("f")) {
                    c[i] = "f";
                } else {
                    c[i] = "v";
                }
            }

            for (int i = 0; i < c.length; i++) {
                System.out.println("" + c[i]);
            }

            System.out.println("[(p->q)^p]");
            for (int i = 0; i < a.length; i++) {
                if (a[i].equals("v") && c[i].equals("v")) {
                    c[i] = "v";
                } else {
                    c[i] = "f";
                }
            }

            for (int i = 0; i < c.length; i++) {
                System.out.println("" + c[i]);
            }

            System.out.println("[(p->q)^p]->q");
            for (int i = 0; i < b.length; i++) {
                if (b[i].equals("f") && c[i].equals("v")) {
                    c[i] = "v";
                } else {
                    c[i] = "f";
                }
            }

            int d = 0, e = 0;
            for (int i = 0; i < c.length; i++) {
                System.out.println("" + c[i]);
                if (c[i].equals("v")) {
                    d++;
                }
                if (c[i].equals("f")) {
                    e++;
                }
            }
            System.out.println("Es una Contradiccion");

            //operaciones cuando no se niega la expresion 
        } 
        if(expresion.charAt(0) == '1') {

            System.out.println("(p->q)");
            for (int i = 0; i < a.length; i++) {
                if (a[i].equals("v") && b[i].equals("f")) {
                    c[i] = "f";
                } else {
                    c[i] = "v";
                }
            }

            for (int i = 0; i < c.length; i++) {
                System.out.println("" + c[i]);
            }

            System.out.println("[(p->q)^p]");
            for (int i = 0; i < a.length; i++) {
                if (a[i].equals("v") && c[i].equals("v")) {
                    c[i] = "v";
                } else {
                    c[i] = "f";
                }
            }

            for (int i = 0; i < c.length; i++) {
                System.out.println("" + c[i]);
            }

            System.out.println("[(p->q)^p]->q");
            for (int i = 0; i < b.length; i++) {
                if (b[i].equals("f") && c[i].equals("v")) {
                    c[i] = "f";
                } else {
                    c[i] = "v";
                }
            }

            int d = 0, e = 0;
            for (int i = 0; i < c.length; i++) {
                System.out.println("" + c[i]);
                if (c[i].equals("v")) {
                    d++;
                }
                if (c[i].equals("f")) {
                    e++;
                }
            }

            System.out.println("Es una Tautologia");

        }

    }

}
