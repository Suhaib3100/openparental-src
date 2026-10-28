package com.tencent.qcloud.core.auth;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.stats.a;
import com.tencent.qcloud.core.common.QCloudAuthenticationException;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.http.QCloudHttpRequest;
import java.net.URL;
import java.util.Locale;

/* loaded from: classes7.dex */
public class COSXmlSigner implements QCloudSigner {
    static final String COS_SESSION_TOKEN = ProtectedSandApp.s("壩\u0001");

    private void addAuthInHeader(QCloudHttpRequest qCloudHttpRequest, QCloudCredentials qCloudCredentials, String str) {
        String s4 = ProtectedSandApp.s("壤\u0001");
        qCloudHttpRequest.removeHeader(s4);
        qCloudHttpRequest.addHeader(s4, str);
        if (qCloudCredentials instanceof SessionQCloudCredentials) {
            String sessionTokenKey = getSessionTokenKey();
            qCloudHttpRequest.removeHeader(sessionTokenKey);
            qCloudHttpRequest.addHeader(sessionTokenKey, ((SessionQCloudCredentials) qCloudCredentials).getToken());
        }
    }

    private void addAuthInPara(QCloudHttpRequest qCloudHttpRequest, QCloudCredentials qCloudCredentials, String str) {
        String concat;
        URL url = qCloudHttpRequest.url();
        if (qCloudCredentials instanceof SessionQCloudCredentials) {
            str = str.concat(ProtectedSandApp.s("壥\u0001")).concat(ProtectedSandApp.s("壦\u0001")).concat(((SessionQCloudCredentials) qCloudCredentials).getToken());
        }
        String query = url.getQuery();
        String url2 = url.toString();
        int indexOf = url2.indexOf(63);
        if (indexOf < 0) {
            concat = url2.concat(ProtectedSandApp.s("壧\u0001")).concat(str);
        } else {
            int a5 = a.a(query, indexOf, 1);
            concat = url2.substring(0, a5).concat(ProtectedSandApp.s("壨\u0001")).concat(str).concat(url2.substring(a5));
        }
        qCloudHttpRequest.setUrl(concat);
    }

    private String signature(String str, String str2) {
        byte[] hmacSha1 = Utils.hmacSha1(str, str2);
        return hmacSha1 != null ? new String(Utils.encodeHex(hmacSha1)) : "";
    }

    protected String getSessionTokenKey() {
        return ProtectedSandApp.s("壩\u0001");
    }

    @Override // com.tencent.qcloud.core.auth.QCloudSigner
    public void sign(QCloudHttpRequest qCloudHttpRequest, QCloudCredentials qCloudCredentials) throws QCloudClientException {
        if (qCloudCredentials == null) {
            throw new QCloudClientException(new QCloudAuthenticationException(ProtectedSandApp.s("壱\u0001")));
        }
        COSXmlSignSourceProvider cOSXmlSignSourceProvider = (COSXmlSignSourceProvider) qCloudHttpRequest.getSignProvider();
        if (cOSXmlSignSourceProvider == null) {
            throw new QCloudClientException(new QCloudAuthenticationException(ProtectedSandApp.s("声\u0001")));
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("壪\u0001"));
        QCloudLifecycleCredentials qCloudLifecycleCredentials = (QCloudLifecycleCredentials) qCloudCredentials;
        String keyTime = qCloudHttpRequest.getKeyTime();
        if (keyTime == null) {
            keyTime = qCloudLifecycleCredentials.getKeyTime();
        }
        cOSXmlSignSourceProvider.setSignTime(keyTime);
        String signature = signature(cOSXmlSignSourceProvider.source(qCloudHttpRequest), qCloudLifecycleCredentials.getSignKey());
        sb.append(qCloudCredentials.getSecretId());
        sb.append(ProtectedSandApp.s("士\u0001"));
        sb.append(keyTime);
        sb.append(ProtectedSandApp.s("壬\u0001"));
        sb.append(qCloudLifecycleCredentials.getKeyTime());
        sb.append(ProtectedSandApp.s("壭\u0001"));
        String realHeaderList = cOSXmlSignSourceProvider.getRealHeaderList();
        Locale locale = Locale.ROOT;
        sb.append(realHeaderList.toLowerCase(locale));
        sb.append(ProtectedSandApp.s("壮\u0001"));
        sb.append(cOSXmlSignSourceProvider.getRealParameterList().toLowerCase(locale));
        sb.append(ProtectedSandApp.s("壯\u0001"));
        sb.append(signature);
        String sb2 = sb.toString();
        if (qCloudHttpRequest.isSignInUrl()) {
            addAuthInPara(qCloudHttpRequest, qCloudCredentials, sb2);
        } else {
            addAuthInHeader(qCloudHttpRequest, qCloudCredentials, sb2);
        }
        cOSXmlSignSourceProvider.onSignRequestSuccess(qCloudHttpRequest, qCloudCredentials, sb2);
    }
}
