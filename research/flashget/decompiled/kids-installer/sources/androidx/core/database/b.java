package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.u;
import androidx.annotation.x0;

/* compiled from: CursorWindowCompat.java */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: CursorWindowCompat.java */
    @x0(15)
    static class a {
        private a() {
        }

        @u
        static CursorWindow a(String str) {
            return new CursorWindow(str);
        }
    }

    /* compiled from: CursorWindowCompat.java */
    @x0(28)
    /* renamed from: androidx.core.database.b$b, reason: collision with other inner class name */
    static class C0037b {
        private C0037b() {
        }

        @u
        static CursorWindow a(String str, long j5) {
            return new CursorWindow(str, j5);
        }
    }

    private b() {
    }

    @o0
    public static CursorWindow a(@q0 String str, long j5) {
        return Build.VERSION.SDK_INT >= 28 ? C0037b.a(str, j5) : a.a(str);
    }
}
