package com.tencent.beacon.event.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import androidx.annotation.o0;
import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.a.b.i;
import com.tencent.beacon.event.open.EventType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: LogIDGenerator.java */
/* loaded from: classes6.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, g> f71495a = new ConcurrentHashMap(5);

    /* renamed from: b, reason: collision with root package name */
    private static volatile Handler f71496b;
    private volatile boolean B;

    /* renamed from: m, reason: collision with root package name */
    private final Context f71507m;

    /* renamed from: n, reason: collision with root package name */
    private final String f71508n;

    /* renamed from: p, reason: collision with root package name */
    private long f71510p;

    /* renamed from: t, reason: collision with root package name */
    private long f71514t;

    /* renamed from: u, reason: collision with root package name */
    private long f71515u;

    /* renamed from: v, reason: collision with root package name */
    private long f71516v;

    /* renamed from: w, reason: collision with root package name */
    private long f71517w;

    /* renamed from: x, reason: collision with root package name */
    private long f71518x;

    /* renamed from: y, reason: collision with root package name */
    private long f71519y;

    /* renamed from: z, reason: collision with root package name */
    private SharedPreferences f71520z;

    /* renamed from: c, reason: collision with root package name */
    private final String f71497c = ProtectedSandApp.s("㋢\u0001");

    /* renamed from: d, reason: collision with root package name */
    private final String f71498d = ProtectedSandApp.s("㋣\u0001");

    /* renamed from: e, reason: collision with root package name */
    private final String f71499e = ProtectedSandApp.s("㋤\u0001");

    /* renamed from: f, reason: collision with root package name */
    private final String f71500f = ProtectedSandApp.s("㋥\u0001");

    /* renamed from: g, reason: collision with root package name */
    private final String f71501g = ProtectedSandApp.s("㋦\u0001");

    /* renamed from: h, reason: collision with root package name */
    private final String f71502h = ProtectedSandApp.s("㋧\u0001");

    /* renamed from: i, reason: collision with root package name */
    private final String f71503i = ProtectedSandApp.s("㋨\u0001");

    /* renamed from: j, reason: collision with root package name */
    private final String f71504j = ProtectedSandApp.s("㋩\u0001");

    /* renamed from: k, reason: collision with root package name */
    private final String f71505k = ProtectedSandApp.s("㋪\u0001");

    /* renamed from: l, reason: collision with root package name */
    private final String f71506l = ProtectedSandApp.s("㋫\u0001");

    /* renamed from: o, reason: collision with root package name */
    private final List<String> f71509o = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    private AtomicLong f71511q = new AtomicLong(0);

    /* renamed from: r, reason: collision with root package name */
    private AtomicLong f71512r = new AtomicLong(0);

    /* renamed from: s, reason: collision with root package name */
    private AtomicLong f71513s = new AtomicLong(0);
    private final Runnable A = new e(this);

    private g(Context context, String str) {
        this.f71507m = context;
        this.f71508n = str;
    }

    private void c() {
        if (e()) {
            String a5 = android.support.v4.media.session.b.a(new StringBuilder(), this.f71510p, "");
            String c5 = com.tencent.beacon.a.c.b.c(this.f71507m);
            String packageName = this.f71507m.getPackageName();
            String a6 = this.f71514t == 0 ? "" : android.support.v4.media.session.b.a(new StringBuilder(), this.f71514t - 1, "");
            String a7 = this.f71515u == 0 ? "" : android.support.v4.media.session.b.a(new StringBuilder(), this.f71515u, "");
            String a8 = this.f71516v == 0 ? "" : android.support.v4.media.session.b.a(new StringBuilder(), this.f71516v - 1, "");
            String a10 = this.f71517w == 0 ? "" : android.support.v4.media.session.b.a(new StringBuilder(), this.f71517w, "");
            String a11 = this.f71518x == 0 ? "" : android.support.v4.media.session.b.a(new StringBuilder(), this.f71518x - 1, "");
            String a12 = this.f71519y != 0 ? android.support.v4.media.session.b.a(new StringBuilder(), this.f71519y, "") : "";
            StringBuilder a13 = androidx.constraintlayout.core.parser.b.a(ProtectedSandApp.s("㋮\u0001"), c5, ProtectedSandApp.s("㋯\u0001"), a6, ProtectedSandApp.s("㋰\u0001"));
            l0.a(a13, a7, ProtectedSandApp.s("㋱\u0001"), a8, ProtectedSandApp.s("㋲\u0001"));
            l0.a(a13, a10, ProtectedSandApp.s("㋳\u0001"), a11, ProtectedSandApp.s("㋴\u0001"));
            a13.append(a12);
            a13.append(ProtectedSandApp.s("㋵\u0001"));
            a13.append(a5.substring(0, a5.length() - 3));
            a13.append(ProtectedSandApp.s("㋶\u0001"));
            a13.append(this.f71508n);
            a13.append(ProtectedSandApp.s("㋷\u0001"));
            a13.append(packageName);
            i.e().a(ProtectedSandApp.s("㋸\u0001"), a13.toString());
            g();
        }
    }

    private void d() {
        SharedPreferences a5 = a(this.f71507m);
        this.f71510p = a5.getLong(ProtectedSandApp.s("㋫\u0001"), 0L);
        this.f71512r.set(a5.getLong(ProtectedSandApp.s("㋣\u0001"), 0L));
        this.f71511q.set(a5.getLong(ProtectedSandApp.s("㋢\u0001"), 0L));
        this.f71513s.set(a5.getLong(ProtectedSandApp.s("㋤\u0001"), 0L));
        this.f71514t = a5.getLong(ProtectedSandApp.s("㋧\u0001"), 0L);
        this.f71515u = a5.getLong(ProtectedSandApp.s("㋨\u0001"), 0L);
        this.f71516v = a5.getLong(ProtectedSandApp.s("㋥\u0001"), 0L);
        this.f71517w = a5.getLong(ProtectedSandApp.s("㋦\u0001"), 0L);
        this.f71518x = a5.getLong(ProtectedSandApp.s("㋩\u0001"), 0L);
        this.f71519y = a5.getLong(ProtectedSandApp.s("㋪\u0001"), 0L);
        com.tencent.beacon.base.util.c.a(android.support.v4.media.c.a(new StringBuilder(ProtectedSandApp.s("㋹\u0001")), this.f71508n, ProtectedSandApp.s("㋺\u0001")), ProtectedSandApp.s("㋻\u0001"), Long.valueOf(this.f71510p), Long.valueOf(this.f71512r.get()), Long.valueOf(this.f71511q.get()), Long.valueOf(this.f71513s.get()));
    }

    private boolean e() {
        long d5 = com.tencent.beacon.base.util.b.d();
        long j4 = this.f71510p;
        return (j4 == 0 || com.tencent.beacon.base.util.b.a(d5, j4)) ? false : true;
    }

    private void f() {
        HashMap hashMap = new HashMap();
        hashMap.put(ProtectedSandApp.s("㋼\u0001"), this.f71508n);
        com.tencent.beacon.a.a.b.a().a(new com.tencent.beacon.a.a.c(14, hashMap));
    }

    private void g() {
        this.f71514t = this.f71515u + 1;
        this.f71516v = this.f71517w + 1;
        this.f71518x = this.f71519y + 1;
    }

    public synchronized boolean b() {
        return this.B;
    }

    public static synchronized g a(Context context, @o0 String str) {
        g gVar;
        synchronized (g.class) {
            Map<String, g> map = f71495a;
            gVar = map.get(str);
            if (gVar == null) {
                gVar = new g(context, str);
                map.put(str, gVar);
            }
        }
        return gVar;
    }

    public synchronized String a(String str, EventType eventType) {
        String s4 = ProtectedSandApp.s("㋽\u0001");
        synchronized (this) {
            try {
                if (!this.B) {
                    a();
                    this.B = true;
                }
                if (this.f71509o.contains(str)) {
                    return "";
                }
                long a5 = a(eventType);
                c();
                this.f71510p = com.tencent.beacon.base.util.b.d();
                a(a5, eventType);
                com.tencent.beacon.base.util.c.a(s4 + this.f71508n + ProtectedSandApp.s("㋺\u0001"), ProtectedSandApp.s("㋾\u0001"), eventType, str, Long.valueOf(a5));
                f71496b.post(this.A);
                return a5 + "";
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private long a(EventType eventType) {
        switch (f.f71494a[eventType.ordinal()]) {
            case 1:
            case 2:
                return this.f71511q.incrementAndGet();
            case 3:
            case 4:
                return this.f71512r.incrementAndGet();
            case 5:
                return this.f71513s.incrementAndGet();
            case 6:
                return this.f71513s.incrementAndGet();
            default:
                return -1L;
        }
    }

    private void a(long j4, EventType eventType) {
        if (eventType != EventType.REALTIME && eventType != EventType.DT_REALTIME) {
            if (eventType != EventType.NORMAL && eventType != EventType.DT_NORMAL) {
                if (eventType == EventType.IMMEDIATE_MSF || eventType == EventType.IMMEDIATE) {
                    long j5 = this.f71519y;
                    this.f71519y = j5 == 0 ? j4 : Math.max(j4, j5);
                    long j6 = this.f71518x;
                    if (j6 != 0) {
                        j4 = Math.min(j4, j6);
                    }
                    this.f71518x = j4;
                    return;
                }
                return;
            }
            long j7 = this.f71517w;
            this.f71517w = j7 == 0 ? j4 : Math.max(j4, j7);
            long j10 = this.f71516v;
            if (j10 != 0) {
                j4 = Math.min(j4, j10);
            }
            this.f71516v = j4;
            return;
        }
        long j11 = this.f71515u;
        this.f71515u = j11 == 0 ? j4 : Math.max(j4, j11);
        long j12 = this.f71514t;
        if (j12 != 0) {
            j4 = Math.min(j4, j12);
        }
        this.f71514t = j4;
    }

    public synchronized void a() {
        if (this.B) {
            return;
        }
        com.tencent.beacon.base.util.c.a(ProtectedSandApp.s("㋿\u0001"), this.f71508n);
        f71496b = com.tencent.beacon.a.b.b.a().a(113);
        this.f71509o.add(ProtectedSandApp.s("㌀\u0001"));
        this.f71509o.add(ProtectedSandApp.s("㌁\u0001"));
        d();
        f();
        this.B = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SharedPreferences a(Context context) {
        if (this.f71520z == null) {
            this.f71520z = context.getSharedPreferences(ProtectedSandApp.s("㋬\u0001") + com.tencent.beacon.a.c.b.c(context) + ProtectedSandApp.s("㋭\u0001") + this.f71508n, 0);
        }
        return this.f71520z;
    }
}
