package androidx.databinding.adapters;

import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: ListenerUtil.java */
/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseArray<WeakHashMap<View, WeakReference<?>>> f6073a = new SparseArray<>();

    public static <T> T a(View view, int i5) {
        return (T) view.getTag(i5);
    }

    public static <T> T b(View view, T t5, int i5) {
        T t6 = (T) view.getTag(i5);
        view.setTag(i5, t5);
        return t6;
    }
}
