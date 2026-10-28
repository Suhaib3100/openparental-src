package net.time4j.tz.model;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import net.time4j.e0;
import net.time4j.g1;
import net.time4j.l0;
import net.time4j.m0;

/* compiled from: GregorianTimezoneRule.java */
@net.time4j.format.c("iso8601")
/* loaded from: classes7.dex */
public class g extends d implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: f, reason: collision with root package name */
    private final transient byte f83612f;

    protected g(e0 e0Var, int i4, i iVar, int i5) {
        super(i4, iVar, i5);
        this.f83612f = (byte) e0Var.getValue();
    }

    public static g n(e0 e0Var, int i4, int i5, i iVar, int i6) {
        return new f(e0Var, i4, i5, iVar, i6);
    }

    public static g o(e0 e0Var, int i4, m0 m0Var, i iVar, int i5) {
        return new f(e0Var, i4, m0Var.l(m0.D), iVar, i5);
    }

    public static g p(e0 e0Var, g1 g1Var, int i4, i iVar, int i5) {
        return new h(e0Var, g1Var, i4, iVar, i5);
    }

    public static g q(e0 e0Var, g1 g1Var, m0 m0Var, i iVar, int i4) {
        return new h(e0Var, g1Var, m0Var.l(m0.D), iVar, i4);
    }

    public static g r(e0 e0Var, int i4, g1 g1Var, int i5, i iVar, int i6) {
        return new c(e0Var, i4, g1Var, i5, iVar, i6, true);
    }

    public static g s(e0 e0Var, int i4, g1 g1Var, m0 m0Var, i iVar, int i5) {
        return r(e0Var, i4, g1Var, m0Var.l(m0.D), iVar, i5);
    }

    public static g t(e0 e0Var, int i4, g1 g1Var, int i5, i iVar, int i6) {
        return new c(e0Var, i4, g1Var, i5, iVar, i6, false);
    }

    public static g u(e0 e0Var, int i4, g1 g1Var, m0 m0Var, i iVar, int i5) {
        return t(e0Var, i4, g1Var, m0Var.l(m0.D), iVar, i5);
    }

    @Override // net.time4j.tz.model.d
    protected String a() {
        return ProtectedSandApp.s("餇\u0001");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // net.time4j.tz.model.d
    public final l0 b(int i4) {
        return (l0) j(i4).W(c(), net.time4j.h.DAYS);
    }

    @Override // net.time4j.tz.model.d
    protected int h(long j4) {
        return (int) (net.time4j.base.b.l(j4) >> 32);
    }

    @Override // net.time4j.tz.model.d
    protected int i(net.time4j.base.a aVar) {
        return aVar.o();
    }

    protected l0 j(int i4) {
        throw new AbstractMethodError(ProtectedSandApp.s("餈\u0001"));
    }

    public e0 k() {
        return e0.valueOf(this.f83612f);
    }

    byte l() {
        return this.f83612f;
    }

    protected boolean m(g gVar) {
        return f().equals(gVar.f()) && c() == gVar.c() && d() == gVar.d() && e() == gVar.e() && this.f83612f == gVar.f83612f;
    }
}
