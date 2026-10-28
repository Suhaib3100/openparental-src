package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty0;

/* compiled from: PropertyReference0.java */
/* loaded from: classes6.dex */
public abstract class d1 extends j1 implements KProperty0 {
    public d1() {
    }

    @Override // q3.a
    public Object n() {
        return get();
    }

    @Override // kotlin.reflect.KProperty0
    @SinceKotlin(version = "1.1")
    public Object p0() {
        return ((KProperty0) x0()).p0();
    }

    @Override // kotlin.jvm.internal.q
    protected KCallable t0() {
        return l1.t(this);
    }

    @SinceKotlin(version = "1.1")
    public d1(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty0.b e() {
        return ((KProperty0) x0()).e();
    }

    @SinceKotlin(version = "1.4")
    public d1(Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, i5);
    }
}
