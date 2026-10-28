package com.annimon.stream.operator;

/* compiled from: ObjDropWhileIndexed.java */
/* loaded from: classes3.dex */
public class x1<T> extends com.annimon.stream.iterator.c<T> {

    /* renamed from: e, reason: collision with root package name */
    private final com.annimon.stream.iterator.a<? extends T> f41810e;

    /* renamed from: f, reason: collision with root package name */
    private final com.annimon.stream.function.f0<? super T> f41811f;

    public x1(com.annimon.stream.iterator.a<? extends T> aVar, com.annimon.stream.function.f0<? super T> f0Var) {
        this.f41810e = aVar;
        this.f41811f = f0Var;
    }

    @Override // com.annimon.stream.iterator.c
    protected void a() {
        int a5;
        T next;
        if (!this.f41518d) {
            do {
                boolean hasNext = this.f41810e.hasNext();
                this.f41517c = hasNext;
                if (hasNext) {
                    a5 = this.f41810e.a();
                    next = this.f41810e.next();
                    this.f41516b = next;
                }
            } while (this.f41811f.a(a5, next));
            return;
        }
        boolean z4 = this.f41517c && this.f41810e.hasNext();
        this.f41517c = z4;
        if (z4) {
            this.f41516b = this.f41810e.next();
        }
    }
}
