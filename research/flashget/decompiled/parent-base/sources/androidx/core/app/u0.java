package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.os.Build;
import androidx.annotation.c1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: ServiceCompat.java */
/* loaded from: classes3.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f25902a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f25903b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f25904c = 2;

    /* renamed from: d, reason: collision with root package name */
    private static final int f25905d = 255;

    /* renamed from: e, reason: collision with root package name */
    private static final int f25906e = 1073745919;

    /* compiled from: ServiceCompat.java */
    @androidx.annotation.x0(24)
    static class a {
        private a() {
        }

        static void a(Service service, int i4) {
            service.stopForeground(i4);
        }
    }

    /* compiled from: ServiceCompat.java */
    @androidx.annotation.x0(29)
    static class b {
        private b() {
        }

        static void a(Service service, int i4, Notification notification, int i5) {
            if (i5 == 0 || i5 == -1) {
                service.startForeground(i4, notification, i5);
            } else {
                service.startForeground(i4, notification, i5 & 255);
            }
        }
    }

    /* compiled from: ServiceCompat.java */
    @androidx.annotation.x0(34)
    static class c {
        private c() {
        }

        static void a(Service service, int i4, Notification notification, int i5) {
            if (i5 == 0 || i5 == -1) {
                service.startForeground(i4, notification, i5);
            } else {
                service.startForeground(i4, notification, i5 & u0.f25906e);
            }
        }
    }

    /* compiled from: ServiceCompat.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    private u0() {
    }

    public static void a(@androidx.annotation.o0 Service service, int i4, @androidx.annotation.o0 Notification notification, int i5) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            c.a(service, i4, notification, i5);
        } else if (i6 >= 29) {
            b.a(service, i4, notification, i5);
        } else {
            service.startForeground(i4, notification);
        }
    }

    public static void b(@androidx.annotation.o0 Service service, int i4) {
        service.stopForeground(i4);
    }
}
