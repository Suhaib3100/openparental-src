package androidx.databinding.adapters;

import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class ListenerUtil {
    private static final SparseArray<WeakHashMap<View, WeakReference<?>>> sListeners = new SparseArray<>();

    public static <T> T getListener(View view, int i4) {
        return (T) view.getTag(i4);
    }

    public static <T> T trackListener(View view, T t4, int i4) {
        T t5 = (T) view.getTag(i4);
        view.setTag(i4, t4);
        return t5;
    }
}
