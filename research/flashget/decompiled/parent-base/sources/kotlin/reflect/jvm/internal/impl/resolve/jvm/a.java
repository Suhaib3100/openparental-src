package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.g;

/* compiled from: SyntheticJavaPartsProvider.kt */
@r1({"SMAP\nSyntheticJavaPartsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyntheticJavaPartsProvider.kt\norg/jetbrains/kotlin/resolve/jvm/CompositeSyntheticJavaPartsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n1360#2:103\n1446#2,5:104\n1855#2,2:109\n1360#2:111\n1446#2,5:112\n1855#2,2:117\n1855#2,2:119\n1360#2:121\n1446#2,5:122\n1855#2,2:127\n1789#2,3:129\n*S KotlinDebug\n*F\n+ 1 SyntheticJavaPartsProvider.kt\norg/jetbrains/kotlin/resolve/jvm/CompositeSyntheticJavaPartsProvider\n*L\n58#1:103\n58#1:104,5\n67#1:109,2\n72#1:111\n72#1:112,5\n76#1:117,2\n81#1:119,2\n86#1:121\n86#1:122,5\n91#1:127,2\n99#1:129,3\n*E\n"})
/* loaded from: classes7.dex */
public final class a implements f {

    /* renamed from: b, reason: collision with root package name */
    @l
    private final List<f> f77920b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@l List<? extends f> list) {
        l0.p(list, ProtectedSandApp.s("禗\u0001"));
        this.f77920b = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.f
    public void a(@l g gVar, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @l List<kotlin.reflect.jvm.internal.impl.descriptors.d> list) {
        l0.p(gVar, ProtectedSandApp.s("禘\u0001"));
        l0.p(eVar, ProtectedSandApp.s("禙\u0001"));
        l0.p(list, ProtectedSandApp.s("禚\u0001"));
        Iterator<T> it = this.f77920b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(gVar, eVar, list);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.f
    public void b(@l g gVar, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @l kotlin.reflect.jvm.internal.impl.name.f fVar, @l Collection<z0> collection) {
        l0.p(gVar, ProtectedSandApp.s("禘\u0001"));
        l0.p(eVar, ProtectedSandApp.s("禙\u0001"));
        l0.p(fVar, ProtectedSandApp.s("禛\u0001"));
        l0.p(collection, ProtectedSandApp.s("禚\u0001"));
        Iterator<T> it = this.f77920b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).b(gVar, eVar, fVar, collection);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.f
    public void c(@l g gVar, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @l kotlin.reflect.jvm.internal.impl.name.f fVar, @l Collection<z0> collection) {
        l0.p(gVar, ProtectedSandApp.s("禘\u0001"));
        l0.p(eVar, ProtectedSandApp.s("禙\u0001"));
        l0.p(fVar, ProtectedSandApp.s("禛\u0001"));
        l0.p(collection, ProtectedSandApp.s("禚\u0001"));
        Iterator<T> it = this.f77920b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).c(gVar, eVar, fVar, collection);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.f
    public void d(@l g gVar, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @l kotlin.reflect.jvm.internal.impl.name.f fVar, @l List<kotlin.reflect.jvm.internal.impl.descriptors.e> list) {
        l0.p(gVar, ProtectedSandApp.s("禘\u0001"));
        l0.p(eVar, ProtectedSandApp.s("禙\u0001"));
        l0.p(fVar, ProtectedSandApp.s("禛\u0001"));
        l0.p(list, ProtectedSandApp.s("禚\u0001"));
        Iterator<T> it = this.f77920b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).d(gVar, eVar, fVar, list);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.f
    @l
    public List<kotlin.reflect.jvm.internal.impl.name.f> e(@l g gVar, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(gVar, ProtectedSandApp.s("禘\u0001"));
        l0.p(eVar, ProtectedSandApp.s("禙\u0001"));
        List<f> list = this.f77920b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            w.q0(arrayList, ((f) it.next()).e(gVar, eVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.f
    @l
    public List<kotlin.reflect.jvm.internal.impl.name.f> f(@l g gVar, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(gVar, ProtectedSandApp.s("禘\u0001"));
        l0.p(eVar, ProtectedSandApp.s("禙\u0001"));
        List<f> list = this.f77920b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            w.q0(arrayList, ((f) it.next()).f(gVar, eVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.f
    @l
    public List<kotlin.reflect.jvm.internal.impl.name.f> g(@l g gVar, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(gVar, ProtectedSandApp.s("禘\u0001"));
        l0.p(eVar, ProtectedSandApp.s("禙\u0001"));
        List<f> list = this.f77920b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            w.q0(arrayList, ((f) it.next()).g(gVar, eVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.f
    @l
    public c0 h(@l g gVar, @l kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @l c0 c0Var) {
        l0.p(gVar, ProtectedSandApp.s("禘\u0001"));
        l0.p(eVar, ProtectedSandApp.s("禙\u0001"));
        l0.p(c0Var, ProtectedSandApp.s("禜\u0001"));
        Iterator<T> it = this.f77920b.iterator();
        while (it.hasNext()) {
            c0Var = ((f) it.next()).h(gVar, eVar, c0Var);
        }
        return c0Var;
    }
}
