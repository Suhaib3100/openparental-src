package com.google.firebase.sessions;

import android.content.Context;
import androidx.content.core.CorruptionException;
import androidx.content.preferences.core.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.jvm.internal.i1;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;

/* compiled from: SessionDatastore.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0002\u0015\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/google/firebase/sessions/a0;", "Lcom/google/firebase/sessions/z;", "Landroid/content/Context;", "context", "Lkotlin/coroutines/g;", "backgroundDispatcher", "<init>", "(Landroid/content/Context;Lkotlin/coroutines/g;)V", "Landroidx/datastore/preferences/core/d;", "preferences", "Lcom/google/firebase/sessions/m;", "i", "(Landroidx/datastore/preferences/core/d;)Lcom/google/firebase/sessions/m;", "", "sessionId", "Lkotlin/k2;", "b", "(Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "Landroid/content/Context;", "c", "Lkotlin/coroutines/g;", "Ljava/util/concurrent/atomic/AtomicReference;", "d", "Ljava/util/concurrent/atomic/AtomicReference;", "currentSessionFromDatastore", "Lkotlinx/coroutines/flow/i;", "e", "Lkotlinx/coroutines/flow/i;", "firebaseSessionDataFlow", "f", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSessionDatastore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionDatastore.kt\ncom/google/firebase/sessions/SessionDatastoreImpl\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,122:1\n47#2:123\n49#2:127\n50#3:124\n55#3:126\n106#4:125\n*S KotlinDebug\n*F\n+ 1 SessionDatastore.kt\ncom/google/firebase/sessions/SessionDatastoreImpl\n*L\n78#1:123\n78#1:127\n78#1:124\n78#1:126\n78#1:125\n*E\n"})
/* loaded from: classes6.dex */
public final class a0 implements z {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Context context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.coroutines.g backgroundDispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final AtomicReference<m> currentSessionFromDatastore;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlinx.coroutines.flow.i<m> firebaseSessionDataFlow;

    /* renamed from: g, reason: collision with root package name */
    @fg.l
    private static final String f60758g = ProtectedSandApp.s("џ\u0001");

    /* renamed from: f, reason: collision with root package name */
    @fg.l
    private static final c f60757f = new c(null);

    /* renamed from: h, reason: collision with root package name */
    @fg.l
    private static final kotlin.properties.e<Context, androidx.content.core.e<androidx.content.preferences.core.d>> f60759h = androidx.content.preferences.a.b(y.f61031a.a(), new o1.b(b.f60767b), null, null, 12, null);

    /* compiled from: SessionDatastore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$1", f = "SessionDatastore.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f60764b;

        /* compiled from: SessionDatastore.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/firebase/sessions/m;", "it", "Lkotlin/k2;", "a", "(Lcom/google/firebase/sessions/m;Lkotlin/coroutines/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.google.firebase.sessions.a0$a$a, reason: collision with other inner class name */
        static final class C0935a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f60766b;

