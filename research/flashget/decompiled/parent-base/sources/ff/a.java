package ff;

import androidx.compose.ui.graphics.vector.j;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.StringJoiner;

/* compiled from: ConversionCategory.java */
/* loaded from: classes3.dex */
public enum a {
    GENERAL("bBhHsS", null),
    CHAR("cC", Character.class, Byte.class, Short.class, Integer.class),
    INT("doxX", Byte.class, Short.class, Integer.class, Long.class, BigInteger.class),
    FLOAT("eEfgGaA", Float.class, Double.class, BigDecimal.class),
    TIME("tT", Long.class, Calendar.class, Date.class),
    CHAR_AND_INT(null, Byte.class, Short.class, Integer.class),
    INT_AND_TIME(null, Long.class),
    NULL(null, new Class[0]),
    UNUSED(null, null);

    public final String chars;
    public final Class<?>[] types;

    a(String str, Class... clsArr) {
        this.chars = str;
        if (clsArr == null) {
            this.types = clsArr;
            return;
        }
        ArrayList arrayList = new ArrayList(clsArr.length);
        for (Class cls : clsArr) {
            arrayList.add(cls);
            Class<? extends Object> unwrapPrimitive = unwrapPrimitive(cls);
            if (unwrapPrimitive != null) {
                arrayList.add(unwrapPrimitive);
            }
        }
        this.types = (Class[]) arrayList.toArray(new Class[arrayList.size()]);
    }

    private static <E> Set<E> arrayToSet(E[] eArr) {
        return new HashSet(Arrays.asList(eArr));
    }

    public static a fromConversionChar(char c5) {
        a[] aVarArr = {GENERAL, CHAR, INT, FLOAT, TIME};
        for (int i4 = 0; i4 < 5; i4++) {
            a aVar = aVarArr[i4];
            if (aVar.chars.contains(String.valueOf(c5))) {
                return aVar;
            }
        }
        throw new IllegalArgumentException(j.a("Bad conversion character ", c5));
    }

    public static a intersect(a aVar, a aVar2) {
        a aVar3 = UNUSED;
        if (aVar == aVar3) {
            return aVar2;
        }
        if (aVar2 == aVar3) {
            return aVar;
        }
        a aVar4 = GENERAL;
        if (aVar == aVar4) {
            return aVar2;
        }
        if (aVar2 == aVar4) {
            return aVar;
        }
        Set arrayToSet = arrayToSet(aVar.types);
        arrayToSet.retainAll(arrayToSet(aVar2.types));
        a[] aVarArr = {CHAR, INT, FLOAT, TIME, CHAR_AND_INT, INT_AND_TIME, NULL};
        for (int i4 = 0; i4 < 7; i4++) {
            a aVar5 = aVarArr[i4];
            if (arrayToSet(aVar5.types).equals(arrayToSet)) {
                return aVar5;
            }
        }
        throw new RuntimeException();
    }

    public static boolean isSubsetOf(a aVar, a aVar2) {
        return intersect(aVar, aVar2) == aVar;
    }

    public static a union(a aVar, a aVar2) {
        a aVar3;
        a aVar4 = UNUSED;
        if (aVar == aVar4 || aVar2 == aVar4 || aVar == (aVar4 = GENERAL) || aVar2 == aVar4) {
            return aVar4;
        }
        a aVar5 = CHAR_AND_INT;
        if ((aVar == aVar5 && aVar2 == INT_AND_TIME) || (aVar == (aVar3 = INT_AND_TIME) && aVar2 == aVar5)) {
            return INT;
        }
        Set arrayToSet = arrayToSet(aVar.types);
        arrayToSet.addAll(arrayToSet(aVar2.types));
        a[] aVarArr = {NULL, aVar5, aVar3, CHAR, INT, FLOAT, TIME};
        for (int i4 = 0; i4 < 7; i4++) {
            a aVar6 = aVarArr[i4];
            if (arrayToSet(aVar6.types).equals(arrayToSet)) {
                return aVar6;
            }
        }
        return GENERAL;
    }

    private static Class<? extends Object> unwrapPrimitive(Class<?> cls) {
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        return null;
    }

    public boolean isAssignableFrom(Class<?> cls) {
        Class<?>[] clsArr = this.types;
        if (clsArr == null || cls == Void.TYPE) {
            return true;
        }
        for (Class<?> cls2 : clsArr) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    @bg.b
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name());
        sb.append(" conversion category");
        Class<?>[] clsArr = this.types;
        if (clsArr == null || clsArr.length == 0) {
            return sb.toString();
        }
        StringJoiner stringJoiner = new StringJoiner(", ", "(one of: ", ")");
        for (Class<?> cls : this.types) {
            stringJoiner.add(cls.getSimpleName());
        }
        sb.append(" ");
        sb.append(stringJoiner);
        return sb.toString();
    }
}
