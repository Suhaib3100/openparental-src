package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.util.f;

/* compiled from: modifierChecks.kt */
/* loaded from: classes7.dex */
public abstract class r implements f {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final String f78645a;

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    private final ld.l<kotlin.reflect.jvm.internal.impl.builtins.h, h0> f78646b;

    /* renamed from: c, reason: collision with root package name */
    @fg.l
    private final String f78647c;

    /* compiled from: modifierChecks.kt */
    public static final class a extends r {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final a f78648d = new a();

        /* compiled from: modifierChecks.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.util.r$a$a, reason: collision with other inner class name */
        static final class C1199a extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.builtins.h, h0> {

            /* renamed from: b, reason: collision with root package name */
            public static final C1199a f78649b = new C1199a(1);

            C1199a() {
                super(1);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h0 invoke(@fg.l kotlin.reflect.jvm.internal.impl.builtins.h hVar) {
                l0.p(hVar, ProtectedSandApp.s("脑\u0001"));
                p0 n4 = hVar.n();
                l0.o(n4, ProtectedSandApp.s("脒\u0001"));
                return n4;
            }
        }

        private a() {
            super(ProtectedSandApp.s("脕\u0001"), C1199a.f78649b, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class b extends r {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final b f78650d = new b();

        /* compiled from: modifierChecks.kt */
        static final class a extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.builtins.h, h0> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f78651b = new a(1);

            a() {
                super(1);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h0 invoke(@fg.l kotlin.reflect.jvm.internal.impl.builtins.h hVar) {
                l0.p(hVar, ProtectedSandApp.s("脖\u0001"));
                p0 D = hVar.D();
                l0.o(D, ProtectedSandApp.s("脗\u0001"));
                return D;
            }
        }

        private b() {
            super(ProtectedSandApp.s("脘\u0001"), a.f78651b, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class c extends r {

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final c f78652d = new c();

        /* compiled from: modifierChecks.kt */
        static final class a extends n0 implements ld.l<kotlin.reflect.jvm.internal.impl.builtins.h, h0> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f78653b = new a(1);

            a() {
                super(1);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h0 invoke(@fg.l kotlin.reflect.jvm.internal.impl.builtins.h hVar) {
                l0.p(hVar, ProtectedSandApp.s("脙\u0001"));
                p0 Z = hVar.Z();
                l0.o(Z, ProtectedSandApp.s("脚\u0001"));
                return Z;
            }
        }

        private c() {
            super(ProtectedSandApp.s("脛\u0001"), a.f78653b, null);
        }
    }

    public /* synthetic */ r(String str, ld.l lVar, w wVar) {
        this(str, lVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @fg.l
    public String a() {
        return this.f78647c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @fg.m
    public String b(@fg.l z zVar) {
        return f.a.a(this, zVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    public boolean c(@fg.l z zVar) {
        l0.p(zVar, ProtectedSandApp.s("脔\u0001"));
        return l0.g(zVar.getReturnType(), this.f78646b.invoke(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(zVar)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private r(String str, ld.l<? super kotlin.reflect.jvm.internal.impl.builtins.h, ? extends h0> lVar) {
        this.f78645a = str;
        this.f78646b = lVar;
        this.f78647c = androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("脓\u0001"), str);
    }
}
