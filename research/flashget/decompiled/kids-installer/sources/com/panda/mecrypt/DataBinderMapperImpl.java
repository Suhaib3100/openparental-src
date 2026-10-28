package com.panda.mecrypt;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class DataBinderMapperImpl extends androidx.databinding.k {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseIntArray f21464a = new SparseIntArray(0);

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final SparseArray<String> f21465a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f21465a = sparseArray;
            sparseArray.put(0, ProtectedSandApp.s("㗈"));
        }

        private a() {
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        static final HashMap<String, Integer> f21466a = new HashMap<>(0);

        private b() {
        }
    }

    @Override // androidx.databinding.k
    public List<androidx.databinding.k> a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.k
    public String b(int i5) {
        return a.f21465a.get(i5);
    }

    @Override // androidx.databinding.k
    public ViewDataBinding c(androidx.databinding.l lVar, View view, int i5) {
        if (f21464a.get(i5) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException(ProtectedSandApp.s("㗉"));
    }

    @Override // androidx.databinding.k
    public ViewDataBinding d(androidx.databinding.l lVar, View[] viewArr, int i5) {
        if (viewArr == null || viewArr.length == 0 || f21464a.get(i5) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException(ProtectedSandApp.s("㗊"));
    }

    @Override // androidx.databinding.k
    public int e(String str) {
        Integer num;
        if (str == null || (num = b.f21466a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
