package client;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class completableFutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Before create--" + Thread.currentThread());
        CompletableFuture<Integer> future = create();
        System.out.println("After create--" + Thread.currentThread());
        //sleep(1000);
        future.thenAccept(data -> System.out.println(data + "--" + Thread.currentThread())).thenRun (() -> System.out.println("Completed--" + Thread.currentThread()));
        //sleep(1000);
        //System.out.println(future.getNow(0));
        System.out.println("after accept--" + Thread.currentThread());
        future.join();
        //sleep(1000);
        // Functional interface example     Stream
        // Supplier<T>  T get()             - factories
        // Predicate<T> boolean test(T)     - filter
        // Function<T, R> R apply(T)        - map
        // consumer<T> void accept(T)       - forEach



        CompletableFuture<Integer> f = new CompletableFuture<>();

        f.thenApply(data -> data * 10)
         .thenApply(data -> data -10)
         .thenAccept(d -> System.out.println(d));
        System.out.println("created pipeline");

        f.complete(20);

    }

    static CompletableFuture<Integer> create() {
        return CompletableFuture.supplyAsync(() -> compute());
    }

    private static int compute() {
        sleep(1000);
        System.out.println("Inside compute--" + Thread.currentThread());
        return 2;
    }

    private static boolean sleep(int ms) {
        try {
            Thread.sleep(ms);
            return true;
        } catch (InterruptedException e) {
            return false;
        }
    }
}
