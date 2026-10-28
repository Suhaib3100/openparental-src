package com.tencent.cos.xml.model.bucket;

import androidx.fragment.app.y;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.ReplicationConfiguration;
import com.tencent.cos.xml.transfer.XmlBuilder;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes6.dex */
public class PutBucketReplicationRequest extends BucketRequest {
    private ReplicationConfiguration replicationConfiguration;

    public static class RuleStruct {
        public String appid;
        public String bucket;

        /* renamed from: id, reason: collision with root package name */
        public String f71698id;
        public boolean isEnable;
        public String prefix;
        public String region;
        public String storageClass;
    }

    public PutBucketReplicationRequest(String str) {
        super(str);
        ReplicationConfiguration replicationConfiguration = new ReplicationConfiguration();
        this.replicationConfiguration = replicationConfiguration;
        replicationConfiguration.rules = new ArrayList();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㛯\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㛰\u0001"), null);
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public boolean isNeedMD5() {
        return true;
    }

    public void setReplicationConfigurationWithRole(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        this.replicationConfiguration.role = y.a(ProtectedSandApp.s("㛱\u0001"), str, ProtectedSandApp.s("㛲\u0001"), str2);
    }

    public void setReplicationConfigurationWithRule(RuleStruct ruleStruct) {
        if (ruleStruct != null) {
            ReplicationConfiguration.Rule rule = new ReplicationConfiguration.Rule();
            rule.f71734id = ruleStruct.f71698id;
            rule.status = ruleStruct.isEnable ? ProtectedSandApp.s("㛳\u0001") : ProtectedSandApp.s("㛴\u0001");
            rule.prefix = ruleStruct.prefix;
            ReplicationConfiguration.Destination destination = new ReplicationConfiguration.Destination();
            destination.storageClass = ruleStruct.storageClass;
            destination.bucket = ProtectedSandApp.s("㛵\u0001") + ruleStruct.region + ProtectedSandApp.s("㛶\u0001") + ruleStruct.bucket;
            rule.destination = destination;
            this.replicationConfiguration.rules.add(rule);
        }
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return RequestBodySerializer.string(ProtectedSandApp.s("㛷\u0001"), XmlBuilder.buildReplicationConfiguration(this.replicationConfiguration));
    }
}
