package me.tzhang.monopoly;

import org.bukkit.entity.Player;

public class RollDie {
        public static void main(String[] args) {
        }

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
