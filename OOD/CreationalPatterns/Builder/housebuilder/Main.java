package OOD.CreationalPatterns.Builder.housebuilder;

public class Main {
        
    public static void main(String[] args) {
        House house = new House.HouseBuilder("Concrete", "Wooden", "Tile")
                .setHasGarden(true)
                .setHasSwimmingPool(true)
                .setHasGarage(false)
                .build();

        System.out.println(house);
    }

}
