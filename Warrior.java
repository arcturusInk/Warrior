import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Swati on 4/6/2018.
 */

public class Warrior {
    String name;
    int strength;

    Warrior(String name, int strength){
        this.name = name;
        this.strength = strength;
    }

    static void status(ArrayList<Warrior> warriorArrayList){
        int totalWars = warriorArrayList.size();
        System.out.println("There are: " +totalWars+ " warriors");
        for(int i = 0; i < totalWars; ++i){
            String aWarName = warriorArrayList.get(i).name;
            int aWarStrength = warriorArrayList.get(i).strength;
            System.out.println("Warrior: " +aWarName+ ", strength: " +aWarStrength);
        }
    }

    static void battle(ArrayList<Warrior> warriorArrayList, String oneWarrior, String secWarrior){
        int firWarIndex = 0, secWarIndex = 0;
        for(int i = 0; i < warriorArrayList.size(); i++) {
            if (warriorArrayList.get(i).name.equals(oneWarrior)) {
                firWarIndex = i;
            }else if(warriorArrayList.get(i).name.equals(secWarrior)){
                secWarIndex = i;
            }
        }
        int oneWarriorStrength = warriorArrayList.get(firWarIndex).strength;
        int secWarriorStrength = warriorArrayList.get(secWarIndex).strength;
        String oneWarName = warriorArrayList.get(firWarIndex).name;
        String secWarName = warriorArrayList.get(secWarIndex).name;

        System.out.println(oneWarName+ " battles " +secWarName);

        if(oneWarriorStrength == 0 && secWarriorStrength == 0){
            System.out.println("Oh, NO! They're both dead! Yuck!");
        }else if(oneWarriorStrength == secWarriorStrength){
            warriorArrayList.get(firWarIndex).strength = 0;
            warriorArrayList.get(secWarIndex).strength = 0;
            System.out.println("Mutual Annihilation: " +oneWarName+ " and " +secWarName+ " die at each other's hands");
        }else if(oneWarriorStrength == 0 && secWarriorStrength > 0){
            System.out.println("He's dead " +secWarName);
        }else if(secWarriorStrength == 0 && oneWarriorStrength > 0){
            System.out.println("He's dead " +oneWarName);
        }else if(oneWarriorStrength > secWarriorStrength){
            warriorArrayList.get(firWarIndex).strength = oneWarriorStrength - secWarriorStrength;
            warriorArrayList.get(secWarIndex).strength = 0;
            System.out.println(oneWarName+ " defeats " +secWarName);
        }else if(oneWarriorStrength < secWarriorStrength){
            warriorArrayList.get(secWarIndex).strength = oneWarriorStrength - secWarriorStrength;
            warriorArrayList.get(firWarIndex).strength = 0;
            System.out.println(secWarName+ " defeats " +oneWarName);
        }
    }

    public static void main(String[] args) {
        File file = new File("warriors.txt");
        ArrayList<Warrior> warriorArrayList = new ArrayList<>();
        try {
            Scanner fileScanner = new Scanner(file);
            while(fileScanner.hasNext()){
                String word = fileScanner.next();
                if(word.equals("Warrior")){
                    //create a new warrior with name and strength AND add it to arraylist
                    String name = fileScanner.next();
                    int strength = fileScanner.nextInt();
                    Warrior aWarrior = new Warrior(name, strength);
                    warriorArrayList.add(aWarrior);
                }else if(word.equals("Battle")){
                    String oneWarrior = fileScanner.next();
                    String secWarrior = fileScanner.next();
                    battle(warriorArrayList, oneWarrior,secWarrior);
                }else if (word.equals("Status")){
                    status(warriorArrayList);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
