package com.tencent.qcloud.core.util;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.NoRouteToHostException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLHandshakeException;

/* loaded from: classes7.dex */
public class QCloudHttpUtils {
    public static Map<String, List<String>> getDecodedQueryPair(URL url) {
        int i4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (url.getQuery() != null) {
            for (String str : url.getQuery().split(ProtectedSandApp.s("媽\u0001"))) {
                int indexOf = str.indexOf(ProtectedSandApp.s("媾\u0001"));
                String urlDecodeString = indexOf > 0 ? urlDecodeString(str.substring(0, indexOf)) : str;
                if (!linkedHashMap.containsKey(urlDecodeString)) {
                    linkedHashMap.put(urlDecodeString, new LinkedList());
                }
                ((List) linkedHashMap.get(urlDecodeString)).add((indexOf <= 0 || str.length() <= (i4 = indexOf + 1)) ? null : urlDecodeString(str.substring(i4)));
            }
        }
        return linkedHashMap;
    }

    public static Map<String, List<String>> getQueryPair(URL url) {
        int i4;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (url.getQuery() != null) {
            for (String str : url.getQuery().split(ProtectedSandApp.s("媽\u0001"))) {
                int indexOf = str.indexOf(ProtectedSandApp.s("媾\u0001"));
                String substring = indexOf > 0 ? str.substring(0, indexOf) : str;
                if (!linkedHashMap.containsKey(substring)) {
                    linkedHashMap.put(substring, new LinkedList());
                }
                ((List) linkedHashMap.get(substring)).add((indexOf <= 0 || str.length() <= (i4 = indexOf + 1)) ? null : str.substring(i4));
            }
        }
        return linkedHashMap;
    }

    public static boolean isNetworkConditionException(Throwable th) {
        return (th instanceof UnknownHostException) || (th instanceof SocketTimeoutException) || (th instanceof ConnectException) || (th instanceof HttpRetryException) || (th instanceof NoRouteToHostException) || ((th instanceof SSLHandshakeException) && !(th.getCause() instanceof CertificateException));
    }

    public static long[] parseContentRange(String str) {
        if (QCloudStringUtils.isEmpty(str)) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(ProtectedSandApp.s("媿\u0001"));
        int indexOf = str.indexOf(ProtectedSandApp.s("嫀\u0001"));
        int indexOf2 = str.indexOf(ProtectedSandApp.s("嫁\u0001"));
        if (lastIndexOf == -1 || indexOf == -1 || indexOf2 == -1) {
            return null;
        }
        return new long[]{Long.parseLong(str.substring(lastIndexOf + 1, indexOf)), Long.parseLong(str.substring(indexOf + 1, indexOf2)), Long.parseLong(str.substring(indexOf2 + 1))};
    }

    public static String queryParametersString(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z4 = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!z4) {
                sb.append(ProtectedSandApp.s("媽\u0001"));
            }
            sb.append(entry.getKey() + ProtectedSandApp.s("媾\u0001") + entry.getValue());
            z4 = false;
        }
        return sb.toString();
    }

    public static Map<String, List<String>> transformToMultiMap(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(entry.getValue());
            hashMap.put(entry.getKey(), arrayList);
        }
        return hashMap;
    }

    public static String urlDecodeString(String str) {
        try {
            return URLDecoder.decode(str, ProtectedSandApp.s("嫂\u0001"));
        } catch (UnsupportedEncodingException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public static String urlEncodeString(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            String[] split = str.split(ProtectedSandApp.s("媿\u0001"), -1);
            int length = split.length;
            for (int i4 = 0; i4 < length; i4++) {
                String s4 = ProtectedSandApp.s("嫃\u0001");
                if (i4 == 0 && "".equals(split[i4])) {
                    sb.append(s4);
                } else {
                    if (length > 1 && i4 == length - 1 && "".equals(split[i4])) {
                        break;
                    }
                    sb.append(URLEncoder.encode(split[i4], ProtectedSandApp.s("嫂\u0001")).replace(ProtectedSandApp.s("嫄\u0001"), ProtectedSandApp.s("嫅\u0001")));
                    if (i4 != length - 1) {
                        sb.append(s4);
                    }
                }
            }
            return sb.toString().replaceAll(ProtectedSandApp.s("嫆\u0001"), ProtectedSandApp.s("嫇\u0001"));
        } catch (UnsupportedEncodingException e4) {
            e4.printStackTrace();
            return null;
        }
    }

    public static String urlEncodeWithSlash(String str) {
        if (str == null || str.length() <= 0) {
            return str;
        }
        String s4 = ProtectedSandApp.s("嫁\u0001");
        if (str.equals(s4)) {
            return str;
        }
        String[] split = str.split(s4);
        for (int i4 = 0; i4 < split.length; i4++) {
            split[i4] = urlEncodeString(split[i4]);
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : split) {
            sb.append(str2);
            sb.append(s4);
        }
        if (!str.endsWith(s4)) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
