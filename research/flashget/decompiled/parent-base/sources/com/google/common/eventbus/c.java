package com.google.common.eventbus;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.d0;

/* compiled from: DeadEvent.java */
@e
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f56711a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f56712b;

    public c(Object obj, Object obj2) {
        obj.getClass();
        this.f56711a = obj;
        obj2.getClass();
        this.f56712b = obj2;
    }

    public Object a() {
        return this.f56712b;
    }

    public Object b() {
        return this.f56711a;
    }

    public String toString() {
        return d0.c(this).f(ProtectedSandApp.s("\uf599"), this.f56711a).f(ProtectedSandApp.s("\uf59a"), this.f56712b).toString();
    }
}
