package com.google.common.reflect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* compiled from: TypeParameter.java */
@d
/* loaded from: classes6.dex */
public abstract class m<T> extends l<T> {

    /* renamed from: b, reason: collision with root package name */
    final TypeVariable<?> f57584b;

    protected m() {
        Type a5 = a();
        l0.u(a5 instanceof TypeVariable, ProtectedSandApp.s("洛"), a5);
        this.f57584b = (TypeVariable) a5;
    }

    public final boolean equals(@zc.a Object obj) {
        if (obj instanceof m) {
            return this.f57584b.equals(((m) obj).f57584b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f57584b.hashCode();
    }

    public String toString() {
        return this.f57584b.toString();
    }
}
