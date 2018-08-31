package HomeWork5;

public class FahimProduct {
    private static FahimProduct FP = new FahimProduct();

    public static FahimProduct getFP()
    {
        System.out.println("This is a product of fahim's corporation");
        return FP;
    }

    private FahimProduct() {
    }
}
