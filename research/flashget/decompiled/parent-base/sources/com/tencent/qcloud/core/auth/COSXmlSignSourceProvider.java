package com.tencent.qcloud.core.auth;

import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.http.HttpConfiguration;
import com.tencent.qcloud.core.http.HttpRequest;
import com.tencent.qcloud.core.util.QCloudHttpUtils;
import com.tencent.qcloud.core.util.QCloudStringUtils;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import kotlin.text.m0;

/* loaded from: classes7.dex */
public class COSXmlSignSourceProvider implements QCloudSignSourceProvider {
    private Map<String, List<String>> headerPairs;
    private String signTime;
    private final List<String> needToSignHeaders = Arrays.asList(ProtectedSandApp.s("壊\u0001"), ProtectedSandApp.s("壋\u0001"), ProtectedSandApp.s("壌\u0001"), ProtectedSandApp.s("壍\u0001"), ProtectedSandApp.s("壎\u0001"), ProtectedSandApp.s("壏\u0001"), ProtectedSandApp.s("壐\u0001"), ProtectedSandApp.s("壑\u0001"), ProtectedSandApp.s("壒\u0001"), ProtectedSandApp.s("壓\u0001"), ProtectedSandApp.s("壔\u0001"), ProtectedSandApp.s("壕\u0001"), ProtectedSandApp.s("壖\u0001"), ProtectedSandApp.s("壗\u0001"), ProtectedSandApp.s("壘\u0001"), ProtectedSandApp.s("壈\u0001"), ProtectedSandApp.s("壉\u0001"));
    private Set<String> headerKeysRequiredToSign = new HashSet();
    private Set<String> parametersRequiredToSign = new HashSet();
    private Set<String> headerKeysSigned = new HashSet();
    private Set<String> parametersSigned = new HashSet();

