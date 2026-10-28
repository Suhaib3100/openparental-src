package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;

/* compiled from: DeserializedAnnotations.kt */
/* loaded from: classes7.dex */
public class b implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.g {

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.o<Object>[] f78071c = {l1.u(new g1(l1.d(b.class), ProtectedSandApp.s("等\u0001"), ProtectedSandApp.s("筊\u0001")))};

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final kotlin.reflect.jvm.internal.impl.storage.i f78072b;

    public b(@fg.l kotlin.reflect.jvm.internal.impl.storage.n nVar, @fg.l ld.a<? extends List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> aVar) {
        l0.p(nVar, ProtectedSandApp.s("筋\u0001"));
        l0.p(aVar, ProtectedSandApp.s("筌\u0001"));
        this.f78072b = nVar.h(aVar);
    }

    private final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> b() {
        return (List) kotlin.reflect.jvm.internal.impl.storage.m.a(this.f78072b, this, f78071c[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.lang.Iterable
    @fg.l
    public Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator() {
        return b().iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    @fg.m
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c k(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return g.b.a(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean o3(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return g.b.b(this, cVar);
    }
}
