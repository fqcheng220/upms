package com.fqcheng220.common.resp;

import java.util.List;

public class BaseResponseBody<T> {

    private int mStatusCode;
    private String mMsg;
    private List<T> mResult;

    public BaseResponseBody setmStatusCode(int mStatusCode) {
        this.mStatusCode = mStatusCode;
        return this;
    }

    public BaseResponseBody setmMsg(String mMsg) {
        this.mMsg = mMsg;
        return this;
    }

    public BaseResponseBody setmResult(List<T> mResult) {
        this.mResult = mResult;
        return this;
    }

    public int getmStatusCode() {
        return mStatusCode;
    }

    public String getmMsg() {
        return mMsg;
    }

    public List<T> getmResult() {
        return mResult;
    }
}
