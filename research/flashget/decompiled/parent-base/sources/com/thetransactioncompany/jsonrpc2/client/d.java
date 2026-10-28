package com.thetransactioncompany.jsonrpc2.client;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* compiled from: RawResponse.java */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, List<String>> f72852a;

    /* renamed from: b, reason: collision with root package name */
    private int f72853b;

    /* renamed from: c, reason: collision with root package name */
    private String f72854c;

    /* renamed from: d, reason: collision with root package name */
    private int f72855d;

    /* renamed from: e, reason: collision with root package name */
    private String f72856e;

    /* renamed from: f, reason: collision with root package name */
    private String f72857f;

    /* renamed from: g, reason: collision with root package name */
    private String f72858g;

    private d() {
    }

    protected static d i(HttpURLConnection httpURLConnection) throws IOException {
        String contentEncoding = httpURLConnection.getContentEncoding();
        InputStream inputStream = (contentEncoding == null || !contentEncoding.equalsIgnoreCase(ProtectedSandApp.s("嶿\u0001"))) ? (contentEncoding == null || !contentEncoding.equalsIgnoreCase(ProtectedSandApp.s("巀\u0001"))) ? httpURLConnection.getInputStream() : new InflaterInputStream(httpURLConnection.getInputStream(), new Inflater(true)) : new GZIPInputStream(httpURLConnection.getInputStream());
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, ProtectedSandApp.s("巁\u0001")));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                d dVar = new d();
                dVar.f72858g = sb.toString();
                dVar.f72853b = httpURLConnection.getResponseCode();
                dVar.f72854c = httpURLConnection.getResponseMessage();
                dVar.f72852a = httpURLConnection.getHeaderFields();
                dVar.f72855d = httpURLConnection.getContentLength();
                dVar.f72856e = httpURLConnection.getContentType();
                dVar.f72857f = contentEncoding;
                return dVar;
            }
            sb.append(readLine);
            sb.append(System.getProperty(ProtectedSandApp.s("巂\u0001")));
        }
    }

    public String a() {
        return this.f72858g;
    }

    public String b() {
        return this.f72857f;
    }

    public int c() {
        return this.f72855d;
    }

    public String d() {
        return this.f72856e;
    }

    public String e(String str) {
        List<String> list = this.f72852a.get(str);
        if ((list.size() <= 0) || (list == null)) {
            return null;
        }
        return list.get(0);
    }

    public Map<String, List<String>> f() {
        return this.f72852a;
    }

    public int g() {
        return this.f72853b;
    }

    public String h() {
        return this.f72854c;
    }
}
