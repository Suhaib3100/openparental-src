package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: Annotations.kt */
@r1({"SMAP\nAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/FilteredAnnotations\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n766#2:124\n857#2,2:125\n1747#2,3:127\n*S KotlinDebug\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/FilteredAnnotations\n*L\n69#1:124\n69#1:125,2\n72#1:127,3\n*E\n"})
/* loaded from: classes7.dex */
public final class l implements g {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final g f75924b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f75925c;

    /* renamed from: d, reason: collision with root package name */
    @fg.l
    private final ld.l<kotlin.reflect.jvm.internal.impl.name.c, Boolean> f75926d;

    /* JADX WARN: Multi-variable type inference failed */
    public l(@fg.l g gVar, boolean z4, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.c, Boolean> lVar) {
        l0.p(gVar, ProtectedSandApp.s("欍\u0001"));
        l0.p(lVar, ProtectedSandApp.s("欎\u0001"));
        this.f75924b = gVar;
        this.f75925c = z4;
        this.f75926d = lVar;
    }

    private final boolean b(c cVar) {
        kotlin.reflect.jvm.internal.impl.name.c g4 = cVar.g();
        return g4 != null && this.f75926d.invoke(g4).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        boolean z4;
        g gVar = this.f75924b;
        if (!(gVar instanceof Collection) || !((Collection) gVar).isEmpty()) {
            Iterator<c> it = gVar.iterator();
            while (it.hasNext()) {
                if (b(it.next())) {
                    z4 = true;
                    break;
                }
            }
        }
        z4 = false;
        return this.f75925c ? !z4 : z4;
    }

    @Override // java.lang.Iterable
    @fg.l
    public Iterator<c> iterator() {
        g gVar = this.f75924b;
        ArrayList arrayList = new ArrayList();
        for (c cVar : gVar) {
            if (b(cVar)) {
                arrayList.add(cVar);
            }
        }
        return arrayList.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    @fg.m
    public c k(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("欏\u0001"));
        if (this.f75926d.invoke(cVar).booleanValue()) {
            return this.f75924b.k(cVar);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean o3(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("欏\u0001"));
        if (this.f75926d.invoke(cVar).booleanValue()) {
            return this.f75924b.o3(cVar);
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(@fg.l g gVar, @fg.l ld.l<? super kotlin.reflect.jvm.internal.impl.name.c, Boolean> lVar) {
        this(gVar, false, lVar);
        l0.p(gVar, ProtectedSandApp.s("欍\u0001"));
        l0.p(lVar, ProtectedSandApp.s("欎\u0001"));
    }
}