            C0935a(a0 a0Var) {
                this.f60766b = a0Var;
            }

            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(@fg.l m mVar, @fg.l kotlin.coroutines.d<? super k2> dVar) {
                this.f60766b.currentSessionFromDatastore.set(mVar);
                return k2.f75408a;
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return a0.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f60764b;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.i iVar = a0.this.firebaseSessionDataFlow;
                C0935a c0935a = new C0935a(a0.this);
                this.f60764b = 1;
                if (iVar.a(c0935a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("і\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: SessionDatastore.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/datastore/core/CorruptionException;", "ex", "Landroidx/datastore/preferences/core/d;", "a", "(Landroidx/datastore/core/CorruptionException;)Landroidx/datastore/preferences/core/d;"}, k = 3, mv = {1, 8, 0})
    static final class b extends kotlin.jvm.internal.n0 implements ld.l<CorruptionException, androidx.content.preferences.core.d> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f60767b = new b(1);

        b() {
            super(1);
        }

        @Override // ld.l
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.content.preferences.core.d invoke(@fg.l CorruptionException corruptionException) {
            kotlin.jvm.internal.l0.p(corruptionException, ProtectedSandApp.s("ї\u0001"));
            w.f61030a.e();
            return androidx.content.preferences.core.e.b();
        }
    }

    /* compiled from: SessionDatastore.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/sessions/a0$c;", "", "<init>", "()V", "Landroid/content/Context;", "Landroidx/datastore/core/e;", "Landroidx/datastore/preferences/core/d;", "dataStore$delegate", "Lkotlin/properties/e;", "b", "(Landroid/content/Context;)Landroidx/datastore/core/e;", "dataStore", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ kotlin.reflect.o<Object>[] f60768a = {l1.v(new i1(c.class, ProtectedSandApp.s("ј\u0001"), ProtectedSandApp.s("љ\u0001"), 0))};

        public /* synthetic */ c(kotlin.jvm.internal.w wVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final androidx.content.core.e<androidx.content.preferences.core.d> b(Context context) {
            return (androidx.content.core.e) a0.f60759h.a(context, f60768a[0]);
        }

        private c() {
        }
    }

    /* compiled from: SessionDatastore.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/google/firebase/sessions/a0$d;", "", "<init>", "()V", "Landroidx/datastore/preferences/core/d$a;", "", "b", "Landroidx/datastore/preferences/core/d$a;", "a", "()Landroidx/datastore/preferences/core/d$a;", "SESSION_ID", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final d f60769a = new d();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private static final d.a<String> SESSION_ID = androidx.content.preferences.core.f.f(ProtectedSandApp.s("њ\u0001"));

        private d() {
        }

        @fg.l
        public final d.a<String> a() {
            return SESSION_ID;
        }
    }

    /* compiled from: SessionDatastore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", f = "SessionDatastore.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Landroidx/datastore/preferences/core/d;", "", "exception", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.coroutines.jvm.internal.o implements ld.q<kotlinx.coroutines.flow.j<? super androidx.content.preferences.core.d>, Throwable, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f60771b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f60772c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f60773d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(3, dVar);
        }

        @Override // ld.q
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object R(@fg.l kotlinx.coroutines.flow.j<? super androidx.content.preferences.core.d> jVar, @fg.l Throwable th, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            e eVar = new e(3, dVar);
            eVar.f60772c = jVar;
            eVar.f60773d = th;
            return eVar.invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f60771b;
            if (i4 == 0) {
                a1.n(obj);
                kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) this.f60772c;
                androidx.content.preferences.core.d b5 = androidx.content.preferences.core.e.b();
                this.f60772c = null;
                this.f60771b = 1;
                if (jVar.emit(b5, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("ћ\u0001"));
                }
                a1.n(obj);
            }
            return k2.f75408a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/j;", "collector", "Lkotlin/k2;", "a", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$f", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
    public static final class f implements kotlinx.coroutines.flow.i<m> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.i f60774b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a0 f60775c;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/k2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx/coroutines/flow/a0$f$b", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SessionDatastore.kt\ncom/google/firebase/sessions/SessionDatastoreImpl\n*L\n1#1,222:1\n48#2:223\n78#3:224\n*E\n"})
        public static final class a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.j f60776b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a0 f60777c;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", f = "SessionDatastore.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @r1({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
            /* renamed from: com.google.firebase.sessions.a0$f$a$a, reason: collision with other inner class name */
            public static final class C0936a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: b, reason: collision with root package name */
                /* synthetic */ Object f60778b;

                /* renamed from: c, reason: collision with root package name */
                int f60779c;

                /* renamed from: d, reason: collision with root package name */
                Object f60780d;

                public C0936a(kotlin.coroutines.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @fg.m
                public final Object invokeSuspend(@fg.l Object obj) {
                    this.f60778b = obj;
                    this.f60779c |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(kotlinx.coroutines.flow.j jVar, a0 a0Var) {
                this.f60776b = jVar;
                this.f60777c = a0Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
            @Override // kotlinx.coroutines.flow.j
            @fg.m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @fg.l kotlin.coroutines.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.google.firebase.sessions.a0.f.a.C0936a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.google.firebase.sessions.a0$f$a$a r0 = (com.google.firebase.sessions.a0.f.a.C0936a) r0
                    int r1 = r0.f60779c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f60779c = r1
                    goto L18
                L13:
                    com.google.firebase.sessions.a0$f$a$a r0 = new com.google.firebase.sessions.a0$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f60778b
                    kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
                    int r2 = r0.f60779c
                    r3 = 1
                    if (r2 == 0) goto L33
                    if (r2 != r3) goto L27
                    kotlin.a1.n(r6)
                    goto L49
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "ќ\u0001"
                    java.lang.String r6 = com.flashget.parentalcontrol.ProtectedSandApp.s(r6)
                    r5.<init>(r6)
                    throw r5
                L33:
                    kotlin.a1.n(r6)
                    kotlinx.coroutines.flow.j r6 = r4.f60776b
                    androidx.datastore.preferences.core.d r5 = (androidx.content.preferences.core.d) r5
                    com.google.firebase.sessions.a0 r2 = r4.f60777c
                    com.google.firebase.sessions.m r5 = com.google.firebase.sessions.a0.h(r2, r5)
                    r0.f60779c = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    kotlin.k2 r5 = kotlin.k2.f75408a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.a0.f.a.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
            }
        }

        public f(kotlinx.coroutines.flow.i iVar, a0 a0Var) {
            this.f60774b = iVar;
            this.f60775c = a0Var;
        }

        @Override // kotlinx.coroutines.flow.i
        @fg.m
        public Object a(@fg.l kotlinx.coroutines.flow.j<? super m> jVar, @fg.l kotlin.coroutines.d dVar) {
            Object a5 = this.f60774b.a(new a(jVar, this.f60775c), dVar);
            return a5 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? a5 : k2.f75408a;
        }
    }

    /* compiled from: SessionDatastore.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", f = "SessionDatastore.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.coroutines.jvm.internal.o implements ld.p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f60782b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f60784d;

        /* compiled from: SessionDatastore.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", f = "SessionDatastore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/datastore/preferences/core/a;", "preferences", "Lkotlin/k2;", "<anonymous>", "(Landroidx/datastore/preferences/core/a;)V"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.coroutines.jvm.internal.o implements ld.p<androidx.content.preferences.core.a, kotlin.coroutines.d<? super k2>, Object> {

            /* renamed from: b, reason: collision with root package name */
            int f60785b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ Object f60786c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f60787d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f60787d = str;
            }

