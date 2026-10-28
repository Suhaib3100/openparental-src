package com.google.firebase.sessions.settings;

import androidx.content.preferences.core.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.j;
import kotlinx.coroutines.r0;
import ld.p;

/* compiled from: SettingsCache.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 32\u00020\u0001:\u00010B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000f\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0019H\u0086@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u001d\u0010&\u001a\u00020\b2\b\u0010%\u001a\u0004\u0018\u00010\u0019H\u0086@ø\u0001\u0000¢\u0006\u0004\b&\u0010$J\u001d\u0010)\u001a\u00020\b2\b\u0010(\u001a\u0004\u0018\u00010'H\u0086@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0013\u0010+\u001a\u00020\bH\u0081@ø\u0001\u0000¢\u0006\u0004\b+\u0010,R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Lcom/google/firebase/sessions/settings/g;", "", "Landroidx/datastore/core/e;", "Landroidx/datastore/preferences/core/d;", "dataStore", "<init>", "(Landroidx/datastore/core/e;)V", "preferences", "Lkotlin/k2;", "r", "(Landroidx/datastore/preferences/core/d;)V", "T", "Landroidx/datastore/preferences/core/d$a;", "key", "value", "n", "(Landroidx/datastore/preferences/core/d$a;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "i", "()Z", "m", "()Ljava/lang/Boolean;", "", "l", "()Ljava/lang/Double;", "", "k", "()Ljava/lang/Integer;", "enabled", "t", "(Ljava/lang/Boolean;Lkotlin/coroutines/d;)Ljava/lang/Object;", "rate", "o", "(Ljava/lang/Double;Lkotlin/coroutines/d;)Ljava/lang/Object;", "timeoutInSeconds", "s", "(Ljava/lang/Integer;Lkotlin/coroutines/d;)Ljava/lang/Object;", "cacheDurationInSeconds", "p", "", "cacheUpdatedTime", "q", "(Ljava/lang/Long;Lkotlin/coroutines/d;)Ljava/lang/Object;", "j", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "Landroidx/datastore/core/e;", "Lcom/google/firebase/sessions/settings/e;", "b", "Lcom/google/firebase/sessions/settings/e;", "sessionConfigs", "c", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final androidx.content.core.e<androidx.content.preferences.core.d> dataStore;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private com.google.firebase.sessions.settings.e sessionConfigs;

    /* renamed from: d, reason: collision with root package name */
    @l
    @Deprecated
    public static final String f60993d = ProtectedSandApp.s("՛\u0001");

    /* renamed from: c, reason: collision with root package name */
    @l
    private static final b f60992c = new b();

    /* renamed from: e, reason: collision with root package name */
    @l
    private static final d.a<Boolean> f60994e = androidx.content.preferences.core.f.a(ProtectedSandApp.s("՜\u0001"));

    /* renamed from: f, reason: collision with root package name */
    @l
    private static final d.a<Double> f60995f = androidx.content.preferences.core.f.b(ProtectedSandApp.s("՝\u0001"));

    /* renamed from: g, reason: collision with root package name */
    @l
    private static final d.a<Integer> f60996g = androidx.content.preferences.core.f.d(ProtectedSandApp.s("՞\u0001"));

    /* renamed from: h, reason: collision with root package name */
    @l
    private static final d.a<Integer> f60997h = androidx.content.preferences.core.f.d(ProtectedSandApp.s("՟\u0001"));

    /* renamed from: i, reason: collision with root package name */
    @l
    private static final d.a<Long> f60998i = androidx.content.preferences.core.f.e(ProtectedSandApp.s("ՠ\u0001"));

    /* compiled from: SettingsCache.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCache$1", f = "SettingsCache.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/r0;", "Lkotlin/k2;", "<anonymous>", "(Lkotlinx/coroutines/r0;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends o implements p<r0, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f61001b;

        /* renamed from: c, reason: collision with root package name */
        int f61002c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            return g.this.new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            g gVar;
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            int i4 = this.f61002c;
            if (i4 == 0) {
                a1.n(obj);
                g gVar2 = g.this;
                i b5 = gVar2.dataStore.b();
                this.f61001b = gVar2;
                this.f61002c = 1;
                Object u02 = k.u0(b5, this);
                if (u02 == aVar) {
                    return aVar;
                }
                gVar = gVar2;
                obj = u02;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException(ProtectedSandApp.s("\u0558\u0001"));
                }
                gVar = (g) this.f61001b;
                a1.n(obj);
            }
            gVar.r(((androidx.content.preferences.core.d) obj).e());
            return k2.f75408a;
        }

        @Override // ld.p
        @m
        public final Object invoke(@l r0 r0Var, @m kotlin.coroutines.d<? super k2> dVar) {
            return ((a) create(r0Var, dVar)).invokeSuspend(k2.f75408a);
        }
    }

    /* compiled from: SettingsCache.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0007\u001a\u0004\b\u0014\u0010\tR\u0014\u0010\u0016\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/google/firebase/sessions/settings/g$b;", "", "<init>", "()V", "Landroidx/datastore/preferences/core/d$a;", "", "SESSIONS_ENABLED", "Landroidx/datastore/preferences/core/d$a;", "e", "()Landroidx/datastore/preferences/core/d$a;", "", "SAMPLING_RATE", "d", "", "RESTART_TIMEOUT_SECONDS", "c", "CACHE_DURATION_SECONDS", "a", "", "CACHE_UPDATED_TIME", "b", "", "TAG", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {
        private b() {
        }

        @l
        public final d.a<Integer> a() {
            return g.f60997h;
        }

        @l
        public final d.a<Long> b() {
            return g.f60998i;
        }

        @l
        public final d.a<Integer> c() {
            return g.f60996g;
        }

        @l
        public final d.a<Double> d() {
            return g.f60995f;
        }

        @l
        public final d.a<Boolean> e() {
            return g.f60994e;
        }

        public b(w wVar) {
        }
    }

    /* compiled from: SettingsCache.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", i = {}, l = {103}, m = "removeConfigs$com_google_firebase_firebase_sessions", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f61004b;

        /* renamed from: d, reason: collision with root package name */
        int f61006d;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.f61004b = obj;
            this.f61006d |= Integer.MIN_VALUE;
            return g.this.j(this);
        }
    }

    /* compiled from: SettingsCache.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2", f = "SettingsCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/datastore/preferences/core/a;", "preferences", "Lkotlin/k2;", "<anonymous>", "(Landroidx/datastore/preferences/core/a;)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends o implements p<androidx.content.preferences.core.a, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f61007b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f61008c;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // ld.p
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@l androidx.content.preferences.core.a aVar, @m kotlin.coroutines.d<? super k2> dVar) {
            return ((d) create(aVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            d dVar2 = g.this.new d(dVar);
            dVar2.f61008c = obj;
            return dVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f61007b != 0) {
                throw new IllegalStateException(ProtectedSandApp.s("ՙ\u0001"));
            }
            a1.n(obj);
            androidx.content.preferences.core.a aVar2 = (androidx.content.preferences.core.a) this.f61008c;
            aVar2.g();
            g.this.r(aVar2);
            return k2.f75408a;
        }
    }

    /* compiled from: SettingsCache.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", i = {}, l = {119}, m = "updateConfigValue", n = {}, s = {})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class e<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f61010b;

        /* renamed from: d, reason: collision with root package name */
        int f61012d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.f61010b = obj;
            this.f61012d |= Integer.MIN_VALUE;
            return g.this.n(null, null, this);
        }
    }

    /* compiled from: SettingsCache.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/datastore/preferences/core/a;", "preferences", "Lkotlin/k2;", "<anonymous>", "(Landroidx/datastore/preferences/core/a;)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends o implements p<androidx.content.preferences.core.a, kotlin.coroutines.d<? super k2>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f61013b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f61014c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f61015d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d.a<T> f61016e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f61017f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(T t4, d.a<T> aVar, g gVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f61015d = t4;
            this.f61016e = aVar;
            this.f61017f = gVar;
        }

        @Override // ld.p
        @m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@l androidx.content.preferences.core.a aVar, @m kotlin.coroutines.d<? super k2> dVar) {
            return ((f) create(aVar, dVar)).invokeSuspend(k2.f75408a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @l
        public final kotlin.coroutines.d<k2> create(@m Object obj, @l kotlin.coroutines.d<?> dVar) {
            f fVar = new f(this.f61015d, this.f61016e, this.f61017f, dVar);
            fVar.f61014c = obj;
            return fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED;
            if (this.f61013b != 0) {
                throw new IllegalStateException(ProtectedSandApp.s("՚\u0001"));
            }
            a1.n(obj);
            androidx.content.preferences.core.a aVar2 = (androidx.content.preferences.core.a) this.f61014c;
            T t4 = this.f61015d;
            if (t4 != 0) {
                aVar2.o(this.f61016e, t4);
            } else {
                aVar2.n(this.f61016e);
            }
            this.f61017f.r(aVar2);
            return k2.f75408a;
        }
    }

    public g(@l androidx.content.core.e<androidx.content.preferences.core.d> eVar) {
        l0.p(eVar, ProtectedSandApp.s("ա\u0001"));
        this.dataStore = eVar;
        j.b(null, new a(null), 1, null);
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
    public final <T> java.lang.Object n(androidx.datastore.preferences.core.d.a<T> r6, T r7, kotlin.coroutines.d<? super kotlin.k2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.firebase.sessions.settings.g.e
            if (r0 == 0) goto L13
            r0 = r8
            com.google.firebase.sessions.settings.g$e r0 = (com.google.firebase.sessions.settings.g.e) r0
            int r1 = r0.f61012d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61012d = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.g$e r0 = new com.google.firebase.sessions.settings.g$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f61010b
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f61012d
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
            java.lang.String r7 = "բ\u0001"
            java.lang.String r7 = com.flashget.parentalcontrol.ProtectedSandApp.s(r7)
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.a1.n(r8)
            androidx.datastore.core.e<androidx.datastore.preferences.core.d> r8 = r5.dataStore     // Catch: java.io.IOException -> L27
            com.google.firebase.sessions.settings.g$f r2 = new com.google.firebase.sessions.settings.g$f     // Catch: java.io.IOException -> L27
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L27
            r0.f61012d = r3     // Catch: java.io.IOException -> L27
            java.lang.Object r6 = androidx.content.preferences.core.g.a(r8, r2, r0)     // Catch: java.io.IOException -> L27
            if (r6 != r1) goto L4c
            return r1
        L49:
            r6.toString()
        L4c:
            kotlin.k2 r6 = kotlin.k2.f75408a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.g.n(androidx.datastore.preferences.core.d$a, java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(androidx.content.preferences.core.d preferences) {
        this.sessionConfigs = new com.google.firebase.sessions.settings.e((Boolean) preferences.c(f60994e), (Double) preferences.c(f60995f), (Integer) preferences.c(f60996g), (Integer) preferences.c(f60997h), (Long) preferences.c(f60998i));
    }

    public final boolean i() {
        com.google.firebase.sessions.settings.e eVar = this.sessionConfigs;
        com.google.firebase.sessions.settings.e eVar2 = null;
        String s4 = ProtectedSandApp.s("գ\u0001");
        if (eVar == null) {
            l0.S(s4);
            eVar = null;
        }
        Long i4 = eVar.i();
        com.google.firebase.sessions.settings.e eVar3 = this.sessionConfigs;
        if (eVar3 == null) {
            l0.S(s4);
        } else {
            eVar2 = eVar3;
        }
        Integer h4 = eVar2.h();
        return i4 == null || h4 == null || (System.currentTimeMillis() - i4.longValue()) / ((long) 1000) >= ((long) h4.intValue());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        r6.toString();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @fg.m
    @androidx.annotation.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(@fg.l kotlin.coroutines.d<? super kotlin.k2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.firebase.sessions.settings.g.c
            if (r0 == 0) goto L13
            r0 = r6
            com.google.firebase.sessions.settings.g$c r0 = (com.google.firebase.sessions.settings.g.c) r0
            int r1 = r0.f61006d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61006d = r1
            goto L18
        L13:
            com.google.firebase.sessions.settings.g$c r0 = new com.google.firebase.sessions.settings.g$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f61004b
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f61006d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L29
            kotlin.a1.n(r6)     // Catch: java.io.IOException -> L27
            goto L4c
        L27:
            r6 = move-exception
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "բ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.a1.n(r6)
            androidx.datastore.core.e<androidx.datastore.preferences.core.d> r6 = r5.dataStore     // Catch: java.io.IOException -> L27
            com.google.firebase.sessions.settings.g$d r2 = new com.google.firebase.sessions.settings.g$d     // Catch: java.io.IOException -> L27
            r4 = 0
            r2.<init>(r4)     // Catch: java.io.IOException -> L27
            r0.f61006d = r3     // Catch: java.io.IOException -> L27
            java.lang.Object r6 = androidx.content.preferences.core.g.a(r6, r2, r0)     // Catch: java.io.IOException -> L27
            if (r6 != r1) goto L4c
            return r1
        L49:
            r6.toString()
        L4c:
            kotlin.k2 r6 = kotlin.k2.f75408a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.settings.g.j(kotlin.coroutines.d):java.lang.Object");
    }

    @m
    public final Integer k() {
        com.google.firebase.sessions.settings.e eVar = this.sessionConfigs;
        if (eVar == null) {
            l0.S(ProtectedSandApp.s("գ\u0001"));
            eVar = null;
        }
        return eVar.k();
    }

    @m
    public final Double l() {
        com.google.firebase.sessions.settings.e eVar = this.sessionConfigs;
        if (eVar == null) {
            l0.S(ProtectedSandApp.s("գ\u0001"));
            eVar = null;
        }
        return eVar.l();
    }

    @m
    public final Boolean m() {
        com.google.firebase.sessions.settings.e eVar = this.sessionConfigs;
        if (eVar == null) {
            l0.S(ProtectedSandApp.s("գ\u0001"));
            eVar = null;
        }
        return eVar.j();
    }

    @m
    public final Object o(@m Double d5, @l kotlin.coroutines.d<? super k2> dVar) {
        Object n4 = n(f60995f, d5, dVar);
        return n4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? n4 : k2.f75408a;
    }

    @m
    public final Object p(@m Integer num, @l kotlin.coroutines.d<? super k2> dVar) {
        Object n4 = n(f60997h, num, dVar);
        return n4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? n4 : k2.f75408a;
    }

    @m
    public final Object q(@m Long l4, @l kotlin.coroutines.d<? super k2> dVar) {
        Object n4 = n(f60998i, l4, dVar);
        return n4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? n4 : k2.f75408a;
    }

    @m
    public final Object s(@m Integer num, @l kotlin.coroutines.d<? super k2> dVar) {
        Object n4 = n(f60996g, num, dVar);
        return n4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? n4 : k2.f75408a;
    }

    @m
    public final Object t(@m Boolean bool, @l kotlin.coroutines.d<? super k2> dVar) {
        Object n4 = n(f60994e, bool, dVar);
        return n4 == kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED ? n4 : k2.f75408a;
    }
}
