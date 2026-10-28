package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;

/* compiled from: AnnotationTypeQualifierResolver.kt */
/* loaded from: classes5.dex */
public final class d extends a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@d5.d x xVar) {
        super(xVar);
        l0.p(xVar, ProtectedSandApp.s("䦕"));
    }

    private final List<String> y(kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar) {
        List<String> k5;
        if (!(gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.b)) {
            if (!(gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.j)) {
                return EmptyList.f23167o;
            }
            k5 = kotlin.collections.z.k(((kotlin.reflect.jvm.internal.impl.resolve.constants.j) gVar).c().l());
            return k5;
        }
        List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> b6 = ((kotlin.reflect.jvm.internal.impl.resolve.constants.b) gVar).b();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = b6.iterator();
        while (it.hasNext()) {
            kotlin.collections.f0.q0(arrayList, y((kotlin.reflect.jvm.internal.impl.resolve.constants.g) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.a
    @d5.d
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Iterable<String> b(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar, boolean z5) {
        l0.p(cVar, ProtectedSandApp.s("䦖"));
        Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a6 = cVar.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> entry : a6.entrySet()) {
            kotlin.collections.f0.q0(arrayList, (!z5 || l0.g(entry.getKey(), b0.f24477c)) ? y(entry.getValue()) : EmptyList.f23167o);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.a
    @d5.e
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.name.c i(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("䦗"));
        return cVar.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.a
    @d5.d
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Object j(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("䦘"));
        kotlin.reflect.jvm.internal.impl.descriptors.e i5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.i(cVar);
        l0.m(i5);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.a
    @d5.d
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> k(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations;
        l0.p(cVar, ProtectedSandApp.s("䦙"));
        kotlin.reflect.jvm.internal.impl.descriptors.e i5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.i(cVar);
        return (i5 == null || (annotations = i5.getAnnotations()) == null) ? EmptyList.f23167o : annotations;
    }
}
