package androidx.core.graphics;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.c1;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi28Impl.java */
@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
@androidx.annotation.x0(28)
/* loaded from: classes3.dex */
public class z0 extends y0 {
    private static final int C = -1;
    private static final String B = "createFromFamiliesWithDefault";
    private static final String D = "sans-serif";

    @Override // androidx.core.graphics.y0
    protected Method C(Class<?> cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // androidx.core.graphics.y0, androidx.core.graphics.w0, androidx.core.graphics.b1
    @androidx.annotation.o0
    Typeface h(@androidx.annotation.o0 Context context, @androidx.annotation.o0 Typeface typeface, int i4, boolean z4) {
        return Typeface.create(typeface, i4, z4);
    }

    @Override // androidx.core.graphics.y0
    protected Typeface q(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f26312m, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f26318s.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }
}
