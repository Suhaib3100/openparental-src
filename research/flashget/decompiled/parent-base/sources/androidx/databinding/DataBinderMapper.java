package androidx.databinding;

import android.view.View;
import androidx.annotation.c1;
import androidx.annotation.o0;
import java.util.Collections;
import java.util.List;

@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public abstract class DataBinderMapper {
    @o0
    public List<DataBinderMapper> collectDependencies() {
        return Collections.emptyList();
    }

    public abstract String convertBrIdToString(int i4);

    public abstract ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i4);

    public abstract ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i4);

    public abstract int getLayoutId(String str);
}
