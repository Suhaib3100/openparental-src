package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.util.f;

/* compiled from: modifierChecks.kt */
/* loaded from: classes5.dex */
public abstract class t implements f {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final String f26649a;

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes6.dex */
    public static final class a extends t {

        /* renamed from: b, reason: collision with root package name */
        private final int f26650b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(int r3) {
            /*
                r2 = this;
                java.lang.String r0 = "觜"
                java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
                java.lang.String r1 = "觝"
                java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
                java.lang.StringBuilder r0 = androidx.core.app.x.a(r0, r3, r1)
                r1 = 1
                if (r3 <= r1) goto L1a
                java.lang.String r1 = "觞"
                java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)
                goto L1c
            L1a:
                java.lang.String r1 = ""
            L1c:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                r2.f26650b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.t.a.<init>(int):void");
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean c(@d5.d z zVar) {
            l0.p(zVar, ProtectedSandApp.s("觟"));
            return zVar.n().size() >= this.f26650b;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes6.dex */
    public static final class b extends t {

        /* renamed from: b, reason: collision with root package name */
        private final int f26651b;

        public b(int i5) {
            super(androidx.constraintlayout.solver.f.a(ProtectedSandApp.s("觠"), i5, ProtectedSandApp.s("觡")), null);
            this.f26651b = i5;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean c(@d5.d z zVar) {
            l0.p(zVar, ProtectedSandApp.s("觢"));
            return zVar.n().size() == this.f26651b;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes6.dex */
    public static final class c extends t {

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        public static final c f26652b = new c();

        private c() {
            super(ProtectedSandApp.s("解"), null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean c(@d5.d z zVar) {
            l0.p(zVar, ProtectedSandApp.s("觤"));
            return zVar.n().isEmpty();
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes6.dex */
    public static final class d extends t {

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        public static final d f26653b = new d();

        private d() {
            super(ProtectedSandApp.s("觥"), null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean c(@d5.d z zVar) {
            l0.p(zVar, ProtectedSandApp.s("触"));
            return zVar.n().size() == 1;
        }
    }

    public /* synthetic */ t(String str, w wVar) {
        this(str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @d5.d
    public String a() {
        return this.f26649a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @d5.e
    public String b(@d5.d z zVar) {
        return f.a.a(this, zVar);
    }

    private t(String str) {
        this.f26649a = str;
    }
}
