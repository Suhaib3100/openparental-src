package kotlin.reflect.jvm.internal.impl.util;

import androidx.collection.r2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.util.f;

/* compiled from: modifierChecks.kt */
/* loaded from: classes7.dex */
public abstract class t implements f {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final String f78657a;

    /* compiled from: modifierChecks.kt */
    public static final class a extends t {

        /* renamed from: b, reason: collision with root package name */
        private final int f78658b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(int r3) {
            /*
                r2 = this;
                java.lang.String r0 = "脝\u0001"
                java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
                java.lang.String r1 = "脞\u0001"
                java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
                java.lang.StringBuilder r0 = androidx.collection.s.a(r0, r3, r1)
                r1 = 1
                if (r3 <= r1) goto L1a
                java.lang.String r1 = "脟\u0001"
                java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)
                goto L1c
            L1a:
                java.lang.String r1 = ""
            L1c:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                r2.f78658b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.t.a.<init>(int):void");
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean c(@fg.l z zVar) {
            l0.p(zVar, ProtectedSandApp.s("脠\u0001"));
            return zVar.i().size() >= this.f78658b;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class b extends t {

        /* renamed from: b, reason: collision with root package name */
        private final int f78659b;

        public b(int i4) {
            super(r2.a(ProtectedSandApp.s("脡\u0001"), i4, ProtectedSandApp.s("脢\u0001")), null);
            this.f78659b = i4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean c(@fg.l z zVar) {
            l0.p(zVar, ProtectedSandApp.s("脣\u0001"));
            return zVar.i().size() == this.f78659b;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class c extends t {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        public static final c f78660b = new c();

        private c() {
            super(ProtectedSandApp.s("脤\u0001"), null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean c(@fg.l z zVar) {
            l0.p(zVar, ProtectedSandApp.s("脥\u0001"));
            return zVar.i().isEmpty();
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class d extends t {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        public static final d f78661b = new d();

        private d() {
            super(ProtectedSandApp.s("脦\u0001"), null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean c(@fg.l z zVar) {
            l0.p(zVar, ProtectedSandApp.s("脧\u0001"));
            return zVar.i().size() == 1;
        }
    }

    public /* synthetic */ t(String str, w wVar) {
        this(str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @fg.l
    public String a() {
        return this.f78657a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @fg.m
    public String b(@fg.l z zVar) {
        return f.a.a(this, zVar);
    }

    private t(String str) {
        this.f78657a = str;
    }
}
