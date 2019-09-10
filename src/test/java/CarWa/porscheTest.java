package CarWa;

import org.junit.Test;
import static org.junit.Assert.*;

public class porscheTest {

    @Test


public void shouldCloneStringArray(){
        String[] array={"one","two","three"};
        String[] copiedArray=array.clone();
        assertSame(array,array);
        assertNotSame(array,copiedArray);
        for (String str: copiedArray){
            System.out.println(str);
        }

    }

}
