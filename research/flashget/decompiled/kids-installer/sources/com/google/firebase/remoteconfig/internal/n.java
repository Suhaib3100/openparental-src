package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import androidx.annotation.m1;
import androidx.annotation.n1;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.n;
import com.google.firebase.remoteconfig.internal.q;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: ConfigFetchHandler.java */
/* loaded from: classes2.dex */
public class n {

    /* renamed from: l, reason: collision with root package name */
    @m1
    static final int f17959l = 429;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.installations.k f17962a;

    /* renamed from: b, reason: collision with root package name */
    private final o2.b<com.google.firebase.analytics.connector.a> f17963b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f17964c;

    /* renamed from: d, reason: collision with root package name */
    private final Clock f17965d;

    /* renamed from: e, reason: collision with root package name */
    private final Random f17966e;

    /* renamed from: f, reason: collision with root package name */
    private final g f17967f;

    /* renamed from: g, reason: collision with root package name */
    private final ConfigFetchHttpClient f17968g;

    /* renamed from: h, reason: collision with root package name */
    private final q f17969h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, String> f17970i;

    /* renamed from: m, reason: collision with root package name */
    @m1
    static final String f17960m = ProtectedSandApp.s("ᥠ");

    /* renamed from: n, reason: collision with root package name */
    private static final String f17961n = ProtectedSandApp.s("ᥡ");

    /* renamed from: j, reason: collision with root package name */
    public static final long f17957j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k, reason: collision with root package name */
    @m1
    static final int[] f17958k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* compiled from: ConfigFetchHandler.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Date f17971a;

        /* renamed from: b, reason: collision with root package name */
        private final int f17972b;

        /* renamed from: c, reason: collision with root package name */
        private final h f17973c;

        /* renamed from: d, reason: collision with root package name */
        @q0
        private final String f17974d;

        /* compiled from: ConfigFetchHandler.java */
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.google.firebase.remoteconfig.internal.n$a$a, reason: collision with other inner class name */
        public @interface InterfaceC0225a {

            /* renamed from: m0, reason: collision with root package name */
            public static final int f17975m0 = 0;

            /* renamed from: n0, reason: collision with root package name */
            public static final int f17976n0 = 1;

            /* renamed from: o0, reason: collision with root package name */
            public static final int f17977o0 = 2;
        }

        private a(Date date, int i5, h hVar, @q0 String str) {
            this.f17971a = date;
            this.f17972b = i5;
            this.f17973c = hVar;
            this.f17974d = str;
        }

        public static a a(Date date, h hVar) {
            return new a(date, 1, hVar, null);
        }

