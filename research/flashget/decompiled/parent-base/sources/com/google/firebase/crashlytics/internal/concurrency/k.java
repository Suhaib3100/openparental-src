package com.google.firebase.crashlytics.internal.concurrency;

import android.os.Looper;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.concurrent.ExecutorService;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;
import kotlin.text.v;

/* compiled from: CrashlyticsWorkers.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00112\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/google/firebase/crashlytics/internal/concurrency/k;", "", "Ljava/util/concurrent/ExecutorService;", "backgroundExecutorService", "blockingExecutorService", "<init>", "(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/ExecutorService;)V", "Lcom/google/firebase/crashlytics/internal/concurrency/j;", "a", "Lcom/google/firebase/crashlytics/internal/concurrency/j;", "common", "b", "diskWrite", "c", "dataCollect", "d", "network", "e", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static boolean f58865f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    @kd.f
    public final j common;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    @kd.f
    public final j diskWrite;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    @kd.f
    public final j dataCollect;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    @kd.f
    public final j network;

    /* compiled from: CrashlyticsWorkers.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0003R\u001c\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/google/firebase/crashlytics/internal/concurrency/k$a;", "", "<init>", "()V", "", "n", "()Z", "m", "l", "Lkotlin/Function0;", "isCorrectThread", "", "failureMessage", "Lkotlin/k2;", "h", "(Lld/a;Lld/a;)V", "g", "f", "e", "kotlin.jvm.PlatformType", "k", "()Ljava/lang/String;", "threadName", "enforcement", "Z", "i", "o", "(Z)V", "j", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.google.firebase.crashlytics.internal.concurrency.k$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: CrashlyticsWorkers.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.google.firebase.crashlytics.internal.concurrency.k$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0897a extends h0 implements ld.a<Boolean> {
            C0897a(Object obj) {
                super(0, obj, Companion.class, ProtectedSandApp.s("ﳅ"), ProtectedSandApp.s("ﳆ"), 0);
            }

            @Override // ld.a
            @l
            /* renamed from: Z, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((Companion) this.receiver).l());
            }
        }

        /* compiled from: CrashlyticsWorkers.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.google.firebase.crashlytics.internal.concurrency.k$a$b */
        static final class b extends n0 implements ld.a<String> {

            /* renamed from: b, reason: collision with root package name */
            public static final b f58870b = new b(0);

            b() {
                super(0);
            }

            @Override // ld.a
            @l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return ProtectedSandApp.s("ﳇ") + k.INSTANCE.k() + '.';
            }
        }

        /* compiled from: CrashlyticsWorkers.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.google.firebase.crashlytics.internal.concurrency.k$a$c */
        /* synthetic */ class c extends h0 implements ld.a<Boolean> {
            c(Object obj) {
                super(0, obj, Companion.class, ProtectedSandApp.s("ﳈ"), ProtectedSandApp.s("ﳉ"), 0);
            }

            @Override // ld.a
            @l
            /* renamed from: Z, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((Companion) this.receiver).m());
            }
        }

        /* compiled from: CrashlyticsWorkers.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.google.firebase.crashlytics.internal.concurrency.k$a$d */
        static final class d extends n0 implements ld.a<String> {

            /* renamed from: b, reason: collision with root package name */
            public static final d f58871b = new d(0);

            d() {
                super(0);
            }

            @Override // ld.a
            @l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return ProtectedSandApp.s("ﳊ") + k.INSTANCE.k() + '.';
            }
        }

        /* compiled from: CrashlyticsWorkers.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.google.firebase.crashlytics.internal.concurrency.k$a$e */
        /* synthetic */ class e extends h0 implements ld.a<Boolean> {
            e(Object obj) {
                super(0, obj, Companion.class, ProtectedSandApp.s("ﳋ"), ProtectedSandApp.s("ﳌ"), 0);
            }

            @Override // ld.a
            @l
            /* renamed from: Z, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((Companion) this.receiver).n());
            }
        }

        /* compiled from: CrashlyticsWorkers.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: com.google.firebase.crashlytics.internal.concurrency.k$a$f */
        static final class f extends n0 implements ld.a<String> {

            /* renamed from: b, reason: collision with root package name */
            public static final f f58872b = new f(0);

            f() {
                super(0);
            }

            @Override // ld.a
            @l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return ProtectedSandApp.s("ﳍ") + k.INSTANCE.k() + '.';
            }
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        private final void h(ld.a<Boolean> isCorrectThread, ld.a<String> failureMessage) {
            if (isCorrectThread.invoke().booleanValue()) {
                return;
            }
            com.google.firebase.crashlytics.internal.g.f().b(failureMessage.invoke());
            boolean unused = k.f58865f;
        }

        @n
        public static /* synthetic */ void j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String k() {
            return Thread.currentThread().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean l() {
            String k4 = k();
            l0.o(k4, ProtectedSandApp.s("ﳎ"));
            return v.T2(k4, ProtectedSandApp.s("ﳏ"), false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean m() {
            String k4 = k();
            l0.o(k4, ProtectedSandApp.s("ﳎ"));
            return v.T2(k4, ProtectedSandApp.s("ﳐ"), false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean n() {
            return !Looper.getMainLooper().isCurrentThread();
        }

        @n
        public final void e() {
            h(new C0897a(this), b.f58870b);
        }

        @n
        public final void f() {
            h(new c(this), d.f58871b);
        }

        @n
        public final void g() {
            h(new e(this), f.f58872b);
        }

        public final boolean i() {
            return k.f58865f;
        }

        public final void o(boolean z4) {
            k.f58865f = z4;
        }

        private Companion() {
        }
    }

    public k(@l ExecutorService executorService, @l ExecutorService executorService2) {
        l0.p(executorService, ProtectedSandApp.s("ﳑ"));
        l0.p(executorService2, ProtectedSandApp.s("ﳒ"));
        this.common = new j(executorService);
        this.diskWrite = new j(executorService);
        this.dataCollect = new j(executorService);
        this.network = new j(executorService2);
    }

    @n
    public static final void c() {
        INSTANCE.e();
    }

    @n
    public static final void d() {
        INSTANCE.f();
    }

    @n
    public static final void e() {
        INSTANCE.g();
    }

    public static final boolean f() {
        INSTANCE.getClass();
        return f58865f;
    }

    public static final void g(boolean z4) {
        INSTANCE.getClass();
        f58865f = z4;
    }
}
