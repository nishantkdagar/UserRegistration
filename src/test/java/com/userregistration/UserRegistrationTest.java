package com.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistration usrreg = new UserRegistration();
    @Test
    public void firstNameTrue(){
        boolean result = usrreg.firstName("Nishant");
        Assertions.assertTrue(result);
    }
    @Test
    public void firstNameFalse(){
        boolean result = usrreg.firstName("nishant");
        Assertions.assertFalse(result);
    }
    @Test
    public void lastNameTrue(){
        boolean result = usrreg.lastName("Kumar");
        Assertions.assertTrue(result);
    }
    @Test
    public void lastNameFalse(){
        boolean result = usrreg.lastName("kumar");
        Assertions.assertFalse(result);
    }
    @Test
    public void emailTrue(){
        boolean result = usrreg.emailID("nishant@gmail.com");
        Assertions.assertTrue(result);
    }
    @Test
    public void emailFalse(){
        boolean result = usrreg.emailID("nishant@.com");
        Assertions.assertFalse(result);
    }
    @Test
    public void mobileNumberTrue(){
        boolean result = usrreg.phoneNo("+91 8901351647");
        Assertions.assertTrue(result);
    }
    @Test
    public void mobileNumberFalse(){
        boolean result = usrreg.phoneNo("91891351647");
        Assertions.assertFalse(result);
    }
    @Test
    public void passwordTrue(){
        boolean result = usrreg.passwordCheck("nishAnt@1996");
        Assertions.assertTrue(result);
    }
    @Test
    public void passwordFalse(){
        boolean result = usrreg.passwordCheck("nishant@1996");
        Assertions.assertFalse(result);
    }
}
