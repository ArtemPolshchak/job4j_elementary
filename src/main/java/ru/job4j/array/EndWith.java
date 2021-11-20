package ru.job4j.array;

class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int index = post.length - 1; index >= 0; index--) {
            if (post[post.length - 1 - index] != word[word.length - 1 - index]) {
                result = false;
                break;
            }
        }
        return result;
    }
}


