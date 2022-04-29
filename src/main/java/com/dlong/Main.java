package com.dlong;

import com.dlong.validators.PasswordValidator;
import com.dlong.validators.reasons.PasswordValidatorStatusReasons;
import com.dlong.validators.status.PasswordValidatorStatus;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PasswordValidator validator = new PasswordValidator();
        String newPassword;
        PasswordValidatorStatus status = new PasswordValidatorStatus();

        while (!status.valid)
        {
            System.out.println("Please enter in your new password.");
            newPassword = input.nextLine();

            status = validator.isValid(newPassword);

            if (!status.valid) {
                System.out.println("The password did not have enough of the following:");
                if (status.reasons.contains(PasswordValidatorStatusReasons.INVALID_NOT_ENOUGH_UPPER_CASE))
                    System.out.println("uppercase letters");

                if (status.reasons.contains(PasswordValidatorStatusReasons.INVALID_NOT_ENOUGH_LOWER_CASE))
                    System.out.println("lowercase letters");

                if (status.reasons.contains(PasswordValidatorStatusReasons.INVALID_NOT_ENOUGH_DIGITS))
                    System.out.println("digits");
            }
        }

        System.out.println ("Valid password");
    }
}
