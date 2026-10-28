package com.annimon.stream.operator;

/* compiled from: ObjTakeUntilIndexed.java */
/* loaded from: classes3.dex */
public class u2<T> extends com.annimon.stream.iterator.c<T> {

    /* renamed from: e, reason: collision with root package name */
    private final com.annimon.stream.iterator.a<? extends T> f41781e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.f0<? super T> f41782f;

    public u2(com.annimon.stream.iterator.a<? extends T> aVar, com.annimon.stream.function.f0<? super T> f0Var) {
        this.f41781e = aVar;
        this.f41782f = f0Var;
    }

    @Override // com.annimon.stream.iterator.c
    protected void a() {
        boolean z4 = this.f41781e.hasNext() && !(this.f41518d && this.f41782f.a(this.f41781e.a(), this.f41516b));
        this.f41517c = z4;
        if (z4) {
            this.f41516b = this.f41781e.next();
        }
    }
}
