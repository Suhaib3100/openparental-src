package rd;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;

/* compiled from: PlatformDependentDeclarationFilter.kt */
/* loaded from: classes7.dex */
public interface c {

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public static final a f89865a = new a();

        private a() {
        }

        @Override // rd.c
        public boolean b(@l e eVar, @l z0 z0Var) {
            l0.p(eVar, ProtectedSandApp.s("ꋼ\u0001"));
            l0.p(z0Var, ProtectedSandApp.s("ꋽ\u0001"));
            return true;
        }
    }

    /* compiled from: PlatformDependentDeclarationFilter.kt */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public static final b f89866a = new b();

        private b() {
        }

        @Override // rd.c
        public boolean b(@l e eVar, @l z0 z0Var) {
            l0.p(eVar, ProtectedSandApp.s("ꋾ\u0001"));
            l0.p(z0Var, ProtectedSandApp.s("ꋿ\u0001"));
            return !z0Var.getAnnotations().o3(d.a());
        }
    }

    boolean b(@l e eVar, @l z0 z0Var);
}
