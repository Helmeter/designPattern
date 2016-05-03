package builder.defalutDemo;

public class ProductA implements Product {

    public void Build() {
        String clsName = this.getClass().getName();
        System.out.println(clsName + " build...");
    }
}
