package com.annimon.stream.operator;

import java.util.Iterator;

/* compiled from: ObjTakeUntil.java */
/* loaded from: classes3.dex */
public class t2<T> extends com.annimon.stream.iterator.c<T> {

    /* renamed from: e, reason: collision with root package name */
    private final Iterator<? extends T> f41773e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.z0<? super T> f41774f;

    public t2(Iterator<? extends T> it, com.annimon.stream.function.z0<? super T> z0Var) {
        this.f41773e = it;
        this.f41774f = z0Var;
    }

    @Override // com.annimon.stream.iterator.c
    protected void a() {
        boolean z4 = this.f41773e.hasNext() && !(this.f41518d && this.f41774f.test(this.f41516b));
        this.f41517c = z4;
        if (z4) {
            this.f41516b = this.f41773e.next();
        }
    }
}
