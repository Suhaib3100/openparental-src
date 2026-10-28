package com.android.volley.toolbox;

import androidx.annotation.q0;
import com.android.volley.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.UnsupportedEncodingException;

/* compiled from: JsonRequest.java */
/* loaded from: classes3.dex */
public abstract class u<T> extends com.android.volley.n<T> {
    protected static final String PROTOCOL_CHARSET = ProtectedSandApp.s("۴");
    private static final String PROTOCOL_CONTENT_TYPE = String.format(ProtectedSandApp.s("۵"), ProtectedSandApp.s("۴"));

    @q0
    @androidx.annotation.b0("mLock")
    private q.b<T> mListener;
    private final Object mLock;

    @q0
    private final String mRequestBody;

    @Deprecated
    public u(String str, String str2, q.b<T> bVar, q.a aVar) {
        this(-1, str, str2, bVar, aVar);
    }

    @Override // com.android.volley.n
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    @Override // com.android.volley.n
    protected void deliverResponse(T t4) {
        q.b<T> bVar;
        synchronized (this.mLock) {
            bVar = this.mListener;
        }
        if (bVar != null) {
            bVar.onResponse(t4);
        }
    }

    @Override // com.android.volley.n
    public byte[] getBody() {
        String s4 = ProtectedSandApp.s("۴");
        try {
            String str = this.mRequestBody;
            if (str == null) {
                return null;
            }
            return str.getBytes(s4);
        } catch (UnsupportedEncodingException unused) {
            com.android.volley.t.g(ProtectedSandApp.s("۶"), this.mRequestBody, s4);
            return null;
        }
    }

    @Override // com.android.volley.n
    public String getBodyContentType() {
        return PROTOCOL_CONTENT_TYPE;
    }

    @Override // com.android.volley.n
    @Deprecated
    public byte[] getPostBody() {
        return getBody();
    }

    @Override // com.android.volley.n
    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @Override // com.android.volley.n
    protected abstract com.android.volley.q<T> parseNetworkResponse(com.android.volley.l lVar);

    public u(int i4, String str, @q0 String str2, q.b<T> bVar, @q0 q.a aVar) {
        super(i4, str, aVar);
        this.mLock = new Object();
        this.mListener = bVar;
        this.mRequestBody = str2;
    }
}
