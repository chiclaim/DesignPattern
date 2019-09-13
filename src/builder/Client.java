package builder;

public class Client {
    public static void main(String[] args) {
        NutritionFacts facts = new NutritionFacts.Builder(240, 8)
                .setCalories(100)
                .setSodium(35)
                .setCarbohydrate(27)
                .build();
    }
}
