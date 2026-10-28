package com.google.firebase.crashlytics.ndk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.crashlytics.internal.model.g0;
import com.google.firebase.crashlytics.internal.model.h0;
import com.google.firebase.crashlytics.ndk.k;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* compiled from: CrashpadController.java */
/* loaded from: classes6.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final Context f59572a;

    /* renamed from: b, reason: collision with root package name */
    private final i f59573b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.crashlytics.internal.persistence.g f59574c;

    /* renamed from: e, reason: collision with root package name */
    private static final String f59567e = ProtectedSandApp.s("\u0015\u0001");

    /* renamed from: f, reason: collision with root package name */
    private static final String f59568f = ProtectedSandApp.s("\u0016\u0001");

    /* renamed from: g, reason: collision with root package name */
    private static final String f59569g = ProtectedSandApp.s("\u0017\u0001");

    /* renamed from: h, reason: collision with root package name */
    private static final String f59570h = ProtectedSandApp.s("\u0018\u0001");

    /* renamed from: i, reason: collision with root package name */
    private static final String f59571i = ProtectedSandApp.s("\u0019\u0001");

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f59566d = Charset.forName(ProtectedSandApp.s("\u001a\u0001"));

    e(Context context, i iVar, com.google.firebase.crashlytics.internal.persistence.g gVar) {
        this.f59572a = context;
        this.f59573b = iVar;
        this.f59574c = gVar;
    }

    @x0(api = 31)
    private static g0.a a(ApplicationExitInfo applicationExitInfo) {
        int importance;
        String processName;
        int reason;
        long timestamp;
        int pid;
        long pss;
        long rss;
        g0.a.b a5 = g0.a.a();
        importance = applicationExitInfo.getImportance();
        g0.a.b c5 = a5.c(importance);
        processName = applicationExitInfo.getProcessName();
        g0.a.b e4 = c5.e(processName);
        reason = applicationExitInfo.getReason();
        g0.a.b g4 = e4.g(reason);
        timestamp = applicationExitInfo.getTimestamp();
        g0.a.b i4 = g4.i(timestamp);
        pid = applicationExitInfo.getPid();
        g0.a.b d5 = i4.d(pid);
        pss = applicationExitInfo.getPss();
        g0.a.b f4 = d5.f(pss);
        rss = applicationExitInfo.getRss();
        return f4.h(rss).j(i(applicationExitInfo)).a();
    }

    @m1
    @x0(api = 31)
    public static String b(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return r(byteArrayOutputStream.toByteArray());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    private g0.a c(String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return f(str);
        }
        return null;
    }

    private k.c e(String str, File file) {
        return new k.c(h(file, ProtectedSandApp.s("\u001b\u0001")), c(str));
    }

    @x0(api = 31)
    private g0.a f(String str) {
        List<ApplicationExitInfo> historicalProcessExitReasons;
        historicalProcessExitReasons = ((ActivityManager) this.f59572a.getSystemService(ProtectedSandApp.s("\u001c\u0001"))).getHistoricalProcessExitReasons(null, 0, 0);
        File r4 = this.f59574c.r(str, ProtectedSandApp.s("\u0015\u0001"));
        return g(r4 == null ? System.currentTimeMillis() : r4.lastModified(), historicalProcessExitReasons);
    }

    @x0(api = 31)
    private g0.a g(long j4, List<ApplicationExitInfo> list) {
        int reason;
        long timestamp;
        ArrayList arrayList = new ArrayList();
        Iterator<ApplicationExitInfo> it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo a5 = androidx.work.impl.utils.d.a(it.next());
            reason = a5.getReason();
            if (reason == 5) {
                timestamp = a5.getTimestamp();
                if (timestamp >= j4) {
                    arrayList.add(a5);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return a(androidx.work.impl.utils.d.a(arrayList.get(0)));
    }

    @q0
    private static File h(File file, String str) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return null;
        }
        for (File file2 : listFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    @x0(api = 31)
    private static String i(ApplicationExitInfo applicationExitInfo) {
        InputStream traceInputStream;
        try {
            traceInputStream = applicationExitInfo.getTraceInputStream();
            return b(traceInputStream);
        } catch (IOException unused) {
            com.google.firebase.crashlytics.internal.g.f().m(ProtectedSandApp.s("\u001d\u0001"));
            return null;
        }
    }

    private static void o(com.google.firebase.crashlytics.internal.persistence.g gVar, String str, String str2, String str3) {
        q(new File(gVar.l(str), str3), str2);
    }

    private static void q(File file, String str) {
        BufferedWriter bufferedWriter;
        String s4 = ProtectedSandApp.s("\u001e\u0001");
        BufferedWriter bufferedWriter2 = null;
        try {
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), f59566d));
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(str);
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter, s4 + file);
        } catch (IOException unused2) {
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter2, s4 + file);
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            com.google.firebase.crashlytics.internal.common.i.f(bufferedWriter2, s4 + file);
            throw th;
        }
    }

    @x0(api = 31)
    private static String r(byte[] bArr) throws IOException {
        Base64.Encoder encoder;
        String encodeToString;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                gZIPOutputStream.finish();
                encoder = Base64.getEncoder();
                encodeToString = encoder.encodeToString(byteArrayOutputStream.toByteArray());
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return encodeToString;
            } finally {
            }
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @o0
    public k d(String str) {
        File l4 = this.f59574c.l(str);
        File file = new File(l4, ProtectedSandApp.s("\u001f\u0001"));
        com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s(" \u0001") + file.getAbsolutePath());
        File h4 = h(file, ProtectedSandApp.s("\u001b\u0001"));
        com.google.firebase.crashlytics.internal.g.f().k(ProtectedSandApp.s("#\u0001").concat((h4 == null || !h4.exists()) ? ProtectedSandApp.s("\"\u0001") : ProtectedSandApp.s("!\u0001")));
        k.b bVar = new k.b();
        if (l4 != null && l4.exists() && file.exists()) {
            bVar.m(e(str, file)).l(h(l4, ProtectedSandApp.s("$\u0001"))).o(new File(l4, ProtectedSandApp.s("\u0016\u0001"))).h(new File(l4, ProtectedSandApp.s("\u0017\u0001"))).k(new File(l4, ProtectedSandApp.s("\u0018\u0001"))).n(new File(l4, ProtectedSandApp.s("\u0019\u0001")));
        }
        return bVar.j();
    }

    public boolean j(String str) {
        k.c cVar = d(str).f59585a;
        return cVar != null && cVar.a();
    }

    public boolean k(String str, String str2, long j4, h0 h0Var) {
        File l4 = this.f59574c.l(str);
        if (l4 == null) {
            return false;
        }
        try {
            if (!this.f59573b.a(l4.getCanonicalPath(), this.f59572a.getAssets())) {
                return false;
            }
            l(str, str2, j4);
            m(str, h0Var.a());
            p(str, h0Var.d());
            n(str, h0Var.c());
            return true;
        } catch (IOException e4) {
            com.google.firebase.crashlytics.internal.g.f().e(ProtectedSandApp.s("%\u0001"), e4);
            return false;
        }
    }

    public void l(String str, String str2, long j4) {
        o(this.f59574c, str, m.b(str, str2, j4), ProtectedSandApp.s("\u0016\u0001"));
    }

    public void m(String str, h0.a aVar) {
        o(this.f59574c, str, m.c(aVar.a(), aVar.f(), aVar.g(), aVar.e(), aVar.c(), aVar.d().d(), aVar.d().e()), ProtectedSandApp.s("\u0017\u0001"));
    }

    public void n(String str, h0.b bVar) {
        o(this.f59574c, str, m.d(bVar.a(), bVar.g(), bVar.b(), bVar.j(), bVar.d(), bVar.e(), bVar.i(), bVar.f(), bVar.h()), ProtectedSandApp.s("\u0018\u0001"));
    }

    public void p(String str, h0.c cVar) {
        o(this.f59574c, str, m.e(cVar.d(), cVar.c(), cVar.b()), ProtectedSandApp.s("\u0019\u0001"));
    }
}
