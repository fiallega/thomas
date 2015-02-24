package gov.miamidade.thomas.one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



/**
 * Created by fiallega on 2/23/15.
 */
@Component
public class ConversionOneImpl {

    @Autowired
    private CirmOneAccessor accessor;

    public String convert(){
        return accessor.byId();
    }

}
