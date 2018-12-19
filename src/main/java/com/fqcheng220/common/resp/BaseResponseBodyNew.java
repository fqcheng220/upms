package com.fqcheng220.common.resp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fqcheng220.model.UpmsUser;

import java.io.Serializable;
import java.util.List;

public class BaseResponseBodyNew implements Serializable {
//    public void setmStatusCode(int mStatusCode) {
//        this.mStatusCode = mStatusCode;
//    }
//
//    public void setmMsg(String mMsg) {
//        this.mMsg = mMsg;
//    }
//
//    public int mStatusCode;
//    public String mMsg;
//
    public void setmResult(List<UpmsUser> mResult) {
        this.mResult = mResult;
    }

    private List<UpmsUser> mResult;


}
