package com.google.firebase.sessions.api;

import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.sessions.api.b;
import d5.d;
import d5.e;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.sync.c;
import p3.n;

/* compiled from: FirebaseSessionsDependencies.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u001f\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u000bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0013RT\u0010\u0018\u001aB\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\b0\b \u0016* \u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00060\u0006\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\b0\b\u0018\u00010\u000b0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/google/firebase/sessions/api/a;", "", "Lcom/google/firebase/sessions/api/b;", "subscriber", "Lkotlin/m2;", "e", "Lcom/google/firebase/sessions/api/b$a;", "subscriberName", "Lcom/google/firebase/sessions/api/a$a;", "b", "a", "", "c", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "d", "(Lcom/google/firebase/sessions/api/b$a;)Lcom/google/firebase/sessions/api/b;", "f", "()V", "", "Ljava/lang/String;", "TAG", "", "kotlin.jvm.PlatformType", "Ljava/util/Map;", "dependencies", "<init>", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d
    private static final String TAG = ProtectedSandApp.s("ᩕ");

    /* renamed from: a, reason: collision with root package name */
    @d
    public static final a f18518a = new a();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Map<b.a, C0230a> dependencies = Collections.synchronizedMap(new LinkedHashMap());

    /* compiled from: FirebaseSessionsDependencies.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/google/firebase/sessions/api/a$a;", "", "Lkotlinx/coroutines/sync/c;", "a", "Lcom/google/firebase/sessions/api/b;", "b", "mutex", "subscriber", "c", "", "toString", "", "hashCode", "other", "", "equals", "Lkotlinx/coroutines/sync/c;", "e", "()Lkotlinx/coroutines/sync/c;", "Lcom/google/firebase/sessions/api/b;", "f", "()Lcom/google/firebase/sessions/api/b;", "g", "(Lcom/google/firebase/sessions/api/b;)V", "<init>", "(Lkotlinx/coroutines/sync/c;Lcom/google/firebase/sessions/api/b;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.google.firebase.sessions.api.a$a, reason: collision with other inner class name */
    private static final /* data */ class C0230a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d
        private final c mutex;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @e
        private com.google.firebase.sessions.api.b subscriber;

        public C0230a(@d c cVar, @e com.google.firebase.sessions.api.b bVar) {
            l0.p(cVar, ProtectedSandApp.s("ᩑ"));
            this.mutex = cVar;
            this.subscriber = bVar;
        }

        public static /* synthetic */ C0230a d(C0230a c0230a, c cVar, com.google.firebase.sessions.api.b bVar, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                cVar = c0230a.mutex;
            }
            if ((i5 & 2) != 0) {
                bVar = c0230a.subscriber;
            }
            return c0230a.c(cVar, bVar);
        }

        @d
        /* renamed from: a, reason: from getter */
        public final c getMutex() {
            return this.mutex;
        }

        @e
        /* renamed from: b, reason: from getter */
        public final com.google.firebase.sessions.api.b getSubscriber() {
            return this.subscriber;
        }

        @d
        public final C0230a c(@d c mutex, @e com.google.firebase.sessions.api.b subscriber) {
            l0.p(mutex, ProtectedSandApp.s("ᩒ"));
            return new C0230a(mutex, subscriber);
        }

        @d
        public final c e() {
            return this.mutex;
        }

        public boolean equals(@e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C0230a)) {
                return false;
            }
            C0230a c0230a = (C0230a) other;
            return l0.g(this.mutex, c0230a.mutex) && l0.g(this.subscriber, c0230a.subscriber);
        }

        @e
        public final com.google.firebase.sessions.api.b f() {
            return this.subscriber;
        }

        public final void g(@e com.google.firebase.sessions.api.b bVar) {
            this.subscriber = bVar;
        }

        public int hashCode() {
            int hashCode = this.mutex.hashCode() * 31;
            com.google.firebase.sessions.api.b bVar = this.subscriber;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        @d
        public String toString() {
            return ProtectedSandApp.s("ᩓ") + this.mutex + ProtectedSandApp.s("ᩔ") + this.subscriber + ')';
        }

        public /* synthetic */ C0230a(c cVar, com.google.firebase.sessions.api.b bVar, int i5, w wVar) {
            this(cVar, (i5 & 2) != 0 ? null : bVar);
        }
    }

    /* compiled from: FirebaseSessionsDependencies.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", i = {0, 0, 0}, l = {123}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions", n = {"destination$iv$iv", "subscriberName", "$this$withLock_u24default$iv"}, s = {"L$0", "L$2", "L$3"})
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes4.dex */
    static final class b extends ContinuationImpl {

        /* renamed from: r, reason: collision with root package name */
        Object f18523r;

        /* renamed from: s, reason: collision with root package name */
        Object f18524s;

        /* renamed from: t, reason: collision with root package name */
        Object f18525t;

        /* renamed from: u, reason: collision with root package name */
        Object f18526u;

        /* renamed from: v, reason: collision with root package name */
        Object f18527v;

        /* renamed from: w, reason: collision with root package name */
        Object f18528w;

        /* renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f18529x;

        /* renamed from: z, reason: collision with root package name */
        int f18531z;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object A(@d Object obj) {
            this.f18529x = obj;
            this.f18531z |= Integer.MIN_VALUE;
            return a.this.c(this);
        }
    }

    private a() {
    }

    private final C0230a b(b.a subscriberName) {
        Map<b.a, C0230a> map = dependencies;
        l0.o(map, ProtectedSandApp.s("ᩖ"));
        C0230a c0230a = map.get(subscriberName);
        if (c0230a != null) {
            l0.o(c0230a, ProtectedSandApp.s("ᩗ"));
            return c0230a;
        }
        throw new IllegalStateException(ProtectedSandApp.s("ᩘ") + subscriberName + ProtectedSandApp.s("ᩙ"));
    }

    @n
    public static final void e(@d com.google.firebase.sessions.api.b bVar) {
        l0.p(bVar, ProtectedSandApp.s("ᩚ"));
        b.a b6 = bVar.b();
        C0230a b7 = f18518a.b(b6);
        if (b7.f() != null) {
            Objects.toString(b6);
            return;
        }
        b7.g(bVar);
        Objects.toString(b6);
        c.a.d(b7.e(), null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(@d b.a aVar) {
        l0.p(aVar, ProtectedSandApp.s("ᩛ"));
        if (aVar == b.a.PERFORMANCE) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᩝ"));
        }
        Map<b.a, C0230a> map = dependencies;
        if (map.containsKey(aVar)) {
            Objects.toString(aVar);
            return;
        }
        l0.o(map, ProtectedSandApp.s("ᩜ"));
        map.put(aVar, new C0230a(kotlinx.coroutines.sync.e.a(true), null, 2, 0 == true ? 1 : 0));
        Objects.toString(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x00a5 -> B:10:0x00a6). Please report as a decompilation issue!!! */
    @d5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@d5.d kotlin.coroutines.Continuation<? super java.util.Map<com.google.firebase.sessions.api.b.a, ? extends com.google.firebase.sessions.api.b>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.firebase.sessions.api.a.b
            if (r0 == 0) goto L13
            r0 = r11
            com.google.firebase.sessions.api.a$b r0 = (com.google.firebase.sessions.api.a.b) r0
            int r1 = r0.f18531z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18531z = r1
            goto L18
        L13:
            com.google.firebase.sessions.api.a$b r0 = new com.google.firebase.sessions.api.a$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f18529x
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.f18531z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 != r4) goto L3e
            java.lang.Object r2 = r0.f18528w
            java.lang.Object r5 = r0.f18527v
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Object r6 = r0.f18526u
            kotlinx.coroutines.sync.c r6 = (kotlinx.coroutines.sync.c) r6
            java.lang.Object r7 = r0.f18525t
            com.google.firebase.sessions.api.b$a r7 = (com.google.firebase.sessions.api.b.a) r7
            java.lang.Object r8 = r0.f18524s
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f18523r
            java.util.Map r9 = (java.util.Map) r9
            kotlin.a1.n(r11)
            goto La6
        L3e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "ᩞ"
            java.lang.String r0 = com.flashget.kidsdownloader.ProtectedSandApp.s(r0)
            r11.<init>(r0)
            throw r11
        L4a:
            kotlin.a1.n(r11)
            java.util.Map<com.google.firebase.sessions.api.b$a, com.google.firebase.sessions.api.a$a> r11 = com.google.firebase.sessions.api.a.dependencies
            java.lang.String r2 = "\u1a5f"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            kotlin.jvm.internal.l0.o(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = kotlin.collections.c1.j(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L6f:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb9
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            com.google.firebase.sessions.api.b$a r7 = (com.google.firebase.sessions.api.b.a) r7
            java.lang.Object r11 = r11.getValue()
            com.google.firebase.sessions.api.a$a r11 = (com.google.firebase.sessions.api.a.C0230a) r11
            kotlinx.coroutines.sync.c r6 = r11.e()
            r0.f18523r = r5
            r0.f18524s = r8
            r0.f18525t = r7
            r0.f18526u = r6
            r0.f18527v = r5
            r0.f18528w = r2
            r0.f18531z = r4
            java.lang.Object r11 = r6.c(r3, r0)
            if (r11 != r1) goto La5
            return r1
        La5:
            r9 = r5
        La6:
            com.google.firebase.sessions.api.a r11 = com.google.firebase.sessions.api.a.f18518a     // Catch: java.lang.Throwable -> Lb4
            com.google.firebase.sessions.api.b r11 = r11.d(r7)     // Catch: java.lang.Throwable -> Lb4
            r6.d(r3)
            r5.put(r2, r11)
            r5 = r9
            goto L6f
        Lb4:
            r11 = move-exception
            r6.d(r3)
            throw r11
        Lb9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.api.a.c(kotlin.coroutines.d):java.lang.Object");
    }

    @m1
    @d
    public final com.google.firebase.sessions.api.b d(@d b.a subscriberName) {
        l0.p(subscriberName, ProtectedSandApp.s("᩠"));
        com.google.firebase.sessions.api.b f6 = b(subscriberName).f();
        if (f6 != null) {
            return f6;
        }
        throw new IllegalStateException(ProtectedSandApp.s("ᩡ") + subscriberName + ProtectedSandApp.s("ᩢ"));
    }

    @m1
    public final void f() {
        dependencies.clear();
    }
}
