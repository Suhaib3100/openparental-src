package com.google.firebase.sessions.settings;

import android.content.Context;
import androidx.content.core.CorruptionException;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.installations.k;
import com.google.firebase.remoteconfig.p;
import com.google.firebase.sessions.w;
import com.google.firebase.sessions.y;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;
import kotlin.reflect.o;
import kotlin.time.e;

/* compiled from: SessionsSettings.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B1\b\u0012\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0005\u0010\u0010B)\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u001dH\u0086@ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0011\u0010%\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\u0015\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\"\u0010&R\u001a\u0010\u001a\u001a\u00020\u00198Fø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006)"}, d2 = {"Lcom/google/firebase/sessions/settings/f;", "", "Lcom/google/firebase/sessions/settings/h;", "localOverrideSettings", "remoteSettings", "<init>", "(Lcom/google/firebase/sessions/settings/h;Lcom/google/firebase/sessions/settings/h;)V", "Landroid/content/Context;", "context", "Lkotlin/coroutines/g;", "blockingDispatcher", "backgroundDispatcher", "Lcom/google/firebase/installations/k;", "firebaseInstallationsApi", "Lcom/google/firebase/sessions/b;", "appInfo", "(Landroid/content/Context;Lkotlin/coroutines/g;Lkotlin/coroutines/g;Lcom/google/firebase/installations/k;Lcom/google/firebase/sessions/b;)V", "Lcom/google/firebase/g;", "firebaseApp", "(Lcom/google/firebase/g;Lkotlin/coroutines/g;Lkotlin/coroutines/g;Lcom/google/firebase/installations/k;)V", "", "samplingRate", "", "e", "(D)Z", "Lkotlin/time/e;", "sessionRestartTimeout", "f", "(J)Z", "Lkotlin/k2;", "g", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "Lcom/google/firebase/sessions/settings/h;", "b", "d", "()Z", "sessionsEnabled", "()D", "c", "()J", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final h localOverrideSettings;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private final h remoteSettings;

    /* renamed from: d, reason: collision with root package name */
    @l
    private static final String f60982d = ProtectedSandApp.s("Տ\u0001");

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    @l
    private static final kotlin.properties.e<Context, androidx.content.core.e<androidx.content.preferences.core.d>> f60983e = androidx.content.preferences.a.b(y.f61031a.b(), new o1.b(a.f60986b), null, null, 12, null);

    /* compiled from: SessionsSettings.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/datastore/core/CorruptionException;", "ex", "Landroidx/datastore/preferences/core/d;", "a", "(Landroidx/datastore/core/CorruptionException;)Landroidx/datastore/preferences/core/d;"}, k = 3, mv = {1, 8, 0})
    static final class a extends n0 implements ld.l<CorruptionException, androidx.content.preferences.core.d> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f60986b = new a(1);

        a() {
            super(1);
        }

        @Override // ld.l
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.content.preferences.core.d invoke(@l CorruptionException corruptionException) {
            l0.p(corruptionException, ProtectedSandApp.s("Ջ\u0001"));
            w.f61030a.e();
            return androidx.content.preferences.core.e.b();
        }
    }

    /* compiled from: SessionsSettings.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/firebase/sessions/settings/f$b;", "", "<init>", "()V", "Landroid/content/Context;", "Landroidx/datastore/core/e;", "Landroidx/datastore/preferences/core/d;", "dataStore$delegate", "Lkotlin/properties/e;", "b", "(Landroid/content/Context;)Landroidx/datastore/core/e;", "dataStore", "Lcom/google/firebase/sessions/settings/f;", "c", "()Lcom/google/firebase/sessions/settings/f;", "instance", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.google.firebase.sessions.settings.f$b, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ o<Object>[] f60987a = {l1.v(new i1(Companion.class, ProtectedSandApp.s("Ռ\u0001"), ProtectedSandApp.s("Ս\u0001"), 0))};

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final androidx.content.core.e<androidx.content.preferences.core.d> b(Context context) {
            return (androidx.content.core.e) f.f60983e.a(context, f60987a[0]);
        }

        @l
        public final f c() {
            Object l4 = com.google.firebase.o.c(com.google.firebase.d.f59602a).l(f.class);
            l0.o(l4, ProtectedSandApp.s("Վ\u0001"));
            return (f) l4;
        }

        private Companion() {
        }
    }

    /* compiled from: SessionsSettings.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", i = {0}, l = {138, 139}, m = "updateSettings", n = {"this"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f60988b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f60989c;

        /* renamed from: e, reason: collision with root package name */
        int f60991e;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.f60989c = obj;
            this.f60991e |= Integer.MIN_VALUE;
            return f.this.g(this);
        }
    }

    public f(@l h hVar, @l h hVar2) {
        l0.p(hVar, ProtectedSandApp.s("Օ\u0001"));
        l0.p(hVar2, ProtectedSandApp.s("Ֆ\u0001"));
        this.localOverrideSettings = hVar;
        this.remoteSettings = hVar2;
    }

    private final boolean e(double samplingRate) {
        return p.f60679p <= samplingRate && samplingRate <= 1.0d;
    }

    private final boolean f(long sessionRestartTimeout) {
        return kotlin.time.e.g0(sessionRestartTimeout) && kotlin.time.e.b0(sessionRestartTimeout);
    }

    public final double b() {
        Double c5 = this.localOverrideSettings.c();
        if (c5 != null) {
            double doubleValue = c5.doubleValue();
            if (e(doubleValue)) {
                return doubleValue;
            }
        }
        Double c6 = this.remoteSettings.c();
        if (c6 == null) {
            return 1.0d;
        }
        double doubleValue2 = c6.doubleValue();
        if (e(doubleValue2)) {
            return doubleValue2;
        }
        return 1.0d;
    }

    public final long c() {
        kotlin.time.e b5 = this.localOverrideSettings.b();
        if (b5 != null) {
            long rawValue = b5.getRawValue();
            if (f(rawValue)) {
                return rawValue;
            }
        }
        kotlin.time.e b6 = this.remoteSettings.b();
        if (b6 != null) {
            long rawValue2 = b6.getRawValue();
            if (f(rawValue2)) {
                return rawValue2;
            }
        }
        e.Companion companion = kotlin.time.e.INSTANCE;
        return kotlin.time.g.m0(30, kotlin.time.h.MINUTES);
    }

    public final boolean d() {
        Boolean a5 = this.localOverrideSettings.a();
        if (a5 != null) {
            return a5.booleanValue();
        }
        Boolean a6 = this.remoteSettings.a();
        if (a6 != null) {
            return a6.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(@fg.l kotlin.coroutines.d<? super kotlin.k2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.settings.f.c
            if (r0 == 0) goto L13
            r0 = r6
            com.google.firebase.sessions.settings.f$c r0 = (com.google.firebase.sessions.settings.f.c) r0
            int r1 = r0.f60991e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60991e = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.f$c r0 = new com.google.firebase.sessions.settings.f$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f60989c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f60991e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2a
            kotlin.a1.n(r6)
            goto L5d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "\u0557\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r6.<init>(r0)
            throw r6
        L36:
            java.lang.Object r2 = r0.f60988b
            com.google.firebase.sessions.settings.f r2 = (com.google.firebase.sessions.settings.f) r2
            kotlin.a1.n(r6)
            goto L4f
        L3e:
            kotlin.a1.n(r6)
            com.google.firebase.sessions.settings.h r6 = r5.localOverrideSettings
            r0.f60988b = r5
            r0.f60991e = r4
            java.lang.Object r6 = r6.e(r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r2 = r5
        L4f:
            com.google.firebase.sessions.settings.h r6 = r2.remoteSettings
            r2 = 0
            r0.f60988b = r2
            r0.f60991e = r3
            java.lang.Object r6 = r6.e(r0)
            if (r6 != r1) goto L5d
            return r1
        L5d:
            kotlin.k2 r6 = kotlin.k2.f75408a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.f.g(kotlin.coroutines.d):java.lang.Object");
    }

    private f(Context context, kotlin.coroutines.g gVar, kotlin.coroutines.g gVar2, k kVar, com.google.firebase.sessions.b bVar) {
        this(new b(context), new com.google.firebase.sessions.settings.c(gVar2, kVar, bVar, new d(bVar, gVar, null, 4, null), INSTANCE.b(context)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(@fg.l com.google.firebase.g r8, @fg.l kotlin.coroutines.g r9, @fg.l kotlin.coroutines.g r10, @fg.l com.google.firebase.installations.k r11) {
        /*
            r7 = this;
            java.lang.String r0 = "Ր\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r8, r0)
            java.lang.String r0 = "Ց\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r9, r0)
            java.lang.String r0 = "Ւ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r10, r0)
            java.lang.String r0 = "Փ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.p(r11, r0)
            android.content.Context r2 = r8.n()
            java.lang.String r0 = "Ք\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            kotlin.jvm.internal.l0.o(r2, r0)
            com.google.firebase.sessions.d0 r0 = com.google.firebase.sessions.d0.f60857a
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
