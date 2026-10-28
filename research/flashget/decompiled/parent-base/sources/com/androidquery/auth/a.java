package com.androidquery.auth;

import android.content.Context;
import com.androidquery.callback.c;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.apache.http.HttpRequest;

/* compiled from: AccountHandle.java */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    private LinkedHashSet<com.androidquery.callback.a<?, ?>> f41088b;

    public void a(com.androidquery.callback.a<?, ?> aVar, HttpURLConnection httpURLConnection) {
    }

    public void b(com.androidquery.callback.a<?, ?> aVar, HttpRequest httpRequest) {
    }

    protected abstract void c();

    public synchronized void d(com.androidquery.callback.a<?, ?> aVar) {
        try {
            LinkedHashSet<com.androidquery.callback.a<?, ?>> linkedHashSet = this.f41088b;
            if (linkedHashSet == null) {
                LinkedHashSet<com.androidquery.callback.a<?, ?>> linkedHashSet2 = new LinkedHashSet<>();
                this.f41088b = linkedHashSet2;
                linkedHashSet2.add(aVar);
                c();
            } else {
                linkedHashSet.add(aVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract boolean e();

    public abstract boolean f(com.androidquery.callback.a<?, ?> aVar, c cVar);

    protected synchronized void g(Context context, int i4, String str) {
        try {
            LinkedHashSet<com.androidquery.callback.a<?, ?>> linkedHashSet = this.f41088b;
            if (linkedHashSet != null) {
                Iterator<com.androidquery.callback.a<?, ?>> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().A(i4, str);
                }
                this.f41088b = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public String h(String str) {
        return str;
    }

    public String i(String str) {
        return str;
    }

    public abstract boolean j(com.androidquery.callback.a<?, ?> aVar);

    protected synchronized void k(Context context) {
        try {
            LinkedHashSet<com.androidquery.callback.a<?, ?>> linkedHashSet = this.f41088b;
            if (linkedHashSet != null) {
                Iterator<com.androidquery.callback.a<?, ?>> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().f(context);
                }
                this.f41088b = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void l() {
    }
}
