package androidx.core.os;

import android.os.Environment;
import androidx.annotation.o0;
import androidx.annotation.x0;
import java.io.File;

/* compiled from: EnvironmentCompat.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4972a = "EnvironmentCompat";

    /* renamed from: b, reason: collision with root package name */
    public static final String f4973b = "unknown";

    /* compiled from: EnvironmentCompat.java */
    @x0(19)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static String a(File file) {
            return Environment.getStorageState(file);
        }
    }

    /* compiled from: EnvironmentCompat.java */
    @x0(21)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static String a(File file) {
            return Environment.getExternalStorageState(file);
        }
    }

    private e() {
    }

    @o0
    public static String a(@o0 File file) {
        return b.a(file);
    }
}
