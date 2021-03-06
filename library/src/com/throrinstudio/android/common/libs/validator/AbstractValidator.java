package com.throrinstudio.android.common.libs.validator;

import android.content.Context;

/**
 * Class for creating new Validators
 *
 * @author throrin19
 */
public abstract class AbstractValidator {

    private Context mContext;
    private String mErrorMessageString;

    public AbstractValidator(Context c, int errorMessageRes) {
        mContext = c;
        mErrorMessageString = mContext.getString(errorMessageRes);
    }

    public AbstractValidator(Context c, String errorMessageString){
    	mContext = c;
    	mErrorMessageString = errorMessageString;
    }
    /**
     * Can check if the value passed in parameter is valid or not.
     *
     * @param value {@link String} : the value to validate
     * @return boolean : true if valid, false otherwise.
     */
    public abstract boolean isValid(String value) throws ValidatorException;

    /**
     * Used to retrieve the error message corresponding to the validator.
     *
     * @return String : the error message
     */
    public String getMessage() {
        return mErrorMessageString;
    }
}
