package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.b0;
import androidx.annotation.m1;
import com.google.firebase.abt.c;
import java.util.HashMap;
import java.util.Map;

/* compiled from: AbtComponent.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    @b0("this")
    private final Map<String, c> f15053a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Context f15054b;

    /* renamed from: c, reason: collision with root package name */
    private final o2.b<com.google.firebase.analytics.connector.a> f15055c;

    @m1(otherwise = 3)
    protected a(Context context, o2.b<com.google.firebase.analytics.connector.a> bVar) {
        this.f15054b = context;
        this.f15055c = bVar;
    }

    @m1
    protected c a(String str) {
        return new c(this.f15054b, this.f15055c, str);
    }

    public synchronized c b(String str) {
        if (!this.f15053a.containsKey(str)) {
            this.f15053a.put(str, a(str));
        }
        return this.f15053a.get(str);
    }
}
