package androidx.databinding.library.baseAdapters;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.k;
import androidx.databinding.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends k {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseIntArray f6127a = new SparseIntArray(0);

    /* loaded from: classes.dex */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final SparseArray<String> f6128a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f6128a = sparseArray;
            sparseArray.put(0, "_all");
        }

        private a() {
        }
    }

    /* loaded from: classes.dex */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        static final HashMap<String, Integer> f6129a = new HashMap<>(0);

        private b() {
        }
    }

    @Override // androidx.databinding.k
    public List<k> a() {
        return new ArrayList(0);
    }

    @Override // androidx.databinding.k
    public String b(int i5) {
        return a.f6128a.get(i5);
    }

    @Override // androidx.databinding.k
    public ViewDataBinding c(l lVar, View view, int i5) {
        if (f6127a.get(i5) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.k
    public ViewDataBinding d(l lVar, View[] viewArr, int i5) {
        if (viewArr == null || viewArr.length == 0 || f6127a.get(i5) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.k
    public int e(String str) {
        Integer num;
        if (str == null || (num = b.f6129a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
