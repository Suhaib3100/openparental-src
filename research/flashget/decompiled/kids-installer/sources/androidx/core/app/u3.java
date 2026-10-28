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
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
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
/* loaded from: classes.dex */
public final class u3 {

    /* renamed from: h, reason: collision with root package name */
    static final int f4186h = 19;

    /* renamed from: i, reason: collision with root package name */
    private static final int f4187i = 1000;

    /* renamed from: j, reason: collision with root package name */
    private static final int f4188j = 6;

    /* renamed from: m, reason: collision with root package name */
    @androidx.annotation.b0("sEnabledNotificationListenersLock")
    private static String f4191m = null;

    /* renamed from: p, reason: collision with root package name */
    @androidx.annotation.b0("sLock")
    private static d f4194p = null;

    /* renamed from: q, reason: collision with root package name */
    public static final int f4195q = -1000;

    /* renamed from: r, reason: collision with root package name */
    public static final int f4196r = 0;

    /* renamed from: s, reason: collision with root package name */
    public static final int f4197s = 1;

    /* renamed from: t, reason: collision with root package name */
    public static final int f4198t = 2;

    /* renamed from: u, reason: collision with root package name */
    public static final int f4199u = 3;

    /* renamed from: v, reason: collision with root package name */
    public static final int f4200v = 4;

    /* renamed from: w, reason: collision with root package name */
    public static final int f4201w = 5;

    /* renamed from: a, reason: collision with root package name */
    private final Context f4202a;

    /* renamed from: b, reason: collision with root package name */
    private final NotificationManager f4203b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f4181c = "NotifManCompat";

    /* renamed from: d, reason: collision with root package name */
    private static final String f4182d = "checkOpNoThrow";

    /* renamed from: e, reason: collision with root package name */
    private static final String f4183e = "OP_POST_NOTIFICATION";

    /* renamed from: f, reason: collision with root package name */
    public static final String f4184f = "android.support.useSideChannel";

    /* renamed from: g, reason: collision with root package name */
    public static final String f4185g = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";

    /* renamed from: k, reason: collision with root package name */
    private static final String f4189k = "enabled_notification_listeners";

    /* renamed from: l, reason: collision with root package name */
    private static final Object f4190l = new Object();

    /* renamed from: n, reason: collision with root package name */
    @androidx.annotation.b0("sEnabledNotificationListenersLock")
    private static Set<String> f4192n = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    private static final Object f4193o = new Object();

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes3.dex */
    private static class b implements e {

        /* renamed from: a, reason: collision with root package name */
        final String f4208a;

        /* renamed from: b, reason: collision with root package name */
        final int f4209b;

        /* renamed from: c, reason: collision with root package name */
        final String f4210c;

        /* renamed from: d, reason: collision with root package name */
        final Notification f4211d;

        b(String str, int i5, String str2, Notification notification) {
            this.f4208a = str;
            this.f4209b = i5;
            this.f4210c = str2;
            this.f4211d = notification;
        }

        @Override // androidx.core.app.u3.e
        public void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            iNotificationSideChannel.notify(this.f4208a, this.f4209b, this.f4210c, this.f4211d);
        }

        @androidx.annotation.o0
        public String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
            sb.append(this.f4208a);
            sb.append(", id:");
            sb.append(this.f4209b);
            sb.append(", tag:");
            return androidx.concurrent.futures.a.a(sb, this.f4210c, "]");
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final ComponentName f4212a;

        /* renamed from: b, reason: collision with root package name */
        final IBinder f4213b;

