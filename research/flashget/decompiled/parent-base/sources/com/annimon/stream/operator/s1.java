package com.annimon.stream.operator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ObjChunkBy.java */
/* loaded from: classes3.dex */
public class s1<T, K> extends com.annimon.stream.iterator.d<List<T>> {

    /* renamed from: b, reason: collision with root package name */
    private final Iterator<? extends T> f41758b;

    /* renamed from: c, reason: collision with root package name */
    private final com.annimon.stream.function.q<? super T, ? extends K> f41759c;

    /* renamed from: d, reason: collision with root package name */
    private T f41760d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f41761e;

    public s1(Iterator<? extends T> it, com.annimon.stream.function.q<? super T, ? extends K> qVar) {
        this.f41758b = it;
        this.f41759c = qVar;
    }

    private T c() {
        T peek = peek();
        this.f41761e = false;
        return peek;
    }

    private T peek() {
        if (!this.f41761e) {
            this.f41760d = this.f41758b.next();
            this.f41761e = true;
        }
        return this.f41760d;
    }

    @Override // com.annimon.stream.iterator.d
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public List<T> a() {
        K apply = this.f41759c.apply(peek());
        ArrayList arrayList = new ArrayList();
        do {
            arrayList.add(c());
            if (!this.f41758b.hasNext()) {
                break;
            }
        } while (apply.equals(this.f41759c.apply(peek())));
        return arrayList;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f41761e || this.f41758b.hasNext();
    }
}
