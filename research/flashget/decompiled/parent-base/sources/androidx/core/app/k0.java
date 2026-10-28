package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import androidx.annotation.b1;
import androidx.annotation.c1;
import androidx.annotation.m1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: NotificationManagerCompat.java */
/* loaded from: classes3.dex */
public final class k0 {
    public static final int A = 4;
    public static final int B = 5;

    /* renamed from: h, reason: collision with root package name */
    static final int f25773h = 19;

    /* renamed from: i, reason: collision with root package name */
    private static final int f25774i = 1000;

    /* renamed from: j, reason: collision with root package name */
    private static final int f25775j = 6;

    /* renamed from: m, reason: collision with root package name */
    @androidx.annotation.b0("sEnabledNotificationListenersLock")
    private static String f25778m = null;

    /* renamed from: p, reason: collision with root package name */
    @androidx.annotation.b0("sLock")
    private static l f25781p = null;

    /* renamed from: q, reason: collision with root package name */
    public static final int f25782q = 1;

    /* renamed from: r, reason: collision with root package name */
    public static final int f25783r = 2;

    /* renamed from: s, reason: collision with root package name */
    public static final int f25784s = 3;

    /* renamed from: t, reason: collision with root package name */
    public static final int f25785t = 4;

    /* renamed from: u, reason: collision with root package name */
    public static final int f25786u = 0;

    /* renamed from: v, reason: collision with root package name */
    public static final int f25787v = -1000;

    /* renamed from: w, reason: collision with root package name */
    public static final int f25788w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static final int f25789x = 1;

    /* renamed from: y, reason: collision with root package name */
    public static final int f25790y = 2;

    /* renamed from: z, reason: collision with root package name */
    public static final int f25791z = 3;

    /* renamed from: a, reason: collision with root package name */
    private final Context f25792a;

    /* renamed from: b, reason: collision with root package name */
    private final NotificationManager f25793b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f25768c = "NotifManCompat";

    /* renamed from: d, reason: collision with root package name */
    private static final String f25769d = "checkOpNoThrow";

    /* renamed from: e, reason: collision with root package name */
    private static final String f25770e = "OP_POST_NOTIFICATION";

    /* renamed from: f, reason: collision with root package name */
    public static final String f25771f = "android.support.useSideChannel";

    /* renamed from: g, reason: collision with root package name */
    public static final String f25772g = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";

    /* renamed from: k, reason: collision with root package name */
    private static final String f25776k = "enabled_notification_listeners";

    /* renamed from: l, reason: collision with root package name */
    private static final Object f25777l = new Object();

    /* renamed from: n, reason: collision with root package name */
    @androidx.annotation.b0("sEnabledNotificationListenersLock")
    private static Set<String> f25779n = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    private static final Object f25780o = new Object();

    /* compiled from: NotificationManagerCompat.java */
    @androidx.annotation.x0(23)
    static class a {
        private a() {
        }

        static List<StatusBarNotification> a(NotificationManager notificationManager) {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            return activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications);
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getCurrentInterruptionFilter();
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    @androidx.annotation.x0(24)
    static class b {
        private b() {
        }

        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    @androidx.annotation.x0(26)
    static class c {
        private c() {
        }

