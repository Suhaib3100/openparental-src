package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.f;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.x;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.l;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.v;
import kotlin.text.Typography;
import w3.a;
import w3.c;

/* compiled from: DeserializationComponentsForJava.kt */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    public static final a f24999b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.k f25000a;

    /* compiled from: DeserializationComponentsForJava.kt */
    public static final class a {

        /* compiled from: DeserializationComponentsForJava.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.f$a$a, reason: collision with other inner class name */
        public static final class C0298a {

            /* renamed from: a, reason: collision with root package name */
            @d5.d
            private final f f25001a;

            /* renamed from: b, reason: collision with root package name */
            @d5.d
            private final h f25002b;

            public C0298a(@d5.d f fVar, @d5.d h hVar) {
                l0.p(fVar, ProtectedSandApp.s("䰏"));
                l0.p(hVar, ProtectedSandApp.s("䰐"));
                this.f25001a = fVar;
                this.f25002b = hVar;
            }

            @d5.d
            public final f a() {
                return this.f25001a;
            }

            @d5.d
            public final h b() {
                return this.f25002b;
            }
        }

        private a() {
        }

        @d5.d
        public final C0298a a(@d5.d p pVar, @d5.d p pVar2, @d5.d kotlin.reflect.jvm.internal.impl.load.java.p pVar3, @d5.d String str, @d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.r rVar, @d5.d a4.b bVar) {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.f b6;
            List O;
            l0.p(pVar, ProtectedSandApp.s("䰑"));
            l0.p(pVar2, ProtectedSandApp.s("䰒"));
            l0.p(pVar3, ProtectedSandApp.s("䰓"));
            l0.p(str, ProtectedSandApp.s("䰔"));
            l0.p(rVar, ProtectedSandApp.s("䰕"));
            l0.p(bVar, ProtectedSandApp.s("䰖"));
            kotlin.reflect.jvm.internal.impl.storage.f fVar = new kotlin.reflect.jvm.internal.impl.storage.f(ProtectedSandApp.s("䰗"), (Runnable) null, (q3.l<InterruptedException, m2>) null);
            kotlin.reflect.jvm.internal.impl.builtins.jvm.f fVar2 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.f(fVar, f.a.FROM_DEPENDENCIES);
            kotlin.reflect.jvm.internal.impl.name.f s5 = kotlin.reflect.jvm.internal.impl.name.f.s(ProtectedSandApp.s("䰘") + str + Typography.f27130f);
            l0.o(s5, ProtectedSandApp.s("䰙"));
            kotlin.reflect.jvm.internal.impl.descriptors.impl.x xVar = new kotlin.reflect.jvm.internal.impl.descriptors.impl.x(s5, fVar, fVar2, null, null, null, 56, null);
            fVar2.D0(xVar);
            fVar2.I0(xVar, true);
            h hVar = new h();
            kotlin.reflect.jvm.internal.impl.load.java.lazy.j jVar = new kotlin.reflect.jvm.internal.impl.load.java.lazy.j();
            k0 k0Var = new k0(fVar, xVar);
            b6 = g.b(pVar3, xVar, fVar, k0Var, pVar, hVar, rVar, bVar, jVar, (r21 & 512) != 0 ? x.a.f25077a : null);
            f a6 = g.a(xVar, fVar, k0Var, b6, pVar, hVar, rVar);
            hVar.l(a6);
            kotlin.reflect.jvm.internal.impl.load.java.components.g gVar = kotlin.reflect.jvm.internal.impl.load.java.components.g.f24545a;
            l0.o(gVar, ProtectedSandApp.s("䰚"));
            kotlin.reflect.jvm.internal.impl.resolve.jvm.c cVar = new kotlin.reflect.jvm.internal.impl.resolve.jvm.c(b6, gVar);
            jVar.c(cVar);
            kotlin.reflect.jvm.internal.impl.builtins.jvm.j jVar2 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.j(fVar, pVar2, xVar, k0Var, fVar2.H0(), fVar2.H0(), l.a.f26234a, kotlin.reflect.jvm.internal.impl.types.checker.l.f26361b.a(), new e4.b(fVar, EmptyList.f23167o));
            xVar.f1(xVar);
            O = kotlin.collections.a0.O(cVar.a(), jVar2);
            xVar.Z0(new kotlin.reflect.jvm.internal.impl.descriptors.impl.i(O, ProtectedSandApp.s("䰛") + xVar));
            return new C0298a(a6, hVar);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public f(@d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d h0 h0Var, @d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.l lVar, @d5.d i iVar, @d5.d d dVar, @d5.d kotlin.reflect.jvm.internal.impl.load.java.lazy.f fVar, @d5.d k0 k0Var, @d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.r rVar, @d5.d z3.c cVar, @d5.d kotlin.reflect.jvm.internal.impl.serialization.deserialization.j jVar, @d5.d kotlin.reflect.jvm.internal.impl.types.checker.l lVar2, @d5.d g4.a aVar) {
        w3.c H0;
        w3.a H02;
        l0.p(nVar, ProtectedSandApp.s("䰜"));
        l0.p(h0Var, ProtectedSandApp.s("䰝"));
        l0.p(lVar, ProtectedSandApp.s("䰞"));
        l0.p(iVar, ProtectedSandApp.s("䰟"));
        l0.p(dVar, ProtectedSandApp.s("䰠"));
        l0.p(fVar, ProtectedSandApp.s("䰡"));
        l0.p(k0Var, ProtectedSandApp.s("䰢"));
        l0.p(rVar, ProtectedSandApp.s("䰣"));
        l0.p(cVar, ProtectedSandApp.s("䰤"));
        l0.p(jVar, ProtectedSandApp.s("䰥"));
        l0.p(lVar2, ProtectedSandApp.s("䰦"));
        l0.p(aVar, ProtectedSandApp.s("䰧"));
        kotlin.reflect.jvm.internal.impl.builtins.h A = h0Var.A();
        kotlin.reflect.jvm.internal.impl.builtins.jvm.f fVar2 = A instanceof kotlin.reflect.jvm.internal.impl.builtins.jvm.f ? (kotlin.reflect.jvm.internal.impl.builtins.jvm.f) A : null;
        v.a aVar2 = v.a.f26261a;
        j jVar2 = j.f25042a;
        EmptyList emptyList = EmptyList.f23167o;
        this.f25000a = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.k(nVar, h0Var, lVar, iVar, dVar, fVar, aVar2, rVar, cVar, jVar2, emptyList, k0Var, jVar, (fVar2 == null || (H02 = fVar2.H0()) == null) ? a.C0517a.f34018a : H02, (fVar2 == null || (H0 = fVar2.H0()) == null) ? c.b.f34020a : H0, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f25577a.a(), lVar2, new e4.b(nVar, emptyList), null, aVar.a(), 262144, null);
    }

    @d5.d
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.k a() {
        return this.f25000a;
    }
}
