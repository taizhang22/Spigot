package me.tzhang.monopoly;

public class RollDie {

    public static String roll(){

        int total = 0;
        String send = "Rolled: ";

        for(int i = 0; i < 2; i++){
            int rolled = (int)(Math.random() * 6) + 1;
            send = send.concat(String.valueOf("|" + rolled + "| "));
            total += rolled;
        }
        send = send.concat("Total: " + total);

        return send;

    }


}
