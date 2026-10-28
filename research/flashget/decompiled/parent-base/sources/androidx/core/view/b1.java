package androidx.core.view;

import android.view.View;

/* compiled from: NestedScrollingParent.java */
/* loaded from: classes3.dex */
public interface b1 {
    int getNestedScrollAxes();

    boolean onNestedFling(@androidx.annotation.o0 View view, float f4, float f5, boolean z4);

    boolean onNestedPreFling(@androidx.annotation.o0 View view, float f4, float f5);

    void onNestedPreScroll(@androidx.annotation.o0 View view, int i4, int i5, @androidx.annotation.o0 int[] iArr);

    void onNestedScroll(@androidx.annotation.o0 View view, int i4, int i5, int i6, int i7);

    void onNestedScrollAccepted(@androidx.annotation.o0 View view, @androidx.annotation.o0 View view2, int i4);

    boolean onStartNestedScroll(@androidx.annotation.o0 View view, @androidx.annotation.o0 View view2, int i4);

    void onStopNestedScroll(@androidx.annotation.o0 View view);
}
