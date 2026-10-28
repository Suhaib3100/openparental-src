package androidx.core.os;

import android.os.UserHandle;
import androidx.annotation.x0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: UserHandleCompat.java */
/* loaded from: classes3.dex */
public class r0 {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.q0
    private static Method f26552a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.q0
    private static Constructor<UserHandle> f26553b;

    /* compiled from: UserHandleCompat.java */
    @x0(24)
    private static class a {
        private a() {
        }

        @androidx.annotation.o0
        static UserHandle a(int i4) {
            return UserHandle.getUserHandleForUid(i4);
        }
    }

    private r0() {
    }

    private static Method a() throws NoSuchMethodException {
        if (f26552a == null) {
            Method declaredMethod = UserHandle.class.getDeclaredMethod("getUserId", Integer.TYPE);
            f26552a = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f26552a;
    }

    private static Constructor<UserHandle> b() throws NoSuchMethodException {
        if (f26553b == null) {
            Constructor<UserHandle> declaredConstructor = UserHandle.class.getDeclaredConstructor(Integer.TYPE);
            f26553b = declaredConstructor;
            declaredConstructor.setAccessible(true);
        }
        return f26553b;
    }

    @androidx.annotation.o0
    public static UserHandle c(int i4) {
        return a.a(i4);
    }
}
