package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.c1;
import androidx.annotation.l0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.constraints.d;
import androidx.work.impl.j;
import androidx.work.impl.model.r;
import androidx.work.l;
import androidx.work.s;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: SystemForegroundDispatcher.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class b implements androidx.work.impl.constraints.c, androidx.work.impl.b {

    /* renamed from: b, reason: collision with root package name */
    private Context f36197b;

    /* renamed from: c, reason: collision with root package name */
    private j f36198c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.work.impl.utils.taskexecutor.a f36199d;

    /* renamed from: e, reason: collision with root package name */
    final Object f36200e;

    /* renamed from: f, reason: collision with root package name */
    String f36201f;

    /* renamed from: g, reason: collision with root package name */
    final Map<String, l> f36202g;

    /* renamed from: h, reason: collision with root package name */
    final Map<String, r> f36203h;

    /* renamed from: i, reason: collision with root package name */
    final Set<r> f36204i;

    /* renamed from: j, reason: collision with root package name */
    final d f36205j;

    /* renamed from: k, reason: collision with root package name */
    @q0
    private InterfaceC0641b f36206k;

    /* renamed from: p, reason: collision with root package name */
    private static final String f36192p = "KEY_WORKSPEC_ID";

    /* renamed from: q, reason: collision with root package name */
    private static final String f36193q = "ACTION_START_FOREGROUND";

    /* renamed from: r, reason: collision with root package name */
    private static final String f36194r = "ACTION_NOTIFY";

    /* renamed from: s, reason: collision with root package name */
    private static final String f36195s = "ACTION_CANCEL_WORK";

    /* renamed from: t, reason: collision with root package name */
    private static final String f36196t = "ACTION_STOP_FOREGROUND";

    /* renamed from: m, reason: collision with root package name */
    private static final String f36189m = "KEY_NOTIFICATION";

    /* renamed from: n, reason: collision with root package name */
    private static final String f36190n = "KEY_NOTIFICATION_ID";

    /* renamed from: o, reason: collision with root package name */
    private static final String f36191o = "KEY_FOREGROUND_SERVICE_TYPE";

    /* renamed from: l, reason: collision with root package name */
    static final String f36188l = s.f("SystemFgDispatcher");

    /* compiled from: SystemForegroundDispatcher.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ WorkDatabase f36207b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f36208c;

        a(final WorkDatabase val$database, final String val$workSpecId) {
            this.f36207b = val$database;
            this.f36208c = val$workSpecId;
        }

        @Override // java.lang.Runnable
        public void run() {
            r k4 = this.f36207b.k().k(this.f36208c);
            if (k4 == null || !k4.b()) {
                return;
            }
            synchronized (b.this.f36200e) {
                b.this.f36203h.put(this.f36208c, k4);
                b.this.f36204i.add(k4);
                b bVar = b.this;
                bVar.f36205j.d(bVar.f36204i);
            }
        }
    }

    /* compiled from: SystemForegroundDispatcher.java */
    /* renamed from: androidx.work.impl.foreground.b$b, reason: collision with other inner class name */
    interface InterfaceC0641b {
        void a(int notificationId, @o0 Notification notification);

        void c(int notificationId, int notificationType, @o0 Notification notification);

        void d(int notificationId);

        void stop();
    }

    b(@o0 Context context) {
        this.f36197b = context;
        this.f36200e = new Object();
        j H = j.H(context);
        this.f36198c = H;
        androidx.work.impl.utils.taskexecutor.a O = H.O();
        this.f36199d = O;
        this.f36201f = null;
        this.f36202g = new LinkedHashMap();
        this.f36204i = new HashSet();
        this.f36203h = new HashMap();
        this.f36205j = new d(this.f36197b, O, this);
        this.f36198c.J().c(this);
    }

    @o0
    public static Intent a(@o0 Context context, @o0 String workSpecId) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_CANCEL_WORK");
        intent.setData(Uri.parse(String.format("workspec://%s", workSpecId)));
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        return intent;
    }

    @o0
    public static Intent c(@o0 Context context, @o0 String workSpecId, @o0 l info) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", info.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", info.a());
        intent.putExtra("KEY_NOTIFICATION", info.b());
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        return intent;
    }

    @o0
    public static Intent d(@o0 Context context, @o0 String workSpecId, @o0 l info) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        intent.putExtra("KEY_NOTIFICATION_ID", info.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", info.a());
        intent.putExtra("KEY_NOTIFICATION", info.b());
        intent.putExtra("KEY_WORKSPEC_ID", workSpecId);
        return intent;
    }

    @o0
    public static Intent g(@o0 Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @l0
    private void i(@o0 Intent intent) {
        s.c().d(f36188l, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f36198c.h(UUID.fromString(stringExtra));
    }

    @l0
    private void j(@o0 Intent intent) {
        int i4 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        s.c().a(f36188l, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f36206k == null) {
            return;
        }
        this.f36202g.put(stringExtra, new l(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f36201f)) {
            this.f36201f = stringExtra;
            this.f36206k.c(intExtra, intExtra2, notification);
            return;
        }
        this.f36206k.a(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator<Map.Entry<String, l>> it = this.f36202g.entrySet().iterator();
        while (it.hasNext()) {
            i4 |= it.next().getValue().a();
        }
        l lVar = this.f36202g.get(this.f36201f);
        if (lVar != null) {
            this.f36206k.c(lVar.c(), i4, lVar.b());
        }
    }

    @l0
    private void k(@o0 Intent intent) {
        s.c().d(f36188l, String.format("Started foreground service %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        this.f36199d.b(new a(this.f36198c.M(), stringExtra));
    }

    @Override // androidx.work.impl.constraints.c
    public void b(@o0 List<String> workSpecIds) {
        if (workSpecIds.isEmpty()) {
            return;
        }
        for (String str : workSpecIds) {
            s.c().a(f36188l, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f36198c.W(str);
        }
    }

    @Override // androidx.work.impl.b
    @l0
    public void e(@o0 String workSpecId, boolean needsReschedule) {
        Map.Entry<String, l> entry;
        synchronized (this.f36200e) {
            try {
                r remove = this.f36203h.remove(workSpecId);
                if (remove != null ? this.f36204i.remove(remove) : false) {
                    this.f36205j.d(this.f36204i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        l remove2 = this.f36202g.remove(workSpecId);
        if (workSpecId.equals(this.f36201f) && this.f36202g.size() > 0) {
            Iterator<Map.Entry<String, l>> it = this.f36202g.entrySet().iterator();
            Map.Entry<String, l> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f36201f = entry.getKey();
            if (this.f36206k != null) {
                l value = entry.getValue();
                this.f36206k.c(value.c(), value.a(), value.b());
                this.f36206k.d(value.c());
            }
        }
        InterfaceC0641b interfaceC0641b = this.f36206k;
        if (remove2 == null || interfaceC0641b == null) {
            return;
        }
        s.c().a(f36188l, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(remove2.c()), workSpecId, Integer.valueOf(remove2.a())), new Throwable[0]);
        interfaceC0641b.d(remove2.c());
    }

    @Override // androidx.work.impl.constraints.c
    public void f(@o0 List<String> workSpecIds) {
    }

    j h() {
        return this.f36198c;
    }

    @l0
    void l(@o0 Intent intent) {
        s.c().d(f36188l, "Stopping foreground service", new Throwable[0]);
        InterfaceC0641b interfaceC0641b = this.f36206k;
        if (interfaceC0641b != null) {
            interfaceC0641b.stop();
        }
    }

    @l0
    void m() {
        this.f36206k = null;
        synchronized (this.f36200e) {
            this.f36205j.e();
        }
        this.f36198c.J().j(this);
    }

    void n(@o0 Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            k(intent);
            j(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            j(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            i(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            l(intent);
        }
    }

    @l0
    void o(@o0 InterfaceC0641b callback) {
        if (this.f36206k != null) {
            s.c().b(f36188l, "A callback already exists.", new Throwable[0]);
        } else {
            this.f36206k = callback;
        }
    }

    @m1
    b(@o0 Context context, @o0 j workManagerImpl, @o0 d tracker) {
        this.f36197b = context;
        this.f36200e = new Object();
        this.f36198c = workManagerImpl;
        this.f36199d = workManagerImpl.O();
        this.f36201f = null;
        this.f36202g = new LinkedHashMap();
        this.f36204i = new HashSet();
        this.f36203h = new HashMap();
        this.f36205j = tracker;
        this.f36198c.J().c(this);
    }
}
