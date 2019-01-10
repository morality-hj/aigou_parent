package org.morality.util;

public class AjaxResult {
    private boolean success=true;
    private String message;
    private Object resultObj;

    public Object getResultObj() {
        return resultObj;
    }

    public AjaxResult setResultObj(Object resultObj) {
        this.resultObj = resultObj;
        return this;
    }

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMessage() {
        return message;
    }
    public static AjaxResult me(){
        return new AjaxResult();
    }
    public AjaxResult setMessage(String message) {
        this.message = message;
        return this;
    }
}
