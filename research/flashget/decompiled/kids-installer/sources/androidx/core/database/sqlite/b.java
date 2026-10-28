package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteCursor;
import android.os.Build;
import androidx.annotation.o0;
import androidx.annotation.u;
import androidx.annotation.x0;

/* compiled from: SQLiteCursorCompat.java */
/* loaded from: classes.dex */
public final class b {

    /* compiled from: SQLiteCursorCompat.java */
    @x0(28)
    static class a {
        private a() {
        }

        @u
        static void a(SQLiteCursor sQLiteCursor, boolean z5) {
            sQLiteCursor.setFillWindowForwardOnly(z5);
        }
    }

    private b() {
    }

    public static void a(@o0 SQLiteCursor sQLiteCursor, boolean z5) {
        if (Build.VERSION.SDK_INT >= 28) {
            a.a(sQLiteCursor, z5);
        }
    }
}
