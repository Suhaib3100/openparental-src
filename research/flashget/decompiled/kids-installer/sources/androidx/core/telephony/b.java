package androidx.core.telephony;

import android.os.Build;
import android.telephony.SubscriptionManager;
import androidx.annotation.u;
import androidx.annotation.x0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: SubscriptionManagerCompat.java */
@x0(22)
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static Method f5100a;

    /* compiled from: SubscriptionManagerCompat.java */
    @x0(29)
    private static class a {
        private a() {
        }

        @u
        static int a(int i5) {
            int slotIndex;
            slotIndex = SubscriptionManager.getSlotIndex(i5);
            return slotIndex;
        }
    }

    private b() {
    }

    public static int a(int i5) {
        if (i5 == -1) {
            return -1;
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            return a.a(i5);
        }
        try {
            if (f5100a == null) {
                if (i6 >= 26) {
                    f5100a = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", Integer.TYPE);
                } else {
                    f5100a = SubscriptionManager.class.getDeclaredMethod("getSlotId", Integer.TYPE);
                }
                f5100a.setAccessible(true);
            }
            Integer num = (Integer) f5100a.invoke(null, Integer.valueOf(i5));
            if (num != null) {
                return num.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return -1;
    }
}
