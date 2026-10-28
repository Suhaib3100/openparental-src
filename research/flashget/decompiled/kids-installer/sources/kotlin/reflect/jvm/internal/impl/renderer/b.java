package kotlin.reflect.jvm.internal.impl.renderer;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.g0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.f1;

/* compiled from: ClassifierNamePolicy.kt */
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: ClassifierNamePolicy.kt */
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        public static final a f25807a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.b
        @d5.d
        public String a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.h hVar, @d5.d kotlin.reflect.jvm.internal.impl.renderer.c cVar) {
            l0.p(hVar, ProtectedSandApp.s("佻"));
            l0.p(cVar, ProtectedSandApp.s("佼"));
            if (hVar instanceof f1) {
                kotlin.reflect.jvm.internal.impl.name.f name = ((f1) hVar).getName();
                l0.o(name, ProtectedSandApp.s("佽"));
                return cVar.x(name, false);
            }
            kotlin.reflect.jvm.internal.impl.name.d m5 = kotlin.reflect.jvm.internal.impl.resolve.e.m(hVar);
            l0.o(m5, ProtectedSandApp.s("佾"));
            return cVar.w(m5);
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.renderer.b$b, reason: collision with other inner class name */
    public static final class C0366b implements b {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        public static final C0366b f25808a = new C0366b();

        private C0366b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.h] */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.j0, kotlin.reflect.jvm.internal.impl.descriptors.m] */
        /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.m] */
        @Override // kotlin.reflect.jvm.internal.impl.renderer.b
        @d5.d
        public String a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.h hVar, @d5.d kotlin.reflect.jvm.internal.impl.renderer.c cVar) {
            List b12;
            l0.p(hVar, ProtectedSandApp.s("使"));
            l0.p(cVar, ProtectedSandApp.s("侀"));
            if (hVar instanceof f1) {
                kotlin.reflect.jvm.internal.impl.name.f name = ((f1) hVar).getName();
                l0.o(name, ProtectedSandApp.s("侁"));
                return cVar.x(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(hVar.getName());
                hVar = hVar.b();
            } while (hVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e);
            b12 = g0.b1(arrayList);
            return n.c(b12);
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        public static final c f25809a = new c();

        private c() {
        }

        private final String b(kotlin.reflect.jvm.internal.impl.descriptors.h hVar) {
            kotlin.reflect.jvm.internal.impl.name.f name = hVar.getName();
            l0.o(name, ProtectedSandApp.s("侂"));
            String b6 = n.b(name);
            if (hVar instanceof f1) {
                return b6;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.m b7 = hVar.b();
            l0.o(b7, ProtectedSandApp.s("侃"));
            String c6 = c(b7);
            if (c6 == null || l0.g(c6, "")) {
                return b6;
            }
            return c6 + org.apache.commons.io.k.f32026a + b6;
        }

        private final String c(kotlin.reflect.jvm.internal.impl.descriptors.m mVar) {
            if (mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
                return b((kotlin.reflect.jvm.internal.impl.descriptors.h) mVar);
            }
            if (!(mVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.l0)) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.name.d j5 = ((kotlin.reflect.jvm.internal.impl.descriptors.l0) mVar).f().j();
            l0.o(j5, ProtectedSandApp.s("侄"));
            return n.a(j5);
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.b
        @d5.d
        public String a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.h hVar, @d5.d kotlin.reflect.jvm.internal.impl.renderer.c cVar) {
            l0.p(hVar, ProtectedSandApp.s("侅"));
            l0.p(cVar, ProtectedSandApp.s("來"));
            return b(hVar);
        }
    }

    @d5.d
    String a(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.h hVar, @d5.d kotlin.reflect.jvm.internal.impl.renderer.c cVar);
}
