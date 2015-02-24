package gov.miamidade.thomas.two;

import gov.miamidade.thomas.ThomasApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/**
 * Created by fiallega on 2/23/15.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ThomasApplication.class)
public class ConversionTwoTest {


    @Autowired
    public ConversionTwoImpl conversion;

    @Test
    public void testConcert(){

        Assert.isTrue(conversion.convert().equals("cirm accessor implementation"));
    }

}
