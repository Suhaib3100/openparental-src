package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;

/* compiled from: MemberScopeImpl.kt */
@r1({"SMAP\nMemberScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemberScopeImpl.kt\norg/jetbrains/kotlin/resolve/scopes/MemberScopeImpl\n+ 2 CollectionUtil.kt\norg/jetbrains/kotlin/utils/CollectionUtilKt\n*L\n1#1,56:1\n18#2,6:57\n18#2,6:63\n*S KotlinDebug\n*F\n+ 1 MemberScopeImpl.kt\norg/jetbrains/kotlin/resolve/scopes/MemberScopeImpl\n*L\n44#1:57,6\n49#1:63,6\n*E\n"})
/* loaded from: classes7.dex */
public abstract class i implements h {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    public Collection<? extends z0> a(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("桟\u0001"));
        l0.p(bVar, ProtectedSandApp.s("桠\u0001"));
        return j0.f74919b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Collection<? extends u0> b(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("桟\u0001"));
        l0.p(bVar, ProtectedSandApp.s("桠\u0001"));
        return j0.f74919b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g4 = g(d.f77980v, kotlin.reflect.jvm.internal.impl.utils.e.a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : g4) {
            if (obj instanceof z0) {
                kotlin.reflect.jvm.internal.impl.name.f name = ((z0) obj).getName();
                l0.o(name, ProtectedSandApp.s("桡\u0001"));
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g4 = g(d.f77981w, kotlin.reflect.jvm.internal.impl.utils.e.a());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : g4) {
            if (obj instanceof z0) {
                kotlin.reflect.jvm.internal.impl.name.f name = ((z0) obj).getName();
                l0.o(name, ProtectedSandApp.s("桡\u0001"));
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    public void e(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        h.b.a(this, fVar, bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.h f(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("桟\u0001"));
        l0.p(bVar, ProtectedSandApp.s("桠\u0001"));
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g(@fg.l d dVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("桢\u0001"));
        l0.p(lVar, ProtectedSandApp.s("档\u0001"));
        return j0.f74919b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.m
    public Set<kotlin.reflect.jvm.internal.impl.name.f> h() {
        return null;
    }
}
