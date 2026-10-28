package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
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
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import androidx.annotation.c1;
import androidx.core.app.v4;
import androidx.core.app.y3;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k.a;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public class x1 {
    public static final int J0 = 0;
    public static final int K0 = 1;
    public static final int L0 = 2;
    public static final int M0 = 0;
    public static final int N0 = 1;
    public static final int O0 = 2;
    public static final int Q0 = 0;
    public static final int R0 = 1;
    public static final int S0 = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f4269f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static final int f4271g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f4273h = 2;

    /* renamed from: i, reason: collision with root package name */
    public static final int f4275i = 4;

    /* renamed from: j, reason: collision with root package name */
    public static final int f4277j = -1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f4279k = 1;

    /* renamed from: l, reason: collision with root package name */
    public static final int f4281l = 2;

    /* renamed from: l0, reason: collision with root package name */
    @androidx.annotation.l
    public static final int f4282l0 = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f4283m = 4;

    /* renamed from: m0, reason: collision with root package name */
    public static final int f4284m0 = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f4285n = 8;

    /* renamed from: n0, reason: collision with root package name */
    public static final int f4286n0 = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f4287o = 16;

    /* renamed from: o0, reason: collision with root package name */
    public static final int f4288o0 = -1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f4289p = 32;

    /* renamed from: q, reason: collision with root package name */
    public static final int f4291q = 64;

    /* renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final int f4293r = 128;

    /* renamed from: s, reason: collision with root package name */
    public static final int f4295s = 256;

    /* renamed from: t, reason: collision with root package name */
    public static final int f4297t = 512;

    /* renamed from: u, reason: collision with root package name */
    public static final int f4299u = 4096;

    /* renamed from: v, reason: collision with root package name */
    public static final int f4301v = 0;

    /* renamed from: w, reason: collision with root package name */
    public static final int f4303w = -1;

    /* renamed from: x, reason: collision with root package name */
    public static final int f4305x = -2;

    /* renamed from: y, reason: collision with root package name */
    public static final int f4307y = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final int f4309z = 2;

    /* renamed from: j0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f4278j0 = "android.hiddenConversationTitle";
    public static final String I0 = "missed_call";

    /* renamed from: f0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f4270f0 = "android.conversationTitle";
    public static final String E0 = "status";

    /* renamed from: b0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f4262b0 = "android.mediaSession";
    public static final String A0 = "sys";

    /* renamed from: w0, reason: collision with root package name */
    public static final String f4304w0 = "progress";

    /* renamed from: s0, reason: collision with root package name */
    public static final String f4296s0 = "email";

    /* renamed from: k0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f4280k0 = "android.audioContents";

    /* renamed from: g0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f4272g0 = "android.messages";
    public static final String F0 = "workout";

    /* renamed from: c0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f4264c0 = "android.compactActions";
    public static final String B0 = "service";

    /* renamed from: x0, reason: collision with root package name */
    public static final String f4306x0 = "social";

    /* renamed from: t0, reason: collision with root package name */
    public static final String f4298t0 = "event";

    /* renamed from: p0, reason: collision with root package name */
    public static final String f4290p0 = "call";

    @SuppressLint({"ActionValue"})
    public static final String A = "android.title";

    @SuppressLint({"ActionValue"})
    public static final String B = "android.title.big";

    @SuppressLint({"ActionValue"})
    public static final String C = "android.text";

    @SuppressLint({"ActionValue"})
    public static final String D = "android.subText";

    @SuppressLint({"ActionValue"})
    public static final String E = "android.remoteInputHistory";

    @SuppressLint({"ActionValue"})
    public static final String F = "android.infoText";

    @SuppressLint({"ActionValue"})
    public static final String G = "android.summaryText";

    @SuppressLint({"ActionValue"})
    public static final String H = "android.bigText";

    /* renamed from: h0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f4274h0 = "android.messages.historic";
    public static final String G0 = "location_sharing";

    @SuppressLint({"ActionValue"})
    public static final String I = "android.icon";

    @SuppressLint({"ActionValue"})
    public static final String J = "android.largeIcon";

    @SuppressLint({"ActionValue"})
    public static final String K = "android.largeIcon.big";

    @SuppressLint({"ActionValue"})
    public static final String L = "android.progress";

    /* renamed from: d0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f4266d0 = "android.selfDisplayName";
    public static final String C0 = "reminder";

    @SuppressLint({"ActionValue"})
    public static final String M = "android.progressMax";

    @SuppressLint({"ActionValue"})
    public static final String N = "android.progressIndeterminate";

    @SuppressLint({"ActionValue"})
    public static final String O = "android.showChronometer";

    @SuppressLint({"ActionValue"})
    public static final String P = "android.chronometerCountDown";

    @SuppressLint({"ActionValue"})
    public static final String Q = "android.colorized";

    @SuppressLint({"ActionValue"})
    public static final String R = "android.showWhen";

    @SuppressLint({"ActionValue"})
    public static final String S = "android.picture";

    @SuppressLint({"ActionValue"})
    public static final String T = "android.pictureContentDescription";

    @SuppressLint({"ActionValue"})
    public static final String U = "android.showBigPictureWhenCollapsed";

    @SuppressLint({"ActionValue"})
    public static final String V = "android.textLines";

    @SuppressLint({"ActionValue"})
    public static final String W = "android.template";

    /* renamed from: y0, reason: collision with root package name */
    public static final String f4308y0 = "err";
    public static final String X = "androidx.core.app.extra.COMPAT_TEMPLATE";

    @SuppressLint({"ActionValue"})
    @Deprecated
    public static final String Y = "android.people";

    @SuppressLint({"ActionValue"})
    public static final String Z = "android.people.list";

    /* renamed from: u0, reason: collision with root package name */
    public static final String f4300u0 = "promo";

    /* renamed from: q0, reason: collision with root package name */
    public static final String f4292q0 = "navigation";
    public static final String P0 = "silent";

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f4259a = "android.intent.category.NOTIFICATION_PREFERENCES";

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f4261b = "android.intent.extra.CHANNEL_ID";

    /* renamed from: c, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f4263c = "android.intent.extra.CHANNEL_GROUP_ID";

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f4265d = "android.intent.extra.NOTIFICATION_TAG";

    /* renamed from: e, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f4267e = "android.intent.extra.NOTIFICATION_ID";

    /* renamed from: i0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f4276i0 = "android.isGroupConversation";
    public static final String H0 = "stopwatch";

    /* renamed from: e0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f4268e0 = "android.messagingStyleUser";
    public static final String D0 = "recommendation";

    /* renamed from: a0, reason: collision with root package name */
    @SuppressLint({"ActionValue"})
    public static final String f4260a0 = "android.backgroundImageUri";

    /* renamed from: z0, reason: collision with root package name */
    public static final String f4310z0 = "transport";

    /* renamed from: v0, reason: collision with root package name */
    public static final String f4302v0 = "alarm";

    /* renamed from: r0, reason: collision with root package name */
    public static final String f4294r0 = "msg";

    /* compiled from: NotificationCompat.java */
    public static class b {

        /* renamed from: m, reason: collision with root package name */
        public static final int f4311m = 0;

        /* renamed from: n, reason: collision with root package name */
        public static final int f4312n = 1;

        /* renamed from: o, reason: collision with root package name */
        public static final int f4313o = 2;

        /* renamed from: p, reason: collision with root package name */
        public static final int f4314p = 3;

        /* renamed from: q, reason: collision with root package name */
        public static final int f4315q = 4;

        /* renamed from: r, reason: collision with root package name */
        public static final int f4316r = 5;

        /* renamed from: s, reason: collision with root package name */
        public static final int f4317s = 6;

        /* renamed from: t, reason: collision with root package name */
        public static final int f4318t = 7;

        /* renamed from: u, reason: collision with root package name */
        public static final int f4319u = 8;

        /* renamed from: v, reason: collision with root package name */
        public static final int f4320v = 9;

        /* renamed from: w, reason: collision with root package name */
        public static final int f4321w = 10;

        /* renamed from: x, reason: collision with root package name */
        static final String f4322x = "android.support.action.showsUserInterface";

        /* renamed from: y, reason: collision with root package name */
        static final String f4323y = "android.support.action.semanticAction";

        /* renamed from: a, reason: collision with root package name */
        final Bundle f4324a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.q0
        private IconCompat f4325b;

        /* renamed from: c, reason: collision with root package name */
        private final v4[] f4326c;

        /* renamed from: d, reason: collision with root package name */
        private final v4[] f4327d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f4328e;

        /* renamed from: f, reason: collision with root package name */
        boolean f4329f;

        /* renamed from: g, reason: collision with root package name */
        private final int f4330g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f4331h;

        /* renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f4332i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f4333j;

        /* renamed from: k, reason: collision with root package name */
        public PendingIntent f4334k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f4335l;

        /* compiled from: NotificationCompat.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private final IconCompat f4336a;

            /* renamed from: b, reason: collision with root package name */
            private final CharSequence f4337b;

            /* renamed from: c, reason: collision with root package name */
            private final PendingIntent f4338c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f4339d;

            /* renamed from: e, reason: collision with root package name */
            private final Bundle f4340e;

            /* renamed from: f, reason: collision with root package name */
            private ArrayList<v4> f4341f;

            /* renamed from: g, reason: collision with root package name */
            private int f4342g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f4343h;

            /* renamed from: i, reason: collision with root package name */
            private boolean f4344i;

            /* renamed from: j, reason: collision with root package name */
            private boolean f4345j;

            public a(@androidx.annotation.q0 IconCompat iconCompat, @androidx.annotation.q0 CharSequence charSequence, @androidx.annotation.q0 PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private void d() {
                if (this.f4344i && this.f4338c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
            @androidx.annotation.o0
            @androidx.annotation.x0(19)
            public static a f(@androidx.annotation.o0 Notification.Action action) {
                boolean isAuthenticationRequired;
                boolean isContextual;
                int semanticAction;
                a aVar = action.getIcon() != null ? new a(IconCompat.g(action.getIcon()), action.title, action.actionIntent) : new a(action.icon, action.title, action.actionIntent);
                RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (remoteInputs != null && remoteInputs.length != 0) {
                    for (RemoteInput remoteInput : remoteInputs) {
                        aVar.b(v4.b.c(remoteInput));
                    }
                }
                int i5 = Build.VERSION.SDK_INT;
                aVar.f4339d = action.getAllowGeneratedReplies();
                if (i5 >= 28) {
                    semanticAction = action.getSemanticAction();
                    aVar.f4342g = semanticAction;
                }
                if (i5 >= 29) {
                    isContextual = action.isContextual();
                    aVar.f4344i = isContextual;
                }
                if (i5 >= 31) {
                    isAuthenticationRequired = action.isAuthenticationRequired();
                    aVar.f4345j = isAuthenticationRequired;
                }
                return aVar;
            }

            @androidx.annotation.o0
            public a a(@androidx.annotation.q0 Bundle bundle) {
                if (bundle != null) {
                    this.f4340e.putAll(bundle);
                }
                return this;
            }

            @androidx.annotation.o0
            public a b(@androidx.annotation.q0 v4 v4Var) {
                if (this.f4341f == null) {
                    this.f4341f = new ArrayList<>();
                }
                if (v4Var != null) {
                    this.f4341f.add(v4Var);
                }
                return this;
            }

            @androidx.annotation.o0
            public b c() {
                d();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<v4> arrayList3 = this.f4341f;
                if (arrayList3 != null) {
                    Iterator<v4> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        v4 next = it.next();
                        if (next.r()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                v4[] v4VarArr = arrayList.isEmpty() ? null : (v4[]) arrayList.toArray(new v4[arrayList.size()]);
                return new b(this.f4336a, this.f4337b, this.f4338c, this.f4340e, arrayList2.isEmpty() ? null : (v4[]) arrayList2.toArray(new v4[arrayList2.size()]), v4VarArr, this.f4339d, this.f4342g, this.f4343h, this.f4344i, this.f4345j);
            }

            @androidx.annotation.o0
            public a e(@androidx.annotation.o0 InterfaceC0032b interfaceC0032b) {
                interfaceC0032b.a(this);
                return this;
            }

            @androidx.annotation.o0
            public Bundle g() {
                return this.f4340e;
            }

            @androidx.annotation.o0
            public a h(boolean z5) {
                this.f4339d = z5;
                return this;
            }

            @androidx.annotation.o0
            public a i(boolean z5) {
                this.f4345j = z5;
                return this;
            }

            @androidx.annotation.o0
            public a j(boolean z5) {
                this.f4344i = z5;
                return this;
            }

            @androidx.annotation.o0
            public a k(int i5) {
                this.f4342g = i5;
                return this;
            }

            @androidx.annotation.o0
            public a l(boolean z5) {
                this.f4343h = z5;
                return this;
            }

            public a(int i5, @androidx.annotation.q0 CharSequence charSequence, @androidx.annotation.q0 PendingIntent pendingIntent) {
                this(i5 != 0 ? IconCompat.r(null, "", i5) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            public a(@androidx.annotation.o0 b bVar) {
                this(bVar.f(), bVar.f4333j, bVar.f4334k, new Bundle(bVar.f4324a), bVar.g(), bVar.b(), bVar.h(), bVar.f4329f, bVar.l(), bVar.k());
            }

            private a(@androidx.annotation.q0 IconCompat iconCompat, @androidx.annotation.q0 CharSequence charSequence, @androidx.annotation.q0 PendingIntent pendingIntent, @androidx.annotation.o0 Bundle bundle, @androidx.annotation.q0 v4[] v4VarArr, boolean z5, int i5, boolean z6, boolean z7, boolean z8) {
                this.f4339d = true;
                this.f4343h = true;
                this.f4336a = iconCompat;
                this.f4337b = g.A(charSequence);
                this.f4338c = pendingIntent;
                this.f4340e = bundle;
                this.f4341f = v4VarArr == null ? null : new ArrayList<>(Arrays.asList(v4VarArr));
                this.f4339d = z5;
                this.f4342g = i5;
                this.f4343h = z6;
                this.f4344i = z7;
                this.f4345j = z8;
            }
        }

        /* compiled from: NotificationCompat.java */
        /* renamed from: androidx.core.app.x1$b$b, reason: collision with other inner class name */
        public interface InterfaceC0032b {
            @androidx.annotation.o0
            a a(@androidx.annotation.o0 a aVar);
        }

        /* compiled from: NotificationCompat.java */
        @Retention(RetentionPolicy.SOURCE)
        public @interface c {
        }

        public b(int i5, @androidx.annotation.q0 CharSequence charSequence, @androidx.annotation.q0 PendingIntent pendingIntent) {
            this(i5 != 0 ? IconCompat.r(null, "", i5) : null, charSequence, pendingIntent);
        }

        @androidx.annotation.q0
        public PendingIntent a() {
            return this.f4334k;
        }

        public boolean b() {
            return this.f4328e;
        }

        @androidx.annotation.q0
        public v4[] c() {
            return this.f4327d;
        }

        @androidx.annotation.o0
        public Bundle d() {
            return this.f4324a;
        }

        @Deprecated
        public int e() {
            return this.f4332i;
        }

        @androidx.annotation.q0
        public IconCompat f() {
            int i5;
            if (this.f4325b == null && (i5 = this.f4332i) != 0) {
                this.f4325b = IconCompat.r(null, "", i5);
            }
            return this.f4325b;
        }

        @androidx.annotation.q0
        public v4[] g() {
            return this.f4326c;
        }

        public int h() {
            return this.f4330g;
        }

        public boolean i() {
            return this.f4329f;
        }

        @androidx.annotation.q0
        public CharSequence j() {
            return this.f4333j;
        }

        public boolean k() {
            return this.f4335l;
        }

        public boolean l() {
            return this.f4331h;
        }

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes3.dex */
        public static final class d implements InterfaceC0032b {

            /* renamed from: e, reason: collision with root package name */
            private static final String f4346e = "android.wearable.EXTENSIONS";

            /* renamed from: f, reason: collision with root package name */
            private static final String f4347f = "flags";

            /* renamed from: g, reason: collision with root package name */
            private static final String f4348g = "inProgressLabel";

            /* renamed from: h, reason: collision with root package name */
            private static final String f4349h = "confirmLabel";

            /* renamed from: i, reason: collision with root package name */
            private static final String f4350i = "cancelLabel";

            /* renamed from: j, reason: collision with root package name */
            private static final int f4351j = 1;

            /* renamed from: k, reason: collision with root package name */
            private static final int f4352k = 2;

            /* renamed from: l, reason: collision with root package name */
            private static final int f4353l = 4;

            /* renamed from: m, reason: collision with root package name */
            private static final int f4354m = 1;

            /* renamed from: a, reason: collision with root package name */
            private int f4355a;

            /* renamed from: b, reason: collision with root package name */
            private CharSequence f4356b;

            /* renamed from: c, reason: collision with root package name */
            private CharSequence f4357c;

            /* renamed from: d, reason: collision with root package name */
            private CharSequence f4358d;

            public d() {
                this.f4355a = 1;
            }

            private void l(int i5, boolean z5) {
                if (z5) {
                    this.f4355a = i5 | this.f4355a;
                } else {
                    this.f4355a = (~i5) & this.f4355a;
                }
            }

            @Override // androidx.core.app.x1.b.InterfaceC0032b
            @androidx.annotation.o0
            public a a(@androidx.annotation.o0 a aVar) {
                Bundle bundle = new Bundle();
                int i5 = this.f4355a;
                if (i5 != 1) {
                    bundle.putInt("flags", i5);
                }
                CharSequence charSequence = this.f4356b;
                if (charSequence != null) {
                    bundle.putCharSequence("inProgressLabel", charSequence);
                }
                CharSequence charSequence2 = this.f4357c;
                if (charSequence2 != null) {
                    bundle.putCharSequence("confirmLabel", charSequence2);
                }
                CharSequence charSequence3 = this.f4358d;
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
                dVar.f4355a = this.f4355a;
                dVar.f4356b = this.f4356b;
                dVar.f4357c = this.f4357c;
                dVar.f4358d = this.f4358d;
                return dVar;
            }

            @androidx.annotation.q0
            @Deprecated
            public CharSequence c() {
                return this.f4358d;
            }

            @androidx.annotation.q0
            @Deprecated
            public CharSequence d() {
                return this.f4357c;
            }

            public boolean e() {
                return (this.f4355a & 4) != 0;
            }

            public boolean f() {
                return (this.f4355a & 2) != 0;
            }

            @androidx.annotation.q0
            @Deprecated
            public CharSequence g() {
                return this.f4356b;
            }

            public boolean h() {
                return (this.f4355a & 1) != 0;
            }

            @androidx.annotation.o0
            public d i(boolean z5) {
                l(1, z5);
                return this;
            }

            @androidx.annotation.o0
            @Deprecated
            public d j(@androidx.annotation.q0 CharSequence charSequence) {
                this.f4358d = charSequence;
                return this;
            }

            @androidx.annotation.o0
            @Deprecated
            public d k(@androidx.annotation.q0 CharSequence charSequence) {
                this.f4357c = charSequence;
                return this;
            }

            @androidx.annotation.o0
            public d m(boolean z5) {
                l(4, z5);
                return this;
            }

            @androidx.annotation.o0
            public d n(boolean z5) {
                l(2, z5);
                return this;
            }

            @androidx.annotation.o0
            @Deprecated
            public d o(@androidx.annotation.q0 CharSequence charSequence) {
                this.f4356b = charSequence;
                return this;
            }

            public d(@androidx.annotation.o0 b bVar) {
                this.f4355a = 1;
                Bundle bundle = bVar.d().getBundle("android.wearable.EXTENSIONS");
                if (bundle != null) {
                    this.f4355a = bundle.getInt("flags", 1);
                    this.f4356b = bundle.getCharSequence("inProgressLabel");
                    this.f4357c = bundle.getCharSequence("confirmLabel");
                    this.f4358d = bundle.getCharSequence("cancelLabel");
                }
            }
        }

        public b(@androidx.annotation.q0 IconCompat iconCompat, @androidx.annotation.q0 CharSequence charSequence, @androidx.annotation.q0 PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (v4[]) null, (v4[]) null, true, 0, true, false, false);
        }

        b(int i5, @androidx.annotation.q0 CharSequence charSequence, @androidx.annotation.q0 PendingIntent pendingIntent, @androidx.annotation.q0 Bundle bundle, @androidx.annotation.q0 v4[] v4VarArr, @androidx.annotation.q0 v4[] v4VarArr2, boolean z5, int i6, boolean z6, boolean z7, boolean z8) {
            this(i5 != 0 ? IconCompat.r(null, "", i5) : null, charSequence, pendingIntent, bundle, v4VarArr, v4VarArr2, z5, i6, z6, z7, z8);
        }

        b(@androidx.annotation.q0 IconCompat iconCompat, @androidx.annotation.q0 CharSequence charSequence, @androidx.annotation.q0 PendingIntent pendingIntent, @androidx.annotation.q0 Bundle bundle, @androidx.annotation.q0 v4[] v4VarArr, @androidx.annotation.q0 v4[] v4VarArr2, boolean z5, int i5, boolean z6, boolean z7, boolean z8) {
            this.f4329f = true;
            this.f4325b = iconCompat;
            if (iconCompat != null && iconCompat.w() == 2) {
                this.f4332i = iconCompat.t();
            }
            this.f4333j = g.A(charSequence);
            this.f4334k = pendingIntent;
            this.f4324a = bundle == null ? new Bundle() : bundle;
            this.f4326c = v4VarArr;
            this.f4327d = v4VarArr2;
            this.f4328e = z5;
            this.f4330g = i5;
            this.f4329f = z6;
            this.f4331h = z7;
            this.f4335l = z8;
        }
    }

    /* compiled from: NotificationCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes3.dex */
    public static class d extends q {

        /* renamed from: j, reason: collision with root package name */
        private static final String f4359j = "androidx.core.app.NotificationCompat$BigPictureStyle";

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f4360e;

        /* renamed from: f, reason: collision with root package name */
        private IconCompat f4361f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f4362g;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f4363h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f4364i;

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(16)
        /* loaded from: classes.dex */
        private static class a {
            private a() {
            }

            @androidx.annotation.x0(16)
            static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            @androidx.annotation.x0(16)
            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(23)
        /* loaded from: classes.dex */
        private static class b {
            private b() {
            }

            @androidx.annotation.x0(23)
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(31)
        /* loaded from: classes.dex */
        private static class c {
            private c() {
            }

            @androidx.annotation.x0(31)
            static void a(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @androidx.annotation.x0(31)
            static void b(Notification.BigPictureStyle bigPictureStyle, boolean z5) {
                bigPictureStyle.showBigPictureWhenCollapsed(z5);
            }
        }

        public d() {
        }

        @androidx.annotation.q0
        private static IconCompat A(@androidx.annotation.q0 Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof Icon) {
                return IconCompat.g((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.m((Bitmap) parcelable);
            }
            return null;
        }

        @androidx.annotation.o0
        public d B(@androidx.annotation.q0 Bitmap bitmap) {
            this.f4361f = bitmap == null ? null : IconCompat.m(bitmap);
            this.f4362g = true;
            return this;
        }

        @androidx.annotation.o0
        public d C(@androidx.annotation.q0 Bitmap bitmap) {
            this.f4360e = bitmap;
            return this;
        }

        @androidx.annotation.o0
        public d D(@androidx.annotation.q0 CharSequence charSequence) {
            this.f4463b = g.A(charSequence);
            return this;
        }

        @androidx.annotation.o0
        @androidx.annotation.x0(31)
        public d E(@androidx.annotation.q0 CharSequence charSequence) {
            this.f4363h = charSequence;
            return this;
        }

        @androidx.annotation.o0
        public d F(@androidx.annotation.q0 CharSequence charSequence) {
            this.f4464c = g.A(charSequence);
            this.f4465d = true;
            return this;
        }

        @androidx.annotation.o0
        @androidx.annotation.x0(31)
        public d G(boolean z5) {
            this.f4364i = z5;
            return this;
        }

        @Override // androidx.core.app.x1.q
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public void b(a0 a0Var) {
            int i5 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(a0Var.a()).setBigContentTitle(this.f4463b).bigPicture(this.f4360e);
            if (this.f4362g) {
                if (this.f4361f == null) {
                    a.a(bigPicture, null);
                } else {
                    b.a(bigPicture, this.f4361f.G(a0Var instanceof g3 ? ((g3) a0Var).f() : null));
                }
            }
            if (this.f4465d) {
                a.b(bigPicture, this.f4464c);
            }
            if (i5 >= 31) {
                c.b(bigPicture, this.f4364i);
                c.a(bigPicture, this.f4363h);
            }
        }

        @Override // androidx.core.app.x1.q
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected void g(@androidx.annotation.o0 Bundle bundle) {
            super.g(bundle);
            bundle.remove("android.largeIcon.big");
            bundle.remove("android.picture");
            bundle.remove("android.showBigPictureWhenCollapsed");
        }

        @Override // androidx.core.app.x1.q
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.o0
        protected String t() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @Override // androidx.core.app.x1.q
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected void y(@androidx.annotation.o0 Bundle bundle) {
            super.y(bundle);
            if (bundle.containsKey("android.largeIcon.big")) {
                this.f4361f = A(bundle.getParcelable("android.largeIcon.big"));
                this.f4362g = true;
            }
            this.f4360e = (Bitmap) bundle.getParcelable("android.picture");
            this.f4364i = bundle.getBoolean("android.showBigPictureWhenCollapsed");
        }

        public d(@androidx.annotation.q0 g gVar) {
            z(gVar);
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes3.dex */
    public static class e extends q {

        /* renamed from: f, reason: collision with root package name */
        private static final String f4365f = "androidx.core.app.NotificationCompat$BigTextStyle";

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f4366e;

        public e() {
        }

        @androidx.annotation.o0
        public e A(@androidx.annotation.q0 CharSequence charSequence) {
            this.f4366e = g.A(charSequence);
            return this;
        }

        @androidx.annotation.o0
        public e B(@androidx.annotation.q0 CharSequence charSequence) {
            this.f4463b = g.A(charSequence);
            return this;
        }

        @androidx.annotation.o0
        public e C(@androidx.annotation.q0 CharSequence charSequence) {
            this.f4464c = g.A(charSequence);
            this.f4465d = true;
            return this;
        }

        @Override // androidx.core.app.x1.q
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public void a(@androidx.annotation.o0 Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.x1.q
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public void b(a0 a0Var) {
            Notification.BigTextStyle bigText = new Notification.BigTextStyle(a0Var.a()).setBigContentTitle(this.f4463b).bigText(this.f4366e);
            if (this.f4465d) {
                bigText.setSummaryText(this.f4464c);
            }
        }

        @Override // androidx.core.app.x1.q
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected void g(@androidx.annotation.o0 Bundle bundle) {
            super.g(bundle);
            bundle.remove("android.bigText");
        }

        @Override // androidx.core.app.x1.q
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.o0
        protected String t() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @Override // androidx.core.app.x1.q
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected void y(@androidx.annotation.o0 Bundle bundle) {
            super.y(bundle);
            this.f4366e = bundle.getCharSequence("android.bigText");
        }

        public e(@androidx.annotation.q0 g gVar) {
            z(gVar);
        }
    }

    /* compiled from: NotificationCompat.java */
    public static final class f {

        /* renamed from: h, reason: collision with root package name */
        private static final int f4367h = 1;

        /* renamed from: i, reason: collision with root package name */
        private static final int f4368i = 2;

        /* renamed from: a, reason: collision with root package name */
        private PendingIntent f4369a;

        /* renamed from: b, reason: collision with root package name */
        private PendingIntent f4370b;

        /* renamed from: c, reason: collision with root package name */
        private IconCompat f4371c;

        /* renamed from: d, reason: collision with root package name */
        private int f4372d;

        /* renamed from: e, reason: collision with root package name */
        @androidx.annotation.q
        private int f4373e;

        /* renamed from: f, reason: collision with root package name */
        private int f4374f;

        /* renamed from: g, reason: collision with root package name */
        private String f4375g;

        /* compiled from: NotificationCompat.java */
        @androidx.annotation.x0(29)
        private static class a {
            private a() {
            }

            @androidx.annotation.q0
            @androidx.annotation.x0(29)
            static f a(@androidx.annotation.q0 Notification.BubbleMetadata bubbleMetadata) {
                PendingIntent intent;
                PendingIntent intent2;
                Icon icon;
                boolean autoExpandBubble;
                PendingIntent deleteIntent;
                boolean isNotificationSuppressed;
                int desiredHeight;
                int desiredHeightResId;
                int desiredHeightResId2;
                int desiredHeight2;
                if (bubbleMetadata == null) {
                    return null;
                }
                intent = bubbleMetadata.getIntent();
                if (intent == null) {
                    return null;
                }
                intent2 = bubbleMetadata.getIntent();
                icon = bubbleMetadata.getIcon();
                c cVar = new c(intent2, IconCompat.g(icon));
                autoExpandBubble = bubbleMetadata.getAutoExpandBubble();
                c b6 = cVar.b(autoExpandBubble);
                deleteIntent = bubbleMetadata.getDeleteIntent();
                c c6 = b6.c(deleteIntent);
                isNotificationSuppressed = bubbleMetadata.isNotificationSuppressed();
                c i5 = c6.i(isNotificationSuppressed);
                desiredHeight = bubbleMetadata.getDesiredHeight();
                if (desiredHeight != 0) {
                    desiredHeight2 = bubbleMetadata.getDesiredHeight();
                    i5.d(desiredHeight2);
                }
                desiredHeightResId = bubbleMetadata.getDesiredHeightResId();
                if (desiredHeightResId != 0) {
                    desiredHeightResId2 = bubbleMetadata.getDesiredHeightResId();
                    i5.e(desiredHeightResId2);
                }
                return i5.a();
            }

            @androidx.annotation.q0
            @androidx.annotation.x0(29)
            static Notification.BubbleMetadata b(@androidx.annotation.q0 f fVar) {
                if (fVar == null || fVar.g() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(fVar.f().F()).setIntent(fVar.g()).setDeleteIntent(fVar.c()).setAutoExpandBubble(fVar.b()).setSuppressNotification(fVar.i());
                if (fVar.d() != 0) {
                    suppressNotification.setDesiredHeight(fVar.d());
                }
                if (fVar.e() != 0) {
                    suppressNotification.setDesiredHeightResId(fVar.e());
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
            static f a(@androidx.annotation.q0 Notification.BubbleMetadata bubbleMetadata) {
                String shortcutId;
                c cVar;
                PendingIntent intent;
                Icon icon;
                boolean autoExpandBubble;
                PendingIntent deleteIntent;
                boolean isNotificationSuppressed;
                int desiredHeight;
                int desiredHeightResId;
                int desiredHeightResId2;
                int desiredHeight2;
                String shortcutId2;
                if (bubbleMetadata == null) {
                    return null;
                }
                shortcutId = bubbleMetadata.getShortcutId();
                if (shortcutId != null) {
                    shortcutId2 = bubbleMetadata.getShortcutId();
                    cVar = new c(shortcutId2);
                } else {
                    intent = bubbleMetadata.getIntent();
                    icon = bubbleMetadata.getIcon();
                    cVar = new c(intent, IconCompat.g(icon));
                }
                autoExpandBubble = bubbleMetadata.getAutoExpandBubble();
                c b6 = cVar.b(autoExpandBubble);
                deleteIntent = bubbleMetadata.getDeleteIntent();
                c c6 = b6.c(deleteIntent);
                isNotificationSuppressed = bubbleMetadata.isNotificationSuppressed();
                c6.i(isNotificationSuppressed);
                desiredHeight = bubbleMetadata.getDesiredHeight();
                if (desiredHeight != 0) {
                    desiredHeight2 = bubbleMetadata.getDesiredHeight();
                    cVar.d(desiredHeight2);
                }
                desiredHeightResId = bubbleMetadata.getDesiredHeightResId();
                if (desiredHeightResId != 0) {
                    desiredHeightResId2 = bubbleMetadata.getDesiredHeightResId();
                    cVar.e(desiredHeightResId2);
                }
                return cVar.a();
            }

            @androidx.annotation.q0
            @androidx.annotation.x0(30)
            static Notification.BubbleMetadata b(@androidx.annotation.q0 f fVar) {
                if (fVar == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder builder = fVar.h() != null ? new Notification.BubbleMetadata.Builder(fVar.h()) : new Notification.BubbleMetadata.Builder(fVar.g(), fVar.f().F());
                builder.setDeleteIntent(fVar.c()).setAutoExpandBubble(fVar.b()).setSuppressNotification(fVar.i());
                if (fVar.d() != 0) {
                    builder.setDesiredHeight(fVar.d());
                }
                if (fVar.e() != 0) {
                    builder.setDesiredHeightResId(fVar.e());
                }
                return builder.build();
            }
        }

        /* compiled from: NotificationCompat.java */
        public static final class c {

            /* renamed from: a, reason: collision with root package name */
            private PendingIntent f4376a;

            /* renamed from: b, reason: collision with root package name */
            private IconCompat f4377b;

            /* renamed from: c, reason: collision with root package name */
            private int f4378c;

            /* renamed from: d, reason: collision with root package name */
            @androidx.annotation.q
            private int f4379d;

            /* renamed from: e, reason: collision with root package name */
            private int f4380e;

            /* renamed from: f, reason: collision with root package name */
            private PendingIntent f4381f;

            /* renamed from: g, reason: collision with root package name */
            private String f4382g;

            @Deprecated
            public c() {
            }

            @androidx.annotation.o0
            private c f(int i5, boolean z5) {
                if (z5) {
                    this.f4380e = i5 | this.f4380e;
                } else {
                    this.f4380e = (~i5) & this.f4380e;
                }
                return this;
            }

            @androidx.annotation.o0
            @SuppressLint({"SyntheticAccessor"})
            public f a() {
                String str = this.f4382g;
                if (str == null && this.f4376a == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.f4377b == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                f fVar = new f(this.f4376a, this.f4381f, this.f4377b, this.f4378c, this.f4379d, this.f4380e, str);
                fVar.j(this.f4380e);
                return fVar;
            }

            @androidx.annotation.o0
            public c b(boolean z5) {
                f(1, z5);
                return this;
            }

            @androidx.annotation.o0
            public c c(@androidx.annotation.q0 PendingIntent pendingIntent) {
                this.f4381f = pendingIntent;
                return this;
            }

            @androidx.annotation.o0
            public c d(@androidx.annotation.r(unit = 0) int i5) {
                this.f4378c = Math.max(i5, 0);
                this.f4379d = 0;
                return this;
            }

            @androidx.annotation.o0
            public c e(@androidx.annotation.q int i5) {
                this.f4379d = i5;
                this.f4378c = 0;
                return this;
            }

            @androidx.annotation.o0
            public c g(@androidx.annotation.o0 IconCompat iconCompat) {
                if (this.f4382g != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (iconCompat == null) {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                this.f4377b = iconCompat;
                return this;
            }

            @androidx.annotation.o0
            public c h(@androidx.annotation.o0 PendingIntent pendingIntent) {
                if (this.f4382g != null) {
                    throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                this.f4376a = pendingIntent;
                return this;
            }

            @androidx.annotation.o0
            public c i(boolean z5) {
                f(2, z5);
                return this;
            }

            @androidx.annotation.x0(30)
            public c(@androidx.annotation.o0 String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new NullPointerException("Bubble requires a non-null shortcut id");
                }
                this.f4382g = str;
            }

            public c(@androidx.annotation.o0 PendingIntent pendingIntent, @androidx.annotation.o0 IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat != null) {
                    this.f4376a = pendingIntent;
                    this.f4377b = iconCompat;
                    return;
                }
                throw new NullPointerException("Bubbles require non-null icon");
            }
        }

        @androidx.annotation.q0
        public static f a(@androidx.annotation.q0 Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30) {
                return b.a(bubbleMetadata);
            }
            if (i5 == 29) {
                return a.a(bubbleMetadata);
            }
            return null;
        }

        @androidx.annotation.q0
        public static Notification.BubbleMetadata k(@androidx.annotation.q0 f fVar) {
            if (fVar == null) {
                return null;
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30) {
                return b.b(fVar);
            }
            if (i5 == 29) {
                return a.b(fVar);
            }
            return null;
        }

        public boolean b() {
            return (this.f4374f & 1) != 0;
        }

        @androidx.annotation.q0
        public PendingIntent c() {
            return this.f4370b;
        }

        @androidx.annotation.r(unit = 0)
        public int d() {
            return this.f4372d;
        }

        @androidx.annotation.q
        public int e() {
            return this.f4373e;
        }

        @androidx.annotation.q0
        @SuppressLint({"InvalidNullConversion"})
        public IconCompat f() {
            return this.f4371c;
        }

        @androidx.annotation.q0
        @SuppressLint({"InvalidNullConversion"})
        public PendingIntent g() {
            return this.f4369a;
        }

        @androidx.annotation.q0
        public String h() {
            return this.f4375g;
        }

        public boolean i() {
            return (this.f4374f & 2) != 0;
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public void j(int i5) {
            this.f4374f = i5;
        }

        private f(@androidx.annotation.q0 PendingIntent pendingIntent, @androidx.annotation.q0 PendingIntent pendingIntent2, @androidx.annotation.q0 IconCompat iconCompat, int i5, @androidx.annotation.q int i6, int i7, @androidx.annotation.q0 String str) {
            this.f4369a = pendingIntent;
            this.f4371c = iconCompat;
            this.f4372d = i5;
            this.f4373e = i6;
            this.f4370b = pendingIntent2;
            this.f4374f = i7;
            this.f4375g = str;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes3.dex */
    public static class i extends q {

        /* renamed from: e, reason: collision with root package name */
        private static final String f4437e = "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";

        /* renamed from: f, reason: collision with root package name */
        private static final int f4438f = 3;

        private RemoteViews A(RemoteViews remoteViews, boolean z5) {
            int min;
            boolean z6 = true;
            RemoteViews c6 = c(true, a.g.f23023d, false);
            c6.removeAllViews(a.e.L);
            List<b> C = C(this.f4462a.f4384b);
            if (!z5 || C == null || (min = Math.min(C.size(), 3)) <= 0) {
                z6 = false;
            } else {
                for (int i5 = 0; i5 < min; i5++) {
                    c6.addView(a.e.L, B(C.get(i5)));
                }
            }
            int i6 = z6 ? 0 : 8;
            c6.setViewVisibility(a.e.L, i6);
            c6.setViewVisibility(a.e.I, i6);
            e(c6, remoteViews);
            return c6;
        }

        private RemoteViews B(b bVar) {
            boolean z5 = bVar.f4334k == null;
            RemoteViews remoteViews = new RemoteViews(this.f4462a.f4383a.getPackageName(), z5 ? a.g.f23022c : a.g.f23021b);
            IconCompat f6 = bVar.f();
            if (f6 != null) {
                remoteViews.setImageViewBitmap(a.e.J, o(f6, this.f4462a.f4383a.getResources().getColor(a.b.f22937c)));
            }
            remoteViews.setTextViewText(a.e.K, bVar.f4333j);
            if (!z5) {
                remoteViews.setOnClickPendingIntent(a.e.H, bVar.f4334k);
            }
            remoteViews.setContentDescription(a.e.H, bVar.f4333j);
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

        @Override // androidx.core.app.x1.q
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public void b(a0 a0Var) {
            a0Var.a().setStyle(new Notification.DecoratedCustomViewStyle());
        }

        @Override // androidx.core.app.x1.q
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public boolean r() {
            return true;
        }

        @Override // androidx.core.app.x1.q
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.o0
        protected String t() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // androidx.core.app.x1.q
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews v(a0 a0Var) {
            return null;
        }

        @Override // androidx.core.app.x1.q
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews w(a0 a0Var) {
            return null;
        }

        @Override // androidx.core.app.x1.q
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews x(a0 a0Var) {
            return null;
        }
    }

    /* compiled from: NotificationCompat.java */
    public interface j {
        @androidx.annotation.o0
        g a(@androidx.annotation.o0 g gVar);
    }

    /* compiled from: NotificationCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }

    /* compiled from: NotificationCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface n {
    }

    /* compiled from: NotificationCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface o {
    }

    /* compiled from: NotificationCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface p {
    }

    /* compiled from: NotificationCompat.java */
    public static abstract class q {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected g f4462a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f4463b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f4464c;

        /* renamed from: d, reason: collision with root package name */
        boolean f4465d = false;

        private int f() {
            Resources resources = this.f4462a.f4383a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(a.c.f22959u);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(a.c.f22960v);
            float h5 = (h(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round((h5 * dimensionPixelSize2) + ((1.0f - h5) * dimensionPixelSize));
        }

        private static float h(float f6, float f7, float f8) {
            return f6 < f7 ? f7 : f6 > f8 ? f8 : f6;
        }

        @androidx.annotation.q0
        static q i(@androidx.annotation.q0 String str) {
            if (str == null) {
                return null;
            }
            switch (str) {
                case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                    return new i();
                case "androidx.core.app.NotificationCompat$BigPictureStyle":
                    return new d();
                case "androidx.core.app.NotificationCompat$InboxStyle":
                    return new l();
                case "androidx.core.app.NotificationCompat$BigTextStyle":
                    return new e();
                case "androidx.core.app.NotificationCompat$MessagingStyle":
                    return new m();
                default:
                    return null;
            }
        }

        @androidx.annotation.q0
        private static q j(@androidx.annotation.q0 String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(Notification.BigPictureStyle.class.getName())) {
                return new d();
            }
            if (str.equals(Notification.BigTextStyle.class.getName())) {
                return new e();
            }
            if (str.equals(Notification.InboxStyle.class.getName())) {
                return new l();
            }
            if (str.equals(Notification.MessagingStyle.class.getName())) {
                return new m();
            }
            if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                return new i();
            }
            return null;
        }

        @androidx.annotation.q0
        static q k(@androidx.annotation.o0 Bundle bundle) {
            q i5 = i(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
            return i5 != null ? i5 : (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) ? new m() : bundle.containsKey("android.picture") ? new d() : bundle.containsKey("android.bigText") ? new e() : bundle.containsKey("android.textLines") ? new l() : j(bundle.getString("android.template"));
        }

        @androidx.annotation.q0
        static q l(@androidx.annotation.o0 Bundle bundle) {
            q k5 = k(bundle);
            if (k5 == null) {
                return null;
            }
            try {
                k5.y(bundle);
                return k5;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        private Bitmap n(int i5, int i6, int i7) {
            return p(IconCompat.q(this.f4462a.f4383a, i5), i6, i7);
        }

        private Bitmap p(@androidx.annotation.o0 IconCompat iconCompat, int i5, int i6) {
            Drawable z5 = iconCompat.z(this.f4462a.f4383a);
            int intrinsicWidth = i6 == 0 ? z5.getIntrinsicWidth() : i6;
            if (i6 == 0) {
                i6 = z5.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i6, Bitmap.Config.ARGB_8888);
            z5.setBounds(0, 0, intrinsicWidth, i6);
            if (i5 != 0) {
                z5.mutate().setColorFilter(new PorterDuffColorFilter(i5, PorterDuff.Mode.SRC_IN));
            }
            z5.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        private Bitmap q(int i5, int i6, int i7, int i8) {
            int i9 = a.d.f22968h;
            if (i8 == 0) {
                i8 = 0;
            }
            Bitmap n5 = n(i9, i8, i6);
            Canvas canvas = new Canvas(n5);
            Drawable mutate = this.f4462a.f4383a.getResources().getDrawable(i5).mutate();
            mutate.setFilterBitmap(true);
            int i10 = (i6 - i7) / 2;
            int i11 = i7 + i10;
            mutate.setBounds(i10, i10, i11, i11);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return n5;
        }

        @androidx.annotation.q0
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public static q s(@androidx.annotation.o0 Notification notification) {
            Bundle bundle = notification.extras;
            if (bundle == null) {
                return null;
            }
            return l(bundle);
        }

        private void u(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(a.e.f23012t0, 8);
            remoteViews.setViewVisibility(a.e.f23008r0, 8);
            remoteViews.setViewVisibility(a.e.f23006q0, 8);
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public void a(@androidx.annotation.o0 Bundle bundle) {
            if (this.f4465d) {
                bundle.putCharSequence("android.summaryText", this.f4464c);
            }
            CharSequence charSequence = this.f4463b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String t5 = t();
            if (t5 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", t5);
            }
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public void b(a0 a0Var) {
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x018d  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x017d  */
        @androidx.annotation.c1({androidx.annotation.c1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.o0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.widget.RemoteViews c(boolean r12, int r13, boolean r14) {
            /*
                Method dump skipped, instructions count: 402
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.x1.q.c(boolean, int, boolean):android.widget.RemoteViews");
        }

        @androidx.annotation.q0
        public Notification d() {
            g gVar = this.f4462a;
            if (gVar != null) {
                return gVar.h();
            }
            return null;
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public void e(RemoteViews remoteViews, RemoteViews remoteViews2) {
            u(remoteViews);
            int i5 = a.e.Z;
            remoteViews.removeAllViews(i5);
            remoteViews.addView(i5, remoteViews2.clone());
            remoteViews.setViewVisibility(i5, 0);
            remoteViews.setViewPadding(a.e.f22974a0, 0, f(), 0, 0);
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected void g(@androidx.annotation.o0 Bundle bundle) {
            bundle.remove("android.summaryText");
            bundle.remove("android.title.big");
            bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public Bitmap m(int i5, int i6) {
            return n(i5, i6, 0);
        }

        Bitmap o(@androidx.annotation.o0 IconCompat iconCompat, int i5) {
            return p(iconCompat, i5, 0);
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public boolean r() {
            return false;
        }

        @androidx.annotation.q0
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected String t() {
            return null;
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews v(a0 a0Var) {
            return null;
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews w(a0 a0Var) {
            return null;
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews x(a0 a0Var) {
            return null;
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected void y(@androidx.annotation.o0 Bundle bundle) {
            if (bundle.containsKey("android.summaryText")) {
                this.f4464c = bundle.getCharSequence("android.summaryText");
                this.f4465d = true;
            }
            this.f4463b = bundle.getCharSequence("android.title.big");
        }

        public void z(@androidx.annotation.q0 g gVar) {
            if (this.f4462a != gVar) {
                this.f4462a = gVar;
                if (gVar != null) {
                    gVar.z0(this);
                }
            }
        }
    }

    @Deprecated
    public x1() {
    }

    @androidx.annotation.q0
    public static String A(@androidx.annotation.o0 Notification notification) {
        String shortcutId;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        shortcutId = notification.getShortcutId();
        return shortcutId;
    }

    @androidx.annotation.x0(19)
    public static boolean B(@androidx.annotation.o0 Notification notification) {
        return notification.extras.getBoolean("android.showWhen");
    }

    @androidx.annotation.q0
    public static String C(@androidx.annotation.o0 Notification notification) {
        return notification.getSortKey();
    }

    @androidx.annotation.q0
    @androidx.annotation.x0(19)
    public static CharSequence D(@androidx.annotation.o0 Notification notification) {
        return notification.extras.getCharSequence("android.subText");
    }

    public static long E(@androidx.annotation.o0 Notification notification) {
        long timeoutAfter;
        if (Build.VERSION.SDK_INT < 26) {
            return 0L;
        }
        timeoutAfter = notification.getTimeoutAfter();
        return timeoutAfter;
    }

    @androidx.annotation.x0(19)
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
    public static b a(@androidx.annotation.o0 Notification notification, int i5) {
        return b(notification.actions[i5]);
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(20)
    static b b(@androidx.annotation.o0 Notification.Action action) {
        v4[] v4VarArr;
        int i5;
        int editChoicesBeforeSending;
        boolean z5;
        int i6;
        boolean isContextual;
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        if (remoteInputs == null) {
            v4VarArr = null;
        } else {
            v4[] v4VarArr2 = new v4[remoteInputs.length];
            for (int i7 = 0; i7 < remoteInputs.length; i7++) {
                RemoteInput remoteInput = remoteInputs[i7];
                String resultKey = remoteInput.getResultKey();
                CharSequence label = remoteInput.getLabel();
                CharSequence[] choices = remoteInput.getChoices();
                boolean allowFreeFormInput = remoteInput.getAllowFreeFormInput();
                if (Build.VERSION.SDK_INT >= 29) {
                    editChoicesBeforeSending = remoteInput.getEditChoicesBeforeSending();
                    i5 = editChoicesBeforeSending;
                } else {
                    i5 = 0;
                }
                v4VarArr2[i7] = new v4(resultKey, label, choices, allowFreeFormInput, i5, remoteInput.getExtras(), null);
            }
            v4VarArr = v4VarArr2;
        }
        int i8 = Build.VERSION.SDK_INT;
        boolean z6 = action.getExtras().getBoolean("android.support.allowGeneratedReplies") || action.getAllowGeneratedReplies();
        boolean z7 = action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
        int semanticAction = i8 >= 28 ? action.getSemanticAction() : action.getExtras().getInt("android.support.action.semanticAction", 0);
        if (i8 >= 29) {
            isContextual = action.isContextual();
            z5 = isContextual;
        } else {
            z5 = false;
        }
        boolean isAuthenticationRequired = i8 >= 31 ? action.isAuthenticationRequired() : false;
        if (action.getIcon() != null || (i6 = action.icon) == 0) {
            return new b(action.getIcon() != null ? IconCompat.h(action.getIcon()) : null, action.title, action.actionIntent, action.getExtras(), v4VarArr, (v4[]) null, z6, semanticAction, z7, z5, isAuthenticationRequired);
        }
        return new b(i6, action.title, action.actionIntent, action.getExtras(), v4VarArr, (v4[]) null, z6, semanticAction, z7, z5, isAuthenticationRequired);
    }

    public static int c(@androidx.annotation.o0 Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean d(@androidx.annotation.o0 Notification notification) {
        boolean allowSystemGeneratedContextualActions;
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        allowSystemGeneratedContextualActions = notification.getAllowSystemGeneratedContextualActions();
        return allowSystemGeneratedContextualActions;
    }

    public static boolean e(@androidx.annotation.o0 Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static int f(@androidx.annotation.o0 Notification notification) {
        int badgeIconType;
        if (Build.VERSION.SDK_INT < 26) {
            return 0;
        }
        badgeIconType = notification.getBadgeIconType();
        return badgeIconType;
    }

    @androidx.annotation.q0
    public static f g(@androidx.annotation.o0 Notification notification) {
        Notification.BubbleMetadata bubbleMetadata;
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        bubbleMetadata = notification.getBubbleMetadata();
        return f.a(bubbleMetadata);
    }

    @androidx.annotation.q0
    public static String h(@androidx.annotation.o0 Notification notification) {
        return notification.category;
    }

    @androidx.annotation.q0
    public static String i(@androidx.annotation.o0 Notification notification) {
        String channelId;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        channelId = notification.getChannelId();
        return channelId;
    }

    public static int j(@androidx.annotation.o0 Notification notification) {
        return notification.color;
    }

    @androidx.annotation.q0
    @androidx.annotation.x0(19)
    public static CharSequence k(@androidx.annotation.o0 Notification notification) {
        return notification.extras.getCharSequence("android.infoText");
    }

    @androidx.annotation.q0
    @androidx.annotation.x0(19)
    public static CharSequence l(@androidx.annotation.o0 Notification notification) {
        return notification.extras.getCharSequence("android.text");
    }

    @androidx.annotation.q0
    @androidx.annotation.x0(19)
    public static CharSequence m(@androidx.annotation.o0 Notification notification) {
        return notification.extras.getCharSequence("android.title");
    }

    @androidx.annotation.q0
    public static Bundle n(@androidx.annotation.o0 Notification notification) {
        return notification.extras;
    }

    @androidx.annotation.q0
    public static String o(@androidx.annotation.o0 Notification notification) {
        return notification.getGroup();
    }

    public static int p(@androidx.annotation.o0 Notification notification) {
        int groupAlertBehavior;
        if (Build.VERSION.SDK_INT < 26) {
            return 0;
        }
        groupAlertBehavior = notification.getGroupAlertBehavior();
        return groupAlertBehavior;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
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
            for (int i5 = 0; i5 < bundle2.size(); i5++) {
                arrayList.add(i3.g(bundle2.getBundle(Integer.toString(i5))));
            }
        }
        return arrayList;
    }

    public static boolean s(@androidx.annotation.o0 Notification notification) {
        return (notification.flags & 256) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r3 = r3.getLocusId();
     */
    @androidx.annotation.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.core.content.k t(@androidx.annotation.o0 android.app.Notification r3) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 0
            if (r0 < r1) goto L12
            android.content.LocusId r3 = androidx.core.app.o1.a(r3)
            if (r3 != 0) goto Le
            goto L12
        Le:
            androidx.core.content.k r2 = androidx.core.content.k.d(r3)
        L12:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.x1.t(android.app.Notification):androidx.core.content.k");
    }

    @androidx.annotation.o0
    static Notification[] u(@androidx.annotation.o0 Bundle bundle, @androidx.annotation.o0 String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int i5 = 0; i5 < parcelableArray.length; i5++) {
            notificationArr[i5] = (Notification) parcelableArray[i5];
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
    public static List<y3> x(@androidx.annotation.o0 Notification notification) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList("android.people.list");
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(y3.b.a((Person) it.next()));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray("android.people");
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    y3.c cVar = new y3.c();
                    cVar.f4508c = str;
                    arrayList.add(new y3(cVar));
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
        CharSequence settingsText;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        settingsText = notification.getSettingsText();
        return settingsText;
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes3.dex */
    public static final class h implements j {

        /* renamed from: d, reason: collision with root package name */
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        static final String f4409d = "android.car.EXTENSIONS";

        /* renamed from: e, reason: collision with root package name */
        private static final String f4410e = "large_icon";

        /* renamed from: f, reason: collision with root package name */
        private static final String f4411f = "car_conversation";

        /* renamed from: g, reason: collision with root package name */
        private static final String f4412g = "app_color";

        /* renamed from: h, reason: collision with root package name */
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        static final String f4413h = "invisible_actions";

        /* renamed from: i, reason: collision with root package name */
        private static final String f4414i = "author";

        /* renamed from: j, reason: collision with root package name */
        private static final String f4415j = "text";

        /* renamed from: k, reason: collision with root package name */
        private static final String f4416k = "messages";

        /* renamed from: l, reason: collision with root package name */
        private static final String f4417l = "remote_input";

        /* renamed from: m, reason: collision with root package name */
        private static final String f4418m = "on_reply";

        /* renamed from: n, reason: collision with root package name */
        private static final String f4419n = "on_read";

        /* renamed from: o, reason: collision with root package name */
        private static final String f4420o = "participants";

        /* renamed from: p, reason: collision with root package name */
        private static final String f4421p = "timestamp";

        /* renamed from: a, reason: collision with root package name */
        private Bitmap f4422a;

        /* renamed from: b, reason: collision with root package name */
        private a f4423b;

        /* renamed from: c, reason: collision with root package name */
        private int f4424c;

        /* compiled from: NotificationCompat.java */
        @Deprecated
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private final String[] f4425a;

            /* renamed from: b, reason: collision with root package name */
            private final v4 f4426b;

            /* renamed from: c, reason: collision with root package name */
            private final PendingIntent f4427c;

            /* renamed from: d, reason: collision with root package name */
            private final PendingIntent f4428d;

            /* renamed from: e, reason: collision with root package name */
            private final String[] f4429e;

            /* renamed from: f, reason: collision with root package name */
            private final long f4430f;

            /* compiled from: NotificationCompat.java */
            /* renamed from: androidx.core.app.x1$h$a$a, reason: collision with other inner class name */
            public static class C0033a {

                /* renamed from: a, reason: collision with root package name */
                private final List<String> f4431a = new ArrayList();

                /* renamed from: b, reason: collision with root package name */
                private final String f4432b;

                /* renamed from: c, reason: collision with root package name */
                private v4 f4433c;

                /* renamed from: d, reason: collision with root package name */
                private PendingIntent f4434d;

                /* renamed from: e, reason: collision with root package name */
                private PendingIntent f4435e;

                /* renamed from: f, reason: collision with root package name */
                private long f4436f;

                public C0033a(@androidx.annotation.o0 String str) {
                    this.f4432b = str;
                }

                @androidx.annotation.o0
                public C0033a a(@androidx.annotation.q0 String str) {
                    if (str != null) {
                        this.f4431a.add(str);
                    }
                    return this;
                }

                @androidx.annotation.o0
                public a b() {
                    List<String> list = this.f4431a;
                    return new a((String[]) list.toArray(new String[list.size()]), this.f4433c, this.f4435e, this.f4434d, new String[]{this.f4432b}, this.f4436f);
                }

                @androidx.annotation.o0
                public C0033a c(long j5) {
                    this.f4436f = j5;
                    return this;
                }

                @androidx.annotation.o0
                public C0033a d(@androidx.annotation.q0 PendingIntent pendingIntent) {
                    this.f4434d = pendingIntent;
                    return this;
                }

                @androidx.annotation.o0
                public C0033a e(@androidx.annotation.q0 PendingIntent pendingIntent, @androidx.annotation.q0 v4 v4Var) {
                    this.f4433c = v4Var;
                    this.f4435e = pendingIntent;
                    return this;
                }
            }

            a(@androidx.annotation.q0 String[] strArr, @androidx.annotation.q0 v4 v4Var, @androidx.annotation.q0 PendingIntent pendingIntent, @androidx.annotation.q0 PendingIntent pendingIntent2, @androidx.annotation.q0 String[] strArr2, long j5) {
                this.f4425a = strArr;
                this.f4426b = v4Var;
                this.f4428d = pendingIntent2;
                this.f4427c = pendingIntent;
                this.f4429e = strArr2;
                this.f4430f = j5;
            }

            public long a() {
                return this.f4430f;
            }

            @androidx.annotation.q0
            public String[] b() {
                return this.f4425a;
            }

            @androidx.annotation.q0
            public String c() {
                String[] strArr = this.f4429e;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            @androidx.annotation.q0
            public String[] d() {
                return this.f4429e;
            }

            @androidx.annotation.q0
            public PendingIntent e() {
                return this.f4428d;
            }

            @androidx.annotation.q0
            public v4 f() {
                return this.f4426b;
            }

            @androidx.annotation.q0
            public PendingIntent g() {
                return this.f4427c;
            }
        }

        public h() {
            this.f4424c = 0;
        }

        @androidx.annotation.x0(21)
        private static Bundle b(@androidx.annotation.o0 a aVar) {
            Bundle bundle = new Bundle();
            String str = (aVar.d() == null || aVar.d().length <= 1) ? null : aVar.d()[0];
            int length = aVar.b().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int i5 = 0; i5 < length; i5++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("text", aVar.b()[i5]);
                bundle2.putString("author", str);
                parcelableArr[i5] = bundle2;
            }
            bundle.putParcelableArray("messages", parcelableArr);
            v4 f6 = aVar.f();
            if (f6 != null) {
                bundle.putParcelable("remote_input", new RemoteInput.Builder(f6.o()).setLabel(f6.n()).setChoices(f6.h()).setAllowFreeFormInput(f6.f()).addExtras(f6.m()).build());
            }
            bundle.putParcelable("on_reply", aVar.g());
            bundle.putParcelable("on_read", aVar.e());
            bundle.putStringArray("participants", aVar.d());
            bundle.putLong("timestamp", aVar.a());
            return bundle;
        }

        @androidx.annotation.x0(21)
        private static a f(@androidx.annotation.q0 Bundle bundle) {
            String[] strArr;
            boolean z5;
            if (bundle == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("messages");
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                String[] strArr2 = new String[length];
                for (int i5 = 0; i5 < length; i5++) {
                    Parcelable parcelable = parcelableArray[i5];
                    if (parcelable instanceof Bundle) {
                        String string = ((Bundle) parcelable).getString("text");
                        strArr2[i5] = string;
                        if (string != null) {
                        }
                    }
                    z5 = false;
                    break;
                }
                z5 = true;
                if (!z5) {
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
            return new a(strArr, remoteInput != null ? new v4(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Build.VERSION.SDK_INT >= 29 ? remoteInput.getEditChoicesBeforeSending() : 0, remoteInput.getExtras(), null) : null, pendingIntent2, pendingIntent, stringArray, bundle.getLong("timestamp"));
        }

        @Override // androidx.core.app.x1.j
        @androidx.annotation.o0
        public g a(@androidx.annotation.o0 g gVar) {
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.f4422a;
            if (bitmap != null) {
                bundle.putParcelable("large_icon", bitmap);
            }
            int i5 = this.f4424c;
            if (i5 != 0) {
                bundle.putInt("app_color", i5);
            }
            a aVar = this.f4423b;
            if (aVar != null) {
                bundle.putBundle("car_conversation", b(aVar));
            }
            gVar.t().putBundle("android.car.EXTENSIONS", bundle);
            return gVar;
        }

        @androidx.annotation.l
        public int c() {
            return this.f4424c;
        }

        @androidx.annotation.q0
        public Bitmap d() {
            return this.f4422a;
        }

        @androidx.annotation.q0
        @Deprecated
        public a e() {
            return this.f4423b;
        }

        @androidx.annotation.o0
        public h g(@androidx.annotation.l int i5) {
            this.f4424c = i5;
            return this;
        }

        @androidx.annotation.o0
        public h h(@androidx.annotation.q0 Bitmap bitmap) {
            this.f4422a = bitmap;
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public h i(@androidx.annotation.q0 a aVar) {
            this.f4423b = aVar;
            return this;
        }

        public h(@androidx.annotation.o0 Notification notification) {
            this.f4424c = 0;
            Bundle bundle = notification.extras;
            Bundle bundle2 = bundle == null ? null : bundle.getBundle("android.car.EXTENSIONS");
            if (bundle2 != null) {
                this.f4422a = (Bitmap) bundle2.getParcelable("large_icon");
                this.f4424c = bundle2.getInt("app_color", 0);
                this.f4423b = f(bundle2.getBundle("car_conversation"));
            }
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes3.dex */
    public static class l extends q {

        /* renamed from: f, reason: collision with root package name */
        private static final String f4439f = "androidx.core.app.NotificationCompat$InboxStyle";

        /* renamed from: e, reason: collision with root package name */
        private ArrayList<CharSequence> f4440e = new ArrayList<>();

        public l() {
        }

        @androidx.annotation.o0
        public l A(@androidx.annotation.q0 CharSequence charSequence) {
            if (charSequence != null) {
                this.f4440e.add(g.A(charSequence));
            }
            return this;
        }

        @androidx.annotation.o0
        public l B(@androidx.annotation.q0 CharSequence charSequence) {
            this.f4463b = g.A(charSequence);
            return this;
        }

        @androidx.annotation.o0
        public l C(@androidx.annotation.q0 CharSequence charSequence) {
            this.f4464c = g.A(charSequence);
            this.f4465d = true;
            return this;
        }

        @Override // androidx.core.app.x1.q
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public void b(a0 a0Var) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(a0Var.a()).setBigContentTitle(this.f4463b);
            if (this.f4465d) {
                bigContentTitle.setSummaryText(this.f4464c);
            }
            Iterator<CharSequence> it = this.f4440e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @Override // androidx.core.app.x1.q
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected void g(@androidx.annotation.o0 Bundle bundle) {
            super.g(bundle);
            bundle.remove("android.textLines");
        }

        @Override // androidx.core.app.x1.q
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.o0
        protected String t() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        @Override // androidx.core.app.x1.q
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected void y(@androidx.annotation.o0 Bundle bundle) {
            super.y(bundle);
            this.f4440e.clear();
            if (bundle.containsKey("android.textLines")) {
                Collections.addAll(this.f4440e, bundle.getCharSequenceArray("android.textLines"));
            }
        }

        public l(@androidx.annotation.q0 g gVar) {
            z(gVar);
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes3.dex */
    public static class m extends q {

        /* renamed from: j, reason: collision with root package name */
        private static final String f4441j = "androidx.core.app.NotificationCompat$MessagingStyle";

        /* renamed from: k, reason: collision with root package name */
        public static final int f4442k = 25;

        /* renamed from: e, reason: collision with root package name */
        private final List<a> f4443e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        private final List<a> f4444f = new ArrayList();

        /* renamed from: g, reason: collision with root package name */
        private y3 f4445g;

        /* renamed from: h, reason: collision with root package name */
        @androidx.annotation.q0
        private CharSequence f4446h;

        /* renamed from: i, reason: collision with root package name */
        @androidx.annotation.q0
        private Boolean f4447i;

        m() {
        }

        @androidx.annotation.q0
        public static m E(@androidx.annotation.o0 Notification notification) {
            q s5 = q.s(notification);
            if (s5 instanceof m) {
                return (m) s5;
            }
            return null;
        }

        @androidx.annotation.q0
        private a F() {
            for (int size = this.f4443e.size() - 1; size >= 0; size--) {
                a aVar = this.f4443e.get(size);
                if (aVar.g() != null && !TextUtils.isEmpty(aVar.g().f())) {
                    return aVar;
                }
            }
            if (this.f4443e.isEmpty()) {
                return null;
            }
            return this.f4443e.get(r0.size() - 1);
        }

        private boolean L() {
            for (int size = this.f4443e.size() - 1; size >= 0; size--) {
                a aVar = this.f4443e.get(size);
                if (aVar.g() != null && aVar.g().f() == null) {
                    return true;
                }
            }
            return false;
        }

        @androidx.annotation.o0
        private TextAppearanceSpan N(int i5) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(i5), null);
        }

        private CharSequence O(@androidx.annotation.o0 a aVar) {
            androidx.core.text.a c6 = androidx.core.text.a.c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            CharSequence f6 = aVar.g() == null ? "" : aVar.g().f();
            boolean isEmpty = TextUtils.isEmpty(f6);
            int i5 = androidx.core.view.y1.f5758t;
            if (isEmpty) {
                f6 = this.f4445g.f();
                if (this.f4462a.r() != 0) {
                    i5 = this.f4462a.r();
                }
            }
            CharSequence m5 = c6.m(f6);
            spannableStringBuilder.append(m5);
            spannableStringBuilder.setSpan(N(i5), spannableStringBuilder.length() - m5.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "  ").append(c6.m(aVar.i() != null ? aVar.i() : ""));
            return spannableStringBuilder;
        }

        @androidx.annotation.o0
        public m A(@androidx.annotation.q0 a aVar) {
            if (aVar != null) {
                this.f4444f.add(aVar);
                if (this.f4444f.size() > 25) {
                    this.f4444f.remove(0);
                }
            }
            return this;
        }

        @androidx.annotation.o0
        public m B(@androidx.annotation.q0 a aVar) {
            if (aVar != null) {
                this.f4443e.add(aVar);
                if (this.f4443e.size() > 25) {
                    this.f4443e.remove(0);
                }
            }
            return this;
        }

        @androidx.annotation.o0
        public m C(@androidx.annotation.q0 CharSequence charSequence, long j5, @androidx.annotation.q0 y3 y3Var) {
            B(new a(charSequence, j5, y3Var));
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public m D(@androidx.annotation.q0 CharSequence charSequence, long j5, @androidx.annotation.q0 CharSequence charSequence2) {
            List<a> list = this.f4443e;
            y3.c cVar = new y3.c();
            cVar.f4506a = charSequence2;
            list.add(new a(charSequence, j5, new y3(cVar)));
            if (this.f4443e.size() > 25) {
                this.f4443e.remove(0);
            }
            return this;
        }

        @androidx.annotation.q0
        public CharSequence G() {
            return this.f4446h;
        }

        @androidx.annotation.o0
        public List<a> H() {
            return this.f4444f;
        }

        @androidx.annotation.o0
        public List<a> I() {
            return this.f4443e;
        }

        @androidx.annotation.o0
        public y3 J() {
            return this.f4445g;
        }

        @androidx.annotation.q0
        @Deprecated
        public CharSequence K() {
            return this.f4445g.f();
        }

        public boolean M() {
            g gVar = this.f4462a;
            if (gVar != null && gVar.f4383a.getApplicationInfo().targetSdkVersion < 28 && this.f4447i == null) {
                return this.f4446h != null;
            }
            Boolean bool = this.f4447i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        @androidx.annotation.o0
        public m P(@androidx.annotation.q0 CharSequence charSequence) {
            this.f4446h = charSequence;
            return this;
        }

        @androidx.annotation.o0
        public m Q(boolean z5) {
            this.f4447i = Boolean.valueOf(z5);
            return this;
        }

        @Override // androidx.core.app.x1.q
        public void a(@androidx.annotation.o0 Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f4445g.f());
            bundle.putBundle("android.messagingStyleUser", this.f4445g.m());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f4446h);
            if (this.f4446h != null && this.f4447i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f4446h);
            }
            if (!this.f4443e.isEmpty()) {
                bundle.putParcelableArray("android.messages", a.a(this.f4443e));
            }
            if (!this.f4444f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", a.a(this.f4444f));
            }
            Boolean bool = this.f4447i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // androidx.core.app.x1.q
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public void b(a0 a0Var) {
            Q(M());
            Notification.MessagingStyle messagingStyle = Build.VERSION.SDK_INT >= 28 ? new Notification.MessagingStyle(this.f4445g.k()) : new Notification.MessagingStyle(this.f4445g.f());
            Iterator<a> it = this.f4443e.iterator();
            while (it.hasNext()) {
                messagingStyle.addMessage(it.next().l());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                Iterator<a> it2 = this.f4444f.iterator();
                while (it2.hasNext()) {
                    messagingStyle.addHistoricMessage(it2.next().l());
                }
            }
            if (this.f4447i.booleanValue() || Build.VERSION.SDK_INT >= 28) {
                messagingStyle.setConversationTitle(this.f4446h);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                messagingStyle.setGroupConversation(this.f4447i.booleanValue());
            }
            messagingStyle.setBuilder(a0Var.a());
        }

        @Override // androidx.core.app.x1.q
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
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

        @Override // androidx.core.app.x1.q
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.o0
        protected String t() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        @Override // androidx.core.app.x1.q
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        protected void y(@androidx.annotation.o0 Bundle bundle) {
            super.y(bundle);
            this.f4443e.clear();
            if (bundle.containsKey("android.messagingStyleUser")) {
                this.f4445g = y3.b(bundle.getBundle("android.messagingStyleUser"));
            } else {
                y3.c cVar = new y3.c();
                cVar.f4506a = bundle.getString("android.selfDisplayName");
                this.f4445g = new y3(cVar);
            }
            CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
            this.f4446h = charSequence;
            if (charSequence == null) {
                this.f4446h = bundle.getCharSequence("android.hiddenConversationTitle");
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.f4443e.addAll(a.f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
            if (parcelableArray2 != null) {
                this.f4444f.addAll(a.f(parcelableArray2));
            }
            if (bundle.containsKey("android.isGroupConversation")) {
                this.f4447i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
            }
        }

        @Deprecated
        public m(@androidx.annotation.o0 CharSequence charSequence) {
            y3.c cVar = new y3.c();
            cVar.f4506a = charSequence;
            this.f4445g = new y3(cVar);
        }

        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: g, reason: collision with root package name */
            static final String f4448g = "text";

            /* renamed from: h, reason: collision with root package name */
            static final String f4449h = "time";

            /* renamed from: i, reason: collision with root package name */
            static final String f4450i = "sender";

            /* renamed from: j, reason: collision with root package name */
            static final String f4451j = "type";

            /* renamed from: k, reason: collision with root package name */
            static final String f4452k = "uri";

            /* renamed from: l, reason: collision with root package name */
            static final String f4453l = "extras";

            /* renamed from: m, reason: collision with root package name */
            static final String f4454m = "person";

            /* renamed from: n, reason: collision with root package name */
            static final String f4455n = "sender_person";

            /* renamed from: a, reason: collision with root package name */
            private final CharSequence f4456a;

            /* renamed from: b, reason: collision with root package name */
            private final long f4457b;

            /* renamed from: c, reason: collision with root package name */
            @androidx.annotation.q0
            private final y3 f4458c;

            /* renamed from: d, reason: collision with root package name */
            private Bundle f4459d;

            /* renamed from: e, reason: collision with root package name */
            @androidx.annotation.q0
            private String f4460e;

            /* renamed from: f, reason: collision with root package name */
            @androidx.annotation.q0
            private Uri f4461f;

            public a(@androidx.annotation.q0 CharSequence charSequence, long j5, @androidx.annotation.q0 y3 y3Var) {
                this.f4459d = new Bundle();
                this.f4456a = charSequence;
                this.f4457b = j5;
                this.f4458c = y3Var;
            }

            @androidx.annotation.o0
            static Bundle[] a(@androidx.annotation.o0 List<a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    bundleArr[i5] = list.get(i5).m();
                }
                return bundleArr;
            }

            @androidx.annotation.q0
            static a e(@androidx.annotation.o0 Bundle bundle) {
                y3 y3Var;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        if (bundle.containsKey("person")) {
                            y3Var = y3.b(bundle.getBundle("person"));
                        } else if (bundle.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                            y3Var = y3.b.a((Person) bundle.getParcelable("sender_person"));
                        } else if (bundle.containsKey("sender")) {
                            y3.c cVar = new y3.c();
                            cVar.f4506a = bundle.getCharSequence("sender");
                            y3Var = new y3(cVar);
                        } else {
                            y3Var = null;
                        }
                        a aVar = new a(bundle.getCharSequence("text"), bundle.getLong("time"), y3Var);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            String string = bundle.getString("type");
                            Uri uri = (Uri) bundle.getParcelable("uri");
                            aVar.f4460e = string;
                            aVar.f4461f = uri;
                        }
                        if (bundle.containsKey("extras")) {
                            aVar.f4459d.putAll(bundle.getBundle("extras"));
                        }
                        return aVar;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @androidx.annotation.o0
            static List<a> f(@androidx.annotation.o0 Parcelable[] parcelableArr) {
                a e6;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof Bundle) && (e6 = e((Bundle) parcelable)) != null) {
                        arrayList.add(e6);
                    }
                }
                return arrayList;
            }

            @androidx.annotation.o0
            private Bundle m() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f4456a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.f4457b);
                y3 y3Var = this.f4458c;
                if (y3Var != null) {
                    bundle.putCharSequence("sender", y3Var.f());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", this.f4458c.k());
                    } else {
                        bundle.putBundle("person", this.f4458c.m());
                    }
                }
                String str = this.f4460e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f4461f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f4459d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            @androidx.annotation.q0
            public String b() {
                return this.f4460e;
            }

            @androidx.annotation.q0
            public Uri c() {
                return this.f4461f;
            }

            @androidx.annotation.o0
            public Bundle d() {
                return this.f4459d;
            }

            @androidx.annotation.q0
            public y3 g() {
                return this.f4458c;
            }

            @androidx.annotation.q0
            @Deprecated
            public CharSequence h() {
                y3 y3Var = this.f4458c;
                if (y3Var == null) {
                    return null;
                }
                return y3Var.f();
            }

            @androidx.annotation.q0
            public CharSequence i() {
                return this.f4456a;
            }

            public long j() {
                return this.f4457b;
            }

            @androidx.annotation.o0
            public a k(@androidx.annotation.q0 String str, @androidx.annotation.q0 Uri uri) {
                this.f4460e = str;
                this.f4461f = uri;
                return this;
            }

            @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
            @androidx.annotation.o0
            @androidx.annotation.x0(24)
            Notification.MessagingStyle.Message l() {
                Notification.MessagingStyle.Message message;
                y3 y3Var = this.f4458c;
                if (Build.VERSION.SDK_INT >= 28) {
                    message = new Notification.MessagingStyle.Message(this.f4456a, this.f4457b, y3Var != null ? y3Var.k() : null);
                } else {
                    message = new Notification.MessagingStyle.Message(this.f4456a, this.f4457b, y3Var != null ? y3Var.f() : null);
                }
                String str = this.f4460e;
                if (str != null) {
                    message.setData(str, this.f4461f);
                }
                return message;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            @java.lang.Deprecated
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public a(@androidx.annotation.q0 java.lang.CharSequence r2, long r3, @androidx.annotation.q0 java.lang.CharSequence r5) {
                /*
                    r1 = this;
                    androidx.core.app.y3$c r0 = new androidx.core.app.y3$c
                    r0.<init>()
                    r0.f4506a = r5
                    androidx.core.app.y3 r5 = new androidx.core.app.y3
                    r5.<init>(r0)
                    r1.<init>(r2, r3, r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.x1.m.a.<init>(java.lang.CharSequence, long, java.lang.CharSequence):void");
            }
        }

        public m(@androidx.annotation.o0 y3 y3Var) {
            if (!TextUtils.isEmpty(y3Var.f())) {
                this.f4445g = y3Var;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes3.dex */
    public static final class r implements j {
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
        public static final int f4466o = -1;

        /* renamed from: p, reason: collision with root package name */
        @Deprecated
        public static final int f4467p = 0;

        /* renamed from: q, reason: collision with root package name */
        @Deprecated
        public static final int f4468q = 1;

        /* renamed from: r, reason: collision with root package name */
        @Deprecated
        public static final int f4469r = 2;

        /* renamed from: s, reason: collision with root package name */
        @Deprecated
        public static final int f4470s = 3;

        /* renamed from: t, reason: collision with root package name */
        @Deprecated
        public static final int f4471t = 4;

        /* renamed from: u, reason: collision with root package name */
        @Deprecated
        public static final int f4472u = 5;

        /* renamed from: v, reason: collision with root package name */
        @Deprecated
        public static final int f4473v = 0;

        /* renamed from: w, reason: collision with root package name */
        @Deprecated
        public static final int f4474w = -1;

        /* renamed from: a, reason: collision with root package name */
        private ArrayList<b> f4478a;

        /* renamed from: b, reason: collision with root package name */
        private int f4479b;

        /* renamed from: c, reason: collision with root package name */
        private PendingIntent f4480c;

        /* renamed from: d, reason: collision with root package name */
        private ArrayList<Notification> f4481d;

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f4482e;

        /* renamed from: f, reason: collision with root package name */
        private int f4483f;

        /* renamed from: g, reason: collision with root package name */
        private int f4484g;

        /* renamed from: h, reason: collision with root package name */
        private int f4485h;

        /* renamed from: i, reason: collision with root package name */
        private int f4486i;

        /* renamed from: j, reason: collision with root package name */
        private int f4487j;

        /* renamed from: k, reason: collision with root package name */
        private int f4488k;

        /* renamed from: l, reason: collision with root package name */
        private int f4489l;

        /* renamed from: m, reason: collision with root package name */
        private String f4490m;

        /* renamed from: n, reason: collision with root package name */
        private String f4491n;
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
        private static final String f4475x = "android.wearable.EXTENSIONS";

        /* renamed from: y, reason: collision with root package name */
        private static final String f4476y = "actions";

        /* renamed from: z, reason: collision with root package name */
        private static final String f4477z = "flags";

        public r() {
            this.f4478a = new ArrayList<>();
            this.f4479b = 1;
            this.f4481d = new ArrayList<>();
            this.f4484g = 8388613;
            this.f4485h = -1;
            this.f4486i = 0;
            this.f4488k = 80;
        }

        private void N(int i5, boolean z5) {
            if (z5) {
                this.f4479b = i5 | this.f4479b;
            } else {
                this.f4479b = (~i5) & this.f4479b;
            }
        }

        @androidx.annotation.x0(20)
        private static Notification.Action i(b bVar) {
            int i5 = Build.VERSION.SDK_INT;
            IconCompat f6 = bVar.f();
            Notification.Action.Builder builder = new Notification.Action.Builder(f6 == null ? null : f6.F(), bVar.j(), bVar.a());
            Bundle bundle = bVar.d() != null ? new Bundle(bVar.d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", bVar.b());
            builder.setAllowGeneratedReplies(bVar.b());
            if (i5 >= 31) {
                builder.setAuthenticationRequired(bVar.k());
            }
            builder.addExtras(bundle);
            v4[] g5 = bVar.g();
            if (g5 != null) {
                for (RemoteInput remoteInput : v4.d(g5)) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            return builder.build();
        }

        @Deprecated
        public boolean A() {
            return (this.f4479b & 4) != 0;
        }

        @androidx.annotation.o0
        @Deprecated
        public List<Notification> B() {
            return this.f4481d;
        }

        public boolean C() {
            return (this.f4479b & 8) != 0;
        }

        @androidx.annotation.o0
        @Deprecated
        public r D(@androidx.annotation.q0 Bitmap bitmap) {
            this.f4482e = bitmap;
            return this;
        }

        @androidx.annotation.o0
        public r E(@androidx.annotation.q0 String str) {
            this.f4491n = str;
            return this;
        }

        @androidx.annotation.o0
        public r F(int i5) {
            this.f4485h = i5;
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public r G(int i5) {
            this.f4483f = i5;
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public r H(int i5) {
            this.f4484g = i5;
            return this;
        }

        @androidx.annotation.o0
        public r I(boolean z5) {
            N(1, z5);
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public r J(int i5) {
            this.f4487j = i5;
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public r K(int i5) {
            this.f4486i = i5;
            return this;
        }

        @androidx.annotation.o0
        public r L(@androidx.annotation.q0 String str) {
            this.f4490m = str;
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public r M(@androidx.annotation.q0 PendingIntent pendingIntent) {
            this.f4480c = pendingIntent;
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public r O(int i5) {
            this.f4488k = i5;
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public r P(boolean z5) {
            N(32, z5);
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public r Q(boolean z5) {
            N(16, z5);
            return this;
        }

        @androidx.annotation.o0
        public r R(boolean z5) {
            N(64, z5);
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public r S(boolean z5) {
            N(2, z5);
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public r T(int i5) {
            this.f4489l = i5;
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public r U(boolean z5) {
            N(4, z5);
            return this;
        }

        @androidx.annotation.o0
        public r V(boolean z5) {
            N(8, z5);
            return this;
        }

        @Override // androidx.core.app.x1.j
        @androidx.annotation.o0
        public g a(@androidx.annotation.o0 g gVar) {
            Bundle bundle = new Bundle();
            if (!this.f4478a.isEmpty()) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f4478a.size());
                Iterator<b> it = this.f4478a.iterator();
                while (it.hasNext()) {
                    arrayList.add(i(it.next()));
                }
                bundle.putParcelableArrayList("actions", arrayList);
            }
            int i5 = this.f4479b;
            if (i5 != 1) {
                bundle.putInt("flags", i5);
            }
            PendingIntent pendingIntent = this.f4480c;
            if (pendingIntent != null) {
                bundle.putParcelable("displayIntent", pendingIntent);
            }
            if (!this.f4481d.isEmpty()) {
                ArrayList<Notification> arrayList2 = this.f4481d;
                bundle.putParcelableArray("pages", (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.f4482e;
            if (bitmap != null) {
                bundle.putParcelable("background", bitmap);
            }
            int i6 = this.f4483f;
            if (i6 != 0) {
                bundle.putInt("contentIcon", i6);
            }
            int i7 = this.f4484g;
            if (i7 != 8388613) {
                bundle.putInt("contentIconGravity", i7);
            }
            int i8 = this.f4485h;
            if (i8 != -1) {
                bundle.putInt("contentActionIndex", i8);
            }
            int i9 = this.f4486i;
            if (i9 != 0) {
                bundle.putInt("customSizePreset", i9);
            }
            int i10 = this.f4487j;
            if (i10 != 0) {
                bundle.putInt("customContentHeight", i10);
            }
            int i11 = this.f4488k;
            if (i11 != 80) {
                bundle.putInt("gravity", i11);
            }
            int i12 = this.f4489l;
            if (i12 != 0) {
                bundle.putInt("hintScreenTimeout", i12);
            }
            String str = this.f4490m;
            if (str != null) {
                bundle.putString("dismissalId", str);
            }
            String str2 = this.f4491n;
            if (str2 != null) {
                bundle.putString("bridgeTag", str2);
            }
            gVar.t().putBundle("android.wearable.EXTENSIONS", bundle);
            return gVar;
        }

        @androidx.annotation.o0
        public r b(@androidx.annotation.o0 b bVar) {
            this.f4478a.add(bVar);
            return this;
        }

        @androidx.annotation.o0
        public r c(@androidx.annotation.o0 List<b> list) {
            this.f4478a.addAll(list);
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public r d(@androidx.annotation.o0 Notification notification) {
            this.f4481d.add(notification);
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public r e(@androidx.annotation.o0 List<Notification> list) {
            this.f4481d.addAll(list);
            return this;
        }

        @androidx.annotation.o0
        public r f() {
            this.f4478a.clear();
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public r g() {
            this.f4481d.clear();
            return this;
        }

        @androidx.annotation.o0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public r clone() {
            r rVar = new r();
            rVar.f4478a = new ArrayList<>(this.f4478a);
            rVar.f4479b = this.f4479b;
            rVar.f4480c = this.f4480c;
            rVar.f4481d = new ArrayList<>(this.f4481d);
            rVar.f4482e = this.f4482e;
            rVar.f4483f = this.f4483f;
            rVar.f4484g = this.f4484g;
            rVar.f4485h = this.f4485h;
            rVar.f4486i = this.f4486i;
            rVar.f4487j = this.f4487j;
            rVar.f4488k = this.f4488k;
            rVar.f4489l = this.f4489l;
            rVar.f4490m = this.f4490m;
            rVar.f4491n = this.f4491n;
            return rVar;
        }

        @androidx.annotation.o0
        public List<b> j() {
            return this.f4478a;
        }

        @androidx.annotation.q0
        @Deprecated
        public Bitmap k() {
            return this.f4482e;
        }

        @androidx.annotation.q0
        public String l() {
            return this.f4491n;
        }

        public int m() {
            return this.f4485h;
        }

        @Deprecated
        public int n() {
            return this.f4483f;
        }

        @Deprecated
        public int o() {
            return this.f4484g;
        }

        public boolean p() {
            return (this.f4479b & 1) != 0;
        }

        @Deprecated
        public int q() {
            return this.f4487j;
        }

        @Deprecated
        public int r() {
            return this.f4486i;
        }

        @androidx.annotation.q0
        public String s() {
            return this.f4490m;
        }

        @androidx.annotation.q0
        @Deprecated
        public PendingIntent t() {
            return this.f4480c;
        }

        @Deprecated
        public int u() {
            return this.f4488k;
        }

        @Deprecated
        public boolean v() {
            return (this.f4479b & 32) != 0;
        }

        @Deprecated
        public boolean w() {
            return (this.f4479b & 16) != 0;
        }

        public boolean x() {
            return (this.f4479b & 64) != 0;
        }

        @Deprecated
        public boolean y() {
            return (this.f4479b & 2) != 0;
        }

        @Deprecated
        public int z() {
            return this.f4489l;
        }

        public r(@androidx.annotation.o0 Notification notification) {
            this.f4478a = new ArrayList<>();
            this.f4479b = 1;
            this.f4481d = new ArrayList<>();
            this.f4484g = 8388613;
            this.f4485h = -1;
            this.f4486i = 0;
            this.f4488k = 80;
            Bundle bundle = notification.extras;
            Bundle bundle2 = bundle != null ? bundle.getBundle("android.wearable.EXTENSIONS") : null;
            if (bundle2 != null) {
                ArrayList parcelableArrayList = bundle2.getParcelableArrayList("actions");
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    b[] bVarArr = new b[size];
                    for (int i5 = 0; i5 < size; i5++) {
                        bVarArr[i5] = x1.b((Notification.Action) parcelableArrayList.get(i5));
                    }
                    Collections.addAll(this.f4478a, bVarArr);
                }
                this.f4479b = bundle2.getInt("flags", 1);
                this.f4480c = (PendingIntent) bundle2.getParcelable("displayIntent");
                Notification[] u5 = x1.u(bundle2, "pages");
                if (u5 != null) {
                    Collections.addAll(this.f4481d, u5);
                }
                this.f4482e = (Bitmap) bundle2.getParcelable("background");
                this.f4483f = bundle2.getInt("contentIcon");
                this.f4484g = bundle2.getInt("contentIconGravity", 8388613);
                this.f4485h = bundle2.getInt("contentActionIndex", -1);
                this.f4486i = bundle2.getInt("customSizePreset", 0);
                this.f4487j = bundle2.getInt("customContentHeight");
                this.f4488k = bundle2.getInt("gravity", 80);
                this.f4489l = bundle2.getInt("hintScreenTimeout");
                this.f4490m = bundle2.getString("dismissalId");
                this.f4491n = bundle2.getString("bridgeTag");
            }
        }
    }

    /* compiled from: NotificationCompat.java */
    public static class g {
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
        androidx.core.content.k O;
        long P;
        int Q;
        int R;
        boolean S;
        f T;
        Notification U;
        boolean V;
        Icon W;

        @Deprecated
        public ArrayList<String> X;

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public Context f4383a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public ArrayList<b> f4384b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        @androidx.annotation.o0
        public ArrayList<y3> f4385c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<b> f4386d;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f4387e;

        /* renamed from: f, reason: collision with root package name */
        CharSequence f4388f;

        /* renamed from: g, reason: collision with root package name */
        PendingIntent f4389g;

        /* renamed from: h, reason: collision with root package name */
        PendingIntent f4390h;

        /* renamed from: i, reason: collision with root package name */
        RemoteViews f4391i;

        /* renamed from: j, reason: collision with root package name */
        Bitmap f4392j;

        /* renamed from: k, reason: collision with root package name */
        CharSequence f4393k;

        /* renamed from: l, reason: collision with root package name */
        int f4394l;

        /* renamed from: m, reason: collision with root package name */
        int f4395m;

        /* renamed from: n, reason: collision with root package name */
        boolean f4396n;

        /* renamed from: o, reason: collision with root package name */
        boolean f4397o;

        /* renamed from: p, reason: collision with root package name */
        boolean f4398p;

        /* renamed from: q, reason: collision with root package name */
        q f4399q;

        /* renamed from: r, reason: collision with root package name */
        CharSequence f4400r;

        /* renamed from: s, reason: collision with root package name */
        CharSequence f4401s;

        /* renamed from: t, reason: collision with root package name */
        CharSequence[] f4402t;

        /* renamed from: u, reason: collision with root package name */
        int f4403u;

        /* renamed from: v, reason: collision with root package name */
        int f4404v;

        /* renamed from: w, reason: collision with root package name */
        boolean f4405w;

        /* renamed from: x, reason: collision with root package name */
        String f4406x;

        /* renamed from: y, reason: collision with root package name */
        boolean f4407y;

        /* renamed from: z, reason: collision with root package name */
        String f4408z;

        @androidx.annotation.x0(19)
        public g(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Notification notification) {
            this(context, x1.i(notification));
            ArrayList parcelableArrayList;
            Bundle bundle = notification.extras;
            q s5 = q.s(notification);
            P(x1.m(notification)).O(x1.l(notification)).M(x1.k(notification)).A0(x1.D(notification)).o0(x1.z(notification)).z0(s5).N(notification.contentIntent).Z(notification.getGroup()).b0(x1.H(notification)).f0(x1.t(notification)).H0(notification.when).r0(x1.B(notification)).E0(x1.F(notification)).D(x1.e(notification)).j0(x1.w(notification)).i0(x1.v(notification)).e0(x1.s(notification)).c0(notification.largeIcon).E(x1.f(notification)).G(notification.category).F(x1.g(notification)).h0(notification.number).B0(notification.tickerText).N(notification.contentIntent).U(notification.deleteIntent).Y(notification.fullScreenIntent, x1.q(notification)).y0(notification.sound, notification.audioStreamType).F0(notification.vibrate).d0(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).T(notification.defaults).k0(notification.priority).J(notification.color).G0(notification.visibility).m0(notification.publicVersion).w0(notification.getSortKey()).D0(x1.E(notification)).p0(x1.A(notification)).l0(bundle.getInt("android.progressMax"), bundle.getInt("android.progress"), bundle.getBoolean("android.progressIndeterminate")).C(x1.d(notification)).u0(notification.icon, notification.iconLevel).c(u(notification, s5));
            this.W = notification.getSmallIcon();
            Notification.Action[] actionArr = notification.actions;
            if (actionArr != null && actionArr.length != 0) {
                for (Notification.Action action : actionArr) {
                    b(b.a.f(action).c());
                }
            }
            List<b> r5 = x1.r(notification);
            if (!r5.isEmpty()) {
                Iterator<b> it = r5.iterator();
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
                    f(y3.b.a((Person) it2.next()));
                }
            }
            int i5 = Build.VERSION.SDK_INT;
            if (bundle.containsKey("android.chronometerCountDown")) {
                I(bundle.getBoolean("android.chronometerCountDown"));
            }
            if (i5 < 26 || !bundle.containsKey("android.colorized")) {
                return;
            }
            K(bundle.getBoolean("android.colorized"));
        }

        @androidx.annotation.q0
        protected static CharSequence A(@androidx.annotation.q0 CharSequence charSequence) {
            return charSequence == null ? charSequence : charSequence.length() > Y ? charSequence.subSequence(0, Y) : charSequence;
        }

        @androidx.annotation.q0
        private Bitmap B(@androidx.annotation.q0 Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f4383a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(a.c.f22945g);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(a.c.f22944f);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
        }

        private boolean I0() {
            q qVar = this.f4399q;
            return qVar == null || !qVar.r();
        }

        private void W(int i5, boolean z5) {
            if (z5) {
                Notification notification = this.U;
                notification.flags = i5 | notification.flags;
            } else {
                Notification notification2 = this.U;
                notification2.flags = (~i5) & notification2.flags;
            }
        }

        @androidx.annotation.q0
        @androidx.annotation.x0(19)
        private static Bundle u(@androidx.annotation.o0 Notification notification, @androidx.annotation.q0 q qVar) {
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
            if (qVar != null) {
                qVar.g(bundle);
            }
            return bundle;
        }

        @androidx.annotation.o0
        public g A0(@androidx.annotation.q0 CharSequence charSequence) {
            this.f4400r = A(charSequence);
            return this;
        }

        @androidx.annotation.o0
        public g B0(@androidx.annotation.q0 CharSequence charSequence) {
            this.U.tickerText = A(charSequence);
            return this;
        }

        @androidx.annotation.o0
        public g C(boolean z5) {
            this.S = z5;
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public g C0(@androidx.annotation.q0 CharSequence charSequence, @androidx.annotation.q0 RemoteViews remoteViews) {
            this.U.tickerText = A(charSequence);
            this.f4391i = remoteViews;
            return this;
        }

        @androidx.annotation.o0
        public g D(boolean z5) {
            W(16, z5);
            return this;
        }

        @androidx.annotation.o0
        public g D0(long j5) {
            this.P = j5;
            return this;
        }

        @androidx.annotation.o0
        public g E(int i5) {
            this.M = i5;
            return this;
        }

        @androidx.annotation.o0
        public g E0(boolean z5) {
            this.f4397o = z5;
            return this;
        }

        @androidx.annotation.o0
        public g F(@androidx.annotation.q0 f fVar) {
            this.T = fVar;
            return this;
        }

        @androidx.annotation.o0
        public g F0(@androidx.annotation.q0 long[] jArr) {
            this.U.vibrate = jArr;
            return this;
        }

        @androidx.annotation.o0
        public g G(@androidx.annotation.q0 String str) {
            this.D = str;
            return this;
        }

        @androidx.annotation.o0
        public g G0(int i5) {
            this.G = i5;
            return this;
        }

        @androidx.annotation.o0
        public g H(@androidx.annotation.o0 String str) {
            this.L = str;
            return this;
        }

        @androidx.annotation.o0
        public g H0(long j5) {
            this.U.when = j5;
            return this;
        }

        @androidx.annotation.o0
        @androidx.annotation.x0(24)
        public g I(boolean z5) {
            this.f4398p = z5;
            t().putBoolean("android.chronometerCountDown", z5);
            return this;
        }

        @androidx.annotation.o0
        public g J(@androidx.annotation.l int i5) {
            this.F = i5;
            return this;
        }

        @androidx.annotation.o0
        public g K(boolean z5) {
            this.B = z5;
            this.C = true;
            return this;
        }

        @androidx.annotation.o0
        public g L(@androidx.annotation.q0 RemoteViews remoteViews) {
            this.U.contentView = remoteViews;
            return this;
        }

        @androidx.annotation.o0
        public g M(@androidx.annotation.q0 CharSequence charSequence) {
            this.f4393k = A(charSequence);
            return this;
        }

        @androidx.annotation.o0
        public g N(@androidx.annotation.q0 PendingIntent pendingIntent) {
            this.f4389g = pendingIntent;
            return this;
        }

        @androidx.annotation.o0
        public g O(@androidx.annotation.q0 CharSequence charSequence) {
            this.f4388f = A(charSequence);
            return this;
        }

        @androidx.annotation.o0
        public g P(@androidx.annotation.q0 CharSequence charSequence) {
            this.f4387e = A(charSequence);
            return this;
        }

        @androidx.annotation.o0
        public g Q(@androidx.annotation.q0 RemoteViews remoteViews) {
            this.J = remoteViews;
            return this;
        }

        @androidx.annotation.o0
        public g R(@androidx.annotation.q0 RemoteViews remoteViews) {
            this.I = remoteViews;
            return this;
        }

        @androidx.annotation.o0
        public g S(@androidx.annotation.q0 RemoteViews remoteViews) {
            this.K = remoteViews;
            return this;
        }

        @androidx.annotation.o0
        public g T(int i5) {
            Notification notification = this.U;
            notification.defaults = i5;
            if ((i5 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        @androidx.annotation.o0
        public g U(@androidx.annotation.q0 PendingIntent pendingIntent) {
            this.U.deleteIntent = pendingIntent;
            return this;
        }

        @androidx.annotation.o0
        public g V(@androidx.annotation.q0 Bundle bundle) {
            this.E = bundle;
            return this;
        }

        @androidx.annotation.o0
        public g X(int i5) {
            this.R = i5;
            return this;
        }

        @androidx.annotation.o0
        public g Y(@androidx.annotation.q0 PendingIntent pendingIntent, boolean z5) {
            this.f4390h = pendingIntent;
            W(128, z5);
            return this;
        }

        @androidx.annotation.o0
        public g Z(@androidx.annotation.q0 String str) {
            this.f4406x = str;
            return this;
        }

        @androidx.annotation.o0
        public g a(int i5, @androidx.annotation.q0 CharSequence charSequence, @androidx.annotation.q0 PendingIntent pendingIntent) {
            this.f4384b.add(new b(i5, charSequence, pendingIntent));
            return this;
        }

        @androidx.annotation.o0
        public g a0(int i5) {
            this.Q = i5;
            return this;
        }

        @androidx.annotation.o0
        public g b(@androidx.annotation.q0 b bVar) {
            if (bVar != null) {
                this.f4384b.add(bVar);
            }
            return this;
        }

        @androidx.annotation.o0
        public g b0(boolean z5) {
            this.f4407y = z5;
            return this;
        }

        @androidx.annotation.o0
        public g c(@androidx.annotation.q0 Bundle bundle) {
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
        public g c0(@androidx.annotation.q0 Bitmap bitmap) {
            this.f4392j = B(bitmap);
            return this;
        }

        @androidx.annotation.o0
        @androidx.annotation.x0(21)
        public g d(int i5, @androidx.annotation.q0 CharSequence charSequence, @androidx.annotation.q0 PendingIntent pendingIntent) {
            this.f4386d.add(new b(i5, charSequence, pendingIntent));
            return this;
        }

        @androidx.annotation.o0
        public g d0(@androidx.annotation.l int i5, int i6, int i7) {
            Notification notification = this.U;
            notification.ledARGB = i5;
            notification.ledOnMS = i6;
            notification.ledOffMS = i7;
            notification.flags = ((i6 == 0 || i7 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        @androidx.annotation.o0
        @androidx.annotation.x0(21)
        public g e(@androidx.annotation.q0 b bVar) {
            if (bVar != null) {
                this.f4386d.add(bVar);
            }
            return this;
        }

        @androidx.annotation.o0
        public g e0(boolean z5) {
            this.A = z5;
            return this;
        }

        @androidx.annotation.o0
        public g f(@androidx.annotation.q0 y3 y3Var) {
            if (y3Var != null) {
                this.f4385c.add(y3Var);
            }
            return this;
        }

        @androidx.annotation.o0
        public g f0(@androidx.annotation.q0 androidx.core.content.k kVar) {
            this.O = kVar;
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public g g(@androidx.annotation.q0 String str) {
            if (str != null && !str.isEmpty()) {
                this.X.add(str);
            }
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public g g0() {
            this.V = true;
            return this;
        }

        @androidx.annotation.o0
        public Notification h() {
            return new g3(this).c();
        }

        @androidx.annotation.o0
        public g h0(int i5) {
            this.f4394l = i5;
            return this;
        }

        @androidx.annotation.o0
        public g i() {
            this.f4384b.clear();
            return this;
        }

        @androidx.annotation.o0
        public g i0(boolean z5) {
            W(2, z5);
            return this;
        }

        @androidx.annotation.o0
        public g j() {
            this.f4386d.clear();
            Bundle bundle = this.E.getBundle("android.car.EXTENSIONS");
            if (bundle != null) {
                Bundle bundle2 = new Bundle(bundle);
                bundle2.remove("invisible_actions");
                this.E.putBundle("android.car.EXTENSIONS", bundle2);
            }
            return this;
        }

        @androidx.annotation.o0
        public g j0(boolean z5) {
            W(8, z5);
            return this;
        }

        @androidx.annotation.o0
        public g k() {
            this.f4385c.clear();
            this.X.clear();
            return this;
        }

        @androidx.annotation.o0
        public g k0(int i5) {
            this.f4395m = i5;
            return this;
        }

        @androidx.annotation.q0
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews l() {
            RemoteViews v5;
            if (this.J != null && I0()) {
                return this.J;
            }
            g3 g3Var = new g3(this);
            q qVar = this.f4399q;
            return (qVar == null || (v5 = qVar.v(g3Var)) == null) ? Notification.Builder.recoverBuilder(this.f4383a, g3Var.c()).createBigContentView() : v5;
        }

        @androidx.annotation.o0
        public g l0(int i5, int i6, boolean z5) {
            this.f4403u = i5;
            this.f4404v = i6;
            this.f4405w = z5;
            return this;
        }

        @androidx.annotation.q0
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews m() {
            RemoteViews w5;
            if (this.I != null && I0()) {
                return this.I;
            }
            g3 g3Var = new g3(this);
            q qVar = this.f4399q;
            return (qVar == null || (w5 = qVar.w(g3Var)) == null) ? Notification.Builder.recoverBuilder(this.f4383a, g3Var.c()).createContentView() : w5;
        }

        @androidx.annotation.o0
        public g m0(@androidx.annotation.q0 Notification notification) {
            this.H = notification;
            return this;
        }

        @androidx.annotation.q0
        @SuppressLint({"BuilderSetStyle"})
        public RemoteViews n() {
            RemoteViews x5;
            if (this.K != null && I0()) {
                return this.K;
            }
            g3 g3Var = new g3(this);
            q qVar = this.f4399q;
            return (qVar == null || (x5 = qVar.x(g3Var)) == null) ? Notification.Builder.recoverBuilder(this.f4383a, g3Var.c()).createHeadsUpContentView() : x5;
        }

        @androidx.annotation.o0
        public g n0(@androidx.annotation.q0 CharSequence[] charSequenceArr) {
            this.f4402t = charSequenceArr;
            return this;
        }

        @androidx.annotation.o0
        public g o(@androidx.annotation.o0 j jVar) {
            jVar.a(this);
            return this;
        }

        @androidx.annotation.o0
        public g o0(@androidx.annotation.q0 CharSequence charSequence) {
            this.f4401s = A(charSequence);
            return this;
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews p() {
            return this.J;
        }

        @androidx.annotation.o0
        public g p0(@androidx.annotation.q0 String str) {
            this.N = str;
            return this;
        }

        @androidx.annotation.q0
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public f q() {
            return this.T;
        }

        @androidx.annotation.o0
        public g q0(@androidx.annotation.q0 androidx.core.content.pm.u0 u0Var) {
            if (u0Var == null) {
                return this;
            }
            this.N = u0Var.k();
            if (this.O == null) {
                if (u0Var.o() != null) {
                    this.O = u0Var.o();
                } else if (u0Var.k() != null) {
                    this.O = new androidx.core.content.k(u0Var.k());
                }
            }
            if (this.f4387e == null) {
                P(u0Var.w());
            }
            return this;
        }

        @androidx.annotation.l
        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public int r() {
            return this.F;
        }

        @androidx.annotation.o0
        public g r0(boolean z5) {
            this.f4396n = z5;
            return this;
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews s() {
            return this.I;
        }

        @androidx.annotation.o0
        public g s0(boolean z5) {
            this.V = z5;
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
        public g t0(int i5) {
            this.U.icon = i5;
            return this;
        }

        @androidx.annotation.o0
        public g u0(int i5, int i6) {
            Notification notification = this.U;
            notification.icon = i5;
            notification.iconLevel = i6;
            return this;
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public int v() {
            return this.R;
        }

        @androidx.annotation.o0
        @androidx.annotation.x0(23)
        public g v0(@androidx.annotation.o0 IconCompat iconCompat) {
            this.W = iconCompat.G(this.f4383a);
            return this;
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews w() {
            return this.K;
        }

        @androidx.annotation.o0
        public g w0(@androidx.annotation.q0 String str) {
            this.f4408z = str;
            return this;
        }

        @androidx.annotation.o0
        @Deprecated
        public Notification x() {
            return h();
        }

        @androidx.annotation.o0
        public g x0(@androidx.annotation.q0 Uri uri) {
            Notification notification = this.U;
            notification.sound = uri;
            notification.audioStreamType = -1;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            return this;
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public int y() {
            return this.f4395m;
        }

        @androidx.annotation.o0
        public g y0(@androidx.annotation.q0 Uri uri, int i5) {
            Notification notification = this.U;
            notification.sound = uri;
            notification.audioStreamType = i5;
            notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i5).build();
            return this;
        }

        @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
        public long z() {
            if (this.f4396n) {
                return this.U.when;
            }
            return 0L;
        }

        @androidx.annotation.o0
        public g z0(@androidx.annotation.q0 q qVar) {
            if (this.f4399q != qVar) {
                this.f4399q = qVar;
                if (qVar != null) {
                    qVar.z(this);
                }
            }
            return this;
        }

        public g(@androidx.annotation.o0 Context context, @androidx.annotation.o0 String str) {
            this.f4384b = new ArrayList<>();
            this.f4385c = new ArrayList<>();
            this.f4386d = new ArrayList<>();
            this.f4396n = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.Q = 0;
            this.R = 0;
            Notification notification = new Notification();
            this.U = notification;
            this.f4383a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.U.audioStreamType = -1;
            this.f4395m = 0;
            this.X = new ArrayList<>();
            this.S = true;
        }

        @Deprecated
        public g(@androidx.annotation.o0 Context context) {
            this(context, (String) null);
        }
    }
}
