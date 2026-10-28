package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty2;

/* compiled from: PropertyReference2.java */
/* loaded from: classes6.dex */
public abstract class h1 extends j1 implements KProperty2 {
    public h1() {
    }

    @Override // q3.p
    public Object g0(Object obj, Object obj2) {
        return m0(obj, obj2);
    }

    @Override // kotlin.reflect.KProperty2
    @SinceKotlin(version = "1.1")
    public Object r0(Object obj, Object obj2) {
        return ((KProperty2) x0()).r0(obj, obj2);
    }

    @Override // kotlin.jvm.internal.q
    protected KCallable t0() {
        return l1.v(this);
    }

    @SinceKotlin(version = "1.4")
    public h1(Class cls, String str, String str2, int i5) {
        super(q.f23594u, cls, str, str2, i5);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty2.b e() {
        return ((KProperty2) x0()).e();
    }
}
