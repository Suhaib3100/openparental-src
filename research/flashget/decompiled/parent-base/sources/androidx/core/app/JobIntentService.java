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

@Deprecated
/* loaded from: classes3.dex */
public abstract class JobIntentService extends Service {

    /* renamed from: j, reason: collision with root package name */
    static final boolean f25371j = false;

    /* renamed from: b, reason: collision with root package name */
    b f25374b;

    /* renamed from: c, reason: collision with root package name */
    h f25375c;

    /* renamed from: d, reason: collision with root package name */
    a f25376d;

    /* renamed from: e, reason: collision with root package name */
    boolean f25377e = false;

    /* renamed from: f, reason: collision with root package name */
    boolean f25378f = false;

    /* renamed from: g, reason: collision with root package name */
    boolean f25379g = false;

    /* renamed from: h, reason: collision with root package name */
    final ArrayList<d> f25380h;

    /* renamed from: i, reason: collision with root package name */
    static final String f25370i = "JobIntentService";

    /* renamed from: k, reason: collision with root package name */
    static final Object f25372k = new Object();

    /* renamed from: l, reason: collision with root package name */
    static final HashMap<ComponentName, h> f25373l = new HashMap<>();

    final class a extends AsyncTask<Void, Void, Void> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e a5 = JobIntentService.this.a();
                if (a5 == null) {
                    return null;
                }
                JobIntentService.this.h(a5.getIntent());
                a5.h();
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

    static final class c extends h {

        /* renamed from: d, reason: collision with root package name */
        private final Context f25382d;

        /* renamed from: e, reason: collision with root package name */
        private final PowerManager.WakeLock f25383e;

        /* renamed from: f, reason: collision with root package name */
        private final PowerManager.WakeLock f25384f;

        /* renamed from: g, reason: collision with root package name */
        boolean f25385g;

        /* renamed from: h, reason: collision with root package name */
        boolean f25386h;

