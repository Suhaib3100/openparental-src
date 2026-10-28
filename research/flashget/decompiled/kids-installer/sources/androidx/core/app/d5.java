package androidx.core.app;

import android.app.Service;
import androidx.annotation.c1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: ServiceCompat.java */
/* loaded from: classes.dex */
public final class d5 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4039a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f4040b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f4041c = 2;

    /* compiled from: ServiceCompat.java */
    @androidx.annotation.x0(24)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(Service service, int i5) {
            service.stopForeground(i5);
        }
    }

    /* compiled from: ServiceCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    private d5() {
    }

    public static void a(@androidx.annotation.o0 Service service, int i5) {
        a.a(service, i5);
    }
}
