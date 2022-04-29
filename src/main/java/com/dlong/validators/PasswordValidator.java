package com.dlong.validators;

import com.dlong.validators.reasons.PasswordValidatorStatusReasons;
import com.dlong.validators.status.PasswordValidatorStatus;

public class PasswordValidator {
    public PasswordValidatorStatus isValid(String password) {
        PasswordValidatorStatus status = new PasswordValidatorStatus();

        int upperCase = 0, lowerCase = 0, digit = 0;

        for (int i = 0; i < password.length(); i++)
        {
            char ch = password.charAt(i);

            if (Character.isUpperCase(ch))
                upperCase++;

            if (Character.isLowerCase(ch))
                lowerCase++;

            if (Character.isDigit(ch))
                digit++;
        }

        if (upperCase < 2)
            status.reasons.add(PasswordValidatorStatusReasons.INVALID_NOT_ENOUGH_UPPER_CASE);
        
        if (lowerCase < 3)
            status.reasons.add(PasswordValidatorStatusReasons.INVALID_NOT_ENOUGH_LOWER_CASE);

        if (digit < 1)
            status.reasons.add(PasswordValidatorStatusReasons.INVALID_NOT_ENOUGH_DIGITS);

        status.valid = (status.reasons.size() == 0);

        return status;
    }
}


