package com.chad.library;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class DataBinderMapperImpl extends DataBinderMapper {

    /* renamed from: a, reason: collision with root package name */
    private static final SparseIntArray f46702a = new SparseIntArray(0);

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final SparseArray<String> f46703a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f46703a = sparseArray;
            sparseArray.put(0, ProtectedSandApp.s("ฮ"));
        }

        private a() {
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        static final HashMap<String, Integer> f46704a = new HashMap<>(0);

        private b() {
        }
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i4) {
        return a.f46703a.get(i4);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i4) {
        if (f46702a.get(i4) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException(ProtectedSandApp.s("ฯ"));
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = b.f46704a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i4) {
        if (viewArr == null || viewArr.length == 0 || f46702a.get(i4) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException(ProtectedSandApp.s("ฯ"));
    }
}
