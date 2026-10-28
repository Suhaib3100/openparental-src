package com.tencent.cos.xml.model.ci;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.bucket.BucketRequest;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public class SensitiveContentRecognitionRequest extends BucketRequest {
    private boolean async;
    private String bizType;
    private String callback;
    private String cosPath;
    private String dataid;
    private String detectUrl;
    private int interval;
    private boolean largeImageDetect;
    private int maxFrames;
    private final Set<String> types;

    public SensitiveContentRecognitionRequest(String str) {
        super(str);
        this.types = new HashSet();
    }

    private void addCiParams() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.types.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4++;
            sb.append(it.next());
            if (i4 < this.types.size()) {
                sb.append(ProtectedSandApp.s("㫧\u0001"));
            }
        }
        this.queryParameters.put(ProtectedSandApp.s("㫨\u0001"), ProtectedSandApp.s("㫩\u0001"));
        if (!TextUtils.isEmpty(this.bizType)) {
            this.queryParameters.put(ProtectedSandApp.s("㫪\u0001"), this.bizType);
        }
        if (!TextUtils.isEmpty(this.detectUrl)) {
            this.queryParameters.put(ProtectedSandApp.s("㫫\u0001"), this.detectUrl);
        }
        int i5 = this.interval;
        if (i5 > 0) {
            this.queryParameters.put(ProtectedSandApp.s("㫬\u0001"), String.valueOf(i5));
        }
        int i6 = this.maxFrames;
        if (i6 > 0) {
            this.queryParameters.put(ProtectedSandApp.s("㫭\u0001"), String.valueOf(i6));
        }
        Map<String, String> map = this.queryParameters;
        boolean z4 = this.largeImageDetect;
        String s4 = ProtectedSandApp.s("㫮\u0001");
        String s5 = ProtectedSandApp.s("㫯\u0001");
        map.put(ProtectedSandApp.s("㫰\u0001"), z4 ? s5 : s4);
        Map<String, String> map2 = this.queryParameters;
        if (this.async) {
            s4 = s5;
        }
        map2.put(ProtectedSandApp.s("㫱\u0001"), s4);
        if (!TextUtils.isEmpty(this.callback)) {
            this.queryParameters.put(ProtectedSandApp.s("㫲\u0001"), this.callback);
        }
        if (!TextUtils.isEmpty(this.dataid)) {
            this.queryParameters.put(ProtectedSandApp.s("㫳\u0001"), this.dataid);
        }
        this.queryParameters.put(ProtectedSandApp.s("㫴\u0001"), sb.toString());
    }

    public void addType(String str) {
        this.types.add(str);
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        String str;
        super.checkParameters();
        String str2 = this.bucket;
        if (str2 != null) {
            str2.getClass();
        }
        String str3 = this.cosPath;
        if ((str3 == null || str3.length() < 1) && (str = this.detectUrl) != null) {
            str.getClass();
        }
        addCiParams();
    }

    public String getCosPath() {
        return this.cosPath;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㫵\u0001");
    }

    @Override // com.tencent.cos.xml.model.bucket.BucketRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        String str = this.bucket;
        String str2 = this.cosPath;
        if (str2 == null) {
            str2 = "";
        }
        return cosXmlServiceConfig.getUrlPath(str, str2);
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public RequestBodySerializer getRequestBody() throws CosXmlClientException {
        return null;
    }

    public void setAsync(boolean z4) {
        this.async = z4;
    }

    public void setBizType(String str) {
        this.bizType = str;
    }

    public void setCallback(String str) {
        this.callback = str;
    }

    public void setCosPath(String str) {
        this.cosPath = str;
    }

    public void setDataid(String str) {
        this.dataid = str;
    }

    public void setDetectUrl(String str) {
        this.detectUrl = str;
    }

    public void setInterval(int i4) {
        this.interval = i4;
    }

    public void setLargeImageDetect(boolean z4) {
        this.largeImageDetect = z4;
    }

    public void setMaxFrames(int i4) {
        this.maxFrames = i4;
    }

    public SensitiveContentRecognitionRequest(String str, String str2) {
        super(str);
        this.types = new HashSet();
        setCosPath(str2);
    }
}
