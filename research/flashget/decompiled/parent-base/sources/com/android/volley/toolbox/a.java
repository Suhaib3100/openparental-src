package com.android.volley.toolbox;

import androidx.collection.p0;
import com.android.volley.AuthFailureError;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectTimeoutException;

/* compiled from: AdaptedHttpStack.java */
/* loaded from: classes3.dex */
class a extends e {

    /* renamed from: a, reason: collision with root package name */
    private final o f40965a;

    a(o oVar) {
        this.f40965a = oVar;
    }

    @Override // com.android.volley.toolbox.e
    public n b(com.android.volley.n<?> nVar, Map<String, String> map) throws IOException, AuthFailureError {
        try {
            HttpResponse a5 = this.f40965a.a(nVar, map);
            int statusCode = a5.getStatusLine().getStatusCode();
            Header[] allHeaders = a5.getAllHeaders();
            ArrayList arrayList = new ArrayList(allHeaders.length);
            for (Header header : allHeaders) {
                arrayList.add(new com.android.volley.i(header.getName(), header.getValue()));
            }
            if (a5.getEntity() == null) {
                return new n(statusCode, arrayList);
            }
            long contentLength = a5.getEntity().getContentLength();
            if (((int) contentLength) == contentLength) {
                return new n(statusCode, arrayList, (int) a5.getEntity().getContentLength(), a5.getEntity().getContent());
            }
            throw new IOException(p0.a(ProtectedSandApp.s("ڮ"), contentLength));
        } catch (ConnectTimeoutException e4) {
            throw new SocketTimeoutException(e4.getMessage());
        }
    }
}
