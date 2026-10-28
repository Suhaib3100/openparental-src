package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* compiled from: NotificationChannelCompat.java */
/* loaded from: classes.dex */
public class c1 {

    /* renamed from: s, reason: collision with root package name */
    public static final String f4017s = "miscellaneous";

    /* renamed from: t, reason: collision with root package name */
    private static final boolean f4018t = true;

    /* renamed from: u, reason: collision with root package name */
    private static final int f4019u = 0;

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.o0
    final String f4020a;

    /* renamed from: b, reason: collision with root package name */
    CharSequence f4021b;

    /* renamed from: c, reason: collision with root package name */
    int f4022c;

    /* renamed from: d, reason: collision with root package name */
    String f4023d;

    /* renamed from: e, reason: collision with root package name */
    String f4024e;

    /* renamed from: f, reason: collision with root package name */
    boolean f4025f;

    /* renamed from: g, reason: collision with root package name */
    Uri f4026g;

    /* renamed from: h, reason: collision with root package name */
    AudioAttributes f4027h;

    /* renamed from: i, reason: collision with root package name */
    boolean f4028i;

    /* renamed from: j, reason: collision with root package name */
    int f4029j;

    /* renamed from: k, reason: collision with root package name */
    boolean f4030k;

    /* renamed from: l, reason: collision with root package name */
    long[] f4031l;

    /* renamed from: m, reason: collision with root package name */
    String f4032m;

    /* renamed from: n, reason: collision with root package name */
    String f4033n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f4034o;

    /* renamed from: p, reason: collision with root package name */
    private int f4035p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f4036q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f4037r;

    /* compiled from: NotificationChannelCompat.java */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final c1 f4038a;

        public a(@androidx.annotation.o0 String str, int i5) {
            this.f4038a = new c1(str, i5);
        }

        @androidx.annotation.o0
        public c1 a() {
            return this.f4038a;
        }

        @androidx.annotation.o0
        public a b(@androidx.annotation.o0 String str, @androidx.annotation.o0 String str2) {
            if (Build.VERSION.SDK_INT >= 30) {
                c1 c1Var = this.f4038a;
                c1Var.f4032m = str;
                c1Var.f4033n = str2;
            }
            return this;
        }

        @androidx.annotation.o0
        public a c(@androidx.annotation.q0 String str) {
            this.f4038a.f4023d = str;
            return this;
        }

        @androidx.annotation.o0
        public a d(@androidx.annotation.q0 String str) {
            this.f4038a.f4024e = str;
            return this;
        }

        @androidx.annotation.o0
        public a e(int i5) {
            this.f4038a.f4022c = i5;
            return this;
        }

        @androidx.annotation.o0
        public a f(int i5) {
            this.f4038a.f4029j = i5;
            return this;
        }

        @androidx.annotation.o0
        public a g(boolean z5) {
            this.f4038a.f4028i = z5;
            return this;
        }

        @androidx.annotation.o0
        public a h(@androidx.annotation.q0 CharSequence charSequence) {
            this.f4038a.f4021b = charSequence;
            return this;
        }

        @androidx.annotation.o0
        public a i(boolean z5) {
            this.f4038a.f4025f = z5;
            return this;
        }

        @androidx.annotation.o0
        public a j(@androidx.annotation.q0 Uri uri, @androidx.annotation.q0 AudioAttributes audioAttributes) {
            c1 c1Var = this.f4038a;
            c1Var.f4026g = uri;
            c1Var.f4027h = audioAttributes;
            return this;
        }

        @androidx.annotation.o0
        public a k(boolean z5) {
            this.f4038a.f4030k = z5;
            return this;
        }

