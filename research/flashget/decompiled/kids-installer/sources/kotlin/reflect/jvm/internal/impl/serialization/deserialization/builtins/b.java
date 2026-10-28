package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import androidx.constraintlayout.motion.widget.g;
import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.e;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.m0;
import kotlin.reflect.jvm.internal.impl.descriptors.n0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.j;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.l;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.o;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.r;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.s;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.v;
import kotlin.reflect.jvm.internal.impl.storage.n;
import q3.l;
import z3.c;

/* compiled from: BuiltInsLoaderImpl.kt */
/* loaded from: classes5.dex */
public final class b implements kotlin.reflect.jvm.internal.impl.builtins.a {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final d f26073b = new d();

    /* compiled from: BuiltInsLoaderImpl.kt */
    /* loaded from: classes6.dex */
    /* synthetic */ class a extends g0 implements l<String, InputStream> {
        a(Object obj) {
            super(1, obj);
        }

        @Override // q3.l
        @e
        /* renamed from: A0, reason: merged with bridge method [inline-methods] */
        public final InputStream N(@d5.d String str) {
            l0.p(str, ProtectedSandApp.s("蜝"));
            return ((d) this.f23596p).a(str);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.KCallable
        @d5.d
        public final String getName() {
            return ProtectedSandApp.s("蜞");
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final KDeclarationContainer w0() {
            return l1.d(d.class);
        }

        @Override // kotlin.jvm.internal.q
        @d5.d
        public final String y0() {
            return ProtectedSandApp.s("蜟");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.a
    @d5.d
    public m0 a(@d5.d n nVar, @d5.d h0 h0Var, @d5.d Iterable<? extends w3.b> iterable, @d5.d w3.c cVar, @d5.d w3.a aVar, boolean z5) {
        l0.p(nVar, ProtectedSandApp.s("卼"));
        l0.p(h0Var, ProtectedSandApp.s("卽"));
        l0.p(iterable, ProtectedSandApp.s("卾"));
        l0.p(cVar, ProtectedSandApp.s("卿"));
        l0.p(aVar, ProtectedSandApp.s("厀"));
        return b(nVar, h0Var, kotlin.reflect.jvm.internal.impl.builtins.l.A, iterable, cVar, aVar, z5, new a(this.f26073b));
    }

    @d5.d
    public final m0 b(@d5.d n nVar, @d5.d h0 h0Var, @d5.d Set<kotlin.reflect.jvm.internal.impl.name.c> set, @d5.d Iterable<? extends w3.b> iterable, @d5.d w3.c cVar, @d5.d w3.a aVar, boolean z5, @d5.d l<? super String, ? extends InputStream> lVar) {
        int b02;
        l0.p(nVar, ProtectedSandApp.s("厁"));
        l0.p(h0Var, ProtectedSandApp.s("厂"));
        l0.p(set, ProtectedSandApp.s("厃"));
        l0.p(iterable, ProtectedSandApp.s("厄"));
        l0.p(cVar, ProtectedSandApp.s("厅"));
        l0.p(aVar, ProtectedSandApp.s("历"));
        l0.p(lVar, ProtectedSandApp.s("厇"));
        b02 = b0.b0(set, 10);
        ArrayList arrayList = new ArrayList(b02);
        for (kotlin.reflect.jvm.internal.impl.name.c cVar2 : set) {
            String n5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a.f26072n.n(cVar2);
            InputStream N = lVar.N(n5);
            if (N == null) {
                throw new IllegalStateException(g.a(ProtectedSandApp.s("厈"), n5));
            }
            arrayList.add(c.C.a(cVar2, nVar, h0Var, N, z5));
        }
        n0 n0Var = new n0(arrayList);
        k0 k0Var = new k0(nVar, h0Var);
        l.a aVar2 = l.a.f26234a;
        o oVar = new o(n0Var);
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a aVar3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a.f26072n;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.d dVar = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.d(h0Var, k0Var, aVar3);
        v.a aVar4 = v.a.f26261a;
        r rVar = r.f26255a;
        l0.o(rVar, ProtectedSandApp.s("厉"));
        k kVar = new k(nVar, h0Var, aVar2, oVar, dVar, n0Var, aVar4, rVar, c.a.f34404a, s.a.f26256a, iterable, k0Var, j.f26210a.a(), aVar, cVar, aVar3.e(), null, new e4.b(nVar, EmptyList.f23167o), null, null, 851968, null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c) it.next()).S0(kVar);
        }
        return n0Var;
    }
}
