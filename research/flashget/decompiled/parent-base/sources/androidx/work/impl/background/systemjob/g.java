package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.work.f0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.j;
import androidx.work.impl.model.r;
import androidx.work.s;
import androidx.work.y;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: SystemJobScheduler.java */
@c1({c1.a.LIBRARY_GROUP})
@x0(23)
/* loaded from: classes3.dex */
public class g implements androidx.work.impl.e {

    /* renamed from: f, reason: collision with root package name */
    private static final String f36105f = s.f("SystemJobScheduler");

    /* renamed from: b, reason: collision with root package name */
    private final Context f36106b;

    /* renamed from: c, reason: collision with root package name */
    private final JobScheduler f36107c;

    /* renamed from: d, reason: collision with root package name */
    private final j f36108d;

    /* renamed from: e, reason: collision with root package name */
    private final f f36109e;

    public g(@o0 Context context, @o0 j workManager) {
        this(context, workManager, (JobScheduler) context.getSystemService("jobscheduler"), new f(context));
    }

    public static void b(@o0 Context context) {
        List<JobInfo> g4;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (g4 = g(context, jobScheduler)) == null || g4.isEmpty()) {
            return;
        }
        Iterator<JobInfo> it = g4.iterator();
        while (it.hasNext()) {
            e(jobScheduler, it.next().getId());
        }
    }

    private static void e(@o0 JobScheduler jobScheduler, int id2) {
        try {
            jobScheduler.cancel(id2);
        } catch (Throwable th) {
            s.c().b(f36105f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(id2)), th);
        }
    }

    @q0
    private static List<Integer> f(@o0 Context context, @o0 JobScheduler jobScheduler, @o0 String workSpecId) {
        List<JobInfo> g4 = g(context, jobScheduler);
        if (g4 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g4) {
            if (workSpecId.equals(h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    @q0
    private static List<JobInfo> g(@o0 Context context, @o0 JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            s.c().b(f36105f, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @q0
    private static String h(@o0 JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(@o0 Context context, @o0 j workManager) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g4 = g(context, jobScheduler);
        List<String> b5 = workManager.M().h().b();
        boolean z4 = false;
        HashSet hashSet = new HashSet(g4 != null ? g4.size() : 0);
        if (g4 != null && !g4.isEmpty()) {
            for (JobInfo jobInfo : g4) {
                String h4 = h(jobInfo);
                if (TextUtils.isEmpty(h4)) {
                    e(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(h4);
                }
            }
        }
        Iterator<String> it = b5.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains(it.next())) {
                s.c().a(f36105f, "Reconciling jobs", new Throwable[0]);
                z4 = true;
                break;
            }
        }
        if (z4) {
            WorkDatabase M = workManager.M();
            M.beginTransaction();
            try {
                androidx.work.impl.model.s k4 = M.k();
                Iterator<String> it2 = b5.iterator();
                while (it2.hasNext()) {
                    k4.r(it2.next(), -1L);
                }
                M.setTransactionSuccessful();
                M.endTransaction();
            } catch (Throwable th) {
                M.endTransaction();
                throw th;
            }
        }
        return z4;
    }

    @Override // androidx.work.impl.e
    public void a(@o0 String workSpecId) {
        List<Integer> f4 = f(this.f36106b, this.f36107c, workSpecId);
        if (f4 == null || f4.isEmpty()) {
            return;
        }
        Iterator<Integer> it = f4.iterator();
        while (it.hasNext()) {
            e(this.f36107c, it.next().intValue());
        }
        this.f36108d.M().h().d(workSpecId);
    }

    @Override // androidx.work.impl.e
    public void c(@o0 r... workSpecs) {
        WorkDatabase M = this.f36108d.M();
        androidx.work.impl.utils.f fVar = new androidx.work.impl.utils.f(M);
        for (r rVar : workSpecs) {
            M.beginTransaction();
            try {
                r k4 = M.k().k(rVar.f36346a);
                if (k4 == null) {
                    s.c().h(f36105f, "Skipping scheduling " + rVar.f36346a + " because it's no longer in the DB", new Throwable[0]);
                    M.setTransactionSuccessful();
                } else if (k4.f36347b != f0.a.ENQUEUED) {
                    s.c().h(f36105f, "Skipping scheduling " + rVar.f36346a + " because it is no longer enqueued", new Throwable[0]);
                    M.setTransactionSuccessful();
                } else {
                    androidx.work.impl.model.i a5 = M.h().a(rVar.f36346a);
                    int d5 = a5 != null ? a5.f36323b : fVar.d(this.f36108d.F().i(), this.f36108d.F().g());
                    if (a5 == null) {
                        this.f36108d.M().h().c(new androidx.work.impl.model.i(rVar.f36346a, d5));
                    }
                    j(rVar, d5);
                    M.setTransactionSuccessful();
                }
            } finally {
                M.endTransaction();
            }
        }
    }

    @Override // androidx.work.impl.e
    public boolean d() {
        return true;
    }

    @m1
    public void j(r workSpec, int jobId) {
        JobInfo a5 = this.f36109e.a(workSpec, jobId);
        s c5 = s.c();
        String str = f36105f;
        c5.a(str, String.format("Scheduling work ID %s Job ID %s", workSpec.f36346a, Integer.valueOf(jobId)), new Throwable[0]);
        try {
            if (this.f36107c.schedule(a5) == 0) {
                s.c().h(str, String.format("Unable to schedule work ID %s", workSpec.f36346a), new Throwable[0]);
                if (workSpec.f36362q && workSpec.f36363r == y.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    workSpec.f36362q = false;
                    s.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", workSpec.f36346a), new Throwable[0]);
                    j(workSpec, jobId);
                }
            }
        } catch (IllegalStateException e4) {
            List<JobInfo> g4 = g(this.f36106b, this.f36107c);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(g4 != null ? g4.size() : 0), Integer.valueOf(this.f36108d.M().k().f().size()), Integer.valueOf(this.f36108d.F().h()));
            s.c().b(f36105f, format, new Throwable[0]);
            throw new IllegalStateException(format, e4);
        } catch (Throwable th) {
            s.c().b(f36105f, String.format("Unable to schedule %s", workSpec), th);
        }
    }

    @m1
    public g(Context context, j workManager, JobScheduler jobScheduler, f systemJobInfoConverter) {
        this.f36106b = context;
        this.f36108d = workManager;
        this.f36107c = jobScheduler;
        this.f36109e = systemJobInfoConverter;
    }
}
