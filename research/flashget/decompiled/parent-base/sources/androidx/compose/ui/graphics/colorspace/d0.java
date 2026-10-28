package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;

/* compiled from: TransferParameters.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0004\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\fJ\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\fJ\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJV\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001f\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b \u0010\fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b!\u0010\f¨\u0006\""}, d2 = {"Landroidx/compose/ui/graphics/colorspace/d0;", "", "", "gamma", "a", "b", "c", "d", "e", "f", "<init>", "(DDDDDDD)V", "()D", "g", "h", "(DDDDDDD)Landroidx/compose/ui/graphics/colorspace/d0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "p", "j", "k", "l", "m", "n", "o", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class d0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final double gamma;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final double a;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final double b;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final double c;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final double d;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final double e;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final double f;

    public d0(double d5, double d6, double d7, double d10, double d11, double d12, double d13) {
        this.gamma = d5;
        this.a = d6;
        this.b = d7;
        this.c = d10;
        this.d = d11;
        this.e = d12;
        this.f = d13;
        if (Double.isNaN(d6) || Double.isNaN(d7) || Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d5)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d11 < com.google.firebase.remoteconfig.p.f60679p || d11 > 1.0d) {
            throw new IllegalArgumentException(b0.a("Parameter d must be in the range [0..1], was ", d11));
        }
        if (d11 == com.google.firebase.remoteconfig.p.f60679p && (d6 == com.google.firebase.remoteconfig.p.f60679p || d5 == com.google.firebase.remoteconfig.p.f60679p)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d11 >= 1.0d && d10 == com.google.firebase.remoteconfig.p.f60679p) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d6 == com.google.firebase.remoteconfig.p.f60679p || d5 == com.google.firebase.remoteconfig.p.f60679p) && d10 == com.google.firebase.remoteconfig.p.f60679p) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d10 < com.google.firebase.remoteconfig.p.f60679p) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d6 < com.google.firebase.remoteconfig.p.f60679p || d5 < com.google.firebase.remoteconfig.p.f60679p) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public static d0 i(d0 d0Var, double d5, double d6, double d7, double d10, double d11, double d12, double d13, int i4, Object obj) {
        double d14 = (i4 & 1) != 0 ? d0Var.gamma : d5;
        double d15 = (i4 & 2) != 0 ? d0Var.a : d6;
        double d16 = (i4 & 4) != 0 ? d0Var.b : d7;
        double d17 = (i4 & 8) != 0 ? d0Var.c : d10;
        double d18 = (i4 & 16) != 0 ? d0Var.d : d11;
        double d19 = (i4 & 32) != 0 ? d0Var.e : d12;
        double d20 = (i4 & 64) != 0 ? d0Var.f : d13;
        d0Var.getClass();
        return new d0(d14, d15, d16, d17, d18, d19, d20);
    }

    /* renamed from: a, reason: from getter */
    public final double getGamma() {
        return this.gamma;
    }

    /* renamed from: b, reason: from getter */
    public final double getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final double getB() {
        return this.b;
    }

    /* renamed from: d, reason: from getter */
    public final double getC() {
        return this.c;
    }

    /* renamed from: e, reason: from getter */
    public final double getD() {
        return this.d;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) other;
        return Double.compare(this.gamma, d0Var.gamma) == 0 && Double.compare(this.a, d0Var.a) == 0 && Double.compare(this.b, d0Var.b) == 0 && Double.compare(this.c, d0Var.c) == 0 && Double.compare(this.d, d0Var.d) == 0 && Double.compare(this.e, d0Var.e) == 0 && Double.compare(this.f, d0Var.f) == 0;
    }

    /* renamed from: f, reason: from getter */
    public final double getE() {
        return this.e;
    }

    /* renamed from: g, reason: from getter */
    public final double getF() {
        return this.f;
    }

    @fg.l
    public final d0 h(double gamma, double a5, double b5, double c5, double d5, double e4, double f4) {
        return new d0(gamma, a5, b5, c5, d5, e4, f4);
    }

    public int hashCode() {
        return Double.hashCode(this.f) + c0.a(this.e, c0.a(this.d, c0.a(this.c, c0.a(this.b, c0.a(this.a, Double.hashCode(this.gamma) * 31, 31), 31), 31), 31), 31);
    }

    public final double j() {
        return this.a;
    }

    public final double k() {
        return this.b;
    }

    public final double l() {
        return this.c;
    }

    public final double m() {
        return this.d;
    }

    public final double n() {
        return this.e;
    }

    public final double o() {
        return this.f;
    }

    public final double p() {
        return this.gamma;
    }

    @fg.l
    public String toString() {
        return "TransferParameters(gamma=" + this.gamma + ", a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ", e=" + this.e + ", f=" + this.f + ')';
    }

    public /* synthetic */ d0(double d5, double d6, double d7, double d10, double d11, double d12, double d13, int i4, kotlin.jvm.internal.w wVar) {
        this(d5, d6, d7, d10, d11, (i4 & 32) != 0 ? 0.0d : d12, (i4 & 64) != 0 ? 0.0d : d13);
    }
}
