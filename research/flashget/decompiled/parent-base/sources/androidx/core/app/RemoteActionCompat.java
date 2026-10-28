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
    @c1({c1.a.LIBRARY_GROUP})
    @androidx.annotation.o0
    public IconCompat f25403a;

    /* renamed from: b, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    @androidx.annotation.o0
    public CharSequence f25404b;

    /* renamed from: c, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    @androidx.annotation.o0
    public CharSequence f25405c;

    /* renamed from: d, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    @androidx.annotation.o0
    public PendingIntent f25406d;

    /* renamed from: e, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    public boolean f25407e;

    /* renamed from: f, reason: collision with root package name */
    @c1({c1.a.LIBRARY_GROUP})
    public boolean f25408f;

    @androidx.annotation.x0(26)
    static class a {
        private a() {
        }

        static RemoteAction a(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
            return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
        }

        static PendingIntent b(RemoteAction remoteAction) {
            return remoteAction.getActionIntent();
        }

        static CharSequence c(RemoteAction remoteAction) {
            return remoteAction.getContentDescription();
        }

        static Icon d(RemoteAction remoteAction) {
            return remoteAction.getIcon();
        }

        static CharSequence e(RemoteAction remoteAction) {
            return remoteAction.getTitle();
        }

        static boolean f(RemoteAction remoteAction) {
            return remoteAction.isEnabled();
        }

        static void g(RemoteAction remoteAction, boolean z4) {
            remoteAction.setEnabled(z4);
        }
    }

    @androidx.annotation.x0(28)
    static class b {
        private b() {
        }

        static void a(RemoteAction remoteAction, boolean z4) {
            remoteAction.setShouldShowIcon(z4);
        }

        static boolean b(RemoteAction remoteAction) {
            return remoteAction.shouldShowIcon();
        }
    }

    public RemoteActionCompat(@androidx.annotation.o0 IconCompat iconCompat, @androidx.annotation.o0 CharSequence charSequence, @androidx.annotation.o0 CharSequence charSequence2, @androidx.annotation.o0 PendingIntent pendingIntent) {
        iconCompat.getClass();
        this.f25403a = iconCompat;
        charSequence.getClass();
        this.f25404b = charSequence;
        charSequence2.getClass();
        this.f25405c = charSequence2;
        pendingIntent.getClass();
        this.f25406d = pendingIntent;
        this.f25407e = true;
        this.f25408f = true;
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(26)
    public static RemoteActionCompat f(@androidx.annotation.o0 RemoteAction remoteAction) {
        remoteAction.getClass();
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.l(a.d(remoteAction)), a.e(remoteAction), a.c(remoteAction), a.b(remoteAction));
        remoteActionCompat.f25407e = a.f(remoteAction);
        if (Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.f25408f = b.b(remoteAction);
        }
        return remoteActionCompat;
    }

    @androidx.annotation.o0
    public PendingIntent g() {
        return this.f25406d;
    }

    @androidx.annotation.o0
    public CharSequence h() {
        return this.f25405c;
    }

    @androidx.annotation.o0
    public IconCompat i() {
        return this.f25403a;
    }

    @androidx.annotation.o0
    public CharSequence j() {
        return this.f25404b;
    }

    public boolean k() {
        return this.f25407e;
    }

    public void l(boolean z4) {
        this.f25407e = z4;
    }

    public void m(boolean z4) {
        this.f25408f = z4;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public boolean n() {
        return this.f25408f;
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(26)
    public RemoteAction o() {
        RemoteAction a5 = a.a(this.f25403a.J(), this.f25404b, this.f25405c, this.f25406d);
        a.g(a5, this.f25407e);
        if (Build.VERSION.SDK_INT >= 28) {
            b.a(a5, this.f25408f);
        }
        return a5;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public RemoteActionCompat() {
    }

    public RemoteActionCompat(@androidx.annotation.o0 RemoteActionCompat remoteActionCompat) {
        remoteActionCompat.getClass();
        this.f25403a = remoteActionCompat.f25403a;
        this.f25404b = remoteActionCompat.f25404b;
        this.f25405c = remoteActionCompat.f25405c;
        this.f25406d = remoteActionCompat.f25406d;
        this.f25407e = remoteActionCompat.f25407e;
        this.f25408f = remoteActionCompat.f25408f;
    }
}
