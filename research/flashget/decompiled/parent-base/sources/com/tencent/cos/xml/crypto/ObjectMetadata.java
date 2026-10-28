package com.tencent.cos.xml.crypto;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class ObjectMetadata {
    private static final long serialVersionUID = 1;
    private Date expirationTime;
    private String expirationTimeRuleId;
    private Date httpExpiresDate;
    private boolean isDeleteMarker;
    private Map<String, Object> metadata;
    private Boolean ongoingRestore;
    private Date restoreExpirationTime;
    private Map<String, String> userMetadata;

    public ObjectMetadata() {
        this.userMetadata = new HashMap();
        this.metadata = new HashMap();
    }

    public void addUserMetadata(String str, String str2) {
        this.userMetadata.put(str, str2);
    }

    public String getCacheControl() {
        return (String) this.metadata.get(ProtectedSandApp.s("㘜\u0001"));
    }

    public String getContentDisposition() {
        return (String) this.metadata.get(ProtectedSandApp.s("㘝\u0001"));
    }

    public String getContentEncoding() {
        return (String) this.metadata.get(ProtectedSandApp.s("㘞\u0001"));
    }

    public String getContentLanguage() {
        return (String) this.metadata.get(ProtectedSandApp.s("㘟\u0001"));
    }

    public long getContentLength() {
        Long l4 = (Long) this.metadata.get(ProtectedSandApp.s("㘠\u0001"));
        if (l4 == null) {
            return 0L;
        }
        return l4.longValue();
    }

    public String getContentMD5() {
        return (String) this.metadata.get(ProtectedSandApp.s("㘡\u0001"));
    }

    public String getContentType() {
        return (String) this.metadata.get(ProtectedSandApp.s("㘢\u0001"));
    }

    public String getCrc64Ecma() {
        return (String) this.metadata.get(ProtectedSandApp.s("㘣\u0001"));
    }

    public String getETag() {
        return (String) this.metadata.get(ProtectedSandApp.s("㘤\u0001"));
    }

    public Date getExpirationTime() {
        return this.expirationTime;
    }

    public Date getHttpExpiresDate() {
        return this.httpExpiresDate;
    }

    public long getInstanceLength() {
        int lastIndexOf;
        String str = (String) this.metadata.get(ProtectedSandApp.s("㘥\u0001"));
        return (str == null || (lastIndexOf = str.lastIndexOf(ProtectedSandApp.s("㘦\u0001"))) < 0) ? getContentLength() : Long.parseLong(str.substring(lastIndexOf + 1));
    }

    public Date getLastModified() {
        return (Date) this.metadata.get(ProtectedSandApp.s("㘧\u0001"));
    }

    public Boolean getOngoingRestore() {
        return this.ongoingRestore;
    }

    public Map<String, Object> getRawMetadata() {
        return Collections.unmodifiableMap(this.metadata);
    }

    public Object getRawMetadataValue(String str) {
        return this.metadata.get(str);
    }

    public Date getRestoreExpirationTime() {
        return this.restoreExpirationTime;
    }

    public String getSSEAlgorithm() {
        return (String) this.metadata.get(ProtectedSandApp.s("㘨\u0001"));
    }

    public String getSSECOSKmsKeyId() {
        return (String) this.metadata.get(ProtectedSandApp.s("㘩\u0001"));
    }

    public String getSSECustomerAlgorithm() {
        return (String) this.metadata.get(ProtectedSandApp.s("㘪\u0001"));
    }

    public String getSSECustomerKeyMd5() {
        return (String) this.metadata.get(ProtectedSandApp.s("㘫\u0001"));
    }

    public String getServerSideEncryption() {
        return (String) this.metadata.get(ProtectedSandApp.s("㘨\u0001"));
    }

    public String getStorageClass() {
        Object obj = this.metadata.get(ProtectedSandApp.s("㘬\u0001"));
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    public String getUserMetaDataOf(String str) {
        Map<String, String> map = this.userMetadata;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public Map<String, String> getUserMetadata() {
        return this.userMetadata;
    }

    public String getVersionId() {
        return (String) this.metadata.get(ProtectedSandApp.s("㘭\u0001"));
    }

    public boolean isDeleteMarker() {
        return this.isDeleteMarker;
    }

    public void setCacheControl(String str) {
        this.metadata.put(ProtectedSandApp.s("㘜\u0001"), str);
    }

    public void setContentDisposition(String str) {
        this.metadata.put(ProtectedSandApp.s("㘝\u0001"), str);
    }

    public void setContentEncoding(String str) {
        this.metadata.put(ProtectedSandApp.s("㘞\u0001"), str);
    }

    public void setContentLanguage(String str) {
        this.metadata.put(ProtectedSandApp.s("㘟\u0001"), str);
    }

    public void setContentLength(long j4) {
        this.metadata.put(ProtectedSandApp.s("㘠\u0001"), Long.valueOf(j4));
    }

    public void setContentMD5(String str) {
        String s4 = ProtectedSandApp.s("㘡\u0001");
        if (str == null) {
            this.metadata.remove(s4);
        } else {
            this.metadata.put(s4, str);
        }
    }

    public void setContentType(String str) {
        this.metadata.put(ProtectedSandApp.s("㘢\u0001"), str);
    }

    public void setDeleteMarker(boolean z4) {
        this.isDeleteMarker = z4;
    }

    public void setExpirationTime(Date date) {
        this.expirationTime = date;
    }

    public void setHeader(String str, Object obj) {
        this.metadata.put(str, obj);
    }

    public void setHttpExpiresDate(Date date) {
        this.httpExpiresDate = date;
    }

    public void setLastModified(Date date) {
        this.metadata.put(ProtectedSandApp.s("㘧\u0001"), date);
    }

    public void setOngoingRestore(boolean z4) {
        this.ongoingRestore = Boolean.valueOf(z4);
    }

    public void setRestoreExpirationTime(Date date) {
        this.restoreExpirationTime = date;
    }

    public void setSSEAlgorithm(String str) {
        this.metadata.put(ProtectedSandApp.s("㘨\u0001"), str);
    }

    public void setSSECustomerAlgorithm(String str) {
        this.metadata.put(ProtectedSandApp.s("㘪\u0001"), str);
    }

    public void setSSECustomerKeyMd5(String str) {
        this.metadata.put(ProtectedSandApp.s("㘫\u0001"), str);
    }

    public void setSecurityToken(String str) {
        this.metadata.put(ProtectedSandApp.s("㘮\u0001"), str);
    }

    public void setServerSideEncryption(String str) {
        this.metadata.put(ProtectedSandApp.s("㘨\u0001"), str);
    }

    public void setUserMetadata(Map<String, String> map) {
        this.userMetadata = map;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public ObjectMetadata m14clone() {
        return new ObjectMetadata(this);
    }

    public ObjectMetadata(Map<String, List<String>> map) {
        this.userMetadata = new HashMap();
        this.metadata = new HashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            String str = (value == null || value.isEmpty()) ? null : value.get(0);
            if (!TextUtils.isEmpty(key) && str != null) {
                if (key.startsWith(ProtectedSandApp.s("㘛\u0001"))) {
                    this.userMetadata.put(key, str);
                } else {
                    this.metadata.put(key, str);
                }
            }
        }
    }

    private ObjectMetadata(ObjectMetadata objectMetadata) {
        this.userMetadata = objectMetadata.userMetadata == null ? null : new HashMap(objectMetadata.userMetadata);
        this.metadata = objectMetadata.metadata != null ? new HashMap(objectMetadata.metadata) : null;
        this.expirationTime = objectMetadata.expirationTime;
        this.expirationTimeRuleId = objectMetadata.expirationTimeRuleId;
        this.httpExpiresDate = objectMetadata.httpExpiresDate;
    }
}
