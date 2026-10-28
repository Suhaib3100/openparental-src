package com.google.firebase.sessions;

import android.content.Context;
import android.content.preferences.core.d;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.l1;
import kotlin.m2;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.v0;

/* compiled from: SessionDatastore.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0002\t\u000fB\u0017\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/google/firebase/sessions/z;", "Lcom/google/firebase/sessions/y;", "Landroidx/datastore/preferences/core/d;", "preferences", "Lcom/google/firebase/sessions/m;", "i", "", "sessionId", "Lkotlin/m2;", "b", "a", "Landroid/content/Context;", "Landroid/content/Context;", "context", "Lkotlin/coroutines/g;", "c", "Lkotlin/coroutines/g;", "backgroundDispatcher", "Ljava/util/concurrent/atomic/AtomicReference;", "d", "Ljava/util/concurrent/atomic/AtomicReference;", "currentSessionFromDatastore", "Lkotlinx/coroutines/flow/i;", "e", "Lkotlinx/coroutines/flow/i;", "firebaseSessionDataFlow", "<init>", "(Landroid/content/Context;Lkotlin/coroutines/g;)V", "f", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class z implements y {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final Context context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final CoroutineContext backgroundDispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final AtomicReference<m> currentSessionFromDatastore;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @d5.d
    private final kotlinx.coroutines.flow.i<m> firebaseSessionDataFlow;

    /* renamed from: g, reason: collision with root package name */
    @d5.d
    @Deprecated
    private static final String f18904g = ProtectedSandApp.s("⯎");

    /* renamed from: f, reason: collision with root package name */
    @d5.d
    private static final b f18903f = new b(null);

    /* renamed from: h, reason: collision with root package name */
    @d5.d
    @Deprecated
    private static final ReadOnlyProperty<Context, android.content.core.e<android.content.preferences.core.d>> f18905h = android.content.preferences.a.b(x.f18897a.a(), null, null, null, 14, null);

    /* compiled from: SessionDatastore.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.SessionDatastoreImpl$1", f = "SessionDatastore.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    static final class a extends SuspendLambda implements q3.p<u0, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f18910s;

        /* compiled from: SessionDatastore.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/firebase/sessions/m;", "it", "Lkotlin/m2;", "a", "(Lcom/google/firebase/sessions/m;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: com.google.firebase.sessions.z$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0235a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ z f18912o;

            C0235a(z zVar) {
                this.f18912o = zVar;
            }

            @Override // kotlinx.coroutines.flow.j
            @d5.e
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object b(@d5.d m mVar, @d5.d Continuation<? super m2> continuation) {
                this.f18912o.currentSessionFromDatastore.set(mVar);
                return m2.f23662a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f18910s;
            if (i5 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.i iVar = z.this.firebaseSessionDataFlow;
                C0235a c0235a = new C0235a(z.this);
                this.f18910s = 1;
                if (iVar.a(c0235a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("㍫"));
                }
                a1.n(obj);
            }
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
            return z.this.new a(continuation);
        }
    }

    /* compiled from: SessionDatastore.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR%\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/sessions/z$b;", "", "Landroid/content/Context;", "Landroidx/datastore/core/e;", "Landroidx/datastore/preferences/core/d;", "dataStore$delegate", "Lkotlin/properties/e;", "b", "(Landroid/content/Context;)Landroidx/datastore/core/e;", "dataStore", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ KProperty<Object>[] f18913a = {l1.v(new i1(b.class, ProtectedSandApp.s("\u1af4"), ProtectedSandApp.s("\u1af5"), 0))};

        public /* synthetic */ b(kotlin.jvm.internal.w wVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.content.core.e<android.content.preferences.core.d> b(Context context) {
            return (android.content.core.e) z.f18905h.a(context, f18913a[0]);
        }

        private b() {
        }
    }

    /* compiled from: SessionDatastore.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/google/firebase/sessions/z$c;", "", "Landroidx/datastore/preferences/core/d$a;", "", "b", "Landroidx/datastore/preferences/core/d$a;", "a", "()Landroidx/datastore/preferences/core/d$a;", "SESSION_ID", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes2.dex */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        @d5.d
        public static final c f18914a = new c();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private static final d.a<String> SESSION_ID = android.content.preferences.core.f.f(ProtectedSandApp.s("\u1af6"));

        private c() {
        }

        @d5.d
        public final d.a<String> a() {
            return SESSION_ID;
        }
    }

    /* compiled from: SessionDatastore.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", f = "SessionDatastore.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Landroidx/datastore/preferences/core/d;", "", "exception", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    static final class d extends SuspendLambda implements q3.q<kotlinx.coroutines.flow.j<? super android.content.preferences.core.d>, Throwable, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f18916s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f18917t;

        /* renamed from: u, reason: collision with root package name */
        /* synthetic */ Object f18918u;

        d(Continuation<? super d> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f18916s;
            if (i5 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f18917t;
                android.content.preferences.core.d b6 = android.content.preferences.core.e.b();
                this.f18917t = null;
                this.f18916s = 1;
                if (jVar.b(b6, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("㍬"));
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.q
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object G(@d5.d kotlinx.coroutines.flow.j<? super android.content.preferences.core.d> jVar, @d5.d Throwable th, @d5.e Continuation<? super m2> continuation) {
            d dVar = new d(continuation);
            dVar.f18917t = jVar;
            dVar.f18918u = th;
            return dVar.A(m2.f23662a);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/m2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/a0$e"}, k = 1, mv = {1, 7, 1})
    public static final class e implements kotlinx.coroutines.flow.i<m> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f18919o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ z f18920p;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/m2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$e$b"}, k = 3, mv = {1, 7, 1})
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f18921o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ z f18922p;

            /* compiled from: Emitters.kt */
            @DebugMetadata(c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", f = "SessionDatastore.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            /* renamed from: com.google.firebase.sessions.z$e$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0236a extends ContinuationImpl {

                /* renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f18923r;

                /* renamed from: s, reason: collision with root package name */
                int f18924s;

                /* renamed from: t, reason: collision with root package name */
                Object f18925t;

                public C0236a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @d5.e
                public final Object A(@d5.d Object obj) {
                    this.f18923r = obj;
                    this.f18924s |= Integer.MIN_VALUE;
                    return a.this.b(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar, z zVar) {
                this.f18921o = jVar;
                this.f18922p = zVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // kotlinx.coroutines.flow.j
            @d5.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object b(java.lang.Object r5, @d5.d kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.google.firebase.sessions.z.e.a.C0236a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.google.firebase.sessions.z$e$a$a r0 = (com.google.firebase.sessions.z.e.a.C0236a) r0
                    int r1 = r0.f18924s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f18924s = r1
                    goto L18
                L13:
                    com.google.firebase.sessions.z$e$a$a r0 = new com.google.firebase.sessions.z$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f18923r
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r2 = r0.f18924s
                    r3 = 1
                    if (r2 == 0) goto L33
                    if (r2 != r3) goto L27
                    kotlin.a1.n(r6)
                    goto L49
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "⯍"
                    java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
                    r5.<init>(r6)
                    throw r5
                L33:
                    kotlin.a1.n(r6)
                    kotlinx.coroutines.flow.j r6 = r4.f18921o
                    androidx.datastore.preferences.core.d r5 = (android.content.preferences.core.d) r5
                    com.google.firebase.sessions.z r2 = r4.f18922p
                    com.google.firebase.sessions.m r5 = com.google.firebase.sessions.z.h(r2, r5)
                    r0.f18924s = r3
                    java.lang.Object r5 = r6.b(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    kotlin.m2 r5 = kotlin.m2.f23662a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.z.e.a.b(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public e(kotlinx.coroutines.flow.i iVar, z zVar) {
            this.f18919o = iVar;
            this.f18920p = zVar;
        }

        @Override // kotlinx.coroutines.flow.i
        @d5.e
        public Object a(@d5.d kotlinx.coroutines.flow.j<? super m> jVar, @d5.d Continuation continuation) {
            Object a6 = this.f18919o.a(new a(jVar, this.f18920p), continuation);
            return a6 == CoroutineSingletons.COROUTINE_SUSPENDED ? a6 : m2.f23662a;
        }
    }

    /* compiled from: SessionDatastore.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", f = "SessionDatastore.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/u0;", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes4.dex */
    static final class f extends SuspendLambda implements q3.p<u0, Continuation<? super m2>, Object> {

        /* renamed from: s, reason: collision with root package name */
        int f18927s;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ String f18929u;

        /* compiled from: SessionDatastore.kt */
        @DebugMetadata(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", f = "SessionDatastore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/datastore/preferences/core/a;", "preferences", "Lkotlin/m2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        static final class a extends SuspendLambda implements q3.p<android.content.preferences.core.a, Continuation<? super m2>, Object> {

            /* renamed from: s, reason: collision with root package name */
            int f18930s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f18931t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ String f18932u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f18932u = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.e
            public final Object A(@d5.d Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.f18930s != 0) {
                    throw new IllegalStateException(ProtectedSandApp.s("㍭"));
                }
                a1.n(obj);
                ((android.content.preferences.core.a) this.f18931t).o(c.f18914a.a(), this.f18932u);
                return m2.f23662a;
            }

            @Override // q3.p
            @d5.e
            /* renamed from: R, reason: merged with bridge method [inline-methods] */
            public final Object g0(@d5.d android.content.preferences.core.a aVar, @d5.e Continuation<? super m2> continuation) {
                return ((a) c(aVar, continuation)).A(m2.f23662a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @d5.d
            public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
                a aVar = new a(this.f18932u, continuation);
                aVar.f18931t = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f18929u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.e
        public final Object A(@d5.d Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i5 = this.f18927s;
            if (i5 == 0) {
                a1.n(obj);
                android.content.core.e b6 = z.f18903f.b(z.this.context);
                a aVar = new a(this.f18929u, null);
                this.f18927s = 1;
                if (android.content.preferences.core.g.a(b6, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("㍮"));
                }
                a1.n(obj);
            }
            return m2.f23662a;
        }

        @Override // q3.p
        @d5.e
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public final Object g0(@d5.d u0 u0Var, @d5.e Continuation<? super m2> continuation) {
            return ((f) c(u0Var, continuation)).A(m2.f23662a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d5.d
        public final Continuation<m2> c(@d5.e Object obj, @d5.d Continuation<?> continuation) {
            return z.this.new f(this.f18929u, continuation);
        }
    }

    public z(@d5.d Context context, @d5.d CoroutineContext coroutineContext) {
        kotlin.jvm.internal.l0.p(context, ProtectedSandApp.s("⯏"));
        kotlin.jvm.internal.l0.p(coroutineContext, ProtectedSandApp.s("⯐"));
        this.context = context;
        this.backgroundDispatcher = coroutineContext;
        this.currentSessionFromDatastore = new AtomicReference<>();
        this.firebaseSessionDataFlow = new e(new u.a(f18903f.b(context).getData(), new d(null)), this);
        kotlinx.coroutines.l.f(v0.a(coroutineContext), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m i(android.content.preferences.core.d preferences) {
        return new m((String) preferences.c(c.f18914a.a()));
    }

    @Override // com.google.firebase.sessions.y
    @d5.e
    public String a() {
        m mVar = this.currentSessionFromDatastore.get();
        if (mVar != null) {
            return mVar.d();
        }
        return null;
    }

    @Override // com.google.firebase.sessions.y
    public void b(@d5.d String str) {
        kotlin.jvm.internal.l0.p(str, ProtectedSandApp.s("⯑"));
        kotlinx.coroutines.l.f(v0.a(this.backgroundDispatcher), null, null, new f(str, null), 3, null);
    }
}
