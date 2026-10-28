package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;

/* compiled from: InnerClassesScopeWrapper.kt */
@r1({"SMAP\nInnerClassesScopeWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerClassesScopeWrapper.kt\norg/jetbrains/kotlin/resolve/scopes/InnerClassesScopeWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,55:1\n800#2,11:56\n*S KotlinDebug\n*F\n+ 1 InnerClassesScopeWrapper.kt\norg/jetbrains/kotlin/resolve/scopes/InnerClassesScopeWrapper\n*L\n35#1:56,11\n*E\n"})
/* loaded from: classes7.dex */
public final class f extends i {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final h f77995b;

    public f(@fg.l h hVar) {
        l0.p(hVar, ProtectedSandApp.s("窓\u0001"));
        this.f77995b = hVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        return this.f77995b.c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.l
    public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
        return this.f77995b.d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    public void e(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("窔\u0001"));
        l0.p(bVar, ProtectedSandApp.s("窕\u0001"));
        this.f77995b.e(fVar, bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.h f(@fg.l kotlin.reflect.jvm.internal.impl.name.f fVar, @fg.l ud.b bVar) {
        l0.p(fVar, ProtectedSandApp.s("窔\u0001"));
        l0.p(bVar, ProtectedSandApp.s("窕\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.h f4 = this.f77995b.f(fVar, bVar);
        if (f4 == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = f4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e ? (kotlin.reflect.jvm.internal.impl.descriptors.e) f4 : null;
        if (eVar != null) {
            return eVar;
        }
        if (f4 instanceof e1) {
            return (e1) f4;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @fg.m
    public Set<kotlin.reflect.jvm.internal.impl.name.f> h() {
        return this.f77995b.h();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.i, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @fg.l
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public List<kotlin.reflect.jvm.internal.impl.descriptors.h> g(@fg.l d dVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        l0.p(dVar, ProtectedSandApp.s("窖\u0001"));
        l0.p(lVar, ProtectedSandApp.s("窗\u0001"));
        d.f77961c.getClass();
        d n4 = dVar.n(d.f77970l);
        if (n4 == null) {
            return j0.f74919b;
        }
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.m> g4 = this.f77995b.g(n4, lVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : g4) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("窘\u0001") + this.f77995b;
    }
}
