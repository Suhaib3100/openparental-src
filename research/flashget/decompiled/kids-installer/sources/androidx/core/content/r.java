package androidx.core.content;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: PermissionChecker.java */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4598a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f4599b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f4600c = -2;

    /* compiled from: PermissionChecker.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    private r() {
    }

    public static int a(@o0 Context context, @o0 String str) {
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int b(@o0 Context context, @o0 String str, @q0 String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static int c(@o0 Context context, @o0 String str, int i5, int i6, @q0 String str2) {
        if (context.checkPermission(str, i5, i6) == -1) {
            return -1;
        }
        String f6 = androidx.core.app.n.f(str);
        if (f6 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i6);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return (Process.myUid() == i6 && androidx.core.util.l.a(context.getPackageName(), str2) ? androidx.core.app.n.a(context, i6, f6, str2) : androidx.core.app.n.e(context, f6, str2)) == 0 ? 0 : -2;
    }

    public static int d(@o0 Context context, @o0 String str) {
        return c(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
