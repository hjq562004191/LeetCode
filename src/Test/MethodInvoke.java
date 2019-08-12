package Test;

import java.lang.reflect.Method;

public class MethodInvoke {

        public static void main(String[] args) throws Exception {
            Method animalMethod = Animal.class.getDeclaredMethod("print");
            Method catMethod = Cat.class.getDeclaredMethod("print");

            Animal animal = new Animal();
            Cat cat = new Cat();
            animalMethod.invoke(cat);
            animalMethod.invoke(animal);

            catMethod.invoke(cat);
            catMethod.invoke(animal);
        }

    }

    class Animal {

        public void print() {
            System.out.println("Animal.print()");
        }

    }

    class Cat extends Animal {

        @Override
        public void print() {
            System.out.println("Cat.print()");
        }

    }
