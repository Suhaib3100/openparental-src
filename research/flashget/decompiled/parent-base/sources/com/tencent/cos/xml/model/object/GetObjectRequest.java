package com.tencent.cos.xml.model.object;

import android.net.Uri;
import android.support.v4.media.c;
import androidx.compose.material3.j4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.common.ClientErrorCode;
import com.tencent.cos.xml.common.Range;
import com.tencent.cos.xml.exception.CosXmlClientException;
import com.tencent.cos.xml.listener.CosXmlProgressListener;
import com.tencent.qcloud.core.http.RequestBodySerializer;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class GetObjectRequest extends ObjectRequest implements SaveLocalRequest, TransferRequest {
    private Uri fileContentUri;
    private long fileOffset;
    private boolean objectKeySimplifyCheck;
    private CosXmlProgressListener progressListener;
    private Range range;
    private String rspCacheControl;
    private String rspContentDisposition;
    private String rspContentEncoding;
    private String rspContentLanguage;
    private String rspContentType;
    private String rspExpires;
    private String saveFileName;
    private String savePath;
    private String versionId;

    public GetObjectRequest(String str, String str2, String str3) {
        super(str, str2);
        this.fileOffset = 0L;
        this.objectKeySimplifyCheck = true;
        this.savePath = str3;
    }

    @Override // com.tencent.cos.xml.model.object.ObjectRequest, com.tencent.cos.xml.model.CosXmlRequest
    public void checkParameters() throws CosXmlClientException {
        String s4 = ProtectedSandApp.s("㩪\u0001");
        super.checkParameters();
        if (this.objectKeySimplifyCheck) {
            String str = this.cosPath;
            try {
                str = new File(s4 + this.cosPath).getCanonicalPath();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            if (s4.equals(str)) {
                throw new CosXmlClientException(ClientErrorCode.INVALID_ARGUMENT.getCode(), ProtectedSandApp.s("㩫\u0001"));
            }
        }
    }

    public String getDownloadPath() {
        String str = this.savePath;
        if (str == null) {
            return null;
        }
        String s4 = ProtectedSandApp.s("㩪\u0001");
        String a5 = !str.endsWith(s4) ? c.a(new StringBuilder(), this.savePath, s4) : this.savePath;
        File file = new File(a5);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (this.saveFileName != null) {
            StringBuilder a6 = j4.a(a5);
            a6.append(this.saveFileName);
            return a6.toString();
        }
        String str2 = this.cosPath;
        if (str2 == null) {
            return a5;
        }
        int lastIndexOf = str2.lastIndexOf(s4);
        if (lastIndexOf >= 0) {
            StringBuilder a7 = j4.a(a5);
            a7.append(this.cosPath.substring(lastIndexOf + 1));
            return a7.toString();
        }
        StringBuilder a8 = j4.a(a5);
        a8.append(this.cosPath);
        return a8.toString();
    }

    public Uri getFileContentUri() {
        return this.fileContentUri;
    }

    public long getFileOffset() {
        return this.fileOffset;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public String getMethod() {
        return ProtectedSandApp.s("㩬\u0001");
    }

    public CosXmlProgressListener getProgressListener() {
        return this.progressListener;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    public Map<String, String> getQueryString() {
        String str = this.versionId;
        if (str != null) {
            this.queryParameters.put(ProtectedSandApp.s("㩭\u0001"), str);
        }
        String str2 = this.rspContentType;
        if (str2 != null) {
            this.queryParameters.put(ProtectedSandApp.s("㩮\u0001"), str2);
        }
        String str3 = this.rspContentLanguage;
        if (str3 != null) {
            this.queryParameters.put(ProtectedSandApp.s("㩯\u0001"), str3);
        }
        String str4 = this.rspExpires;
        if (str4 != null) {
            this.queryParameters.put(ProtectedSandApp.s("㩰\u0001"), str4);
        }
        String str5 = this.rspCacheControl;
        if (str5 != null) {
            this.queryParameters.put(ProtectedSandApp.s("㩱\u0001"), str5);
        }
        String str6 = this.rspContentDisposition;
        if (str6 != null) {
            this.queryParameters.put(ProtectedSandApp.s("㩲\u0001"), str6);
        }
        String str7 = this.rspContentEncoding;
        if (str7 != null) {
            this.queryParameters.put(ProtectedSandApp.s("㩳\u0001"), str7);
        }
        return super.getQueryString();
    }

    public Range getRange() {
        return this.range;
    }

    public String getRspCacheControl() {
        return this.rspCacheControl;
    }

    public String getRspContentDispositon() {
        return this.rspContentDisposition;
    }

    public String getRspContentEncoding() {
        return this.rspContentEncoding;
    }

    public String getRspContentLanguage() {
        return this.rspContentLanguage;
    }

    public String getRspContentType() {
        return this.rspContentType;
    }

    public String getRspExpires() {
        return this.rspExpires;
    }

    public String getSaveFileName() {
        return this.saveFileName;
    }

    @Override // com.tencent.cos.xml.model.object.SaveLocalRequest
    public long getSaveLocalOffset() {
        return getFileOffset();
    }

    @Override // com.tencent.cos.xml.model.object.SaveLocalRequest
    public String getSaveLocalPath() {
        return getDownloadPath();
    }

    @Override // com.tencent.cos.xml.model.object.SaveLocalRequest
    public Uri getSaveLocalUri() {
        return getFileContentUri();
    }

    public String getSavePath() {
        return this.savePath;
    }

    public boolean isObjectKeySimplifyCheck() {
        return this.objectKeySimplifyCheck;
    }

    public void setFileOffset(long j4) {
        if (j4 > 0) {
            this.fileOffset = j4;
        }
    }

    public void setIfMatch(String str) {
        if (str != null) {
            addHeader(ProtectedSandApp.s("㩴\u0001"), str);
        }
    }

    public void setIfModifiedSince(String str) {
        if (str != null) {
            addHeader(ProtectedSandApp.s("㩵\u0001"), str);
        }
    }

    public void setIfNONEMatch(String str) {
        if (str != null) {
            addHeader(ProtectedSandApp.s("㩶\u0001"), str);
        }
    }

    public void setIfUnmodifiedSince(String str) {
        if (str != null) {
            addHeader(ProtectedSandApp.s("㩷\u0001"), str);
        }
    }

    public void setObjectKeySimplifyCheck(boolean z4) {
        this.objectKeySimplifyCheck = z4;
    }

    public void setProgressListener(CosXmlProgressListener cosXmlProgressListener) {
        this.progressListener = cosXmlProgressListener;
    }

    public void setRange(long j4, long j5) {
        if (j4 < 0) {
            j4 = 0;
        }
        Range range = new Range(j4, j5);
        Map<String, List<String>> map = this.requestHeaders;
        String s4 = ProtectedSandApp.s("㩸\u0001");
        map.remove(s4);
        addHeader(s4, range.getRange());
        this.range = range;
    }

    public void setRspCacheControl(String str) {
        this.rspCacheControl = str;
    }

    public void setRspContentDispositon(String str) {
        this.rspContentDisposition = str;
    }

    public void setRspContentEncoding(String str) {
        this.rspContentEncoding = str;
    }

    public void setRspContentLanguage(String str) {
        this.rspContentLanguage = str;
    }

    public void setRspContentType(String str) {
        this.rspContentType = str;
    }

    public void setRspExpires(String str) {
        this.rspExpires = str;
    }

    public void setSaveFileName(String str) {
        this.saveFileName = str;
    }

    public void setSavePath(String str) {
        this.savePath = str;
    }

    @Override // com.tencent.cos.xml.model.object.TransferRequest
    public void setTrafficLimit(long j4) {
        addHeader(ProtectedSandApp.s("㩹\u0001"), String.valueOf(j4));
    }

    public void setVersionId(String str) {
        this.versionId = str;
    }

    @Override // com.tencent.cos.xml.model.CosXmlRequest
    protected RequestBodySerializer xmlBuilder() throws XmlPullParserException, IOException {
        return null;
    }

    public GetObjectRequest(String str, String str2, String str3, String str4) {
        super(str, str2);
        this.fileOffset = 0L;
        this.objectKeySimplifyCheck = true;
        this.savePath = str3;
        this.saveFileName = str4;
    }

    public void setRange(long j4) {
        setRange(j4, -1L);
    }

    public GetObjectRequest(String str, String str2, Uri uri) {
        super(str, str2);
        this.fileOffset = 0L;
        this.objectKeySimplifyCheck = true;
        this.fileContentUri = uri;
    }
}
