package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: Annotations.kt */
/* loaded from: classes7.dex */
public interface g extends Iterable<c>, md.a {

    /* renamed from: n2, reason: collision with root package name */
    @fg.l
    public static final a f75911n2 = a.f75912a;

    /* compiled from: Annotations.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f75912a = new a();

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        private static final g f75913b = new C1078a();

        /* compiled from: Annotations.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a$a, reason: collision with other inner class name */
        public static final class C1078a implements g {
            C1078a() {
            }

            @fg.m
            public Void b(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
                l0.p(cVar, ProtectedSandApp.s("櫽\u0001"));
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            @fg.l
            public Iterator<c> iterator() {
                j0.f74919b.getClass();
                return i0.f74913b;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
            public /* bridge */ /* synthetic */ c k(kotlin.reflect.jvm.internal.impl.name.c cVar) {
                return (c) b(cVar);
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
            public boolean o3(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
                return b.b(this, cVar);
            }

            @fg.l
            public String toString() {
                return ProtectedSandApp.s("櫾\u0001");
            }
        }

        private a() {
        }

        @fg.l
        public final g a(@fg.l List<? extends c> list) {
            l0.p(list, ProtectedSandApp.s("櫿\u0001"));
            return list.isEmpty() ? f75913b : new h(list);
        }

        @fg.l
        public final g b() {
            return f75913b;
        }
    }

    /* compiled from: Annotations.kt */
    @r1({"SMAP\nAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/Annotations$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n288#2,2:124\n*S KotlinDebug\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/Annotations$DefaultImpls\n*L\n29#1:124,2\n*E\n"})
    public static final class b {
        @fg.m
        public static c a(@fg.l g gVar, @fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
            c cVar2;
            l0.p(cVar, ProtectedSandApp.s("欀\u0001"));
            Iterator<c> it = gVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar2 = null;
                    break;
                }
                cVar2 = it.next();
                if (l0.g(cVar2.g(), cVar)) {
                    break;
                }
            }
            return cVar2;
        }

        public static boolean b(@fg.l g gVar, @fg.l kotlin.reflect.jvm.internal.impl.name.c cVar) {
            l0.p(cVar, ProtectedSandApp.s("欀\u0001"));
            return gVar.k(cVar) != null;
        }
    }

    boolean isEmpty();

    @fg.m
    c k(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar);

    boolean o3(@fg.l kotlin.reflect.jvm.internal.impl.name.c cVar);
}