            @Override // ld.p
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l androidx.content.preferences.core.a aVar, @fg.m kotlin.coroutines.d<? super k2> dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(k2.f75408a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.l
            public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f60787d, dVar);
                aVar.f60786c = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @fg.m
            public final Object invokeSuspend(@fg.l Object obj) {
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
                if (this.f60785b != 0) {
                    throw new IllegalStateException(ProtectedSandApp.s("ѝ\u0001"));
                }
                a1.n(obj);
                ((androidx.content.preferences.core.a) this.f60786c).o(d.f60769a.a(), this.f60787d);
                return k2.f75408a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
            this.f60784d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.l
        public final kotlin.coroutines.d<k2> create(@fg.m Object obj, @fg.l kotlin.coroutines.d<?> dVar) {
            return a0.this.new g(this.f60784d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f60782b;
            try {
                if (i4 == 0) {
                    a1.n(obj);
                    androidx.content.core.e b5 = a0.f60757f.b(a0.this.context);
                    a aVar2 = new a(this.f60784d, null);
                    this.f60782b = 1;
                    if (androidx.content.preferences.core.g.a(b5, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException(ProtectedSandApp.s("ў\u0001"));
                    }
                    a1.n(obj);
                }
            } catch (IOException e4) {
                e4.toString();
            }
            return k2.f75408a;
        }

        @Override // ld.p
        @fg.m
        public final Object invoke(@fg.l r0 r0Var, @fg.m kotlin.coroutines.d<? super k2> dVar) {
            return ((g) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    public a0(@fg.l Context context, @fg.l kotlin.coroutines.g gVar) {
        kotlin.jvm.internal.l0.p(context, ProtectedSandApp.s("Ѡ\u0001"));
        kotlin.jvm.internal.l0.p(gVar, ProtectedSandApp.s("ѡ\u0001"));
        this.context = context;
        this.backgroundDispatcher = gVar;
        this.currentSessionFromDatastore = new AtomicReference<>();
        this.firebaseSessionDataFlow = new f(new u.a(f60757f.b(context).b(), new e(3, null)), this);
        kotlinx.coroutines.k.f(s0.a(gVar), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m i(androidx.content.preferences.core.d preferences) {
        return new m((String) preferences.c(d.f60769a.a()));
    }

    @Override // com.google.firebase.sessions.z
    @fg.m
    public String a() {
        m mVar = this.currentSessionFromDatastore.get();
        if (mVar != null) {
            return mVar.d();
        }
        return null;
    }

    @Override // com.google.firebase.sessions.z
    public void b(@fg.l String sessionId) {
        kotlin.jvm.internal.l0.p(sessionId, ProtectedSandApp.s("Ѣ\u0001"));
        kotlinx.coroutines.k.f(s0.a(this.backgroundDispatcher), null, null, new g(sessionId, null), 3, null);
    }
}
