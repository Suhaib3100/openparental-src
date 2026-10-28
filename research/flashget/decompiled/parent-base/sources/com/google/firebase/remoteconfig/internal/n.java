package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import androidx.annotation.m1;
import androidx.annotation.n1;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
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
/* loaded from: classes6.dex */
public class n {

    /* renamed from: l, reason: collision with root package name */
    @m1
    static final int f60492l = 429;

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.installations.k f60495a;

    /* renamed from: b, reason: collision with root package name */
    private final y9.b<com.google.firebase.analytics.connector.a> f60496b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f60497c;

    /* renamed from: d, reason: collision with root package name */
    private final Clock f60498d;

    /* renamed from: e, reason: collision with root package name */
    private final Random f60499e;

    /* renamed from: f, reason: collision with root package name */
    private final g f60500f;

    /* renamed from: g, reason: collision with root package name */
    private final ConfigFetchHttpClient f60501g;

    /* renamed from: h, reason: collision with root package name */
    private final q f60502h;

    /* renamed from: i, reason: collision with root package name */
    private final Map<String, String> f60503i;

    /* renamed from: m, reason: collision with root package name */
    @m1
    static final String f60493m = ProtectedSandApp.s("\u0379\u0001");

    /* renamed from: n, reason: collision with root package name */
    private static final String f60494n = ProtectedSandApp.s("ͺ\u0001");

    /* renamed from: j, reason: collision with root package name */
    public static final long f60490j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k, reason: collision with root package name */
    @m1
    static final int[] f60491k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* compiled from: ConfigFetchHandler.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Date f60504a;

        /* renamed from: b, reason: collision with root package name */
        private final int f60505b;

        /* renamed from: c, reason: collision with root package name */
        private final h f60506c;

        /* renamed from: d, reason: collision with root package name */
        @q0
        private final String f60507d;

        /* compiled from: ConfigFetchHandler.java */
        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.google.firebase.remoteconfig.internal.n$a$a, reason: collision with other inner class name */
        public @interface InterfaceC0930a {

            /* renamed from: p3, reason: collision with root package name */
            public static final int f60508p3 = 0;

            /* renamed from: q3, reason: collision with root package name */
            public static final int f60509q3 = 1;

            /* renamed from: r3, reason: collision with root package name */
            public static final int f60510r3 = 2;
        }

        private a(Date date, int i4, h hVar, @q0 String str) {
            this.f60504a = date;
            this.f60505b = i4;
            this.f60506c = hVar;
            this.f60507d = str;
        }

        public static a a(Date date, h hVar) {
            return new a(date, 1, hVar, null);
        }

