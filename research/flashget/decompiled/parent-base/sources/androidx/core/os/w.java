package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.x0;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ParcelCompat.java */
/* loaded from: classes3.dex */
public final class w {

    /* compiled from: ParcelCompat.java */
    @x0(29)
    static class a {
        private a() {
        }

        static <T extends Parcelable> List<T> a(@androidx.annotation.o0 Parcel parcel, @androidx.annotation.o0 List<T> list, @androidx.annotation.q0 ClassLoader classLoader) {
            return parcel.readParcelableList(list, classLoader);
        }

        static void b(@androidx.annotation.o0 Parcel parcel, boolean z4) {
            parcel.writeBoolean(z4);
        }
    }

    /* compiled from: ParcelCompat.java */
    @x0(30)
    static class b {
        private b() {
        }

        static Parcelable.Creator<?> a(@androidx.annotation.o0 Parcel parcel, @androidx.annotation.q0 ClassLoader classLoader) {
            return parcel.readParcelableCreator(classLoader);
        }
    }

    /* compiled from: ParcelCompat.java */
    @x0(33)
    static class c {
        private c() {
        }

        static <T> T[] a(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            return (T[]) parcel.readArray(classLoader, cls);
        }

        static <T> ArrayList<T> b(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            return parcel.readArrayList(classLoader, cls);
        }

        static <V, K> HashMap<K, V> c(Parcel parcel, ClassLoader classLoader, Class<? extends K> cls, Class<? extends V> cls2) {
            return parcel.readHashMap(classLoader, cls, cls2);
        }

        static <T> void d(@androidx.annotation.o0 Parcel parcel, @androidx.annotation.o0 List<? super T> list, @androidx.annotation.q0 ClassLoader classLoader, @androidx.annotation.o0 Class<T> cls) {
            parcel.readList(list, classLoader, cls);
        }

        static <K, V> void e(Parcel parcel, Map<? super K, ? super V> map, ClassLoader classLoader, Class<K> cls, Class<V> cls2) {
            parcel.readMap(map, classLoader, cls, cls2);
        }

        static <T extends Parcelable> T f(@androidx.annotation.o0 Parcel parcel, @androidx.annotation.q0 ClassLoader classLoader, @androidx.annotation.o0 Class<T> cls) {
            return (T) parcel.readParcelable(classLoader, cls);
        }

        static <T> T[] g(@androidx.annotation.o0 Parcel parcel, @androidx.annotation.q0 ClassLoader classLoader, @androidx.annotation.o0 Class<T> cls) {
            return (T[]) parcel.readParcelableArray(classLoader, cls);
        }

        static <T> Parcelable.Creator<T> h(Parcel parcel, ClassLoader classLoader, Class<T> cls) {
            return parcel.readParcelableCreator(classLoader, cls);
        }

        static <T> List<T> i(@androidx.annotation.o0 Parcel parcel, @androidx.annotation.o0 List<T> list, @androidx.annotation.q0 ClassLoader classLoader, @androidx.annotation.o0 Class<T> cls) {
            return parcel.readParcelableList(list, classLoader, cls);
        }

        static <T extends Serializable> T j(@androidx.annotation.o0 Parcel parcel, @androidx.annotation.q0 ClassLoader classLoader, @androidx.annotation.o0 Class<T> cls) {
            return (T) parcel.readSerializable(classLoader, cls);
        }

        static <T> SparseArray<T> k(Parcel parcel, ClassLoader classLoader, Class<? extends T> cls) {
            return parcel.readSparseArray(classLoader, cls);
        }
    }

    private w() {
    }

    @androidx.annotation.q0
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    public static <T> Object[] a(@androidx.annotation.o0 Parcel parcel, @androidx.annotation.q0 ClassLoader classLoader, @androidx.annotation.o0 Class<T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? c.a(parcel, classLoader, cls) : parcel.readArray(classLoader);
    }

    @androidx.annotation.q0
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    public static <T> ArrayList<T> b(@androidx.annotation.o0 Parcel parcel, @androidx.annotation.q0 ClassLoader classLoader, @androidx.annotation.o0 Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? c.b(parcel, classLoader, cls) : parcel.readArrayList(classLoader);
    }

    public static boolean c(@androidx.annotation.o0 Parcel parcel) {
        return parcel.readInt() != 0;
    }

