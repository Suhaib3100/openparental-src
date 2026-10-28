package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.c1;
import androidx.annotation.l0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.work.impl.j;
import androidx.work.impl.utils.n;
import androidx.work.impl.utils.w;
import androidx.work.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: SystemAlarmDispatcher.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class e implements androidx.work.impl.b {

    /* renamed from: o, reason: collision with root package name */
    private static final int f36079o = 0;

    /* renamed from: b, reason: collision with root package name */
    final Context f36080b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.work.impl.utils.taskexecutor.a f36081c;

    /* renamed from: d, reason: collision with root package name */
    private final w f36082d;

    /* renamed from: e, reason: collision with root package name */
    private final androidx.work.impl.d f36083e;

    /* renamed from: f, reason: collision with root package name */
    private final j f36084f;

    /* renamed from: g, reason: collision with root package name */
    final androidx.work.impl.background.systemalarm.b f36085g;

    /* renamed from: h, reason: collision with root package name */
    private final Handler f36086h;

    /* renamed from: i, reason: collision with root package name */
    final List<Intent> f36087i;

    /* renamed from: j, reason: collision with root package name */
    Intent f36088j;

    /* renamed from: k, reason: collision with root package name */
    @q0
    private c f36089k;

    /* renamed from: m, reason: collision with root package name */
    private static final String f36077m = "ProcessCommand";

    /* renamed from: n, reason: collision with root package name */
    private static final String f36078n = "KEY_START_ID";

    /* renamed from: l, reason: collision with root package name */
    static final String f36076l = s.f("SystemAlarmDispatcher");

    /* compiled from: SystemAlarmDispatcher.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar;
            d dVar;
            synchronized (e.this.f36087i) {
                e eVar2 = e.this;
                eVar2.f36088j = eVar2.f36087i.get(0);
            }
            Intent intent = e.this.f36088j;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = e.this.f36088j.getIntExtra("KEY_START_ID", 0);
                s c5 = s.c();
                String str = e.f36076l;
                c5.a(str, String.format("Processing command %s, %s", e.this.f36088j, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock b5 = androidx.work.impl.utils.s.b(e.this.f36080b, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    s.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, b5), new Throwable[0]);
                    b5.acquire();
                    e eVar3 = e.this;
                    eVar3.f36085g.p(eVar3.f36088j, intExtra, eVar3);
                    s.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, b5), new Throwable[0]);
                    b5.release();
                    eVar = e.this;
                    dVar = new d(eVar);
                } catch (Throwable th) {
                    try {
                        s c6 = s.c();
                        String str2 = e.f36076l;
                        c6.b(str2, "Unexpected error in onHandleIntent", th);
                        s.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, b5), new Throwable[0]);
                        b5.release();
                        eVar = e.this;
                        dVar = new d(eVar);
                    } catch (Throwable th2) {
                        s.c().a(e.f36076l, String.format("Releasing operation wake lock (%s) %s", action, b5), new Throwable[0]);
                        b5.release();
                        e eVar4 = e.this;
                        eVar4.k(new d(eVar4));
                        throw th2;
                    }
                }
                eVar.k(dVar);
            }
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    static class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final e f36091b;

        /* renamed from: c, reason: collision with root package name */
        private final Intent f36092c;

        /* renamed from: d, reason: collision with root package name */
        private final int f36093d;

        b(@o0 e dispatcher, @o0 Intent intent, int startId) {
            this.f36091b = dispatcher;
            this.f36092c = intent;
            this.f36093d = startId;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f36091b.a(this.f36092c, this.f36093d);
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    interface c {
        void b();
    }

    /* compiled from: SystemAlarmDispatcher.java */
    static class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final e f36094b;

        d(@o0 e dispatcher) {
            this.f36094b = dispatcher;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f36094b.c();
        }
    }

    e(@o0 Context context) {
        this(context, null, null);
    }

    private void b() {
        if (this.f36086h.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @l0
    private boolean i(@o0 String action) {
        b();
        synchronized (this.f36087i) {
            try {
                Iterator<Intent> it = this.f36087i.iterator();
                while (it.hasNext()) {
                    if (action.equals(it.next().getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @l0
    private void l() {
        b();
        PowerManager.WakeLock b5 = androidx.work.impl.utils.s.b(this.f36080b, "ProcessCommand");
        try {
            b5.acquire();
            this.f36084f.O().b(new a());
        } finally {
            b5.release();
        }
    }

    @l0
    public boolean a(@o0 final Intent intent, final int startId) {
        s c5 = s.c();
        String str = f36076l;
        c5.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(startId)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            s.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", startId);
        synchronized (this.f36087i) {
            try {
                boolean isEmpty = this.f36087i.isEmpty();
                this.f36087i.add(intent);
                if (isEmpty) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @l0
    void c() {
        s c5 = s.c();
        String str = f36076l;
        c5.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.f36087i) {
            try {
                if (this.f36088j != null) {
                    s.c().a(str, String.format("Removing command %s", this.f36088j), new Throwable[0]);
                    if (!this.f36087i.remove(0).equals(this.f36088j)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.f36088j = null;
                }
                n d5 = this.f36081c.d();
                if (!this.f36085g.o() && this.f36087i.isEmpty() && !d5.b()) {
                    s.c().a(str, "No more commands & intents.", new Throwable[0]);
                    c cVar = this.f36089k;
                    if (cVar != null) {
                        cVar.b();
                    }
                } else if (!this.f36087i.isEmpty()) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    androidx.work.impl.d d() {
        return this.f36083e;
    }

    @Override // androidx.work.impl.b
    public void e(@o0 String workSpecId, boolean needsReschedule) {
        k(new b(this, androidx.work.impl.background.systemalarm.b.c(this.f36080b, workSpecId, needsReschedule), 0));
    }

    androidx.work.impl.utils.taskexecutor.a f() {
        return this.f36081c;
    }

    j g() {
        return this.f36084f;
    }

    w h() {
        return this.f36082d;
    }

    void j() {
        s.c().a(f36076l, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f36083e.j(this);
        this.f36082d.d();
        this.f36089k = null;
    }

    void k(@o0 Runnable runnable) {
        this.f36086h.post(runnable);
    }

    void m(@o0 c listener) {
        if (this.f36089k != null) {
            s.c().b(f36076l, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f36089k = listener;
        }
    }

    @m1
    e(@o0 Context context, @q0 androidx.work.impl.d processor, @q0 j workManager) {
        Context applicationContext = context.getApplicationContext();
        this.f36080b = applicationContext;
        this.f36085g = new androidx.work.impl.background.systemalarm.b(applicationContext);
        this.f36082d = new w();
        workManager = workManager == null ? j.H(context) : workManager;
        this.f36084f = workManager;
        processor = processor == null ? workManager.J() : processor;
        this.f36083e = processor;
        this.f36081c = workManager.O();
        processor.c(this);
        this.f36087i = new ArrayList();
        this.f36088j = null;
        this.f36086h = new Handler(Looper.getMainLooper());
    }
}
