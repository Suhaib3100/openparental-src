package com.kizitonwose.calendar.view.internal;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: DayHolder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "day", "Lorg/threeten/bp/g;", "c", "(Ljava/lang/Object;)Lorg/threeten/bp/g;", "Landroid/view/ViewGroup$LayoutParams;", "layoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "a", "(Landroid/view/ViewGroup$LayoutParams;)Landroid/widget/LinearLayout$LayoutParams;", "Calendar-View_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class k {
    @fg.l
    public static final LinearLayout.LayoutParams a(@fg.l ViewGroup.LayoutParams layoutParams) {
        l0.p(layoutParams, ProtectedSandApp.s("ᓺ\u0001"));
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LinearLayout.LayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final org.threeten.bp.g c(Object obj) {
        if (obj instanceof cb.a) {
            return ((cb.a) obj).e();
        }
        if (obj instanceof cb.i) {
            return ((cb.i) obj).e();
        }
        throw new IllegalArgumentException(androidx.databinding.a.a(ProtectedSandApp.s("ᓻ\u0001"), obj));
    }
}
