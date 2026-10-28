package com.android.volley.toolbox;

import androidx.annotation.q0;
import com.android.volley.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.UnsupportedEncodingException;

/* compiled from: StringRequest.java */
/* loaded from: classes3.dex */
public class a0 extends com.android.volley.n<String> {

    /* renamed from: b, reason: collision with root package name */
    private final Object f40966b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    @androidx.annotation.b0("mLock")
    private q.b<String> f40967c;

    public a0(int i4, String str, q.b<String> bVar, @q0 q.a aVar) {
        super(i4, str, aVar);
        this.f40966b = new Object();
        this.f40967c = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.n
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void deliverResponse(String str) {
        q.b<String> bVar;
        synchronized (this.f40966b) {
            bVar = this.f40967c;
        }
        if (bVar != null) {
            bVar.onResponse(str);
        }
    }

    @Override // com.android.volley.n
    public void cancel() {
        super.cancel();
        synchronized (this.f40966b) {
            this.f40967c = null;
        }
    }

    @Override // com.android.volley.n
    protected com.android.volley.q<String> parseNetworkResponse(com.android.volley.l lVar) {
        String str;
        try {
            str = new String(lVar.f40900b, m.g(lVar.f40901c, ProtectedSandApp.s("ڬ")));
        } catch (UnsupportedEncodingException unused) {
            str = new String(lVar.f40900b);
        }
        return com.android.volley.q.c(str, m.e(lVar));
    }

    public a0(String str, q.b<String> bVar, @q0 q.a aVar) {
        this(0, str, bVar, aVar);
    }
}
