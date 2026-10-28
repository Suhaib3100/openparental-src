package org.apache.commons.lang3.builder;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.k1;

/* compiled from: DiffResult.java */
/* loaded from: classes6.dex */
public class e<T> implements Iterable<c<?>> {

    /* renamed from: f, reason: collision with root package name */
    public static final String f85747f = "";

    /* renamed from: g, reason: collision with root package name */
    private static final String f85748g = "differs from";

    /* renamed from: b, reason: collision with root package name */
    private final List<c<?>> f85749b;

    /* renamed from: c, reason: collision with root package name */
    private final T f85750c;

    /* renamed from: d, reason: collision with root package name */
    private final T f85751d;

    /* renamed from: e, reason: collision with root package name */
    private final t f85752e;

    e(T t4, T t5, List<c<?>> list, t tVar) {
        k1.b0(t4, "Left hand object cannot be null", new Object[0]);
        k1.b0(t5, "Right hand object cannot be null", new Object[0]);
        k1.b0(list, "List of differences cannot be null", new Object[0]);
        this.f85749b = list;
        this.f85750c = t4;
        this.f85751d = t5;
        if (tVar == null) {
            this.f85752e = t.f85780w;
        } else {
            this.f85752e = tVar;
        }
    }

    public List<c<?>> b() {
        return Collections.unmodifiableList(this.f85749b);
    }

    public T c() {
        return this.f85750c;
    }

    public int f() {
        return this.f85749b.size();
    }

    public T h() {
        return this.f85751d;
    }

    public t i() {
        return this.f85752e;
    }

    @Override // java.lang.Iterable
    public Iterator<c<?>> iterator() {
        return this.f85749b.iterator();
    }

    public String j(t tVar) {
        if (this.f85749b.isEmpty()) {
            return "";
        }
        r rVar = new r(this.f85750c, tVar, null);
        r rVar2 = new r(this.f85751d, tVar, null);
        for (c<?> cVar : this.f85749b) {
            rVar.o(cVar.h(), cVar.c());
            rVar2.o(cVar.h(), cVar.d());
        }
        return String.format("%s %s %s", rVar.toString(), "differs from", rVar2.toString());
    }

    public String toString() {
        return j(this.f85752e);
    }
}
