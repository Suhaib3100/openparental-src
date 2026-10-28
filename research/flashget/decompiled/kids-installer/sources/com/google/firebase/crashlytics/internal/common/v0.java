package com.google.firebase.crashlytics.internal.common;

import android.app.ApplicationExitInfo;
import android.content.Context;
import androidx.annotation.m1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.model.f0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

/* compiled from: SessionReportingCoordinator.java */
/* loaded from: classes3.dex */
public class v0 implements u {

    /* renamed from: g, reason: collision with root package name */
    private static final String f15743g = ProtectedSandApp.s("⠸");

    /* renamed from: h, reason: collision with root package name */
    private static final String f15744h = ProtectedSandApp.s("⠹");

    /* renamed from: i, reason: collision with root package name */
    private static final int f15745i = 4;

    /* renamed from: j, reason: collision with root package name */
    private static final int f15746j = 8;

    /* renamed from: k, reason: collision with root package name */
    private static final int f15747k = 8192;

    /* renamed from: a, reason: collision with root package name */
    private final v f15748a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.e f15749b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.send.b f15750c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.metadata.e f15751d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.metadata.n f15752e;

    /* renamed from: f, reason: collision with root package name */
    private final d0 f15753f;

    v0(v vVar, com.google.firebase.crashlytics.internal.persistence.e eVar, com.google.firebase.crashlytics.internal.send.b bVar, com.google.firebase.crashlytics.internal.metadata.e eVar2, com.google.firebase.crashlytics.internal.metadata.n nVar, d0 d0Var) {
        this.f15748a = vVar;
        this.f15749b = eVar;
        this.f15750c = bVar;
        this.f15751d = eVar2;
        this.f15752e = nVar;
        this.f15753f = d0Var;
    }

    private f0.f.d g(f0.f.d dVar) {
        return h(dVar, this.f15751d, this.f15752e);
    }

