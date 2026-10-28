package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.core.app.r0;
import androidx.core.app.t0;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.view.x1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import z0.a;

/* compiled from: NotificationCompat.java */
/* loaded from: classes3.dex */
public class d0 {
    public static final int A = 2;

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static final int A0 = 3;
    public static final int B0 = 1;
    public static final int C0 = 0;
    public static final int D0 = -1;
    public static final int Z0 = 0;

    /* renamed from: a1, reason: collision with root package name */
    public static final int f25424a1 = 1;

    /* renamed from: b1, reason: collision with root package name */
    public static final int f25427b1 = 2;

    /* renamed from: c1, reason: collision with root package name */
    public static final int f25430c1 = 0;

    /* renamed from: d1, reason: collision with root package name */
    public static final int f25433d1 = 1;

    /* renamed from: e1, reason: collision with root package name */
    public static final int f25436e1 = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final int f25440g = -1;

    /* renamed from: g1, reason: collision with root package name */
    public static final int f25442g1 = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f25443h = 1;

    /* renamed from: h1, reason: collision with root package name */
    public static final int f25445h1 = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final int f25446i = 2;

    /* renamed from: i1, reason: collision with root package name */
    public static final int f25448i1 = 2;

    /* renamed from: j, reason: collision with root package name */
    public static final int f25449j = 4;

    /* renamed from: k, reason: collision with root package name */
    public static final int f25451k = -1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f25453l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static final int f25455m = 2;

    /* renamed from: n, reason: collision with root package name */
    public static final int f25457n = 4;

    /* renamed from: o, reason: collision with root package name */
    public static final int f25459o = 8;

    /* renamed from: p, reason: collision with root package name */
    public static final int f25461p = 16;

    /* renamed from: q, reason: collision with root package name */
    public static final int f25463q = 32;

    /* renamed from: r, reason: collision with root package name */
    public static final int f25465r = 64;

    /* renamed from: s, reason: collision with root package name */
    @Deprecated
    public static final int f25467s = 128;

    /* renamed from: t, reason: collision with root package name */
    public static final int f25469t = 256;

    /* renamed from: u, reason: collision with root package name */
    public static final int f25471u = 512;

    /* renamed from: v, reason: collision with root package name */
    public static final int f25473v = 4096;

    /* renamed from: w, reason: collision with root package name */
    public static final int f25475w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static final int f25477x = -1;

    /* renamed from: y, reason: collision with root package name */
    public static final int f25479y = -2;

    /* renamed from: z, reason: collision with root package name */
    public static final int f25481z = 1;

    /* renamed from: z0, reason: collision with root package name */
    @androidx.annotation.l
    public static final int f25482z0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25458n0 = "android.callPerson";
    public static final String M0 = "social";

    /* renamed from: j0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25450j0 = "android.messages.historic";
    public static final String I0 = "event";

    /* renamed from: f0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25438f0 = "android.selfDisplayName";
    public static final String E0 = "call";

    /* renamed from: f1, reason: collision with root package name */
    public static final String f25439f1 = "silent";

    /* renamed from: b0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25426b0 = "android.people.list";

    /* renamed from: w0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25476w0 = "android.declineColor";
    public static final String V0 = "location_sharing";

    /* renamed from: s0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25468s0 = "android.answerIntent";
    public static final String R0 = "reminder";

    /* renamed from: o0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25460o0 = "android.callPersonCompat";
    public static final String N0 = "err";

    /* renamed from: k0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25452k0 = "android.isGroupConversation";
    public static final String J0 = "promo";

    /* renamed from: g0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25441g0 = "android.messagingStyleUser";
    public static final String F0 = "navigation";

    /* renamed from: c0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25429c0 = "android.backgroundImageUri";

    /* renamed from: x0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25478x0 = "android.hiddenConversationTitle";
    public static final String W0 = "stopwatch";

    /* renamed from: t0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25470t0 = "android.declineIntent";
    public static final String S0 = "recommendation";

    /* renamed from: p0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25462p0 = "android.verificationIcon";
    public static final String O0 = "transport";

    @SuppressLint({"ActionValue"})
    public static final String B = "android.title";

    @SuppressLint({"ActionValue"})
    public static final String C = "android.title.big";

    @SuppressLint({"ActionValue"})
    public static final String D = "android.text";

    /* renamed from: l0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25454l0 = "android.callType";

    @SuppressLint({"ActionValue"})
    public static final String E = "android.subText";
    public static final String K0 = "alarm";

    @SuppressLint({"ActionValue"})
    public static final String F = "android.remoteInputHistory";

    @SuppressLint({"ActionValue"})
    public static final String G = "android.infoText";

    @SuppressLint({"ActionValue"})
    public static final String H = "android.summaryText";

    /* renamed from: h0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25444h0 = "android.conversationTitle";
    public static final String G0 = "msg";

    @SuppressLint({"ActionValue"})
    public static final String I = "android.bigText";

    @SuppressLint({"ActionValue"})
    public static final String J = "android.icon";

    @SuppressLint({"ActionValue"})
    public static final String K = "android.largeIcon";

    @SuppressLint({"ActionValue"})
    public static final String L = "android.largeIcon.big";

    /* renamed from: d0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25432d0 = "android.mediaSession";

    @SuppressLint({"ActionValue"})
    public static final String M = "android.progress";

    @SuppressLint({"ActionValue"})
    public static final String N = "android.progressMax";

    @SuppressLint({"ActionValue"})
    public static final String O = "android.progressIndeterminate";

    @SuppressLint({"ActionValue"})
    public static final String P = "android.showChronometer";

    @SuppressLint({"ActionValue"})
    public static final String Q = "android.chronometerCountDown";

    @SuppressLint({"ActionValue"})
    public static final String R = "android.colorized";

    @SuppressLint({"ActionValue"})
    public static final String S = "android.showWhen";

    @SuppressLint({"ActionValue"})
    public static final String T = "android.picture";

    @SuppressLint({"ActionValue"})
    public static final String U = "android.pictureIcon";

    @SuppressLint({"ActionValue"})
    public static final String V = "android.pictureContentDescription";

    @SuppressLint({"ActionValue"})
    public static final String W = "android.showBigPictureWhenCollapsed";

    /* renamed from: y0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25480y0 = "android.audioContents";

    @SuppressLint({"ActionValue"})
    public static final String X = "android.textLines";
    public static final String X0 = "missed_call";

    @SuppressLint({"ActionValue"})
    public static final String Y = "android.template";
    public static final String Z = "androidx.core.app.extra.COMPAT_TEMPLATE";

    /* renamed from: u0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25472u0 = "android.hangUpIntent";
    public static final String T0 = "status";

    /* renamed from: q0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25464q0 = "android.verificationIconCompat";
    public static final String P0 = "sys";

    /* renamed from: a, reason: collision with root package name */
    private static final String f25422a = "NotifCompat";

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25425b = "android.intent.category.NOTIFICATION_PREFERENCES";

    /* renamed from: c, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25428c = "android.intent.extra.CHANNEL_ID";

    /* renamed from: m0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25456m0 = "android.callIsVideo";
    public static final String L0 = "progress";

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25431d = "android.intent.extra.CHANNEL_GROUP_ID";

    /* renamed from: e, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25434e = "android.intent.extra.NOTIFICATION_TAG";

    /* renamed from: f, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25437f = "android.intent.extra.NOTIFICATION_ID";

    /* renamed from: i0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25447i0 = "android.messages";
    public static final String H0 = "email";

    /* renamed from: e0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25435e0 = "android.compactActions";

    /* renamed from: a0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    @Deprecated
    public static final String f25423a0 = "android.people";
    public static final String Y0 = "voicemail";

    /* renamed from: v0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25474v0 = "android.answerColor";
    public static final String U0 = "workout";

    /* renamed from: r0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f25466r0 = "android.verificationText";
    public static final String Q0 = "service";

    /* compiled from: NotificationCompat.java */
    public static class b {

        /* renamed from: m, reason: collision with root package name */
        public static final int f25509m = 0;

        /* renamed from: n, reason: collision with root package name */
        public static final int f25510n = 1;

        /* renamed from: o, reason: collision with root package name */
        public static final int f25511o = 2;

        /* renamed from: p, reason: collision with root package name */
        public static final int f25512p = 3;

        /* renamed from: q, reason: collision with root package name */
        public static final int f25513q = 4;

        /* renamed from: r, reason: collision with root package name */
        public static final int f25514r = 5;

        /* renamed from: s, reason: collision with root package name */
        public static final int f25515s = 6;

        /* renamed from: t, reason: collision with root package name */
        public static final int f25516t = 7;

        /* renamed from: u, reason: collision with root package name */
        public static final int f25517u = 8;

        /* renamed from: v, reason: collision with root package name */
        public static final int f25518v = 9;

        /* renamed from: w, reason: collision with root package name */
        public static final int f25519w = 10;

        /* renamed from: x, reason: collision with root package name */
        static final String f25520x = "android.support.action.showsUserInterface";

        /* renamed from: y, reason: collision with root package name */
        static final String f25521y = "android.support.action.semanticAction";

        /* renamed from: a, reason: collision with root package name */
        final Bundle f25522a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.q0
        private IconCompat f25523b;

        /* renamed from: c, reason: collision with root package name */
        private final t0[] f25524c;

        /* renamed from: d, reason: collision with root package name */
        private final t0[] f25525d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f25526e;

        /* renamed from: f, reason: collision with root package name */
        boolean f25527f;

        /* renamed from: g, reason: collision with root package name */
        private final int f25528g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f25529h;

        /* renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f25530i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f25531j;

        /* renamed from: k, reason: collision with root package name */
        @androidx.annotation.q0
        public PendingIntent f25532k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f25533l;

        /* compiled from: NotificationCompat.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private final IconCompat f25534a;

            /* renamed from: b, reason: collision with root package name */
            private final CharSequence f25535b;

            /* renamed from: c, reason: collision with root package name */
            private final PendingIntent f25536c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f25537d;

            /* renamed from: e, reason: collision with root package name */
            private final Bundle f25538e;

            /* renamed from: f, reason: collision with root package name */
            private ArrayList<t0> f25539f;

            /* renamed from: g, reason: collision with root package name */
            private int f25540g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f25541h;

            /* renamed from: i, reason: collision with root package name */
            private boolean f25542i;

            /* renamed from: j, reason: collision with root package name */
            private boolean f25543j;

            /* compiled from: NotificationCompat.java */
            @androidx.annotation.x0(20)
            /* renamed from: androidx.core.app.d0$b$a$a, reason: collision with other inner class name */
            static class C0402a {
                private C0402a() {
                }

                static Bundle a(Notification.Action action) {
                    return action.getExtras();
                }

                static RemoteInput[] b(Notification.Action action) {
                    return action.getRemoteInputs();
                }
            }

            /* compiled from: NotificationCompat.java */
            @androidx.annotation.x0(23)
            /* renamed from: androidx.core.app.d0$b$a$b, reason: collision with other inner class name */
            static class C0403b {
                private C0403b() {
                }

                static Icon a(Notification.Action action) {
                    return action.getIcon();
                }
            }

            /* compiled from: NotificationCompat.java */
            @androidx.annotation.x0(24)
            static class c {
                private c() {
                }

                static boolean a(Notification.Action action) {
                    return action.getAllowGeneratedReplies();
                }
            }

            /* compiled from: NotificationCompat.java */
            @androidx.annotation.x0(28)
            static class d {
                private d() {
                }

                static int a(Notification.Action action) {
                    return action.getSemanticAction();
                }
            }

            /* compiled from: NotificationCompat.java */
            @androidx.annotation.x0(29)
            static class e {
                private e() {
                }

                static boolean a(Notification.Action action) {
                    return action.isContextual();
                }
            }

            /* compiled from: NotificationCompat.java */
            @androidx.annotation.x0(31)
            static class f {
                private f() {
                }

                static boolean a(Notification.Action action) {
                    return action.isAuthenticationRequired();
                }
            }

