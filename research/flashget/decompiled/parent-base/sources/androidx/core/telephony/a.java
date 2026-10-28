package androidx.core.telephony;

import android.os.Build;
import android.telephony.SubscriptionManager;
import androidx.annotation.x0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: SubscriptionManagerCompat.java */
@x0(22)
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static Method f26671a;

    /* compiled from: SubscriptionManagerCompat.java */
    @x0(29)
    /* renamed from: androidx.core.telephony.a$a, reason: collision with other inner class name */
    private static class C0428a {
        private C0428a() {
        }

        static int a(int i4) {
            return SubscriptionManager.getSlotIndex(i4);
        }
    }

    private a() {
    }

    public static int a(int i4) {
        if (i4 == -1) {
            return -1;
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            return C0428a.a(i4);
        }
        try {
            if (f26671a == null) {
                if (i5 >= 26) {
                    f26671a = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", Integer.TYPE);
                } else {
                    f26671a = SubscriptionManager.class.getDeclaredMethod("getSlotId", Integer.TYPE);
                }
                f26671a.setAccessible(true);
            }
            Integer num = (Integer) f26671a.invoke(null, Integer.valueOf(i4));
            if (num != null) {
                return num.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return -1;
    }
}
