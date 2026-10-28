package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty0;

/* compiled from: MutablePropertyReference0.java */
/* loaded from: classes6.dex */
public abstract class u0 extends a1 implements KMutableProperty0 {
    public u0() {
    }

    @Override // q3.a
    public Object n() {
        return get();
    }

    @Override // kotlin.reflect.KProperty0
    @SinceKotlin(version = "1.1")
    public Object p0() {
        return ((KMutableProperty0) x0()).p0();
    }

    @Override // kotlin.jvm.internal.q
    protected KCallable t0() {
        return l1.j(this);
    }

    @SinceKotlin(version = "1.1")
    public u0(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty0.b e() {
        return ((KMutableProperty0) x0()).e();
    }

    @Override // kotlin.reflect.KMutableProperty
    public KMutableProperty0.b h() {
        return ((KMutableProperty0) x0()).h();
    }

    @SinceKotlin(version = "1.4")
    public u0(Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, i5);
    }
}
