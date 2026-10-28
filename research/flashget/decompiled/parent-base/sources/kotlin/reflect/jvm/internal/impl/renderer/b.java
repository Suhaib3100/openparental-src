package kotlin.reflect.jvm.internal.impl.renderer;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;

/* compiled from: ClassifierNamePolicy.kt */
/* loaded from: classes7.dex */
public interface b {

    /* compiled from: ClassifierNamePolicy.kt */
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f77789a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.b
        @fg.l
        public String a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h hVar, @fg.l kotlin.reflect.jvm.internal.impl.renderer.c cVar) {
            l0.p(hVar, ProtectedSandApp.s("盾\u0001"));
            l0.p(cVar, ProtectedSandApp.s("盿\u0001"));
            if (hVar instanceof f1) {
                kotlin.reflect.jvm.internal.impl.name.f name = ((f1) hVar).getName();
                l0.o(name, ProtectedSandApp.s("眀\u0001"));
                return cVar.x(name, false);
            }
            kotlin.reflect.jvm.internal.impl.name.d m4 = kotlin.reflect.jvm.internal.impl.resolve.f.m(hVar);
            l0.o(m4, ProtectedSandApp.s("省\u0001"));
            return cVar.w(m4);
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.b$b, reason: collision with other inner class name */
    public static final class C1171b implements b {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final C1171b f77790a = new C1171b();

        private C1171b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.h] */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.j0, kotlin.reflect.jvm.internal.impl.descriptors.m] */
        /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.m] */
        @Override // kotlin.reflect.jvm.internal.impl.renderer.b
        @fg.l
        public String a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h hVar, @fg.l kotlin.reflect.jvm.internal.impl.renderer.c cVar) {
            l0.p(hVar, ProtectedSandApp.s("眂\u0001"));
            l0.p(cVar, ProtectedSandApp.s("眃\u0001"));
            if (hVar instanceof f1) {
                kotlin.reflect.jvm.internal.impl.name.f name = ((f1) hVar).getName();
                l0.o(name, ProtectedSandApp.s("眄\u0001"));
                return cVar.x(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(hVar.getName());
                hVar = hVar.c();
            } while (hVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e);
            return n.c(w.b1(arrayList));
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final c f77791a = new c();

        private c() {
        }

        private final String b(kotlin.reflect.jvm.internal.impl.descriptors.h hVar) {
            kotlin.reflect.jvm.internal.impl.name.f name = hVar.getName();
            l0.o(name, ProtectedSandApp.s("眅\u0001"));
            String b5 = n.b(name);
            if (hVar instanceof f1) {
                return b5;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.m c5 = hVar.c();
            l0.o(c5, ProtectedSandApp.s("眆\u0001"));
            String c6 = c(c5);
            if (c6 == null || l0.g(c6, "")) {
                return b5;
            }
            return c6 + '.' + b5;
        }

        private final String c(kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
            if (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                return b((kotlin.reflect.jvm.internal.impl.descriptors.h) mVar);
            }
            if (!(mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0)) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.name.d j4 = ((kotlin.reflect.jvm.internal.impl.descriptors.l0) mVar).g().j();
            l0.o(j4, ProtectedSandApp.s("眇\u0001"));
            return n.a(j4);
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.b
        @fg.l
        public String a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h hVar, @fg.l kotlin.reflect.jvm.internal.impl.renderer.c cVar) {
            l0.p(hVar, ProtectedSandApp.s("眈\u0001"));
            l0.p(cVar, ProtectedSandApp.s("眉\u0001"));
            return b(hVar);
        }
    }

    @fg.l
    String a(@fg.l kotlin.reflect.jvm.internal.impl.descriptors.h hVar, @fg.l kotlin.reflect.jvm.internal.impl.renderer.c cVar);
}
