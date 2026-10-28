package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.log4j.helpers.FileWatchdog;

@Deprecated
/* loaded from: classes.dex */
public abstract class JobIntentService extends Service {

    /* renamed from: w, reason: collision with root package name */
    static final boolean f3973w = false;

    /* renamed from: o, reason: collision with root package name */
    b f3976o;

    /* renamed from: p, reason: collision with root package name */
    h f3977p;

    /* renamed from: q, reason: collision with root package name */
    a f3978q;

    /* renamed from: r, reason: collision with root package name */
    boolean f3979r = false;

    /* renamed from: s, reason: collision with root package name */
    boolean f3980s = false;

    /* renamed from: t, reason: collision with root package name */
    boolean f3981t = false;

    /* renamed from: u, reason: collision with root package name */
    final ArrayList<d> f3982u;

    /* renamed from: v, reason: collision with root package name */
    static final String f3972v = "JobIntentService";

    /* renamed from: x, reason: collision with root package name */
    static final Object f3974x = new Object();

    /* renamed from: y, reason: collision with root package name */
    static final HashMap<ComponentName, h> f3975y = new HashMap<>();

    final class a extends AsyncTask<Void, Void, Void> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e a6 = JobIntentService.this.a();
                if (a6 == null) {
                    return null;
                }
                JobIntentService.this.h(a6.getIntent());
                a6.j();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r12) {
            JobIntentService.this.j();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r12) {
            JobIntentService.this.j();
        }
    }

    interface b {
        IBinder a();

        e b();
    }

    /* loaded from: classes3.dex */
    static final class c extends h {

        /* renamed from: d, reason: collision with root package name */
        private final Context f3984d;

        /* renamed from: e, reason: collision with root package name */
        private final PowerManager.WakeLock f3985e;

        /* renamed from: f, reason: collision with root package name */
        private final PowerManager.WakeLock f3986f;

        /* renamed from: g, reason: collision with root package name */
        boolean f3987g;

        /* renamed from: h, reason: collision with root package name */
        boolean f3988h;

        c(Context context, ComponentName componentName) {
            super(componentName);
            this.f3984d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f3985e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f3986f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.h
        void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f4001a);
            if (this.f3984d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f3987g) {
                        this.f3987g = true;
                        if (!this.f3988h) {
                            this.f3985e.acquire(FileWatchdog.DEFAULT_DELAY);
                        }
                    }
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.h
        public void c() {
            synchronized (this) {
                if (this.f3988h) {
                    if (this.f3987g) {
                        this.f3985e.acquire(FileWatchdog.DEFAULT_DELAY);
                    }
                    this.f3988h = false;
                    this.f3986f.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.h
        public void d() {
            synchronized (this) {
                if (!this.f3988h) {
                    this.f3988h = true;
                    this.f3986f.acquire(600000L);
                    this.f3985e.release();
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.h
        public void e() {
            synchronized (this) {
                this.f3987g = false;
            }
        }
    }

    /* loaded from: classes3.dex */
    final class d implements e {

        /* renamed from: a, reason: collision with root package name */
        final Intent f3989a;

        /* renamed from: b, reason: collision with root package name */
        final int f3990b;

        d(Intent intent, int i5) {
            this.f3989a = intent;
            this.f3990b = i5;
        }

        @Override // androidx.core.app.JobIntentService.e
        public Intent getIntent() {
            return this.f3989a;
        }

        @Override // androidx.core.app.JobIntentService.e
        public void j() {
            JobIntentService.this.stopSelf(this.f3990b);
        }
    }

    interface e {
        Intent getIntent();

        void j();
    }

    @androidx.annotation.x0(26)
    /* loaded from: classes3.dex */
    static final class f extends JobServiceEngine implements b {

        /* renamed from: d, reason: collision with root package name */
        static final String f3992d = "JobServiceEngineImpl";

        /* renamed from: e, reason: collision with root package name */
        static final boolean f3993e = false;

        /* renamed from: a, reason: collision with root package name */
        final JobIntentService f3994a;

        /* renamed from: b, reason: collision with root package name */
        final Object f3995b;

        /* renamed from: c, reason: collision with root package name */
        JobParameters f3996c;

        final class a implements e {

            /* renamed from: a, reason: collision with root package name */
            final JobWorkItem f3997a;

            a(JobWorkItem jobWorkItem) {
                this.f3997a = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.e
            public Intent getIntent() {
                Intent intent;
                intent = this.f3997a.getIntent();
                return intent;
            }

            @Override // androidx.core.app.JobIntentService.e
            public void j() {
                synchronized (f.this.f3995b) {
                    JobParameters jobParameters = f.this.f3996c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f3997a);
                    }
                }
            }
        }

        f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f3995b = new Object();
            this.f3994a = jobIntentService;
        }

        @Override // androidx.core.app.JobIntentService.b
        public IBinder a() {
            return getBinder();
        }

        @Override // androidx.core.app.JobIntentService.b
        public e b() {
            JobWorkItem dequeueWork;
            Intent intent;
            synchronized (this.f3995b) {
                JobParameters jobParameters = this.f3996c;
                if (jobParameters == null) {
                    return null;
                }
                dequeueWork = jobParameters.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                intent = dequeueWork.getIntent();
                intent.setExtrasClassLoader(this.f3994a.getClassLoader());
                return new a(dequeueWork);
            }
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.f3996c = jobParameters;
            this.f3994a.e(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean b6 = this.f3994a.b();
            synchronized (this.f3995b) {
                this.f3996c = null;
            }
            return b6;
        }
    }

    @androidx.annotation.x0(26)
    /* loaded from: classes3.dex */
    static final class g extends h {

        /* renamed from: d, reason: collision with root package name */
        private final JobInfo f3999d;

        /* renamed from: e, reason: collision with root package name */
        private final JobScheduler f4000e;

        g(Context context, ComponentName componentName, int i5) {
            super(componentName);
            b(i5);
            this.f3999d = new JobInfo.Builder(i5, this.f4001a).setOverrideDeadline(0L).build();
            this.f4000e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.JobIntentService.h
        void a(Intent intent) {
            this.f4000e.enqueue(this.f3999d, new JobWorkItem(intent));
        }
    }

    static abstract class h {

        /* renamed from: a, reason: collision with root package name */
        final ComponentName f4001a;

        /* renamed from: b, reason: collision with root package name */
        boolean f4002b;

        /* renamed from: c, reason: collision with root package name */
        int f4003c;

        h(ComponentName componentName) {
            this.f4001a = componentName;
        }

        abstract void a(Intent intent);

        void b(int i5) {
            if (!this.f4002b) {
                this.f4002b = true;
                this.f4003c = i5;
            } else {
                if (this.f4003c == i5) {
                    return;
                }
                StringBuilder a6 = x.a("Given job ID ", i5, " is different than previous ");
                a6.append(this.f4003c);
                throw new IllegalArgumentException(a6.toString());
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3982u = null;
        } else {
            this.f3982u = new ArrayList<>();
        }
    }

    public static void c(@androidx.annotation.o0 Context context, @androidx.annotation.o0 ComponentName componentName, int i5, @androidx.annotation.o0 Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f3974x) {
            h f6 = f(context, componentName, true, i5);
            f6.b(i5);
            f6.a(intent);
        }
    }

    public static void d(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Class<?> cls, int i5, @androidx.annotation.o0 Intent intent) {
        c(context, new ComponentName(context, cls), i5, intent);
    }

    static h f(Context context, ComponentName componentName, boolean z5, int i5) {
        h cVar;
        HashMap<ComponentName, h> hashMap = f3975y;
        h hVar = hashMap.get(componentName);
        if (hVar != null) {
            return hVar;
        }
        if (Build.VERSION.SDK_INT < 26) {
            cVar = new c(context, componentName);
        } else {
            if (!z5) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            cVar = new g(context, componentName, i5);
        }
        h hVar2 = cVar;
        hashMap.put(componentName, hVar2);
        return hVar2;
    }

    e a() {
        b bVar = this.f3976o;
        if (bVar != null) {
            return bVar.b();
        }
        synchronized (this.f3982u) {
            if (this.f3982u.size() <= 0) {
                return null;
            }
            return this.f3982u.remove(0);
        }
    }

    boolean b() {
        a aVar = this.f3978q;
        if (aVar != null) {
            aVar.cancel(this.f3979r);
        }
        this.f3980s = true;
        return i();
    }

    void e(boolean z5) {
        if (this.f3978q == null) {
            this.f3978q = new a();
            h hVar = this.f3977p;
            if (hVar != null && z5) {
                hVar.d();
            }
            this.f3978q.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean g() {
        return this.f3980s;
    }

    protected abstract void h(@androidx.annotation.o0 Intent intent);

    public boolean i() {
        return true;
    }

    void j() {
        ArrayList<d> arrayList = this.f3982u;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f3978q = null;
                ArrayList<d> arrayList2 = this.f3982u;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    e(false);
                } else if (!this.f3981t) {
                    this.f3977p.c();
                }
            }
        }
    }

    public void k(boolean z5) {
        this.f3979r = z5;
    }

    @Override // android.app.Service
    public IBinder onBind(@androidx.annotation.o0 Intent intent) {
        b bVar = this.f3976o;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3976o = new f(this);
            this.f3977p = null;
        } else {
            this.f3976o = null;
            this.f3977p = f(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.f3982u;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f3981t = true;
                this.f3977p.c();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@androidx.annotation.q0 Intent intent, int i5, int i6) {
        if (this.f3982u == null) {
            return 2;
        }
        this.f3977p.e();
        synchronized (this.f3982u) {
            ArrayList<d> arrayList = this.f3982u;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i6));
            e(true);
        }
        return 3;
    }
}
