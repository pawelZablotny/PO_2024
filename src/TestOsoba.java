import java.util.ArrayList;
import java.util.List;

//class Box<T> {
//    private T objekt;
//
//    public void setObjekt(T objekt) {
//        this.objekt = objekt;
//    }
//
//    public T getObjekt() {
//        return objekt;
//    }
//}
//class Counter<T> {
//    private List<T> elements = new ArrayList<>();
//
//    public void add(T element) {
//        elements.add(element);
//    }
//
//    public int getCount() {
//        return elements.size();
//    }
//}

//class Counter<T>{
//    List<T> lista;
//    public Counter(){
//        lista = new ArrayList<>();
//    }
//    public void add(T objekt) {
//        lista.add(objekt);
//    }
//
//    public int getCount() {
//        return lista.size();
//    }
//}

// Zadanie 21
class Animal {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Dog extends Animal {
}

//Zadanie 23
class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}


public class TestOsoba {

//    public static <T> boolean isEqual(T obj1, T obj2)
//    {
//        return obj1.equals(obj2);
//    }

    // Zadanie 21
    public static <T extends Animal> T findMax(T element1, T element2) {
        return (element1.getAge() > element2.getAge()) ? element1 : element2;
    }

    //Zadanie 23
    public static Dog findMax(Pair<? extends Animal> pair) {
        return ((Dog) pair.getFirst()).getAge() > ((Dog) pair.getSecond()).getAge() ? (Dog) pair.getFirst() : (Dog) pair.getSecond();
    }

    // Zadanie 28
    public static void findMinMaxAge(Dog[] dogs, Pair<? super Dog> result) {

        Dog minDog = dogs[0];
        Dog maxDog = dogs[0];

        for (Dog dog : dogs) {
            if (dog.getAge() < minDog.getAge()) {
                minDog = dog;
            }
            if (dog.getAge() > maxDog.getAge()) {
                maxDog = dog;
            }
        }

        result.setFirst(minDog);
        result.setSecond(maxDog);
    }

    public static void main(String[] args) {
//        Box<String> box1 = new Box<>();
//        Box<Integer> box2 = new Box<>();
//        Box<Double> box3 = new Box<>();
//
//        box1.setObjekt("słowo");
//        System.out.println(box1.getObjekt());
//
//        box2.setObjekt(10);
//        System.out.println(box2.getObjekt());
//
//        box3.setObjekt(3.);
//        System.out.println(box3.getObjekt());
//
//        System.out.println(isEqual(box1.getObjekt(), box2.getObjekt()));
//
//        Counter<String> stringCounter = new Counter<>();
//        stringCounter.add(box1.getObjekt());
//        stringCounter.add("slow2");
//        stringCounter.add("slow3");
//        System.out.println(stringCounter.getCount());

        //Zadanie 21
        System.out.println("+= ZADANIE 21 =+");
        Dog dog1 = new Dog();
        dog1.setAge(7);
        Dog dog2 = new Dog();
        dog2.setAge(12);
        System.out.println("Starszy pies ma " + findMax(dog1, dog2).getAge() + " lata.");


        //Zadanie 23
//        System.out.println();
//        System.out.println("+= ZADANIE 23 =+");
//        Pair<Dog> dogPair = new Pair<>(dog1, dog2);
//        System.out.println("Starszy pies w parze ma " + findMax(dogPair).getAge() + " lata.");

        //Zadanie 28
        System.out.println();
        System.out.println("+= ZADANIE 28 =+");
        Dog[] dogs = {
                new Dog() {{ setAge(7); }},
                new Dog() {{ setAge(9); }},
                new Dog() {{ setAge(2); }},
                new Dog() {{ setAge(10); }},
                new Dog() {{ setAge(8); }}
        };
        Pair<Dog> result = new Pair<>(null, null);
        findMinMaxAge(dogs, result);
        System.out.println("Najmłodszy pies ma " + result.getFirst().getAge() + " lata.");
        System.out.println("Najstarszy pies ma " + result.getSecond().getAge() + " lata.");

    }
}