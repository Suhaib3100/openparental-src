package com.chad.library.adapter.base.util;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.j0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: AdapterUtils.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"getItemView", "Landroid/view/View;", "Landroid/view/ViewGroup;", "layoutResId", "", "com.github.CymChad.brvah"}, k = 2, mv = {1, 1, 16})
/* loaded from: classes3.dex */
public final class AdapterUtilsKt {
    @l
    public static final View getItemView(@l ViewGroup viewGroup, @j0 int i4) {
        l0.q(viewGroup, ProtectedSandApp.s("༊"));
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i4, viewGroup, false);
        l0.h(inflate, ProtectedSandApp.s("་"));
        return inflate;
    }
}
