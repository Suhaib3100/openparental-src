package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyIterator;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.l0;

/* compiled from: Annotations.kt */
/* loaded from: classes5.dex */
public interface g extends Iterable<c>, r3.a {

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    public static final a f24114e = a.f24115a;

    /* compiled from: Annotations.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f24115a = new a();

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        private static final g f24116b = new C0275a();

        /* compiled from: Annotations.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0275a implements g {
            C0275a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
            public boolean O0(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
                return b.b(this, cVar);
            }

            @d5.e
            public Void b(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
                l0.p(cVar, ProtectedSandApp.s("脈"));
                return null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
            public /* bridge */ /* synthetic */ c e(kotlin.reflect.jvm.internal.impl.name.c cVar) {
                return (c) b(cVar);
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            @d5.d
            public Iterator<c> iterator() {
                EmptyList.f23167o.getClass();
                return EmptyIterator.f23163o;
            }

            @d5.d
            public String toString() {
                return ProtectedSandApp.s("脉");
            }
        }

        private a() {
        }

        @d5.d
        public final g a(@d5.d List<? extends c> list) {
            l0.p(list, ProtectedSandApp.s("䜈"));
            return list.isEmpty() ? f24116b : new h(list);
        }

        @d5.d
        public final g b() {
            return f24116b;
        }
    }

    /* compiled from: Annotations.kt */
    public static final class b {
        @d5.e
        public static c a(@d5.d g gVar, @d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
            c cVar2;
            l0.p(cVar, ProtectedSandApp.s("䜉"));
            Iterator<c> it = gVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar2 = null;
                    break;
                }
                cVar2 = it.next();
                if (l0.g(cVar2.f(), cVar)) {
                    break;
                }
            }
            return cVar2;
        }

        public static boolean b(@d5.d g gVar, @d5.d kotlin.reflect.jvm.internal.impl.name.c cVar) {
            l0.p(cVar, ProtectedSandApp.s("䜊"));
            return gVar.e(cVar) != null;
        }
    }

    boolean O0(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar);

    @d5.e
    c e(@d5.d kotlin.reflect.jvm.internal.impl.name.c cVar);

    boolean isEmpty();
}