    @androidx.annotation.q0
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    public static <K, V> HashMap<K, V> d(@androidx.annotation.o0 Parcel parcel, @androidx.annotation.q0 ClassLoader classLoader, @androidx.annotation.o0 Class<? extends K> cls, @androidx.annotation.o0 Class<? extends V> cls2) {
        return Build.VERSION.SDK_INT >= 34 ? c.c(parcel, classLoader, cls, cls2) : parcel.readHashMap(classLoader);
    }

    public static <T> void e(@androidx.annotation.o0 Parcel parcel, @androidx.annotation.o0 List<? super T> list, @androidx.annotation.q0 ClassLoader classLoader, @androidx.annotation.o0 Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.d(parcel, list, classLoader, cls);
        } else {
            parcel.readList(list, classLoader);
        }
    }

    public static <K, V> void f(@androidx.annotation.o0 Parcel parcel, @androidx.annotation.o0 Map<? super K, ? super V> map, @androidx.annotation.q0 ClassLoader classLoader, @androidx.annotation.o0 Class<K> cls, @androidx.annotation.o0 Class<V> cls2) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.e(parcel, map, classLoader, cls, cls2);
        } else {
            parcel.readMap(map, classLoader);
        }
    }

    @androidx.annotation.q0
    public static <T extends Parcelable> T g(@androidx.annotation.o0 Parcel parcel, @androidx.annotation.q0 ClassLoader classLoader, @androidx.annotation.o0 Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) c.f(parcel, classLoader, cls);
        }
        T t4 = (T) parcel.readParcelable(classLoader);
        if (t4 == null || cls.isInstance(t4)) {
            return t4;
        }
        throw new BadParcelableException("Parcelable " + t4.getClass() + " is not a subclass of required class " + cls.getName() + " provided in the parameter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.annotation.q0
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    @Deprecated
    public static <T> T[] h(@androidx.annotation.o0 Parcel parcel, @androidx.annotation.q0 ClassLoader classLoader, @androidx.annotation.o0 Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T[]) c.g(parcel, classLoader, cls);
        }
        T[] tArr = (T[]) parcel.readParcelableArray(classLoader);
        if (cls.isAssignableFrom(Parcelable.class)) {
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, tArr.length));
        for (int i4 = 0; i4 < tArr.length; i4++) {
            try {
                tArr2[i4] = cls.cast(tArr[i4]);
            } catch (ClassCastException unused) {
                StringBuilder a5 = androidx.collection.s.a("Parcelable at index ", i4, " is not a subclass of required class ");
                a5.append(cls.getName());
                a5.append(" provided in the parameter");
                throw new BadParcelableException(a5.toString());
            }
        }
        return tArr2;
    }

    @androidx.annotation.q0
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    public static <T> Parcelable[] i(@androidx.annotation.o0 Parcel parcel, @androidx.annotation.q0 ClassLoader classLoader, @androidx.annotation.o0 Class<T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) c.g(parcel, classLoader, cls) : parcel.readParcelableArray(classLoader);
    }

    @androidx.annotation.q0
    @x0(30)
    public static <T> Parcelable.Creator<T> j(@androidx.annotation.o0 Parcel parcel, @androidx.annotation.q0 ClassLoader classLoader, @androidx.annotation.o0 Class<T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? c.h(parcel, classLoader, cls) : (Parcelable.Creator<T>) b.a(parcel, classLoader);
    }

    @androidx.annotation.o0
    @x0(api = 29)
    public static <T> List<T> k(@androidx.annotation.o0 Parcel parcel, @androidx.annotation.o0 List<T> list, @androidx.annotation.q0 ClassLoader classLoader, @androidx.annotation.o0 Class<T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? c.i(parcel, list, classLoader, cls) : a.a(parcel, list, classLoader);
    }

    @androidx.annotation.q0
    public static <T extends Serializable> T l(@androidx.annotation.o0 Parcel parcel, @androidx.annotation.q0 ClassLoader classLoader, @androidx.annotation.o0 Class<T> cls) {
        return Build.VERSION.SDK_INT >= 33 ? (T) c.j(parcel, classLoader, cls) : (T) parcel.readSerializable();
    }

    @androidx.annotation.q0
    public static <T> SparseArray<T> m(@androidx.annotation.o0 Parcel parcel, @androidx.annotation.q0 ClassLoader classLoader, @androidx.annotation.o0 Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? c.k(parcel, classLoader, cls) : parcel.readSparseArray(classLoader);
    }

    public static void n(@androidx.annotation.o0 Parcel parcel, boolean z4) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(parcel, z4);
        } else {
            parcel.writeInt(z4 ? 1 : 0);
        }
    }
}
