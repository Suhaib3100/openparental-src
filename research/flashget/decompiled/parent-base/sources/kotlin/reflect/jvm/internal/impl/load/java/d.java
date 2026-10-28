package kotlin.reflect.jvm.internal.impl.load.java;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: AnnotationTypeQualifierResolver.kt */
@r1({"SMAP\nAnnotationTypeQualifierResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotationTypeQualifierResolver.kt\norg/jetbrains/kotlin/load/java/AnnotationTypeQualifierResolver\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n76#2:55\n96#2,5:56\n1360#3:61\n1446#3,5:62\n*S KotlinDebug\n*F\n+ 1 AnnotationTypeQualifierResolver.kt\norg/jetbrains/kotlin/load/java/AnnotationTypeQualifierResolver\n*L\n40#1:55\n40#1:56,5\n49#1:61\n49#1:62,5\n*E\n"})
/* loaded from: classes7.dex */
public final class d extends a<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@fg.l x xVar) {
        super(xVar);
        l0.p(xVar, ProtectedSandApp.s("瀼\u0001"));
    }

    private final List<String> y(kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVar) {
        if (!(gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.b)) {
            return gVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.j ? kotlin.collections.w.k(((kotlin.reflect.jvm.internal.impl.resolve.constants.j) gVar).c().d()) : kotlin.collections.j0.f74919b;
        }
        List<? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> b5 = ((kotlin.reflect.jvm.internal.impl.resolve.constants.b) gVar).b();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = b5.iterator();
        while (it.hasNext()) {
            kotlin.collections.w.q0(arrayList, y((kotlin.reflect.jvm.internal.impl.resolve.constants.g) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.a
    @fg.l
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Iterable<String> b(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar, boolean z4) {
        l0.p(cVar, ProtectedSandApp.s("瀽\u0001"));
        Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a5 = cVar.a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> entry : a5.entrySet()) {
            kotlin.collections.w.q0(arrayList, (!z4 || l0.g(entry.getKey(), b0.f76327c)) ? y(entry.getValue()) : kotlin.collections.j0.f74919b);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.a
    @fg.m
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.name.c i(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("瀽\u0001"));
        return cVar.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.a
    @fg.l
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public Object j(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("瀽\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.e i4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.i(cVar);
        l0.m(i4);
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.a
    @fg.l
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> k(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations;
        l0.p(cVar, ProtectedSandApp.s("瀽\u0001"));
        kotlin.reflect.jvm.internal.impl.descriptors.e i4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.i(cVar);
        return (i4 == null || (annotations = i4.getAnnotations()) == null) ? kotlin.collections.j0.f74919b : annotations;
    }
}
