package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty1;

/* compiled from: MutablePropertyReference1.java */
/* loaded from: classes6.dex */
public abstract class w0 extends a1 implements KMutableProperty1 {
    public w0() {
    }

    @Override // kotlin.reflect.KProperty1
    @SinceKotlin(version = "1.1")
    public Object D(Object obj) {
        return ((KMutableProperty1) x0()).D(obj);
    }

    @Override // q3.l
    public Object N(Object obj) {
        return get(obj);
    }

    @Override // kotlin.jvm.internal.q
    protected KCallable t0() {
        return l1.k(this);
    }

    @SinceKotlin(version = "1.1")
    public w0(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty1.b e() {
        return ((KMutableProperty1) x0()).e();
    }

    @Override // kotlin.reflect.KMutableProperty
    public KMutableProperty1.b h() {
        return ((KMutableProperty1) x0()).h();
    }

    @SinceKotlin(version = "1.4")
    public w0(Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, i5);
    }
}
