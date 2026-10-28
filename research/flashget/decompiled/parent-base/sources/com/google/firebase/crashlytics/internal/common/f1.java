package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import androidx.annotation.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.model.g0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

/* compiled from: SessionReportingCoordinator.java */
/* loaded from: classes6.dex */
public class f1 {

    /* renamed from: h, reason: collision with root package name */
    private static final String f58688h = ProtectedSandApp.s("ﰌ");

    /* renamed from: i, reason: collision with root package name */
    private static final String f58689i = ProtectedSandApp.s("ﰐ");

    /* renamed from: j, reason: collision with root package name */
    private static final int f58690j = 4;

    /* renamed from: k, reason: collision with root package name */
    private static final int f58691k = 8;

    /* renamed from: l, reason: collision with root package name */
    private static final int f58692l = 8192;

    /* renamed from: a, reason: collision with root package name */
    private final e0 f58693a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.e f58694b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.send.b f58695c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.metadata.e f58696d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.metadata.o f58697e;

    /* renamed from: f, reason: collision with root package name */
    private final n0 f58698f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.concurrency.k f58699g;

    f1(e0 e0Var, com.google.firebase.crashlytics.internal.persistence.e eVar, com.google.firebase.crashlytics.internal.send.b bVar, com.google.firebase.crashlytics.internal.metadata.e eVar2, com.google.firebase.crashlytics.internal.metadata.o oVar, n0 n0Var, com.google.firebase.crashlytics.internal.concurrency.k kVar) {
        this.f58693a = e0Var;
        this.f58694b = eVar;
        this.f58695c = bVar;
        this.f58696d = eVar2;
        this.f58697e = oVar;
        this.f58698f = n0Var;
        this.f58699g = kVar;
    }

    private g0.f.d d(g0.f.d dVar) {
        return e(dVar, this.f58696d, this.f58697e);
    }

    private g0.f.d e(g0.f.d dVar, com.google.firebase.crashlytics.internal.metadata.e eVar, com.google.firebase.crashlytics.internal.metadata.o oVar) {
        g0.f.d.b h4 = dVar.h();
        String c5 = eVar.c();
        if (c5 != null) {
            h4.d(g0.f.d.AbstractC0916d.a().b(c5).a());
        } else {
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﰄ"));
        }
        List<g0.d> o4 = o(oVar.g());
        List<g0.d> o5 = o(oVar.h());
        if (!o4.isEmpty() || !o5.isEmpty()) {
            h4.b(dVar.b().i().e(o4).g(o5).a());
        }
        return h4.a();
    }

    private g0.f.d f(g0.f.d dVar) {
        return g(e(dVar, this.f58696d, this.f58697e), this.f58697e);
    }

    private g0.f.d g(g0.f.d dVar, com.google.firebase.crashlytics.internal.metadata.o oVar) {
        List<g0.f.d.e> i4 = oVar.i();
        if (i4.isEmpty()) {
            return dVar;
        }
        g0.f.d.b h4 = dVar.h();
        h4.e(g0.f.d.AbstractC0917f.a().b(i4).a());
        return h4.a();
    }

