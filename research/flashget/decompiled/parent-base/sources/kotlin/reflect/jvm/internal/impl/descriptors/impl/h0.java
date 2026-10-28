package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.c;

/* compiled from: SubpackagesScope.kt */
/* loaded from: classes7.dex */
public class h0 extends kotlin.reflect.jvm.internal.impl.resolve.scopes.i {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.descriptors.h0 f76031b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.name.c f76032c;

    public h0(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var, @fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.jvm.internal.l0.p(h0Var, ProtectedSandApp.s("沷\u0001"));
        kotlin.jvm.internal.l0.p(cVar, ProtectedSandApp.s("沸\u0001"));
        this.f76031b = h0Var;
        this.f76032c = cVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@fg.l kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        kotlin.jvm.internal.l0.p(dVar, ProtectedSandApp.s("油\u0001"));
        kotlin.jvm.internal.l0.p(lVar, ProtectedSandApp.s("沺\u0001"));
        kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77961c.getClass();
        if (!dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f77966h)) {
            return kotlin.collections.j0.f74919b;
        }
        if (this.f76032c.d() && dVar.l().contains(c.b.f77960a)) {
            return kotlin.collections.j0.f74919b;
        }
        Collection<kotlin.reflect.jvm.internal.impl.name.c> z4 = this.f76031b.z(this.f76032c, lVar);
        ArrayList arrayList = new ArrayList(z4.size());
        Iterator<kotlin.reflect.jvm.internal.impl.name.c> it = z4.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.name.f g4 = it.next().g();
            kotlin.jvm.internal.l0.o(g4, ProtectedSandApp.s("治\u0001"));
            if (lVar.invoke(g4).booleanValue()) {
                kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, i(g4));
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> h() {
        return kotlin.collections.l0.f74939b;
    }

    @fg.m
    protected final q0 i(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        kotlin.jvm.internal.l0.p(fVar, ProtectedSandApp.s("沼\u0001"));
        if (fVar.g()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var = this.f76031b;
        kotlin.reflect.jvm.internal.impl.name.c c5 = this.f76032c.c(fVar);
        kotlin.jvm.internal.l0.o(c5, ProtectedSandApp.s("沽\u0001"));
        q0 n02 = h0Var.n0(c5);
        if (n02.isEmpty()) {
            return null;
        }
        return n02;
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("沾\u0001") + this.f76032c + ProtectedSandApp.s("沿\u0001") + this.f76031b;
    }
}
