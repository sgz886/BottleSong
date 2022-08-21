package com.jiangren.bootcamp.java;

public class Bottles {
    public String verse(int num) {
        if (num <= 0) {
            return "No more bottles of beer on the wall, no more bottles of beer.\n" +
                       "Go to the store and buy some more, 99 bottles of beer on the wall.";
        }
        return String.format("%s %s of beer on the wall, %s %s of beer.\n", num, numberToBottle(num), num, numberToBottle(num)) +
                   String.format("Take %s down and pass it around, ", numberToWord(num)) +
                   (num - 1 > 0 ? String.format("%s %s of beer on the wall.", num - 1, numberToBottle(num - 1)) :
                        "no more bottles of beer on the wall.");
    }

    private String numberToWord(int num) {
        if (num > 1) {
            return "one";
        } else if (num == 1) {
            return "it";
        } else {
            return "";
        }
    }

    private String numberToBottle(int num) {
        if (num > 1) {
            return "bottles";
        } else if (num == 1) {
            return "bottle";
        } else {
            return "";
        }
    }

    public String verses(int first, int last) {
        StringBuilder lyricBuilder = new StringBuilder();
        if (0 <= last && last <= first) {
            for (int i = first; i >= last; i--) {
                lyricBuilder.append(verse(i));
                if (i > last) {
                    lyricBuilder.append("\n\n");
                }
            }
            return lyricBuilder.toString();
        } else {
            return "";
        }
    }

    public String song() {
        return verses(99, 0);
    }
}
