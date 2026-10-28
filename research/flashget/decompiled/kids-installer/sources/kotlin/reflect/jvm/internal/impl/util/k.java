package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.util.f;

/* compiled from: modifierChecks.kt */
/* loaded from: classes5.dex */
public abstract class k implements f {

    /* renamed from: a, reason: collision with root package name */
    @d5.d
    private final String f26596a;

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes6.dex */
    public static final class a extends k {

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        public static final a f26597b = new a();

        private a() {
            super(ProtectedSandApp.s("见"), null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean c(@d5.d z zVar) {
            l0.p(zVar, ProtectedSandApp.s("观"));
            return zVar.m0() != null;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes6.dex */
    public static final class b extends k {

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        public static final b f26598b = new b();

        private b() {
            super(ProtectedSandApp.s("觃"), null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean c(@d5.d z zVar) {
            l0.p(zVar, ProtectedSandApp.s("规"));
            return (zVar.m0() == null && zVar.t0() == null) ? false : true;
        }
    }

    public /* synthetic */ k(String str, w wVar) {
        this(str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @d5.d
    public String a() {
        return this.f26596a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @d5.e
    public String b(@d5.d z zVar) {
        return f.a.a(this, zVar);
    }

    private k(String str) {
        this.f26596a = str;
    }
}
