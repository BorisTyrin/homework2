public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        // Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        // Задача 3
        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat =cat -1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        // Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        // Задача 5
        System.out.println("задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // Задача 6
        System.out.println("Задача 6");
        var weightRockyBalboa = 78.2;
        var weightIvanDrago = 82.7;
        var totalWeightOfBoxers = weightRockyBalboa + weightIvanDrago;
        System.out.println("Общий вес боксёров " + totalWeightOfBoxers + " кг");

        // Задача 7
        System.out.println("Задача 7");
        var differenceBetweenWeights = weightIvanDrago - weightRockyBalboa;
        System.out.println("Разница между весами боксёров " + differenceBetweenWeights + " кг" );
        var differenceBetweenWeights2 = weightIvanDrago % weightRockyBalboa;
        System.out.println("Разница между весами боксёров " + differenceBetweenWeights2 + " кг" );

        // Задача 8
        System.out.println("Задача 8");
        var totalWorkingTime = 640;
        var workingTime = 8;
        var staff = totalWorkingTime / workingTime;
        System.out.println("Всего работников в компании " + staff + " человек");
        staff = staff + 94;
        System.out.println(staff);
        var newTotalWorkingTime = staff * workingTime;
        System.out.println("Если в компании работает " + staff + " человека, то всего " + newTotalWorkingTime + " часа работы может быть поделено между сотрудниками");
    }
}