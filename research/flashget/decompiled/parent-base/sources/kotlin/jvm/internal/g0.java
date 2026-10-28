package kotlin.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: FunctionReference.java */
/* loaded from: classes7.dex */
public class g0 extends q implements e0, kotlin.reflect.i {

    /* renamed from: b, reason: collision with root package name */
    private final int f75310b;

    /* renamed from: c, reason: collision with root package name */
    @kotlin.c1(version = "1.4")
    private final int f75311c;

    public g0(int i4) {
        this(i4, q.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.reflect.i
    @kotlin.c1(version = "1.1")
    public boolean B() {
        return getReflected().B();
    }

    @Override // kotlin.jvm.internal.q
    @kotlin.c1(version = "1.1")
    protected kotlin.reflect.c computeReflected() {
        return l1.c(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            return getName().equals(g0Var.getName()) && getSignature().equals(g0Var.getSignature()) && this.f75311c == g0Var.f75311c && this.f75310b == g0Var.f75310b && l0.g(getBoundReceiver(), g0Var.getBoundReceiver()) && l0.g(getOwner(), g0Var.getOwner());
        }
        if (obj instanceof kotlin.reflect.i) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.e0
    public int getArity() {
        return this.f75310b;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.internal.q, kotlin.reflect.c, kotlin.reflect.i
    @kotlin.c1(version = "1.1")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    @Override // kotlin.reflect.i
    @kotlin.c1(version = "1.1")
    public boolean k() {
        return getReflected().k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.q
    @kotlin.c1(version = "1.1")
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.i getReflected() {
        return (kotlin.reflect.i) super.getReflected();
    }

    @Override // kotlin.reflect.i
    @kotlin.c1(version = "1.1")
    public boolean t() {
        return getReflected().t();
    }

    public String toString() {
        kotlin.reflect.c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if (ProtectedSandApp.s("摒\u0001").equals(getName())) {
            return ProtectedSandApp.s("摓\u0001");
        }
        return ProtectedSandApp.s("摔\u0001") + getName() + ProtectedSandApp.s("摕\u0001");
    }

    @Override // kotlin.reflect.i
    @kotlin.c1(version = "1.1")
    public boolean x() {
        return getReflected().x();
    }

    @kotlin.c1(version = "1.1")
    public g0(int i4, Object obj) {
        this(i4, obj, null, null, null, 0);
    }

    @kotlin.c1(version = "1.4")
    public g0(int i4, Object obj, Class cls, String str, String str2, int i5) {
        super(obj, cls, str, str2, (i5 & 1) == 1);
        this.f75310b = i4;
        this.f75311c = i5 >> 1;
    }
}
