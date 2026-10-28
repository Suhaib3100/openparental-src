package com.tencent.cos.xml.model.ci.audit;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(method = XmlBean.GenerateMethod.TO, name = "Request")
/* loaded from: classes7.dex */
public class PostLiveVideoAudit {
    public PostLiveVideoAuditConf conf;
    public PostLiveVideoAuditInput input;
    public PostLiveVideoAuditStorageConf storageConf;
    public String type = ProtectedSandApp.s("䆣\u0001");

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Conf")
    public static class PostLiveVideoAuditConf {
        public String bizType;
        public String callback;
        public int callbackType;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "Input")
    public static class PostLiveVideoAuditInput {
        public String dataId;
        public String url;
        public PostLiveVideoAuditUserInfo userInfo;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "StorageConf")
    public static class PostLiveVideoAuditStorageConf {
        public String path;
    }

    @XmlBean(method = XmlBean.GenerateMethod.TO, name = "UserInfo")
    public static class PostLiveVideoAuditUserInfo {
        public String appId;
        public String deviceId;
        public String gender;
        public String iP;
        public String level;
        public String nickname;
        public String receiveTokenId;
        public String role;
        public String room;
        public String tokenId;
        public String type;
    }
}
