package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.g;

/* compiled from: SyntheticJavaPartsProvider.kt */
/* loaded from: classes5.dex */
public final class a implements f {

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final List<f> f25937b;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@d5.d List<? extends f> list) {
        l0.p(list, ProtectedSandApp.s("前"));
        this.f25937b = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.f
    public void a(@d5.d g gVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d Collection<z0> collection) {
        l0.p(gVar, ProtectedSandApp.s("剎"));
        l0.p(eVar, ProtectedSandApp.s("剏"));
        l0.p(fVar, ProtectedSandApp.s("剐"));
        l0.p(collection, ProtectedSandApp.s("剑"));
        Iterator<T> it = this.f25937b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(gVar, eVar, fVar, collection);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.f
    public void b(@d5.d g gVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d List<kotlin.reflect.jvm.internal.impl.descriptors.e> list) {
        l0.p(gVar, ProtectedSandApp.s("剒"));
        l0.p(eVar, ProtectedSandApp.s("剓"));
        l0.p(fVar, ProtectedSandApp.s("剔"));
        l0.p(list, ProtectedSandApp.s("剕"));
        Iterator<T> it = this.f25937b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).b(gVar, eVar, fVar, list);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.f
    public void c(@d5.d g gVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d List<kotlin.reflect.jvm.internal.impl.descriptors.d> list) {
        l0.p(gVar, ProtectedSandApp.s("剖"));
        l0.p(eVar, ProtectedSandApp.s("剗"));
        l0.p(list, ProtectedSandApp.s("剘"));
        Iterator<T> it = this.f25937b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).c(gVar, eVar, list);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.f
    @d5.d
    public List<kotlin.reflect.jvm.internal.impl.name.f> d(@d5.d g gVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(gVar, ProtectedSandApp.s("剙"));
        l0.p(eVar, ProtectedSandApp.s("剚"));
        List<f> list = this.f25937b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            f0.q0(arrayList, ((f) it.next()).d(gVar, eVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.f
    @d5.d
    public List<kotlin.reflect.jvm.internal.impl.name.f> e(@d5.d g gVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(gVar, ProtectedSandApp.s("剛"));
        l0.p(eVar, ProtectedSandApp.s("剜"));
        List<f> list = this.f25937b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            f0.q0(arrayList, ((f) it.next()).e(gVar, eVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.f
    @d5.d
    public List<kotlin.reflect.jvm.internal.impl.name.f> f(@d5.d g gVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        l0.p(gVar, ProtectedSandApp.s("剝"));
        l0.p(eVar, ProtectedSandApp.s("剞"));
        List<f> list = this.f25937b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            f0.q0(arrayList, ((f) it.next()).f(gVar, eVar));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.jvm.f
    public void g(@d5.d g gVar, @d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d kotlin.reflect.jvm.internal.impl.name.f fVar, @d5.d Collection<z0> collection) {
        l0.p(gVar, ProtectedSandApp.s("剟"));
        l0.p(eVar, ProtectedSandApp.s("剠"));
        l0.p(fVar, ProtectedSandApp.s("剡"));
        l0.p(collection, ProtectedSandApp.s("剢"));
        Iterator<T> it = this.f25937b.iterator();
        while (it.hasNext()) {
            ((f) it.next()).g(gVar, eVar, fVar, collection);
        }
    }
}
