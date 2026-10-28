package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import net.time4j.engine.r;

/* compiled from: FractionOperator.java */
/* loaded from: classes7.dex */
final class s<T extends net.time4j.engine.r<T>> implements net.time4j.engine.v<T> {

    /* renamed from: d, reason: collision with root package name */
    private static final int f83518d = 1000;

    /* renamed from: e, reason: collision with root package name */
    private static final int f83519e = 1000000;

    /* renamed from: b, reason: collision with root package name */
    private final char f83520b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f83521c;

    s(char c5, boolean z4) {
        this.f83520b = c5;
        this.f83521c = z4;
    }

    @Override // net.time4j.engine.v
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public T apply(T t4) {
        if (this.f83520b == '9') {
            return t4;
        }
        q0<Integer, m0> q0Var = m0.G;
        int intValue = ((Integer) t4.r(q0Var)).intValue();
        int intValue2 = ((Integer) t4.g(q0Var)).intValue();
        char c5 = this.f83520b;
        if (c5 == '3') {
            return (T) t4.K(q0Var, Math.min(intValue2, ((intValue / 1000000) * 1000000) + (this.f83521c ? 999999 : 0)));
        }
        if (c5 == '6') {
            return (T) t4.K(q0Var, Math.min(intValue2, ((intValue / 1000) * 1000) + (this.f83521c ? 999 : 0)));
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("顋\u0001") + this.f83520b);
    }
}
