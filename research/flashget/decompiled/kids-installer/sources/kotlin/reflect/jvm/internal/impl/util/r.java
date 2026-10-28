package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.types.h0;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.util.f;

/* compiled from: modifierChecks.kt */
/* loaded from: classes5.dex */
public abstract class r implements f {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final String f26637a;

    /* renamed from: b, reason: collision with root package name */
    @d5.d
    private final q3.l<kotlin.reflect.jvm.internal.impl.builtins.h, h0> f26638b;

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private final String f26639c;

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes6.dex */
    public static final class a extends r {

        /* renamed from: d, reason: collision with root package name */
        @d5.d
        public static final a f26640d = new a();

        /* compiled from: modifierChecks.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.util.r$a$a, reason: collision with other inner class name */
        static final class C0395a extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.builtins.h, h0> {

            /* renamed from: p, reason: collision with root package name */
            public static final C0395a f26641p = new C0395a();

            C0395a() {
                super(1);
            }

            @Override // q3.l
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h0 N(@d5.d kotlin.reflect.jvm.internal.impl.builtins.h hVar) {
                l0.p(hVar, ProtectedSandApp.s("角"));
                p0 n5 = hVar.n();
                l0.o(n5, ProtectedSandApp.s("觓"));
                return n5;
            }
        }

        private a() {
            super(ProtectedSandApp.s("觔"), C0395a.f26641p, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes6.dex */
    public static final class b extends r {

        /* renamed from: d, reason: collision with root package name */
        @d5.d
        public static final b f26642d = new b();

        /* compiled from: modifierChecks.kt */
        static final class a extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.builtins.h, h0> {

            /* renamed from: p, reason: collision with root package name */
            public static final a f26643p = new a();

            a() {
                super(1);
            }

            @Override // q3.l
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h0 N(@d5.d kotlin.reflect.jvm.internal.impl.builtins.h hVar) {
                l0.p(hVar, ProtectedSandApp.s("觕"));
                p0 D = hVar.D();
                l0.o(D, ProtectedSandApp.s("觖"));
                return D;
            }
        }

        private b() {
            super(ProtectedSandApp.s("觗"), a.f26643p, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes6.dex */
    public static final class c extends r {

        /* renamed from: d, reason: collision with root package name */
        @d5.d
        public static final c f26644d = new c();

        /* compiled from: modifierChecks.kt */
        static final class a extends Lambda implements q3.l<kotlin.reflect.jvm.internal.impl.builtins.h, h0> {

            /* renamed from: p, reason: collision with root package name */
            public static final a f26645p = new a();

            a() {
                super(1);
            }

            @Override // q3.l
            @d5.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h0 N(@d5.d kotlin.reflect.jvm.internal.impl.builtins.h hVar) {
                l0.p(hVar, ProtectedSandApp.s("觘"));
                p0 Z = hVar.Z();
                l0.o(Z, ProtectedSandApp.s("觙"));
                return Z;
            }
        }

        private c() {
            super(ProtectedSandApp.s("觚"), a.f26645p, null);
        }
    }

    public /* synthetic */ r(String str, q3.l lVar, w wVar) {
        this(str, lVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @d5.d
    public String a() {
        return this.f26639c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @d5.e
    public String b(@d5.d z zVar) {
        return f.a.a(this, zVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    public boolean c(@d5.d z zVar) {
        l0.p(zVar, ProtectedSandApp.s("壮"));
        return l0.g(zVar.i(), this.f26638b.N(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.j(zVar)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private r(String str, q3.l<? super kotlin.reflect.jvm.internal.impl.builtins.h, ? extends h0> lVar) {
        this.f26637a = str;
        this.f26638b = lVar;
        this.f26639c = androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("壭"), str);
    }
}
