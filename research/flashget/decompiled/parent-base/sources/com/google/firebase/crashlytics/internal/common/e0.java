package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: CrashlyticsReportDataCapture.java */
/* loaded from: classes6.dex */
public class e0 {

    /* renamed from: g, reason: collision with root package name */
    private static final Map<String, Integer> f58672g;

    /* renamed from: h, reason: collision with root package name */
    static final String f58673h;

    /* renamed from: i, reason: collision with root package name */
    static final int f58674i = 3;

    /* renamed from: j, reason: collision with root package name */
    static final int f58675j = 4;

    /* renamed from: k, reason: collision with root package name */
    static final int f58676k = 3;

    /* renamed from: l, reason: collision with root package name */
    static final String f58677l = ProtectedSandApp.s("ﯵ");

    /* renamed from: a, reason: collision with root package name */
    private final Context f58678a;

    /* renamed from: b, reason: collision with root package name */
    private final n0 f58679b;

    /* renamed from: c, reason: collision with root package name */
    private final a f58680c;

    /* renamed from: d, reason: collision with root package name */
    private final o9.d f58681d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.settings.k f58682e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.j f58683f = com.google.firebase.crashlytics.internal.j.f58890a;

    static {
        HashMap hashMap = new HashMap();
        f58672g = hashMap;
        hashMap.put(ProtectedSandApp.s("ﯶ"), 5);
        hashMap.put(ProtectedSandApp.s("ﯷ"), 6);
        hashMap.put(ProtectedSandApp.s("ﯸ"), 9);
        hashMap.put(ProtectedSandApp.s("ﯹ"), 0);
        hashMap.put(ProtectedSandApp.s("ﯺ"), 1);
        f58673h = String.format(Locale.US, ProtectedSandApp.s("ﯼ"), ProtectedSandApp.s("ﯻ"));
    }

    public e0(Context context, n0 n0Var, a aVar, o9.d dVar, com.google.firebase.crashlytics.internal.settings.k kVar) {
        this.f58678a = context;
        this.f58679b = n0Var;
        this.f58680c = aVar;
        this.f58681d = dVar;
        this.f58682e = kVar;
    }

    private g0.f.d.a.c A(g0.a aVar) {
        return this.f58683f.c(aVar.e(), aVar.d(), aVar.c());
    }

    private g0.a a(g0.a aVar) {
        List<g0.a.AbstractC0901a> list;
        if (!this.f58682e.b().f59495b.f59504c || this.f58680c.f58619c.size() <= 0) {
            list = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (f fVar : this.f58680c.f58619c) {
                arrayList.add(g0.a.AbstractC0901a.a().d(fVar.c()).b(fVar.a()).c(fVar.b()).a());
            }
            list = Collections.unmodifiableList(arrayList);
        }
        return g0.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(list).a();
    }

    private g0.c b() {
        return com.google.firebase.crashlytics.internal.model.g0.b().l(ProtectedSandApp.s("ﯻ")).h(this.f58680c.f58617a).i(this.f58679b.a().c()).g(this.f58679b.a().e()).f(this.f58679b.a().d()).d(this.f58680c.f58622f).e(this.f58680c.f58623g).k(4);
    }

    private static long f(long j4) {
        if (j4 > 0) {
            return j4;
        }
        return 0L;
    }

    private static int g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f58672g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private g0.f.d.a.b.AbstractC0906a h() {
        return g0.f.d.a.b.AbstractC0906a.a().b(0L).d(0L).c(this.f58680c.f58621e).e(this.f58680c.f58618b).a();
    }

    private List<g0.f.d.a.b.AbstractC0906a> i() {
        return Collections.singletonList(h());
    }

    private g0.f.d.a j(int i4, g0.a aVar) {
        return g0.f.d.a.a().c(Boolean.valueOf(aVar.c() != 100)).d(A(aVar)).h(i4).f(o(aVar)).a();
    }

    private g0.f.d.a k(int i4, o9.e eVar, Thread thread, int i5, int i6, boolean z4) {
        Boolean bool;
        g0.f.d.a.c g4 = this.f58683f.g(this.f58678a);
        if (g4.b() > 0) {
            bool = Boolean.valueOf(g4.b() != 100);
        } else {
            bool = null;
        }
        return g0.f.d.a.a().c(bool).d(g4).b(this.f58683f.f(this.f58678a)).h(i4).f(p(eVar, thread, i5, i6, z4)).a();
    }

    private g0.f.d.c l(int i4) {
        e a5 = e.a(this.f58678a);
        Float b5 = a5.b();
        Double valueOf = b5 != null ? Double.valueOf(b5.doubleValue()) : null;
        int c5 = a5.c();
        boolean o4 = i.o(this.f58678a);
        return g0.f.d.c.a().b(valueOf).c(c5).f(o4).e(i4).g(f(i.b(this.f58678a) - i.a(this.f58678a))).d(i.c(Environment.getDataDirectory().getPath())).a();
    }

