package Homework8.Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainEx2 {
    public static void main(String[] args) {

        List<Model> modelsForA = new ArrayList<>();
        modelsForA.add(new Model("Ряд операций сведения, такие как min, max, reduce, возвращают объект" +
                " Optional<T>. Этот объект фактически обертывает результат операции. После выполнения операции" +
                " с помощью метода get() объекта Optional мы можем получить его значение:"));
        List<Model> modelsForB = new ArrayList<>();
        modelsForB.add(new Model("В этом случае программа выдаст исключение java.util.NoSuchElementException. " +
                "Что мы можем сделать, чтобы избежать выброса исключения? Для этого класс Optional предоставляет " +
                "ряд методов."));
        B b = new B(modelsForB);
        final A a = new A(modelsForA, b);

        final List<String> collected = Stream.concat(
                Stream.of(a)
                        .flatMap(item -> Stream.of(item.b))
                        .flatMap(itemB -> itemB.models.stream())
                        .map(model -> model.field),
                Stream.of(a)
                        .flatMap(itemA -> itemA.models.stream())
                        .map(model -> model.field))
                .collect(Collectors.toList());

        collected.forEach(System.out::println);

    }

    private static void perspectiveMethod() {
        List<Model> modelsForA = new ArrayList<>();
        modelsForA.add(new Model("for a"));

        List<Model> modelsForB = new ArrayList<>();
        modelsForB.add(new Model("for b"));

        B b = new B(modelsForB);
        final A a = new A(modelsForA, b);

        List<String> collected = Stream.of(a)
                .flatMap(item -> Stream.of(item.b))
                .flatMap(itemB -> itemB.models.stream())
                .map(model -> model.field)
                .collect(Collectors.toList());

        collected.forEach(System.out::println);
    }

    private static void someMethod() {
        List<A> models = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            List<Model> modelsForA = new Model().getModels("List A: ", i);
            List<Model> modelsForB = new Model().getModels("List B: ", i);
            B b = new B(modelsForB);
            A a = new A(modelsForA, b);
        }
    }

}





