package kotlin.jvm.internal;

import kotlin.reflect.r;

/* compiled from: PropertyReference2.java */
/* loaded from: classes7.dex */
public abstract class h1 extends j1 implements kotlin.reflect.r {
    public h1() {
    }

    @Override // kotlin.jvm.internal.q
    protected kotlin.reflect.c computeReflected() {
        return l1.v(this);
    }

    @Override // kotlin.reflect.r
    @kotlin.c1(version = "1.1")
    public Object d0(Object obj, Object obj2) {
        return ((kotlin.reflect.r) getReflected()).d0(obj, obj2);
    }

    @Override // ld.p
    public Object invoke(Object obj, Object obj2) {
        return L(obj, obj2);
    }

    @kotlin.c1(version = "1.4")
    public h1(Class cls, String str, String str2, int i4) {
        super(q.NO_RECEIVER, cls, str, str2, i4);
    }

    @Override // kotlin.reflect.o
    public r.b getGetter() {
        return ((kotlin.reflect.r) getReflected()).getGetter();
    }
}
