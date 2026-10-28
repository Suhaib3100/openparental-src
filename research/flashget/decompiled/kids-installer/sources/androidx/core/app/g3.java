package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.annotation.c1;
import androidx.core.app.x1;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: NotificationCompatBuilder.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
class g3 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4066a;

    /* renamed from: b, reason: collision with root package name */
    private final Notification.Builder f4067b;

    /* renamed from: c, reason: collision with root package name */
    private final x1.g f4068c;

    /* renamed from: d, reason: collision with root package name */
    private RemoteViews f4069d;

    /* renamed from: e, reason: collision with root package name */
    private RemoteViews f4070e;

    /* renamed from: f, reason: collision with root package name */
    private final List<Bundle> f4071f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f4072g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private int f4073h;

    /* renamed from: i, reason: collision with root package name */
    private RemoteViews f4074i;

    g3(x1.g gVar) {
        int i5;
        this.f4068c = gVar;
        this.f4066a = gVar.f4383a;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f4067b = new Notification.Builder(gVar.f4383a, gVar.L);
        } else {
            this.f4067b = new Notification.Builder(gVar.f4383a);
        }
        Notification notification = gVar.U;
        this.f4067b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, gVar.f4391i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(gVar.f4387e).setContentText(gVar.f4388f).setContentInfo(gVar.f4393k).setContentIntent(gVar.f4389g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(gVar.f4390h, (notification.flags & 128) != 0).setLargeIcon(gVar.f4392j).setNumber(gVar.f4394l).setProgress(gVar.f4403u, gVar.f4404v, gVar.f4405w);
        this.f4067b.setSubText(gVar.f4400r).setUsesChronometer(gVar.f4397o).setPriority(gVar.f4395m);
        Iterator<x1.b> it = gVar.f4384b.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        Bundle bundle = gVar.E;
        if (bundle != null) {
            this.f4072g.putAll(bundle);
        }
        int i6 = Build.VERSION.SDK_INT;
        this.f4069d = gVar.I;
        this.f4070e = gVar.J;
        this.f4067b.setShowWhen(gVar.f4396n);
        this.f4067b.setLocalOnly(gVar.A).setGroup(gVar.f4406x).setGroupSummary(gVar.f4407y).setSortKey(gVar.f4408z);
        this.f4073h = gVar.Q;
        this.f4067b.setCategory(gVar.D).setColor(gVar.F).setVisibility(gVar.G).setPublicVersion(gVar.H).setSound(notification.sound, notification.audioAttributes);
        List e6 = i6 < 28 ? e(g(gVar.f4385c), gVar.X) : gVar.X;
        if (e6 != null && !e6.isEmpty()) {
            Iterator it2 = e6.iterator();
            while (it2.hasNext()) {
                this.f4067b.addPerson((String) it2.next());
            }
        }
        this.f4074i = gVar.K;
        if (gVar.f4386d.size() > 0) {
            Bundle bundle2 = gVar.t().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i7 = 0; i7 < gVar.f4386d.size(); i7++) {
                bundle4.putBundle(Integer.toString(i7), i3.j(gVar.f4386d.get(i7)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            gVar.t().putBundle("android.car.EXTENSIONS", bundle2);
            this.f4072g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i8 = Build.VERSION.SDK_INT;
        Icon icon = gVar.W;
        if (icon != null) {
            this.f4067b.setSmallIcon(icon);
        }
        this.f4067b.setExtras(gVar.E).setRemoteInputHistory(gVar.f4402t);
        RemoteViews remoteViews = gVar.I;
        if (remoteViews != null) {
            this.f4067b.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = gVar.J;
        if (remoteViews2 != null) {
            this.f4067b.setCustomBigContentView(remoteViews2);
        }
        RemoteViews remoteViews3 = gVar.K;
        if (remoteViews3 != null) {
            this.f4067b.setCustomHeadsUpContentView(remoteViews3);
        }
        if (i8 >= 26) {
            this.f4067b.setBadgeIconType(gVar.M).setSettingsText(gVar.f4401s).setShortcutId(gVar.N).setTimeoutAfter(gVar.P).setGroupAlertBehavior(gVar.Q);
            if (gVar.C) {
                this.f4067b.setColorized(gVar.B);
            }
            if (!TextUtils.isEmpty(gVar.L)) {
                this.f4067b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i8 >= 28) {
            Iterator<y3> it3 = gVar.f4385c.iterator();
            while (it3.hasNext()) {
                this.f4067b.addPerson(it3.next().k());
            }
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29) {
            this.f4067b.setAllowSystemGeneratedContextualActions(gVar.S);
            this.f4067b.setBubbleMetadata(x1.f.k(gVar.T));
            androidx.core.content.k kVar = gVar.O;
            if (kVar != null) {
                this.f4067b.setLocusId(kVar.c());
            }
        }
        if (i9 >= 31 && (i5 = gVar.R) != 0) {
            this.f4067b.setForegroundServiceBehavior(i5);
        }
        if (gVar.V) {
            if (this.f4068c.f4407y) {
                this.f4073h = 2;
            } else {
                this.f4073h = 1;
            }
            this.f4067b.setVibrate(null);
            this.f4067b.setSound(null);
            int i10 = notification.defaults & (-2) & (-3);
            notification.defaults = i10;
            this.f4067b.setDefaults(i10);
            if (i9 >= 26) {
                if (TextUtils.isEmpty(this.f4068c.f4406x)) {
                    this.f4067b.setGroup("silent");
                }
                this.f4067b.setGroupAlertBehavior(this.f4073h);
            }
        }
    }

    private void b(x1.b bVar) {
        IconCompat f6 = bVar.f();
        Notification.Action.Builder builder = new Notification.Action.Builder(f6 != null ? f6.F() : null, bVar.j(), bVar.a());
        if (bVar.g() != null) {
            for (RemoteInput remoteInput : v4.d(bVar.g())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = bVar.d() != null ? new Bundle(bVar.d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", bVar.b());
        int i5 = Build.VERSION.SDK_INT;
        builder.setAllowGeneratedReplies(bVar.b());
        bundle.putInt("android.support.action.semanticAction", bVar.h());
        if (i5 >= 28) {
            builder.setSemanticAction(bVar.h());
        }
        if (i5 >= 29) {
            builder.setContextual(bVar.l());
        }
        if (i5 >= 31) {
            builder.setAuthenticationRequired(bVar.k());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", bVar.i());
        builder.addExtras(bundle);
        this.f4067b.addAction(builder.build());
    }

    @androidx.annotation.q0
    private static List<String> e(@androidx.annotation.q0 List<String> list, @androidx.annotation.q0 List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.b bVar = new androidx.collection.b(list2.size() + list.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    @androidx.annotation.q0
    private static List<String> g(@androidx.annotation.q0 List<y3> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<y3> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().j());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }

    @Override // androidx.core.app.a0
    public Notification.Builder a() {
        return this.f4067b;
    }

    public Notification c() {
        Bundle bundle;
        RemoteViews x5;
        RemoteViews v5;
        x1.q qVar = this.f4068c.f4399q;
        if (qVar != null) {
            qVar.b(this);
        }
        RemoteViews w5 = qVar != null ? qVar.w(this) : null;
        Notification d6 = d();
        if (w5 != null) {
            d6.contentView = w5;
        } else {
            RemoteViews remoteViews = this.f4068c.I;
            if (remoteViews != null) {
                d6.contentView = remoteViews;
            }
        }
        if (qVar != null && (v5 = qVar.v(this)) != null) {
            d6.bigContentView = v5;
        }
        if (qVar != null && (x5 = this.f4068c.f4399q.x(this)) != null) {
            d6.headsUpContentView = x5;
        }
        if (qVar != null && (bundle = d6.extras) != null) {
            qVar.a(bundle);
        }
        return d6;
    }

    protected Notification d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f4067b.build();
        }
        Notification build = this.f4067b.build();
        if (this.f4073h != 0) {
            if (build.getGroup() != null && (build.flags & 512) != 0 && this.f4073h == 2) {
                h(build);
            }
            if (build.getGroup() != null && (build.flags & 512) == 0 && this.f4073h == 1) {
                h(build);
            }
        }
        return build;
    }

    Context f() {
        return this.f4066a;
    }
}
