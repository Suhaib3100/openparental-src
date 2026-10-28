package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.w0;
import androidx.annotation.x0;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: BundleCompat.java */
/* loaded from: classes3.dex */
public final class d {

    /* compiled from: BundleCompat.java */
    @x0(33)
    static class a {
        private a() {
        }

        static <T> T a(@androidx.annotation.o0 Bundle bundle, @androidx.annotation.q0 String str, @androidx.annotation.o0 Class<T> cls) {
            return (T) bundle.getParcelable(str, cls);
        }

        static <T> T[] b(@androidx.annotation.o0 Bundle bundle, @androidx.annotation.q0 String str, @androidx.annotation.o0 Class<T> cls) {
            return (T[]) bundle.getParcelableArray(str, cls);
        }

        static <T> ArrayList<T> c(@androidx.annotation.o0 Bundle bundle, @androidx.annotation.q0 String str, @androidx.annotation.o0 Class<? extends T> cls) {
            return bundle.getParcelableArrayList(str, cls);
        }

        static <T extends Serializable> T d(@androidx.annotation.o0 Bundle bundle, @androidx.annotation.q0 String str, @androidx.annotation.o0 Class<T> cls) {
            return (T) bundle.getSerializable(str, cls);
        }

        static <T> SparseArray<T> e(@androidx.annotation.o0 Bundle bundle, @androidx.annotation.q0 String str, @androidx.annotation.o0 Class<? extends T> cls) {
            return bundle.getSparseParcelableArray(str, cls);
        }
    }

    private d() {
    }

    @androidx.annotation.q0
    @w0(expression = "bundle.getBinder(key)")
    @Deprecated
    public static IBinder a(@androidx.annotation.o0 Bundle bundle, @androidx.annotation.q0 String str) {
        return bundle.getBinder(str);
    }

    @androidx.annotation.q0
    public static <T> T b(@androidx.annotation.o0 Bundle bundle, @androidx.annotation.q0 String str, @androidx.annotation.o0 Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.a(bundle, str, cls);
        }
        T t4 = (T) bundle.getParcelable(str);
        if (cls.isInstance(t4)) {
            return t4;
        }
        return null;
    }

    @androidx.annotation.q0
    @SuppressLint({"ArrayReturn", "NullableCollection"})
    public static Parcelable[] c(@androidx.annotation.o0 Bundle bundle, @androidx.annotation.q0 String str, @androidx.annotation.o0 Class<? extends Parcelable> cls) {
        return Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) a.b(bundle, str, cls) : bundle.getParcelableArray(str);
    }

    @androidx.annotation.q0
    @SuppressLint({"ConcreteCollection", "NullableCollection"})
    public static <T> ArrayList<T> d(@androidx.annotation.o0 Bundle bundle, @androidx.annotation.q0 String str, @androidx.annotation.o0 Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? a.c(bundle, str, cls) : bundle.getParcelableArrayList(str);
    }

    @androidx.annotation.q0
    public static <T extends Serializable> T e(@androidx.annotation.o0 Bundle bundle, @androidx.annotation.q0 String str, @androidx.annotation.o0 Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) a.d(bundle, str, cls);
        }
        T t4 = (T) bundle.getSerializable(str);
        if (cls.isInstance(t4)) {
            return t4;
        }
        return null;
    }

    @androidx.annotation.q0
    public static <T> SparseArray<T> f(@androidx.annotation.o0 Bundle bundle, @androidx.annotation.q0 String str, @androidx.annotation.o0 Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? a.e(bundle, str, cls) : bundle.getSparseParcelableArray(str);
    }

    @w0(expression = "bundle.putBinder(key, binder)")
    @Deprecated
    public static void g(@androidx.annotation.o0 Bundle bundle, @androidx.annotation.q0 String str, @androidx.annotation.q0 IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
