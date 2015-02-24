package gov.miamidade.thomas.two;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by fiallega on 2/23/15.
 */


@Component
public class CirmTwoAccessorImpl implements CirmTwoAccessor {

    @Override
    public String byId() {

        return "cirm accessor implementation";
    }
}
