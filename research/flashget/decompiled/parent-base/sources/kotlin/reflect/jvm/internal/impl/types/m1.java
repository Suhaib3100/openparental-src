package kotlin.reflect.jvm.internal.impl.types;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: TypeProjectionBase.java */
/* loaded from: classes7.dex */
public abstract class m1 implements l1 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return b() == l1Var.b() && c() == l1Var.c() && getType().equals(l1Var.getType());
    }

    public int hashCode() {
        int hashCode = c().hashCode();
        if (t1.w(getType())) {
            return (hashCode * 31) + 19;
        }
        return (hashCode * 31) + (b() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (b()) {
            return ProtectedSandApp.s("羜\u0001");
        }
        if (c() == x1.INVARIANT) {
            return getType().toString();
        }
        return c() + ProtectedSandApp.s("羝\u0001") + getType();
    }
}
