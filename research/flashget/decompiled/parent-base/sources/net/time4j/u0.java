package net.time4j;

/* compiled from: SI.java */
/* loaded from: classes7.dex */
public enum u0 implements net.time4j.engine.w {
    SECONDS(1.0d),
    NANOSECONDS(1.0E-9d);

    private final double length;

    /* compiled from: SI.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83672a;

        static {
            int[] iArr = new int[u0.values().length];
            f83672a = iArr;
            try {
                iArr[u0.SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83672a[u0.NANOSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    u0(double d5) {
        this.length = d5;
    }

    public long between(d0 d0Var, d0 d0Var2) {
        d0.s0(d0Var);
        d0.s0(d0Var2);
        int i4 = a.f83672a[ordinal()];
        if (i4 == 1) {
            net.time4j.scale.f fVar = net.time4j.scale.f.UTC;
            long c5 = d0Var2.c(fVar) - d0Var.c(fVar);
            return c5 < 0 ? d0Var2.a() > d0Var.a() ? c5 + 1 : c5 : (c5 <= 0 || d0Var2.a() >= d0Var.a()) ? c5 : c5 - 1;
        }
        if (i4 != 2) {
            throw new UnsupportedOperationException();
        }
        net.time4j.scale.f fVar2 = net.time4j.scale.f.UTC;
        return net.time4j.base.c.f(net.time4j.base.c.i(net.time4j.base.c.m(d0Var2.c(fVar2), d0Var.c(fVar2)), 1000000000L), d0Var2.a() - d0Var.a());
    }

    @Override // net.time4j.engine.w
    public double getLength() {
        return this.length;
    }

    @Override // net.time4j.engine.w
    public boolean isCalendrical() {
        return false;
    }
}
