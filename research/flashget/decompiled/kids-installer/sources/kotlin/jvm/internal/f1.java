package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty1;

/* compiled from: PropertyReference1.java */
/* loaded from: classes6.dex */
public abstract class f1 extends j1 implements KProperty1 {
    public f1() {
    }

    @Override // kotlin.reflect.KProperty1
    @SinceKotlin(version = "1.1")
    public Object D(Object obj) {
        return ((KProperty1) x0()).D(obj);
    }

    @Override // q3.l
    public Object N(Object obj) {
        return get(obj);
    }

    @Override // kotlin.jvm.internal.q
    protected KCallable t0() {
        return l1.u(this);
    }

    @SinceKotlin(version = "1.1")
    public f1(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.KProperty
    public KProperty1.b e() {
        return ((KProperty1) x0()).e();
    }

    @SinceKotlin(version = "1.4")
    public f1(Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, i5);
    }
}
