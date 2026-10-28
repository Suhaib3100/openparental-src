package androidx.core.graphics;

import android.graphics.Typeface;
import androidx.annotation.c1;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi28Impl.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
@androidx.annotation.x0(28)
/* loaded from: classes3.dex */
public class t2 extends s2 {
    private static final int C = -1;
    private static final String B = "createFromFamiliesWithDefault";
    private static final String D = "sans-serif";

    @Override // androidx.core.graphics.s2
    protected Typeface l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f4803m, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f4809s.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    @Override // androidx.core.graphics.s2
    protected Method x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
