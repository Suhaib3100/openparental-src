package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.work.WorkerParameters;
import androidx.work.impl.j;
import androidx.work.s;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@c1({c1.a.LIBRARY_GROUP})
@x0(23)
/* loaded from: classes3.dex */
public class SystemJobService extends JobService implements androidx.work.impl.b {

    /* renamed from: d, reason: collision with root package name */
    private static final String f36097d = s.f("SystemJobService");

    /* renamed from: b, reason: collision with root package name */
    private j f36098b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, JobParameters> f36099c = new HashMap();

    @q0
    private static String a(@o0 JobParameters parameters) {
        try {
            PersistableBundle extras = parameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // androidx.work.impl.b
    public void e(@o0 String workSpecId, boolean needsReschedule) {
        JobParameters remove;
        s.c().a(f36097d, String.format("%s executed on JobScheduler", workSpecId), new Throwable[0]);
        synchronized (this.f36099c) {
            remove = this.f36099c.remove(workSpecId);
        }
        if (remove != null) {
            jobFinished(remove, needsReschedule);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            j H = j.H(getApplicationContext());
            this.f36098b = H;
            H.J().c(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            s.c().h(f36097d, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        j jVar = this.f36098b;
        if (jVar != null) {
            jVar.J().j(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@o0 JobParameters params) {
        Network network;
        if (this.f36098b == null) {
            s.c().a(f36097d, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(params, true);
            return false;
        }
        String a5 = a(params);
        if (TextUtils.isEmpty(a5)) {
            s.c().b(f36097d, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f36099c) {
            try {
                if (this.f36099c.containsKey(a5)) {
                    s.c().a(f36097d, String.format("Job is already being executed by SystemJobService: %s", a5), new Throwable[0]);
                    return false;
                }
                s.c().a(f36097d, String.format("onStartJob for %s", a5), new Throwable[0]);
                this.f36099c.put(a5, params);
                int i4 = Build.VERSION.SDK_INT;
                WorkerParameters.a aVar = new WorkerParameters.a();
                if (params.getTriggeredContentUris() != null) {
                    aVar.f35915b = Arrays.asList(params.getTriggeredContentUris());
                }
                if (params.getTriggeredContentAuthorities() != null) {
                    aVar.f35914a = Arrays.asList(params.getTriggeredContentAuthorities());
                }
                if (i4 >= 28) {
                    network = params.getNetwork();
                    aVar.f35916c = network;
                }
                this.f36098b.V(a5, aVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@o0 JobParameters params) {
        if (this.f36098b == null) {
            s.c().a(f36097d, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String a5 = a(params);
        if (TextUtils.isEmpty(a5)) {
            s.c().b(f36097d, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        s.c().a(f36097d, String.format("onStopJob for %s", a5), new Throwable[0]);
        synchronized (this.f36099c) {
            this.f36099c.remove(a5);
        }
        this.f36098b.X(a5);
        return !this.f36098b.J().g(a5);
    }
}
