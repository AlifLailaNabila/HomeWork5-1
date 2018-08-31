package HomeWork5;

public class TestFahimProduct {
    public static void main(String[] args) {
        FahimProduct.getFP();
        FahimProduct FP2=FahimProduct.getFP();
        FahimProduct FP3=FahimProduct.getFP();
        System.out.println(FP2.hashCode());
        System.out.println(FP3.hashCode());

    }

}
