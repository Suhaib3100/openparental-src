package w3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;

/* compiled from: PlatformDependentDeclarationFilter.kt */
/* loaded from: classes5.dex */
public interface c {

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    /* loaded from: classes6.dex */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        public static final a f34019a = new a();

        private a() {
        }

        @Override // w3.c
        public boolean c(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d z0 z0Var) {
            l0.p(eVar, ProtectedSandApp.s("鑷"));
            l0.p(z0Var, ProtectedSandApp.s("鑸"));
            return true;
        }
    }

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    /* loaded from: classes6.dex */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        public static final b f34020a = new b();

        private b() {
        }

        @Override // w3.c
        public boolean c(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d z0 z0Var) {
            l0.p(eVar, ProtectedSandApp.s("鑹"));
            l0.p(z0Var, ProtectedSandApp.s("鑺"));
            return !z0Var.getAnnotations().O0(d.a());
        }
    }

    boolean c(@d5.d kotlin.reflect.jvm.internal.impl.descriptors.e eVar, @d5.d z0 z0Var);
}
