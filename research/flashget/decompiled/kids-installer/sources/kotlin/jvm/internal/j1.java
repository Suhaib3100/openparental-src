package kotlin.jvm.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;

/* compiled from: PropertyReference.java */
/* loaded from: classes6.dex */
public abstract class j1 extends q implements KProperty {

    /* renamed from: v, reason: collision with root package name */
    private final boolean f23561v;

    public j1() {
        this.f23561v = false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            j1 j1Var = (j1) obj;
            return w0().equals(j1Var.w0()) && getName().equals(j1Var.getName()) && y0().equals(j1Var.y0()) && l0.g(v0(), j1Var.v0());
        }
        if (obj instanceof KProperty) {
            return obj.equals(s0());
        }
        return false;
    }

    public int hashCode() {
        return y0().hashCode() + ((getName().hashCode() + (w0().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.KProperty
    @SinceKotlin(version = "1.1")
    public boolean l0() {
        return x0().l0();
    }

    @Override // kotlin.reflect.KProperty
    @SinceKotlin(version = "1.1")
    public boolean s() {
        return x0().s();
    }

    @Override // kotlin.jvm.internal.q
    public KCallable s0() {
        return this.f23561v ? this : super.s0();
    }

    public String toString() {
        KCallable s02 = s0();
        if (s02 != this) {
            return s02.toString();
        }
        return ProtectedSandApp.s("绣") + getName() + ProtectedSandApp.s("绤");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.q
    @SinceKotlin(version = "1.1")
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public KProperty x0() {
        if (this.f23561v) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("绥"));
        }
        return (KProperty) super.x0();
    }

    @SinceKotlin(version = "1.1")
    public j1(Object obj) {
        super(obj);
        this.f23561v = false;
    }

    @SinceKotlin(version = "1.4")
    public j1(Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, (i5 & 1) == 1);
        this.f23561v = (i5 & 2) == 2;
    }
}