    private g0.f.d.a.b.c m(o9.e eVar, int i4, int i5) {
        return n(eVar, i4, i5, 0);
    }

    private g0.f.d.a.b.c n(o9.e eVar, int i4, int i5, int i6) {
        String str = eVar.f83754b;
        String str2 = eVar.f83753a;
        StackTraceElement[] stackTraceElementArr = eVar.f83755c;
        int i7 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        o9.e eVar2 = eVar.f83756d;
        if (i6 >= i5) {
            o9.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f83756d;
                i7++;
            }
        }
        g0.f.d.a.b.c.AbstractC0909a d5 = g0.f.d.a.b.c.a().f(str).e(str2).c(r(stackTraceElementArr, i4)).d(i7);
        if (eVar2 != null && i7 == 0) {
            d5.b(n(eVar2, i4, i5, i6 + 1));
        }
        return d5.a();
    }

    private g0.f.d.a.b o(g0.a aVar) {
        return g0.f.d.a.b.a().b(aVar).e(w()).c(i()).a();
    }

    private g0.f.d.a.b p(o9.e eVar, Thread thread, int i4, int i5, boolean z4) {
        return g0.f.d.a.b.a().f(z(eVar, thread, i4, z4)).d(n(eVar, i4, i5, 0)).e(w()).c(i()).a();
    }

    private g0.f.d.a.b.e.AbstractC0913b q(StackTraceElement stackTraceElement, g0.f.d.a.b.e.AbstractC0913b.AbstractC0914a abstractC0914a) {
        long j4 = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + ProtectedSandApp.s("ﯽ") + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j4 = stackTraceElement.getLineNumber();
        }
        return abstractC0914a.e(max).f(str).b(fileName).d(j4).a();
    }

    private List<g0.f.d.a.b.e.AbstractC0913b> r(StackTraceElement[] stackTraceElementArr, int i4) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(q(stackTraceElement, g0.f.d.a.b.e.AbstractC0913b.a().c(i4)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private g0.f.a s() {
        return g0.f.a.a().e(this.f58679b.f()).h(this.f58680c.f58622f).d(this.f58680c.f58623g).f(this.f58679b.a().c()).b(this.f58680c.f58624h.d()).c(this.f58680c.f58624h.e()).a();
    }

    private g0.f t(String str, long j4) {
        return g0.f.a().m(j4).j(str).h(f58673h).b(s()).l(v()).e(u()).i(3).a();
    }

    private g0.f.c u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int g4 = g();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b5 = i.b(this.f58678a);
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean x4 = i.x();
        int l4 = i.l();
        return g0.f.c.a().b(g4).f(Build.MODEL).c(availableProcessors).h(b5).d(blockCount).i(x4).j(l4).e(Build.MANUFACTURER).g(Build.PRODUCT).a();
    }

    private g0.f.e v() {
        return g0.f.e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(i.z()).a();
    }

    private g0.f.d.a.b.AbstractC0910d w() {
        g0.f.d.a.b.AbstractC0910d.AbstractC0911a a5 = g0.f.d.a.b.AbstractC0910d.a();
        String s4 = ProtectedSandApp.s("ﯵ");
        return a5.d(s4).c(s4).b(0L).a();
    }

    private g0.f.d.a.b.e x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    private g0.f.d.a.b.e y(Thread thread, StackTraceElement[] stackTraceElementArr, int i4) {
        return g0.f.d.a.b.e.a().d(thread.getName()).c(i4).b(r(stackTraceElementArr, i4)).a();
    }

    private List<g0.f.d.a.b.e> z(o9.e eVar, Thread thread, int i4, boolean z4) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, eVar.f83755c, i4));
        if (z4) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(y(key, this.f58681d.a(entry.getValue()), 0));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public g0.f.d c(g0.a aVar) {
        int i4 = this.f58678a.getResources().getConfiguration().orientation;
        return g0.f.d.a().g(ProtectedSandApp.s("ﯾ")).f(aVar.i()).b(j(i4, a(aVar))).c(l(i4)).a();
    }

    public g0.f.d d(Throwable th, Thread thread, String str, long j4, int i4, int i5, boolean z4) {
        int i6 = this.f58678a.getResources().getConfiguration().orientation;
        return g0.f.d.a().g(str).f(j4).b(k(i6, o9.e.a(th, this.f58681d), thread, i4, i5, z4)).c(l(i6)).a();
    }

    public com.google.firebase.crashlytics.internal.model.g0 e(String str, long j4) {
        return b().m(t(str, j4)).a();
    }
}
