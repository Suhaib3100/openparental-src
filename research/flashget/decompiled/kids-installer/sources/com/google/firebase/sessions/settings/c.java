package com.google.firebase.sessions.settings;

import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.installations.k;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.m2;
import kotlin.text.Regex;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.l;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.v0;
import org.apache.log4j.net.SyslogAppender;
import org.json.JSONObject;
import q3.p;

/* compiled from: RemoteSettings.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\rB5\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0013\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016J\u000f\u0010\n\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\"R\u001f\u0010&\u001a\u0004\u0018\u00010$8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010%R\u0016\u0010)\u001a\u0004\u0018\u00010'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010(\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Lcom/google/firebase/sessions/settings/c;", "Lcom/google/firebase/sessions/settings/h;", "", "s", "h", "Lkotlin/m2;", "e", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "c", "g", "()V", "Lkotlin/coroutines/g;", "a", "Lkotlin/coroutines/g;", "backgroundDispatcher", "Lcom/google/firebase/installations/k;", "b", "Lcom/google/firebase/installations/k;", "firebaseInstallationsApi", "Lcom/google/firebase/sessions/b;", "Lcom/google/firebase/sessions/b;", "appInfo", "Lcom/google/firebase/sessions/settings/a;", "d", "Lcom/google/firebase/sessions/settings/a;", "configsFetcher", "Lcom/google/firebase/sessions/settings/g;", "Lcom/google/firebase/sessions/settings/g;", "settingsCache", "Lkotlinx/coroutines/sync/c;", "f", "Lkotlinx/coroutines/sync/c;", "fetchInProgress", "()Ljava/lang/Boolean;", "sessionEnabled", "Lkotlin/time/e;", "()Lkotlin/time/e;", "sessionRestartTimeout", "", "()Ljava/lang/Double;", "samplingRate", "Landroidx/datastore/core/e;", "Landroidx/datastore/preferences/core/d;", "dataStore", "<init>", "(Lkotlin/coroutines/g;Lcom/google/firebase/installations/k;Lcom/google/firebase/sessions/b;Lcom/google/firebase/sessions/settings/a;Landroidx/datastore/core/e;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class c implements h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final CoroutineContext backgroundDispatcher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final k firebaseInstallationsApi;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final com.google.firebase.sessions.b appInfo;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final com.google.firebase.sessions.settings.a configsFetcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final g settingsCache;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final kotlinx.coroutines.sync.c fetchInProgress;

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    @Deprecated
    public static final String f18669h = ProtectedSandApp.s("⮧");

    /* renamed from: i, reason: collision with root package name */
    @d5.d
    @Deprecated
    public static final String f18670i = ProtectedSandApp.s("⮨");

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    private static final a f18668g = new a(null);

    /* compiled from: RemoteSettings.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/google/firebase/sessions/settings/c$a;", "", "", "FORWARD_SLASH_STRING", "Ljava/lang/String;", "TAG", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    private static final class a {
        private a() {
        }

        public a(w wVar) {
        }
    }

    /* compiled from: RemoteSettings.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings$clearCachedSettings$1", f = "RemoteSettings.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    static final class b extends SuspendLambda implements p<u0, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f18677s;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f18677s;
            if (i5 == 0) {
                a1.n(obj);
                g gVar = c.this.settingsCache;
                this.f18677s = 1;
                if (gVar.j(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("㍙"));
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d u0 u0Var, @d5.e Continuation<? super m2> continuation) {
            return ((b) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            return c.this.new b(continuation);
        }
    }

    /* compiled from: RemoteSettings.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", i = {0, 0, 1, 1, 2}, l = {170, 76, 94}, m = "updateSettings", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: com.google.firebase.sessions.settings.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0234c extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f18679r;

        /* renamed from: s, reason: collision with root package name */
        Object f18680s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f18681t;

        /* renamed from: v, reason: collision with root package name */
        int f18683v;

        C0234c(Continuation<? super C0234c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f18681t = obj;
            this.f18683v |= Integer.MIN_VALUE;
            return c.this.e(this);
        }
    }

    /* compiled from: RemoteSettings.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", i = {0, 0, 0, 1, 1, 2}, l = {125, 128, 131, 133, 134, SyslogAppender.LOG_LOCAL1}, m = "invokeSuspend", n = {"sessionSamplingRate", "sessionTimeoutSeconds", "cacheDuration", "sessionSamplingRate", "cacheDuration", "cacheDuration"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lorg/json/JSONObject;", "it", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    static final class d extends SuspendLambda implements p<JSONObject, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        Object f18684s;

        /* renamed from: t, reason: collision with root package name */
        Object f18685t;

        /* renamed from: u, reason: collision with root package name */
        int f18686u;

        /* renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f18687v;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x019e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0162  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00f1  */
        /* JADX WARN: Type inference failed for: r12v9, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r1v6, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.Double] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object A(@d5.d java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 436
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.c.d.A(java.lang.Object):java.lang.Object");
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d JSONObject jSONObject, @d5.e Continuation<? super m2> continuation) {
            return ((d) c(jSONObject, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            d dVar = c.this.new d(continuation);
            dVar.f18687v = obj;
            return dVar;
        }
    }

    /* compiled from: RemoteSettings.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "msg", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    static final class e extends SuspendLambda implements p<String, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f18689s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f18690t;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f18689s != 0) {
                throw new IllegalStateException(ProtectedSandApp.s("㍡"));
            }
            a1.n(obj);
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d String str, @d5.e Continuation<? super m2> continuation) {
            return ((e) c(str, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            e eVar = new e(continuation);
            eVar.f18690t = obj;
            return eVar;
        }
    }

    public c(@d5.d CoroutineContext coroutineContext, @d5.d k kVar, @d5.d com.google.firebase.sessions.b bVar, @d5.d com.google.firebase.sessions.settings.a aVar, @d5.d android.content.core.e<android.content.preferences.core.d> eVar) {
        l0.p(coroutineContext, ProtectedSandApp.s("⮩"));
        l0.p(kVar, ProtectedSandApp.s("⮪"));
        l0.p(bVar, ProtectedSandApp.s("⮫"));
        l0.p(aVar, ProtectedSandApp.s("⮬"));
        l0.p(eVar, ProtectedSandApp.s("⮭"));
        this.backgroundDispatcher = coroutineContext;
        this.firebaseInstallationsApi = kVar;
        this.appInfo = bVar;
        this.configsFetcher = aVar;
        this.settingsCache = new g(eVar);
        this.fetchInProgress = kotlinx.coroutines.sync.e.b(false, 1, null);
    }

    private final String h(String s5) {
        return new Regex(ProtectedSandApp.s("⮮")).m(s5, "");
    }

    @Override // com.google.firebase.sessions.settings.h
    @d5.e
    public Boolean a() {
        return this.settingsCache.m();
    }

    @Override // com.google.firebase.sessions.settings.h
    @d5.e
    public Duration b() {
        Integer k5 = this.settingsCache.k();
        if (k5 == null) {
            return null;
        }
        Duration.a aVar = Duration.f27196p;
        return Duration.p(kotlin.time.g.m0(k5.intValue(), DurationUnit.SECONDS));
    }

    @Override // com.google.firebase.sessions.settings.h
    public boolean c() {
        return this.settingsCache.i();
    }

    @Override // com.google.firebase.sessions.settings.h
    @d5.e
    public Double d() {
        return this.settingsCache.l();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #2 {all -> 0x004e, blocks: (B:26:0x004a, B:27:0x00b2, B:29:0x00b6, B:33:0x00bd), top: B:25:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d A[Catch: all -> 0x0171, TRY_LEAVE, TryCatch #0 {all -> 0x0171, blocks: (B:41:0x0085, B:43:0x008d, B:46:0x0093), top: B:40:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093 A[Catch: all -> 0x0171, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0171, blocks: (B:41:0x0085, B:43:0x008d, B:46:0x0093), top: B:40:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.google.firebase.sessions.settings.h
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(@d5.d kotlin.coroutines.Continuation<? super kotlin.m2> r15) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.c.e(kotlin.coroutines.d):java.lang.Object");
    }

    @m1
    public final void g() {
        l.f(v0.a(this.backgroundDispatcher), null, null, new b(null), 3, null);
    }
}
