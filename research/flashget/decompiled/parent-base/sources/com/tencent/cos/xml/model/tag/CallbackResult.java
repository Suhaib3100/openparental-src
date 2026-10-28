package com.tencent.cos.xml.model.tag;

import com.tencent.cos.xml.utils.DigestUtils;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.FROM)
/* loaded from: classes7.dex */
public class CallbackResult {
    public String callbackBody;
    public boolean callbackBodyNotBase64;
    public Error error;
    public String status;

    @XmlBean(method = XmlBean.GenerateMethod.FROM)
    public static class Error {
        public String code;
        public String message;
    }

    public String getCallbackBody() {
        return this.callbackBodyNotBase64 ? this.callbackBody : DigestUtils.decodeBase64(this.callbackBody);
    }
}
