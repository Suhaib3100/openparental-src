package net.time4j.calendar.service;

import com.flashget.parentalcontrol.ProtectedSandApp;
import net.time4j.engine.a0;
import net.time4j.engine.h;
import net.time4j.engine.q;
import net.time4j.g1;
import net.time4j.i1;

/* compiled from: WeekdayRule.java */
/* loaded from: classes7.dex */
public class l<D extends net.time4j.engine.h> implements a0<D, g1> {

    /* renamed from: b, reason: collision with root package name */
    private final i1 f82657b;

    /* renamed from: c, reason: collision with root package name */
    private final e<D, net.time4j.engine.l<D>> f82658c;

    public l(i1 i1Var, e<D, net.time4j.engine.l<D>> eVar) {
        this.f82657b = i1Var;
        this.f82658c = eVar;
    }

    private static g1 i(long j4) {
        return g1.valueOf(net.time4j.base.c.d(j4 + 5, 7) + 1);
    }

    @Override // net.time4j.engine.a0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public q<?> getChildAtCeiling(D d5) {
        return null;
    }

    @Override // net.time4j.engine.a0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public q<?> getChildAtFloor(D d5) {
        return null;
    }

    @Override // net.time4j.engine.a0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public g1 getMaximum(D d5) {
        net.time4j.engine.l<D> apply = this.f82658c.apply(d5);
        return (d5.b() + 7) - ((long) getValue(d5).getValue(this.f82657b)) > apply.d() ? i(apply.d()) : this.f82657b.f().roll(6);
    }

    @Override // net.time4j.engine.a0
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public g1 getMinimum(D d5) {
        net.time4j.engine.l<D> apply = this.f82658c.apply(d5);
        return (d5.b() + 1) - ((long) getValue(d5).getValue(this.f82657b)) < apply.g() ? i(apply.g()) : this.f82657b.f();
    }

    @Override // net.time4j.engine.a0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public g1 getValue(D d5) {
        return i(d5.b());
    }

    @Override // net.time4j.engine.a0
    public boolean j(D d5, g1 g1Var) {
        if (g1Var == null) {
            return false;
        }
        long b5 = (d5.b() + g1Var.getValue(this.f82657b)) - getValue(d5).getValue(this.f82657b);
        net.time4j.engine.l<D> apply = this.f82658c.apply(d5);
        return b5 >= apply.g() && b5 <= apply.d();
    }

    @Override // net.time4j.engine.a0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public D withValue(D d5, g1 g1Var, boolean z4) {
        if (g1Var == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("鉦\u0001"));
        }
        long b5 = (d5.b() + g1Var.getValue(this.f82657b)) - getValue(d5).getValue(this.f82657b);
        net.time4j.engine.l<D> apply = this.f82658c.apply(d5);
        if (b5 < apply.g() || b5 > apply.d()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("鉥\u0001"));
        }
        return apply.e(b5);
    }
}
