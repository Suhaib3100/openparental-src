package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.f0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: CrashlyticsReportDataCapture.java */
/* loaded from: classes2.dex */
public class v {

    /* renamed from: g, reason: collision with root package name */
    private static final Map<String, Integer> f15731g;

    /* renamed from: h, reason: collision with root package name */
    static final String f15732h;

    /* renamed from: i, reason: collision with root package name */
    static final int f15733i = 3;

    /* renamed from: j, reason: collision with root package name */
    static final int f15734j = 4;

    /* renamed from: k, reason: collision with root package name */
    static final int f15735k = 3;

    /* renamed from: l, reason: collision with root package name */
    static final String f15736l = ProtectedSandApp.s("ᒓ");

    /* renamed from: a, reason: collision with root package name */
    private final Context f15737a;

    /* renamed from: b, reason: collision with root package name */
    private final d0 f15738b;

    /* renamed from: c, reason: collision with root package name */
    private final a f15739c;

    /* renamed from: d, reason: collision with root package name */
    private final e2.d f15740d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.settings.j f15741e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.j f15742f = com.google.firebase.crashlytics.internal.j.f15788a;

    static {
        HashMap hashMap = new HashMap();
        f15731g = hashMap;
        hashMap.put(ProtectedSandApp.s("ᒔ"), 5);
        hashMap.put(ProtectedSandApp.s("ᒕ"), 6);
        hashMap.put(ProtectedSandApp.s("ᒖ"), 9);
        hashMap.put(ProtectedSandApp.s("ᒗ"), 0);
        hashMap.put(ProtectedSandApp.s("ᒘ"), 1);
        f15732h = String.format(Locale.US, ProtectedSandApp.s("ᒚ"), ProtectedSandApp.s("ᒙ"));
    }

    public v(Context context, d0 d0Var, a aVar, e2.d dVar, com.google.firebase.crashlytics.internal.settings.j jVar) {
        this.f15737a = context;
        this.f15738b = d0Var;
        this.f15739c = aVar;
        this.f15740d = dVar;
        this.f15741e = jVar;
    }

    private f0.f.d.a.c A(f0.a aVar) {
        return this.f15742f.c(aVar.e(), aVar.d(), aVar.c());
    }

    private f0.a a(f0.a aVar) {
        List<f0.a.AbstractC0198a> list;
        if (!this.f15741e.b().f16369b.f16378c || this.f15739c.f15543c.size() <= 0) {
            list = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (f fVar : this.f15739c.f15543c) {
                arrayList.add(f0.a.AbstractC0198a.a().d(fVar.c()).b(fVar.a()).c(fVar.b()).a());
            }
            list = Collections.unmodifiableList(arrayList);
        }
        return f0.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(list).a();
    }

    private f0.c b() {
        return com.google.firebase.crashlytics.internal.model.f0.b().k(ProtectedSandApp.s("ᒛ")).g(this.f15739c.f15541a).h(this.f15738b.a().c()).f(this.f15738b.a().d()).d(this.f15739c.f15546f).e(this.f15739c.f15547g).j(4);
    }

    private static long f(long j5) {
        if (j5 > 0) {
            return j5;
        }
        return 0L;
    }

    private static int g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f15731g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private f0.f.d.a.b.AbstractC0203a h() {
        return f0.f.d.a.b.AbstractC0203a.a().b(0L).d(0L).c(this.f15739c.f15545e).e(this.f15739c.f15542b).a();
    }

    private List<f0.f.d.a.b.AbstractC0203a> i() {
        return Collections.singletonList(h());
    }

    private f0.f.d.a j(int i5, f0.a aVar) {
        return f0.f.d.a.a().c(Boolean.valueOf(aVar.c() != 100)).d(A(aVar)).h(i5).f(o(aVar)).a();
    }

    private f0.f.d.a k(int i5, e2.e eVar, Thread thread, int i6, int i7, boolean z5) {
        Boolean bool;
        f0.f.d.a.c g5 = this.f15742f.g(this.f15737a);
        if (g5.b() > 0) {
            bool = Boolean.valueOf(g5.b() != 100);
        } else {
            bool = null;
        }
        return f0.f.d.a.a().c(bool).d(g5).b(this.f15742f.f(this.f15737a)).h(i5).f(p(eVar, thread, i6, i7, z5)).a();
    }

    private f0.f.d.c l(int i5) {
        e a6 = e.a(this.f15737a);
        Float b6 = a6.b();
        Double valueOf = b6 != null ? Double.valueOf(b6.doubleValue()) : null;
        int c6 = a6.c();
        boolean o5 = i.o(this.f15737a);
        return f0.f.d.c.a().b(valueOf).c(c6).f(o5).e(i5).g(f(i.b(this.f15737a) - i.a(this.f15737a))).d(i.c(Environment.getDataDirectory().getPath())).a();
    }

