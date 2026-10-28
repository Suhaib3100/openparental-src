package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteCursor;
import android.os.Build;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: SQLiteCursorCompat.java */
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: SQLiteCursorCompat.java */
    @x0(28)
    /* renamed from: androidx.core.database.sqlite.a$a, reason: collision with other inner class name */
    static class C0413a {
        private C0413a() {
        }

        static void a(SQLiteCursor sQLiteCursor, boolean z4) {
            sQLiteCursor.setFillWindowForwardOnly(z4);
        }
    }

    private a() {
    }

    public static void a(@o0 SQLiteCursor sQLiteCursor, boolean z4) {
        if (Build.VERSION.SDK_INT >= 28) {
            C0413a.a(sQLiteCursor, z4);
        }
    }
}
