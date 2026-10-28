package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.sequences.p;

/* compiled from: Annotations.kt */
@r1({"SMAP\nAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/CompositeAnnotations\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,123:1\n1726#2,3:124\n1360#2:129\n1446#2,5:130\n1247#3,2:127\n*S KotlinDebug\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/CompositeAnnotations\n*L\n105#1:124,3\n112#1:129\n112#1:130,5\n107#1:127,2\n*E\n"})
/* loaded from: classes7.dex */
public final class k implements g {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final List<g> f75921b;

    /* compiled from: Annotations.kt */
    static final class a extends n0 implements ld.l<g, c> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.c f75922b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.reflect.jvm.internal.impl.name.c cVar) {
            super(1);
            this.f75922b = cVar;
        }

        @Override // ld.l
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke(@fg.l g gVar) {
            l0.p(gVar, ProtectedSandApp.s("欉\u0001"));
            return gVar.k(this.f75922b);
        }
    }

    /* compiled from: Annotations.kt */
    static final class b extends n0 implements ld.l<g, kotlin.sequences.m<? extends c>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f75923b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kotlin.sequences.m<c> invoke(@fg.l g gVar) {
            l0.p(gVar, ProtectedSandApp.s("權\u0001"));
            return w.A1(gVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(@fg.l List<? extends g> list) {
        l0.p(list, ProtectedSandApp.s("欋\u0001"));
        this.f75921b = list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        List<g> list = this.f75921b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    @fg.l
    public Iterator<c> iterator() {
        return p.H0(w.A1(this.f75921b), b.f75923b).iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    @fg.m
    public c k(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("欌\u0001"));
        return (c) p.F0(p.p1(w.A1(this.f75921b), new a(cVar)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean o3(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
        l0.p(cVar, ProtectedSandApp.s("欌\u0001"));
        Iterator it = w.A1(this.f75921b).iterator();
        while (it.hasNext()) {
            if (((g) it.next()).o3(cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(@fg.l g... gVarArr) {
        this((List<? extends g>) kotlin.collections.l.Ky(gVarArr));
        l0.p(gVarArr, ProtectedSandApp.s("欋\u0001"));
    }
}
