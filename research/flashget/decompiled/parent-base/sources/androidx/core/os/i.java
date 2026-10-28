package androidx.core.os;

import android.os.Environment;
import androidx.annotation.x0;
import java.io.File;

/* compiled from: EnvironmentCompat.java */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final String f26508a = "unknown";

    /* compiled from: EnvironmentCompat.java */
    @x0(21)
    static class a {
        private a() {
        }

        static String a(File file) {
            return Environment.getExternalStorageState(file);
        }
    }

    private i() {
    }

    @androidx.annotation.o0
    public static String a(@androidx.annotation.o0 File file) {
        return Environment.getExternalStorageState(file);
    }
}
