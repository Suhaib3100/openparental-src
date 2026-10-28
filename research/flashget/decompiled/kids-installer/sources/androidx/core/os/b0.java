package androidx.core.os;

import android.os.UserHandle;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: UserHandleCompat.java */
@x0(17)
/* loaded from: classes.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    @q0
    private static Method f4966a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    private static Constructor<UserHandle> f4967b;

    /* compiled from: UserHandleCompat.java */
    @x0(24)
    private static class a {
        private a() {
        }

        @o0
        static UserHandle a(int i5) {
            return UserHandle.getUserHandleForUid(i5);
        }
    }

    private b0() {
    }

    private static Method a() throws NoSuchMethodException {
        if (f4966a == null) {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("getUserId", Integer.TYPE);
            f4966a = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f4966a;
    }

    private static Constructor<UserHandle> b() throws NoSuchMethodException {
        if (f4967b == null) {
            Constructor<UserHandle> declaredConstructor = UserHandle.class.getDeclaredConstructor(Integer.TYPE);
            f4967b = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return f4967b;
    }

    @o0
    public static UserHandle c(int i5) {
        return a.a(i5);
    }
}
