package bb;

import android.content.Context;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: SystemUtils.java */
/* loaded from: classes6.dex */
public class b {
    public static int a(Context context) {
        try {
            return context.getResources().getDisplayMetrics().heightPixels;
        } catch (Exception e4) {
            e4.printStackTrace();
            return -1;
        }
    }

    public static int b(Context context) {
        try {
            return context.getResources().getDisplayMetrics().widthPixels;
        } catch (Exception e4) {
            e4.printStackTrace();
            return -1;
        }
    }

    public static int c(Context context) {
        int identifier = context.getResources().getIdentifier(ProtectedSandApp.s("\uf0be"), ProtectedSandApp.s("\uf0bc"), ProtectedSandApp.s("\uf0bd"));
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
