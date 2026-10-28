package net.time4j.calendar.service;

import com.flashget.parentalcontrol.ProtectedSandApp;
import net.time4j.engine.p;
import net.time4j.engine.r;
import net.time4j.g1;
import net.time4j.i1;

/* compiled from: StdWeekdayElement.java */
/* loaded from: classes7.dex */
public class k<T extends r<T>> extends i<g1, T> {
    private static final long serialVersionUID = -84764920511581480L;

    /* renamed from: i, reason: collision with root package name */
    private final transient i1 f82656i;

    public k(Class<T> cls, i1 i1Var) {
        super(ProtectedSandApp.s("贇\u0001"), cls, g1.class, 'E');
        this.f82656i = i1Var;
    }

    @Override // net.time4j.calendar.service.i, net.time4j.engine.q
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public g1 getDefaultMaximum() {
        return this.f82656i.f().roll(6);
    }

    @Override // net.time4j.calendar.service.i, net.time4j.engine.q
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public g1 getDefaultMinimum() {
        return this.f82656i.f();
    }

    @Override // net.time4j.calendar.service.i, net.time4j.format.l
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public int b0(g1 g1Var) {
        return g1Var.getValue(this.f82656i);
    }

    @Override // net.time4j.engine.e, java.util.Comparator
    public int compare(p pVar, p pVar2) {
        int value = ((g1) pVar.r(this)).getValue(this.f82656i);
        int value2 = ((g1) pVar2.r(this)).getValue(this.f82656i);
        if (value < value2) {
            return -1;
        }
        return value == value2 ? 0 : 1;
    }
}
