package com.google.common.graph;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.graph.a;
import java.util.Set;

/* compiled from: AbstractGraph.java */
@d9.a
@t
/* loaded from: classes6.dex */
public abstract class f<N> extends a<N> implements z<N> {
    @Override // com.google.common.graph.a, com.google.common.graph.k
    public Set c() {
        return new a.C0866a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a, com.google.common.graph.k
    public /* bridge */ /* synthetic */ boolean d(Object obj, Object obj2) {
        return super.d(obj, obj2);
    }

    @Override // com.google.common.graph.z
    public final boolean equals(@zc.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return e() == zVar.e() && m().equals(zVar.m()) && c().equals(zVar.c());
    }

    @Override // com.google.common.graph.a, com.google.common.graph.k
    public /* bridge */ /* synthetic */ boolean f(u uVar) {
        return super.f(uVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a, com.google.common.graph.k
    public /* bridge */ /* synthetic */ int g(Object obj) {
        return super.g(obj);
    }

    @Override // com.google.common.graph.z
    public final int hashCode() {
        return c().hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a, com.google.common.graph.k
    public /* bridge */ /* synthetic */ int i(Object obj) {
        return super.i(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a, com.google.common.graph.k
    public /* bridge */ /* synthetic */ Set l(Object obj) {
        return super.l(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.a, com.google.common.graph.k
    public /* bridge */ /* synthetic */ int n(Object obj) {
        return super.n(obj);
    }

    @Override // com.google.common.graph.a, com.google.common.graph.k
    public s p() {
        return s.i();
    }

    public String toString() {
        boolean e4 = e();
        boolean j4 = j();
        String valueOf = String.valueOf(m());
        String valueOf2 = String.valueOf(c());
        StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 59);
        sb.append(ProtectedSandApp.s("\uf5c3"));
        sb.append(e4);
        sb.append(ProtectedSandApp.s("\uf5c4"));
        sb.append(j4);
        return androidx.fragment.app.c.a(sb, ProtectedSandApp.s("\uf5c5"), valueOf, ProtectedSandApp.s("\uf5c6"), valueOf2);
    }
}