        @androidx.annotation.o0
        public a l(@androidx.annotation.q0 long[] jArr) {
            c1 c1Var = this.f4038a;
            c1Var.f4030k = (jArr == null || jArr.length <= 0) ? false : c1.f4018t;
            c1Var.f4031l = jArr;
            return this;
        }
    }

    c1(@androidx.annotation.o0 String str, int i5) {
        this.f4025f = f4018t;
        this.f4026g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f4029j = 0;
        str.getClass();
        this.f4020a = str;
        this.f4022c = i5;
        this.f4027h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public boolean a() {
        return this.f4036q;
    }

    public boolean b() {
        return this.f4034o;
    }

    public boolean c() {
        return this.f4025f;
    }

    @androidx.annotation.q0
    public AudioAttributes d() {
        return this.f4027h;
    }

    @androidx.annotation.q0
    public String e() {
        return this.f4033n;
    }

    @androidx.annotation.q0
    public String f() {
        return this.f4023d;
    }

    @androidx.annotation.q0
    public String g() {
        return this.f4024e;
    }

    @androidx.annotation.o0
    public String h() {
        return this.f4020a;
    }

    public int i() {
        return this.f4022c;
    }

    public int j() {
        return this.f4029j;
    }

    public int k() {
        return this.f4035p;
    }

    @androidx.annotation.q0
    public CharSequence l() {
        return this.f4021b;
    }

    NotificationChannel m() {
        String str;
        String str2;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 26) {
            return null;
        }
        NotificationChannel notificationChannel = new NotificationChannel(this.f4020a, this.f4021b, this.f4022c);
        notificationChannel.setDescription(this.f4023d);
        notificationChannel.setGroup(this.f4024e);
        notificationChannel.setShowBadge(this.f4025f);
        notificationChannel.setSound(this.f4026g, this.f4027h);
        notificationChannel.enableLights(this.f4028i);
        notificationChannel.setLightColor(this.f4029j);
        notificationChannel.setVibrationPattern(this.f4031l);
        notificationChannel.enableVibration(this.f4030k);
        if (i5 >= 30 && (str = this.f4032m) != null && (str2 = this.f4033n) != null) {
            notificationChannel.setConversationId(str, str2);
        }
        return notificationChannel;
    }

    @androidx.annotation.q0
    public String n() {
        return this.f4032m;
    }

    @androidx.annotation.q0
    public Uri o() {
        return this.f4026g;
    }

    @androidx.annotation.q0
    public long[] p() {
        return this.f4031l;
    }

    public boolean q() {
        return this.f4037r;
    }

    public boolean r() {
        return this.f4028i;
    }

    public boolean s() {
        return this.f4030k;
    }

    @androidx.annotation.o0
    public a t() {
        return new a(this.f4020a, this.f4022c).h(this.f4021b).c(this.f4023d).d(this.f4024e).i(this.f4025f).j(this.f4026g, this.f4027h).g(this.f4028i).f(this.f4029j).k(this.f4030k).l(this.f4031l).b(this.f4032m, this.f4033n);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @androidx.annotation.x0(26)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    c1(@androidx.annotation.o0 android.app.NotificationChannel r4) {
        /*
            r3 = this;
            java.lang.String r0 = androidx.core.app.b0.a(r4)
            int r1 = androidx.core.app.b1.a(r4)
            r3.<init>(r0, r1)
            java.lang.CharSequence r0 = androidx.core.app.c0.a(r4)
            r3.f4021b = r0
            java.lang.String r0 = androidx.core.app.d0.a(r4)
            r3.f4023d = r0
            java.lang.String r0 = androidx.core.app.e0.a(r4)
            r3.f4024e = r0
            boolean r0 = androidx.core.app.f0.a(r4)
            r3.f4025f = r0
            android.net.Uri r0 = androidx.core.app.g0.a(r4)
            r3.f4026g = r0
            android.media.AudioAttributes r0 = androidx.core.app.h0.a(r4)
            r3.f4027h = r0
            boolean r0 = androidx.core.app.i0.a(r4)
            r3.f4028i = r0
            int r0 = androidx.core.app.j0.a(r4)
            r3.f4029j = r0
            boolean r0 = androidx.core.app.m0.a(r4)
            r3.f4030k = r0
            long[] r0 = androidx.core.app.u0.a(r4)
            r3.f4031l = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L59
            java.lang.String r2 = androidx.core.app.v0.a(r4)
            r3.f4032m = r2
            java.lang.String r2 = androidx.core.app.w0.a(r4)
            r3.f4033n = r2
        L59:
            boolean r2 = androidx.core.app.x0.a(r4)
            r3.f4034o = r2
            int r2 = androidx.core.app.y0.a(r4)
            r3.f4035p = r2
            r2 = 29
            if (r0 < r2) goto L6f
            boolean r2 = androidx.core.app.z0.a(r4)
            r3.f4036q = r2
        L6f:
            if (r0 < r1) goto L77
            boolean r4 = androidx.core.app.a1.a(r4)
            r3.f4037r = r4
        L77:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.c1.<init>(android.app.NotificationChannel):void");
    }
}
