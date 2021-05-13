// Lesson 11: Classes and Objects

class GameCharacter {

    String name;
    int pos;
    int health;

    GameCharacter(String name, int pos, int health) {
        this.name = name;
        this.pos = pos;
        this.health = health;
    }

    void move(int amount){
        this.pos += amount;
    }

}
class Start {    
    public static void main(String[] args) {

        GameCharacter gc = new GameCharacter("Zac", 0, 100);
        gc.health = 200;
        gc.move(10);
        System.out.println(gc.health);
        System.out.println(gc.pos);
    }
}

// Lesson 10: Functions

class Start {
    
        static int move(int pos, int amount) {
            int finalPos = pos + amount;
            return finalPos;
        }
        
        public static void main(String[] args) {
            int finalPos = move(2,10);
            System.out.println(finalPos);
        }
    }


// Lesson 9: For Loops

class Start {
        public static void main(String[] args) {
    
            String[] inventory = {"Knife", "Boots", "Bread"};
            for (int i = 0; i < 3; i++) {
                String item = inventory[i];
                System.out.println(item);
            }
        }
    }

// Lesson 8: While Loops

class Start {
        public static void main(String[] args) {
            int pos = 0;
            int endPos = 5;

            while (pos < endPos) {
                pos += 1;
                System.out.println(pos);
            }
        }
    }

// Lesson 7: If/Else Statements

class Start {
        public static void main(String[] args) {
         
            int pos = 2;
            // String keyStroke = "l";
            // String keyStroke = "r";
            String keyStroke = "u";
            String commandError = "Unknown command";
    
            if (keyStroke.equals("r")) {
                pos += 1;
                System.out.println(pos);
            } else if (keyStroke.equals("l")) {
                pos -= 1;
                System.out.println(pos);
            } else {
                System.out.print(commandError);
            }
    
        }
    }

// Lesson 6: HashMaps

import java.util.HashMap;

class Start {
    public static void main(String[] args) {
     
       HashMap<String,Integer> inventory = new HashMap<>();
        inventory.put("Knife", 2);
        inventory.put("Boots", 3);
        inventory.put("Axe", 1);
        inventory.put("Wood", 12);

        int numKnives = inventory.get("Knife");
        System.out.println(numKnives);

        inventory.put("Axe", 3); // If the key doesn't exist, it inserts it, if it does exist, it finds and updates it
        inventory.replace("Axe", 1); // If you know the key exists

        System.out.println(inventory);

    }
}

// Lesson 5: ArrayLists

import java.util.ArrayList;

class Start {

    public static void main(String[] args) {
        
    // ArrayList of String type named "inventory" = Basic setup               
        ArrayList<String> inventory = new ArrayList<>();
        inventory.add("Knife");
        inventory.add("Boots");
        inventory.add("Bread");

        String knife = inventory.get(0);

        inventory.set(1, "Gloves");

        System.out.println("Before remove: "+ inventory);

        inventory.remove(0);
        inventory.remove("Bread");

        System.out.println("After remove: "+ inventory);
    }
}

// Lesson 4: Arrays

import java.util.Arrays;

class Start {
    public static void main(String[] args) {

        String[] inventory = {"Knife", "Bread", "Helmet"};
        String knife = inventory[0];
        inventory[1] = "Fruit";

        String[] inventory2 = new String[3];
        inventory2[0] = "zac";
        inventory2[1] = "aoife";
        inventory2[2] = "rok";

        int[] age = {26, 25, 31};

        System.out.println(Arrays.toString(inventory));
        System.out.print(Arrays.toString(inventory2));
        System.out.println(Arrays.toString(age));
    }

}

// Lesson 3: Operators

class Start {
    public static void main(String[] args) {
        
        // Assignment: =
        int health = 100;
        String firstName = "Zac";

        // Arithmetic: + - / %
        int newHealth = health + 20;
        health = health + 20;
        health += 20;
        String fullName = firstName + "Allen";

        // Comparison:  == != >= > <= <
        double accountBalance = 100.25;
        double cost = 50.0;
        boolean canAfford = accountBalance >= cost;
        
        // for strings use .equals
        System.out.println(firstName.equals("Zac"));

        // Logical: && || !
        int numLives = 3;
        boolean isAlive = numLives > 0 && health > 0;
        boolean isDead = !isAlive;
    }
}

// Lesson 2: Variables

class Start {
    public static void main(String[] args) {

        int pos;
        pos = 5;

        double accountBalance = 100.25;

        boolean isGameOver = false;
        isGameOver = true;

        String name = "Zac";
        
        final int maxHealth = 100;
        // maxHealth = 200; not allowed

        System.out.println(name);
        System.out.println(isGameOver);   
    }
}

// Lesson 1: Get started

class Start {

    public static void main(String[] args) {
        String hello = "Hello";
        System.out.println(hello);
        // comment
    }
}