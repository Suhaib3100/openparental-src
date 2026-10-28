package com.tencent.cos.xml.model.tag.audit.bean;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.qcloudxml.annoation.XmlBean;

@XmlBean(name = "Encryption")
/* loaded from: classes7.dex */
public class AuditEncryption {
    public String algorithm;
    public String iV;
    public String key;
    public String keyId = ProtectedSandApp.s("䯮\u0001");
    public int keyType;
}
