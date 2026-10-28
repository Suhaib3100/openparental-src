package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.x0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.datatransport.runtime.s;

@x0(api = 21)
/* loaded from: classes2.dex */
public class JobInfoSchedulerService extends JobService {
    private /* synthetic */ void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString(ProtectedSandApp.s("ु"));
        String string2 = jobParameters.getExtras().getString(ProtectedSandApp.s("ू"));
        int i5 = jobParameters.getExtras().getInt(ProtectedSandApp.s("ृ"));
        int i6 = jobParameters.getExtras().getInt(ProtectedSandApp.s("ॄ"));
        com.google.android.datatransport.runtime.x.f(getApplicationContext());
        s.a d6 = com.google.android.datatransport.runtime.s.a().b(string).d(m1.a.b(i5));
        if (string2 != null) {
            d6.c(Base64.decode(string2, 0));
        }
        com.google.android.datatransport.runtime.x.c().e().v(d6.a(), i6, new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.f
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.jobFinished(jobParameters, false);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
