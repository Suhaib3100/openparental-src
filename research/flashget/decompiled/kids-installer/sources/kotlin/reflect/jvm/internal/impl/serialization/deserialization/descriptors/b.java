package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;

/* compiled from: DeserializedAnnotations.kt */
/* loaded from: classes6.dex */
public class b implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.g {

    /* renamed from: p, reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f26082p = {l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("蝒"), ProtectedSandApp.s("蝓")))};

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final kotlin.reflect.jvm.internal.impl.storage.i f26083o;

    public b(@d5.d kotlin.reflect.jvm.internal.impl.storage.n nVar, @d5.d q3.a<? extends List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> aVar) {
        l0.p(nVar, ProtectedSandApp.s("蝔"));
        l0.p(aVar, ProtectedSandApp.s("蝕"));
        this.f26083o = nVar.d(aVar);
    }

    private final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> b() {
        return (List) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f26083o, this, f26082p[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean O0(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    @d5.e
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c e(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return g.b.a(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.lang.Iterable
    @d5.d
    public Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator() {
        return b().iterator();
    }
}
