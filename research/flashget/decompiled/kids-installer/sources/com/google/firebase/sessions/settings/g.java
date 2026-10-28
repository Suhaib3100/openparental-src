package com.google.firebase.sessions.settings;

import android.content.preferences.core.d;
import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.m2;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.u0;
import q3.p;

/* compiled from: SettingsCache.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 22\u00020\u0001:\u0001-B\u0015\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020(¢\u0006\u0004\b0\u00101J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J1\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001fJ\u001d\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"H\u0086@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020\u0004H\u0081@ø\u0001\u0000¢\u0006\u0004\b&\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lcom/google/firebase/sessions/settings/g;", "", "Landroidx/datastore/preferences/core/d;", "preferences", "Lkotlin/m2;", "r", "T", "Landroidx/datastore/preferences/core/d$a;", "key", "value", "n", "(Landroidx/datastore/preferences/core/d$a;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "i", "()Z", "m", "()Ljava/lang/Boolean;", "", "l", "()Ljava/lang/Double;", "", "k", "()Ljava/lang/Integer;", "enabled", "t", "(Ljava/lang/Boolean;Lkotlin/coroutines/d;)Ljava/lang/Object;", "rate", "o", "(Ljava/lang/Double;Lkotlin/coroutines/d;)Ljava/lang/Object;", "timeoutInSeconds", "s", "(Ljava/lang/Integer;Lkotlin/coroutines/d;)Ljava/lang/Object;", "cacheDurationInSeconds", "p", "", "cacheUpdatedTime", "q", "(Ljava/lang/Long;Lkotlin/coroutines/d;)Ljava/lang/Object;", "j", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/datastore/core/e;", "a", "Landroidx/datastore/core/e;", "dataStore", "Lcom/google/firebase/sessions/settings/e;", "b", "Lcom/google/firebase/sessions/settings/e;", "sessionConfigs", "<init>", "(Landroidx/datastore/core/e;)V", "c", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final android.content.core.e<android.content.preferences.core.d> dataStore;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private com.google.firebase.sessions.settings.e sessionConfigs;

    /* renamed from: d, reason: collision with root package name */
    @d5.d
    @Deprecated
    public static final String f18717d = ProtectedSandApp.s("\u1ad9");

    /* renamed from: c, reason: collision with root package name */
    @d5.d
    private static final b f18716c = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @d5.d
    @Deprecated
    private static final d.a<Boolean> f18718e = android.content.preferences.core.f.a(ProtectedSandApp.s("\u1ada"));

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    @Deprecated
    private static final d.a<Double> f18719f = android.content.preferences.core.f.b(ProtectedSandApp.s("\u1adb"));

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    @Deprecated
    private static final d.a<Integer> f18720g = android.content.preferences.core.f.d(ProtectedSandApp.s("\u1adc"));

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    @Deprecated
    private static final d.a<Integer> f18721h = android.content.preferences.core.f.d(ProtectedSandApp.s("\u1add"));

    /* renamed from: i, reason: collision with root package name */
    @d5.d
    @Deprecated
    private static final d.a<Long> f18722i = android.content.preferences.core.f.e(ProtectedSandApp.s("\u1ade"));

    /* compiled from: SettingsCache.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCache$1", f = "SettingsCache.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    static final class a extends SuspendLambda implements p<u0, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        Object f18725s;

        /* renamed from: t, reason: collision with root package name */
        int f18726t;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            g gVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f18726t;
            if (i5 == 0) {
                a1.n(obj);
                g gVar2 = g.this;
                i data = gVar2.dataStore.getData();
                this.f18725s = gVar2;
                this.f18726t = 1;
                Object t02 = k.t0(data, this);
                if (t02 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                gVar = gVar2;
                obj = t02;
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("㍨"));
                }
                gVar = (g) this.f18725s;
                a1.n(obj);
            }
            gVar.r(((android.content.preferences.core.d) obj).e());
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d u0 u0Var, @d5.e Continuation<? super m2> continuation) {
            return ((a) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            return g.this.new a(continuation);
        }
    }

    /* compiled from: SettingsCache.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u000f\u0010\u0007R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/google/firebase/sessions/settings/g$b;", "", "Landroidx/datastore/preferences/core/d$a;", "", "SESSIONS_ENABLED", "Landroidx/datastore/preferences/core/d$a;", "e", "()Landroidx/datastore/preferences/core/d$a;", "", "SAMPLING_RATE", "d", "", "RESTART_TIMEOUT_SECONDS", "c", "CACHE_DURATION_SECONDS", "a", "", "CACHE_UPDATED_TIME", "b", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    private static final class b {
        private b() {
        }

        @d5.d
        public final d.a<Integer> a() {
            return g.f18721h;
        }

        @d5.d
        public final d.a<Long> b() {
            return g.f18722i;
        }

        @d5.d
        public final d.a<Integer> c() {
            return g.f18720g;
        }

        @d5.d
        public final d.a<Double> d() {
            return g.f18719f;
        }

        @d5.d
        public final d.a<Boolean> e() {
            return g.f18718e;
        }

        public b(w wVar) {
        }
    }

    /* compiled from: SettingsCache.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2", f = "SettingsCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/datastore/preferences/core/a;", "preferences", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    static final class c extends SuspendLambda implements p<android.content.preferences.core.a, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f18728s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f18729t;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f18728s != 0) {
                throw new IllegalStateException(ProtectedSandApp.s("㍩"));
            }
            a1.n(obj);
            android.content.preferences.core.a aVar = (android.content.preferences.core.a) this.f18729t;
            aVar.g();
            g.this.r(aVar);
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d android.content.preferences.core.a aVar, @d5.e Continuation<? super m2> continuation) {
            return ((c) c(aVar, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            c cVar = g.this.new c(continuation);
            cVar.f18729t = obj;
            return cVar;
        }
    }

    /* compiled from: SettingsCache.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", i = {}, l = {112}, m = "updateConfigValue", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    static final class d<T> extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f18731r;

        /* renamed from: t, reason: collision with root package name */
        int f18733t;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            this.f18731r = obj;
            this.f18733t |= Integer.MIN_VALUE;
            return g.this.n(null, null, this);
        }
    }

    /* compiled from: SettingsCache.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "Landroidx/datastore/preferences/core/a;", "preferences", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    static final class e extends SuspendLambda implements p<android.content.preferences.core.a, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f18734s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f18735t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ T f18736u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ d.a<T> f18737v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ g f18738w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(T t5, d.a<T> aVar, g gVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f18736u = t5;
            this.f18737v = aVar;
            this.f18738w = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f18734s != 0) {
                throw new IllegalStateException(ProtectedSandApp.s("㍪"));
            }
            a1.n(obj);
            android.content.preferences.core.a aVar = (android.content.preferences.core.a) this.f18735t;
            T t5 = this.f18736u;
            if (t5 != 0) {
                aVar.o(this.f18737v, t5);
            } else {
                aVar.n(this.f18737v);
            }
            this.f18738w.r(aVar);
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d android.content.preferences.core.a aVar, @d5.e Continuation<? super m2> continuation) {
            return ((e) c(aVar, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            e eVar = new e(this.f18736u, this.f18737v, this.f18738w, continuation);
            eVar.f18735t = obj;
            return eVar;
        }
    }

    public g(@d5.d android.content.core.e<android.content.preferences.core.d> eVar) {
        l0.p(eVar, ProtectedSandApp.s("\u1adf"));
        this.dataStore = eVar;
        kotlinx.coroutines.k.b(null, new a(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        r6.toString();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object n(androidx.datastore.preferences.core.d.a<T> r6, T r7, kotlin.coroutines.Continuation<? super kotlin.m2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.firebase.sessions.settings.g.d
            if (r0 == 0) goto L13
            r0 = r8
            com.google.firebase.sessions.settings.g$d r0 = (com.google.firebase.sessions.settings.g.d) r0
            int r1 = r0.f18733t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18733t = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.g$d r0 = new com.google.firebase.sessions.settings.g$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f18731r
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f18733t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L29
            kotlin.a1.n(r8)     // Catch: java.io.IOException -> L27
            goto L4c
        L27:
            r6 = move-exception
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "\u1ae0"
            java.lang.String r7 = com.flashget.kidsdownloader.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.a1.n(r8)
            androidx.datastore.core.e<androidx.datastore.preferences.core.d> r8 = r5.dataStore     // Catch: java.io.IOException -> L27
            com.google.firebase.sessions.settings.g$e r2 = new com.google.firebase.sessions.settings.g$e     // Catch: java.io.IOException -> L27
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L27
            r0.f18733t = r3     // Catch: java.io.IOException -> L27
            java.lang.Object r6 = android.content.preferences.core.g.a(r8, r2, r0)     // Catch: java.io.IOException -> L27
            if (r6 != r1) goto L4c
            return r1
        L49:
            r6.toString()
        L4c:
            kotlin.m2 r6 = kotlin.m2.f23662a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.g.n(androidx.datastore.preferences.core.d$a, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(android.content.preferences.core.d dVar) {
        this.sessionConfigs = new com.google.firebase.sessions.settings.e((Boolean) dVar.c(f18718e), (Double) dVar.c(f18719f), (Integer) dVar.c(f18720g), (Integer) dVar.c(f18721h), (Long) dVar.c(f18722i));
    }

    public final boolean i() {
        com.google.firebase.sessions.settings.e eVar = this.sessionConfigs;
        com.google.firebase.sessions.settings.e eVar2 = null;
        String s5 = ProtectedSandApp.s("\u1ae1");
        if (eVar == null) {
            l0.S(s5);
            eVar = null;
        }
        Long i5 = eVar.i();
        com.google.firebase.sessions.settings.e eVar3 = this.sessionConfigs;
        if (eVar3 == null) {
            l0.S(s5);
        } else {
            eVar2 = eVar3;
        }
        Integer h5 = eVar2.h();
        return i5 == null || h5 == null || (System.currentTimeMillis() - i5.longValue()) / ((long) 1000) >= ((long) h5.intValue());
    }

    @d5.e
    @m1
    public final Object j(@d5.d Continuation<? super m2> continuation) {
        Object a6 = android.content.preferences.core.g.a(this.dataStore, new c(null), continuation);
        return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
    }

    @d5.e
    public final Integer k() {
        com.google.firebase.sessions.settings.e eVar = this.sessionConfigs;
        if (eVar == null) {
            l0.S(ProtectedSandApp.s("\u1ae2"));
            eVar = null;
        }
        return eVar.k();
    }

    @d5.e
    public final Double l() {
        com.google.firebase.sessions.settings.e eVar = this.sessionConfigs;
        if (eVar == null) {
            l0.S(ProtectedSandApp.s("\u1ae3"));
            eVar = null;
        }
        return eVar.l();
    }

    @d5.e
    public final Boolean m() {
        com.google.firebase.sessions.settings.e eVar = this.sessionConfigs;
        if (eVar == null) {
            l0.S(ProtectedSandApp.s("\u1ae4"));
            eVar = null;
        }
        return eVar.j();
    }

    @d5.e
    public final Object o(@d5.e Double d6, @d5.d Continuation<? super m2> continuation) {
        Object n5 = n(f18719f, d6, continuation);
        return n5 == CoroutineSingletons.COROUTINE_SUSPENDED ? n5 : m2.f23662a;
    }

    @d5.e
    public final Object p(@d5.e Integer num, @d5.d Continuation<? super m2> continuation) {
        Object n5 = n(f18721h, num, continuation);
        return n5 == CoroutineSingletons.COROUTINE_SUSPENDED ? n5 : m2.f23662a;
    }

    @d5.e
    public final Object q(@d5.e Long l5, @d5.d Continuation<? super m2> continuation) {
        Object n5 = n(f18722i, l5, continuation);
        return n5 == CoroutineSingletons.COROUTINE_SUSPENDED ? n5 : m2.f23662a;
    }

    @d5.e
    public final Object s(@d5.e Integer num, @d5.d Continuation<? super m2> continuation) {
        Object n5 = n(f18720g, num, continuation);
        return n5 == CoroutineSingletons.COROUTINE_SUSPENDED ? n5 : m2.f23662a;
    }

    @d5.e
    public final Object t(@d5.e Boolean bool, @d5.d Continuation<? super m2> continuation) {
        Object n5 = n(f18718e, bool, continuation);
        return n5 == CoroutineSingletons.COROUTINE_SUSPENDED ? n5 : m2.f23662a;
    }
}
