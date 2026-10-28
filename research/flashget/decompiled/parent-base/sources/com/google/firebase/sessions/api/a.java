package com.google.firebase.sessions.api;

import androidx.annotation.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.sessions.api.b;
import fg.l;
import fg.m;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kd.n;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.sync.a;
import kotlinx.coroutines.sync.c;

/* compiled from: FirebaseSessionsDependencies.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0010H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0015\u0010\u0003R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017RT\u0010\u001c\u001aB\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\r0\r \u001a* \u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\r0\r\u0018\u00010\u00100\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/google/firebase/sessions/api/a;", "", "<init>", "()V", "Lcom/google/firebase/sessions/api/b$a;", "subscriberName", "Lkotlin/k2;", "a", "(Lcom/google/firebase/sessions/api/b$a;)V", "Lcom/google/firebase/sessions/api/b;", "subscriber", "e", "(Lcom/google/firebase/sessions/api/b;)V", "Lcom/google/firebase/sessions/api/a$a;", "b", "(Lcom/google/firebase/sessions/api/b$a;)Lcom/google/firebase/sessions/api/a$a;", "", "c", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "d", "(Lcom/google/firebase/sessions/api/b$a;)Lcom/google/firebase/sessions/api/b;", "f", "", "Ljava/lang/String;", "TAG", "", "kotlin.jvm.PlatformType", "Ljava/util/Map;", "dependencies", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nFirebaseSessionsDependencies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirebaseSessionsDependencies.kt\ncom/google/firebase/sessions/api/FirebaseSessionsDependencies\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,114:1\n442#2:115\n392#2:116\n1238#3,2:117\n1241#3:129\n107#4,10:119\n*S KotlinDebug\n*F\n+ 1 FirebaseSessionsDependencies.kt\ncom/google/firebase/sessions/api/FirebaseSessionsDependencies\n*L\n89#1:115\n89#1:116\n89#1:117,2\n89#1:129\n90#1:119,10\n*E\n"})
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    private static final String TAG = ProtectedSandApp.s("Ѳ\u0001");

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final a f60788a = new a();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Map<b.a, C0937a> dependencies = Collections.synchronizedMap(new LinkedHashMap());

    /* compiled from: FirebaseSessionsDependencies.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\tR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/google/firebase/sessions/api/a$a;", "", "Lkotlinx/coroutines/sync/a;", "mutex", "Lcom/google/firebase/sessions/api/b;", "subscriber", "<init>", "(Lkotlinx/coroutines/sync/a;Lcom/google/firebase/sessions/api/b;)V", "a", "()Lkotlinx/coroutines/sync/a;", "b", "()Lcom/google/firebase/sessions/api/b;", "c", "(Lkotlinx/coroutines/sync/a;Lcom/google/firebase/sessions/api/b;)Lcom/google/firebase/sessions/api/a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/sync/a;", "e", "Lcom/google/firebase/sessions/api/b;", "f", "g", "(Lcom/google/firebase/sessions/api/b;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.google.firebase.sessions.api.a$a, reason: collision with other inner class name */
    private static final /* data */ class C0937a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        private final kotlinx.coroutines.sync.a mutex;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @m
        private com.google.firebase.sessions.api.b subscriber;

        public C0937a(@l kotlinx.coroutines.sync.a aVar, @m com.google.firebase.sessions.api.b bVar) {
            l0.p(aVar, ProtectedSandApp.s("ѯ\u0001"));
            this.mutex = aVar;
            this.subscriber = bVar;
        }

        public static /* synthetic */ C0937a d(C0937a c0937a, kotlinx.coroutines.sync.a aVar, com.google.firebase.sessions.api.b bVar, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                aVar = c0937a.mutex;
            }
            if ((i4 & 2) != 0) {
                bVar = c0937a.subscriber;
            }
            return c0937a.c(aVar, bVar);
        }

        @l
        /* renamed from: a, reason: from getter */
        public final kotlinx.coroutines.sync.a getMutex() {
            return this.mutex;
        }

        @m
        /* renamed from: b, reason: from getter */
        public final com.google.firebase.sessions.api.b getSubscriber() {
            return this.subscriber;
        }

        @l
        public final C0937a c(@l kotlinx.coroutines.sync.a mutex, @m com.google.firebase.sessions.api.b subscriber) {
            l0.p(mutex, ProtectedSandApp.s("ѯ\u0001"));
            return new C0937a(mutex, subscriber);
        }

        @l
        public final kotlinx.coroutines.sync.a e() {
            return this.mutex;
        }

        public boolean equals(@m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C0937a)) {
                return false;
            }
            C0937a c0937a = (C0937a) other;
            return l0.g(this.mutex, c0937a.mutex) && l0.g(this.subscriber, c0937a.subscriber);
        }

        @m
        public final com.google.firebase.sessions.api.b f() {
            return this.subscriber;
        }

        public final void g(@m com.google.firebase.sessions.api.b bVar) {
            this.subscriber = bVar;
        }

        public int hashCode() {
            int hashCode = this.mutex.hashCode() * 31;
            com.google.firebase.sessions.api.b bVar = this.subscriber;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        @l
        public String toString() {
            return ProtectedSandApp.s("Ѱ\u0001") + this.mutex + ProtectedSandApp.s("ѱ\u0001") + this.subscriber + ')';
        }

        public /* synthetic */ C0937a(kotlinx.coroutines.sync.a aVar, com.google.firebase.sessions.api.b bVar, int i4, w wVar) {
            this(aVar, (i4 & 2) != 0 ? null : bVar);
        }
    }

    /* compiled from: FirebaseSessionsDependencies.kt */
    @f(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", i = {0, 0, 0}, l = {124}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions", n = {"destination$iv$iv", "subscriberName", "$this$withLock_u24default$iv"}, s = {"L$0", "L$2", "L$3"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends d {

        /* renamed from: b, reason: collision with root package name */
        Object f60793b;

        /* renamed from: c, reason: collision with root package name */
        Object f60794c;

        /* renamed from: d, reason: collision with root package name */
        Object f60795d;

        /* renamed from: e, reason: collision with root package name */
        Object f60796e;

        /* renamed from: f, reason: collision with root package name */
        Object f60797f;

        /* renamed from: g, reason: collision with root package name */
        Object f60798g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f60799h;

        /* renamed from: j, reason: collision with root package name */
        int f60801j;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.f60799h = obj;
            this.f60801j |= Integer.MIN_VALUE;
            return a.this.c(this);
        }
    }

    private a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @n
    public static final void a(@l b.a subscriberName) {
        l0.p(subscriberName, ProtectedSandApp.s("ѳ\u0001"));
        if (subscriberName == b.a.PERFORMANCE) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ѵ\u0001"));
        }
        Map<b.a, C0937a> map = dependencies;
        if (map.containsKey(subscriberName)) {
            Objects.toString(subscriberName);
            return;
        }
        l0.o(map, ProtectedSandApp.s("Ѵ\u0001"));
        map.put(subscriberName, new C0937a(c.a(true), null, 2, 0 == true ? 1 : 0));
        Objects.toString(subscriberName);
    }

    private final C0937a b(b.a subscriberName) {
        Map<b.a, C0937a> map = dependencies;
        l0.o(map, ProtectedSandApp.s("Ѵ\u0001"));
        C0937a c0937a = map.get(subscriberName);
        if (c0937a != null) {
            l0.o(c0937a, ProtectedSandApp.s("Ѷ\u0001"));
            return c0937a;
        }
        throw new IllegalStateException(ProtectedSandApp.s("ѷ\u0001") + subscriberName + ProtectedSandApp.s("Ѹ\u0001"));
    }

    @n
    public static final void e(@l com.google.firebase.sessions.api.b subscriber) {
        l0.p(subscriber, ProtectedSandApp.s("ѹ\u0001"));
        b.a b5 = subscriber.b();
        C0937a b6 = f60788a.b(b5);
        if (b6.f() != null) {
            Objects.toString(b5);
            return;
        }
        b6.g(subscriber);
        Objects.toString(b5);
        a.C1262a.d(b6.e(), null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00a7 -> B:10:0x00a8). Please report as a decompilation issue!!! */
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@fg.l kotlin.coroutines.d<? super java.util.Map<com.google.firebase.sessions.api.b.a, ? extends com.google.firebase.sessions.api.b>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.firebase.sessions.api.a.b
            if (r0 == 0) goto L13
            r0 = r11
            com.google.firebase.sessions.api.a$b r0 = (com.google.firebase.sessions.api.a.b) r0
            int r1 = r0.f60801j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60801j = r1
            goto L18
        L13:
            com.google.firebase.sessions.api.a$b r0 = new com.google.firebase.sessions.api.a$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f60799h
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f60801j
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4a
            if (r2 != r3) goto L3e
            java.lang.Object r2 = r0.f60798g
            java.lang.Object r5 = r0.f60797f
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f60796e
            kotlinx.coroutines.sync.a r6 = (kotlinx.coroutines.sync.a) r6
            java.lang.Object r7 = r0.f60795d
            com.google.firebase.sessions.api.b$a r7 = (com.google.firebase.sessions.api.b.a) r7
            java.lang.Object r8 = r0.f60794c
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f60793b
            java.util.Map r9 = (java.util.Map) r9
            kotlin.a1.n(r11)
            goto La8
        L3e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "Ѻ\u0001"
            java.lang.String r0 = com.flashget.parentalcontrol.ProtectedSandApp.s(r0)
            r11.<init>(r0)
            throw r11
        L4a:
            kotlin.a1.n(r11)
            java.util.Map<com.google.firebase.sessions.api.b$a, com.google.firebase.sessions.api.a$a> r11 = com.google.firebase.sessions.api.a.dependencies
            java.lang.String r2 = "Ѵ\u0001"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            kotlin.jvm.internal.l0.o(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = kotlin.collections.z0.j(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L71:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lbb
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            com.google.firebase.sessions.api.b$a r7 = (com.google.firebase.sessions.api.b.a) r7
            java.lang.Object r11 = r11.getValue()
            com.google.firebase.sessions.api.a$a r11 = (com.google.firebase.sessions.api.a.C0937a) r11
            kotlinx.coroutines.sync.a r6 = r11.e()
            r0.f60793b = r5
            r0.f60794c = r8
            r0.f60795d = r7
            r0.f60796e = r6
            r0.f60797f = r5
            r0.f60798g = r2
            r0.f60801j = r3
            java.lang.Object r11 = r6.f(r4, r0)
            if (r11 != r1) goto La7
            return r1
        La7:
            r9 = r5
        La8:
            com.google.firebase.sessions.api.a r11 = com.google.firebase.sessions.api.a.f60788a     // Catch: java.lang.Throwable -> Lb6
            com.google.firebase.sessions.api.b r11 = r11.d(r7)     // Catch: java.lang.Throwable -> Lb6
            r6.g(r4)
            r5.put(r2, r11)
            r5 = r9
            goto L71
        Lb6:
            r11 = move-exception
            r6.g(r4)
            throw r11
        Lbb:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.api.a.c(kotlin.coroutines.d):java.lang.Object");
    }

    @l
    @m1
    public final com.google.firebase.sessions.api.b d(@l b.a subscriberName) {
        l0.p(subscriberName, ProtectedSandApp.s("ѳ\u0001"));
        com.google.firebase.sessions.api.b f4 = b(subscriberName).f();
        if (f4 != null) {
            return f4;
        }
        throw new IllegalStateException(ProtectedSandApp.s("ѻ\u0001") + subscriberName + ProtectedSandApp.s("Ѽ\u0001"));
    }

    @m1
    public final void f() {
        dependencies.clear();
    }
}
