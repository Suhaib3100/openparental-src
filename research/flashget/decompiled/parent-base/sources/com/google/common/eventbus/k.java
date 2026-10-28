package com.google.common.eventbus;

import java.lang.reflect.Method;

/* compiled from: SubscriberExceptionContext.java */
@e
/* loaded from: classes6.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private final f f56734a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f56735b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f56736c;

    /* renamed from: d, reason: collision with root package name */
    private final Method f56737d;

    k(f fVar, Object obj, Object obj2, Method method) {
        fVar.getClass();
        this.f56734a = fVar;
        obj.getClass();
        this.f56735b = obj;
        obj2.getClass();
        this.f56736c = obj2;
        method.getClass();
        this.f56737d = method;
    }

    public Object a() {
        return this.f56735b;
    }

    public f b() {
        return this.f56734a;
    }

    public Object c() {
        return this.f56736c;
    }

    public Method d() {
        return this.f56737d;
    }
}
