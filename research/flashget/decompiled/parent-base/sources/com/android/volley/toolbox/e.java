package com.android.volley.toolbox;

import com.android.volley.AuthFailureError;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

/* compiled from: BaseHttpStack.java */
/* loaded from: classes3.dex */
public abstract class e implements o {
    @Override // com.android.volley.toolbox.o
    @Deprecated
    public final HttpResponse a(com.android.volley.n<?> nVar, Map<String, String> map) throws IOException, AuthFailureError {
        n b5 = b(nVar, map);
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse(new BasicStatusLine(new ProtocolVersion(ProtectedSandApp.s("ڭ"), 1, 1), b5.e(), ""));
        ArrayList arrayList = new ArrayList();
        for (com.android.volley.i iVar : b5.d()) {
            arrayList.add(new BasicHeader(iVar.a(), iVar.b()));
        }
        basicHttpResponse.setHeaders((Header[]) arrayList.toArray(new Header[0]));
        InputStream a5 = b5.a();
        if (a5 != null) {
            BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
            basicHttpEntity.setContent(a5);
            basicHttpEntity.setContentLength(b5.c());
            basicHttpResponse.setEntity(basicHttpEntity);
        }
        return basicHttpResponse;
    }

    public abstract n b(com.android.volley.n<?> nVar, Map<String, String> map) throws IOException, AuthFailureError;
}