    private String headersStringForKeys(Map<String, List<String>> map, Set<String> set, Set<String> set2) {
        StringBuilder sb = new StringBuilder();
        LinkedList<String> linkedList = new LinkedList();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            linkedList.add(QCloudHttpUtils.urlEncodeString(it.next()).toLowerCase(Locale.ROOT));
        }
        Collections.sort(linkedList, new Comparator<String>() { // from class: com.tencent.qcloud.core.auth.COSXmlSignSourceProvider.2
            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                return str.compareTo(str2);
            }
        });
        Set<String> keySet = map.keySet();
        HashMap hashMap = new HashMap();
        for (String str : keySet) {
            hashMap.put(str.toLowerCase(Locale.ROOT), str);
        }
        boolean z4 = true;
        for (String str2 : linkedList) {
            List<String> list = map.get(hashMap.get(str2));
            if (list != null) {
                for (String str3 : list) {
                    if (!z4) {
                        sb.append(m0.amp);
                    }
                    Locale locale = Locale.ROOT;
                    set2.add(str2.toLowerCase(locale));
                    sb.append(str2.toLowerCase(locale));
                    sb.append('=');
                    if (!TextUtils.isEmpty(str3)) {
                        sb.append(QCloudHttpUtils.urlEncodeString(str3));
                    }
                    z4 = false;
                }
            }
        }
        return sb.toString();
    }

    private String queryStringForKeys(URL url, Set<String> set, Set<String> set2) {
        StringBuilder sb = new StringBuilder();
        LinkedList<String> linkedList = new LinkedList();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().toLowerCase(Locale.ROOT));
        }
        Collections.sort(linkedList, new Comparator<String>() { // from class: com.tencent.qcloud.core.auth.COSXmlSignSourceProvider.1
            @Override // java.util.Comparator
            public int compare(String str, String str2) {
                return str.compareTo(str2);
            }
        });
        Map<String, List<String>> decodedQueryPair = QCloudHttpUtils.getDecodedQueryPair(url);
        Set<String> keySet = decodedQueryPair.keySet();
        HashMap hashMap = new HashMap();
        for (String str : keySet) {
            hashMap.put(str.toLowerCase(Locale.ROOT), str);
        }
        boolean z4 = true;
        for (String str2 : linkedList) {
            List<String> list = decodedQueryPair.get(hashMap.get(str2));
            if (list != null) {
                for (String str3 : list) {
                    if (!z4) {
                        sb.append(m0.amp);
                    }
                    Locale locale = Locale.ROOT;
                    set2.add(str2.toLowerCase(locale));
                    sb.append(str2.toLowerCase(locale));
                    sb.append('=');
                    if (!TextUtils.isEmpty(str3)) {
                        sb.append(QCloudHttpUtils.urlEncodeString(str3));
                    }
                    z4 = false;
                }
            }
        }
        return sb.toString();
    }

    private String sortAndJoinSemicolon(Set<String> set) {
        if (set == null) {
            return "";
        }
        TreeSet treeSet = new TreeSet(set);
        StringBuilder sb = new StringBuilder();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!QCloudStringUtils.isEmpty(sb.toString())) {
                sb.append(ProtectedSandApp.s("壙\u0001"));
            }
            sb.append(str);
        }
        return sb.toString();
    }

    private Set<String> toLowerCase(Set<String> set) {
        if (set == null || set.size() <= 0) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if (str != null) {
                hashSet.add(str.toLowerCase(Locale.ROOT));
            }
        }
        return hashSet;
    }

    String getRealHeaderList() {
        return sortAndJoinSemicolon(this.headerKeysSigned);
    }

    String getRealParameterList() {
        return sortAndJoinSemicolon(this.parametersSigned);
    }

    public void header(String str) {
        this.headerKeysRequiredToSign.add(str);
    }

    public void headers(Set<String> set) {
        if (set != null) {
            this.headerKeysRequiredToSign.addAll(set);
        }
    }

    @Override // com.tencent.qcloud.core.auth.QCloudSignSourceProvider
    public <T> void onSignRequestSuccess(HttpRequest<T> httpRequest, QCloudCredentials qCloudCredentials, String str) {
    }

    public void parameter(String str) {
        this.parametersRequiredToSign.add(str);
    }

    public void parameters(Set<String> set) {
        if (set != null) {
            this.parametersRequiredToSign.addAll(set);
        }
    }

    public void setHeaderPairsForSign(Map<String, List<String>> map) {
        this.headerPairs = map;
    }

    void setSignTime(String str) {
        this.signTime = str;
    }

    @Override // com.tencent.qcloud.core.auth.QCloudSignSourceProvider
    public <T> String source(HttpRequest<T> httpRequest) throws QCloudClientException {
        String contentType;
        if (httpRequest == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        String s4 = ProtectedSandApp.s("壚\u0001");
        hashSet.add(s4);
        String s5 = ProtectedSandApp.s("壛\u0001");
        hashSet.add(s5);
        for (String str : httpRequest.headers().keySet()) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            if (this.needToSignHeaders.contains(lowerCase) || lowerCase.startsWith(ProtectedSandApp.s("壜\u0001")) || lowerCase.startsWith(ProtectedSandApp.s("壝\u0001"))) {
                hashSet.add(str);
            }
        }
        if (httpRequest.getNoSignHeaders() != null) {
            Iterator<String> it = httpRequest.getNoSignHeaders().iterator();
            while (it.hasNext()) {
                hashSet.remove(it.next());
            }
        }
        this.headerKeysRequiredToSign.addAll(hashSet);
        if (this.parametersRequiredToSign.size() < 1) {
            Map<String, List<String>> queryPair = QCloudHttpUtils.getQueryPair(httpRequest.url());
            Iterator<String> it2 = httpRequest.getNoSignParams().iterator();
            while (it2.hasNext()) {
                queryPair.remove(QCloudHttpUtils.urlDecodeString(it2.next()));
            }
            this.parametersRequiredToSign.addAll(queryPair.keySet());
        }
        if (this.headerKeysRequiredToSign.size() > 0) {
            Set<String> lowerCase2 = toLowerCase(this.headerKeysRequiredToSign);
            if (lowerCase2 != null && lowerCase2.contains(s4.toLowerCase(Locale.ROOT)) && httpRequest.getRequestBody() != null && !httpRequest.headers().containsKey(s4) && (contentType = httpRequest.contentType()) != null) {
                httpRequest.addHeader(s4, contentType);
            }
            if (lowerCase2 != null && lowerCase2.contains(s5.toLowerCase(Locale.ROOT)) && httpRequest.getRequestBody() != null) {
                try {
                    long contentLength = httpRequest.contentLength();
                    String s6 = ProtectedSandApp.s("壞\u0001");
                    if (contentLength != -1) {
                        httpRequest.addHeader(s5, Long.toString(contentLength));
                        httpRequest.removeHeader(s6);
                    } else {
                        httpRequest.addHeader(s6, ProtectedSandApp.s("壟\u0001"));
                        httpRequest.removeHeader(s5);
                    }
                } catch (IOException e4) {
                    throw new QCloudClientException(ProtectedSandApp.s("壠\u0001"), e4);
                }
            }
            if (lowerCase2 != null) {
                Locale locale = Locale.ROOT;
                String s7 = ProtectedSandApp.s("壡\u0001");
                if (lowerCase2.contains(s7.toLowerCase(locale))) {
                    httpRequest.addHeader(s7, HttpConfiguration.getGMTDate(new Date()));
                }
            }
        }
        StringBuilder sb = new StringBuilder(httpRequest.method().toLowerCase(Locale.ROOT));
        String s10 = ProtectedSandApp.s("壢\u0001");
        sb.append(s10);
        sb.append(QCloudHttpUtils.urlDecodeString(httpRequest.url().getPath()));
        sb.append(s10);
        sb.append(queryStringForKeys(httpRequest.url(), this.parametersRequiredToSign, this.parametersSigned));
        sb.append(s10);
        Map<String, List<String>> map = this.headerPairs;
        if (map == null) {
            map = httpRequest.headers();
        }
        this.headerPairs = map;
        sb.append(map != null ? headersStringForKeys(map, this.headerKeysRequiredToSign, this.headerKeysSigned) : "");
        sb.append(s10);
        return ProtectedSandApp.s("壣\u0001") + this.signTime + s10 + Utils.encodeHexString(Utils.sha1(sb.toString())) + s10;
    }
}
