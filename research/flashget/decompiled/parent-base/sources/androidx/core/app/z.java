package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* compiled from: NotificationChannelCompat.java */
/* loaded from: classes3.dex */
public class z {

    /* renamed from: s, reason: collision with root package name */
    public static final String f25943s = "miscellaneous";

    /* renamed from: t, reason: collision with root package name */
    private static final boolean f25944t = true;

    /* renamed from: u, reason: collision with root package name */
    private static final int f25945u = 0;

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.o0
    final String f25946a;

    /* renamed from: b, reason: collision with root package name */
    CharSequence f25947b;

    /* renamed from: c, reason: collision with root package name */
    int f25948c;

    /* renamed from: d, reason: collision with root package name */
    String f25949d;

    /* renamed from: e, reason: collision with root package name */
    String f25950e;

    /* renamed from: f, reason: collision with root package name */
    boolean f25951f;

    /* renamed from: g, reason: collision with root package name */
    Uri f25952g;

    /* renamed from: h, reason: collision with root package name */
    AudioAttributes f25953h;

    /* renamed from: i, reason: collision with root package name */
    boolean f25954i;

    /* renamed from: j, reason: collision with root package name */
    int f25955j;

    /* renamed from: k, reason: collision with root package name */
    boolean f25956k;

    /* renamed from: l, reason: collision with root package name */
    long[] f25957l;

    /* renamed from: m, reason: collision with root package name */
    String f25958m;

    /* renamed from: n, reason: collision with root package name */
    String f25959n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f25960o;

    /* renamed from: p, reason: collision with root package name */
    private int f25961p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f25962q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f25963r;

    /* compiled from: NotificationChannelCompat.java */
    @androidx.annotation.x0(26)
    static class a {
        private a() {
        }

        static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBypassDnd();
        }

        static boolean b(NotificationChannel notificationChannel) {
            return notificationChannel.canShowBadge();
        }

        static NotificationChannel c(String str, CharSequence charSequence, int i4) {
            return new NotificationChannel(str, charSequence, i4);
        }

        static void d(NotificationChannel notificationChannel, boolean z4) {
            notificationChannel.enableLights(z4);
        }

        static void e(NotificationChannel notificationChannel, boolean z4) {
            notificationChannel.enableVibration(z4);
        }

        static AudioAttributes f(NotificationChannel notificationChannel) {
            return notificationChannel.getAudioAttributes();
        }

