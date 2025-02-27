public class BasicPizza implements Pizza {
        @Override
        public String getDescription() {
            return "basic pizza";
        }

        @Override
        public double getCost() {
            return 5.00;
        }

}
