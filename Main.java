public class Main {
    public static void main(String[] args) {
        System.out.println("===========Hello, Java=======");
        System.out.println("num="+foo());
        System.out.println("num="+foo());
    }
    public static Supplier<Integer> foo(){
        final int num = 0; // must use final 
        return new Supplier<Integer>() {
            @Override
            public Integer get() {
                return num;
            }
        };
    }
    public interface Supplier<T> {
        T get();
    }
}
