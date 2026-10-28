package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.q0;

/* compiled from: FragmentContainer.java */
/* loaded from: classes.dex */
public abstract class j {
    @androidx.annotation.o0
    @Deprecated
    public Fragment c(@androidx.annotation.o0 Context context, @androidx.annotation.o0 String str, @q0 Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    @q0
    public abstract View d(@androidx.annotation.d0 int i5);

    public abstract boolean f();
}
