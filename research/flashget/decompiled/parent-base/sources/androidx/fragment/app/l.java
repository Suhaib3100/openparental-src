package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* compiled from: FragmentContainer.java */
/* loaded from: classes3.dex */
public abstract class l {
    @androidx.annotation.o0
    @Deprecated
    public Fragment b(@androidx.annotation.o0 Context context, @androidx.annotation.o0 String str, @androidx.annotation.q0 Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    @androidx.annotation.q0
    public abstract View c(@androidx.annotation.d0 int i4);

    public abstract boolean d();
}
