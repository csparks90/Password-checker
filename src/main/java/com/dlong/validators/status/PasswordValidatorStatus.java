package com.dlong.validators.status;

import com.dlong.validators.reasons.PasswordValidatorStatusReasons;

import java.util.ArrayList;
import java.util.List;

public class PasswordValidatorStatus {
    public boolean valid = false;
    public List<PasswordValidatorStatusReasons> reasons = new ArrayList<PasswordValidatorStatusReasons>();
}
