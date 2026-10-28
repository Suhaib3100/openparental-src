package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.c;

/* compiled from: SubpackagesScope.kt */
/* loaded from: classes6.dex */
public class h0 extends kotlin.reflect.jvm.internal.impl.resolve.scopes.i {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.h0 f24206b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.name.c f24207c;

    public h0(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var, @d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("舦"));
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("舧"));
        this.f24206b = h0Var;
        this.f24207c = cVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @d5.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
        return EmptySet.f23181o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @d5.d
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@d5.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @d5.d q3.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(dVar, ProtectedSandApp.s("舨"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("舩"));
        kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25977c.getClass();
        if (!dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f25982h)) {
            return EmptyList.f23167o;
        }
        if (this.f24207c.d() && dVar.l().contains(c.b.f25976a)) {
            return EmptyList.f23167o;
        }
        Collection<kotlin.reflect.jvm.internal.impl.name.c> t5 = this.f24206b.t(this.f24207c, lVar);
        ArrayList arrayList = new ArrayList(t5.size());
        Iterator<kotlin.reflect.jvm.internal.impl.name.c> it = t5.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.name.f g5 = it.next().g();
            kotlin.jvm.internal.l0.o(g5, ProtectedSandApp.s("航"));
            if (lVar.N(g5).booleanValue()) {
                kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, i(g5));
            }
        }
        return arrayList;
    }

    @d5.e
    protected final q0 i(@d5.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("舫"));
        if (fVar.q()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var = this.f24206b;
        kotlin.reflect.jvm.internal.impl.name.c c6 = this.f24207c.c(fVar);
        kotlin.jvm.internal.l0.o(c6, ProtectedSandApp.s("般"));
        q0 V = h0Var.V(c6);
        if (V.isEmpty()) {
            return null;
        }
        return V;
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("舭") + this.f24207c + ProtectedSandApp.s("舮") + this.f24206b;
    }
}
