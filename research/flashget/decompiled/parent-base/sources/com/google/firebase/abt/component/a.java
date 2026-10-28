package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.b0;
import androidx.annotation.m1;
import com.google.firebase.abt.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AbtComponent.java */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    @b0("this")
    private final Map<String, c> f58126a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Context f58127b;

    /* renamed from: c, reason: collision with root package name */
    private final y9.b<com.google.firebase.analytics.connector.a> f58128c;

    @m1(otherwise = 3)
    protected a(Context context, y9.b<com.google.firebase.analytics.connector.a> bVar) {
        this.f58127b = context;
        this.f58128c = bVar;
    }

    @m1
    protected c a(String str) {
        return new c(this.f58127b, this.f58128c, str);
    }

    public synchronized c b(String str) {
        try {
            if (!this.f58126a.containsKey(str)) {
                this.f58126a.put(str, a(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f58126a.get(str);
    }
}
