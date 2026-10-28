package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.i;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.x1;
import com.google.android.material.animation.h;
import com.google.android.material.animation.j;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import s8.a;

@Deprecated
/* loaded from: classes6.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: l, reason: collision with root package name */
    @q0
    private Map<View, Integer> f54544l;

    public FabTransformationSheetBehavior() {
    }

    private void j0(@o0 View view, boolean z4) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z4) {
                this.f54544l = new HashMap(childCount);
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = coordinatorLayout.getChildAt(i4);
                boolean z5 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z5) {
                    if (z4) {
                        this.f54544l.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        x1.Z1(childAt, 4);
                    } else {
                        Map<View, Integer> map = this.f54544l;
                        if (map != null && map.containsKey(childAt)) {
                            x1.Z1(childAt, this.f54544l.get(childAt).intValue());
                        }
                    }
                }
            }
            if (z4) {
                return;
            }
            this.f54544l = null;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    @i
    protected boolean K(@o0 View view, @o0 View view2, boolean z4, boolean z5) {
        j0(view2, z4);
        return super.K(view, view2, z4, z5);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @o0
    protected FabTransformationBehavior.e h0(Context context, boolean z4) {
        int i4 = z4 ? a.b.f90322t : a.b.f90321s;
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f54533a = h.d(context, i4);
        eVar.f54534b = new j(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
