package DesignPatterns.Creational.Prototype;

public class Runner {

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
        System.out.println("id : " + clonedShape1.getId());
        System.out.println("hashcode 1 " + clonedShape1.hashCode());
        System.out.println("Shape : " + clonedShape1.getType());


        Shape clonedShape2 = (Shape) ShapeCache.getShape("1");
        System.out.println("id : " + clonedShape1.getId());
        System.out.println("hashcode 2 " + clonedShape2.hashCode());
        System.out.println("Shape : " + clonedShape2.getType());

        Shape clonedShape3 = (Shape) ShapeCache.getShape("1");
        System.out.println("id : " + clonedShape1.getId());
        System.out.println("hashcode 3 " + clonedShape3.hashCode());
        System.out.println("Shape : " + clonedShape3.getType());


     /*   Shape clonedShape3 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape 1 : " + clonedShape3.getType());
        System.out.println("hashcode 1: " + clonedShape3.hashCode());



        Shape clonedShape4 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape 2: " + clonedShape4.getType());
        System.out.println("hashcode 2: " + clonedShape4.hashCode());*/

    }
}
