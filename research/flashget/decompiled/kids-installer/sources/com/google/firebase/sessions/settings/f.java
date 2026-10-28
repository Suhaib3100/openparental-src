package com.google.firebase.sessions.settings;

import android.content.Context;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.installations.k;
import com.google.firebase.o;
import com.google.firebase.remoteconfig.p;
import com.google.firebase.sessions.x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.w;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;

/* compiled from: SessionsSettings.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aB1\b\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b\u0019\u0010$B)\b\u0016\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u0019\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\nH\u0086@ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0015\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006("}, d2 = {"Lcom/google/firebase/sessions/settings/f;", "", "", "samplingRate", "", "e", "Lkotlin/time/e;", "sessionRestartTimeout", "f", "(J)Z", "Lkotlin/m2;", "g", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/google/firebase/sessions/settings/h;", "a", "Lcom/google/firebase/sessions/settings/h;", "localOverrideSettings", "b", "remoteSettings", "d", "()Z", "sessionsEnabled", "()D", "c", "()J", "<init>", "(Lcom/google/firebase/sessions/settings/h;Lcom/google/firebase/sessions/settings/h;)V", "Landroid/content/Context;", "context", "Lkotlin/coroutines/g;", "blockingDispatcher", "backgroundDispatcher", "Lcom/google/firebase/installations/k;", "firebaseInstallationsApi", "Lcom/google/firebase/sessions/b;", "appInfo", "(Landroid/content/Context;Lkotlin/coroutines/g;Lkotlin/coroutines/g;Lcom/google/firebase/installations/k;Lcom/google/firebase/sessions/b;)V", "Lcom/google/firebase/g;", "firebaseApp", "(Lcom/google/firebase/g;Lkotlin/coroutines/g;Lkotlin/coroutines/g;Lcom/google/firebase/installations/k;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    private static final ReadOnlyProperty<Context, android.content.core.e<android.content.preferences.core.d>> f18708d = android.content.preferences.a.b(x.f18897a.b(), null, null, null, 14, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final h localOverrideSettings;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final h remoteSettings;

    /* compiled from: SessionsSettings.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/google/firebase/sessions/settings/f$a;", "", "Landroid/content/Context;", "Landroidx/datastore/core/e;", "Landroidx/datastore/preferences/core/d;", "dataStore$delegate", "Lkotlin/properties/e;", "b", "(Landroid/content/Context;)Landroidx/datastore/core/e;", "dataStore", "Lcom/google/firebase/sessions/settings/f;", "c", "()Lcom/google/firebase/sessions/settings/f;", "instance", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.google.firebase.sessions.settings.f$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f18711a = {l1.v(new i1(Companion.class, ProtectedSandApp.s("ᫎ"), ProtectedSandApp.s("\u1acf"), 0))};

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.content.core.e<android.content.preferences.core.d> b(Context context) {
            return (android.content.core.e) f.f18708d.a(context, f18711a[0]);
        }

        @d5.d
        public final f c() {
            Object l5 = o.c(com.google.firebase.d.f16581a).l(f.class);
            l0.o(l5, ProtectedSandApp.s("\u1ad0"));
            return (f) l5;
        }

        private Companion() {
        }
    }

    /* compiled from: SessionsSettings.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", i = {0}, l = {134, 135}, m = "updateSettings", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    static final class b extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f18712r;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f18713s;

        /* renamed from: u, reason: collision with root package name */
        int f18715u;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f18713s = obj;
            this.f18715u |= Integer.MIN_VALUE;
            return f.this.g(this);
        }
    }

    public f(@d5.d h hVar, @d5.d h hVar2) {
        l0.p(hVar, ProtectedSandApp.s("\u1ad6"));
        l0.p(hVar2, ProtectedSandApp.s("\u1ad7"));
        this.localOverrideSettings = hVar;
        this.remoteSettings = hVar2;
    }

    private final boolean e(double samplingRate) {
        return p.f18289o <= samplingRate && samplingRate <= 1.0d;
    }

    private final boolean f(long sessionRestartTimeout) {
        return Duration.l0(sessionRestartTimeout) && Duration.g0(sessionRestartTimeout);
    }

    public final double b() {
        Double d6 = this.localOverrideSettings.d();
        if (d6 != null) {
            double doubleValue = d6.doubleValue();
            if (e(doubleValue)) {
                return doubleValue;
            }
        }
        Double d7 = this.remoteSettings.d();
        if (d7 == null) {
            return 1.0d;
        }
        double doubleValue2 = d7.doubleValue();
        if (e(doubleValue2)) {
            return doubleValue2;
        }
        return 1.0d;
    }

    public final long c() {
        Duration b6 = this.localOverrideSettings.b();
        if (b6 != null) {
            long f27200o = b6.getF27200o();
            if (f(f27200o)) {
                return f27200o;
            }
        }
        Duration b7 = this.remoteSettings.b();
        if (b7 != null) {
            long f27200o2 = b7.getF27200o();
            if (f(f27200o2)) {
                return f27200o2;
            }
        }
        Duration.a aVar = Duration.f27196p;
        return kotlin.time.g.m0(30, DurationUnit.MINUTES);
    }

    public final boolean d() {
        Boolean a6 = this.localOverrideSettings.a();
        if (a6 != null) {
            return a6.booleanValue();
        }
        Boolean a7 = this.remoteSettings.a();
        if (a7 != null) {
            return a7.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(@d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.settings.f.b
            if (r0 == 0) goto L13
            r0 = r6
            com.google.firebase.sessions.settings.f$b r0 = (com.google.firebase.sessions.settings.f.b) r0
            int r1 = r0.f18715u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18715u = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.f$b r0 = new com.google.firebase.sessions.settings.f$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f18713s
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f18715u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2a
            kotlin.a1.n(r6)
            goto L5d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "\u1ad8"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r6.<init>(r0)
            throw r6
        L36:
            java.lang.Object r2 = r0.f18712r
            com.google.firebase.sessions.settings.f r2 = (com.google.firebase.sessions.settings.f) r2
            kotlin.a1.n(r6)
            goto L4f
        L3e:
            kotlin.a1.n(r6)
            com.google.firebase.sessions.settings.h r6 = r5.localOverrideSettings
            r0.f18712r = r5
            r0.f18715u = r4
            java.lang.Object r6 = r6.e(r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r2 = r5
        L4f:
            com.google.firebase.sessions.settings.h r6 = r2.remoteSettings
            r2 = 0
            r0.f18712r = r2
            r0.f18715u = r3
            java.lang.Object r6 = r6.e(r0)
            if (r6 != r1) goto L5d
            return r1
        L5d:
            kotlin.m2 r6 = kotlin.m2.f23662a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.f.g(kotlin.coroutines.d):java.lang.Object");
    }

    private f(Context context, CoroutineContext coroutineContext, CoroutineContext coroutineContext2, k kVar, com.google.firebase.sessions.b bVar) {
        this(new com.google.firebase.sessions.settings.b(context), new c(coroutineContext2, kVar, bVar, new d(bVar, coroutineContext, null, 4, null), INSTANCE.b(context)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(@d5.d com.google.firebase.g r8, @d5.d kotlin.coroutines.CoroutineContext r9, @d5.d kotlin.coroutines.CoroutineContext r10, @d5.d com.google.firebase.installations.k r11) {
        /*
            r7 = this;
            java.lang.String r0 = "\u1ad1"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r8, r0)
            java.lang.String r0 = "\u1ad2"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r9, r0)
            java.lang.String r0 = "\u1ad3"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r10, r0)
            java.lang.String r0 = "\u1ad4"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r11, r0)
            android.content.Context r2 = r8.n()
            java.lang.String r0 = "\u1ad5"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.o(r2, r0)
            com.google.firebase.sessions.c0 r0 = com.google.firebase.sessions.c0.f18578a
            com.google.firebase.sessions.b r6 = r0.c(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.f.<init>(com.google.firebase.g, kotlin.coroutines.g, kotlin.coroutines.g, com.google.firebase.installations.k):void");
    }
}
