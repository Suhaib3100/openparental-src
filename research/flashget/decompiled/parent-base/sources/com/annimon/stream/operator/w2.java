package com.annimon.stream.operator;

/* compiled from: ObjTakeWhileIndexed.java */
/* loaded from: classes3.dex */
public class w2<T> extends com.annimon.stream.iterator.c<T> {

    /* renamed from: e, reason: collision with root package name */
    private final com.annimon.stream.iterator.a<? extends T> f41799e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.f0<? super T> f41800f;

    public w2(com.annimon.stream.iterator.a<? extends T> aVar, com.annimon.stream.function.f0<? super T> f0Var) {
        this.f41799e = aVar;
        this.f41800f = f0Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    @Override // com.annimon.stream.iterator.c
    protected void a() {
        boolean z4;
        if (this.f41799e.hasNext()) {
            com.annimon.stream.function.f0<? super T> f0Var = this.f41800f;
            int a5 = this.f41799e.a();
            T next = this.f41799e.next();
            this.f41516b = next;
            if (f0Var.a(a5, next)) {
                z4 = true;
                this.f41517c = z4;
            }
        }
        z4 = false;
        this.f41517c = z4;
    }
}
