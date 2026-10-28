package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.annotation.c1;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes3.dex */
public final class RemoteActionCompat implements androidx.versionedparcelable.g {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    @androidx.annotation.o0
    public IconCompat f4005a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    @androidx.annotation.o0
    public CharSequence f4006b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    @androidx.annotation.o0
    public CharSequence f4007c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    @androidx.annotation.o0
    public PendingIntent f4008d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public boolean f4009e;

    /* renamed from: f, reason: collision with root package name */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public boolean f4010f;

    @androidx.annotation.x0(26)
    /* loaded from: classes.dex */
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static RemoteAction a(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
            return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
        }

        @androidx.annotation.u
        static PendingIntent b(RemoteAction remoteAction) {
            PendingIntent actionIntent;
            actionIntent = remoteAction.getActionIntent();
            return actionIntent;
        }

        @androidx.annotation.u
        static CharSequence c(RemoteAction remoteAction) {
            CharSequence contentDescription;
            contentDescription = remoteAction.getContentDescription();
            return contentDescription;
        }

        @androidx.annotation.u
        static Icon d(RemoteAction remoteAction) {
            Icon icon;
            icon = remoteAction.getIcon();
            return icon;
        }

        @androidx.annotation.u
        static CharSequence e(RemoteAction remoteAction) {
            CharSequence title;
            title = remoteAction.getTitle();
            return title;
        }

        @androidx.annotation.u
        static boolean f(RemoteAction remoteAction) {
            boolean isEnabled;
            isEnabled = remoteAction.isEnabled();
            return isEnabled;
        }

        @androidx.annotation.u
        static void g(RemoteAction remoteAction, boolean z5) {
            remoteAction.setEnabled(z5);
        }
    }

    @androidx.annotation.x0(28)
    /* loaded from: classes.dex */
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static void a(RemoteAction remoteAction, boolean z5) {
            remoteAction.setShouldShowIcon(z5);
        }

        @androidx.annotation.u
        static boolean b(RemoteAction remoteAction) {
            boolean shouldShowIcon;
            shouldShowIcon = remoteAction.shouldShowIcon();
            return shouldShowIcon;
        }
    }

    public RemoteActionCompat(@androidx.annotation.o0 IconCompat iconCompat, @androidx.annotation.o0 CharSequence charSequence, @androidx.annotation.o0 CharSequence charSequence2, @androidx.annotation.o0 PendingIntent pendingIntent) {
        iconCompat.getClass();
        this.f4005a = iconCompat;
        charSequence.getClass();
        this.f4006b = charSequence;
        charSequence2.getClass();
        this.f4007c = charSequence2;
        pendingIntent.getClass();
        this.f4008d = pendingIntent;
        this.f4009e = true;
        this.f4010f = true;
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(26)
    public static RemoteActionCompat a(@androidx.annotation.o0 RemoteAction remoteAction) {
        remoteAction.getClass();
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.g(a.d(remoteAction)), a.e(remoteAction), a.c(remoteAction), a.b(remoteAction));
        remoteActionCompat.f4009e = a.f(remoteAction);
        if (Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.f4010f = b.b(remoteAction);
        }
        return remoteActionCompat;
    }

    @androidx.annotation.o0
    public PendingIntent b() {
        return this.f4008d;
    }

    @androidx.annotation.o0
    public CharSequence c() {
        return this.f4007c;
    }

    @androidx.annotation.o0
    public IconCompat d() {
        return this.f4005a;
    }

    @androidx.annotation.o0
    public CharSequence e() {
        return this.f4006b;
    }

    public boolean f() {
        return this.f4009e;
    }

    public void g(boolean z5) {
        this.f4009e = z5;
    }

    public void h(boolean z5) {
        this.f4010f = z5;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public boolean i() {
        return this.f4010f;
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(26)
    public RemoteAction j() {
        RemoteAction a6 = a.a(this.f4005a.F(), this.f4006b, this.f4007c, this.f4008d);
        a.g(a6, this.f4009e);
        if (Build.VERSION.SDK_INT >= 28) {
            b.a(a6, this.f4010f);
        }
        return a6;
    }

    @androidx.annotation.c1({c1.a.LIBRARY_GROUP})
    public RemoteActionCompat() {
    }

    public RemoteActionCompat(@androidx.annotation.o0 RemoteActionCompat remoteActionCompat) {
        remoteActionCompat.getClass();
        this.f4005a = remoteActionCompat.f4005a;
        this.f4006b = remoteActionCompat.f4006b;
        this.f4007c = remoteActionCompat.f4007c;
        this.f4008d = remoteActionCompat.f4008d;
        this.f4009e = remoteActionCompat.f4009e;
        this.f4010f = remoteActionCompat.f4010f;
    }
}
