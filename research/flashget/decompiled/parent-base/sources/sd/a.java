package sd;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.n1;
import kotlin.reflect.jvm.internal.impl.descriptors.o1;

/* compiled from: JavaVisibilities.kt */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final a f91851a = new a();

    /* compiled from: JavaVisibilities.kt */
    /* renamed from: sd.a$a, reason: collision with other inner class name */
    public static final class C1395a extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @l
        public static final C1395a f91852c = new C1395a();

        private C1395a() {
            super(ProtectedSandApp.s("ꌉ\u0001"), false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1
        @m
        public Integer a(@l o1 o1Var) {
            l0.p(o1Var, ProtectedSandApp.s("ꌊ\u0001"));
            if (this == o1Var) {
                return 0;
            }
            return n1.f76189a.b(o1Var) ? 1 : -1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1
        @l
        public String b() {
            return ProtectedSandApp.s("ꌋ\u0001");
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1
        @l
        public o1 d() {
            return n1.g.f76198c;
        }
    }

    /* compiled from: JavaVisibilities.kt */
    public static final class b extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @l
        public static final b f91853c = new b();

        private b() {
            super(ProtectedSandApp.s("ꌌ\u0001"), true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1
        @m
        public Integer a(@l o1 o1Var) {
            l0.p(o1Var, ProtectedSandApp.s("ꌍ\u0001"));
            if (l0.g(this, o1Var)) {
                return 0;
            }
            if (o1Var == n1.b.f76193c) {
                return null;
            }
            return Integer.valueOf(n1.f76189a.b(o1Var) ? 1 : -1);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1
        @l
        public String b() {
            return ProtectedSandApp.s("ꌎ\u0001");
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1
        @l
        public o1 d() {
            return n1.g.f76198c;
        }
    }

    /* compiled from: JavaVisibilities.kt */
    public static final class c extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @l
        public static final c f91854c = new c();

        private c() {
            super(ProtectedSandApp.s("ꌏ\u0001"), true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1
        @l
        public String b() {
            return ProtectedSandApp.s("ꌐ\u0001");
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1
        @l
        public o1 d() {
            return n1.g.f76198c;
        }
    }

    private a() {
    }
}