        public static a b(h hVar, String str) {
            return new a(hVar.g(), 0, hVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        Date d() {
            return this.f17971a;
        }

        public h e() {
            return this.f17973c;
        }

        @q0
        String f() {
            return this.f17974d;
        }

        int g() {
            return this.f17972b;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BASE' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: ConfigFetchHandler.java */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b BASE;
        public static final b REALTIME;
        private final String value;

        static {
            String s5 = ProtectedSandApp.s("ᥞ");
            b bVar = new b(s5, 0, s5);
            BASE = bVar;
            String s6 = ProtectedSandApp.s("ᥟ");
            b bVar2 = new b(s6, 1, s6);
            REALTIME = bVar2;
            $VALUES = new b[]{bVar, bVar2};
        }

        private b(String str, int i5, String str2) {
            this.value = str2;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        String getValue() {
            return this.value;
        }
    }

    public n(com.google.firebase.installations.k kVar, o2.b<com.google.firebase.analytics.connector.a> bVar, Executor executor, Clock clock, Random random, g gVar, ConfigFetchHttpClient configFetchHttpClient, q qVar, Map<String, String> map) {
        this.f17962a = kVar;
        this.f17963b = bVar;
        this.f17964c = executor;
        this.f17965d = clock;
        this.f17966e = random;
        this.f17967f = gVar;
        this.f17968g = configFetchHttpClient;
        this.f17969h = qVar;
        this.f17970i = map;
    }

    private boolean A(q.a aVar, int i5) {
        return aVar.b() > 1 || i5 == f17959l;
    }

    private q.a B(int i5, Date date) {
        if (u(i5)) {
            C(date);
        }
        return this.f17969h.b();
    }

    private void C(Date date) {
        int b6 = this.f17969h.b().b() + 1;
        this.f17969h.m(b6, new Date(date.getTime() + r(b6)));
    }

    private void D(Task<a> task, Date date) {
        if (task.isSuccessful()) {
            this.f17969h.t(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.f17969h.u();
        } else {
            this.f17969h.s();
        }
    }

    public static /* synthetic */ Task d(n nVar, Date date, Task task) {
        nVar.D(task, date);
        return task;
    }

    private boolean f(long j5, Date date) {
        Date g5 = this.f17969h.g();
        if (g5.equals(q.f17989f)) {
            return false;
        }
        return date.before(new Date(TimeUnit.SECONDS.toMillis(j5) + g5.getTime()));
    }

    private FirebaseRemoteConfigServerException g(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String s5;
        int b6 = firebaseRemoteConfigServerException.b();
        if (b6 == 401) {
            s5 = ProtectedSandApp.s("ᥧ");
        } else if (b6 == 403) {
            s5 = ProtectedSandApp.s("ᥦ");
        } else {
            if (b6 == f17959l) {
                throw new FirebaseRemoteConfigClientException(ProtectedSandApp.s("ᥥ"));
            }
            if (b6 != 500) {
                switch (b6) {
                    case 502:
                    case 503:
                    case 504:
                        s5 = ProtectedSandApp.s("ᥣ");
                        break;
                    default:
                        s5 = ProtectedSandApp.s("ᥢ");
                        break;
                }
            } else {
                s5 = ProtectedSandApp.s("ᥤ");
            }
        }
        return new FirebaseRemoteConfigServerException(firebaseRemoteConfigServerException.b(), ProtectedSandApp.s("ᥨ").concat(s5), firebaseRemoteConfigServerException);
    }

    private String h(long j5) {
        return String.format(ProtectedSandApp.s("ᥩ"), DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j5)));
    }

    @n1
    private a k(String str, String str2, Date date, Map<String, String> map) throws FirebaseRemoteConfigException {
        try {
            a fetch = this.f17968g.fetch(this.f17968g.d(), str, str2, t(), this.f17969h.e(), map, q(), date);
            if (fetch.e() != null) {
                this.f17969h.q(fetch.e().i());
            }
            if (fetch.f() != null) {
                this.f17969h.p(fetch.f());
            }
            this.f17969h.k();
            return fetch;
        } catch (FirebaseRemoteConfigServerException e6) {
            q.a B = B(e6.b(), date);
            if (A(B, e6.b())) {
                throw new FirebaseRemoteConfigFetchThrottledException(B.a().getTime());
            }
            throw g(e6);
        }
    }

    private Task<a> l(String str, String str2, Date date, Map<String, String> map) {
        try {
            final a k5 = k(str, str2, date, map);
            return k5.g() != 0 ? Tasks.forResult(k5) : this.f17967f.m(k5.e()).onSuccessTask(this.f17964c, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.i
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    Task forResult;
                    forResult = Tasks.forResult(n.a.this);
                    return forResult;
                }
            });
        } catch (FirebaseRemoteConfigException e6) {
            return Tasks.forException(e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Task<a> v(Task<h> task, long j5, final Map<String, String> map) {
        Task continueWithTask;
        final Date date = new Date(this.f17965d.currentTimeMillis());
        if (task.isSuccessful() && f(j5, date)) {
            return Tasks.forResult(a.c(date));
        }
        Date p5 = p(date);
        if (p5 != null) {
            continueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(h(p5.getTime() - date.getTime()), p5.getTime()));
        } else {
            final Task<String> id = this.f17962a.getId();
            final Task<com.google.firebase.installations.o> a6 = this.f17962a.a(false);
            continueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{id, a6}).continueWithTask(this.f17964c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.k
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    Task x5;
                    x5 = n.this.x(id, a6, date, map, task2);
                    return x5;
                }
            });
        }
        return continueWithTask.continueWithTask(this.f17964c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.l
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return n.d(n.this, date, task2);
            }
        });
    }

    @q0
    private Date p(Date date) {
        Date a6 = this.f17969h.b().a();
        if (date.before(a6)) {
            return a6;
        }
        return null;
    }

    @n1
    private Long q() {
        com.google.firebase.analytics.connector.a aVar = this.f17963b.get();
        if (aVar == null) {
            return null;
        }
        return (Long) aVar.a(true).get(ProtectedSandApp.s("ᥪ"));
    }

    private long r(int i5) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f17958k;
        return (timeUnit.toMillis(iArr[Math.min(i5, iArr.length) - 1]) / 2) + this.f17966e.nextInt((int) r0);
    }

    @n1
    private Map<String, String> t() {
        HashMap hashMap = new HashMap();
        com.google.firebase.analytics.connector.a aVar = this.f17963b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : aVar.a(false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    private boolean u(int i5) {
        return i5 == f17959l || i5 == 502 || i5 == 503 || i5 == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task x(Task task, Task task2, Date date, Map map, Task task3) throws Exception {
        return !task.isSuccessful() ? Tasks.forException(new FirebaseRemoteConfigClientException(ProtectedSandApp.s("ᥫ"), task.getException())) : !task2.isSuccessful() ? Tasks.forException(new FirebaseRemoteConfigClientException(ProtectedSandApp.s("ᥬ"), task2.getException())) : l((String) task.getResult(), ((com.google.firebase.installations.o) task2.getResult()).b(), date, map);
    }

    private /* synthetic */ Task y(Date date, Task task) throws Exception {
        D(task, date);
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task z(Map map, Task task) throws Exception {
        return v(task, 0L, map);
    }

    public Task<a> i() {
        return j(this.f17969h.i());
    }

    public Task<a> j(final long j5) {
        final HashMap hashMap = new HashMap(this.f17970i);
        hashMap.put(ProtectedSandApp.s("\u196e"), b.BASE.getValue() + ProtectedSandApp.s("ᥭ"));
        return this.f17967f.f().continueWithTask(this.f17964c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.j
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task v5;
                v5 = n.this.v(task, j5, hashMap);
                return v5;
            }
        });
    }

    public Task<a> n(b bVar, int i5) {
        final HashMap hashMap = new HashMap(this.f17970i);
        hashMap.put(ProtectedSandApp.s("ᥰ"), bVar.getValue() + ProtectedSandApp.s("\u196f") + i5);
        return this.f17967f.f().continueWithTask(this.f17964c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.m
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task z5;
                z5 = n.this.z(hashMap, task);
                return z5;
            }
        });
    }

    @m1
    public o2.b<com.google.firebase.analytics.connector.a> o() {
        return this.f17963b;
    }

    public long s() {
        return this.f17969h.h();
    }
}
