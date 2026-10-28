package com.annimon.stream.operator;

import java.util.Iterator;

/* compiled from: ObjTakeWhile.java */
/* loaded from: classes3.dex */
public class v2<T> extends com.annimon.stream.iterator.c<T> {

    /* renamed from: e, reason: collision with root package name */
    private final Iterator<? extends T> f41791e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.z0<? super T> f41792f;

    public v2(Iterator<? extends T> it, com.annimon.stream.function.z0<? super T> z0Var) {
        this.f41791e = it;
        this.f41792f = z0Var;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object] */
    @Override // com.annimon.stream.iterator.c
    protected void a() {
        boolean z4;
        if (this.f41791e.hasNext()) {
            com.annimon.stream.function.z0<? super T> z0Var = this.f41792f;
            T next = this.f41791e.next();
            this.f41516b = next;
            if (z0Var.test(next)) {
                z4 = true;
                this.f41517c = z4;
            }
        }
        z4 = false;
        this.f41517c = z4;
    }
}
