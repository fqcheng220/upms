package com.fqcheng220.common.resp;

import java.io.Serializable;
import java.util.List;

public class BaseResponseBody<T> implements Serializable {
    public BaseResponseBody setmStatusCode(int mStatusCode) {
        this.mStatusCode = mStatusCode;
        return this;
    }

    public BaseResponseBody setmMsg(String mMsg) {
        this.mMsg = mMsg;
        return this;
    }

    private int mStatusCode;
    private String mMsg;

    public BaseResponseBody setmResult(List<T> mResult) {
        this.mResult = mResult;
        return this;
    }

    private List<T> mResult;


}
