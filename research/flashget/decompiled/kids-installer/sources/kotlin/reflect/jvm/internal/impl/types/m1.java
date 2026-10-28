package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: TypeProjectionBase.java */
/* loaded from: classes6.dex */
public abstract class m1 implements l1 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return c() == l1Var.c() && b() == l1Var.b() && getType().equals(l1Var.getType());
    }

    public int hashCode() {
        int hashCode = b().hashCode();
        if (t1.w(getType())) {
            return (hashCode * 31) + 19;
        }
        return (hashCode * 31) + (c() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (c()) {
            return ProtectedSandApp.s("襝");
        }
        if (b() == x1.INVARIANT) {
            return getType().toString();
        }
        return b() + ProtectedSandApp.s("襞") + getType();
    }
}
