import fruits.Apple;
import fruits.Banana;
import fruits.FruitBox;
import vegetables.Cabbage;
import vegetables.VegetableBox;

public class Main {
    public static void main(String a[]) {
        FruitBox<String, Banana> bananaFruitBox = new FruitBox<>("banana", new Banana());
        bananaFruitBox.getObj().printClass();

        FruitBox<String, Apple> appleFruitBox = new FruitBox<>("apple", new Apple());
        appleFruitBox.getObj().printClass();

        /*fruits.FruitBox<String, Cabbage> cabbageFruitBox = new fruits.FruitBox<>("cabbage", new Cabbage());
         cabbageFruitBox.getObj().printClass();
         коробка вторым параметром принимает наследников Fruit, а пытаются положить овощ*/

        VegetableBox<String, Cabbage> vegetableCabbageBox = new VegetableBox<>("cabbage", new Cabbage());
        vegetableCabbageBox.getObj().printClass();

    }
}
