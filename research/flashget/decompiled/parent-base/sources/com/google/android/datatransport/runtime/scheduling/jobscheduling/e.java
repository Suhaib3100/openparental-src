package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import androidx.annotation.m1;
import androidx.annotation.x0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* compiled from: JobInfoScheduler.java */
@x0(api = 21)
/* loaded from: classes5.dex */
public class e implements y {

    /* renamed from: d, reason: collision with root package name */
    private static final String f52127d = ProtectedSandApp.s("오");

    /* renamed from: e, reason: collision with root package name */
    static final String f52128e = ProtectedSandApp.s("옢");

    /* renamed from: f, reason: collision with root package name */
    static final String f52129f = ProtectedSandApp.s("옦");

    /* renamed from: g, reason: collision with root package name */
    static final String f52130g = ProtectedSandApp.s("옧");

    /* renamed from: h, reason: collision with root package name */
    static final String f52131h = ProtectedSandApp.s("온");

    /* renamed from: a, reason: collision with root package name */
    private final Context f52132a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.datatransport.runtime.scheduling.persistence.d f52133b;

    /* renamed from: c, reason: collision with root package name */
    private final g f52134c;

    public e(Context context, com.google.android.datatransport.runtime.scheduling.persistence.d dVar, g gVar) {
        this.f52132a = context;
        this.f52133b = dVar;
        this.f52134c = gVar;
    }

    private boolean d(JobScheduler jobScheduler, int i4, int i5) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i6 = jobInfo.getExtras().getInt(ProtectedSandApp.s("옢"));
            if (jobInfo.getId() == i4) {
                return i6 >= i5;
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.y
    public void a(com.google.android.datatransport.runtime.s sVar, int i4) {
        b(sVar, i4, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.y
    public void b(com.google.android.datatransport.runtime.s sVar, int i4, boolean z4) {
        ComponentName componentName = new ComponentName(this.f52132a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f52132a.getSystemService(ProtectedSandApp.s("옣"));
        int c5 = c(sVar);
        String s4 = ProtectedSandApp.s("오");
        if (!z4 && d(jobScheduler, c5, i4)) {
            n8.a.c(s4, ProtectedSandApp.s("옥"), sVar);
            return;
        }
        long w12 = this.f52133b.w1(sVar);
        JobInfo.Builder c6 = this.f52134c.c(new JobInfo.Builder(c5, componentName), sVar.d(), w12, i4);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt(ProtectedSandApp.s("옢"), i4);
        persistableBundle.putString(ProtectedSandApp.s("옦"), sVar.b());
        persistableBundle.putInt(ProtectedSandApp.s("옧"), q8.a.a(sVar.d()));
        if (sVar.c() != null) {
            persistableBundle.putString(ProtectedSandApp.s("온"), Base64.encodeToString(sVar.c(), 0));
        }
        c6.setExtras(persistableBundle);
        n8.a.e(s4, ProtectedSandApp.s("옩"), sVar, Integer.valueOf(c5), Long.valueOf(this.f52134c.h(sVar.d(), w12, i4)), Long.valueOf(w12), Integer.valueOf(i4));
        jobScheduler.schedule(c6.build());
    }

    @m1
    int c(com.google.android.datatransport.runtime.s sVar) {
        Adler32 adler32 = new Adler32();
        String packageName = this.f52132a.getPackageName();
        String s4 = ProtectedSandApp.s("옪");
        adler32.update(packageName.getBytes(Charset.forName(s4)));
        adler32.update(sVar.b().getBytes(Charset.forName(s4)));
        adler32.update(ByteBuffer.allocate(4).putInt(q8.a.a(sVar.d())).array());
        if (sVar.c() != null) {
            adler32.update(sVar.c());
        }
        return (int) adler32.getValue();
    }
}
