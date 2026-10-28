package kotlin.jvm.internal;

import kotlin.reflect.q;

/* compiled from: PropertyReference1.java */
/* loaded from: classes7.dex */
public abstract class f1 extends j1 implements kotlin.reflect.q {
    public f1() {
    }

    @Override // kotlin.jvm.internal.q
    protected kotlin.reflect.c computeReflected() {
        return l1.u(this);
    }

    @Override // kotlin.reflect.q
    @kotlin.c1(version = "1.1")
    public Object g(Object obj) {
        return ((kotlin.reflect.q) getReflected()).g(obj);
    }

    @Override // ld.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @kotlin.c1(version = "1.1")
    public f1(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.o
    public q.b getGetter() {
        return ((kotlin.reflect.q) getReflected()).getGetter();
    }

    @kotlin.c1(version = "1.4")
    public f1(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, i4);
    }
}