        c(Context context, ComponentName componentName) {
            super(componentName);
            this.f25382d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f25383e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f25384f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.h
        void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f25399a);
            if (this.f25382d.startService(intent2) != null) {
                synchronized (this) {
                    try {
                        if (!this.f25385g) {
                            this.f25385g = true;
                            if (!this.f25386h) {
                                this.f25383e.acquire(60000L);
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.h
        public void c() {
            synchronized (this) {
                try {
                    if (this.f25386h) {
                        if (this.f25385g) {
                            this.f25383e.acquire(60000L);
                        }
                        this.f25386h = false;
                        this.f25384f.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.h
        public void d() {
            synchronized (this) {
                try {
                    if (!this.f25386h) {
                        this.f25386h = true;
                        this.f25384f.acquire(600000L);
                        this.f25383e.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.h
        public void e() {
            synchronized (this) {
                this.f25385g = false;
            }
        }
    }

    final class d implements e {

        /* renamed from: a, reason: collision with root package name */
        final Intent f25387a;

        /* renamed from: b, reason: collision with root package name */
        final int f25388b;

        d(Intent intent, int i4) {
            this.f25387a = intent;
            this.f25388b = i4;
        }

        @Override // androidx.core.app.JobIntentService.e
        public Intent getIntent() {
            return this.f25387a;
        }

        @Override // androidx.core.app.JobIntentService.e
        public void h() {
            JobIntentService.this.stopSelf(this.f25388b);
        }
    }

    interface e {
        Intent getIntent();

        void h();
    }

    @androidx.annotation.x0(26)
    static final class f extends JobServiceEngine implements b {

        /* renamed from: d, reason: collision with root package name */
        static final String f25390d = "JobServiceEngineImpl";

        /* renamed from: e, reason: collision with root package name */
        static final boolean f25391e = false;

        /* renamed from: a, reason: collision with root package name */
        final JobIntentService f25392a;

        /* renamed from: b, reason: collision with root package name */
        final Object f25393b;

        /* renamed from: c, reason: collision with root package name */
        JobParameters f25394c;

        final class a implements e {

            /* renamed from: a, reason: collision with root package name */
            final JobWorkItem f25395a;

            a(JobWorkItem jobWorkItem) {
                this.f25395a = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.e
            public Intent getIntent() {
                Intent intent;
                intent = this.f25395a.getIntent();
                return intent;
            }

            @Override // androidx.core.app.JobIntentService.e
            public void h() {
                synchronized (f.this.f25393b) {
                    try {
                        JobParameters jobParameters = f.this.f25394c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f25395a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f25393b = new Object();
            this.f25392a = jobIntentService;
        }

        @Override // androidx.core.app.JobIntentService.b
        public IBinder a() {
            IBinder binder;
            binder = getBinder();
            return binder;
        }

        @Override // androidx.core.app.JobIntentService.b
        public e b() {
            JobWorkItem dequeueWork;
            Intent intent;
            synchronized (this.f25393b) {
                try {
                    JobParameters jobParameters = this.f25394c;
                    if (jobParameters == null) {
                        return null;
                    }
                    dequeueWork = jobParameters.dequeueWork();
                    if (dequeueWork == null) {
                        return null;
                    }
                    intent = dequeueWork.getIntent();
                    intent.setExtrasClassLoader(this.f25392a.getClassLoader());
                    return new a(dequeueWork);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f25394c = jobParameters;
            this.f25392a.e(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b5 = this.f25392a.b();
            synchronized (this.f25393b) {
                this.f25394c = null;
            }
            return b5;
        }
    }

    @androidx.annotation.x0(26)
    static final class g extends h {

        /* renamed from: d, reason: collision with root package name */
        private final JobInfo f25397d;

        /* renamed from: e, reason: collision with root package name */
        private final JobScheduler f25398e;

        g(Context context, ComponentName componentName, int i4) {
            super(componentName);
            b(i4);
            this.f25397d = new JobInfo.Builder(i4, this.f25399a).setOverrideDeadline(0L).build();
            this.f25398e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.JobIntentService.h
        void a(Intent intent) {
            this.f25398e.enqueue(this.f25397d, u.a(intent));
        }
    }

    static abstract class h {

        /* renamed from: a, reason: collision with root package name */
        final ComponentName f25399a;

        /* renamed from: b, reason: collision with root package name */
        boolean f25400b;

        /* renamed from: c, reason: collision with root package name */
        int f25401c;

        h(ComponentName componentName) {
            this.f25399a = componentName;
        }

        abstract void a(Intent intent);

        void b(int i4) {
            if (!this.f25400b) {
                this.f25400b = true;
                this.f25401c = i4;
            } else {
                if (this.f25401c == i4) {
                    return;
                }
                StringBuilder a5 = androidx.collection.s.a("Given job ID ", i4, " is different than previous ");
                a5.append(this.f25401c);
                throw new IllegalArgumentException(a5.toString());
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
            this.f25380h = null;
        } else {
            this.f25380h = new ArrayList<>();
        }
    }

    public static void c(@androidx.annotation.o0 Context context, @androidx.annotation.o0 ComponentName componentName, int i4, @androidx.annotation.o0 Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f25372k) {
            h f4 = f(context, componentName, true, i4);
            f4.b(i4);
            f4.a(intent);
        }
    }

    public static void d(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Class<?> cls, int i4, @androidx.annotation.o0 Intent intent) {
        c(context, new ComponentName(context, cls), i4, intent);
    }

    static h f(Context context, ComponentName componentName, boolean z4, int i4) {
        h cVar;
        HashMap<ComponentName, h> hashMap = f25373l;
        h hVar = hashMap.get(componentName);
        if (hVar == null) {
            if (Build.VERSION.SDK_INT < 26) {
                cVar = new c(context, componentName);
            } else {
                if (!z4) {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
                cVar = new g(context, componentName, i4);
            }
            hVar = cVar;
            hashMap.put(componentName, hVar);
        }
        return hVar;
    }

    e a() {
        b bVar = this.f25374b;
        if (bVar != null) {
            return bVar.b();
        }
        synchronized (this.f25380h) {
            try {
                if (this.f25380h.size() <= 0) {
                    return null;
                }
                return this.f25380h.remove(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean b() {
        a aVar = this.f25376d;
        if (aVar != null) {
            aVar.cancel(this.f25377e);
        }
        this.f25378f = true;
        return i();
    }

    void e(boolean z4) {
        if (this.f25376d == null) {
            this.f25376d = new a();
            h hVar = this.f25375c;
            if (hVar != null && z4) {
                hVar.d();
            }
            this.f25376d.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean g() {
        return this.f25378f;
    }

    protected abstract void h(@androidx.annotation.o0 Intent intent);

    public boolean i() {
        return true;
    }

    void j() {
        ArrayList<d> arrayList = this.f25380h;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f25376d = null;
                    ArrayList<d> arrayList2 = this.f25380h;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        e(false);
                    } else if (!this.f25379g) {
                        this.f25375c.c();
                    }
                } finally {
                }
            }
        }
    }

    public void k(boolean z4) {
        this.f25377e = z4;
    }

    @Override // android.app.Service
    public IBinder onBind(@androidx.annotation.o0 Intent intent) {
        b bVar = this.f25374b;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f25374b = new f(this);
            this.f25375c = null;
        } else {
            this.f25374b = null;
            this.f25375c = f(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.f25380h;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f25379g = true;
                this.f25375c.c();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@androidx.annotation.q0 Intent intent, int i4, int i5) {
        if (this.f25380h == null) {
            return 2;
        }
        this.f25375c.e();
        synchronized (this.f25380h) {
            ArrayList<d> arrayList = this.f25380h;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i5));
            e(true);
        }
        return 3;
    }
}
