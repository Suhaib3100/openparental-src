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
/* loaded from: classes.dex */
final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final ViewGroup.MarginLayoutParams f10483b;

    /* renamed from: a, reason: collision with root package name */
    private LinearLayoutManager f10484a;

    /* compiled from: AnimateLayoutChangeDetector.java */
    /* renamed from: androidx.viewpager2.widget.a$a, reason: collision with other inner class name */
    class C0125a implements Comparator<int[]> {
        C0125a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f10483b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    a(@o0 LinearLayoutManager linearLayoutManager) {
        this.f10484a = linearLayoutManager;
    }

    private boolean a() {
        int top;
        int i5;
        int bottom;
        int i6;
        int Q = this.f10484a.Q();
        if (Q == 0) {
            return true;
        }
        boolean z5 = this.f10484a.M2() == 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, Q, 2);
        for (int i7 = 0; i7 < Q; i7++) {
            View P = this.f10484a.P(i7);
            if (P == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = P.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f10483b;
            int[] iArr2 = iArr[i7];
            if (z5) {
                top = P.getLeft();
                i5 = marginLayoutParams.leftMargin;
            } else {
                top = P.getTop();
                i5 = marginLayoutParams.topMargin;
            }
            iArr2[0] = top - i5;
            int[] iArr3 = iArr[i7];
            if (z5) {
                bottom = P.getRight();
                i6 = marginLayoutParams.rightMargin;
            } else {
                bottom = P.getBottom();
                i6 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i6;
        }
        Arrays.sort(iArr, new C0125a());
        for (int i8 = 1; i8 < Q; i8++) {
            if (iArr[i8 - 1][1] != iArr[i8][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i9 = iArr4[1];
        int i10 = iArr4[0];
        return i10 <= 0 && iArr[Q - 1][1] >= i9 - i10;
    }

    private boolean b() {
        int Q = this.f10484a.Q();
        for (int i5 = 0; i5 < Q; i5++) {
            if (c(this.f10484a.P(i5))) {
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
            for (int i5 = 0; i5 < childCount; i5++) {
                if (c(viewGroup.getChildAt(i5))) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean d() {
        return (!a() || this.f10484a.Q() <= 1) && b();
    }
}
