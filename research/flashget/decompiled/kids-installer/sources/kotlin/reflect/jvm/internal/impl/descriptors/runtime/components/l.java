package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.p;

/* compiled from: RuntimeSourceElementFactory.kt */
/* loaded from: classes5.dex */
public final class l implements a4.b {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    public static final l f24370a = new l();

    /* compiled from: RuntimeSourceElementFactory.kt */
    /* loaded from: classes6.dex */
    public static final class a implements a4.a {

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        private final p f24371b;

        public a(@d5.d p pVar) {
            l0.p(pVar, ProtectedSandApp.s("荑"));
            this.f24371b = pVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.a1
        @d5.d
        public b1 a() {
            b1 b1Var = b1.f24130a;
            l0.o(b1Var, ProtectedSandApp.s("荒"));
            return b1Var;
        }

        @Override // a4.a
        public b4.l b() {
            return this.f24371b;
        }

        @d5.d
        public p d() {
            return this.f24371b;
        }

        @d5.d
        public String toString() {
            return a.class.getName() + ProtectedSandApp.s("荓") + this.f24371b;
        }
    }

    private l() {
    }

    @Override // a4.b
    @d5.d
    public a4.a a(@d5.d b4.l lVar) {
        l0.p(lVar, ProtectedSandApp.s("䡤"));
        return new a((p) lVar);
    }
}
