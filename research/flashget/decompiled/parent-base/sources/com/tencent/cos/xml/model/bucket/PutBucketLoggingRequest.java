package com.tencent.cos.xml.model.bucket;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.model.tag.BucketLoggingStatus;
import com.tencent.cos.xml.transfer.XmlBuilder;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes6.dex */
public class PutBucketLoggingRequest extends BucketRequest {
    private BucketLoggingStatus bucketLoggingStatus;

    public PutBucketLoggingRequest(String str) {
        super(str);
        this.bucketLoggingStatus = new BucketLoggingStatus();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㛦\u0001");
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("㛧\u0001"), null);
        return super.getQueryString();
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public boolean isNeedMD5() {
        return true;
    }

    public void setTargetBucket(String str) {
        BucketLoggingStatus bucketLoggingStatus = this.bucketLoggingStatus;
        if (bucketLoggingStatus.loggingEnabled == null) {
            bucketLoggingStatus.loggingEnabled = new BucketLoggingStatus.LoggingEnabled();
        }
        this.bucketLoggingStatus.loggingEnabled.targetBucket = str;
    }

    public void setTargetPrefix(String str) {
        BucketLoggingStatus bucketLoggingStatus = this.bucketLoggingStatus;
        if (bucketLoggingStatus.loggingEnabled == null) {
            bucketLoggingStatus.loggingEnabled = new BucketLoggingStatus.LoggingEnabled();
        }
        this.bucketLoggingStatus.loggingEnabled.targetPrefix = str;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return RequestBodySerializer.string(ProtectedSandApp.s("㛨\u0001"), XmlBuilder.buildBucketLogging(this.bucketLoggingStatus));
    }
}
