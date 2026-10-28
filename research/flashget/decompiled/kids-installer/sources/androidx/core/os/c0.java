package androidx.core.os;

import android.content.Context;
import android.os.UserManager;
import androidx.annotation.o0;
import androidx.annotation.x0;

/* compiled from: UserManagerCompat.java */
/* loaded from: classes.dex */
public class c0 {

    /* compiled from: UserManagerCompat.java */
    @x0(24)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static boolean a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    private c0() {
    }

    public static boolean a(@o0 Context context) {
        return a.a(context);
    }
}