    private f0.f.d h(f0.f.d dVar, com.google.firebase.crashlytics.internal.metadata.e eVar, com.google.firebase.crashlytics.internal.metadata.n nVar) {
        f0.f.d.b h5 = dVar.h();
        String c6 = eVar.c();
        if (c6 != null) {
            h5.d(f0.f.d.AbstractC0213d.a().b(c6).a());
        } else {
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("⠩"));
        }
        List<f0.d> r5 = r(nVar.f());
        List<f0.d> r6 = r(nVar.g());
        if (!r5.isEmpty() || !r6.isEmpty()) {
            h5.b(dVar.b().i().e(r5).g(r6).a());
        }
        return h5.a();
    }

    private f0.f.d i(f0.f.d dVar) {
        return j(h(dVar, this.f15751d, this.f15752e), this.f15752e);
    }

    private f0.f.d j(f0.f.d dVar, com.google.firebase.crashlytics.internal.metadata.n nVar) {
        List<f0.f.d.e> h5 = nVar.h();
        if (h5.isEmpty()) {
            return dVar;
        }
        f0.f.d.b h6 = dVar.h();
        h6.e(f0.f.d.AbstractC0214f.a().b(h5).a());
        return h6.a();
    }

    @androidx.annotation.x0(api = 30)
    private static f0.a k(ApplicationExitInfo applicationExitInfo) {
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
                str = l(traceInputStream);
            }
        } catch (IOException e6) {
            com.google.firebase.crashlytics.internal.g f6 = com.google.firebase.crashlytics.internal.g.f();
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("⠪"));
            applicationExitInfo2 = applicationExitInfo.toString();
            sb.append(applicationExitInfo2);
            sb.append(ProtectedSandApp.s("⠫"));
            sb.append(e6);
            f6.m(sb.toString());
        }
        f0.a.b a6 = f0.a.a();
        importance = applicationExitInfo.getImportance();
        f0.a.b c6 = a6.c(importance);
        processName = applicationExitInfo.getProcessName();
        f0.a.b e7 = c6.e(processName);
        reason = applicationExitInfo.getReason();
        f0.a.b g5 = e7.g(reason);
        timestamp = applicationExitInfo.getTimestamp();
        f0.a.b i5 = g5.i(timestamp);
        pid = applicationExitInfo.getPid();
        f0.a.b d6 = i5.d(pid);
        pss = applicationExitInfo.getPss();
        f0.a.b f7 = d6.f(pss);
        rss = applicationExitInfo.getRss();
        return f7.h(rss).j(str).a();
    }

    @m1
    @androidx.annotation.x0(api = 19)
    public static String l(InputStream inputStream) throws IOException {
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

    public static v0 m(Context context, d0 d0Var, com.google.firebase.crashlytics.internal.persistence.f fVar, a aVar, com.google.firebase.crashlytics.internal.metadata.e eVar, com.google.firebase.crashlytics.internal.metadata.n nVar, e2.d dVar, com.google.firebase.crashlytics.internal.settings.j jVar, i0 i0Var, m mVar) {
        return new v0(new v(context, d0Var, aVar, dVar, jVar), new com.google.firebase.crashlytics.internal.persistence.e(fVar, jVar, mVar), com.google.firebase.crashlytics.internal.send.b.b(context, jVar, i0Var), eVar, nVar, d0Var);
    }

    private w n(w wVar) {
        if (wVar.b().g() != null) {
            return wVar;
        }
        return new b(wVar.b().s(this.f15753f.d()), wVar.d(), wVar.c());
    }

    @androidx.annotation.q0
    @androidx.annotation.x0(api = 30)
    private ApplicationExitInfo q(String str, List<ApplicationExitInfo> list) {
        long timestamp;
        int reason;
        long q5 = this.f15749b.q(str);
        for (ApplicationExitInfo applicationExitInfo : list) {
            timestamp = applicationExitInfo.getTimestamp();
            if (timestamp < q5) {
                return null;
            }
            reason = applicationExitInfo.getReason();
            if (reason == 6) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    @androidx.annotation.o0
    private static List<f0.d> r(@androidx.annotation.o0 Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(f0.d.a().b(entry.getKey()).c(entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.google.firebase.crashlytics.internal.common.u0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int t5;
                t5 = v0.t((f0.d) obj, (f0.d) obj2);
                return t5;
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int t(f0.d dVar, f0.d dVar2) {
        return dVar.b().compareTo(dVar2.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean v(@androidx.annotation.o0 Task<w> task) {
        if (!task.isSuccessful()) {
            com.google.firebase.crashlytics.internal.g.f().n(ProtectedSandApp.s("⠯"), task.getException());
            return false;
        }
        w result = task.getResult();
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("⠬") + result.d());
        File c6 = result.c();
        if (c6.delete()) {
            com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("⠭") + c6.getPath());
            return true;
        }
        com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("⠮") + c6.getPath());
        return true;
    }

    private void w(@androidx.annotation.o0 Throwable th, @androidx.annotation.o0 Thread thread, @androidx.annotation.o0 String str, @androidx.annotation.o0 String str2, long j5, boolean z5) {
        this.f15749b.z(i(this.f15748a.d(th, thread, str2, j5, 4, 8, z5)), str, str2.equals(ProtectedSandApp.s("⠰")));
    }

    public void A() {
        this.f15749b.i();
    }

    public Task<Void> B(@androidx.annotation.o0 Executor executor) {
        return C(executor, null);
    }

    public Task<Void> C(@androidx.annotation.o0 Executor executor, @androidx.annotation.q0 String str) {
        List<w> w5 = this.f15749b.w();
        ArrayList arrayList = new ArrayList();
        for (w wVar : w5) {
            if (str == null || str.equals(wVar.d())) {
                arrayList.add(this.f15750c.c(n(wVar), str != null).continueWith(executor, new Continuation() { // from class: com.google.firebase.crashlytics.internal.common.t0
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        boolean v5;
                        v5 = v0.this.v(task);
                        return Boolean.valueOf(v5);
                    }
                }));
            }
        }
        return Tasks.whenAll(arrayList);
    }

    @Override // com.google.firebase.crashlytics.internal.common.u
    public void a(String str, String str2) {
        this.f15752e.o(str, str2);
    }

    @Override // com.google.firebase.crashlytics.internal.common.u
    public void b(@androidx.annotation.o0 String str, long j5) {
        this.f15749b.A(this.f15748a.e(str, j5));
    }

    @Override // com.google.firebase.crashlytics.internal.common.u
    public void c(long j5, String str) {
        this.f15751d.g(j5, str);
    }

    @Override // com.google.firebase.crashlytics.internal.common.u
    public void d(String str) {
        this.f15752e.s(str);
    }

    public void o(@androidx.annotation.o0 String str, @androidx.annotation.o0 List<g0> list, f0.a aVar) {
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("⠱"));
        ArrayList arrayList = new ArrayList();
        Iterator<g0> it = list.iterator();
        while (it.hasNext()) {
            f0.e.b c6 = it.next().c();
            if (c6 != null) {
                arrayList.add(c6);
            }
        }
        this.f15749b.l(str, f0.e.a().b(Collections.unmodifiableList(arrayList)).a(), aVar);
    }

    public void p(long j5, @androidx.annotation.q0 String str) {
        this.f15749b.k(str, j5);
    }

    public boolean s() {
        return this.f15749b.r();
    }

    public SortedSet<String> u() {
        return this.f15749b.p();
    }

    public void x(@androidx.annotation.o0 Throwable th, @androidx.annotation.o0 Thread thread, @androidx.annotation.o0 String str, long j5) {
        com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("⠲") + str);
        w(th, thread, str, ProtectedSandApp.s("⠳"), j5, true);
    }

    public void y(@androidx.annotation.o0 Throwable th, @androidx.annotation.o0 Thread thread, @androidx.annotation.o0 String str, long j5) {
        com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("⠴") + str);
        w(th, thread, str, ProtectedSandApp.s("⠵"), j5, false);
    }

    @androidx.annotation.x0(api = 30)
    public void z(String str, List<ApplicationExitInfo> list, com.google.firebase.crashlytics.internal.metadata.e eVar, com.google.firebase.crashlytics.internal.metadata.n nVar) {
        ApplicationExitInfo q5 = q(str, list);
        if (q5 == null) {
            com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("⠶") + str);
            return;
        }
        f0.f.d c6 = this.f15748a.c(k(q5));
        com.google.firebase.crashlytics.internal.g.f().b(ProtectedSandApp.s("⠷") + str);
        this.f15749b.z(j(h(c6, eVar, nVar), nVar), str, true);
    }
}
