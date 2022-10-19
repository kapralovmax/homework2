public class Main {
    public static void main(String[] args) {
        System.out.println("       задание 1");
          var dog = 8;
          var cat = 3.6;
          var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("       задание 2");
          dog = dog + 4;
          cat = cat + 4;
          paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("       задание 3");
          dog = dog -3;
          cat = cat - 1.6;
          paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("       задание 4");
          var friend = 19;
        System.out.println(friend);
          friend = friend + 2;
        System.out.println(friend);
          friend = friend / 7;
        System.out.println(friend);

        System.out.println("       задание 5");
          var frog = 3.5;
        System.out.println(frog);
          frog = frog * 10;
        System.out.println(frog);
          frog = frog / 3.5;
        System.out.println(frog);
          frog = frog +4;
        System.out.println(frog);

        System.out.println("       задание 6-7");
          var boxerWeight1 = 78.2;
          var boxerWeight2 =  82.7;
          var boxersWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Общий вес боксеров " + boxersWeight + " кг");
          var weightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Разница в весе боксеров " + weightDifference + " кг");
          var DifferenceWeight = boxerWeight2 % boxerWeight1;
          System.out.println( "Разница в весе боксеров " + DifferenceWeight + " кг " + " Используя функцию остаток от деления" );

        System.out.println("       задание 8");
          var openingHours = 640;
          var workingDay = 8;
          var numberPeople = openingHours / workingDay;
        System.out.println("Всего работников в компании " + numberPeople + " человек");
          numberPeople =  numberPeople + 94;
          var numberHours = numberPeople * workingDay;
        System.out.println("Если в компании работает " + numberPeople + " человек, то всего " +numberHours + " часа работы может быть поделено между сотрудниками");












    }
}