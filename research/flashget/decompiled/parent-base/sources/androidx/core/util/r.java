package androidx.core.util;

import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.Objects;

/* compiled from: ObjectsCompat.java */
/* loaded from: classes3.dex */
public class r {
    private r() {
    }

    public static boolean a(@q0 Object obj, @q0 Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int b(@q0 Object... objArr) {
        return Objects.hash(objArr);
    }

    public static int c(@q0 Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @o0
    public static <T> T d(@q0 T t4) {
        t4.getClass();
        return t4;
    }

    @o0
    public static <T> T e(@q0 T t4, @o0 String str) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(str);
    }

    @q0
    public static String f(@q0 Object obj, @q0 String str) {
        return obj != null ? obj.toString() : str;
    }
}
