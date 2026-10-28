package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import androidx.annotation.m1;
import androidx.annotation.x0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* compiled from: JobInfoScheduler.java */
@x0(api = 21)
/* loaded from: classes3.dex */
public class e implements y {

    /* renamed from: d, reason: collision with root package name */
    private static final String f12597d = ProtectedSandApp.s("₈");

    /* renamed from: e, reason: collision with root package name */
    static final String f12598e = ProtectedSandApp.s("₉");

    /* renamed from: f, reason: collision with root package name */
    static final String f12599f = ProtectedSandApp.s("₊");

    /* renamed from: g, reason: collision with root package name */
    static final String f12600g = ProtectedSandApp.s("₋");

    /* renamed from: h, reason: collision with root package name */
    static final String f12601h = ProtectedSandApp.s("₌");

    /* renamed from: a, reason: collision with root package name */
    private final Context f12602a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.persistence.d f12603b;

    /* renamed from: c, reason: collision with root package name */
    private final g f12604c;

    public e(Context context, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, g gVar) {
        this.f12602a = context;
        this.f12603b = dVar;
        this.f12604c = gVar;
    }

    private boolean d(JobScheduler jobScheduler, int i5, int i6) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i7 = jobInfo.getExtras().getInt(ProtectedSandApp.s("⁾"));
            if (jobInfo.getId() == i5) {
                return i7 >= i6;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.y
    public void a(com.google.android.datatransport.runtime.s sVar, int i5) {
        b(sVar, i5, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.y
    public void b(com.google.android.datatransport.runtime.s sVar, int i5, boolean z5) {
        ComponentName componentName = new ComponentName(this.f12602a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f12602a.getSystemService(ProtectedSandApp.s("ⁿ"));
        int c6 = c(sVar);
        String s5 = ProtectedSandApp.s("₀");
        if (!z5 && d(jobScheduler, c6, i5)) {
            j1.a.c(s5, ProtectedSandApp.s("₁"), sVar);
            return;
        }
        long W0 = this.f12603b.W0(sVar);
        JobInfo.Builder c7 = this.f12604c.c(new JobInfo.Builder(c6, componentName), sVar.d(), W0, i5);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt(ProtectedSandApp.s("₂"), i5);
        persistableBundle.putString(ProtectedSandApp.s("₃"), sVar.b());
        persistableBundle.putInt(ProtectedSandApp.s("₄"), m1.a.a(sVar.d()));
        if (sVar.c() != null) {
            persistableBundle.putString(ProtectedSandApp.s("₅"), Base64.encodeToString(sVar.c(), 0));
        }
        c7.setExtras(persistableBundle);
        j1.a.e(s5, ProtectedSandApp.s("₆"), sVar, Integer.valueOf(c6), Long.valueOf(this.f12604c.h(sVar.d(), W0, i5)), Long.valueOf(W0), Integer.valueOf(i5));
        jobScheduler.schedule(c7.build());
    }

    @m1
    int c(com.google.android.datatransport.runtime.s sVar) {
        Adler32 adler32 = new Adler32();
        String packageName = this.f12602a.getPackageName();
        String s5 = ProtectedSandApp.s("₇");
        adler32.update(packageName.getBytes(Charset.forName(s5)));
        adler32.update(sVar.b().getBytes(Charset.forName(s5)));
        adler32.update(ByteBuffer.allocate(4).putInt(m1.a.a(sVar.d())).array());
        if (sVar.c() != null) {
            adler32.update(sVar.c());
        }
        return (int) adler32.getValue();
    }
}
