package com.tencent.cos.xml.model.object;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.CosXmlServiceConfig;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.model.tag.Delete;
import com.tencent.cos.xml.transfer.XmlBuilder;
import com.tencent.qcloud.core.auth.STSCredentialScope;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public final class DeleteMultiObjectRequest extends ObjectRequest {
    private Delete delete;

    public DeleteMultiObjectRequest(String str, List<String> list) {
        super(str, null);
        Delete delete = new Delete();
        this.delete = delete;
        delete.deleteObjects = new ArrayList();
        setObjectList(list);
    }

    @Override // com.tencent.cos.xml.model.object.ObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        if (this.requestURL != null) {
            return;
        }
        if (this.bucket == null) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("䥝\u0001"));
        }
        if (this.delete.deleteObjects.size() == 0) {
            throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("䥜\u0001"));
        }
    }

    public Delete getDelete() {
        return this.delete;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("䥞\u0001");
    }

    @Override // com.tencent.cos.xml.model.object.ObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public String getPath(CosXmlServiceConfig cosXmlServiceConfig) {
        return cosXmlServiceConfig.getUrlPath(this.bucket, ProtectedSandApp.s("䥟\u0001"));
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        this.queryParameters.put(ProtectedSandApp.s("䥠\u0001"), null);
        return this.queryParameters;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public STSCredentialScope[] getSTSCredentialScope(CosXmlServiceConfig cosXmlServiceConfig) {
        STSCredentialScope[] sTSCredentialScopeArr = new STSCredentialScope[this.delete.deleteObjects.size()];
        int i4 = 0;
        for (Delete.DeleteObject deleteObject : this.delete.deleteObjects) {
            sTSCredentialScopeArr[i4] = new STSCredentialScope(ProtectedSandApp.s("䥡\u0001"), cosXmlServiceConfig.getBucket(this.bucket), cosXmlServiceConfig.getRegion(), deleteObject.key);
            i4++;
        }
        return sTSCredentialScopeArr;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public boolean isNeedMD5() {
        return true;
    }

    public void setObjectList(String str) {
        if (TextUtils.isEmpty(str) || str == null) {
            return;
        }
        if (str.startsWith(ProtectedSandApp.s("䥟\u0001"))) {
            str = str.substring(1);
        }
        Delete.DeleteObject deleteObject = new Delete.DeleteObject();
        deleteObject.key = str;
        this.delete.deleteObjects.add(deleteObject);
    }

    public void setQuiet(boolean z4) {
        this.delete.quiet = z4;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return RequestBodySerializer.string(ProtectedSandApp.s("䥢\u0001"), XmlBuilder.buildDelete(this.delete));
    }

    public DeleteMultiObjectRequest(String str) {
        super(str, null);
        Delete delete = new Delete();
        this.delete = delete;
        delete.deleteObjects = new ArrayList();
    }

    public void setObjectList(String str, String str2) {
        if (TextUtils.isEmpty(str) || str == null) {
            return;
        }
        if (str.startsWith(ProtectedSandApp.s("䥟\u0001"))) {
            str = str.substring(1);
        }
        Delete.DeleteObject deleteObject = new Delete.DeleteObject();
        deleteObject.key = str;
        if (str2 != null) {
            deleteObject.versionId = str2;
        }
        this.delete.deleteObjects.add(deleteObject);
    }

    public void setObjectList(List<String> list) {
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                Delete.DeleteObject deleteObject = new Delete.DeleteObject();
                String str = list.get(i4);
                if (!TextUtils.isEmpty(str)) {
                    if (str.startsWith(ProtectedSandApp.s("䥟\u0001"))) {
                        deleteObject.key = str.substring(1);
                    } else {
                        deleteObject.key = str;
                    }
                    this.delete.deleteObjects.add(deleteObject);
                }
            }
        }
    }

    public void setObjectList(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                Delete.DeleteObject deleteObject = new Delete.DeleteObject();
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key)) {
                    if (key.startsWith(ProtectedSandApp.s("䥟\u0001"))) {
                        deleteObject.key = key.substring(1);
                    } else {
                        deleteObject.key = key;
                    }
                    if (value != null) {
                        deleteObject.versionId = value;
                    }
                    this.delete.deleteObjects.add(deleteObject);
                }
            }
        }
    }
}
