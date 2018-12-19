package com.fqcheng220.common.req;

import java.io.Serializable;

public class BaseRequestBody implements Serializable {
    public int mProtocolVersion;
    public int mType;
    public String mYjxx;
    public String mSblx;
    public String mToken;
}
