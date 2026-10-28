package x3;

import com.flashget.kidsdownloader.ProtectedSandApp;
import d5.d;
import d5.e;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.n1;
import kotlin.reflect.jvm.internal.impl.descriptors.o1;

/* compiled from: JavaVisibilities.kt */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final a f34364a = new a();

    /* compiled from: JavaVisibilities.kt */
    /* renamed from: x3.a$a, reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0521a extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @d
        public static final C0521a f34365c = new C0521a();

        private C0521a() {
            super(ProtectedSandApp.s("鑽"), false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1
        @e
        public Integer a(@d o1 o1Var) {
            l0.p(o1Var, ProtectedSandApp.s("鑾"));
            if (this == o1Var) {
                return 0;
            }
            return n1.f24339a.b(o1Var) ? 1 : -1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1
        @d
        public String b() {
            return ProtectedSandApp.s("鑿");
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1
        @d
        public o1 d() {
            return n1.g.f24348c;
        }
    }

    /* compiled from: JavaVisibilities.kt */
    /* loaded from: classes6.dex */
    public static final class b extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @d
        public static final b f34366c = new b();

        private b() {
            super(ProtectedSandApp.s("钀"), true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1
        @e
        public Integer a(@d o1 o1Var) {
            l0.p(o1Var, ProtectedSandApp.s("钁"));
            if (l0.g(this, o1Var)) {
                return 0;
            }
            if (o1Var == n1.b.f24343c) {
                return null;
            }
            return Integer.valueOf(n1.f24339a.b(o1Var) ? 1 : -1);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1
        @d
        public String b() {
            return ProtectedSandApp.s("钂");
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1
        @d
        public o1 d() {
            return n1.g.f24348c;
        }
    }

    /* compiled from: JavaVisibilities.kt */
    /* loaded from: classes6.dex */
    public static final class c extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @d
        public static final c f34367c = new c();

        private c() {
            super(ProtectedSandApp.s("钃"), true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1
        @d
        public String b() {
            return ProtectedSandApp.s("钄");
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.o1
        @d
        public o1 d() {
            return n1.g.f24348c;
        }
    }

    private a() {
    }
}
