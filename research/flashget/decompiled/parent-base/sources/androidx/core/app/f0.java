package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.annotation.c1;
import androidx.core.app.d0;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: NotificationCompatBuilder.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
class f0 implements y {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25716a;

    /* renamed from: b, reason: collision with root package name */
    private final Notification.Builder f25717b;

    /* renamed from: c, reason: collision with root package name */
    private final d0.n f25718c;

    /* renamed from: d, reason: collision with root package name */
    private RemoteViews f25719d;

    /* renamed from: e, reason: collision with root package name */
    private RemoteViews f25720e;

    /* renamed from: f, reason: collision with root package name */
    private final List<Bundle> f25721f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f25722g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private int f25723h;

    /* renamed from: i, reason: collision with root package name */
    private RemoteViews f25724i;

    /* compiled from: NotificationCompatBuilder.java */
    @androidx.annotation.x0(20)
    static class a {
        private a() {
        }

        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder e(int i4, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i4, charSequence, pendingIntent);
        }

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z4) {
            return builder.setGroupSummary(z4);
        }

        static Notification.Builder i(Notification.Builder builder, boolean z4) {
            return builder.setLocalOnly(z4);
        }

        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    @androidx.annotation.x0(21)
    static class b {
        private b() {
        }

        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i4) {
            return builder.setColor(i4);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i4) {
            return builder.setVisibility(i4);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    @androidx.annotation.x0(23)
    static class c {
        private c() {
        }

        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    @androidx.annotation.x0(24)
    static class d {
        private d() {
        }

        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z4) {
            return builder.setAllowGeneratedReplies(z4);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    @androidx.annotation.x0(26)
    static class e {
        private e() {
        }

        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i4) {
            return builder.setBadgeIconType(i4);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z4) {
            return builder.setColorized(z4);
        }

        static Notification.Builder d(Notification.Builder builder, int i4) {
            return builder.setGroupAlertBehavior(i4);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j4) {
            return builder.setTimeoutAfter(j4);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    @androidx.annotation.x0(28)
    static class f {
        private f() {
        }

        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i4) {
            return builder.setSemanticAction(i4);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    @androidx.annotation.x0(29)
    static class g {
        private g() {
        }

        static Notification.Builder a(Notification.Builder builder, boolean z4) {
            return builder.setAllowSystemGeneratedContextualActions(z4);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z4) {
            return builder.setContextual(z4);
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    /* compiled from: NotificationCompatBuilder.java */
    @androidx.annotation.x0(31)
    static class h {
        private h() {
        }

        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z4) {
            return builder.setAuthenticationRequired(z4);
        }

        static Notification.Builder b(Notification.Builder builder, int i4) {
            return builder.setForegroundServiceBehavior(i4);
        }
    }

    f0(d0.n nVar) {
        int i4;
        this.f25718c = nVar;
        Context context = nVar.f25581a;
        this.f25716a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f25717b = e.a(context, nVar.L);
        } else {
            this.f25717b = new Notification.Builder(nVar.f25581a);
        }
        Notification notification = nVar.U;
        this.f25717b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, nVar.f25589i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(nVar.f25585e).setContentText(nVar.f25586f).setContentInfo(nVar.f25591k).setContentIntent(nVar.f25587g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(nVar.f25588h, (notification.flags & 128) != 0).setNumber(nVar.f25592l).setProgress(nVar.f25601u, nVar.f25602v, nVar.f25603w);
        Notification.Builder builder = this.f25717b;
        IconCompat iconCompat = nVar.f25590j;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.K(context));
        this.f25717b.setSubText(nVar.f25598r).setUsesChronometer(nVar.f25595o).setPriority(nVar.f25593m);
        d0.y yVar = nVar.f25597q;
        if (yVar instanceof d0.o) {
            Iterator<d0.b> it = ((d0.o) yVar).D().iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        } else {
            Iterator<d0.b> it2 = nVar.f25582b.iterator();
            while (it2.hasNext()) {
                b(it2.next());
            }
        }
        Bundle bundle = nVar.E;
        if (bundle != null) {
            this.f25722g.putAll(bundle);
        }
        int i5 = Build.VERSION.SDK_INT;
        this.f25719d = nVar.I;
        this.f25720e = nVar.J;
        this.f25717b.setShowWhen(nVar.f25594n);
        this.f25717b.setLocalOnly(nVar.A);
        this.f25717b.setGroup(nVar.f25604x);
        this.f25717b.setSortKey(nVar.f25606z);
        this.f25717b.setGroupSummary(nVar.f25605y);
        this.f25723h = nVar.Q;
        this.f25717b.setCategory(nVar.D);
        this.f25717b.setColor(nVar.F);
        this.f25717b.setVisibility(nVar.G);
        this.f25717b.setPublicVersion(nVar.H);
        this.f25717b.setSound(notification.sound, notification.audioAttributes);
        List e4 = i5 < 28 ? e(g(nVar.f25583c), nVar.X) : nVar.X;
        if (e4 != null && !e4.isEmpty()) {
            Iterator it3 = e4.iterator();
            while (it3.hasNext()) {
                this.f25717b.addPerson((String) it3.next());
            }
        }
        this.f25724i = nVar.K;
        if (nVar.f25584d.size() > 0) {
            Bundle bundle2 = nVar.t().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i6 = 0; i6 < nVar.f25584d.size(); i6++) {
                bundle4.putBundle(Integer.toString(i6), h0.j(nVar.f25584d.get(i6)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            nVar.t().putBundle("android.car.EXTENSIONS", bundle2);
            this.f25722g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i7 = Build.VERSION.SDK_INT;
        Object obj = nVar.W;
        if (obj != null) {
            c.c(this.f25717b, obj);
        }
        this.f25717b.setExtras(nVar.E);
        this.f25717b.setRemoteInputHistory(nVar.f25600t);
        RemoteViews remoteViews = nVar.I;
        if (remoteViews != null) {
            this.f25717b.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = nVar.J;
        if (remoteViews2 != null) {
            this.f25717b.setCustomBigContentView(remoteViews2);
        }
        RemoteViews remoteViews3 = nVar.K;
        if (remoteViews3 != null) {
            this.f25717b.setCustomHeadsUpContentView(remoteViews3);
        }
        if (i7 >= 26) {
            e.b(this.f25717b, nVar.M);
            e.e(this.f25717b, nVar.f25599s);
            e.f(this.f25717b, nVar.N);
            e.g(this.f25717b, nVar.P);
            e.d(this.f25717b, nVar.Q);
            if (nVar.C) {
                e.c(this.f25717b, nVar.B);
            }
            if (!TextUtils.isEmpty(nVar.L)) {
                this.f25717b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i7 >= 28) {
            Iterator<r0> it4 = nVar.f25583c.iterator();
            while (it4.hasNext()) {
                f.a(this.f25717b, it4.next().k());
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            g.a(this.f25717b, nVar.S);
            g.b(this.f25717b, d0.m.k(nVar.T));
            androidx.core.content.a0 a0Var = nVar.O;
            if (a0Var != null) {
                g.d(this.f25717b, a0Var.c());
            }
        }
        if (i10 >= 31 && (i4 = nVar.R) != 0) {
            h.b(this.f25717b, i4);
        }
        if (nVar.V) {
            if (this.f25718c.f25605y) {
                this.f25723h = 2;
            } else {
                this.f25723h = 1;
            }
            this.f25717b.setVibrate(null);
            this.f25717b.setSound(null);
            int i11 = notification.defaults & (-4);
            notification.defaults = i11;
            this.f25717b.setDefaults(i11);
            if (i10 >= 26) {
                if (TextUtils.isEmpty(this.f25718c.f25604x)) {
                    this.f25717b.setGroup("silent");
                }
                e.d(this.f25717b, this.f25723h);
            }
        }
    }

    private void b(d0.b bVar) {
        IconCompat f4 = bVar.f();
        Notification.Action.Builder builder = new Notification.Action.Builder(f4 != null ? f4.J() : null, bVar.j(), bVar.a());
        if (bVar.g() != null) {
            for (RemoteInput remoteInput : t0.d(bVar.g())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = bVar.d() != null ? new Bundle(bVar.d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", bVar.b());
        int i4 = Build.VERSION.SDK_INT;
        builder.setAllowGeneratedReplies(bVar.b());
        bundle.putInt("android.support.action.semanticAction", bVar.h());
        if (i4 >= 28) {
            f.b(builder, bVar.h());
        }
        if (i4 >= 29) {
            g.c(builder, bVar.l());
        }
        if (i4 >= 31) {
            h.a(builder, bVar.k());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", bVar.i());
        builder.addExtras(bundle);
        this.f25717b.addAction(builder.build());
    }

    @androidx.annotation.q0
    private static List<String> e(@androidx.annotation.q0 List<String> list, @androidx.annotation.q0 List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.d dVar = new androidx.collection.d(list2.size() + list.size());
        dVar.addAll(list);
        dVar.addAll(list2);
        return new ArrayList(dVar);
    }

    @androidx.annotation.q0
    private static List<String> g(@androidx.annotation.q0 List<r0> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<r0> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().j());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // androidx.core.app.y
    public Notification.Builder a() {
        return this.f25717b;
    }

    public Notification c() {
        Bundle bundle;
        RemoteViews x4;
        RemoteViews v4;
        d0.y yVar = this.f25718c.f25597q;
        if (yVar != null) {
            yVar.b(this);
        }
        RemoteViews w4 = yVar != null ? yVar.w(this) : null;
        Notification d5 = d();
        if (w4 != null) {
            d5.contentView = w4;
        } else {
            RemoteViews remoteViews = this.f25718c.I;
            if (remoteViews != null) {
                d5.contentView = remoteViews;
            }
        }
        if (yVar != null && (v4 = yVar.v(this)) != null) {
            d5.bigContentView = v4;
        }
        if (yVar != null && (x4 = this.f25718c.f25597q.x(this)) != null) {
            d5.headsUpContentView = x4;
        }
        if (yVar != null && (bundle = d5.extras) != null) {
            yVar.a(bundle);
        }
        return d5;
    }

    protected Notification d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f25717b.build();
        }
        Notification build = this.f25717b.build();
        if (this.f25723h != 0) {
            if (build.getGroup() != null && (build.flags & 512) != 0 && this.f25723h == 2) {
                h(build);
            }
            if (build.getGroup() != null && (build.flags & 512) == 0 && this.f25723h == 1) {
                h(build);
            }
        }
        return build;
    }

    Context f() {
        return this.f25716a;
    }
}
