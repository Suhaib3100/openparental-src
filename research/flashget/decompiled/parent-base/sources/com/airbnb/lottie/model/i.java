package com.airbnb.lottie.model;

import androidx.annotation.c1;
import androidx.annotation.q0;
import androidx.core.util.s;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: MutablePair.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public class i<T> {

    /* renamed from: a, reason: collision with root package name */
    @q0
    T f39095a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    T f39096b;

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public void b(T t4, T t5) {
        this.f39095a = t4;
        this.f39096b = t5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return a(sVar.f26881a, this.f39095a) && a(sVar.f26882b, this.f39096b);
    }

    public int hashCode() {
        T t4 = this.f39095a;
        int hashCode = t4 == null ? 0 : t4.hashCode();
        T t5 = this.f39096b;
        return hashCode ^ (t5 != null ? t5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ř"));
        sb.append(this.f39095a);
        sb.append(ProtectedSandApp.s("Ś"));
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.i.a(sb, this.f39096b, ProtectedSandApp.s("ś"));
    }
}
