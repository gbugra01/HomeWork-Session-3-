package FourthWeek;

import FirstHomeWork.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
;


public class CarOwners {
    public static void main(String[] args) {
        HashMap<String, Colours> john = new HashMap<>();
        john.put("John", Colours.BLACK);
        HashMap<String, Colours> kvara = new HashMap<>();
        kvara.put("Kvara", Colours.BLACK);
        HashMap<String, Colours> angela = new HashMap<>();
        angela.put("Angela", Colours.BLACK);
        HashMap<String, Colours> victor = new HashMap<>();
        victor.put("Victor", Colours.BLACK);
        HashMap<String, Colours> messi = new HashMap<>();
        messi.put("Messi",Colours.BLACK);
        HashMap<String, Colours> ronaldo = new HashMap<>();
        ronaldo.put("Ronaldo", Colours.RED);
        HashMap<String, Colours> torres = new HashMap<>();
        torres.put("Torres", Colours.RED);
        HashMap<String, Colours> david = new HashMap<>();
        david.put("David", Colours.RED);
        HashMap<String, Colours> dusan = new HashMap<>();
        dusan.put("Dusan", Colours.RED);
        HashMap<String,Colours> alex=new HashMap<>();
        alex.put("Alex",Colours.BLUE);
        HashMap<String,Colours> morgan=new HashMap<>();
        morgan.put("Morgan",Colours.BLUE);
        HashMap<String,Colours> alisha=new HashMap<>();
        alisha.put("Alisha",Colours.BLUE);
        HashMap<String,Colours> reyna=new HashMap<>();
        reyna.put("Reyna",Colours.BLUE);
        HashMap<String,Colours> ernest=new HashMap<>();
        ernest.put("Ernest",Colours.GREY);
        HashMap<String,Colours> vincent=new HashMap<>();
        vincent.put("Vincent",Colours.GREY);
        HashMap<String,Colours> milot=new HashMap<>();
        milot.put("Milot",Colours.GREY);
        HashMap<String,Colours> joe=new HashMap<>();
        joe.put("Joe",Colours.GREY);
        List<HashMap<String,Colours>> ownersBlackCar=new ArrayList<>();
        ownersBlackCar.add(john);
        ownersBlackCar.add(kvara);
        ownersBlackCar.add(angela);
        ownersBlackCar.add(victor);
        ownersBlackCar.add(messi);
        System.out.println(ownersBlackCar);
        System.out.println("=====00=======");
        List<HashMap<String,Colours>> ownersRedCar=new ArrayList<>();
        ownersRedCar.add(ronaldo);
        ownersRedCar.add(torres);
        ownersRedCar.add(david);
        ownersRedCar.add(dusan);
        System.out.println(ownersRedCar);
        System.out.println("===========00============");
        List<HashMap<String,Colours>> ownersBlueCar=new ArrayList<>();
        ownersBlueCar.add(alex);
        ownersBlueCar.add(morgan);
        ownersBlueCar.add(alisha);
        ownersBlueCar.add(reyna);
        System.out.println(ownersBlueCar);
        System.out.println("=====================00000000======");
        List<HashMap<String,Colours>> ownersGreyCar=new ArrayList<>();
        ownersGreyCar.add(ernest);
        ownersGreyCar.add(vincent);
        ownersGreyCar.add(milot);
        ownersGreyCar.add(joe);
        System.out.println(ownersGreyCar);




    }
    }

