package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.k2;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.f;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.z;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.l;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.w;
import kotlin.text.m0;
import rd.a;
import rd.c;

/* compiled from: DeserializationComponentsForJava.kt */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final a f76880b = new a();

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.k f76881a;

    /* compiled from: DeserializationComponentsForJava.kt */
    public static final class a {

        /* compiled from: DeserializationComponentsForJava.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.h$a$a, reason: collision with other inner class name */
        public static final class C1103a {

            /* renamed from: a, reason: collision with root package name */
            @fg.l
            private final h f76882a;

            /* renamed from: b, reason: collision with root package name */
            @fg.l
            private final j f76883b;

            public C1103a(@fg.l h hVar, @fg.l j jVar) {
                l0.p(hVar, ProtectedSandApp.s("珴\u0001"));
                l0.p(jVar, ProtectedSandApp.s("珵\u0001"));
                this.f76882a = hVar;
                this.f76883b = jVar;
            }

            @fg.l
            public final h a() {
                return this.f76882a;
            }

            @fg.l
            public final j b() {
                return this.f76883b;
            }
        }

        private a() {
        }

        @fg.l
        public final C1103a a(@fg.l r rVar, @fg.l r rVar2, @fg.l kotlin.reflect.jvm.internal.impl.load.java.p pVar, @fg.l String str, @fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.r rVar3, @fg.l vd.b bVar) {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.f b5;
            l0.p(rVar, ProtectedSandApp.s("珶\u0001"));
            l0.p(rVar2, ProtectedSandApp.s("珷\u0001"));
            l0.p(pVar, ProtectedSandApp.s("珸\u0001"));
            l0.p(str, ProtectedSandApp.s("珹\u0001"));
            l0.p(rVar3, ProtectedSandApp.s("珺\u0001"));
            l0.p(bVar, ProtectedSandApp.s("珻\u0001"));
            kotlin.reflect.jvm.internal.impl.storage.f fVar = new kotlin.reflect.jvm.internal.impl.storage.f(ProtectedSandApp.s("珼\u0001"), (Runnable) null, (ld.l<InterruptedException, k2>) null);
            kotlin.reflect.jvm.internal.impl.builtins.jvm.f fVar2 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.f(fVar, f.a.FROM_DEPENDENCIES);
            kotlin.reflect.jvm.internal.impl.name.f i4 = kotlin.reflect.jvm.internal.impl.name.f.i(ProtectedSandApp.s("珽\u0001") + str + m0.greater);
            l0.o(i4, ProtectedSandApp.s("現\u0001"));
            kotlin.reflect.jvm.internal.impl.descriptors.impl.x xVar = new kotlin.reflect.jvm.internal.impl.descriptors.impl.x(i4, fVar, fVar2, null, null, null, 56, null);
            fVar2.E0(xVar);
            fVar2.J0(xVar, true);
            j jVar = new j();
            kotlin.reflect.jvm.internal.impl.load.java.lazy.j jVar2 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.j();
            k0 k0Var = new k0(fVar, xVar);
            b5 = i.b(pVar, xVar, fVar, k0Var, rVar, jVar, rVar3, bVar, jVar2, (r21 & 512) != 0 ? z.a.f76959a : null);
            h a5 = i.a(xVar, fVar, k0Var, b5, rVar, jVar, rVar3, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.e.f77546i);
            jVar.m(a5);
            kotlin.reflect.jvm.internal.impl.load.java.components.g gVar = kotlin.reflect.jvm.internal.impl.load.java.components.g.f76399a;
            l0.o(gVar, ProtectedSandApp.s("珿\u0001"));
            kotlin.reflect.jvm.internal.impl.resolve.jvm.c cVar = new kotlin.reflect.jvm.internal.impl.resolve.jvm.c(b5, gVar);
            jVar2.c(cVar);
            kotlin.reflect.jvm.internal.impl.builtins.jvm.k kVar = new kotlin.reflect.jvm.internal.impl.builtins.jvm.k(fVar, rVar2, xVar, k0Var, fVar2.I0(), fVar2.I0(), l.a.f78243a, kotlin.reflect.jvm.internal.impl.types.checker.l.f78369b.a(), new zd.b(fVar, j0.f74919b));
            xVar.Z0(xVar);
            xVar.T0(new kotlin.reflect.jvm.internal.impl.descriptors.impl.i(kotlin.collections.w.O(cVar.a(), kVar), ProtectedSandApp.s("琀\u0001") + xVar));
            return new C1103a(a5, jVar);
        }

        public a(kotlin.jvm.internal.w wVar) {
        }
    }

    public h(@fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l h0 h0Var, @fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.l lVar, @fg.l k kVar, @fg.l e eVar, @fg.l kotlin.reflect.jvm.internal.impl.load.java.lazy.f fVar, @fg.l k0 k0Var, @fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.r rVar, @fg.l ud.c cVar, @fg.l kotlin.reflect.jvm.internal.impl.serialization.deserialization.j jVar, @fg.l kotlin.reflect.jvm.internal.impl.types.checker.l lVar2, @fg.l be.a aVar) {
        rd.c I0;
        rd.a I02;
        l0.p(nVar, ProtectedSandApp.s("琁\u0001"));
        l0.p(h0Var, ProtectedSandApp.s("琂\u0001"));
        l0.p(lVar, ProtectedSandApp.s("球\u0001"));
        l0.p(kVar, ProtectedSandApp.s("琄\u0001"));
        l0.p(eVar, ProtectedSandApp.s("琅\u0001"));
        l0.p(fVar, ProtectedSandApp.s("理\u0001"));
        l0.p(k0Var, ProtectedSandApp.s("琇\u0001"));
        l0.p(rVar, ProtectedSandApp.s("琈\u0001"));
        l0.p(cVar, ProtectedSandApp.s("琉\u0001"));
        l0.p(jVar, ProtectedSandApp.s("琊\u0001"));
        l0.p(lVar2, ProtectedSandApp.s("琋\u0001"));
        l0.p(aVar, ProtectedSandApp.s("琌\u0001"));
        kotlin.reflect.jvm.internal.impl.builtins.h p4 = h0Var.p();
        kotlin.reflect.jvm.internal.impl.builtins.jvm.f fVar2 = p4 instanceof kotlin.reflect.jvm.internal.impl.builtins.jvm.f ? (kotlin.reflect.jvm.internal.impl.builtins.jvm.f) p4 : null;
        w.a aVar2 = w.a.f78273a;
        l lVar3 = l.f76924a;
        j0 j0Var = j0.f74919b;
        this.f76881a = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.k(nVar, h0Var, lVar, kVar, eVar, fVar, aVar2, rVar, cVar, lVar3, j0Var, k0Var, jVar, (fVar2 == null || (I02 = fVar2.I0()) == null) ? a.C1384a.f89864a : I02, (fVar2 == null || (I0 = fVar2.I0()) == null) ? c.b.f89866a : I0, kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f77559a.a(), lVar2, new zd.b(nVar, j0Var), aVar.a(), kotlin.reflect.jvm.internal.impl.serialization.deserialization.u.f78272a);
    }

    @fg.l
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.k a() {
        return this.f76881a;
    }
}
