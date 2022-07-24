package ru.job4j;


import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.core.Is.is;

public class Main {
    public static List<String> split(List<String> left, List<String> middle, List<String> right) {
        left.retainAll(middle);
        left.removeAll(right);
        return left;
    }

    @Test
    public void split() {
        List<String> left = new ArrayList<>();
        left.add("one");
        left.add("two");
        left.add("three");
        left.add("four");
        left.add("five");
        left.add("six");
        left.add("seven");
        left.add("eight");
        left.add("nine");
        left.add("ten");
        List<String> middle = List.of(
                "one", "two", "four", "five", "seven", "eight", "nine"
        );
        List<String> right = List.of("five", "nine"
        );
        List<String> rsl = Tests.split(left, middle, right);
        Assert.assertThat(rsl, is(List.of("one", "four", "seven", "eight")));
    }
}
