package gov.miamidade.thomas.two;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by fiallega on 2/23/15.
 */

@Profile("fake")
@Component
public class FakeCirmTwoAccessorImpl implements CirmTwoAccessor {

    //@Override
    public String byId() {
        return "This was a fake";
    }
}
