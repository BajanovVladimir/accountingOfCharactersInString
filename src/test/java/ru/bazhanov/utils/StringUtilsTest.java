package ru.bazhanov.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class StringUtilsTest {
    @Test
    public void test_that_method_counts_characters_in_string_correctly(){
        String string = "aaaaabcccc";
        Map<Character,Long> charactersMap = StringUtils.accountingForCharactersInString(string);
        Assertions.assertEquals(3,charactersMap.size());
        Assertions.assertEquals(5,charactersMap.get('a'));
        Assertions.assertEquals(1,charactersMap.get('b'));
        Assertions.assertEquals(4,charactersMap.get('c'));

    }
}
