package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import androidx.content.preferences.protobuf.m2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.p;

/* compiled from: RuntimeSourceElementFactory.kt */
/* loaded from: classes7.dex */
public final class l implements vd.b {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final l f76220a = new l();

    /* compiled from: RuntimeSourceElementFactory.kt */
    public static final class a implements vd.a {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        private final p f76221b;

        public a(@fg.l p pVar) {
            l0.p(pVar, ProtectedSandApp.s("湳\u0001"));
            this.f76221b = pVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.a1
        @fg.l
        public b1 b() {
            b1 b1Var = b1.f75928a;
            l0.o(b1Var, ProtectedSandApp.s("湴\u0001"));
            return b1Var;
        }

        @Override // vd.a
        public wd.l c() {
            return this.f76221b;
        }

        @fg.l
        public p d() {
            return this.f76221b;
        }

        @fg.l
        public String toString() {
            StringBuilder sb = new StringBuilder();
            m2.a(a.class, sb, ProtectedSandApp.s("湵\u0001"));
            sb.append(this.f76221b);
            return sb.toString();
        }
    }

    private l() {
    }

    @Override // vd.b
    @fg.l
    public vd.a a(@fg.l wd.l lVar) {
        l0.p(lVar, ProtectedSandApp.s("湶\u0001"));
        return new a((p) lVar);
    }
}
