package com.annimon.stream.operator;

import java.util.Iterator;

/* compiled from: ObjConcat.java */
/* loaded from: classes3.dex */
public class t1<T> extends com.annimon.stream.iterator.c<T> {

    /* renamed from: e, reason: collision with root package name */
    private final Iterator<? extends T> f41770e;

    /* renamed from: f, reason: collision with root package name */
    private final Iterator<? extends T> f41771f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f41772g = true;

    public t1(Iterator<? extends T> it, Iterator<? extends T> it2) {
        this.f41770e = it;
        this.f41771f = it2;
    }

    @Override // com.annimon.stream.iterator.c
    protected void a() {
        if (this.f41772g) {
            if (this.f41770e.hasNext()) {
                this.f41516b = this.f41770e.next();
                this.f41517c = true;
                return;
            }
            this.f41772g = false;
        }
        if (!this.f41771f.hasNext()) {
            this.f41517c = false;
        } else {
            this.f41516b = this.f41771f.next();
            this.f41517c = true;
        }
    }
}