        static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getDescription();
        }

        static String h(NotificationChannel notificationChannel) {
            return notificationChannel.getGroup();
        }

        static String i(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        static int j(NotificationChannel notificationChannel) {
            return notificationChannel.getImportance();
        }

        static int k(NotificationChannel notificationChannel) {
            return notificationChannel.getLightColor();
        }

        static int l(NotificationChannel notificationChannel) {
            return notificationChannel.getLockscreenVisibility();
        }

        static CharSequence m(NotificationChannel notificationChannel) {
            return notificationChannel.getName();
        }

        static Uri n(NotificationChannel notificationChannel) {
            return notificationChannel.getSound();
        }

        static long[] o(NotificationChannel notificationChannel) {
            return notificationChannel.getVibrationPattern();
        }

        static void p(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        static void q(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        static void r(NotificationChannel notificationChannel, int i4) {
            notificationChannel.setLightColor(i4);
        }

        static void s(NotificationChannel notificationChannel, boolean z4) {
            notificationChannel.setShowBadge(z4);
        }

        static void t(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        static void u(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }

        static boolean v(NotificationChannel notificationChannel) {
            return notificationChannel.shouldShowLights();
        }

        static boolean w(NotificationChannel notificationChannel) {
            return notificationChannel.shouldVibrate();
        }
    }

    /* compiled from: NotificationChannelCompat.java */
    @androidx.annotation.x0(29)
    static class b {
        private b() {
        }

        static boolean a(NotificationChannel notificationChannel) {
            return notificationChannel.canBubble();
        }
    }

    /* compiled from: NotificationChannelCompat.java */
    @androidx.annotation.x0(30)
    static class c {
        private c() {
        }

        static String a(NotificationChannel notificationChannel) {
            return notificationChannel.getConversationId();
        }

        static String b(NotificationChannel notificationChannel) {
            return notificationChannel.getParentChannelId();
        }

        static boolean c(NotificationChannel notificationChannel) {
            return notificationChannel.isImportantConversation();
        }

        static void d(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }
    }

    /* compiled from: NotificationChannelCompat.java */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final z f25964a;

        public d(@androidx.annotation.o0 String str, int i4) {
            this.f25964a = new z(str, i4);
        }

        @androidx.annotation.o0
        public z a() {
            return this.f25964a;
        }

        @androidx.annotation.o0
        public d b(@androidx.annotation.o0 String str, @androidx.annotation.o0 String str2) {
            if (Build.VERSION.SDK_INT >= 30) {
                z zVar = this.f25964a;
                zVar.f25958m = str;
                zVar.f25959n = str2;
            }
            return this;
        }

        @androidx.annotation.o0
        public d c(@androidx.annotation.q0 String str) {
            this.f25964a.f25949d = str;
            return this;
        }

        @androidx.annotation.o0
        public d d(@androidx.annotation.q0 String str) {
            this.f25964a.f25950e = str;
            return this;
        }

        @androidx.annotation.o0
        public d e(int i4) {
            this.f25964a.f25948c = i4;
            return this;
        }

        @androidx.annotation.o0
        public d f(int i4) {
            this.f25964a.f25955j = i4;
            return this;
        }

        @androidx.annotation.o0
        public d g(boolean z4) {
            this.f25964a.f25954i = z4;
            return this;
        }

        @androidx.annotation.o0
        public d h(@androidx.annotation.q0 CharSequence charSequence) {
            this.f25964a.f25947b = charSequence;
            return this;
        }

        @androidx.annotation.o0
        public d i(boolean z4) {
            this.f25964a.f25951f = z4;
            return this;
        }

        @androidx.annotation.o0
        public d j(@androidx.annotation.q0 Uri uri, @androidx.annotation.q0 AudioAttributes audioAttributes) {
            z zVar = this.f25964a;
            zVar.f25952g = uri;
            zVar.f25953h = audioAttributes;
            return this;
        }

        @androidx.annotation.o0
        public d k(boolean z4) {
            this.f25964a.f25956k = z4;
            return this;
        }

        @androidx.annotation.o0
        public d l(@androidx.annotation.q0 long[] jArr) {
            z zVar = this.f25964a;
            zVar.f25956k = jArr != null && jArr.length > 0;
            zVar.f25957l = jArr;
            return this;
        }
    }

    z(@androidx.annotation.o0 String str, int i4) {
        this.f25951f = true;
        this.f25952g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f25955j = 0;
        str.getClass();
        this.f25946a = str;
        this.f25948c = i4;
        this.f25953h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public boolean a() {
        return this.f25962q;
    }

    public boolean b() {
        return this.f25960o;
    }

    public boolean c() {
        return this.f25951f;
    }

    @androidx.annotation.q0
    public AudioAttributes d() {
        return this.f25953h;
    }

    @androidx.annotation.q0
    public String e() {
        return this.f25959n;
    }

    @androidx.annotation.q0
    public String f() {
        return this.f25949d;
    }

    @androidx.annotation.q0
    public String g() {
        return this.f25950e;
    }

    @androidx.annotation.o0
    public String h() {
        return this.f25946a;
    }

    public int i() {
        return this.f25948c;
    }

    public int j() {
        return this.f25955j;
    }

    public int k() {
        return this.f25961p;
    }

    @androidx.annotation.q0
    public CharSequence l() {
        return this.f25947b;
    }

    NotificationChannel m() {
        String str;
        String str2;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 26) {
            return null;
        }
        NotificationChannel c5 = a.c(this.f25946a, this.f25947b, this.f25948c);
        a.p(c5, this.f25949d);
        a.q(c5, this.f25950e);
        a.s(c5, this.f25951f);
        a.t(c5, this.f25952g, this.f25953h);
        a.d(c5, this.f25954i);
        a.r(c5, this.f25955j);
        a.u(c5, this.f25957l);
        a.e(c5, this.f25956k);
        if (i4 >= 30 && (str = this.f25958m) != null && (str2 = this.f25959n) != null) {
            c.d(c5, str, str2);
        }
        return c5;
    }

    @androidx.annotation.q0
    public String n() {
        return this.f25958m;
    }

    @androidx.annotation.q0
    public Uri o() {
        return this.f25952g;
    }

    @androidx.annotation.q0
    public long[] p() {
        return this.f25957l;
    }

    public boolean q() {
        return this.f25963r;
    }

    public boolean r() {
        return this.f25954i;
    }

    public boolean s() {
        return this.f25956k;
    }

    @androidx.annotation.o0
    public d t() {
        return new d(this.f25946a, this.f25948c).h(this.f25947b).c(this.f25949d).d(this.f25950e).i(this.f25951f).j(this.f25952g, this.f25953h).g(this.f25954i).f(this.f25955j).k(this.f25956k).l(this.f25957l).b(this.f25958m, this.f25959n);
    }

    @androidx.annotation.x0(26)
    z(@androidx.annotation.o0 NotificationChannel notificationChannel) {
        this(a.i(notificationChannel), a.j(notificationChannel));
        this.f25947b = a.m(notificationChannel);
        this.f25949d = a.g(notificationChannel);
        this.f25950e = a.h(notificationChannel);
        this.f25951f = a.b(notificationChannel);
        this.f25952g = a.n(notificationChannel);
        this.f25953h = a.f(notificationChannel);
        this.f25954i = a.v(notificationChannel);
        this.f25955j = a.k(notificationChannel);
        this.f25956k = a.w(notificationChannel);
        this.f25957l = a.o(notificationChannel);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            this.f25958m = c.b(notificationChannel);
            this.f25959n = c.a(notificationChannel);
        }
        this.f25960o = a.a(notificationChannel);
        this.f25961p = a.l(notificationChannel);
        if (i4 >= 29) {
            this.f25962q = b.a(notificationChannel);
        }
        if (i4 >= 30) {
            this.f25963r = c.c(notificationChannel);
        }
    }
}
