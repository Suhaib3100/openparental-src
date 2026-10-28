package org.mp4parser.aspectj.runtime.internal;

import com.google.firebase.remoteconfig.p;

/* compiled from: Conversions.java */
/* loaded from: classes9.dex */
public final class e {
    private e() {
    }

    public static Object a(boolean z4) {
        return new Boolean(z4);
    }

    public static boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        throw new ClassCastException(obj.getClass().getName().concat(" can not be converted to boolean"));
    }

    public static Object c(byte b5) {
        return new Byte(b5);
    }

    public static byte d(Object obj) {
        if (obj == null) {
            return (byte) 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).byteValue();
        }
        throw new ClassCastException(obj.getClass().getName().concat(" can not be converted to byte"));
    }

    public static Object e(char c5) {
        return new Character(c5);
    }

    public static char f(Object obj) {
        if (obj == null) {
            return (char) 0;
        }
        if (obj instanceof Character) {
            return ((Character) obj).charValue();
        }
        throw new ClassCastException(obj.getClass().getName().concat(" can not be converted to char"));
    }

    public static Object g(double d5) {
        return new Double(d5);
    }

    public static double h(Object obj) {
        if (obj == null) {
            return p.f60679p;
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        throw new ClassCastException(obj.getClass().getName().concat(" can not be converted to double"));
    }

    public static Object i(float f4) {
        return new Float(f4);
    }

    public static float j(Object obj) {
        if (obj == null) {
            return 0.0f;
        }
        if (obj instanceof Number) {
            return ((Number) obj).floatValue();
        }
        throw new ClassCastException(obj.getClass().getName().concat(" can not be converted to float"));
    }

    public static Object k(int i4) {
        return new Integer(i4);
    }

    public static int l(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        throw new ClassCastException(obj.getClass().getName().concat(" can not be converted to int"));
    }

    public static Object m(long j4) {
        return new Long(j4);
    }

    public static long n(Object obj) {
        if (obj == null) {
            return 0L;
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        throw new ClassCastException(obj.getClass().getName().concat(" can not be converted to long"));
    }

    public static Object o(short s4) {
        return new Short(s4);
    }

    public static short p(Object obj) {
        if (obj == null) {
            return (short) 0;
        }
        if (obj instanceof Number) {
            return ((Number) obj).shortValue();
        }
        throw new ClassCastException(obj.getClass().getName().concat(" can not be converted to short"));
    }

    public static Object q() {
        return null;
    }

    public static Object r(Object obj) {
        return obj;
    }
}
