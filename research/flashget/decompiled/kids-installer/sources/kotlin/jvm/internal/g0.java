package kotlin.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;

/* compiled from: FunctionReference.java */
/* loaded from: classes6.dex */
public class g0 extends q implements FunctionBase, KFunction {

    /* renamed from: v, reason: collision with root package name */
    private final int f23552v;

    /* renamed from: w, reason: collision with root package name */
    @SinceKotlin(version = "1.4")
    private final int f23553w;

    public g0(int i5) {
        this(i5, q.f23594u, null, null, null, 0);
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean B() {
        return x0().B();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean H() {
        return x0().H();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            return getName().equals(g0Var.getName()) && y0().equals(g0Var.y0()) && this.f23553w == g0Var.f23553w && this.f23552v == g0Var.f23552v && l0.g(v0(), g0Var.v0()) && l0.g(w0(), g0Var.w0());
        }
        if (obj instanceof KFunction) {
            return obj.equals(s0());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    /* renamed from: f */
    public int getF23582o() {
        return this.f23552v;
    }

    public int hashCode() {
        return y0().hashCode() + ((getName().hashCode() + (w0() == null ? 0 : w0().hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.internal.q, kotlin.reflect.KCallable, kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean o() {
        return x0().o();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean p() {
        return x0().p();
    }

    @Override // kotlin.reflect.KFunction
    @SinceKotlin(version = "1.1")
    public boolean q() {
        return x0().q();
    }

    @Override // kotlin.jvm.internal.q
    @SinceKotlin(version = "1.1")
    protected KCallable t0() {
        return l1.c(this);
    }

    public String toString() {
        KCallable s02 = s0();
        if (s02 != this) {
            return s02.toString();
        }
        if (ProtectedSandApp.s("绐").equals(getName())) {
            return ProtectedSandApp.s("绑");
        }
        return ProtectedSandApp.s("绒") + getName() + ProtectedSandApp.s("结");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.q
    @SinceKotlin(version = "1.1")
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public KFunction x0() {
        return (KFunction) super.x0();
    }

    @SinceKotlin(version = "1.1")
    public g0(int i5, Object obj) {
        this(i5, obj, null, null, null, 0);
    }

    @SinceKotlin(version = "1.4")
    public g0(int i5, Object obj, Class cls, String str, String str2, int i6) {
        super(obj, cls, str, str2, (i6 & 1) == 1);
        this.f23552v = i5;
        this.f23553w = i6 >> 1;
    }
}
