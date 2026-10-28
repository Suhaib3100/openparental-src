package androidx.core.content.pm;

import android.annotation.SuppressLint;
import android.content.pm.PermissionInfo;
import android.os.Build;
import androidx.annotation.c1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: PermissionInfoCompat.java */
/* loaded from: classes3.dex */
public final class d {

    /* compiled from: PermissionInfoCompat.java */
    @androidx.annotation.x0(28)
    static class a {
        private a() {
        }

        static int a(PermissionInfo permissionInfo) {
            return permissionInfo.getProtection();
        }

        static int b(PermissionInfo permissionInfo) {
            return permissionInfo.getProtectionFlags();
        }
    }

    /* compiled from: PermissionInfoCompat.java */
    @androidx.annotation.c1({c1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* compiled from: PermissionInfoCompat.java */
    @SuppressLint({"UniqueConstants"})
    @androidx.annotation.c1({c1.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    private d() {
    }

    @SuppressLint({"WrongConstant"})
    public static int a(@androidx.annotation.o0 PermissionInfo permissionInfo) {
        return Build.VERSION.SDK_INT >= 28 ? a.a(permissionInfo) : permissionInfo.protectionLevel & 15;
    }

    @SuppressLint({"WrongConstant"})
    public static int b(@androidx.annotation.o0 PermissionInfo permissionInfo) {
        return Build.VERSION.SDK_INT >= 28 ? a.b(permissionInfo) : permissionInfo.protectionLevel & (-16);
    }
}
