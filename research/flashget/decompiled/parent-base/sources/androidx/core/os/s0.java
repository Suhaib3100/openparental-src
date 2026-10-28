package androidx.core.os;

import android.content.Context;
import android.os.UserManager;
import androidx.annotation.x0;

/* compiled from: UserManagerCompat.java */
/* loaded from: classes3.dex */
public class s0 {

    /* compiled from: UserManagerCompat.java */
    @x0(24)
    static class a {
        private a() {
        }

        static boolean a(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }

    private s0() {
    }

    public static boolean a(@androidx.annotation.o0 Context context) {
        return a.a(context);
    }
}
