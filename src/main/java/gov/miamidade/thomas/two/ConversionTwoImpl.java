package gov.miamidade.thomas.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * Created by fiallega on 2/23/15.
 */
@Component
public class ConversionTwoImpl {

    @Autowired
    private CirmTwoAccessor accessor;

    public String convert(){
        return accessor.byId();
    }

}
