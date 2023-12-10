package ru.bazhanov.web;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.web.servlet.ModelAndView;
import java.util.Map;

@ExtendWith(SpringExtension.class)
public class ViewControllerTest {
    @InjectMocks
    ViewController viewController;

    @Test
    public void test_get(){
        ModelAndView mv = viewController.indexGet();
        Assertions.assertEquals("index",mv.getViewName());
    }

    @Test
    public void test_put(){
        ModelAndView mv = viewController.indexPost("aaaabccc");
        Assertions.assertEquals("index",mv.getViewName());
        Assertions.assertEquals(2,mv.getModel().size());
        Map<Character, Long> map = (Map<Character, Long>) mv.getModel().get("charactersMap");
        Assertions.assertEquals(3,map.size());
    }
}
