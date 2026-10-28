package androidx.databinding;

import android.view.View;
import androidx.annotation.c1;
import androidx.annotation.o0;
import java.util.Collections;
import java.util.List;

/* compiled from: DataBinderMapper.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes.dex */
public abstract class k {
    @o0
    public List<k> a() {
        return Collections.emptyList();
    }

    public abstract String b(int i5);

    public abstract ViewDataBinding c(l lVar, View view, int i5);

    public abstract ViewDataBinding d(l lVar, View[] viewArr, int i5);

    public abstract int e(String str);
}