        public static a b(h hVar, String str) {
            return new a(hVar.h(), 0, hVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        Date d() {
            return this.f60504a;
        }

        public h e() {
            return this.f60506c;
        }

        @q0
        String f() {
            return this.f60507d;
        }

        int g() {
            return this.f60505b;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'BASE' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
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

        private static /* synthetic */ b[] $values() {
            return new b[]{BASE, REALTIME};
        }

        static {
            String s4 = ProtectedSandApp.s("ͷ\u0001");
            BASE = new b(s4, 0, s4);
            String s5 = ProtectedSandApp.s("\u0378\u0001");
            REALTIME = new b(s5, 1, s5);
            $VALUES = $values();
        }

        private b(String str, int i4, String str2) {
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

    public n(com.google.firebase.installations.k kVar, y9.b<com.google.firebase.analytics.connector.a> bVar, Executor executor, Clock clock, Random random, g gVar, ConfigFetchHttpClient configFetchHttpClient, q qVar, Map<String, String> map) {
        this.f60495a = kVar;
        this.f60496b = bVar;
        this.f60497c = executor;
        this.f60498d = clock;
        this.f60499e = random;
        this.f60500f = gVar;
        this.f60501g = configFetchHttpClient;
        this.f60502h = qVar;
        this.f60503i = map;
    }

    private boolean A(q.a aVar, int i4) {
        return aVar.b() > 1 || i4 == f60492l;
    }

    private q.a B(int i4, Date date) {
        if (u(i4)) {
            C(date);
        }
        return this.f60502h.b();
    }

    private void C(Date date) {
        int b5 = this.f60502h.b().b() + 1;
        this.f60502h.m(b5, new Date(date.getTime() + r(b5)));
    }

    private void D(Task<a> task, Date date) {
        if (task.isSuccessful()) {
            this.f60502h.t(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.f60502h.u();
        } else {
            this.f60502h.s();
        }
    }

    public static /* synthetic */ Task c(n nVar, Date date, Task task) {
        nVar.D(task, date);
        return task;
    }

    private boolean f(long j4, Date date) {
        Date g4 = this.f60502h.g();
        if (g4.equals(q.f60522f)) {
            return false;
        }
        return date.before(new Date(TimeUnit.SECONDS.toMillis(j4) + g4.getTime()));
    }

    private FirebaseRemoteConfigServerException g(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String s4;
        int b5 = firebaseRemoteConfigServerException.b();
        if (b5 == 401) {
            s4 = ProtectedSandApp.s("\u0380\u0001");
        } else if (b5 == 403) {
            s4 = ProtectedSandApp.s("Ϳ\u0001");
        } else {
            if (b5 == f60492l) {
                throw new FirebaseRemoteConfigClientException(ProtectedSandApp.s(";\u0001"));
            }
            if (b5 != 500) {
                switch (b5) {
                    case 502:
                    case 503:
                    case 504:
                        s4 = ProtectedSandApp.s("ͼ\u0001");
                        break;
                    default:
                        s4 = ProtectedSandApp.s("ͻ\u0001");
                        break;
                }
            } else {
                s4 = ProtectedSandApp.s("ͽ\u0001");
            }
        }
        return new FirebaseRemoteConfigServerException(firebaseRemoteConfigServerException.b(), ProtectedSandApp.s("\u0381\u0001").concat(s4), firebaseRemoteConfigServerException);
    }

    private String h(long j4) {
        return String.format(ProtectedSandApp.s("\u0382\u0001"), DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j4)));
    }

    @n1
    private a k(String str, String str2, Date date, Map<String, String> map) throws FirebaseRemoteConfigException {
        try {
            a fetch = this.f60501g.fetch(this.f60501g.d(), str, str2, t(), this.f60502h.e(), map, q(), date);
            if (fetch.e() != null) {
                this.f60502h.q(fetch.e().k());
            }
            if (fetch.f() != null) {
                this.f60502h.p(fetch.f());
            }
            this.f60502h.k();
            return fetch;
        } catch (FirebaseRemoteConfigServerException e4) {
            q.a B = B(e4.b(), date);
            if (A(B, e4.b())) {
                throw new FirebaseRemoteConfigFetchThrottledException(B.a().getTime());
            }
            throw g(e4);
        }
    }

    private Task<a> l(String str, String str2, Date date, Map<String, String> map) {
        try {
            final a k4 = k(str, str2, date, map);
            return k4.g() != 0 ? Tasks.forResult(k4) : this.f60500f.m(k4.e()).onSuccessTask(this.f60497c, new SuccessContinuation() { // from class: com.google.firebase.remoteconfig.internal.m
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    Task forResult;
                    forResult = Tasks.forResult(n.a.this);
                    return forResult;
                }
            });
        } catch (FirebaseRemoteConfigException e4) {
            return Tasks.forException(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Task<a> v(Task<h> task, long j4, final Map<String, String> map) {
        Task continueWithTask;
        final Date date = new Date(this.f60498d.currentTimeMillis());
        if (task.isSuccessful() && f(j4, date)) {
            return Tasks.forResult(a.c(date));
        }
        Date p4 = p(date);
        if (p4 != null) {
            continueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(h(p4.getTime() - date.getTime()), p4.getTime()));
        } else {
            final Task<String> a5 = this.f60495a.a();
            final Task<com.google.firebase.installations.o> c5 = this.f60495a.c(false);
            continueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{a5, c5}).continueWithTask(this.f60497c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.j
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    Task x4;
                    x4 = n.this.x(a5, c5, date, map, task2);
                    return x4;
                }
            });
        }
        return continueWithTask.continueWithTask(this.f60497c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.k
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return n.c(n.this, date, task2);
            }
        });
    }

    @q0
    private Date p(Date date) {
        Date a5 = this.f60502h.b().a();
        if (date.before(a5)) {
            return a5;
        }
        return null;
    }

    @n1
    private Long q() {
        com.google.firebase.analytics.connector.a aVar = this.f60496b.get();
        if (aVar == null) {
            return null;
        }
        return (Long) aVar.d(true).get(ProtectedSandApp.s("\u0379\u0001"));
    }

    private long r(int i4) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f60491k;
        return (timeUnit.toMillis(iArr[Math.min(i4, iArr.length) - 1]) / 2) + this.f60499e.nextInt((int) r0);
    }

    @n1
    private Map<String, String> t() {
        HashMap hashMap = new HashMap();
        com.google.firebase.analytics.connector.a aVar = this.f60496b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : aVar.d(false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    private boolean u(int i4) {
        return i4 == f60492l || i4 == 502 || i4 == 503 || i4 == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task x(Task task, Task task2, Date date, Map map, Task task3) throws Exception {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException(ProtectedSandApp.s("\u0383\u0001"), task.getException()));
        }
        if (task2.isSuccessful()) {
            return l((String) task.getResult(), ((com.google.firebase.installations.o) task2.getResult()).b(), date, map);
        }
        return Tasks.forException(new FirebaseRemoteConfigClientException(ProtectedSandApp.s("΄\u0001"), task2.getException()));
    }

    private /* synthetic */ Task y(Date date, Task task) throws Exception {
        D(task, date);
        return task;
    }

    private /* synthetic */ Task z(Map map, Task task) throws Exception {
        return v(task, 0L, map);
    }

    public Task<a> i() {
        return j(this.f60502h.i());
    }

    public Task<a> j(final long j4) {
        final HashMap hashMap = new HashMap(this.f60503i);
        hashMap.put(ProtectedSandApp.s("ͺ\u0001"), b.BASE.getValue() + ProtectedSandApp.s("΅\u0001"));
        return this.f60500f.f().continueWithTask(this.f60497c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.i
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task v4;
                v4 = n.this.v(task, j4, hashMap);
                return v4;
            }
        });
    }

    public Task<a> n(b bVar, int i4) {
        final HashMap hashMap = new HashMap(this.f60503i);
        hashMap.put(ProtectedSandApp.s("ͺ\u0001"), bVar.getValue() + ProtectedSandApp.s("Ά\u0001") + i4);
        return this.f60500f.f().continueWithTask(this.f60497c, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.l
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                Task v4;
                v4 = n.this.v(task, 0L, hashMap);
                return v4;
            }
        });
    }

    @m1
    public y9.b<com.google.firebase.analytics.connector.a> o() {
        return this.f60496b;
    }

    public long s() {
        return this.f60502h.h();
    }
}
