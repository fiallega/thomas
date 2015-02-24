package gov.miamidade.thomas.one;

import org.springframework.stereotype.Component;

/**
 * Created by fiallega on 2/23/15.
 */


@Component
public class CirmOneAccessorImpl implements CirmOneAccessor {

    @Override
    public String byId() {
        return "cirm accessor implementation";
    }
}
