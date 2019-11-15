package com.company;

import com.company.Aone;
import com.company.Bone;

class ExampleOne {
    public static void start(){
        Aone superOb = new Aone();
        Bone subOb = new Bone();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое объекта superOb: ");
        superOb.showij();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("Содержимое объекта subOb: ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("Сумма i, j и k в объкте subOb: ");
        subOb.sum();

    }
}