    @androidx.annotation.x0(api = 30)
    private static g0.a h(ApplicationExitInfo applicationExitInfo) {
        String applicationExitInfo2;
        int importance;
        String processName;
        int reason;
        long timestamp;
        int pid;
        long pss;
        long rss;
        InputStream traceInputStream;
        String str = null;
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = i(traceInputStream);
            }
        } catch (IOException e4) {
            com.google.firebase.crashlytics.internal.g f4 = com.google.firebase.crashlytics.internal.g.f();
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ﰅ"));
            applicationExitInfo2 = applicationExitInfo.toString();
            sb.append(applicationExitInfo2);
            sb.append(ProtectedSandApp.s("ﰆ"));
            sb.append(e4);
            f4.m(sb.toString());
        }
        g0.a.b a5 = g0.a.a();
        importance = applicationExitInfo.getImportance();
        g0.a.b c5 = a5.c(importance);
        processName = applicationExitInfo.getProcessName();
        g0.a.b e5 = c5.e(processName);
        reason = applicationExitInfo.getReason();
        g0.a.b g4 = e5.g(reason);
        timestamp = applicationExitInfo.getTimestamp();
        g0.a.b i4 = g4.i(timestamp);
        pid = applicationExitInfo.getPid();
        g0.a.b d5 = i4.d(pid);
        pss = applicationExitInfo.getPss();
        g0.a.b f5 = d5.f(pss);
        rss = applicationExitInfo.getRss();
        return f5.h(rss).j(str).a();
    }

    @m1
    @androidx.annotation.x0(api = 19)
    public static String i(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static f1 j(Context context, n0 n0Var, com.google.firebase.crashlytics.internal.persistence.g gVar, a aVar, com.google.firebase.crashlytics.internal.metadata.e eVar, com.google.firebase.crashlytics.internal.metadata.o oVar, o9.d dVar, com.google.firebase.crashlytics.internal.settings.k kVar, s0 s0Var, m mVar, com.google.firebase.crashlytics.internal.concurrency.k kVar2) {
        return new f1(new e0(context, n0Var, aVar, dVar, kVar), new com.google.firebase.crashlytics.internal.persistence.e(gVar, kVar, mVar), com.google.firebase.crashlytics.internal.send.b.b(context, kVar, s0Var), eVar, oVar, n0Var, kVar2);
    }

    private f0 k(f0 f0Var) {
        if (f0Var.b().h() != null && f0Var.b().g() != null) {
            return f0Var;
        }
        m0 d5 = this.f58698f.d(true);
        return new b(f0Var.b().u(d5.f()).t(d5.e()), f0Var.d(), f0Var.c());
    }

    @androidx.annotation.q0
    @androidx.annotation.x0(api = 30)
    private ApplicationExitInfo n(String str, List<ApplicationExitInfo> list) {
        long timestamp;
        int reason;
        long q4 = this.f58694b.q(str);
        Iterator<ApplicationExitInfo> it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo a5 = androidx.work.impl.utils.d.a(it.next());
            timestamp = a5.getTimestamp();
            if (timestamp < q4) {
                return null;
            }
            reason = a5.getReason();
            if (reason == 6) {
                return a5;
            }
        }
        return null;
    }

    @androidx.annotation.o0
    private static List<g0.d> o(@androidx.annotation.o0 Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(g0.d.a().b(entry.getKey()).c(entry.getValue()).a());
        }
        Collections.sort(arrayList, new d1());
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int q(g0.d dVar, g0.d dVar2) {
        return dVar.b().compareTo(dVar2.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r(g0.f.d dVar, String str, boolean z4) {
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﰇ"));
        this.f58694b.z(dVar, str, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean u(@androidx.annotation.o0 Task<f0> task) {
        if (!task.isSuccessful()) {
            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("ﰋ"), task.getException());
            return false;
        }
        f0 result = task.getResult();
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﰈ") + result.d());
        File c5 = result.c();
        if (c5.delete()) {
            com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﰉ") + c5.getPath());
            return true;
        }
        com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("ﰊ") + c5.getPath());
        return true;
    }

    private void v(@androidx.annotation.o0 Throwable th, @androidx.annotation.o0 Thread thread, @androidx.annotation.o0 final String str, @androidx.annotation.o0 String str2, long j4, boolean z4) {
        final boolean equals = str2.equals(ProtectedSandApp.s("ﰌ"));
        final g0.f.d f4 = f(this.f58693a.d(th, thread, str2, j4, 4, 8, z4));
        if (z4) {
            this.f58694b.z(f4, str, equals);
        } else {
            this.f58699g.diskWrite.q(new Runnable() { // from class: com.google.firebase.crashlytics.internal.common.c1
                @Override // java.lang.Runnable
                public final void run() {
                    f1.this.r(f4, str, equals);
                }
            });
        }
    }

    public Task<Void> A(@androidx.annotation.o0 Executor executor) {
        return B(executor, null);
    }

    public Task<Void> B(@androidx.annotation.o0 Executor executor, @androidx.annotation.q0 String str) {
        List<f0> w4 = this.f58694b.w();
        ArrayList arrayList = new ArrayList();
        for (f0 f0Var : w4) {
            if (str == null || str.equals(f0Var.d())) {
                arrayList.add(this.f58695c.c(k(f0Var), str != null).continueWith(executor, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.e1
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        boolean u4;
                        u4 = f1.this.u(task);
                        return Boolean.valueOf(u4);
                    }
                }));
            }
        }
        return Tasks.whenAll(arrayList);
    }

    public void l(@androidx.annotation.o0 String str, @androidx.annotation.o0 List<q0> list, g0.a aVar) {
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﰍ"));
        ArrayList arrayList = new ArrayList();
        Iterator<q0> it = list.iterator();
        while (it.hasNext()) {
            g0.e.b a5 = it.next().a();
            if (a5 != null) {
                arrayList.add(a5);
            }
        }
        this.f58694b.l(str, g0.e.a().b(Collections.unmodifiableList(arrayList)).a(), aVar);
    }

    public void m(long j4, @androidx.annotation.q0 String str) {
        this.f58694b.k(str, j4);
    }

    public boolean p() {
        return this.f58694b.r();
    }

    public SortedSet<String> s() {
        return this.f58694b.p();
    }

    public void t(@androidx.annotation.o0 String str, long j4) {
        this.f58694b.A(this.f58693a.e(str, j4));
    }

    public void w(@androidx.annotation.o0 Throwable th, @androidx.annotation.o0 Thread thread, @androidx.annotation.o0 String str, long j4) {
        com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﰎ") + str);
        v(th, thread, str, ProtectedSandApp.s("ﰌ"), j4, true);
    }

    public void x(@androidx.annotation.o0 Throwable th, @androidx.annotation.o0 Thread thread, @androidx.annotation.o0 String str, long j4) {
        com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﰏ") + str);
        v(th, thread, str, ProtectedSandApp.s("ﰐ"), j4, false);
    }

    @androidx.annotation.x0(api = 30)
    public void y(String str, List<ApplicationExitInfo> list, com.google.firebase.crashlytics.internal.metadata.e eVar, com.google.firebase.crashlytics.internal.metadata.o oVar) {
        ApplicationExitInfo n4 = n(str, list);
        if (n4 == null) {
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("ﰑ") + str);
            return;
        }
        g0.f.d c5 = this.f58693a.c(h(n4));
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("ﰒ") + str);
        this.f58694b.z(g(e(c5, eVar, oVar), oVar), str, true);
    }

    public void z() {
        this.f58694b.i();
    }
}
