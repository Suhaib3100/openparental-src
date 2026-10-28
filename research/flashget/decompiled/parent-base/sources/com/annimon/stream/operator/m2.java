package com.annimon.stream.operator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: ObjMerge.java */
/* loaded from: classes3.dex */
public class m2<T> extends com.annimon.stream.iterator.d<T> {

    /* renamed from: b, reason: collision with root package name */
    private final Iterator<? extends T> f41697b;

    /* renamed from: c, reason: collision with root package name */
    private final Iterator<? extends T> f41698c;

    /* renamed from: d, reason: collision with root package name */
    private final com.annimon.stream.function.b<? super T, ? super T, b> f41699d;

    /* renamed from: e, reason: collision with root package name */
    private final Queue<T> f41700e = new LinkedList();

    /* renamed from: f, reason: collision with root package name */
    private final Queue<T> f41701f = new LinkedList();

    /* compiled from: ObjMerge.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41702a;

        static {
            int[] iArr = new int[b.values().length];
            f41702a = iArr;
            try {
                iArr[b.TAKE_FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41702a[b.TAKE_SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: ObjMerge.java */
    public enum b {
        TAKE_FIRST,
        TAKE_SECOND
    }

    public m2(Iterator<? extends T> it, Iterator<? extends T> it2, com.annimon.stream.function.b<? super T, ? super T, b> bVar) {
        this.f41697b = it;
        this.f41698c = it2;
        this.f41699d = bVar;
    }

    private T b(T t4, T t5) {
        if (a.f41702a[this.f41699d.apply(t4, t5).ordinal()] != 1) {
            this.f41700e.add(t4);
            return t5;
        }
        this.f41701f.add(t5);
        return t4;
    }

    @Override // com.annimon.stream.iterator.d
    public T a() {
        if (!this.f41700e.isEmpty()) {
            T poll = this.f41700e.poll();
            return this.f41698c.hasNext() ? b(poll, this.f41698c.next()) : poll;
        }
        if (this.f41701f.isEmpty()) {
            return !this.f41697b.hasNext() ? this.f41698c.next() : !this.f41698c.hasNext() ? this.f41697b.next() : b(this.f41697b.next(), this.f41698c.next());
        }
        T poll2 = this.f41701f.poll();
        return this.f41697b.hasNext() ? b(this.f41697b.next(), poll2) : poll2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return !this.f41700e.isEmpty() || !this.f41701f.isEmpty() || this.f41697b.hasNext() || this.f41698c.hasNext();
    }
}
