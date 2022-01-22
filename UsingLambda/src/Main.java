import java.util.function.*;

public class Main {

    public static void main(String[] args) {
/*

       Lambda kullanabilmemiz için Funcitonal Interface olması gerekiyor.
       1. adım parametre parantezini kopyala
       * 2. adım bir ok çiz
       * hangi işi yapmasını istiyorsan onu ekle
       *

        Supplier<String> supplier=() -> "Hello";

        String string=supplier.get();
        System.out.println("String= "+string);

        //supplier
        Supplier<Integer> supplier = () -> {
            System.out.println("Hello I am inside supplier.");
            return 4;
        };

        int integer = supplier.get();
        System.out.println("integer= " + integer);

        //consumer
        Consumer<String> stringConsumer =
                (String s) -> {
                    System.out.println(s);
                    System.out.println("I am inside consumer");
                };
        stringConsumer.accept("Mert");

        //runnable
        Runnable runnable=
                () -> System.out.println("Hello");
        runnable.run();


        //örnek
        IntSupplier supplier = () -> 10;
        int i=supplier.getAsInt();
        System.out.println("i : "+ i);

        DoubleToIntFunction doubleToIntFunction=(double value) -> (int)Math.floor(value);
        int pi=doubleToIntFunction.applyAsInt(Math.PI);
        System.out.println("PI : "+pi);


        //bu örnekte ise c1 ve c2 oluşturuluyor ve c3 ile zinciri tamamlamış oluyoruz
        //c3 önce c1 sonra c2 yi calistiriyor
        Consumer<String> c1 = s -> System.out.println("C1 consumer : " + s);
        Consumer<String> c2 = s -> System.out.println("C2 consumer : " + s);

        Consumer<String> c3 = c1.andThen(c2);
        c3.accept("Mert");


        //predicate
        Predicate<String> isNull=s -> s==null;
        System.out.println("For null " +isNull.test(null));
        System.out.println("For hello " +isNull.test("Hello"));

        Predicate<String> isEmpty=s -> s.isEmpty();
        System.out.println("For empty " +isEmpty.test(""));
        System.out.println("For hello " +isNull.test("Hello"));*/


    }
}
