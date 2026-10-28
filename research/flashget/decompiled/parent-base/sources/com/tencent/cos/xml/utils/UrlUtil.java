package com.tencent.cos.xml.utils;

import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.cos.xml.common.Range;
import com.tencent.cos.xml.model.tag.UrlUploadPolicy;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.http.HttpRequest;
import com.tencent.qcloud.core.http.HttpResult;
import com.tencent.qcloud.core.http.QCloudHttpClient;
import com.tencent.qcloud.core.util.QCloudHttpUtils;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes7.dex */
public class UrlUtil {
    public static UrlUploadPolicy getUrlUploadPolicy(String str) {
        if (!isUrl(str)) {
            return new UrlUploadPolicy(UrlUploadPolicy.Type.NOTSUPPORT, 0L);
        }
        try {
            URL url = new URL(str);
            try {
                HttpResult executeNow = QCloudHttpClient.getDefault().resolveRequest(new HttpRequest.Builder().url(url).method(ProtectedSandApp.s("儆\u0001")).addHeader(ProtectedSandApp.s("儇\u0001"), new Range(0L, 1L).getRange()).build()).executeNow();
                if (executeNow != null && executeNow.isSuccessful() && executeNow.headers() != null && executeNow.headers().size() > 0) {
                    String header = executeNow.header(ProtectedSandApp.s("儈\u0001"));
                    String header2 = executeNow.header(ProtectedSandApp.s("儉\u0001"));
                    if (!ProtectedSandApp.s("儊\u0001").equals(header) || TextUtils.isEmpty(header2)) {
                        String header3 = executeNow.header(ProtectedSandApp.s("儋\u0001"));
                        if (!TextUtils.isEmpty(header3)) {
                            return new UrlUploadPolicy(UrlUploadPolicy.Type.ENTIRETY, Long.parseLong(header3));
                        }
                    } else {
                        long[] parseContentRange = QCloudHttpUtils.parseContentRange(header2);
                        if (parseContentRange != null) {
                            return new UrlUploadPolicy(UrlUploadPolicy.Type.RANGE, parseContentRange[2]);
                        }
                    }
                }
                return new UrlUploadPolicy(UrlUploadPolicy.Type.NOTSUPPORT, 0L);
            } catch (QCloudClientException | QCloudServiceException unused) {
                return new UrlUploadPolicy(UrlUploadPolicy.Type.NOTSUPPORT, 0L);
            }
        } catch (MalformedURLException unused2) {
            return new UrlUploadPolicy(UrlUploadPolicy.Type.NOTSUPPORT, 0L);
        }
    }

    public static boolean isUrl(String str) {
        if (!TextUtils.isEmpty(str) && Patterns.WEB_URL.matcher(str).matches()) {
            return URLUtil.isHttpsUrl(str) || URLUtil.isHttpUrl(str);
        }
        return false;
    }
}
