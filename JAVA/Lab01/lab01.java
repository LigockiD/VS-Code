import r03.r03_02.*;

public class lab01 {
    public static void main(String args[]){
        Employee[] people = new Employee[5];
        people[0] = new Employee("Marek", 3200);
        people[1] = new Employee("Andrzej", 3500);
        people[2] = new Employee("Jerzy", 3100);
        people[3] = new Employee("Konrad", 4400);
        people[4] = new Employee("Bartosz", 5000); 
        double averageSalary = average(people);
        System.out.println("Średnie zarobki pracownikow to: " + averageSalary);
        Measurable maxSalaryName = largest(people);
        System.out.println("Najwiecej zarabia: " + maxSalaryName.getMeasureName() + 
        " (" + maxSalaryName.getMeasure() +")");

        /*Zadanie3

        Typ nadrzedny dla String to: Object
        Typ nadrzedny dla Scanner to: Object
        Typ nadrzedny dla ImageOutputStream to: jest to metoda klasy ImageIO która [ImageIO]
        rozszerza klase Object, więc wydaje mi się, że odpowiedź to Object

        Koniec3*/
        

        //Zadanie4
        
        IntSequenceClass test = IntSequenceClass.of(17,13,2,5,1,2);
        while(test.hasNext()){
            System.out.print(test.next() + ", ");
        }
        
        //Koniec4

        //Zadanie5



        //Koniec5

        //Zadanie6



        //Koniec6

        //Zadanie7



        //Koniec7
    }

    //Zadanie 1
    public static double average(Measurable[] objects) {
        if(objects.length == 0)
            return 0;

        double sum = 0;
        for(Measurable obj : objects){
            double measure = obj.getMeasure();
            sum += measure;
        }
        double resoult = sum / objects.length;
        return resoult;
    }

    //Zadanie2
    public static Measurable largest(Measurable[] objects){
        Measurable maxSalary = null;
        for(Measurable obj : objects){
            if(maxSalary == null || obj.getMeasure() > maxSalary.getMeasure()){
                maxSalary = obj;
            }
        }
        return maxSalary;
    }

    
    
}