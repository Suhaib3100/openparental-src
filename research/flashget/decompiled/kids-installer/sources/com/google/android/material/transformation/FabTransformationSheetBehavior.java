package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.i;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.y1;
import com.google.android.material.animation.h;
import com.google.android.material.animation.j;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import n1.a;

@Deprecated
/* loaded from: classes4.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: l, reason: collision with root package name */
    @q0
    private Map<View, Integer> f14705l;

    public FabTransformationSheetBehavior() {
    }

    private void j0(@o0 View view, boolean z5) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z5) {
                this.f14705l = new HashMap(childCount);
            }
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = coordinatorLayout.getChildAt(i5);
                boolean z6 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z6) {
                    if (z5) {
                        this.f14705l.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        y1.R1(childAt, 4);
                    } else {
                        Map<View, Integer> map = this.f14705l;
                        if (map != null && map.containsKey(childAt)) {
                            y1.R1(childAt, this.f14705l.get(childAt).intValue());
                        }
                    }
                }
            }
            if (z5) {
                return;
            }
            this.f14705l = null;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    @i
    protected boolean K(@o0 View view, @o0 View view2, boolean z5, boolean z6) {
        j0(view2, z5);
        return super.K(view, view2, z5, z6);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    @o0
    protected FabTransformationBehavior.e h0(Context context, boolean z5) {
        int i5 = z5 ? a.b.f29167t : a.b.f29166s;
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f14694a = h.d(context, i5);
        eVar.f14695b = new j(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
