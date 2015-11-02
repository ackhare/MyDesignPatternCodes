//package Builder.BuilderSample;
//
///**
// * Created by chetan on 26/9/15.
// */
//
///*
//First, we have the concept of a meal builder, that puts together the parts : main, drink and dessert.
// The Meal is the composite product that holds all the relevant parts.
// */
//public abstract class MealBuilder {
//    protected Meal meal = new Meal();
//    public abstract void buildDrink();
//    public abstract void buildMain();
//    public abstract void buildDessert();
//    public abstract Meal getMeal();
//}
////Next we create two specific builders, one for kids, one for adults:
//public class KidsMealBuilder extends MealBuilder {
//    public void buildDrink() {
//        // add drinks to the meal
//    }
//    public void buildMain() {
//        // add main part of the meal
//    }
//    public void buildDessert() {
//        // add dessert part to the meal
//    }
//    public Meal getMeal() {return meal;}
//}
//public class AdultMealBuilder extends MealBuilder {
//    public void buildDrink(){
//        // add drinks to the meal
//    }
//    public void buildMain(){
//        // add main part of the meal
//    }
//    public void buildDessert(){
//        // add dessert part to the meal
//    }
//    public Meal getMeal(){return meal;}
//}
////In order to kick off the build process, we have a director:
//// Director
//public class MealDirector {
//    public Meal createMeal(MealBuilder builder) {
//        builder.buildDrink();
//        builder.buildMain();
//        builder.buildDessert();
//        return builder.getMeal();
//    }
//}
////And finally we have a client to run all of this:
//// Integration with overall application
//public class Main {
//    public static void main(String[] args) {
//        MealDirector director = new MealDirector();
//        MealBuilder builder = null;
//        if (isKid) {
//            builder = new KidsMealBuilder();
//        }
//        else{
//            builder = new AdultMealBuilder();
//        }
//        Meal meal = director.createMeal(mealBuilder);
//    }
//}
//
