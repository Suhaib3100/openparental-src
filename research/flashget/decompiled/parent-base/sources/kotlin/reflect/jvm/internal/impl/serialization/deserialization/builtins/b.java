package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.j0;
import kotlin.collections.w;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.reflect.h;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.m0;
import kotlin.reflect.jvm.internal.impl.descriptors.n0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.j;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.l;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.r;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.s;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.w;
import kotlin.reflect.jvm.internal.impl.storage.n;
import ud.c;

/* compiled from: BuiltInsLoaderImpl.kt */
@r1({"SMAP\nBuiltInsLoaderImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuiltInsLoaderImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/builtins/BuiltInsLoaderImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1549#2:94\n1620#2,3:95\n*S KotlinDebug\n*F\n+ 1 BuiltInsLoaderImpl.kt\norg/jetbrains/kotlin/serialization/deserialization/builtins/BuiltInsLoaderImpl\n*L\n57#1:94\n57#1:95,3\n*E\n"})
/* loaded from: classes7.dex */
public final class b implements kotlin.reflect.jvm.internal.impl.builtins.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    private final d f78053b = new d();

    /* compiled from: BuiltInsLoaderImpl.kt */
    /* synthetic */ class a extends g0 implements ld.l<String, InputStream> {
        a(Object obj) {
            super(1, obj);
        }

        @Override // ld.l
        @m
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final InputStream invoke(@l String str) {
            l0.p(str, ProtectedSandApp.s("笌\u0001"));
            return ((d) this.receiver).a(str);
        }

        @Override // kotlin.jvm.internal.q, kotlin.reflect.c
        @l
        public final String getName() {
            return ProtectedSandApp.s("笍\u0001");
        }

        @Override // kotlin.jvm.internal.q
        @l
        public final h getOwner() {
            return l1.d(d.class);
        }

        @Override // kotlin.jvm.internal.q
        @l
        public final String getSignature() {
            return ProtectedSandApp.s("笎\u0001");
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.a
    @l
    public m0 a(@l n nVar, @l h0 h0Var, @l Iterable<? extends rd.b> iterable, @l rd.c cVar, @l rd.a aVar, boolean z4) {
        l0.p(nVar, ProtectedSandApp.s("笏\u0001"));
        l0.p(h0Var, ProtectedSandApp.s("笐\u0001"));
        l0.p(iterable, ProtectedSandApp.s("笑\u0001"));
        l0.p(cVar, ProtectedSandApp.s("笒\u0001"));
        l0.p(aVar, ProtectedSandApp.s("笓\u0001"));
        return b(nVar, h0Var, kotlin.reflect.jvm.internal.impl.builtins.l.F, iterable, cVar, aVar, z4, new a(1, this.f78053b));
    }

    @l
    public final m0 b(@l n nVar, @l h0 h0Var, @l Set<kotlin.reflect.jvm.internal.impl.name.c> set, @l Iterable<? extends rd.b> iterable, @l rd.c cVar, @l rd.a aVar, boolean z4, @l ld.l<? super String, ? extends InputStream> lVar) {
        l0.p(nVar, ProtectedSandApp.s("笏\u0001"));
        l0.p(h0Var, ProtectedSandApp.s("笔\u0001"));
        l0.p(set, ProtectedSandApp.s("笕\u0001"));
        l0.p(iterable, ProtectedSandApp.s("笑\u0001"));
        l0.p(cVar, ProtectedSandApp.s("笒\u0001"));
        l0.p(aVar, ProtectedSandApp.s("笓\u0001"));
        l0.p(lVar, ProtectedSandApp.s("笖\u0001"));
        Set<kotlin.reflect.jvm.internal.impl.name.c> set2 = set;
        ArrayList arrayList = new ArrayList(w.b0(set2, 10));
        for (kotlin.reflect.jvm.internal.impl.name.c cVar2 : set2) {
            String r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a.f78052r.r(cVar2);
            InputStream invoke = lVar.invoke(r4);
            if (invoke == null) {
                throw new IllegalStateException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("笗\u0001"), r4));
            }
            arrayList.add(c.f78054p.a(cVar2, nVar, h0Var, invoke, z4));
        }
        n0 n0Var = new n0(arrayList);
        k0 k0Var = new k0(nVar, h0Var);
        l.a aVar2 = l.a.f78243a;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.n nVar2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.n(n0Var);
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a aVar3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a.f78052r;
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.d dVar = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.d(h0Var, k0Var, aVar3);
        w.a aVar4 = w.a.f78273a;
        r rVar = r.f78264a;
        l0.o(rVar, ProtectedSandApp.s("笘\u0001"));
        k kVar = new k(nVar, h0Var, aVar2, nVar2, dVar, n0Var, aVar4, rVar, c.a.f92759a, s.a.f78265a, iterable, k0Var, j.f78219a.a(), aVar, cVar, aVar3.e(), null, new zd.b(nVar, j0.f74919b), null, null, 851968, null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c) it.next()).M0(kVar);
        }
        return n0Var;
    }
}
