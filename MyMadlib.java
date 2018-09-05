import java.util.Scanner;
public class MyMadlib{
    public static void main (String[] args){
        String adjective1;
        String adjective2;
        String valuablePossetion1;
        String fruitOrVegetable1;
        String animal1;
        String wieldableObject1;
        String thing1;
        String thing2;
        String creature1;
        String verb1;
        String adverb1;
        String adverb2;
        String place1;
        String anoyingSound1;
        String animalSound1;
        String somethingYouWouldSayWhenBungieJumpingTheFirstTime;
        String victorySaying;
        long number1;
        long number2;
        long number3;

        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Input an adjective.");
        adjective1 = inputDevice.nextLine();
        System.out.println("Input another adjective.");
        adjective2 = inputDevice.nextLine();
        System.out.println("Input a fruit or vegetable.");
        fruitOrVegetable1 = inputDevice.nextLine();
        System.out.println("Input an animal of some sort.");
        animal1 = inputDevice.nextLine();       
        System.out.println("Input an adverb");
        adverb1 = inputDevice.nextLine();
        System.out.println("Input another adverb");
        adverb2 = inputDevice.nextLine();
        System.out.println("Input a valuable thing.");
        valuablePossetion1 = inputDevice.nextLine();
        System.out.println("Input an anoying sound");
        anoyingSound1 = inputDevice.nextLine();
        System.out.println("Input an animal sound.");
        animalSound1 = inputDevice.nextLine();
        System.out.println("Input any verb.");
        verb1 = inputDevice.nextLine();
        System.out.println("Input a creature of sorts.");
        creature1 = inputDevice.nextLine();
        System.out.println("Input something you carry in your hand(s)");
        wieldableObject1 = inputDevice.nextLine();
        System.out.println("Input a number.");
        number1 = inputDevice.nextLong();
        inputDevice.nextLine();
        System.out.println("(I swear, I started with twelve variables...)");
        System.out.println("Input another number. (will be better if this one is BIG)");
        number2 = inputDevice.nextLong();
        inputDevice.nextLine();
        System.out.println("Input yet another number.");
        number3 = inputDevice.nextLong();
        inputDevice.nextLine();
        System.out.println("Input a 'thing'");
        thing1 = inputDevice.nextLine();
        System.out.println("Input another 'thing'");
        thing2 = inputDevice.nextLine();
        System.out.println("Input a place, far far away.");
        place1 = inputDevice.nextLine();
        System.out.println("Input something you would say while bungie jumping for the first time.");
        somethingYouWouldSayWhenBungieJumpingTheFirstTime = inputDevice.nextLine();
        System.out.println("Input something you'd say after winning.");
        victorySaying = inputDevice.nextLine();


        System.out.println("              The Mighty " + creature1 + "\n" +
        "\n" +
        "Once upon a time there was a " + fruitOrVegetable1 + " named Koribo.\n" +
        "Koribo lived in a " + adverb1 + " village with people of all different flavors.\n" +
        "The town had been " + adverb2 + " peaceful for many years.\n" + 
        "Until one day, while Koribo was out gathering " + thing1 + " for some crafting, a Mighty " + creature1 + " attacked the village!\n" +
        "Homes were burned, and all the " + animal1 + "'s turned to crispy spots on the ground.\n" +
        "When Koribo returned to the village, he found it in ruins and everyone was " + anoyingSound1 + "ing.\n" +
        "But, Koribo was angry with the villagers!\n" +
        "\"Why is no one hurt?! Did no one even try to protect our homes from the " + creature1 + "?!\". Koribo asked the "+ anoyingSound1 + "ing villagers.\n" +
        "\n" +
        "Not even waiting to hear a reply, Koribo grabbed his trusty " + adjective1 + " " + wieldableObject1 + " and set off to defeat the " + creature1 + " who ruined his home.\n" +
        "After " + number1 + " days of traveling, Koribu finally came upon the " + creature1 + "'s nest in " + place1 + ".\n" +
        "After plowing through roughly " + number2 + " trash mobs (standard for any dungeon in " + place1 + "), Koribo entered the " + creature1 + "'s room.\n" +
        "As soon as he did, the walls " + verb1 + "ed behind him and the Mighty " + creature1 + " woke up!\n" +
        "\"FE FI FO FUM.... wait wrong story. GOOOAAAAAAR\" the " + adjective2 + " " + creature1 + " " + animalSound1 + "ed as it spotted Koribo.\n" +
        "\"I can't believe the villagers lost to such a thing! ------thing----------thing------------------" + thing2 + "\"!\n" +
        "Which was actually the chant for his most powerful attack, also called " + somethingYouWouldSayWhenBungieJumpingTheFirstTime + " For short.\n" +
        "\n" +
        "This super special skill (which BTW is stronger the more times he hits and the enemies he defeats before using it)\nscored a " + number3 + " hit combo dealing " + number2 * number3 + " points of damage!\n" +
        "OVERKILL MUCH, Koribo?!\nThe monster now lay dead after one move. (If that number is negative, then Koribo has surpassed the power to destroy the universe!)\n" +
        "\n" +
        "Koribo looted the " + valuablePossetion1 + " it dropped and returned to the village, victorious.\n" +
        "When he returned, the village had already been repaired and everyone was going about their lives.\n" +
        "\n" +
        victorySaying + " (Also known as THE END, where Koribo is from.)");
    }
}