        c(ComponentName componentName, IBinder iBinder) {
            this.f4212a = componentName;
            this.f4213b = iBinder;
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    private static class d implements Handler.Callback, ServiceConnection {

        /* renamed from: f, reason: collision with root package name */
        private static final int f4214f = 0;

        /* renamed from: g, reason: collision with root package name */
        private static final int f4215g = 1;

        /* renamed from: h, reason: collision with root package name */
        private static final int f4216h = 2;

        /* renamed from: i, reason: collision with root package name */
        private static final int f4217i = 3;

        /* renamed from: a, reason: collision with root package name */
        private final Context f4218a;

        /* renamed from: b, reason: collision with root package name */
        private final HandlerThread f4219b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f4220c;

        /* renamed from: d, reason: collision with root package name */
        private final Map<ComponentName, a> f4221d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        private Set<String> f4222e = new HashSet();

        /* compiled from: NotificationManagerCompat.java */
        private static class a {

            /* renamed from: a, reason: collision with root package name */
            final ComponentName f4223a;

            /* renamed from: c, reason: collision with root package name */
            INotificationSideChannel f4225c;

            /* renamed from: b, reason: collision with root package name */
            boolean f4224b = false;

            /* renamed from: d, reason: collision with root package name */
            ArrayDeque<e> f4226d = new ArrayDeque<>();

            /* renamed from: e, reason: collision with root package name */
            int f4227e = 0;

            a(ComponentName componentName) {
                this.f4223a = componentName;
            }
        }

        d(Context context) {
            this.f4218a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f4219b = handlerThread;
            handlerThread.start();
            this.f4220c = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f4224b) {
                return true;
            }
            boolean bindService = this.f4218a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f4223a), this, 33);
            aVar.f4224b = bindService;
            if (bindService) {
                aVar.f4227e = 0;
            } else {
                Objects.toString(aVar.f4223a);
                this.f4218a.unbindService(this);
            }
            return aVar.f4224b;
        }

        private void b(a aVar) {
            if (aVar.f4224b) {
                this.f4218a.unbindService(this);
                aVar.f4224b = false;
            }
            aVar.f4225c = null;
        }

        private void c(e eVar) {
            j();
            for (a aVar : this.f4221d.values()) {
                aVar.f4226d.add(eVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.f4221d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f4221d.get(componentName);
            if (aVar != null) {
                aVar.f4225c = INotificationSideChannel.Stub.asInterface(iBinder);
                aVar.f4227e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.f4221d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(aVar.f4223a);
                aVar.f4226d.size();
            }
            if (aVar.f4226d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f4225c == null) {
                i(aVar);
                return;
            }
            while (true) {
                e peek = aVar.f4226d.peek();
                if (peek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        peek.toString();
                    }
                    peek.a(aVar.f4225c);
                    aVar.f4226d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(aVar.f4223a);
                    }
                } catch (RemoteException unused2) {
                    Objects.toString(aVar.f4223a);
                }
            }
            if (aVar.f4226d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f4220c.hasMessages(3, aVar.f4223a)) {
                return;
            }
            int i5 = aVar.f4227e + 1;
            aVar.f4227e = i5;
            if (i5 > 6) {
                aVar.f4226d.size();
                Objects.toString(aVar.f4223a);
                aVar.f4226d.clear();
            } else {
                Log.isLoggable("NotifManCompat", 3);
                this.f4220c.sendMessageDelayed(this.f4220c.obtainMessage(3, aVar.f4223a), (1 << (i5 - 1)) * 1000);
            }
        }

        private void j() {
            Set<String> q5 = u3.q(this.f4218a);
            if (q5.equals(this.f4222e)) {
                return;
            }
            this.f4222e = q5;
            List<ResolveInfo> queryIntentServices = this.f4218a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (q5.contains(resolveInfo.serviceInfo.packageName)) {
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
                if (!this.f4221d.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(componentName2);
                    }
                    this.f4221d.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it2 = this.f4221d.entrySet().iterator();
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

        public void h(e eVar) {
            this.f4220c.obtainMessage(0, eVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i5 = message.what;
            if (i5 == 0) {
                c((e) message.obj);
                return true;
            }
            if (i5 == 1) {
                c cVar = (c) message.obj;
                e(cVar.f4212a, cVar.f4213b);
                return true;
            }
            if (i5 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (i5 != 3) {
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
            this.f4220c.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
            }
            this.f4220c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    private interface e {
        void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException;
    }

    private u3(Context context) {
        this.f4202a = context;
        this.f4203b = (NotificationManager) context.getSystemService("notification");
    }

    private void E(e eVar) {
        synchronized (f4193o) {
            if (f4194p == null) {
                f4194p = new d(this.f4202a.getApplicationContext());
            }
            f4194p.h(eVar);
        }
    }

    private static boolean F(Notification notification) {
        Bundle bundle = notification.extras;
        return bundle != null && bundle.getBoolean("android.support.useSideChannel");
    }

    @androidx.annotation.o0
    public static u3 p(@androidx.annotation.o0 Context context) {
        return new u3(context);
    }

    @androidx.annotation.o0
    public static Set<String> q(@androidx.annotation.o0 Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f4190l) {
            if (string != null) {
                if (!string.equals(f4191m)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f4192n = hashSet;
                    f4191m = string;
                }
            }
            set = f4192n;
        }
        return set;
    }

    @androidx.annotation.o0
    public List<NotificationChannel> A() {
        List<NotificationChannel> notificationChannels;
        if (Build.VERSION.SDK_INT < 26) {
            return Collections.emptyList();
        }
        notificationChannels = this.f4203b.getNotificationChannels();
        return notificationChannels;
    }

    @androidx.annotation.o0
    public List<c1> B() {
        if (Build.VERSION.SDK_INT >= 26) {
            List<NotificationChannel> A = A();
            if (!A.isEmpty()) {
                ArrayList arrayList = new ArrayList(A.size());
                Iterator<NotificationChannel> it = A.iterator();
                while (it.hasNext()) {
                    arrayList.add(new c1(it.next()));
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    public void C(int i5, @androidx.annotation.o0 Notification notification) {
        D(null, i5, notification);
    }

    public void D(@androidx.annotation.q0 String str, int i5, @androidx.annotation.o0 Notification notification) {
        if (!F(notification)) {
            this.f4203b.notify(str, i5, notification);
        } else {
            E(new b(this.f4202a.getPackageName(), i5, str, notification));
            this.f4203b.cancel(str, i5);
        }
    }

    public boolean a() {
        return this.f4203b.areNotificationsEnabled();
    }

    public void b(int i5) {
        c(null, i5);
    }

    public void c(@androidx.annotation.q0 String str, int i5) {
        this.f4203b.cancel(str, i5);
    }

    public void d() {
        this.f4203b.cancelAll();
    }

    public void e(@androidx.annotation.o0 NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4203b.createNotificationChannel(notificationChannel);
        }
    }

    public void f(@androidx.annotation.o0 c1 c1Var) {
        e(c1Var.m());
    }

    public void g(@androidx.annotation.o0 NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4203b.createNotificationChannelGroup(notificationChannelGroup);
        }
    }

    public void h(@androidx.annotation.o0 j1 j1Var) {
        g(j1Var.f());
    }

    public void i(@androidx.annotation.o0 List<NotificationChannelGroup> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4203b.createNotificationChannelGroups(list);
        }
    }

    public void j(@androidx.annotation.o0 List<j1> list) {
        if (Build.VERSION.SDK_INT < 26 || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<j1> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f());
        }
        this.f4203b.createNotificationChannelGroups(arrayList);
    }

    public void k(@androidx.annotation.o0 List<NotificationChannel> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4203b.createNotificationChannels(list);
        }
    }

    public void l(@androidx.annotation.o0 List<c1> list) {
        if (Build.VERSION.SDK_INT < 26 || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<c1> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m());
        }
        this.f4203b.createNotificationChannels(arrayList);
    }

    public void m(@androidx.annotation.o0 String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4203b.deleteNotificationChannel(str);
        }
    }

    public void n(@androidx.annotation.o0 String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4203b.deleteNotificationChannelGroup(str);
        }
    }

    public void o(@androidx.annotation.o0 Collection<String> collection) {
        List<NotificationChannel> notificationChannels;
        String id;
        String id2;
        String parentChannelId;
        if (Build.VERSION.SDK_INT >= 26) {
            notificationChannels = this.f4203b.getNotificationChannels();
            for (NotificationChannel notificationChannel : notificationChannels) {
                id = notificationChannel.getId();
                if (!collection.contains(id)) {
                    if (Build.VERSION.SDK_INT >= 30) {
                        parentChannelId = notificationChannel.getParentChannelId();
                        if (collection.contains(parentChannelId)) {
                        }
                    }
                    NotificationManager notificationManager = this.f4203b;
                    id2 = notificationChannel.getId();
                    notificationManager.deleteNotificationChannel(id2);
                }
            }
        }
    }

    public int r() {
        return this.f4203b.getImportance();
    }

    @androidx.annotation.q0
    public NotificationChannel s(@androidx.annotation.o0 String str) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        notificationChannel = this.f4203b.getNotificationChannel(str);
        return notificationChannel;
    }

    @androidx.annotation.q0
    public NotificationChannel t(@androidx.annotation.o0 String str, @androidx.annotation.o0 String str2) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 30) {
            return s(str);
        }
        notificationChannel = this.f4203b.getNotificationChannel(str, str2);
        return notificationChannel;
    }

    @androidx.annotation.q0
    public c1 u(@androidx.annotation.o0 String str) {
        NotificationChannel s5;
        if (Build.VERSION.SDK_INT < 26 || (s5 = s(str)) == null) {
            return null;
        }
        return new c1(s5);
    }

    @androidx.annotation.q0
    public c1 v(@androidx.annotation.o0 String str, @androidx.annotation.o0 String str2) {
        NotificationChannel t5;
        if (Build.VERSION.SDK_INT < 26 || (t5 = t(str, str2)) == null) {
            return null;
        }
        return new c1(t5);
    }

    @androidx.annotation.q0
    public NotificationChannelGroup w(@androidx.annotation.o0 String str) {
        String id;
        NotificationChannelGroup notificationChannelGroup;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            notificationChannelGroup = this.f4203b.getNotificationChannelGroup(str);
            return notificationChannelGroup;
        }
        if (i5 >= 26) {
            for (NotificationChannelGroup notificationChannelGroup2 : y()) {
                id = notificationChannelGroup2.getId();
                if (id.equals(str)) {
                    return notificationChannelGroup2;
                }
            }
        }
        return null;
    }

    @androidx.annotation.q0
    public j1 x(@androidx.annotation.o0 String str) {
        NotificationChannelGroup w5;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            NotificationChannelGroup w6 = w(str);
            if (w6 != null) {
                return new j1(w6);
            }
            return null;
        }
        if (i5 < 26 || (w5 = w(str)) == null) {
            return null;
        }
        return new j1(w5, A());
    }

    @androidx.annotation.o0
    public List<NotificationChannelGroup> y() {
        List<NotificationChannelGroup> notificationChannelGroups;
        if (Build.VERSION.SDK_INT < 26) {
            return Collections.emptyList();
        }
        notificationChannelGroups = this.f4203b.getNotificationChannelGroups();
        return notificationChannelGroups;
    }

    @androidx.annotation.o0
    public List<j1> z() {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            List<NotificationChannelGroup> y5 = y();
            if (!y5.isEmpty()) {
                List<NotificationChannel> emptyList = i5 >= 28 ? Collections.emptyList() : A();
                ArrayList arrayList = new ArrayList(y5.size());
                for (NotificationChannelGroup notificationChannelGroup : y5) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        arrayList.add(new j1(notificationChannelGroup));
                    } else {
                        arrayList.add(new j1(notificationChannelGroup, emptyList));
                    }
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    /* compiled from: NotificationManagerCompat.java */
    /* loaded from: classes3.dex */
    private static class a implements e {

        /* renamed from: a, reason: collision with root package name */
        final String f4204a;

        /* renamed from: b, reason: collision with root package name */
        final int f4205b;

        /* renamed from: c, reason: collision with root package name */
        final String f4206c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f4207d;

        a(String str) {
            this.f4204a = str;
            this.f4205b = 0;
            this.f4206c = null;
            this.f4207d = true;
        }

        @Override // androidx.core.app.u3.e
        public void a(INotificationSideChannel iNotificationSideChannel) throws RemoteException {
            if (this.f4207d) {
                iNotificationSideChannel.cancelAll(this.f4204a);
            } else {
                iNotificationSideChannel.cancel(this.f4204a, this.f4205b, this.f4206c);
            }
        }

        @androidx.annotation.o0
        public String toString() {
            return "CancelTask[packageName:" + this.f4204a + ", id:" + this.f4205b + ", tag:" + this.f4206c + ", all:" + this.f4207d + "]";
        }

        a(String str, int i5, String str2) {
            this.f4204a = str;
            this.f4205b = i5;
            this.f4206c = str2;
            this.f4207d = false;
        }
    }
}
