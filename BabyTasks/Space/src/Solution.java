public class Solution {

    public static void main(String[] args) {

        SolarSystem info = new SolarSystem();
        System.out.println("Человечество живет в Солнечной системе.");
        System.out.println("Ее возраст около "+ info.age +" лет.");
        System.out.println("В Солнечной системе "+ info.planetsCount +" известных планет.");
        System.out.println("Как и большинство звездных систем, состоит из "+ info.starsCount +" звезды.");
        System.out.println("Звезды по имени "+ info.starName +".");
        System.out.println("Расстояние к центру галактики составляет "+ info.galacticCenterDistance +" световых лет.");
        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");

    }
}