            public a(@androidx.annotation.q0 IconCompat iconCompat, @androidx.annotation.q0 CharSequence charSequence, @androidx.annotation.q0 PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private void d() {
                if (this.f25542i && this.f25536c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            @c1({c1.a.LIBRARY_GROUP_PREFIX})
            @androidx.annotation.o0
            public static a f(@androidx.annotation.o0 Notification.Action action) {
                a aVar = C0403b.a(action) != null ? new a(IconCompat.m(C0403b.a(action)), action.title, action.actionIntent) : new a(action.icon, action.title, action.actionIntent);
                RemoteInput[] b5 = C0402a.b(action);
                if (b5 != null && b5.length != 0) {
                    for (RemoteInput remoteInput : b5) {
                        aVar.b(t0.a.c(remoteInput));
                    }
                }
                int i4 = Build.VERSION.SDK_INT;
                aVar.f25537d = c.a(action);
                if (i4 >= 28) {
                    aVar.f25540g = d.a(action);
                }
                if (i4 >= 29) {
                    aVar.f25542i = e.a(action);
                }
                if (i4 >= 31) {
                    aVar.f25543j = f.a(action);
                }
                aVar.a(C0402a.a(action));
                return aVar;
            }

            @androidx.annotation.o0
            public a a(@androidx.annotation.q0 Bundle bundle) {
                if (bundle != null) {
                    this.f25538e.putAll(bundle);
                }
                return this;
            }

            @androidx.annotation.o0
            public a b(@androidx.annotation.q0 t0 t0Var) {
                if (this.f25539f == null) {
                    this.f25539f = new ArrayList<>();
                }
                if (t0Var != null) {
                    this.f25539f.add(t0Var);
                }
                return this;
            }

            @androidx.annotation.o0
            public b c() {
                d();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<t0> arrayList3 = this.f25539f;
                if (arrayList3 != null) {
                    Iterator<t0> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        t0 next = it.next();
                        if (next.r()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                return new b(this.f25534a, this.f25535b, this.f25536c, this.f25538e, arrayList2.isEmpty() ? null : (t0[]) arrayList2.toArray(new t0[arrayList2.size()]), arrayList.isEmpty() ? null : (t0[]) arrayList.toArray(new t0[arrayList.size()]), this.f25537d, this.f25540g, this.f25541h, this.f25542i, this.f25543j);
            }

            @androidx.annotation.o0
            public a e(@androidx.annotation.o0 InterfaceC0404b interfaceC0404b) {
                interfaceC0404b.a(this);
                return this;
            }

            @androidx.annotation.o0
            public Bundle g() {
                return this.f25538e;
            }

            @androidx.annotation.o0
            public a h(boolean z4) {
                this.f25537d = z4;
                return this;
            }

            @androidx.annotation.o0
            public a i(boolean z4) {
                this.f25543j = z4;
                return this;
            }

            @androidx.annotation.o0
            public a j(boolean z4) {
                this.f25542i = z4;
                return this;
            }

            @androidx.annotation.o0
            public a k(int i4) {
                this.f25540g = i4;
                return this;
            }

            @androidx.annotation.o0
            public a l(boolean z4) {
                this.f25541h = z4;
                return this;
            }

            public a(int i4, @androidx.annotation.q0 CharSequence charSequence, @androidx.annotation.q0 PendingIntent pendingIntent) {
                this(i4 != 0 ? IconCompat.w(null, "", i4) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public a(@androidx.annotation.o0 b bVar) {
                this(bVar.f(), bVar.f25531j, bVar.f25532k, new Bundle(bVar.f25522a), bVar.g(), bVar.b(), bVar.h(), bVar.f25527f, bVar.l(), bVar.k());
            }

            private a(@androidx.annotation.q0 IconCompat iconCompat, @androidx.annotation.q0 CharSequence charSequence, @androidx.annotation.q0 PendingIntent pendingIntent, @androidx.annotation.o0 Bundle bundle, @androidx.annotation.q0 t0[] t0VarArr, boolean z4, int i4, boolean z5, boolean z6, boolean z7) {
                this.f25537d = true;
                this.f25541h = true;
                this.f25534a = iconCompat;
                this.f25535b = n.A(charSequence);
                this.f25536c = pendingIntent;
                this.f25538e = bundle;
                this.f25539f = t0VarArr == null ? null : new ArrayList<>(Arrays.asList(t0VarArr));
                this.f25537d = z4;
                this.f25540g = i4;
                this.f25541h = z5;
                this.f25542i = z6;
                this.f25543j = z7;
            }
        }

        /* compiled from: NotificationCompat.java */
        /* renamed from: androidx.core.app.d0$b$b, reason: collision with other inner class name */
        public interface InterfaceC0404b {
            @androidx.annotation.o0
            a a(@androidx.annotation.o0 a aVar);
        }

        /* compiled from: NotificationCompat.java */
        @Retention(RetentionPolicy.SOURCE)
        public @interface c {
        }

        public b(int i4, @androidx.annotation.q0 CharSequence charSequence, @androidx.annotation.q0 PendingIntent pendingIntent) {
            this(i4 != 0 ? IconCompat.w(null, "", i4) : null, charSequence, pendingIntent);
        }

        @androidx.annotation.q0
        public PendingIntent a() {
            return this.f25532k;
        }

        public boolean b() {
            return this.f25526e;
        }

        @androidx.annotation.q0
        public t0[] c() {
            return this.f25525d;
        }

        @androidx.annotation.o0
        public Bundle d() {
            return this.f25522a;
        }

        @Deprecated
        public int e() {
            return this.f25530i;
        }

        @androidx.annotation.q0
        public IconCompat f() {
            int i4;
            if (this.f25523b == null && (i4 = this.f25530i) != 0) {
                this.f25523b = IconCompat.w(null, "", i4);
            }
            return this.f25523b;
        }

        @androidx.annotation.q0
        public t0[] g() {
            return this.f25524c;
        }

        public int h() {
            return this.f25528g;
        }

        public boolean i() {
            return this.f25527f;
        }

        @androidx.annotation.q0
        public CharSequence j() {
            return this.f25531j;
        }

        public boolean k() {
            return this.f25533l;
        }

        public boolean l() {
            return this.f25529h;
        }

        /* compiled from: NotificationCompat.java */
        public static final class d implements InterfaceC0404b {

            /* renamed from: e, reason: collision with root package name */
            private static final String f25544e = "android.wearable.EXTENSIONS";

            /* renamed from: f, reason: collision with root package name */
            private static final String f25545f = "flags";

            /* renamed from: g, reason: collision with root package name */
            private static final String f25546g = "inProgressLabel";

            /* renamed from: h, reason: collision with root package name */
            private static final String f25547h = "confirmLabel";

            /* renamed from: i, reason: collision with root package name */
            private static final String f25548i = "cancelLabel";

            /* renamed from: j, reason: collision with root package name */
            private static final int f25549j = 1;

            /* renamed from: k, reason: collision with root package name */
            private static final int f25550k = 2;

            /* renamed from: l, reason: collision with root package name */
            private static final int f25551l = 4;

            /* renamed from: m, reason: collision with root package name */
            private static final int f25552m = 1;

            /* renamed from: a, reason: collision with root package name */
            private int f25553a;

            /* renamed from: b, reason: collision with root package name */
            private CharSequence f25554b;

            /* renamed from: c, reason: collision with root package name */
            private CharSequence f25555c;

            /* renamed from: d, reason: collision with root package name */
            private CharSequence f25556d;

            public d() {
                this.f25553a = 1;
            }

            private void l(int i4, boolean z4) {
                if (z4) {
                    this.f25553a = i4 | this.f25553a;
                } else {
                    this.f25553a = (~i4) & this.f25553a;
                }
            }

            @Override // androidx.core.app.d0.b.InterfaceC0404b
            @androidx.annotation.o0
            public a a(@androidx.annotation.o0 a aVar) {
                Bundle bundle = new Bundle();
                int i4 = this.f25553a;
                if (i4 != 1) {
                    bundle.putInt("flags", i4);
                }
                CharSequence charSequence = this.f25554b;
                if (charSequence != null) {
                    bundle.putCharSequence("inProgressLabel", charSequence);
                }
                CharSequence charSequence2 = this.f25555c;
                if (charSequence2 != null) {
                    bundle.putCharSequence("confirmLabel", charSequence2);
                }
                CharSequence charSequence3 = this.f25556d;
                if (charSequence3 != null) {
                    bundle.putCharSequence("cancelLabel", charSequence3);
                }
                aVar.g().putBundle("android.wearable.EXTENSIONS", bundle);
                return aVar;
            }

            @androidx.annotation.o0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d clone() {
                d dVar = new d();
                dVar.f25553a = this.f25553a;
                dVar.f25554b = this.f25554b;
                dVar.f25555c = this.f25555c;
                dVar.f25556d = this.f25556d;
                return dVar;
            }

            @androidx.annotation.q0
            @Deprecated
            public CharSequence c() {
                return this.f25556d;
            }

            @androidx.annotation.q0
            @Deprecated
            public CharSequence d() {
                return this.f25555c;
            }

            public boolean e() {
                return (this.f25553a & 4) != 0;
            }

            public boolean f() {
                return (this.f25553a & 2) != 0;
            }

            @androidx.annotation.q0
            @Deprecated
            public CharSequence g() {
                return this.f25554b;
            }

            public boolean h() {
                return (this.f25553a & 1) != 0;
            }

            @androidx.annotation.o0
            public d i(boolean z4) {
                l(1, z4);
                return this;
            }

            @androidx.annotation.o0
            @Deprecated
            public d j(@androidx.annotation.q0 CharSequence charSequence) {
                this.f25556d = charSequence;
                return this;
            }

            @androidx.annotation.o0
            @Deprecated
            public d k(@androidx.annotation.q0 CharSequence charSequence) {
                this.f25555c = charSequence;
                return this;
            }

            @androidx.annotation.o0
            public d m(boolean z4) {
                l(4, z4);
                return this;
            }

            @androidx.annotation.o0
            public d n(boolean z4) {
                l(2, z4);
                return this;
            }

            @androidx.annotation.o0
            @Deprecated
            public d o(@androidx.annotation.q0 CharSequence charSequence) {
                this.f25554b = charSequence;
                return this;
            }

            public d(@androidx.annotation.o0 b bVar) {
                this.f25553a = 1;
                Bundle bundle = bVar.d().getBundle("android.wearable.EXTENSIONS");
                if (bundle != null) {
                    this.f25553a = bundle.getInt("flags", 1);
                    this.f25554b = bundle.getCharSequence("inProgressLabel");
                    this.f25555c = bundle.getCharSequence("confirmLabel");
                    this.f25556d = bundle.getCharSequence("cancelLabel");
                }
            }
        }

        public b(@androidx.annotation.q0 IconCompat iconCompat, @androidx.annotation.q0 CharSequence charSequence, @androidx.annotation.q0 PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (t0[]) null, (t0[]) null, true, 0, true, false, false);
        }

        b(int i4, @androidx.annotation.q0 CharSequence charSequence, @androidx.annotation.q0 PendingIntent pendingIntent, @androidx.annotation.q0 Bundle bundle, @androidx.annotation.q0 t0[] t0VarArr, @androidx.annotation.q0 t0[] t0VarArr2, boolean z4, int i5, boolean z5, boolean z6, boolean z7) {
            this(i4 != 0 ? IconCompat.w(null, "", i4) : null, charSequence, pendingIntent, bundle, t0VarArr, t0VarArr2, z4, i5, z5, z6, z7);
        }

        b(@androidx.annotation.q0 IconCompat iconCompat, @androidx.annotation.q0 CharSequence charSequence, @androidx.annotation.q0 PendingIntent pendingIntent, @androidx.annotation.q0 Bundle bundle, @androidx.annotation.q0 t0[] t0VarArr, @androidx.annotation.q0 t0[] t0VarArr2, boolean z4, int i4, boolean z5, boolean z6, boolean z7) {
            this.f25527f = true;
            this.f25523b = iconCompat;
            if (iconCompat != null && iconCompat.B() == 2) {
                this.f25530i = iconCompat.y();
            }
            this.f25531j = n.A(charSequence);
            this.f25532k = pendingIntent;
            this.f25522a = bundle == null ? new Bundle() : bundle;
            this.f25524c = t0VarArr;
            this.f25525d = t0VarArr2;
            this.f25526e = z4;
            this.f25528g = i4;
            this.f25527f = z5;
            this.f25529h = z6;
            this.f25533l = z7;
        }
    }

    /* compiled from: NotificationCompat.java */
    @androidx.annotation.x0(20)
    static class c {
        private c() {
        }

        static boolean a(RemoteInput remoteInput) {
            return remoteInput.getAllowFreeFormInput();
        }

        static CharSequence[] b(RemoteInput remoteInput) {
            return remoteInput.getChoices();
        }

        static Bundle c(Notification.Action action) {
            return action.getExtras();
        }

        static Bundle d(RemoteInput remoteInput) {
            return remoteInput.getExtras();
        }

        static String e(Notification notification) {
            return notification.getGroup();
        }

        static CharSequence f(RemoteInput remoteInput) {
            return remoteInput.getLabel();
        }

        static RemoteInput[] g(Notification.Action action) {
            return action.getRemoteInputs();
        }

        static String h(RemoteInput remoteInput) {
            return remoteInput.getResultKey();
        }

        static String i(Notification notification) {
            return notification.getSortKey();
        }
    }

    /* compiled from: NotificationCompat.java */
    @androidx.annotation.x0(23)
    static class d {
        private d() {
        }

        static Icon a(Notification.Action action) {
            return action.getIcon();
        }
    }

    /* compiled from: NotificationCompat.java */
    @androidx.annotation.x0(24)
    static class e {
        private e() {
        }

        static boolean a(Notification.Action action) {
            return action.getAllowGeneratedReplies();
        }
    }

    /* compiled from: NotificationCompat.java */
    @androidx.annotation.x0(26)
    static class f {
        private f() {
        }

        static int a(Notification notification) {
            return notification.getBadgeIconType();
        }

        static String b(Notification notification) {
            return notification.getChannelId();
        }

        static int c(Notification notification) {
            return notification.getGroupAlertBehavior();
        }

        static CharSequence d(Notification notification) {
            return notification.getSettingsText();
        }

        static String e(Notification notification) {
            return notification.getShortcutId();
        }

        static long f(Notification notification) {
            return notification.getTimeoutAfter();
        }
    }

    /* compiled from: NotificationCompat.java */
    @androidx.annotation.x0(28)
    static class g {
        private g() {
        }

        static int a(Notification.Action action) {
            return action.getSemanticAction();
        }
    }

    /* compiled from: NotificationCompat.java */
    @androidx.annotation.x0(29)
    static class h {
        private h() {
        }

        static boolean a(Notification notification) {
            return notification.getAllowSystemGeneratedContextualActions();
        }

        static Notification.BubbleMetadata b(Notification notification) {
            return notification.getBubbleMetadata();
        }

        static int c(RemoteInput remoteInput) {
            return remoteInput.getEditChoicesBeforeSending();
        }

        static LocusId d(Notification notification) {
            return notification.getLocusId();
        }

        static boolean e(Notification.Action action) {
            return action.isContextual();
        }
    }

    /* compiled from: NotificationCompat.java */
    @androidx.annotation.x0(31)
    static class i {
        private i() {
        }

        static boolean a(Notification.Action action) {
            return action.isAuthenticationRequired();
        }
    }

    /* compiled from: NotificationCompat.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface j {
    }

    /* compiled from: NotificationCompat.java */
    public static class k extends y {

        /* renamed from: j, reason: collision with root package name */
        private static final String f25557j = "androidx.core.app.NotificationCompat$BigPictureStyle";

        /* renamed from: e, reason: collision with root package name */
        private IconCompat f25558e;

        /* renamed from: f, reason: collision with root package name */
        private IconCompat f25559f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f25560g;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f25561h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f25562i;

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(23)
        private static class a {
            private a() {
            }

            @androidx.annotation.x0(23)
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(31)
        private static class b {
            private b() {
            }

            @androidx.annotation.x0(31)
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            @androidx.annotation.x0(31)
            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @androidx.annotation.x0(31)
            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z4) {
                bigPictureStyle.showBigPictureWhenCollapsed(z4);
            }
        }

        public k() {
        }

        @androidx.annotation.q0
        private static IconCompat A(@androidx.annotation.q0 Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.l((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.r((Bitmap) parcelable);
            }
            return null;
        }

        @androidx.annotation.q0
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public static IconCompat F(@androidx.annotation.q0 Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable("android.picture");
            return parcelable != null ? A(parcelable) : A(bundle.getParcelable("android.pictureIcon"));
        }

        @androidx.annotation.o0
        public k B(@androidx.annotation.q0 Bitmap bitmap) {
            this.f25559f = bitmap == null ? null : IconCompat.r(bitmap);
            this.f25560g = true;
            return this;
        }

        @androidx.annotation.o0
        @androidx.annotation.x0(23)
        public k C(@androidx.annotation.q0 Icon icon) {
            this.f25559f = icon == null ? null : IconCompat.l(icon);
            this.f25560g = true;
            return this;
        }

        @androidx.annotation.o0
        public k D(@androidx.annotation.q0 Bitmap bitmap) {
            this.f25558e = bitmap == null ? null : IconCompat.r(bitmap);
            return this;
        }

        @androidx.annotation.o0
        @androidx.annotation.x0(31)
        public k E(@androidx.annotation.q0 Icon icon) {
            this.f25558e = IconCompat.l(icon);
            return this;
        }

        @androidx.annotation.o0
        public k G(@androidx.annotation.q0 CharSequence charSequence) {
            this.f25677b = n.A(charSequence);
            return this;
        }

        @androidx.annotation.o0
        @androidx.annotation.x0(31)
        public k H(@androidx.annotation.q0 CharSequence charSequence) {
            this.f25561h = charSequence;
            return this;
        }

        @androidx.annotation.o0
        public k I(@androidx.annotation.q0 CharSequence charSequence) {
            this.f25678c = n.A(charSequence);
            this.f25679d = true;
            return this;
        }

        @androidx.annotation.o0
        @androidx.annotation.x0(31)
        public k J(boolean z4) {
            this.f25562i = z4;
            return this;
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public void b(androidx.core.app.y yVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(yVar.a()).setBigContentTitle(this.f25677b);
            IconCompat iconCompat = this.f25558e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    b.a(bigContentTitle, this.f25558e.K(yVar instanceof f0 ? ((f0) yVar).f() : null));
                } else if (iconCompat.B() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f25558e.x());
                }
            }
            if (this.f25560g) {
                if (this.f25559f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    a.a(bigContentTitle, this.f25559f.K(yVar instanceof f0 ? ((f0) yVar).f() : null));
                }
            }
            if (this.f25679d) {
                bigContentTitle.setSummaryText(this.f25678c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                b.c(bigContentTitle, this.f25562i);
                b.b(bigContentTitle, this.f25561h);
            }
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected void g(@androidx.annotation.o0 Bundle bundle) {
            super.g(bundle);
            bundle.remove("android.largeIcon.big");
            bundle.remove("android.picture");
            bundle.remove("android.pictureIcon");
            bundle.remove("android.showBigPictureWhenCollapsed");
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.o0
        protected String t() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected void y(@androidx.annotation.o0 Bundle bundle) {
            super.y(bundle);
            if (bundle.containsKey("android.largeIcon.big")) {
                this.f25559f = A(bundle.getParcelable("android.largeIcon.big"));
                this.f25560g = true;
            }
            this.f25558e = F(bundle);
            this.f25562i = bundle.getBoolean("android.showBigPictureWhenCollapsed");
        }

        public k(@androidx.annotation.q0 n nVar) {
            z(nVar);
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class l extends y {

        /* renamed from: f, reason: collision with root package name */
        private static final String f25563f = "androidx.core.app.NotificationCompat$BigTextStyle";

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f25564e;

        public l() {
        }

        @androidx.annotation.o0
        public l A(@androidx.annotation.q0 CharSequence charSequence) {
            this.f25564e = n.A(charSequence);
            return this;
        }

        @androidx.annotation.o0
        public l B(@androidx.annotation.q0 CharSequence charSequence) {
            this.f25677b = n.A(charSequence);
            return this;
        }

        @androidx.annotation.o0
        public l C(@androidx.annotation.q0 CharSequence charSequence) {
            this.f25678c = n.A(charSequence);
            this.f25679d = true;
            return this;
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public void a(@androidx.annotation.o0 Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public void b(androidx.core.app.y yVar) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(yVar.a()).setBigContentTitle(this.f25677b).bigText(this.f25564e);
            if (this.f25679d) {
                bigText.setSummaryText(this.f25678c);
            }
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected void g(@androidx.annotation.o0 Bundle bundle) {
            super.g(bundle);
            bundle.remove("android.bigText");
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.o0
        protected String t() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected void y(@androidx.annotation.o0 Bundle bundle) {
            super.y(bundle);
            this.f25564e = bundle.getCharSequence("android.bigText");
        }

        public l(@androidx.annotation.q0 n nVar) {
            z(nVar);
        }
    }

    /* compiled from: NotificationCompat.java */
    public static final class m {

        /* renamed from: h, reason: collision with root package name */
        private static final int f25565h = 1;

        /* renamed from: i, reason: collision with root package name */
        private static final int f25566i = 2;

        /* renamed from: a, reason: collision with root package name */
        private PendingIntent f25567a;

        /* renamed from: b, reason: collision with root package name */
        private PendingIntent f25568b;

        /* renamed from: c, reason: collision with root package name */
        private IconCompat f25569c;

        /* renamed from: d, reason: collision with root package name */
        private int f25570d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.q
        private int f25571e;

        /* renamed from: f, reason: collision with root package name */
        private int f25572f;

        /* renamed from: g, reason: collision with root package name */
        private String f25573g;

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(29)
        private static class a {
            private a() {
            }

            @androidx.annotation.q0
            @androidx.annotation.x0(29)
            static m a(@androidx.annotation.q0 Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                c i4 = new c(bubbleMetadata.getIntent(), IconCompat.l(bubbleMetadata.getIcon())).b(bubbleMetadata.getAutoExpandBubble()).c(bubbleMetadata.getDeleteIntent()).i(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    i4.d(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    i4.e(bubbleMetadata.getDesiredHeightResId());
                }
                return i4.a();
            }

            @androidx.annotation.q0
            @androidx.annotation.x0(29)
            static Notification.BubbleMetadata b(@androidx.annotation.q0 m mVar) {
                if (mVar == null || mVar.g() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(mVar.f().J()).setIntent(mVar.g()).setDeleteIntent(mVar.c()).setAutoExpandBubble(mVar.b()).setSuppressNotification(mVar.i());
                if (mVar.d() != 0) {
                    suppressNotification.setDesiredHeight(mVar.d());
                }
                if (mVar.e() != 0) {
                    suppressNotification.setDesiredHeightResId(mVar.e());
                }
                return suppressNotification.build();
            }
        }

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(30)
        private static class b {
            private b() {
            }

            @androidx.annotation.q0
            @androidx.annotation.x0(30)
            static m a(@androidx.annotation.q0 Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null) {
                    return null;
                }
                c cVar = bubbleMetadata.getShortcutId() != null ? new c(bubbleMetadata.getShortcutId()) : new c(bubbleMetadata.getIntent(), IconCompat.l(bubbleMetadata.getIcon()));
                cVar.b(bubbleMetadata.getAutoExpandBubble()).c(bubbleMetadata.getDeleteIntent()).i(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    cVar.d(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    cVar.e(bubbleMetadata.getDesiredHeightResId());
                }
                return cVar.a();
            }

            @androidx.annotation.q0
            @androidx.annotation.x0(30)
            static Notification.BubbleMetadata b(@androidx.annotation.q0 m mVar) {
                if (mVar == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder builder = mVar.h() != null ? new Notification.BubbleMetadata.Builder(mVar.h()) : new Notification.BubbleMetadata.Builder(mVar.g(), mVar.f().J());
                builder.setDeleteIntent(mVar.c()).setAutoExpandBubble(mVar.b()).setSuppressNotification(mVar.i());
                if (mVar.d() != 0) {
                    builder.setDesiredHeight(mVar.d());
                }
                if (mVar.e() != 0) {
                    builder.setDesiredHeightResId(mVar.e());
                }
                return builder.build();
            }
        }

        /* compiled from: NotificationCompat.java */
        public static final class c {

            /* renamed from: a, reason: collision with root package name */
            private PendingIntent f25574a;

            /* renamed from: b, reason: collision with root package name */
            private IconCompat f25575b;

            /* renamed from: c, reason: collision with root package name */
            private int f25576c;

            /* renamed from: d, reason: collision with root package name */
            @androidx.annotation.q
            private int f25577d;

            /* renamed from: e, reason: collision with root package name */
            private int f25578e;

            /* renamed from: f, reason: collision with root package name */
            private PendingIntent f25579f;

            /* renamed from: g, reason: collision with root package name */
            private String f25580g;

            @Deprecated
            public c() {
            }

            @androidx.annotation.o0
            private c f(int i4, boolean z4) {
                if (z4) {
                    this.f25578e = i4 | this.f25578e;
                } else {
                    this.f25578e = (~i4) & this.f25578e;
                }
                return this;
            }

            @androidx.annotation.o0
            public m a() {
                String str = this.f25580g;
                if (str == null && this.f25574a == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.f25575b == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                m mVar = new m(this.f25574a, this.f25579f, this.f25575b, this.f25576c, this.f25577d, this.f25578e, str);
                mVar.j(this.f25578e);
                return mVar;
            }

            @androidx.annotation.o0
            public c b(boolean z4) {
                f(1, z4);
                return this;
            }

            @androidx.annotation.o0
            public c c(@androidx.annotation.q0 PendingIntent pendingIntent) {
                this.f25579f = pendingIntent;
                return this;
            }

            @androidx.annotation.o0
            public c d(@androidx.annotation.r(unit = 0) int i4) {
                this.f25576c = Math.max(i4, 0);
                this.f25577d = 0;
                return this;
            }

            @androidx.annotation.o0
            public c e(@androidx.annotation.q int i4) {
                this.f25577d = i4;
                this.f25576c = 0;
                return this;
            }

            @androidx.annotation.o0
            public c g(@androidx.annotation.o0 IconCompat iconCompat) {
                if (this.f25580g != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (iconCompat == null) {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                this.f25575b = iconCompat;
                return this;
            }

            @androidx.annotation.o0
            public c h(@androidx.annotation.o0 PendingIntent pendingIntent) {
                if (this.f25580g != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                this.f25574a = pendingIntent;
                return this;
            }

            @androidx.annotation.o0
            public c i(boolean z4) {
                f(2, z4);
                return this;
            }

            @androidx.annotation.x0(30)
            public c(@androidx.annotation.o0 String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new NullPointerException("Bubble requires a non-null shortcut id");
                }
                this.f25580g = str;
            }

            public c(@androidx.annotation.o0 PendingIntent pendingIntent, @androidx.annotation.o0 IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat != null) {
                    this.f25574a = pendingIntent;
                    this.f25575b = iconCompat;
                    return;
                }
                throw new NullPointerException("Bubbles require non-null icon");
            }
        }

        @androidx.annotation.q0
        public static m a(@androidx.annotation.q0 Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                return b.a(bubbleMetadata);
            }
            if (i4 == 29) {
                return a.a(bubbleMetadata);
            }
            return null;
        }

        @androidx.annotation.q0
        public static Notification.BubbleMetadata k(@androidx.annotation.q0 m mVar) {
            if (mVar == null) {
                return null;
            }
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                return b.b(mVar);
            }
            if (i4 == 29) {
                return a.b(mVar);
            }
            return null;
        }

        public boolean b() {
            return (this.f25572f & 1) != 0;
        }

        @androidx.annotation.q0
        public PendingIntent c() {
            return this.f25568b;
        }

        @androidx.annotation.r(unit = 0)
        public int d() {
            return this.f25570d;
        }

        @androidx.annotation.q
        public int e() {
            return this.f25571e;
        }

        @androidx.annotation.q0
        @SuppressLint({"InvalidNullConversion"})
        public IconCompat f() {
            return this.f25569c;
        }

        @androidx.annotation.q0
        @SuppressLint({"InvalidNullConversion"})
        public PendingIntent g() {
            return this.f25567a;
        }

        @androidx.annotation.q0
        public String h() {
            return this.f25573g;
        }

        public boolean i() {
            return (this.f25572f & 2) != 0;
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public void j(int i4) {
            this.f25572f = i4;
        }

        private m(@androidx.annotation.q0 PendingIntent pendingIntent, @androidx.annotation.q0 PendingIntent pendingIntent2, @androidx.annotation.q0 IconCompat iconCompat, int i4, @androidx.annotation.q int i5, int i6, @androidx.annotation.q0 String str) {
            this.f25567a = pendingIntent;
            this.f25569c = iconCompat;
            this.f25570d = i4;
            this.f25571e = i5;
            this.f25568b = pendingIntent2;
            this.f25572f = i6;
            this.f25573g = str;
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class o extends y {

        /* renamed from: p, reason: collision with root package name */
        public static final int f25608p = 0;

        /* renamed from: q, reason: collision with root package name */
        public static final int f25609q = 1;

        /* renamed from: r, reason: collision with root package name */
        public static final int f25610r = 2;

        /* renamed from: s, reason: collision with root package name */
        public static final int f25611s = 3;

        /* renamed from: e, reason: collision with root package name */
        private int f25613e;

        /* renamed from: f, reason: collision with root package name */
        private r0 f25614f;

        /* renamed from: g, reason: collision with root package name */
        private PendingIntent f25615g;

        /* renamed from: h, reason: collision with root package name */
        private PendingIntent f25616h;

        /* renamed from: i, reason: collision with root package name */
        private PendingIntent f25617i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f25618j;

        /* renamed from: k, reason: collision with root package name */
        private Integer f25619k;

        /* renamed from: l, reason: collision with root package name */
        private Integer f25620l;

        /* renamed from: m, reason: collision with root package name */
        private IconCompat f25621m;

        /* renamed from: n, reason: collision with root package name */
        private CharSequence f25622n;

        /* renamed from: t, reason: collision with root package name */
        private static final String f25612t = "key_action_priority";

        /* renamed from: o, reason: collision with root package name */
        private static final String f25607o = "androidx.core.app.NotificationCompat$CallStyle";

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(20)
        static class a {
            private a() {
            }

            static Notification.Action.Builder a(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            static Notification.Action.Builder b(Notification.Action.Builder builder, RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            static Notification.Action c(Notification.Action.Builder builder) {
                return builder.build();
            }

            static Notification.Action.Builder d(int i4, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i4, charSequence, pendingIntent);
            }
        }

        /* compiled from: NotificationCompat.java */
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
        }

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(23)
        static class c {
            private c() {
            }

            static Parcelable a(Icon icon) {
                return icon;
            }

            static Notification.Action.Builder b(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            static void c(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(24)
        static class d {
            private d() {
            }

            static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z4) {
                return builder.setAllowGeneratedReplies(z4);
            }
        }

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(28)
        static class e {
            private e() {
            }

            static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            static Parcelable b(Person person) {
                return person;
            }
        }

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(31)
        static class f {
            private f() {
            }

            static Notification.CallStyle a(@androidx.annotation.o0 Person person, @androidx.annotation.o0 PendingIntent pendingIntent, @androidx.annotation.o0 PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle b(@androidx.annotation.o0 Person person, @androidx.annotation.o0 PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            static Notification.CallStyle c(@androidx.annotation.o0 Person person, @androidx.annotation.o0 PendingIntent pendingIntent, @androidx.annotation.o0 PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle d(Notification.CallStyle callStyle, @androidx.annotation.l int i4) {
                return callStyle.setAnswerButtonColorHint(i4);
            }

            static Notification.Action.Builder e(Notification.Action.Builder builder, boolean z4) {
                return builder.setAuthenticationRequired(z4);
            }

            static Notification.CallStyle f(Notification.CallStyle callStyle, @androidx.annotation.l int i4) {
                return callStyle.setDeclineButtonColorHint(i4);
            }

            static Notification.CallStyle g(Notification.CallStyle callStyle, boolean z4) {
                return callStyle.setIsVideo(z4);
            }

            static Notification.CallStyle h(Notification.CallStyle callStyle, @androidx.annotation.q0 Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            static Notification.CallStyle i(Notification.CallStyle callStyle, @androidx.annotation.q0 CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        /* compiled from: NotificationCompat.java */
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        @Retention(RetentionPolicy.SOURCE)
        public @interface g {
        }

        public o() {
        }

        @androidx.annotation.o0
        public static o A(@androidx.annotation.o0 r0 r0Var, @androidx.annotation.o0 PendingIntent pendingIntent, @androidx.annotation.o0 PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "declineIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new o(1, r0Var, null, pendingIntent, pendingIntent2);
        }

        @androidx.annotation.o0
        public static o B(@androidx.annotation.o0 r0 r0Var, @androidx.annotation.o0 PendingIntent pendingIntent) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            return new o(2, r0Var, pendingIntent, null, null);
        }

        @androidx.annotation.o0
        public static o C(@androidx.annotation.o0 r0 r0Var, @androidx.annotation.o0 PendingIntent pendingIntent, @androidx.annotation.o0 PendingIntent pendingIntent2) {
            Objects.requireNonNull(pendingIntent, "hangUpIntent is required");
            Objects.requireNonNull(pendingIntent2, "answerIntent is required");
            return new o(3, r0Var, pendingIntent, null, pendingIntent2);
        }

        @androidx.annotation.q0
        private String E() {
            int i4 = this.f25613e;
            if (i4 == 1) {
                return this.f25676a.f25581a.getResources().getString(a.h.f93618e);
            }
            if (i4 == 2) {
                return this.f25676a.f25581a.getResources().getString(a.h.f93619f);
            }
            if (i4 != 3) {
                return null;
            }
            return this.f25676a.f25581a.getResources().getString(a.h.f93620g);
        }

        private boolean F(b bVar) {
            return bVar != null && bVar.d().getBoolean("key_action_priority");
        }

        @androidx.annotation.o0
        @androidx.annotation.x0(20)
        private b G(int i4, int i5, Integer num, int i6, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(androidx.core.content.d.getColor(this.f25676a.f25581a, i6));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f25676a.f25581a.getResources().getString(i5));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            b c5 = new b.a(IconCompat.v(this.f25676a.f25581a, i4), spannableStringBuilder, pendingIntent).c();
            c5.d().putBoolean("key_action_priority", true);
            return c5;
        }

        @androidx.annotation.q0
        @androidx.annotation.x0(20)
        private b H() {
            int i4 = a.d.f93539c;
            int i5 = a.d.f93537a;
            PendingIntent pendingIntent = this.f25615g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z4 = this.f25618j;
            return G(z4 ? i4 : i5, z4 ? a.h.f93615b : a.h.f93614a, this.f25619k, a.b.f93511c, pendingIntent);
        }

        @androidx.annotation.o0
        @androidx.annotation.x0(20)
        private b I() {
            int i4 = a.d.f93541e;
            PendingIntent pendingIntent = this.f25616h;
            return pendingIntent == null ? G(i4, a.h.f93617d, this.f25620l, a.b.f93512d, this.f25617i) : G(i4, a.h.f93616c, this.f25620l, a.b.f93512d, pendingIntent);
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.o0
        @androidx.annotation.x0(20)
        public ArrayList<b> D() {
            b I = I();
            b H = H();
            ArrayList<b> arrayList = new ArrayList<>(3);
            arrayList.add(I);
            ArrayList<b> arrayList2 = this.f25676a.f25582b;
            int i4 = 2;
            if (arrayList2 != null) {
                for (b bVar : arrayList2) {
                    if (bVar.l()) {
                        arrayList.add(bVar);
                    } else if (!F(bVar) && i4 > 1) {
                        arrayList.add(bVar);
                        i4--;
                    }
                    if (H != null && i4 == 1) {
                        arrayList.add(H);
                        i4--;
                    }
                }
            }
            if (H != null && i4 >= 1) {
                arrayList.add(H);
            }
            return arrayList;
        }

        @androidx.annotation.o0
        public o J(@androidx.annotation.l int i4) {
            this.f25619k = Integer.valueOf(i4);
            return this;
        }

        @androidx.annotation.o0
        public o K(@androidx.annotation.l int i4) {
            this.f25620l = Integer.valueOf(i4);
            return this;
        }

        @androidx.annotation.o0
        public o L(boolean z4) {
            this.f25618j = z4;
            return this;
        }

        @androidx.annotation.o0
        public o M(@androidx.annotation.q0 Bitmap bitmap) {
            this.f25621m = IconCompat.r(bitmap);
            return this;
        }

        @androidx.annotation.o0
        @androidx.annotation.x0(23)
        public o N(@androidx.annotation.q0 Icon icon) {
            this.f25621m = icon == null ? null : IconCompat.l(icon);
            return this;
        }

        @androidx.annotation.o0
        public o O(@androidx.annotation.q0 CharSequence charSequence) {
            this.f25622n = charSequence;
            return this;
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public void a(@androidx.annotation.o0 Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", this.f25613e);
            bundle.putBoolean("android.callIsVideo", this.f25618j);
            r0 r0Var = this.f25614f;
            if (r0Var != null) {
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("android.callPerson", e.b(r0Var.k()));
                } else {
                    bundle.putParcelable("android.callPersonCompat", r0Var.m());
                }
            }
            IconCompat iconCompat = this.f25621m;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", c.a(iconCompat.K(this.f25676a.f25581a)));
            }
            bundle.putCharSequence("android.verificationText", this.f25622n);
            bundle.putParcelable("android.answerIntent", this.f25615g);
            bundle.putParcelable("android.declineIntent", this.f25616h);
            bundle.putParcelable("android.hangUpIntent", this.f25617i);
            Integer num = this.f25619k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.f25620l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public void b(androidx.core.app.y yVar) {
            int i4 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            r2 = null;
            Notification.CallStyle a5 = null;
            charSequence = null;
            if (i4 < 31) {
                Notification.Builder a6 = yVar.a();
                r0 r0Var = this.f25614f;
                a6.setContentTitle(r0Var != null ? r0Var.f() : null);
                Bundle bundle = this.f25676a.E;
                if (bundle != null && bundle.containsKey("android.text")) {
                    charSequence = this.f25676a.E.getCharSequence("android.text");
                }
                if (charSequence == null) {
                    charSequence = E();
                }
                a6.setContentText(charSequence);
                r0 r0Var2 = this.f25614f;
                if (r0Var2 != null) {
                    if (r0Var2.d() != null) {
                        c.c(a6, this.f25614f.d().K(this.f25676a.f25581a));
                    }
                    if (i4 >= 28) {
                        e.a(a6, this.f25614f.k());
                    } else {
                        b.a(a6, this.f25614f.g());
                    }
                }
                b.b(a6, "call");
                return;
            }
            int i5 = this.f25613e;
            if (i5 == 1) {
                a5 = f.a(this.f25614f.k(), this.f25616h, this.f25615g);
            } else if (i5 == 2) {
                a5 = f.b(this.f25614f.k(), this.f25617i);
            } else if (i5 == 3) {
                a5 = f.c(this.f25614f.k(), this.f25617i, this.f25615g);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                String.valueOf(this.f25613e);
            }
            if (a5 != null) {
                a5.setBuilder(yVar.a());
                Integer num = this.f25619k;
                if (num != null) {
                    f.d(a5, num.intValue());
                }
                Integer num2 = this.f25620l;
                if (num2 != null) {
                    f.f(a5, num2.intValue());
                }
                f.i(a5, this.f25622n);
                IconCompat iconCompat = this.f25621m;
                if (iconCompat != null) {
                    f.h(a5, iconCompat.K(this.f25676a.f25581a));
                }
                f.g(a5, this.f25618j);
            }
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public boolean r() {
            return true;
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.o0
        protected String t() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected void y(@androidx.annotation.o0 Bundle bundle) {
            super.y(bundle);
            this.f25613e = bundle.getInt("android.callType");
            this.f25618j = bundle.getBoolean("android.callIsVideo");
            if (Build.VERSION.SDK_INT >= 28 && bundle.containsKey("android.callPerson")) {
                this.f25614f = r0.b.a(c0.a(bundle.getParcelable("android.callPerson")));
            } else if (bundle.containsKey("android.callPersonCompat")) {
                this.f25614f = r0.b(bundle.getBundle("android.callPersonCompat"));
            }
            if (bundle.containsKey("android.verificationIcon")) {
                this.f25621m = IconCompat.l((Icon) bundle.getParcelable("android.verificationIcon"));
            } else if (bundle.containsKey("android.verificationIconCompat")) {
                this.f25621m = IconCompat.j(bundle.getBundle("android.verificationIconCompat"));
            }
            this.f25622n = bundle.getCharSequence("android.verificationText");
            this.f25615g = (PendingIntent) bundle.getParcelable("android.answerIntent");
            this.f25616h = (PendingIntent) bundle.getParcelable("android.declineIntent");
            this.f25617i = (PendingIntent) bundle.getParcelable("android.hangUpIntent");
            this.f25619k = bundle.containsKey("android.answerColor") ? Integer.valueOf(bundle.getInt("android.answerColor")) : null;
            this.f25620l = bundle.containsKey("android.declineColor") ? Integer.valueOf(bundle.getInt("android.declineColor")) : null;
        }

        public o(@androidx.annotation.q0 n nVar) {
            z(nVar);
        }

        private o(int i4, @androidx.annotation.o0 r0 r0Var, @androidx.annotation.q0 PendingIntent pendingIntent, @androidx.annotation.q0 PendingIntent pendingIntent2, @androidx.annotation.q0 PendingIntent pendingIntent3) {
            if (r0Var != null && !TextUtils.isEmpty(r0Var.f())) {
                this.f25613e = i4;
                this.f25614f = r0Var;
                this.f25615g = pendingIntent3;
                this.f25616h = pendingIntent2;
                this.f25617i = pendingIntent;
                return;
            }
            throw new IllegalArgumentException("person must have a non-empty a name");
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class q extends y {

        /* renamed from: e, reason: collision with root package name */
        private static final String f25651e = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";

        /* renamed from: f, reason: collision with root package name */
        private static final int f25652f = 3;

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(24)
        static class a {
            private a() {
            }

            static Notification.Style a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        private RemoteViews A(RemoteViews remoteViews, boolean z4) {
            int min;
            int i4 = 0;
            RemoteViews c5 = c(true, a.g.f93610f, false);
            c5.removeAllViews(a.e.L);
            List<b> C = C(this.f25676a.f25582b);
            if (!z4 || C == null || (min = Math.min(C.size(), 3)) <= 0) {
                i4 = 8;
            } else {
                for (int i5 = 0; i5 < min; i5++) {
                    c5.addView(a.e.L, B(C.get(i5)));
                }
            }
            c5.setViewVisibility(a.e.L, i4);
            c5.setViewVisibility(a.e.I, i4);
            e(c5, remoteViews);
            return c5;
        }

        private RemoteViews B(b bVar) {
            boolean z4 = bVar.f25532k == null;
            RemoteViews remoteViews = new RemoteViews(this.f25676a.f25581a.getPackageName(), z4 ? a.g.f93609e : a.g.f93608d);
            IconCompat f4 = bVar.f();
            if (f4 != null) {
                remoteViews.setImageViewBitmap(a.e.J, o(f4, a.b.f93513e));
            }
            remoteViews.setTextViewText(a.e.K, bVar.f25531j);
            if (!z4) {
                remoteViews.setOnClickPendingIntent(a.e.H, bVar.f25532k);
            }
            remoteViews.setContentDescription(a.e.H, bVar.f25531j);
            return remoteViews;
        }

        private static List<b> C(List<b> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (b bVar : list) {
                if (!bVar.l()) {
                    arrayList.add(bVar);
                }
            }
            return arrayList;
        }

        @androidx.annotation.o0
        @androidx.annotation.x0(24)
        public static List<CharSequence> D(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Notification notification) {
            if (!Notification.DecoratedCustomViewStyle.class.getName().equals(notification.extras.getString("android.template"))) {
                return Collections.emptyList();
            }
            RemoteViews remoteViews = notification.contentView;
            if (remoteViews == null && notification.bigContentView == null && notification.headsUpContentView == null) {
                return Collections.emptyList();
            }
            RemoteViews remoteViews2 = notification.bigContentView;
            if (remoteViews2 != null) {
                remoteViews = remoteViews2;
            } else if (remoteViews == null) {
                remoteViews = notification.headsUpContentView;
            }
            String str = remoteViews.getPackage();
            try {
                Context createPackageContext = context.createPackageContext(str, 0);
                createPackageContext.setTheme(context.getPackageManager().getApplicationInfo(str, 0).theme);
                View apply = remoteViews.apply(createPackageContext, null);
                ArrayList arrayList = new ArrayList();
                E(apply, arrayList);
                return arrayList;
            } catch (PackageManager.NameNotFoundException e4) {
                throw new RuntimeException(e4);
            }
        }

        private static void E(View view, ArrayList<CharSequence> arrayList) {
            CharSequence text;
            if (!(view instanceof ViewGroup)) {
                return;
            }
            int i4 = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i4 >= viewGroup.getChildCount()) {
                    return;
                }
                View childAt = viewGroup.getChildAt(i4);
                if ((childAt instanceof TextView) && (text = ((TextView) childAt).getText()) != null && text.length() > 0) {
                    arrayList.add(text);
                }
                if (childAt instanceof ViewGroup) {
                    E(childAt, arrayList);
                }
                i4++;
            }
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public void b(androidx.core.app.y yVar) {
            yVar.a().setStyle(a.a());
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public boolean r() {
            return true;
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.o0
        protected String t() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews v(androidx.core.app.y yVar) {
            return null;
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews w(androidx.core.app.y yVar) {
            return null;
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews x(androidx.core.app.y yVar) {
            return null;
        }
    }

    /* compiled from: NotificationCompat.java */
    public interface r {
        @androidx.annotation.o0
        n a(@androidx.annotation.o0 n nVar);
    }

    /* compiled from: NotificationCompat.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface s {
    }

    /* compiled from: NotificationCompat.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface v {
    }

    /* compiled from: NotificationCompat.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface w {
    }

    /* compiled from: NotificationCompat.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface x {
    }

    /* compiled from: NotificationCompat.java */
    public static abstract class y {

        /* renamed from: a, reason: collision with root package name */
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected n f25676a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f25677b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f25678c;

        /* renamed from: d, reason: collision with root package name */
        boolean f25679d = false;

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(24)
        static class a {
            private a() {
            }

            static void a(RemoteViews remoteViews, int i4, boolean z4) {
                remoteViews.setChronometerCountDown(i4, z4);
            }
        }

        private int f() {
            Resources resources = this.f25676a.f25581a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(a.c.f93535u);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(a.c.f93536v);
            float h4 = (h(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round((h4 * dimensionPixelSize2) + ((1.0f - h4) * dimensionPixelSize));
        }

        private static float h(float f4, float f5, float f6) {
            return f4 < f5 ? f5 : f4 > f6 ? f6 : f4;
        }

        @androidx.annotation.q0
        static y i(@androidx.annotation.q0 String str) {
            if (str == null) {
                return null;
            }
            switch (str) {
                case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                    return new q();
                case "androidx.core.app.NotificationCompat$BigPictureStyle":
                    return new k();
                case "androidx.core.app.NotificationCompat$CallStyle":
                    return new o();
                case "androidx.core.app.NotificationCompat$InboxStyle":
                    return new t();
                case "androidx.core.app.NotificationCompat$BigTextStyle":
                    return new l();
                case "androidx.core.app.NotificationCompat$MessagingStyle":
                    return new u();
                default:
                    return null;
            }
        }

        @androidx.annotation.q0
        private static y j(@androidx.annotation.q0 String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new k();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new l();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new t();
            }
            if (str.equals(Notification.MessagingStyle.class.getName())) {
                return new u();
            }
            if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                return new q();
            }
            return null;
        }

        @androidx.annotation.q0
        static y k(@androidx.annotation.o0 Bundle bundle) {
            y i4 = i(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
            return i4 != null ? i4 : (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) ? new u() : (bundle.containsKey("android.picture") || bundle.containsKey("android.pictureIcon")) ? new k() : bundle.containsKey("android.bigText") ? new l() : bundle.containsKey("android.textLines") ? new t() : bundle.containsKey("android.callType") ? new o() : j(bundle.getString("android.template"));
        }

        @androidx.annotation.q0
        static y l(@androidx.annotation.o0 Bundle bundle) {
            y k4 = k(bundle);
            if (k4 == null) {
                return null;
            }
            try {
                k4.y(bundle);
                return k4;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        private Bitmap n(int i4, int i5, int i6) {
            return p(IconCompat.v(this.f25676a.f25581a, i4), i5, i6);
        }

        private Bitmap p(@androidx.annotation.o0 IconCompat iconCompat, int i4, int i5) {
            Drawable E = iconCompat.E(this.f25676a.f25581a);
            int intrinsicWidth = i5 == 0 ? E.getIntrinsicWidth() : i5;
            if (i5 == 0) {
                i5 = E.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i5, Bitmap.Config.ARGB_8888);
            E.setBounds(0, 0, intrinsicWidth, i5);
            if (i4 != 0) {
                E.mutate().setColorFilter(new PorterDuffColorFilter(i4, PorterDuff.Mode.SRC_IN));
            }
            E.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        private Bitmap q(int i4, int i5, int i6, int i7) {
            int i10 = a.d.f93550n;
            if (i7 == 0) {
                i7 = 0;
            }
            Bitmap n4 = n(i10, i7, i5);
            Canvas canvas = new Canvas(n4);
            Drawable mutate = this.f25676a.f25581a.getResources().getDrawable(i4).mutate();
            mutate.setFilterBitmap(true);
            int i11 = (i5 - i6) / 2;
            int i12 = i6 + i11;
            mutate.setBounds(i11, i11, i12, i12);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return n4;
        }

        @androidx.annotation.q0
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public static y s(@androidx.annotation.o0 Notification notification) {
            Bundle bundle = notification.extras;
            if (bundle == null) {
                return null;
            }
            return l(bundle);
        }

        private void u(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(a.e.f93599v0, 8);
            remoteViews.setViewVisibility(a.e.f93595t0, 8);
            remoteViews.setViewVisibility(a.e.f93593s0, 8);
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public void a(@androidx.annotation.o0 Bundle bundle) {
            if (this.f25679d) {
                bundle.putCharSequence("android.summaryText", this.f25678c);
            }
            CharSequence charSequence = this.f25677b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String t4 = t();
            if (t4 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", t4);
            }
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public void b(androidx.core.app.y yVar) {
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0180  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x018b  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x017b  */
        @androidx.annotation.c1({androidx.annotation.c1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.o0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.widget.RemoteViews c(boolean r12, int r13, boolean r14) {
            /*
                Method dump skipped, instructions count: 400
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.d0.y.c(boolean, int, boolean):android.widget.RemoteViews");
        }

        @androidx.annotation.q0
        public Notification d() {
            n nVar = this.f25676a;
            if (nVar != null) {
                return nVar.h();
            }
            return null;
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public void e(RemoteViews remoteViews, RemoteViews remoteViews2) {
            u(remoteViews);
            int i4 = a.e.f93559b0;
            remoteViews.removeAllViews(i4);
            remoteViews.addView(i4, remoteViews2.clone());
            remoteViews.setViewVisibility(i4, 0);
            remoteViews.setViewPadding(a.e.f93561c0, 0, f(), 0, 0);
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected void g(@androidx.annotation.o0 Bundle bundle) {
            bundle.remove("android.summaryText");
            bundle.remove("android.title.big");
            bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public Bitmap m(int i4, int i5) {
            return n(i4, i5, 0);
        }

        Bitmap o(@androidx.annotation.o0 IconCompat iconCompat, int i4) {
            return p(iconCompat, i4, 0);
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public boolean r() {
            return false;
        }

        @androidx.annotation.q0
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected String t() {
            return null;
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews v(androidx.core.app.y yVar) {
            return null;
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews w(androidx.core.app.y yVar) {
            return null;
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews x(androidx.core.app.y yVar) {
            return null;
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected void y(@androidx.annotation.o0 Bundle bundle) {
            if (bundle.containsKey("android.summaryText")) {
                this.f25678c = bundle.getCharSequence("android.summaryText");
                this.f25679d = true;
            }
            this.f25677b = bundle.getCharSequence("android.title.big");
        }

        public void z(@androidx.annotation.q0 n nVar) {
            if (this.f25676a != nVar) {
                this.f25676a = nVar;
                if (nVar != null) {
                    nVar.z0(this);
                }
            }
        }
    }

    @Deprecated
    public d0() {
    }

    @androidx.annotation.q0
    public static String A(@androidx.annotation.o0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.e(notification);
        }
        return null;
    }

    public static boolean B(@androidx.annotation.o0 Notification notification) {
        return notification.extras.getBoolean("android.showWhen");
    }

    @androidx.annotation.q0
    public static String C(@androidx.annotation.o0 Notification notification) {
        return notification.getSortKey();
    }

    @androidx.annotation.q0
    public static CharSequence D(@androidx.annotation.o0 Notification notification) {
        return notification.extras.getCharSequence("android.subText");
    }

    public static long E(@androidx.annotation.o0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.f(notification);
        }
        return 0L;
    }

    public static boolean F(@androidx.annotation.o0 Notification notification) {
        return notification.extras.getBoolean("android.showChronometer");
    }

    public static int G(@androidx.annotation.o0 Notification notification) {
        return notification.visibility;
    }

    public static boolean H(@androidx.annotation.o0 Notification notification) {
        return (notification.flags & 512) != 0;
    }

    @androidx.annotation.q0
    public static Bitmap I(@androidx.annotation.o0 Context context, @androidx.annotation.q0 Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(a.c.f93521g);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(a.c.f93520f);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
    }

    @androidx.annotation.q0
    public static b a(@androidx.annotation.o0 Notification notification, int i4) {
        return b(notification.actions[i4]);
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(20)
    static b b(@androidx.annotation.o0 Notification.Action action) {
        t0[] t0VarArr;
        int i4;
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        if (remoteInputs == null) {
            t0VarArr = null;
        } else {
            t0[] t0VarArr2 = new t0[remoteInputs.length];
            for (int i5 = 0; i5 < remoteInputs.length; i5++) {
                RemoteInput remoteInput = remoteInputs[i5];
                t0VarArr2[i5] = new t0(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Build.VERSION.SDK_INT >= 29 ? h.c(remoteInput) : 0, remoteInput.getExtras(), null);
            }
            t0VarArr = t0VarArr2;
        }
        int i6 = Build.VERSION.SDK_INT;
        boolean z4 = action.getExtras().getBoolean("android.support.allowGeneratedReplies") || action.getAllowGeneratedReplies();
        boolean z5 = action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
        int a5 = i6 >= 28 ? g.a(action) : action.getExtras().getInt("android.support.action.semanticAction", 0);
        boolean e4 = i6 >= 29 ? h.e(action) : false;
        boolean a6 = i6 >= 31 ? i.a(action) : false;
        if (action.getIcon() != null || (i4 = action.icon) == 0) {
            return new b(action.getIcon() != null ? IconCompat.m(action.getIcon()) : null, action.title, action.actionIntent, action.getExtras(), t0VarArr, (t0[]) null, z4, a5, z5, e4, a6);
        }
        return new b(i4, action.title, action.actionIntent, action.getExtras(), t0VarArr, (t0[]) null, z4, a5, z5, e4, a6);
    }

    public static int c(@androidx.annotation.o0 Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean d(@androidx.annotation.o0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return h.a(notification);
        }
        return false;
    }

    public static boolean e(@androidx.annotation.o0 Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static int f(@androidx.annotation.o0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.a(notification);
        }
        return 0;
    }

    @androidx.annotation.q0
    public static m g(@androidx.annotation.o0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return m.a(h.b(notification));
        }
        return null;
    }

    @androidx.annotation.q0
    public static String h(@androidx.annotation.o0 Notification notification) {
        return notification.category;
    }

    @androidx.annotation.q0
    public static String i(@androidx.annotation.o0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.b(notification);
        }
        return null;
    }

    public static int j(@androidx.annotation.o0 Notification notification) {
        return notification.color;
    }

    @androidx.annotation.q0
    public static CharSequence k(@androidx.annotation.o0 Notification notification) {
        return notification.extras.getCharSequence("android.infoText");
    }

    @androidx.annotation.q0
    public static CharSequence l(@androidx.annotation.o0 Notification notification) {
        return notification.extras.getCharSequence("android.text");
    }

    @androidx.annotation.q0
    public static CharSequence m(@androidx.annotation.o0 Notification notification) {
        return notification.extras.getCharSequence("android.title");
    }

    @androidx.annotation.q0
    @androidx.annotation.w0(expression = "notification.extras")
    @Deprecated
    public static Bundle n(@androidx.annotation.o0 Notification notification) {
        return notification.extras;
    }

    @androidx.annotation.q0
    public static String o(@androidx.annotation.o0 Notification notification) {
        return notification.getGroup();
    }

    public static int p(@androidx.annotation.o0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.c(notification);
        }
        return 0;
    }

    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    static boolean q(@androidx.annotation.o0 Notification notification) {
        return (notification.flags & 128) != 0;
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(21)
    public static List<b> r(@androidx.annotation.o0 Notification notification) {
        ArrayList arrayList = new ArrayList();
        Bundle bundle = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle == null) {
            return arrayList;
        }
        Bundle bundle2 = bundle.getBundle("invisible_actions");
        if (bundle2 != null) {
            for (int i4 = 0; i4 < bundle2.size(); i4++) {
                arrayList.add(h0.g(bundle2.getBundle(Integer.toString(i4))));
            }
        }
        return arrayList;
    }

    public static boolean s(@androidx.annotation.o0 Notification notification) {
        return (notification.flags & 256) != 0;
    }

    @androidx.annotation.q0
    public static androidx.core.content.a0 t(@androidx.annotation.o0 Notification notification) {
        LocusId d5;
        if (Build.VERSION.SDK_INT < 29 || (d5 = h.d(notification)) == null) {
            return null;
        }
        return androidx.core.content.a0.d(d5);
    }

    @androidx.annotation.o0
    static Notification[] u(@androidx.annotation.o0 Bundle bundle, @androidx.annotation.o0 String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i4 = 0; i4 < parcelableArray.length; i4++) {
            notificationArr[i4] = (Notification) parcelableArray[i4];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    public static boolean v(@androidx.annotation.o0 Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static boolean w(@androidx.annotation.o0 Notification notification) {
        return (notification.flags & 8) != 0;
    }

    @androidx.annotation.o0
    public static List<r0> x(@androidx.annotation.o0 Notification notification) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList("android.people.list");
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(r0.b.a(c0.a(it.next())));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray("android.people");
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    r0.c cVar = new r0.c();
                    cVar.f25873c = str;
                    arrayList.add(new r0(cVar));
                }
            }
        }
        return arrayList;
    }

    @androidx.annotation.q0
    public static Notification y(@androidx.annotation.o0 Notification notification) {
        return notification.publicVersion;
    }

    @androidx.annotation.q0
    public static CharSequence z(@androidx.annotation.o0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f.d(notification);
        }
        return null;
    }

    /* compiled from: NotificationCompat.java */
    public static final class p implements r {

        /* renamed from: d, reason: collision with root package name */
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        static final String f25623d = "android.car.EXTENSIONS";

        /* renamed from: e, reason: collision with root package name */
        private static final String f25624e = "large_icon";

        /* renamed from: f, reason: collision with root package name */
        private static final String f25625f = "car_conversation";

        /* renamed from: g, reason: collision with root package name */
        private static final String f25626g = "app_color";

        /* renamed from: h, reason: collision with root package name */
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        static final String f25627h = "invisible_actions";

        /* renamed from: i, reason: collision with root package name */
        private static final String f25628i = "author";

        /* renamed from: j, reason: collision with root package name */
        private static final String f25629j = "text";

        /* renamed from: k, reason: collision with root package name */
        private static final String f25630k = "messages";

        /* renamed from: l, reason: collision with root package name */
        private static final String f25631l = "remote_input";

        /* renamed from: m, reason: collision with root package name */
        private static final String f25632m = "on_reply";

        /* renamed from: n, reason: collision with root package name */
        private static final String f25633n = "on_read";

        /* renamed from: o, reason: collision with root package name */
        private static final String f25634o = "participants";

        /* renamed from: p, reason: collision with root package name */
        private static final String f25635p = "timestamp";

        /* renamed from: a, reason: collision with root package name */
        private Bitmap f25636a;

        /* renamed from: b, reason: collision with root package name */
        private c f25637b;

        /* renamed from: c, reason: collision with root package name */
        private int f25638c;

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(20)
        static class a {
            private a() {
            }

            static RemoteInput.Builder a(RemoteInput.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            static RemoteInput b(RemoteInput.Builder builder) {
                return builder.build();
            }

            static Parcelable c(RemoteInput remoteInput) {
                return remoteInput;
            }

            static RemoteInput.Builder d(String str) {
                return new RemoteInput.Builder(str);
            }

            static boolean e(RemoteInput remoteInput) {
                return remoteInput.getAllowFreeFormInput();
            }

            static CharSequence[] f(RemoteInput remoteInput) {
                return remoteInput.getChoices();
            }

            static Bundle g(RemoteInput remoteInput) {
                return remoteInput.getExtras();
            }

            static CharSequence h(RemoteInput remoteInput) {
                return remoteInput.getLabel();
            }

            static String i(RemoteInput remoteInput) {
                return remoteInput.getResultKey();
            }

            static RemoteInput.Builder j(RemoteInput.Builder builder, boolean z4) {
                return builder.setAllowFreeFormInput(z4);
            }

            static RemoteInput.Builder k(RemoteInput.Builder builder, CharSequence[] charSequenceArr) {
                return builder.setChoices(charSequenceArr);
            }

            static RemoteInput.Builder l(RemoteInput.Builder builder, CharSequence charSequence) {
                return builder.setLabel(charSequence);
            }
        }

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(29)
        static class b {
            private b() {
            }

            static int a(RemoteInput remoteInput) {
                return remoteInput.getEditChoicesBeforeSending();
            }
        }

        /* compiled from: NotificationCompat.java */
        @Deprecated
        public static class c {

            /* renamed from: a, reason: collision with root package name */
            private final String[] f25639a;

            /* renamed from: b, reason: collision with root package name */
            private final t0 f25640b;

            /* renamed from: c, reason: collision with root package name */
            private final PendingIntent f25641c;

            /* renamed from: d, reason: collision with root package name */
            private final PendingIntent f25642d;

            /* renamed from: e, reason: collision with root package name */
            private final String[] f25643e;

            /* renamed from: f, reason: collision with root package name */
            private final long f25644f;

            /* compiled from: NotificationCompat.java */
            public static class a {

                /* renamed from: a, reason: collision with root package name */
                private final List<String> f25645a = new ArrayList();

                /* renamed from: b, reason: collision with root package name */
                private final String f25646b;

                /* renamed from: c, reason: collision with root package name */
                private t0 f25647c;

                /* renamed from: d, reason: collision with root package name */
                private PendingIntent f25648d;

                /* renamed from: e, reason: collision with root package name */
                private PendingIntent f25649e;

                /* renamed from: f, reason: collision with root package name */
                private long f25650f;

                public a(@androidx.annotation.o0 String str) {
                    this.f25646b = str;
                }

                @androidx.annotation.o0
                public a a(@androidx.annotation.q0 String str) {
                    if (str != null) {
                        this.f25645a.add(str);
                    }
                    return this;
                }

                @androidx.annotation.o0
                public c b() {
                    List<String> list = this.f25645a;
                    return new c((String[]) list.toArray(new String[list.size()]), this.f25647c, this.f25649e, this.f25648d, new String[]{this.f25646b}, this.f25650f);
                }

                @androidx.annotation.o0
                public a c(long j4) {
                    this.f25650f = j4;
                    return this;
                }

                @androidx.annotation.o0
                public a d(@androidx.annotation.q0 PendingIntent pendingIntent) {
                    this.f25648d = pendingIntent;
                    return this;
                }

                @androidx.annotation.o0
                public a e(@androidx.annotation.q0 PendingIntent pendingIntent, @androidx.annotation.q0 t0 t0Var) {
                    this.f25647c = t0Var;
                    this.f25649e = pendingIntent;
                    return this;
                }
            }

            c(@androidx.annotation.q0 String[] strArr, @androidx.annotation.q0 t0 t0Var, @androidx.annotation.q0 PendingIntent pendingIntent, @androidx.annotation.q0 PendingIntent pendingIntent2, @androidx.annotation.q0 String[] strArr2, long j4) {
                this.f25639a = strArr;
                this.f25640b = t0Var;
                this.f25642d = pendingIntent2;
                this.f25641c = pendingIntent;
                this.f25643e = strArr2;
                this.f25644f = j4;
            }

            public long a() {
                return this.f25644f;
            }

            @androidx.annotation.q0
            public String[] b() {
                return this.f25639a;
            }

            @androidx.annotation.q0
            public String c() {
                String[] strArr = this.f25643e;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            @androidx.annotation.q0
            public String[] d() {
                return this.f25643e;
            }

            @androidx.annotation.q0
            public PendingIntent e() {
                return this.f25642d;
            }

            @androidx.annotation.q0
            public t0 f() {
                return this.f25640b;
            }

            @androidx.annotation.q0
            public PendingIntent g() {
                return this.f25641c;
            }
        }

        public p() {
            this.f25638c = 0;
        }

        @androidx.annotation.x0(21)
        private static Bundle b(@androidx.annotation.o0 c cVar) {
            Bundle bundle = new Bundle();
            String str = (cVar.d() == null || cVar.d().length <= 1) ? null : cVar.d()[0];
            int length = cVar.b().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i4 = 0; i4 < length; i4++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", cVar.b()[i4]);
                bundle2.putString("author", str);
                parcelableArr[i4] = bundle2;
            }
            bundle.putParcelableArray("messages", parcelableArr);
            t0 f4 = cVar.f();
            if (f4 != null) {
                RemoteInput.Builder d5 = a.d(f4.o());
                a.l(d5, f4.n());
                a.k(d5, f4.h());
                a.j(d5, f4.f());
                a.a(d5, f4.m());
                bundle.putParcelable("remote_input", a.c(a.b(d5)));
            }
            bundle.putParcelable("on_reply", cVar.g());
            bundle.putParcelable("on_read", cVar.e());
            bundle.putStringArray("participants", cVar.d());
            bundle.putLong("timestamp", cVar.a());
            return bundle;
        }

        @androidx.annotation.x0(21)
        private static c f(@androidx.annotation.q0 Bundle bundle) {
            String[] strArr;
            if (bundle == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("messages");
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                String[] strArr2 = new String[length];
                for (int i4 = 0; i4 < length; i4++) {
                    Parcelable parcelable = parcelableArray[i4];
                    if (parcelable instanceof Bundle) {
                        String string = ((Bundle) parcelable).getString("text");
                        strArr2[i4] = string;
                        if (string != null) {
                        }
                    }
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("on_read");
            PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("on_reply");
            RemoteInput remoteInput = (RemoteInput) bundle.getParcelable("remote_input");
            String[] stringArray = bundle.getStringArray("participants");
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            return new c(strArr, remoteInput != null ? new t0(a.i(remoteInput), a.h(remoteInput), a.f(remoteInput), a.e(remoteInput), Build.VERSION.SDK_INT >= 29 ? b.a(remoteInput) : 0, a.g(remoteInput), null) : null, pendingIntent2, pendingIntent, stringArray, bundle.getLong("timestamp"));
        }

        @Override // androidx.core.app.d0.r
        @androidx.annotation.o0
        public n a(@androidx.annotation.o0 n nVar) {
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.f25636a;
            if (bitmap != null) {
                bundle.putParcelable("large_icon", bitmap);
            }
            int i4 = this.f25638c;
            if (i4 != 0) {
                bundle.putInt("app_color", i4);
            }
            c cVar = this.f25637b;
            if (cVar != null) {
                bundle.putBundle("car_conversation", b(cVar));
            }
            nVar.t().putBundle("android.car.EXTENSIONS", bundle);
            return nVar;
        }

        @androidx.annotation.l
        public int c() {
            return this.f25638c;
        }

        @androidx.annotation.q0
        public Bitmap d() {
            return this.f25636a;
        }

        @androidx.annotation.q0
        @Deprecated
        public c e() {
            return this.f25637b;
        }

        @androidx.annotation.o0
        public p g(@androidx.annotation.l int i4) {
            this.f25638c = i4;
            return this;
        }

        @androidx.annotation.o0
        public p h(@androidx.annotation.q0 Bitmap bitmap) {
            this.f25636a = bitmap;
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public p i(@androidx.annotation.q0 c cVar) {
            this.f25637b = cVar;
            return this;
        }

        public p(@androidx.annotation.o0 Notification notification) {
            this.f25638c = 0;
            Bundle bundle = notification.extras;
            Bundle bundle2 = bundle == null ? null : bundle.getBundle("android.car.EXTENSIONS");
            if (bundle2 != null) {
                this.f25636a = (Bitmap) bundle2.getParcelable("large_icon");
                this.f25638c = bundle2.getInt("app_color", 0);
                this.f25637b = f(bundle2.getBundle("car_conversation"));
            }
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class t extends y {

        /* renamed from: f, reason: collision with root package name */
        private static final String f25653f = "androidx.core.app.NotificationCompat$InboxStyle";

        /* renamed from: e, reason: collision with root package name */
        private ArrayList<CharSequence> f25654e = new ArrayList<>();

        public t() {
        }

        @androidx.annotation.o0
        public t A(@androidx.annotation.q0 CharSequence charSequence) {
            if (charSequence != null) {
                this.f25654e.add(n.A(charSequence));
            }
            return this;
        }

        @androidx.annotation.o0
        public t B(@androidx.annotation.q0 CharSequence charSequence) {
            this.f25677b = n.A(charSequence);
            return this;
        }

        @androidx.annotation.o0
        public t C(@androidx.annotation.q0 CharSequence charSequence) {
            this.f25678c = n.A(charSequence);
            this.f25679d = true;
            return this;
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public void b(androidx.core.app.y yVar) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(yVar.a()).setBigContentTitle(this.f25677b);
            if (this.f25679d) {
                bigContentTitle.setSummaryText(this.f25678c);
            }
            Iterator<CharSequence> it = this.f25654e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected void g(@androidx.annotation.o0 Bundle bundle) {
            super.g(bundle);
            bundle.remove("android.textLines");
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.o0
        protected String t() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected void y(@androidx.annotation.o0 Bundle bundle) {
            super.y(bundle);
            this.f25654e.clear();
            if (bundle.containsKey("android.textLines")) {
                Collections.addAll(this.f25654e, bundle.getCharSequenceArray("android.textLines"));
            }
        }

        public t(@androidx.annotation.q0 n nVar) {
            z(nVar);
        }
    }

    /* compiled from: NotificationCompat.java */
    public static final class z implements r {

        /* renamed from: f, reason: collision with root package name */
        private static final String f25680f = "TvExtender";

        /* renamed from: g, reason: collision with root package name */
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        static final String f25681g = "android.tv.EXTENSIONS";

        /* renamed from: h, reason: collision with root package name */
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        private static final String f25682h = "flags";

        /* renamed from: i, reason: collision with root package name */
        static final String f25683i = "content_intent";

        /* renamed from: j, reason: collision with root package name */
        static final String f25684j = "delete_intent";

        /* renamed from: k, reason: collision with root package name */
        static final String f25685k = "channel_id";

        /* renamed from: l, reason: collision with root package name */
        static final String f25686l = "suppressShowOverApps";

        /* renamed from: m, reason: collision with root package name */
        private static final int f25687m = 1;

        /* renamed from: a, reason: collision with root package name */
        private int f25688a;

        /* renamed from: b, reason: collision with root package name */
        private String f25689b;

        /* renamed from: c, reason: collision with root package name */
        private PendingIntent f25690c;

        /* renamed from: d, reason: collision with root package name */
        private PendingIntent f25691d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f25692e;

        public z() {
            this.f25688a = 1;
        }

        @Override // androidx.core.app.d0.r
        @androidx.annotation.o0
        public n a(@androidx.annotation.o0 n nVar) {
            if (Build.VERSION.SDK_INT < 26) {
                return nVar;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("flags", this.f25688a);
            bundle.putString("channel_id", this.f25689b);
            bundle.putBoolean("suppressShowOverApps", this.f25692e);
            PendingIntent pendingIntent = this.f25690c;
            if (pendingIntent != null) {
                bundle.putParcelable("content_intent", pendingIntent);
            }
            PendingIntent pendingIntent2 = this.f25691d;
            if (pendingIntent2 != null) {
                bundle.putParcelable("delete_intent", pendingIntent2);
            }
            nVar.t().putBundle("android.tv.EXTENSIONS", bundle);
            return nVar;
        }

        @androidx.annotation.q0
        public String b() {
            return this.f25689b;
        }

        @androidx.annotation.q0
        public PendingIntent c() {
            return this.f25690c;
        }

        @androidx.annotation.q0
        public PendingIntent d() {
            return this.f25691d;
        }

        public boolean e() {
            return (this.f25688a & 1) != 0;
        }

        public boolean f() {
            return this.f25692e;
        }

        @androidx.annotation.o0
        public z g(@androidx.annotation.q0 String str) {
            this.f25689b = str;
            return this;
        }

        @androidx.annotation.o0
        public z h(@androidx.annotation.q0 PendingIntent pendingIntent) {
            this.f25690c = pendingIntent;
            return this;
        }

        @androidx.annotation.o0
        public z i(@androidx.annotation.q0 PendingIntent pendingIntent) {
            this.f25691d = pendingIntent;
            return this;
        }

        @androidx.annotation.o0
        public z j(boolean z4) {
            this.f25692e = z4;
            return this;
        }

        public z(@androidx.annotation.o0 Notification notification) {
            if (Build.VERSION.SDK_INT < 26) {
                return;
            }
            Bundle bundle = notification.extras;
            Bundle bundle2 = bundle == null ? null : bundle.getBundle("android.tv.EXTENSIONS");
            if (bundle2 != null) {
                this.f25688a = bundle2.getInt("flags");
                this.f25689b = bundle2.getString("channel_id");
                this.f25692e = bundle2.getBoolean("suppressShowOverApps");
                this.f25690c = (PendingIntent) bundle2.getParcelable("content_intent");
                this.f25691d = (PendingIntent) bundle2.getParcelable("delete_intent");
            }
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class u extends y {

        /* renamed from: j, reason: collision with root package name */
        private static final String f25655j = "androidx.core.app.NotificationCompat$MessagingStyle";

        /* renamed from: k, reason: collision with root package name */
        public static final int f25656k = 25;

        /* renamed from: e, reason: collision with root package name */
        private final List<d> f25657e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        private final List<d> f25658f = new ArrayList();

        /* renamed from: g, reason: collision with root package name */
        private r0 f25659g;

        /* renamed from: h, reason: collision with root package name */
        @androidx.annotation.q0
        private CharSequence f25660h;

        /* renamed from: i, reason: collision with root package name */
        @androidx.annotation.q0
        private Boolean f25661i;

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(24)
        static class a {
            private a() {
            }

            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            static Notification.MessagingStyle b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(26)
        static class b {
            private b() {
            }

            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(28)
        static class c {
            private c() {
            }

            static Notification.MessagingStyle a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z4) {
                return messagingStyle.setGroupConversation(z4);
            }
        }

        u() {
        }

        @androidx.annotation.q0
        public static u E(@androidx.annotation.o0 Notification notification) {
            y s4 = y.s(notification);
            if (s4 instanceof u) {
                return (u) s4;
            }
            return null;
        }

        @androidx.annotation.q0
        private d F() {
            for (int size = this.f25657e.size() - 1; size >= 0; size--) {
                d dVar = this.f25657e.get(size);
                if (dVar.g() != null && !TextUtils.isEmpty(dVar.g().f())) {
                    return dVar;
                }
            }
            if (this.f25657e.isEmpty()) {
                return null;
            }
            return (d) androidx.appcompat.view.menu.d.a(this.f25657e, 1);
        }

        private boolean L() {
            for (int size = this.f25657e.size() - 1; size >= 0; size--) {
                d dVar = this.f25657e.get(size);
                if (dVar.g() != null && dVar.g().f() == null) {
                    return true;
                }
            }
            return false;
        }

        @androidx.annotation.o0
        private TextAppearanceSpan N(int i4) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i4), null);
        }

        private CharSequence O(@androidx.annotation.o0 d dVar) {
            androidx.core.text.a c5 = androidx.core.text.a.c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence f4 = dVar.g() == null ? "" : dVar.g().f();
            boolean isEmpty = TextUtils.isEmpty(f4);
            int i4 = x1.f27484y;
            if (isEmpty) {
                f4 = this.f25659g.f();
                if (this.f25676a.r() != 0) {
                    i4 = this.f25676a.r();
                }
            }
            CharSequence m4 = c5.m(f4);
            spannableStringBuilder.append(m4);
            spannableStringBuilder.setSpan(N(i4), spannableStringBuilder.length() - m4.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "  ").append(c5.m(dVar.i() != null ? dVar.i() : ""));
            return spannableStringBuilder;
        }

        @androidx.annotation.o0
        public u A(@androidx.annotation.q0 d dVar) {
            if (dVar != null) {
                this.f25658f.add(dVar);
                if (this.f25658f.size() > 25) {
                    this.f25658f.remove(0);
                }
            }
            return this;
        }

        @androidx.annotation.o0
        public u B(@androidx.annotation.q0 d dVar) {
            if (dVar != null) {
                this.f25657e.add(dVar);
                if (this.f25657e.size() > 25) {
                    this.f25657e.remove(0);
                }
            }
            return this;
        }

        @androidx.annotation.o0
        public u C(@androidx.annotation.q0 CharSequence charSequence, long j4, @androidx.annotation.q0 r0 r0Var) {
            B(new d(charSequence, j4, r0Var));
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public u D(@androidx.annotation.q0 CharSequence charSequence, long j4, @androidx.annotation.q0 CharSequence charSequence2) {
            List<d> list = this.f25657e;
            r0.c cVar = new r0.c();
            cVar.f25871a = charSequence2;
            list.add(new d(charSequence, j4, new r0(cVar)));
            if (this.f25657e.size() > 25) {
                this.f25657e.remove(0);
            }
            return this;
        }

        @androidx.annotation.q0
        public CharSequence G() {
            return this.f25660h;
        }

        @androidx.annotation.o0
        public List<d> H() {
            return this.f25658f;
        }

        @androidx.annotation.o0
        public List<d> I() {
            return this.f25657e;
        }

        @androidx.annotation.o0
        public r0 J() {
            return this.f25659g;
        }

        @androidx.annotation.q0
        @Deprecated
        public CharSequence K() {
            return this.f25659g.f();
        }

        public boolean M() {
            n nVar = this.f25676a;
            if (nVar != null && nVar.f25581a.getApplicationInfo().targetSdkVersion < 28 && this.f25661i == null) {
                return this.f25660h != null;
            }
            Boolean bool = this.f25661i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        @androidx.annotation.o0
        public u P(@androidx.annotation.q0 CharSequence charSequence) {
            this.f25660h = charSequence;
            return this;
        }

        @androidx.annotation.o0
        public u Q(boolean z4) {
            this.f25661i = Boolean.valueOf(z4);
            return this;
        }

        @Override // androidx.core.app.d0.y
        public void a(@androidx.annotation.o0 Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f25659g.f());
            bundle.putBundle("android.messagingStyleUser", this.f25659g.m());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f25660h);
            if (this.f25660h != null && this.f25661i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f25660h);
            }
            if (!this.f25657e.isEmpty()) {
                bundle.putParcelableArray("android.messages", d.a(this.f25657e));
            }
            if (!this.f25658f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", d.a(this.f25658f));
            }
            Boolean bool = this.f25661i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public void b(androidx.core.app.y yVar) {
            Q(M());
            Notification.MessagingStyle a5 = Build.VERSION.SDK_INT >= 28 ? c.a(this.f25659g.k()) : a.b(this.f25659g.f());
            Iterator<d> it = this.f25657e.iterator();
            while (it.hasNext()) {
                a.a(a5, it.next().l());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator<d> it2 = this.f25658f.iterator();
                while (it2.hasNext()) {
                    b.a(a5, it2.next().l());
                }
            }
            if (this.f25661i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                a.c(a5, this.f25660h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                c.b(a5, this.f25661i.booleanValue());
            }
            a5.setBuilder(yVar.a());
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected void g(@androidx.annotation.o0 Bundle bundle) {
            super.g(bundle);
            bundle.remove("android.messagingStyleUser");
            bundle.remove("android.selfDisplayName");
            bundle.remove("android.conversationTitle");
            bundle.remove("android.hiddenConversationTitle");
            bundle.remove("android.messages");
            bundle.remove("android.messages.historic");
            bundle.remove("android.isGroupConversation");
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.o0
        protected String t() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        @Override // androidx.core.app.d0.y
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected void y(@androidx.annotation.o0 Bundle bundle) {
            super.y(bundle);
            this.f25657e.clear();
            if (bundle.containsKey("android.messagingStyleUser")) {
                this.f25659g = r0.b(bundle.getBundle("android.messagingStyleUser"));
            } else {
                r0.c cVar = new r0.c();
                cVar.f25871a = bundle.getString("android.selfDisplayName");
                this.f25659g = new r0(cVar);
            }
            CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
            this.f25660h = charSequence;
            if (charSequence == null) {
                this.f25660h = bundle.getCharSequence("android.hiddenConversationTitle");
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.f25657e.addAll(d.f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
            if (parcelableArray2 != null) {
                this.f25658f.addAll(d.f(parcelableArray2));
            }
            if (bundle.containsKey("android.isGroupConversation")) {
                this.f25661i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
            }
        }

        @Deprecated
        public u(@androidx.annotation.o0 CharSequence charSequence) {
            r0.c cVar = new r0.c();
            cVar.f25871a = charSequence;
            this.f25659g = new r0(cVar);
        }

        /* compiled from: NotificationCompat.java */
        public static final class d {

            /* renamed from: g, reason: collision with root package name */
            static final String f25662g = "text";

            /* renamed from: h, reason: collision with root package name */
            static final String f25663h = "time";

            /* renamed from: i, reason: collision with root package name */
            static final String f25664i = "sender";

            /* renamed from: j, reason: collision with root package name */
            static final String f25665j = "type";

            /* renamed from: k, reason: collision with root package name */
            static final String f25666k = "uri";

            /* renamed from: l, reason: collision with root package name */
            static final String f25667l = "extras";

            /* renamed from: m, reason: collision with root package name */
            static final String f25668m = "person";

            /* renamed from: n, reason: collision with root package name */
            static final String f25669n = "sender_person";

            /* renamed from: a, reason: collision with root package name */
            private final CharSequence f25670a;

            /* renamed from: b, reason: collision with root package name */
            private final long f25671b;

            /* renamed from: c, reason: collision with root package name */
            @androidx.annotation.q0
            private final r0 f25672c;

            /* renamed from: d, reason: collision with root package name */
            private Bundle f25673d;

            /* renamed from: e, reason: collision with root package name */
            @androidx.annotation.q0
            private String f25674e;

            /* renamed from: f, reason: collision with root package name */
            @androidx.annotation.q0
            private Uri f25675f;

            /* compiled from: NotificationCompat.java */
            @androidx.annotation.x0(24)
            static class a {
                private a() {
                }

                static Notification.MessagingStyle.Message a(CharSequence charSequence, long j4, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j4, charSequence2);
                }

                static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            /* compiled from: NotificationCompat.java */
            @androidx.annotation.x0(28)
            static class b {
                private b() {
                }

                static Parcelable a(Person person) {
                    return person;
                }

                static Notification.MessagingStyle.Message b(CharSequence charSequence, long j4, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j4, person);
                }
            }

            public d(@androidx.annotation.q0 CharSequence charSequence, long j4, @androidx.annotation.q0 r0 r0Var) {
                this.f25673d = new Bundle();
                this.f25670a = charSequence;
                this.f25671b = j4;
                this.f25672c = r0Var;
            }

            @androidx.annotation.o0
            static Bundle[] a(@androidx.annotation.o0 List<d> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    bundleArr[i4] = list.get(i4).m();
                }
                return bundleArr;
            }

            @androidx.annotation.q0
            static d e(@androidx.annotation.o0 Bundle bundle) {
                r0 r0Var;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        if (bundle.containsKey("person")) {
                            r0Var = r0.b(bundle.getBundle("person"));
                        } else if (bundle.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                            r0Var = r0.b.a(c0.a(bundle.getParcelable("sender_person")));
                        } else if (bundle.containsKey("sender")) {
                            r0.c cVar = new r0.c();
                            cVar.f25871a = bundle.getCharSequence("sender");
                            r0Var = new r0(cVar);
                        } else {
                            r0Var = null;
                        }
                        d dVar = new d(bundle.getCharSequence("text"), bundle.getLong("time"), r0Var);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            String string = bundle.getString("type");
                            Uri uri = (Uri) bundle.getParcelable("uri");
                            dVar.f25674e = string;
                            dVar.f25675f = uri;
                        }
                        if (bundle.containsKey("extras")) {
                            dVar.f25673d.putAll(bundle.getBundle("extras"));
                        }
                        return dVar;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @androidx.annotation.o0
            static List<d> f(@androidx.annotation.o0 Parcelable[] parcelableArr) {
                d e4;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (e4 = e((Bundle) parcelable)) != null) {
                        arrayList.add(e4);
                    }
                }
                return arrayList;
            }

            @androidx.annotation.o0
            private Bundle m() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f25670a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f25671b);
                r0 r0Var = this.f25672c;
                if (r0Var != null) {
                    bundle.putCharSequence("sender", r0Var.f());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", b.a(this.f25672c.k()));
                    } else {
                        bundle.putBundle("person", this.f25672c.m());
                    }
                }
                String str = this.f25674e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f25675f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f25673d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            @androidx.annotation.q0
            public String b() {
                return this.f25674e;
            }

            @androidx.annotation.q0
            public Uri c() {
                return this.f25675f;
            }

            @androidx.annotation.o0
            public Bundle d() {
                return this.f25673d;
            }

            @androidx.annotation.q0
            public r0 g() {
                return this.f25672c;
            }

            @androidx.annotation.q0
            @Deprecated
            public CharSequence h() {
                r0 r0Var = this.f25672c;
                if (r0Var == null) {
                    return null;
                }
                return r0Var.f();
            }

            @androidx.annotation.q0
            public CharSequence i() {
                return this.f25670a;
            }

            public long j() {
                return this.f25671b;
            }

            @androidx.annotation.o0
            public d k(@androidx.annotation.q0 String str, @androidx.annotation.q0 Uri uri) {
                this.f25674e = str;
                this.f25675f = uri;
                return this;
            }

            @c1({c1.a.LIBRARY_GROUP_PREFIX})
            @androidx.annotation.o0
            @androidx.annotation.x0(24)
            Notification.MessagingStyle.Message l() {
                Notification.MessagingStyle.Message a5;
                r0 r0Var = this.f25672c;
                if (Build.VERSION.SDK_INT >= 28) {
                    a5 = b.b(this.f25670a, this.f25671b, r0Var != null ? r0Var.k() : null);
                } else {
                    a5 = a.a(this.f25670a, this.f25671b, r0Var != null ? r0Var.f() : null);
                }
                String str = this.f25674e;
                if (str != null) {
                    a.b(a5, str, this.f25675f);
                }
                return a5;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            @java.lang.Deprecated
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public d(@androidx.annotation.q0 java.lang.CharSequence r2, long r3, @androidx.annotation.q0 java.lang.CharSequence r5) {
                /*
                    r1 = this;
                    androidx.core.app.r0$c r0 = new androidx.core.app.r0$c
                    r0.<init>()
                    r0.f25871a = r5
                    androidx.core.app.r0 r5 = new androidx.core.app.r0
                    r5.<init>(r0)
                    r1.<init>(r2, r3, r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.d0.u.d.<init>(java.lang.CharSequence, long, java.lang.CharSequence):void");
            }
        }

        public u(@androidx.annotation.o0 r0 r0Var) {
            if (!TextUtils.isEmpty(r0Var.f())) {
                this.f25659g = r0Var;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }

    /* compiled from: NotificationCompat.java */
    public static final class a0 implements r {
        private static final int M = 1;
        private static final int N = 2;
        private static final int O = 4;
        private static final int P = 8;
        private static final int Q = 16;
        private static final int R = 32;
        private static final int S = 64;
        private static final int T = 1;
        private static final int U = 8388613;
        private static final int V = 80;

        /* renamed from: o, reason: collision with root package name */
        public static final int f25483o = -1;

        /* renamed from: p, reason: collision with root package name */
        @Deprecated
        public static final int f25484p = 0;

        /* renamed from: q, reason: collision with root package name */
        @Deprecated
        public static final int f25485q = 1;

        /* renamed from: r, reason: collision with root package name */
        @Deprecated
        public static final int f25486r = 2;

        /* renamed from: s, reason: collision with root package name */
        @Deprecated
        public static final int f25487s = 3;

        /* renamed from: t, reason: collision with root package name */
        @Deprecated
        public static final int f25488t = 4;

        /* renamed from: u, reason: collision with root package name */
        @Deprecated
        public static final int f25489u = 5;

        /* renamed from: v, reason: collision with root package name */
        @Deprecated
        public static final int f25490v = 0;

        /* renamed from: w, reason: collision with root package name */
        @Deprecated
        public static final int f25491w = -1;

        /* renamed from: a, reason: collision with root package name */
        private ArrayList<b> f25495a;

        /* renamed from: b, reason: collision with root package name */
        private int f25496b;

        /* renamed from: c, reason: collision with root package name */
        private PendingIntent f25497c;

        /* renamed from: d, reason: collision with root package name */
        private ArrayList<Notification> f25498d;

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f25499e;

        /* renamed from: f, reason: collision with root package name */
        private int f25500f;

        /* renamed from: g, reason: collision with root package name */
        private int f25501g;

        /* renamed from: h, reason: collision with root package name */
        private int f25502h;

        /* renamed from: i, reason: collision with root package name */
        private int f25503i;

        /* renamed from: j, reason: collision with root package name */
        private int f25504j;

        /* renamed from: k, reason: collision with root package name */
        private int f25505k;

        /* renamed from: l, reason: collision with root package name */
        private int f25506l;

        /* renamed from: m, reason: collision with root package name */
        private String f25507m;

        /* renamed from: n, reason: collision with root package name */
        private String f25508n;
        private static final String A = "displayIntent";
        private static final String B = "pages";
        private static final String C = "background";
        private static final String D = "contentIcon";
        private static final String E = "contentIconGravity";
        private static final String F = "contentActionIndex";
        private static final String G = "customSizePreset";
        private static final String H = "customContentHeight";
        private static final String I = "gravity";
        private static final String J = "hintScreenTimeout";
        private static final String K = "dismissalId";
        private static final String L = "bridgeTag";

        /* renamed from: x, reason: collision with root package name */
        private static final String f25492x = "android.wearable.EXTENSIONS";

        /* renamed from: y, reason: collision with root package name */
        private static final String f25493y = "actions";

        /* renamed from: z, reason: collision with root package name */
        private static final String f25494z = "flags";

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(20)
        static class a {
            private a() {
            }

            static Notification.Action.Builder a(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            static Notification.Action.Builder b(Notification.Action.Builder builder, RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            static Notification.Action c(Notification.Action.Builder builder) {
                return builder.build();
            }

            static Notification.Action.Builder d(int i4, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i4, charSequence, pendingIntent);
            }

            public static b e(ArrayList<Parcelable> arrayList, int i4) {
                return d0.b((Notification.Action) arrayList.get(i4));
            }
        }

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(23)
        static class b {
            private b() {
            }

            static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }
        }

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(24)
        static class c {
            private c() {
            }

            static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z4) {
                return builder.setAllowGeneratedReplies(z4);
            }
        }

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(31)
        static class d {
            private d() {
            }

            static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z4) {
                return builder.setAuthenticationRequired(z4);
            }
        }

        public a0() {
            this.f25495a = new ArrayList<>();
            this.f25496b = 1;
            this.f25498d = new ArrayList<>();
            this.f25501g = 8388613;
            this.f25502h = -1;
            this.f25503i = 0;
            this.f25505k = 80;
        }

        private void N(int i4, boolean z4) {
            if (z4) {
                this.f25496b = i4 | this.f25496b;
            } else {
                this.f25496b = (~i4) & this.f25496b;
            }
        }

        @androidx.annotation.x0(20)
        private static Notification.Action i(b bVar) {
            int i4 = Build.VERSION.SDK_INT;
            IconCompat f4 = bVar.f();
            Notification.Action.Builder a5 = b.a(f4 == null ? null : f4.J(), bVar.j(), bVar.a());
            Bundle bundle = bVar.d() != null ? new Bundle(bVar.d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", bVar.b());
            c.a(a5, bVar.b());
            if (i4 >= 31) {
                d.a(a5, bVar.k());
            }
            a.a(a5, bundle);
            t0[] g4 = bVar.g();
            if (g4 != null) {
                for (RemoteInput remoteInput : t0.d(g4)) {
                    a.b(a5, remoteInput);
                }
            }
            return a.c(a5);
        }

        @Deprecated
        public boolean A() {
            return (this.f25496b & 4) != 0;
        }

        @androidx.annotation.o0
        @Deprecated
        public List<Notification> B() {
            return this.f25498d;
        }

        public boolean C() {
            return (this.f25496b & 8) != 0;
        }

        @androidx.annotation.o0
        @Deprecated
        public a0 D(@androidx.annotation.q0 Bitmap bitmap) {
            this.f25499e = bitmap;
            return this;
        }

        @androidx.annotation.o0
        public a0 E(@androidx.annotation.q0 String str) {
            this.f25508n = str;
            return this;
        }

        @androidx.annotation.o0
        public a0 F(int i4) {
            this.f25502h = i4;
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public a0 G(int i4) {
            this.f25500f = i4;
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public a0 H(int i4) {
            this.f25501g = i4;
            return this;
        }

        @androidx.annotation.o0
        public a0 I(boolean z4) {
            N(1, z4);
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public a0 J(int i4) {
            this.f25504j = i4;
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public a0 K(int i4) {
            this.f25503i = i4;
            return this;
        }

        @androidx.annotation.o0
        public a0 L(@androidx.annotation.q0 String str) {
            this.f25507m = str;
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public a0 M(@androidx.annotation.q0 PendingIntent pendingIntent) {
            this.f25497c = pendingIntent;
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public a0 O(int i4) {
            this.f25505k = i4;
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public a0 P(boolean z4) {
            N(32, z4);
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public a0 Q(boolean z4) {
            N(16, z4);
            return this;
        }

        @androidx.annotation.o0
        public a0 R(boolean z4) {
            N(64, z4);
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public a0 S(boolean z4) {
            N(2, z4);
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public a0 T(int i4) {
            this.f25506l = i4;
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public a0 U(boolean z4) {
            N(4, z4);
            return this;
        }

        @androidx.annotation.o0
        public a0 V(boolean z4) {
            N(8, z4);
            return this;
        }

        @Override // androidx.core.app.d0.r
        @androidx.annotation.o0
        public n a(@androidx.annotation.o0 n nVar) {
            Bundle bundle = new Bundle();
            if (!this.f25495a.isEmpty()) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f25495a.size());
                Iterator<b> it = this.f25495a.iterator();
                while (it.hasNext()) {
                    arrayList.add(i(it.next()));
                }
                bundle.putParcelableArrayList("actions", arrayList);
            }
            int i4 = this.f25496b;
            if (i4 != 1) {
                bundle.putInt("flags", i4);
            }
            PendingIntent pendingIntent = this.f25497c;
            if (pendingIntent != null) {
                bundle.putParcelable("displayIntent", pendingIntent);
            }
            if (!this.f25498d.isEmpty()) {
                ArrayList<Notification> arrayList2 = this.f25498d;
                bundle.putParcelableArray("pages", (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.f25499e;
            if (bitmap != null) {
                bundle.putParcelable("background", bitmap);
            }
            int i5 = this.f25500f;
            if (i5 != 0) {
                bundle.putInt("contentIcon", i5);
            }
            int i6 = this.f25501g;
            if (i6 != 8388613) {
                bundle.putInt("contentIconGravity", i6);
            }
            int i7 = this.f25502h;
            if (i7 != -1) {
                bundle.putInt("contentActionIndex", i7);
            }
            int i10 = this.f25503i;
            if (i10 != 0) {
                bundle.putInt("customSizePreset", i10);
            }
            int i11 = this.f25504j;
            if (i11 != 0) {
                bundle.putInt("customContentHeight", i11);
            }
            int i12 = this.f25505k;
            if (i12 != 80) {
                bundle.putInt("gravity", i12);
            }
            int i13 = this.f25506l;
            if (i13 != 0) {
                bundle.putInt("hintScreenTimeout", i13);
            }
            String str = this.f25507m;
            if (str != null) {
                bundle.putString("dismissalId", str);
            }
            String str2 = this.f25508n;
            if (str2 != null) {
                bundle.putString("bridgeTag", str2);
            }
            nVar.t().putBundle("android.wearable.EXTENSIONS", bundle);
            return nVar;
        }

        @androidx.annotation.o0
        public a0 b(@androidx.annotation.o0 b bVar) {
            this.f25495a.add(bVar);
            return this;
        }

        @androidx.annotation.o0
        public a0 c(@androidx.annotation.o0 List<b> list) {
            this.f25495a.addAll(list);
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public a0 d(@androidx.annotation.o0 Notification notification) {
            this.f25498d.add(notification);
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public a0 e(@androidx.annotation.o0 List<Notification> list) {
            this.f25498d.addAll(list);
            return this;
        }

        @androidx.annotation.o0
        public a0 f() {
            this.f25495a.clear();
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public a0 g() {
            this.f25498d.clear();
            return this;
        }

        @androidx.annotation.o0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a0 clone() {
            a0 a0Var = new a0();
            a0Var.f25495a = new ArrayList<>(this.f25495a);
            a0Var.f25496b = this.f25496b;
            a0Var.f25497c = this.f25497c;
            a0Var.f25498d = new ArrayList<>(this.f25498d);
            a0Var.f25499e = this.f25499e;
            a0Var.f25500f = this.f25500f;
            a0Var.f25501g = this.f25501g;
            a0Var.f25502h = this.f25502h;
            a0Var.f25503i = this.f25503i;
            a0Var.f25504j = this.f25504j;
            a0Var.f25505k = this.f25505k;
            a0Var.f25506l = this.f25506l;
            a0Var.f25507m = this.f25507m;
            a0Var.f25508n = this.f25508n;
            return a0Var;
        }

        @androidx.annotation.o0
        public List<b> j() {
            return this.f25495a;
        }

        @androidx.annotation.q0
        @Deprecated
        public Bitmap k() {
            return this.f25499e;
        }

        @androidx.annotation.q0
        public String l() {
            return this.f25508n;
        }

        public int m() {
            return this.f25502h;
        }

        @Deprecated
        public int n() {
            return this.f25500f;
        }

        @Deprecated
        public int o() {
            return this.f25501g;
        }

        public boolean p() {
            return (this.f25496b & 1) != 0;
        }

        @Deprecated
        public int q() {
            return this.f25504j;
        }

        @Deprecated
        public int r() {
            return this.f25503i;
        }

        @androidx.annotation.q0
        public String s() {
            return this.f25507m;
        }

        @androidx.annotation.q0
        @Deprecated
        public PendingIntent t() {
            return this.f25497c;
        }

        @Deprecated
        public int u() {
            return this.f25505k;
        }

        @Deprecated
        public boolean v() {
            return (this.f25496b & 32) != 0;
        }

        @Deprecated
        public boolean w() {
            return (this.f25496b & 16) != 0;
        }

        public boolean x() {
            return (this.f25496b & 64) != 0;
        }

        @Deprecated
        public boolean y() {
            return (this.f25496b & 2) != 0;
        }

        @Deprecated
        public int z() {
            return this.f25506l;
        }

        public a0(@androidx.annotation.o0 Notification notification) {
            this.f25495a = new ArrayList<>();
            this.f25496b = 1;
            this.f25498d = new ArrayList<>();
            this.f25501g = 8388613;
            this.f25502h = -1;
            this.f25503i = 0;
            this.f25505k = 80;
            Bundle bundle = notification.extras;
            Bundle bundle2 = bundle != null ? bundle.getBundle("android.wearable.EXTENSIONS") : null;
            if (bundle2 != null) {
                ArrayList parcelableArrayList = bundle2.getParcelableArrayList("actions");
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    b[] bVarArr = new b[size];
                    for (int i4 = 0; i4 < size; i4++) {
                        bVarArr[i4] = a.e(parcelableArrayList, i4);
                    }
                    Collections.addAll(this.f25495a, bVarArr);
                }
                this.f25496b = bundle2.getInt("flags", 1);
                this.f25497c = (PendingIntent) bundle2.getParcelable("displayIntent");
                Notification[] u4 = d0.u(bundle2, "pages");
                if (u4 != null) {
                    Collections.addAll(this.f25498d, u4);
                }
                this.f25499e = (Bitmap) bundle2.getParcelable("background");
                this.f25500f = bundle2.getInt("contentIcon");
                this.f25501g = bundle2.getInt("contentIconGravity", 8388613);
                this.f25502h = bundle2.getInt("contentActionIndex", -1);
                this.f25503i = bundle2.getInt("customSizePreset", 0);
                this.f25504j = bundle2.getInt("customContentHeight");
                this.f25505k = bundle2.getInt("gravity", 80);
                this.f25506l = bundle2.getInt("hintScreenTimeout");
                this.f25507m = bundle2.getString("dismissalId");
                this.f25508n = bundle2.getString("bridgeTag");
            }
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class n {
        private static final int Y = 5120;
        boolean A;
        boolean B;
        boolean C;
        String D;
        Bundle E;
        int F;
        int G;
        Notification H;
        RemoteViews I;
        RemoteViews J;
        RemoteViews K;
        String L;
        int M;
        String N;
        androidx.core.content.a0 O;
        long P;
        int Q;
        int R;
        boolean S;
        m T;
        Notification U;
        boolean V;
        Object W;

        @Deprecated
        public ArrayList<String> X;

        /* renamed from: a, reason: collision with root package name */
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public Context f25581a;

        /* renamed from: b, reason: collision with root package name */
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public ArrayList<b> f25582b;

        /* renamed from: c, reason: collision with root package name */
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.o0
        public ArrayList<r0> f25583c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<b> f25584d;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f25585e;

        /* renamed from: f, reason: collision with root package name */
        CharSequence f25586f;

        /* renamed from: g, reason: collision with root package name */
        PendingIntent f25587g;

        /* renamed from: h, reason: collision with root package name */
        PendingIntent f25588h;

        /* renamed from: i, reason: collision with root package name */
        RemoteViews f25589i;

        /* renamed from: j, reason: collision with root package name */
        IconCompat f25590j;

        /* renamed from: k, reason: collision with root package name */
        CharSequence f25591k;

        /* renamed from: l, reason: collision with root package name */
        int f25592l;

        /* renamed from: m, reason: collision with root package name */
        int f25593m;

        /* renamed from: n, reason: collision with root package name */
        boolean f25594n;

        /* renamed from: o, reason: collision with root package name */
        boolean f25595o;

        /* renamed from: p, reason: collision with root package name */
        boolean f25596p;

        /* renamed from: q, reason: collision with root package name */
        y f25597q;

        /* renamed from: r, reason: collision with root package name */
        CharSequence f25598r;

        /* renamed from: s, reason: collision with root package name */
        CharSequence f25599s;

        /* renamed from: t, reason: collision with root package name */
        CharSequence[] f25600t;

        /* renamed from: u, reason: collision with root package name */
        int f25601u;

        /* renamed from: v, reason: collision with root package name */
        int f25602v;

        /* renamed from: w, reason: collision with root package name */
        boolean f25603w;

        /* renamed from: x, reason: collision with root package name */
        String f25604x;

        /* renamed from: y, reason: collision with root package name */
        boolean f25605y;

        /* renamed from: z, reason: collision with root package name */
        String f25606z;

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(21)
        static class a {
            private a() {
            }

            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i4) {
                return builder.setContentType(i4);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i4) {
                return builder.setLegacyStreamType(i4);
            }

            static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i4) {
                return builder.setUsage(i4);
            }
        }

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(23)
        static class b {
            private b() {
            }

            static Icon a(Notification notification) {
                return notification.getLargeIcon();
            }

            static Icon b(Notification notification) {
                return notification.getSmallIcon();
            }
        }

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(24)
        static class c {
            private c() {
            }

            static RemoteViews a(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            static RemoteViews b(Notification.Builder builder) {
                return builder.createContentView();
            }

            static RemoteViews c(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            static Notification.Builder d(Context context, Notification notification) {
                return Notification.Builder.recoverBuilder(context, notification);
            }
        }

        public n(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Notification notification) {
            this(context, d0.i(notification));
            ArrayList parcelableArrayList;
            Bundle bundle = notification.extras;
            y s4 = y.s(notification);
            O(d0.m(notification)).N(d0.l(notification)).L(d0.k(notification)).A0(d0.D(notification)).o0(d0.z(notification)).z0(s4).Y(notification.getGroup()).a0(d0.H(notification)).f0(d0.t(notification)).H0(notification.when).r0(d0.B(notification)).E0(d0.F(notification)).C(d0.e(notification)).j0(d0.w(notification)).i0(d0.v(notification)).e0(d0.s(notification)).b0(notification.largeIcon).D(d0.f(notification)).F(notification.category).E(d0.g(notification)).h0(notification.number).B0(notification.tickerText).M(notification.contentIntent).T(notification.deleteIntent).X(notification.fullScreenIntent, d0.q(notification)).y0(notification.sound, notification.audioStreamType).F0(notification.vibrate).d0(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).S(notification.defaults).k0(notification.priority).I(notification.color).G0(notification.visibility).m0(notification.publicVersion).w0(notification.getSortKey()).D0(d0.E(notification)).p0(d0.A(notification)).l0(bundle.getInt("android.progressMax"), bundle.getInt("android.progress"), bundle.getBoolean("android.progressIndeterminate")).B(d0.d(notification)).u0(notification.icon, notification.iconLevel).c(u(notification, s4));
            this.W = b.b(notification);
            Icon a5 = b.a(notification);
            if (a5 != null) {
                this.f25590j = IconCompat.l(a5);
            }
            Notification.Action[] actionArr = notification.actions;
            if (actionArr != null && actionArr.length != 0) {
                for (Notification.Action action : actionArr) {
                    b(b.a.f(action).c());
                }
            }
            List<b> r4 = d0.r(notification);
            if (!r4.isEmpty()) {
                Iterator<b> it = r4.iterator();
                while (it.hasNext()) {
                    e(it.next());
                }
            }
            String[] stringArray = notification.extras.getStringArray("android.people");
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    g(str);
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList("android.people.list")) != null && !parcelableArrayList.isEmpty()) {
                Iterator it2 = parcelableArrayList.iterator();
                while (it2.hasNext()) {
                    f(r0.b.a(c0.a(it2.next())));
                }
            }
            int i4 = Build.VERSION.SDK_INT;
            if (bundle.containsKey("android.chronometerCountDown")) {
                H(bundle.getBoolean("android.chronometerCountDown"));
            }
            if (i4 < 26 || !bundle.containsKey("android.colorized")) {
                return;
            }
            J(bundle.getBoolean("android.colorized"));
        }

        @androidx.annotation.q0
        protected static CharSequence A(@androidx.annotation.q0 CharSequence charSequence) {
            return charSequence == null ? charSequence : charSequence.length() > Y ? charSequence.subSequence(0, Y) : charSequence;
        }

        private boolean I0() {
            y yVar = this.f25597q;
            return yVar == null || !yVar.r();
        }

        private void V(int i4, boolean z4) {
            if (z4) {
                Notification notification = this.U;
                notification.flags = i4 | notification.flags;
            } else {
                Notification notification2 = this.U;
                notification2.flags = (~i4) & notification2.flags;
            }
        }

        @androidx.annotation.q0
        private static Bundle u(@androidx.annotation.o0 Notification notification, @androidx.annotation.q0 y yVar) {
            if (notification.extras == null) {
                return null;
            }
            Bundle bundle = new Bundle(notification.extras);
            bundle.remove("android.title");
            bundle.remove("android.text");
            bundle.remove("android.infoText");
            bundle.remove("android.subText");
            bundle.remove("android.intent.extra.CHANNEL_ID");
            bundle.remove("android.intent.extra.CHANNEL_GROUP_ID");
            bundle.remove("android.showWhen");
            bundle.remove("android.progress");
            bundle.remove("android.progressMax");
            bundle.remove("android.progressIndeterminate");
            bundle.remove("android.chronometerCountDown");
            bundle.remove("android.colorized");
            bundle.remove("android.people.list");
            bundle.remove("android.people");
            bundle.remove("android.support.sortKey");
            bundle.remove("android.support.groupKey");
            bundle.remove("android.support.isGroupSummary");
            bundle.remove("android.support.localOnly");
            bundle.remove("android.support.actionExtras");
            Bundle bundle2 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle2 != null) {
                Bundle bundle3 = new Bundle(bundle2);
                bundle3.remove("invisible_actions");
                bundle.putBundle("android.car.EXTENSIONS", bundle3);
            }
            if (yVar != null) {
                yVar.g(bundle);
            }
            return bundle;
        }

        @androidx.annotation.o0
        public n A0(@androidx.annotation.q0 CharSequence charSequence) {
            this.f25598r = A(charSequence);
            return this;
        }

        @androidx.annotation.o0
        public n B(boolean z4) {
            this.S = z4;
            return this;
        }

        @androidx.annotation.o0
        public n B0(@androidx.annotation.q0 CharSequence charSequence) {
            this.U.tickerText = A(charSequence);
            return this;
        }

        @androidx.annotation.o0
        public n C(boolean z4) {
            V(16, z4);
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public n C0(@androidx.annotation.q0 CharSequence charSequence, @androidx.annotation.q0 RemoteViews remoteViews) {
            this.U.tickerText = A(charSequence);
            this.f25589i = remoteViews;
            return this;
        }

        @androidx.annotation.o0
        public n D(int i4) {
            this.M = i4;
            return this;
        }

        @androidx.annotation.o0
        public n D0(long j4) {
            this.P = j4;
            return this;
        }

        @androidx.annotation.o0
        public n E(@androidx.annotation.q0 m mVar) {
            this.T = mVar;
            return this;
        }

        @androidx.annotation.o0
        public n E0(boolean z4) {
            this.f25595o = z4;
            return this;
        }

        @androidx.annotation.o0
        public n F(@androidx.annotation.q0 String str) {
            this.D = str;
            return this;
        }

        @androidx.annotation.o0
        public n F0(@androidx.annotation.q0 long[] jArr) {
            this.U.vibrate = jArr;
            return this;
        }

        @androidx.annotation.o0
        public n G(@androidx.annotation.o0 String str) {
            this.L = str;
            return this;
        }

        @androidx.annotation.o0
        public n G0(int i4) {
            this.G = i4;
            return this;
        }

        @androidx.annotation.o0
        @androidx.annotation.x0(24)
        public n H(boolean z4) {
            this.f25596p = z4;
            t().putBoolean("android.chronometerCountDown", z4);
            return this;
        }

        @androidx.annotation.o0
        public n H0(long j4) {
            this.U.when = j4;
            return this;
        }

        @androidx.annotation.o0
        public n I(@androidx.annotation.l int i4) {
            this.F = i4;
            return this;
        }

        @androidx.annotation.o0
        public n J(boolean z4) {
            this.B = z4;
            this.C = true;
            return this;
        }

        @androidx.annotation.o0
        public n K(@androidx.annotation.q0 RemoteViews remoteViews) {
            this.U.contentView = remoteViews;
            return this;
        }

        @androidx.annotation.o0
        public n L(@androidx.annotation.q0 CharSequence charSequence) {
            this.f25591k = A(charSequence);
            return this;
        }

        @androidx.annotation.o0
        public n M(@androidx.annotation.q0 PendingIntent pendingIntent) {
            this.f25587g = pendingIntent;
            return this;
        }

        @androidx.annotation.o0
        public n N(@androidx.annotation.q0 CharSequence charSequence) {
            this.f25586f = A(charSequence);
            return this;
        }

        @androidx.annotation.o0
        public n O(@androidx.annotation.q0 CharSequence charSequence) {
            this.f25585e = A(charSequence);
            return this;
        }

        @androidx.annotation.o0
        public n P(@androidx.annotation.q0 RemoteViews remoteViews) {
            this.J = remoteViews;
            return this;
        }

        @androidx.annotation.o0
        public n Q(@androidx.annotation.q0 RemoteViews remoteViews) {
            this.I = remoteViews;
            return this;
        }

        @androidx.annotation.o0
        public n R(@androidx.annotation.q0 RemoteViews remoteViews) {
            this.K = remoteViews;
            return this;
        }

        @androidx.annotation.o0
        public n S(int i4) {
            Notification notification = this.U;
            notification.defaults = i4;
            if ((i4 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        @androidx.annotation.o0
        public n T(@androidx.annotation.q0 PendingIntent pendingIntent) {
            this.U.deleteIntent = pendingIntent;
            return this;
        }

        @androidx.annotation.o0
        public n U(@androidx.annotation.q0 Bundle bundle) {
            this.E = bundle;
            return this;
        }

        @androidx.annotation.o0
        public n W(int i4) {
            this.R = i4;
            return this;
        }

        @androidx.annotation.o0
        public n X(@androidx.annotation.q0 PendingIntent pendingIntent, boolean z4) {
            this.f25588h = pendingIntent;
            V(128, z4);
            return this;
        }

        @androidx.annotation.o0
        public n Y(@androidx.annotation.q0 String str) {
            this.f25604x = str;
            return this;
        }

        @androidx.annotation.o0
        public n Z(int i4) {
            this.Q = i4;
            return this;
        }

        @androidx.annotation.o0
        public n a(int i4, @androidx.annotation.q0 CharSequence charSequence, @androidx.annotation.q0 PendingIntent pendingIntent) {
            this.f25582b.add(new b(i4, charSequence, pendingIntent));
            return this;
        }

        @androidx.annotation.o0
        public n a0(boolean z4) {
            this.f25605y = z4;
            return this;
        }

        @androidx.annotation.o0
        public n b(@androidx.annotation.q0 b bVar) {
            if (bVar != null) {
                this.f25582b.add(bVar);
            }
            return this;
        }

        @androidx.annotation.o0
        public n b0(@androidx.annotation.q0 Bitmap bitmap) {
            this.f25590j = bitmap == null ? null : IconCompat.r(d0.I(this.f25581a, bitmap));
            return this;
        }

        @androidx.annotation.o0
        public n c(@androidx.annotation.q0 Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.E;
                if (bundle2 == null) {
                    this.E = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        @androidx.annotation.o0
        @androidx.annotation.x0(23)
        public n c0(@androidx.annotation.q0 Icon icon) {
            this.f25590j = icon == null ? null : IconCompat.l(icon);
            return this;
        }

        @androidx.annotation.o0
        @androidx.annotation.x0(21)
        public n d(int i4, @androidx.annotation.q0 CharSequence charSequence, @androidx.annotation.q0 PendingIntent pendingIntent) {
            this.f25584d.add(new b(i4, charSequence, pendingIntent));
            return this;
        }

        @androidx.annotation.o0
        public n d0(@androidx.annotation.l int i4, int i5, int i6) {
            Notification notification = this.U;
            notification.ledARGB = i4;
            notification.ledOnMS = i5;
            notification.ledOffMS = i6;
            notification.flags = ((i5 == 0 || i6 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        @androidx.annotation.o0
        @androidx.annotation.x0(21)
        public n e(@androidx.annotation.q0 b bVar) {
            if (bVar != null) {
                this.f25584d.add(bVar);
            }
            return this;
        }

        @androidx.annotation.o0
        public n e0(boolean z4) {
            this.A = z4;
            return this;
        }

        @androidx.annotation.o0
        public n f(@androidx.annotation.q0 r0 r0Var) {
            if (r0Var != null) {
                this.f25583c.add(r0Var);
            }
            return this;
        }

        @androidx.annotation.o0
        public n f0(@androidx.annotation.q0 androidx.core.content.a0 a0Var) {
            this.O = a0Var;
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public n g(@androidx.annotation.q0 String str) {
            if (str != null && !str.isEmpty()) {
                this.X.add(str);
            }
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public n g0() {
            this.V = true;
            return this;
        }

        @androidx.annotation.o0
        public Notification h() {
            return new f0(this).c();
        }

        @androidx.annotation.o0
        public n h0(int i4) {
            this.f25592l = i4;
            return this;
        }

        @androidx.annotation.o0
        public n i() {
            this.f25582b.clear();
            return this;
        }

        @androidx.annotation.o0
        public n i0(boolean z4) {
            V(2, z4);
            return this;
        }

        @androidx.annotation.o0
        public n j() {
            this.f25584d.clear();
            Bundle bundle = this.E.getBundle("android.car.EXTENSIONS");
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove("invisible_actions");
                this.E.putBundle("android.car.EXTENSIONS", bundle2);
            }
            return this;
        }

        @androidx.annotation.o0
        public n j0(boolean z4) {
            V(8, z4);
            return this;
        }

        @androidx.annotation.o0
        public n k() {
            this.f25583c.clear();
            this.X.clear();
            return this;
        }

        @androidx.annotation.o0
        public n k0(int i4) {
            this.f25593m = i4;
            return this;
        }

        @androidx.annotation.q0
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews l() {
            RemoteViews v4;
            if (this.J != null && I0()) {
                return this.J;
            }
            f0 f0Var = new f0(this);
            y yVar = this.f25597q;
            return (yVar == null || (v4 = yVar.v(f0Var)) == null) ? c.a(c.d(this.f25581a, f0Var.c())) : v4;
        }

        @androidx.annotation.o0
        public n l0(int i4, int i5, boolean z4) {
            this.f25601u = i4;
            this.f25602v = i5;
            this.f25603w = z4;
            return this;
        }

        @androidx.annotation.q0
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews m() {
            RemoteViews w4;
            if (this.I != null && I0()) {
                return this.I;
            }
            f0 f0Var = new f0(this);
            y yVar = this.f25597q;
            return (yVar == null || (w4 = yVar.w(f0Var)) == null) ? c.b(c.d(this.f25581a, f0Var.c())) : w4;
        }

        @androidx.annotation.o0
        public n m0(@androidx.annotation.q0 Notification notification) {
            this.H = notification;
            return this;
        }

        @androidx.annotation.q0
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews n() {
            RemoteViews x4;
            if (this.K != null && I0()) {
                return this.K;
            }
            f0 f0Var = new f0(this);
            y yVar = this.f25597q;
            return (yVar == null || (x4 = yVar.x(f0Var)) == null) ? c.c(c.d(this.f25581a, f0Var.c())) : x4;
        }

        @androidx.annotation.o0
        public n n0(@androidx.annotation.q0 CharSequence[] charSequenceArr) {
            this.f25600t = charSequenceArr;
            return this;
        }

        @androidx.annotation.o0
        public n o(@androidx.annotation.o0 r rVar) {
            rVar.a(this);
            return this;
        }

        @androidx.annotation.o0
        public n o0(@androidx.annotation.q0 CharSequence charSequence) {
            this.f25599s = A(charSequence);
            return this;
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews p() {
            return this.J;
        }

        @androidx.annotation.o0
        public n p0(@androidx.annotation.q0 String str) {
            this.N = str;
            return this;
        }

        @androidx.annotation.q0
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public m q() {
            return this.T;
        }

        @androidx.annotation.o0
        public n q0(@androidx.annotation.q0 androidx.core.content.pm.x xVar) {
            if (xVar == null) {
                return this;
            }
            this.N = xVar.k();
            if (this.O == null) {
                if (xVar.o() != null) {
                    this.O = xVar.o();
                } else if (xVar.k() != null) {
                    this.O = new androidx.core.content.a0(xVar.k());
                }
            }
            if (this.f25585e == null) {
                O(xVar.w());
            }
            return this;
        }

        @androidx.annotation.l
        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public int r() {
            return this.F;
        }

        @androidx.annotation.o0
        public n r0(boolean z4) {
            this.f25594n = z4;
            return this;
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews s() {
            return this.I;
        }

        @androidx.annotation.o0
        public n s0(boolean z4) {
            this.V = z4;
            return this;
        }

        @androidx.annotation.o0
        public Bundle t() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        @androidx.annotation.o0
        public n t0(int i4) {
            this.U.icon = i4;
            return this;
        }

        @androidx.annotation.o0
        public n u0(int i4, int i5) {
            Notification notification = this.U;
            notification.icon = i4;
            notification.iconLevel = i5;
            return this;
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public int v() {
            return this.R;
        }

        @androidx.annotation.o0
        @androidx.annotation.x0(23)
        public n v0(@androidx.annotation.o0 IconCompat iconCompat) {
            this.W = iconCompat.K(this.f25581a);
            return this;
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews w() {
            return this.K;
        }

        @androidx.annotation.o0
        public n w0(@androidx.annotation.q0 String str) {
            this.f25606z = str;
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public Notification x() {
            return h();
        }

        @androidx.annotation.o0
        public n x0(@androidx.annotation.q0 Uri uri) {
            Notification notification = this.U;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder e4 = a.e(a.c(a.b(), 4), 5);
            this.U.audioAttributes = a.a(e4);
            return this;
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public int y() {
            return this.f25593m;
        }

        @androidx.annotation.o0
        public n y0(@androidx.annotation.q0 Uri uri, int i4) {
            Notification notification = this.U;
            notification.sound = uri;
            notification.audioStreamType = i4;
            AudioAttributes.Builder d5 = a.d(a.c(a.b(), 4), i4);
            this.U.audioAttributes = a.a(d5);
            return this;
        }

        @c1({c1.a.LIBRARY_GROUP_PREFIX})
        public long z() {
            if (this.f25594n) {
                return this.U.when;
            }
            return 0L;
        }

        @androidx.annotation.o0
        public n z0(@androidx.annotation.q0 y yVar) {
            if (this.f25597q != yVar) {
                this.f25597q = yVar;
                if (yVar != null) {
                    yVar.z(this);
                }
            }
            return this;
        }

        public n(@androidx.annotation.o0 Context context, @androidx.annotation.o0 String str) {
            this.f25582b = new ArrayList<>();
            this.f25583c = new ArrayList<>();
            this.f25584d = new ArrayList<>();
            this.f25594n = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.Q = 0;
            this.R = 0;
            Notification notification = new Notification();
            this.U = notification;
            this.f25581a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.U.audioStreamType = -1;
            this.f25593m = 0;
            this.X = new ArrayList<>();
            this.S = true;
        }

        @Deprecated
        public n(@androidx.annotation.o0 Context context) {
            this(context, (String) null);
        }
    }
}
