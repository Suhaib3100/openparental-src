package kotlin.jvm.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: PropertyReference.java */
/* loaded from: classes7.dex */
public abstract class j1 extends q implements kotlin.reflect.o {
    private final boolean syntheticJavaProperty;

    public j1() {
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.q
    public kotlin.reflect.c compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            j1 j1Var = (j1) obj;
            return getOwner().equals(j1Var.getOwner()) && getName().equals(j1Var.getName()) && getSignature().equals(j1Var.getSignature()) && l0.g(getBoundReceiver(), j1Var.getBoundReceiver());
        }
        if (obj instanceof kotlin.reflect.o) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.o
    @kotlin.c1(version = "1.1")
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // kotlin.reflect.o
    @kotlin.c1(version = "1.1")
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        kotlin.reflect.c compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return ProtectedSandApp.s("擒\u0001") + getName() + ProtectedSandApp.s("擓\u0001");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.q
    @kotlin.c1(version = "1.1")
    public kotlin.reflect.o getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("擑\u0001"));
        }
        return (kotlin.reflect.o) super.getReflected();
    }

    @kotlin.c1(version = "1.1")
    public j1(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    @kotlin.c1(version = "1.4")
    public j1(Object obj, Class cls, String str, String str2, int i4) {
        super(obj, cls, str, str2, (i4 & 1) == 1);
        this.syntheticJavaProperty = (i4 & 2) == 2;
    }
}
