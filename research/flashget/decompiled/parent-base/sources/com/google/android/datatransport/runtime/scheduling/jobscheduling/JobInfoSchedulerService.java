package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.x0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.datatransport.runtime.s;

@x0(api = 21)
/* loaded from: classes5.dex */
public class JobInfoSchedulerService extends JobService {
    private /* synthetic */ void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString(ProtectedSandApp.s("예"));
        String string2 = jobParameters.getExtras().getString(ProtectedSandApp.s("옉"));
        int i4 = jobParameters.getExtras().getInt(ProtectedSandApp.s("옊"));
        int i5 = jobParameters.getExtras().getInt(ProtectedSandApp.s("옋"));
        com.google.android.datatransport.runtime.x.f(getApplicationContext());
        s.a d5 = com.google.android.datatransport.runtime.s.a().b(string).d(q8.a.b(i4));
        if (string2 != null) {
            d5.c(Base64.decode(string2, 0));
        }
        com.google.android.datatransport.runtime.x.c().e().v(d5.a(), i5, new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.f
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
