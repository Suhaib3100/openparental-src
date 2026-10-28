package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: CursorWindowCompat.java */
/* loaded from: classes3.dex */
public final class b {

    /* compiled from: CursorWindowCompat.java */
    @x0(28)
    static class a {
        private a() {
        }

        static CursorWindow a(String str, long j4) {
            return new CursorWindow(str, j4);
        }
    }

    private b() {
    }

    @o0
    public static CursorWindow a(@q0 String str, long j4) {
        return Build.VERSION.SDK_INT >= 28 ? a.a(str, j4) : new CursorWindow(str);
    }
}
