package com.yulki.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo02 {
    public static void main(String[] args) {
        randomCard();

    }

    public static void randomCard() {
        int[] cards = new int[52];
        for(int i = 0;i<cards.length;i++){
            cards[i] = i;
        }
        cards = swap(cards);
        for(int i:cards){
            System.out.print(i+" ");
        }
    }

    public static int[] swap(int[] cards) {
        cards = Arrays.copyOf(cards, cards.length);
        Random random = new Random();
        for (int i = 0; i < cards.length; i++) {
            int index = random.nextInt(cards.length);
            int temp = cards[i];
            cards[i] = cards[index];
            cards[index] = temp;
        }
        return cards;
    }

}