        static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        static void c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        static void d(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        static void e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        static void f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        static String h(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        static NotificationChannel i(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        static List<NotificationChannelGroup> j(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        static List<NotificationChannel> k(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    @androidx.annotation.x0(28)
    static class d {
        private d() {
        }

        static NotificationChannelGroup a(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    @androidx.annotation.x0(30)
    static class e {
        private e() {
        }

        static NotificationChannel a(NotificationManager notificationManager, String str, String str2) {
            return notificationManager.getNotificationChannel(str, str2);
        }

        static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    @androidx.annotation.x0(34)
    static class f {
        private f() {
        }

        static boolean a(NotificationManager notificationManager) {
            return notificationManager.canUseFullScreenIntent();
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface h {
    }

    /* compiled from: NotificationManagerCompat.java */
    private static class j implements m {

        /* renamed from: a, reason: collision with root package name */
        final String f25801a;

        /* renamed from: b, reason: collision with root package name */
        final int f25802b;

        /* renamed from: c, reason: collision with root package name */
        final String f25803c;

        /* renamed from: d, reason: collision with root package name */
        final Notification f25804d;

        j(String str, int i4, String str2, Notification notification) {
            this.f25801a = str;
            this.f25802b = i4;
            this.f25803c = str2;
            this.f25804d = notification;
        }

        @Override // androidx.core.app.k0.m
        public void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            iNotificationSideChannel.notify(this.f25801a, this.f25802b, this.f25803c, this.f25804d);
        }

        @androidx.annotation.o0
        public String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
            sb.append(this.f25801a);
            sb.append(", id:");
            sb.append(this.f25802b);
            sb.append(", tag:");
            return android.support.v4.media.c.a(sb, this.f25803c, "]");
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    private static class k {

        /* renamed from: a, reason: collision with root package name */
        final ComponentName f25805a;

        /* renamed from: b, reason: collision with root package name */
        final IBinder f25806b;

        k(ComponentName componentName, IBinder iBinder) {
            this.f25805a = componentName;
            this.f25806b = iBinder;
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    private static class l implements Handler.Callback, ServiceConnection {

        /* renamed from: g, reason: collision with root package name */
        private static final int f25807g = 0;

        /* renamed from: h, reason: collision with root package name */
        private static final int f25808h = 1;

        /* renamed from: i, reason: collision with root package name */
        private static final int f25809i = 2;

        /* renamed from: j, reason: collision with root package name */
        private static final int f25810j = 3;

        /* renamed from: b, reason: collision with root package name */
        private final Context f25811b;

        /* renamed from: c, reason: collision with root package name */
        private final HandlerThread f25812c;

        /* renamed from: d, reason: collision with root package name */
        private final Handler f25813d;

        /* renamed from: e, reason: collision with root package name */
        private final Map<ComponentName, a> f25814e = new HashMap();

        /* renamed from: f, reason: collision with root package name */
        private Set<String> f25815f = new HashSet();

        /* compiled from: NotificationManagerCompat.java */
        private static class a {

            /* renamed from: a, reason: collision with root package name */
            final ComponentName f25816a;

            /* renamed from: c, reason: collision with root package name */
            INotificationSideChannel f25818c;

            /* renamed from: b, reason: collision with root package name */
            boolean f25817b = false;

            /* renamed from: d, reason: collision with root package name */
            ArrayDeque<m> f25819d = new ArrayDeque<>();

            /* renamed from: e, reason: collision with root package name */
            int f25820e = 0;

            a(ComponentName componentName) {
                this.f25816a = componentName;
            }
        }

        l(Context context) {
            this.f25811b = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f25812c = handlerThread;
            handlerThread.start();
            this.f25813d = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f25817b) {
                return true;
            }
            boolean bindService = this.f25811b.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f25816a), this, 33);
            aVar.f25817b = bindService;
            if (bindService) {
                aVar.f25820e = 0;
            } else {
                Objects.toString(aVar.f25816a);
                this.f25811b.unbindService(this);
            }
            return aVar.f25817b;
        }

        private void b(a aVar) {
            if (aVar.f25817b) {
                this.f25811b.unbindService(this);
                aVar.f25817b = false;
            }
            aVar.f25818c = null;
        }

        private void c(m mVar) {
            j();
            for (a aVar : this.f25814e.values()) {
                aVar.f25819d.add(mVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.f25814e.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f25814e.get(componentName);
            if (aVar != null) {
                aVar.f25818c = INotificationSideChannel.Stub.asInterface(iBinder);
                aVar.f25820e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.f25814e.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(aVar.f25816a);
                aVar.f25819d.size();
            }
            if (aVar.f25819d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f25818c == null) {
                i(aVar);
                return;
            }
            while (true) {
                m peek = aVar.f25819d.peek();
                if (peek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        peek.toString();
                    }
                    peek.a(aVar.f25818c);
                    aVar.f25819d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(aVar.f25816a);
                    }
                } catch (RemoteException unused2) {
                    Objects.toString(aVar.f25816a);
                }
            }
            if (aVar.f25819d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f25813d.hasMessages(3, aVar.f25816a)) {
                return;
            }
            int i4 = aVar.f25820e + 1;
            aVar.f25820e = i4;
            if (i4 > 6) {
                aVar.f25819d.size();
                Objects.toString(aVar.f25816a);
                aVar.f25819d.clear();
            } else {
                Log.isLoggable("NotifManCompat", 3);
                this.f25813d.sendMessageDelayed(this.f25813d.obtainMessage(3, aVar.f25816a), (1 << r0) * 1000);
            }
        }

        private void j() {
            Set<String> t4 = k0.t(this.f25811b);
            if (t4.equals(this.f25815f)) {
                return;
            }
            this.f25815f = t4;
            List<ResolveInfo> queryIntentServices = this.f25811b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (t4.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        componentName.toString();
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ComponentName componentName2 = (ComponentName) it.next();
                if (!this.f25814e.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(componentName2);
                    }
                    this.f25814e.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it2 = this.f25814e.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<ComponentName, a> next = it2.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(next.getKey());
                    }
                    b(next.getValue());
                    it2.remove();
                }
            }
        }

        public void h(m mVar) {
            this.f25813d.obtainMessage(0, mVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 0) {
                c((m) message.obj);
                return true;
            }
            if (i4 == 1) {
                k kVar = (k) message.obj;
                e(kVar.f25805a, kVar.f25806b);
                return true;
            }
            if (i4 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i4 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
            }
            this.f25813d.obtainMessage(1, new k(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
            }
            this.f25813d.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    private interface m {
        void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException;
    }

    private k0(Context context) {
        this.f25792a = context;
        this.f25793b = (NotificationManager) context.getSystemService("notification");
    }

    private void I(m mVar) {
        synchronized (f25780o) {
            try {
                if (f25781p == null) {
                    f25781p = new l(this.f25792a.getApplicationContext());
                }
                f25781p.h(mVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean J(Notification notification) {
        Bundle bundle = notification.extras;
        return bundle != null && bundle.getBoolean("android.support.useSideChannel");
    }

    @androidx.annotation.o0
    public static k0 q(@androidx.annotation.o0 Context context) {
        return new k0(context);
    }

    @androidx.annotation.o0
    public static Set<String> t(@androidx.annotation.o0 Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f25777l) {
            if (string != null) {
                try {
                    if (!string.equals(f25778m)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet.add(unflattenFromString.getPackageName());
                            }
                        }
                        f25779n = hashSet;
                        f25778m = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = f25779n;
        }
        return set;
    }

    @androidx.annotation.q0
    public b0 A(@androidx.annotation.o0 String str) {
        NotificationChannelGroup z4;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            NotificationChannelGroup z5 = z(str);
            if (z5 != null) {
                return new b0(z5);
            }
            return null;
        }
        if (i4 < 26 || (z4 = z(str)) == null) {
            return null;
        }
        return new b0(z4, D());
    }

    @androidx.annotation.o0
    public List<NotificationChannelGroup> B() {
        return Build.VERSION.SDK_INT >= 26 ? c.j(this.f25793b) : Collections.emptyList();
    }

    @androidx.annotation.o0
    public List<b0> C() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            List<NotificationChannelGroup> B2 = B();
            if (!B2.isEmpty()) {
                List<NotificationChannel> emptyList = i4 >= 28 ? Collections.emptyList() : D();
                ArrayList arrayList = new ArrayList(B2.size());
                Iterator<NotificationChannelGroup> it = B2.iterator();
                while (it.hasNext()) {
                    NotificationChannelGroup a5 = j0.a(it.next());
                    if (Build.VERSION.SDK_INT >= 28) {
                        arrayList.add(new b0(a5));
                    } else {
                        arrayList.add(new b0(a5, emptyList));
                    }
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    @androidx.annotation.o0
    public List<NotificationChannel> D() {
        return Build.VERSION.SDK_INT >= 26 ? c.k(this.f25793b) : Collections.emptyList();
    }

    @androidx.annotation.o0
    public List<z> E() {
        if (Build.VERSION.SDK_INT >= 26) {
            List<NotificationChannel> D = D();
            if (!D.isEmpty()) {
                ArrayList arrayList = new ArrayList(D.size());
                Iterator<NotificationChannel> it = D.iterator();
                while (it.hasNext()) {
                    arrayList.add(new z(a0.a(it.next())));
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    @b1("android.permission.POST_NOTIFICATIONS")
    public void F(int i4, @androidx.annotation.o0 Notification notification) {
        G(null, i4, notification);
    }

    @b1("android.permission.POST_NOTIFICATIONS")
    public void G(@androidx.annotation.q0 String str, int i4, @androidx.annotation.o0 Notification notification) {
        if (!J(notification)) {
            this.f25793b.notify(str, i4, notification);
        } else {
            I(new j(this.f25792a.getPackageName(), i4, str, notification));
            this.f25793b.cancel(str, i4);
        }
    }

    @b1("android.permission.POST_NOTIFICATIONS")
    public void H(@androidx.annotation.o0 List<i> list) {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            i iVar = list.get(i4);
            G(iVar.f25798a, iVar.f25799b, iVar.f25800c);
        }
    }

    public boolean a() {
        return this.f25793b.areNotificationsEnabled();
    }

    public boolean b() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 29) {
            return true;
        }
        return i4 < 34 ? this.f25792a.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT") == 0 : f.a(this.f25793b);
    }

    public void c(int i4) {
        d(null, i4);
    }

    public void d(@androidx.annotation.q0 String str, int i4) {
        this.f25793b.cancel(str, i4);
    }

    public void e() {
        this.f25793b.cancelAll();
    }

    public void f(@androidx.annotation.o0 NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.a(this.f25793b, notificationChannel);
        }
    }

    public void g(@androidx.annotation.o0 z zVar) {
        f(zVar.m());
    }

    public void h(@androidx.annotation.o0 NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.b(this.f25793b, notificationChannelGroup);
        }
    }

    public void i(@androidx.annotation.o0 b0 b0Var) {
        h(b0Var.f());
    }

    public void j(@androidx.annotation.o0 List<NotificationChannelGroup> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.c(this.f25793b, list);
        }
    }

    public void k(@androidx.annotation.o0 List<b0> list) {
        if (Build.VERSION.SDK_INT < 26 || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<b0> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f());
        }
        c.c(this.f25793b, arrayList);
    }

    public void l(@androidx.annotation.o0 List<NotificationChannel> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.d(this.f25793b, list);
        }
    }

    public void m(@androidx.annotation.o0 List<z> list) {
        if (Build.VERSION.SDK_INT < 26 || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<z> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m());
        }
        c.d(this.f25793b, arrayList);
    }

    public void n(@androidx.annotation.o0 String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.e(this.f25793b, str);
        }
    }

    public void o(@androidx.annotation.o0 String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.f(this.f25793b, str);
        }
    }

    public void p(@androidx.annotation.o0 Collection<String> collection) {
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator<NotificationChannel> it = c.k(this.f25793b).iterator();
            while (it.hasNext()) {
                NotificationChannel a5 = a0.a(it.next());
                if (!collection.contains(c.g(a5)) && (Build.VERSION.SDK_INT < 30 || !collection.contains(e.b(a5)))) {
                    c.e(this.f25793b, c.g(a5));
                }
            }
        }
    }

    @androidx.annotation.o0
    public List<StatusBarNotification> r() {
        return a.a(this.f25793b);
    }

    public int s() {
        return this.f25793b.getCurrentInterruptionFilter();
    }

    public int u() {
        return this.f25793b.getImportance();
    }

    @androidx.annotation.q0
    public NotificationChannel v(@androidx.annotation.o0 String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.i(this.f25793b, str);
        }
        return null;
    }

    @androidx.annotation.q0
    public NotificationChannel w(@androidx.annotation.o0 String str, @androidx.annotation.o0 String str2) {
        return Build.VERSION.SDK_INT >= 30 ? e.a(this.f25793b, str, str2) : v(str);
    }

    @androidx.annotation.q0
    public z x(@androidx.annotation.o0 String str) {
        NotificationChannel v4;
        if (Build.VERSION.SDK_INT < 26 || (v4 = v(str)) == null) {
            return null;
        }
        return new z(v4);
    }

    @androidx.annotation.q0
    public z y(@androidx.annotation.o0 String str, @androidx.annotation.o0 String str2) {
        NotificationChannel w4;
        if (Build.VERSION.SDK_INT < 26 || (w4 = w(str, str2)) == null) {
            return null;
        }
        return new z(w4);
    }

    @androidx.annotation.q0
    public NotificationChannelGroup z(@androidx.annotation.o0 String str) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            return d.a(this.f25793b, str);
        }
        if (i4 >= 26) {
            Iterator<NotificationChannelGroup> it = B().iterator();
            while (it.hasNext()) {
                NotificationChannelGroup a5 = j0.a(it.next());
                if (c.h(a5).equals(str)) {
                    return a5;
                }
            }
        }
        return null;
    }

    /* compiled from: NotificationManagerCompat.java */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        final String f25798a;

        /* renamed from: b, reason: collision with root package name */
        final int f25799b;

        /* renamed from: c, reason: collision with root package name */
        Notification f25800c;

        public i(@androidx.annotation.q0 String str, int i4, @androidx.annotation.o0 Notification notification) {
            this.f25798a = str;
            this.f25799b = i4;
            this.f25800c = notification;
        }

        public i(int i4, @androidx.annotation.o0 Notification notification) {
            this(null, i4, notification);
        }
    }

    @m1
    k0(@androidx.annotation.o0 NotificationManager notificationManager, @androidx.annotation.o0 Context context) {
        this.f25792a = context;
        this.f25793b = notificationManager;
    }

    /* compiled from: NotificationManagerCompat.java */
    private static class g implements m {

        /* renamed from: a, reason: collision with root package name */
        final String f25794a;

        /* renamed from: b, reason: collision with root package name */
        final int f25795b;

        /* renamed from: c, reason: collision with root package name */
        final String f25796c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f25797d;

        g(String str) {
            this.f25794a = str;
            this.f25795b = 0;
            this.f25796c = null;
            this.f25797d = true;
        }

        @Override // androidx.core.app.k0.m
        public void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            if (this.f25797d) {
                iNotificationSideChannel.cancelAll(this.f25794a);
            } else {
                iNotificationSideChannel.cancel(this.f25794a, this.f25795b, this.f25796c);
            }
        }

        @androidx.annotation.o0
        public String toString() {
            StringBuilder sb = new StringBuilder("CancelTask[packageName:");
            sb.append(this.f25794a);
            sb.append(", id:");
            sb.append(this.f25795b);
            sb.append(", tag:");
            sb.append(this.f25796c);
            sb.append(", all:");
            return androidx.appcompat.app.h.a(sb, this.f25797d, "]");
        }

        g(String str, int i4, String str2) {
            this.f25794a = str;
            this.f25795b = i4;
            this.f25796c = str2;
            this.f25797d = false;
        }
    }
}
