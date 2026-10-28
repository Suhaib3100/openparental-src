package androidx.core.util;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import java.util.Objects;

/* compiled from: ObjectsCompat.java */
/* loaded from: classes.dex */
public class l {

    /* compiled from: ObjectsCompat.java */
    @x0(19)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static boolean a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        @androidx.annotation.u
        static int b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    private l() {
    }

    public static boolean a(@q0 Object obj, @q0 Object obj2) {
        return a.a(obj, obj2);
    }

    public static int b(@q0 Object... objArr) {
        return a.b(objArr);
    }

    public static int c(@q0 Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    @o0
    public static <T> T d(@q0 T t5) {
        t5.getClass();
        return t5;
    }

    @o0
    public static <T> T e(@q0 T t5, @o0 String str) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(str);
    }

    @q0
    public static String f(@q0 Object obj, @q0 String str) {
        return obj != null ? obj.toString() : str;
    }
}
