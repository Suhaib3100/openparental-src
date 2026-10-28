package kotlin.reflect.jvm.internal.impl.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.descriptors.z;
import kotlin.reflect.jvm.internal.impl.util.f;

/* compiled from: modifierChecks.kt */
/* loaded from: classes7.dex */
public abstract class k implements f {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    private final String f78604a;

    /* compiled from: modifierChecks.kt */
    public static final class a extends k {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        public static final a f78605b = new a();

        private a() {
            super(ProtectedSandApp.s("胊\u0001"), null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean c(@fg.l z zVar) {
            l0.p(zVar, ProtectedSandApp.s("胋\u0001"));
            return zVar.O() != null;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class b extends k {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        public static final b f78606b = new b();

        private b() {
            super(ProtectedSandApp.s("背\u0001"), null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.f
        public boolean c(@fg.l z zVar) {
            l0.p(zVar, ProtectedSandApp.s("胍\u0001"));
            return (zVar.O() == null && zVar.S() == null) ? false : true;
        }
    }

    public /* synthetic */ k(String str, w wVar) {
        this(str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @fg.l
    public String a() {
        return this.f78604a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.f
    @fg.m
    public String b(@fg.l z zVar) {
        return f.a.a(this, zVar);
    }

    private k(String str) {
        this.f78604a = str;
    }
}
