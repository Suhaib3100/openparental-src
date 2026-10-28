package androidx.profileinstaller;

import android.content.Context;
import androidx.annotation.o0;
import androidx.annotation.x0;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* compiled from: BenchmarkOperation.java */
/* loaded from: classes3.dex */
class a {

    /* compiled from: BenchmarkOperation.java */
    @x0(api = 21)
    /* renamed from: androidx.profileinstaller.a$a, reason: collision with other inner class name */
    private static class C0591a {
        private C0591a() {
        }

        static File a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    /* compiled from: BenchmarkOperation.java */
    @x0(api = 24)
    private static class b {
        private b() {
        }

        static File a(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    private a() {
    }

    static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z4 = true;
        for (File file2 : listFiles) {
            z4 = a(file2) && z4;
        }
        return z4;
    }

    static void b(@o0 Context context, @o0 ProfileInstallReceiver.a aVar) {
        if (a(b.a(context))) {
            aVar.a(14, null);
        } else {
            aVar.a(15, null);
        }
    }
}
