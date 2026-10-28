package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: AnimateLayoutChangeDetector.java */
/* loaded from: classes3.dex */
final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final ViewGroup.MarginLayoutParams f35646b;

    /* renamed from: a, reason: collision with root package name */
    private LinearLayoutManager f35647a;

    /* compiled from: AnimateLayoutChangeDetector.java */
    /* renamed from: androidx.viewpager2.widget.a$a, reason: collision with other inner class name */
    class C0635a implements Comparator<int[]> {
        C0635a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f35646b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    a(@o0 LinearLayoutManager linearLayoutManager) {
        this.f35647a = linearLayoutManager;
    }

    private boolean a() {
        int top2;
        int i4;
        int bottom;
        int i5;
        int childCount = this.f35647a.getChildCount();
        if (childCount == 0) {
            return true;
        }
        boolean z4 = this.f35647a.getOrientation() == 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, childCount, 2);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = this.f35647a.getChildAt(i6);
            if (childAt == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f35646b;
            int[] iArr2 = iArr[i6];
            if (z4) {
                top2 = childAt.getLeft();
                i4 = marginLayoutParams.leftMargin;
            } else {
                top2 = childAt.getTop();
                i4 = marginLayoutParams.topMargin;
            }
            iArr2[0] = top2 - i4;
            int[] iArr3 = iArr[i6];
            if (z4) {
                bottom = childAt.getRight();
                i5 = marginLayoutParams.rightMargin;
            } else {
                bottom = childAt.getBottom();
                i5 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i5;
        }
        Arrays.sort(iArr, new C0635a());
        for (int i7 = 1; i7 < childCount; i7++) {
            if (iArr[i7 - 1][1] != iArr[i7][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i10 = iArr4[1];
        int i11 = iArr4[0];
        return i11 <= 0 && iArr[childCount - 1][1] >= i10 - i11;
    }

    private boolean b() {
        int childCount = this.f35647a.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (c(this.f35647a.getChildAt(i4))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                if (c(viewGroup.getChildAt(i4))) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean d() {
        return (!a() || this.f35647a.getChildCount() <= 1) && b();
    }
}
