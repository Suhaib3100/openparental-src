package kotlin.jvm.internal;

import kotlin.reflect.l;
import kotlin.reflect.q;

/* compiled from: MutablePropertyReference1.java */
/* loaded from: classes7.dex */
public abstract class w0 extends a1 implements kotlin.reflect.l {
    public w0() {
    }

    @Override // kotlin.jvm.internal.q
    protected kotlin.reflect.c computeReflected() {
        return l1.k(this);
    }

    @Override // kotlin.reflect.q
    @kotlin.c1(version = "1.1")
    public Object g(Object obj) {
        return ((kotlin.reflect.l) getReflected()).g(obj);
    }

    @Override // ld.l
    public Object invoke(Object obj) {
        return get(obj);
    }

    @kotlin.c1(version = "1.1")
    public w0(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.o
    public q.b getGetter() {
        return ((kotlin.reflect.l) getReflected()).getGetter();
    }

    @Override // kotlin.reflect.j
    public l.b getSetter() {
        return ((kotlin.reflect.l) getReflected()).getSetter();
    }

    @kotlin.c1(version = "1.4")
    public w0(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, i4);
    }
}