    private f0.f.d.a.b.c m(e2.e eVar, int i5, int i6) {
        return n(eVar, i5, i6, 0);
    }

    private f0.f.d.a.b.c n(e2.e eVar, int i5, int i6, int i7) {
        String str = eVar.f22542b;
        String str2 = eVar.f22541a;
        StackTraceElement[] stackTraceElementArr = eVar.f22543c;
        int i8 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        e2.e eVar2 = eVar.f22544d;
        if (i7 >= i6) {
            e2.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f22544d;
                i8++;
            }
        }
        f0.f.d.a.b.c.AbstractC0206a d6 = f0.f.d.a.b.c.a().f(str).e(str2).c(r(stackTraceElementArr, i5)).d(i8);
        if (eVar2 != null && i8 == 0) {
            d6.b(n(eVar2, i5, i6, i7 + 1));
        }
        return d6.a();
    }

    private f0.f.d.a.b o(f0.a aVar) {
        return f0.f.d.a.b.a().b(aVar).e(w()).c(i()).a();
    }

    private f0.f.d.a.b p(e2.e eVar, Thread thread, int i5, int i6, boolean z5) {
        return f0.f.d.a.b.a().f(z(eVar, thread, i5, z5)).d(n(eVar, i5, i6, 0)).e(w()).c(i()).a();
    }

    private f0.f.d.a.b.e.AbstractC0210b q(StackTraceElement stackTraceElement, f0.f.d.a.b.e.AbstractC0210b.AbstractC0211a abstractC0211a) {
        long j5 = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + ProtectedSandApp.s("ᒜ") + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j5 = stackTraceElement.getLineNumber();
        }
        return abstractC0211a.e(max).f(str).b(fileName).d(j5).a();
    }

    private List<f0.f.d.a.b.e.AbstractC0210b> r(StackTraceElement[] stackTraceElementArr, int i5) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(q(stackTraceElement, f0.f.d.a.b.e.AbstractC0210b.a().c(i5)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private f0.f.a s() {
        return f0.f.a.a().e(this.f15738b.f()).h(this.f15739c.f15546f).d(this.f15739c.f15547g).f(this.f15738b.a().c()).b(this.f15739c.f15548h.d()).c(this.f15739c.f15548h.e()).a();
    }

    private f0.f t(String str, long j5) {
        return f0.f.a().m(j5).j(str).h(f15732h).b(s()).l(v()).e(u()).i(3).a();
    }

    private f0.f.c u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int g5 = g();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b6 = i.b(this.f15737a);
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean x5 = i.x();
        int l5 = i.l();
        return f0.f.c.a().b(g5).f(Build.MODEL).c(availableProcessors).h(b6).d(blockCount).i(x5).j(l5).e(Build.MANUFACTURER).g(Build.PRODUCT).a();
    }

    private f0.f.e v() {
        return f0.f.e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(i.z()).a();
    }

    private f0.f.d.a.b.AbstractC0207d w() {
        f0.f.d.a.b.AbstractC0207d.AbstractC0208a a6 = f0.f.d.a.b.AbstractC0207d.a();
        String s5 = ProtectedSandApp.s("ᒝ");
        return a6.d(s5).c(s5).b(0L).a();
    }

    private f0.f.d.a.b.e x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    private f0.f.d.a.b.e y(Thread thread, StackTraceElement[] stackTraceElementArr, int i5) {
        return f0.f.d.a.b.e.a().d(thread.getName()).c(i5).b(r(stackTraceElementArr, i5)).a();
    }

    private List<f0.f.d.a.b.e> z(e2.e eVar, Thread thread, int i5, boolean z5) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, eVar.f22543c, i5));
        if (z5) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(y(key, this.f15740d.a(entry.getValue()), 0));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public f0.f.d c(f0.a aVar) {
        int i5 = this.f15737a.getResources().getConfiguration().orientation;
        return f0.f.d.a().g(ProtectedSandApp.s("ᒞ")).f(aVar.i()).b(j(i5, a(aVar))).c(l(i5)).a();
    }

    public f0.f.d d(Throwable th, Thread thread, String str, long j5, int i5, int i6, boolean z5) {
        int i7 = this.f15737a.getResources().getConfiguration().orientation;
        return f0.f.d.a().g(str).f(j5).b(k(i7, e2.e.a(th, this.f15740d), thread, i5, i6, z5)).c(l(i7)).a();
    }

    public com.google.firebase.crashlytics.internal.model.f0 e(String str, long j5) {
        return b().l(t(str, j5)).a();
    }
}
