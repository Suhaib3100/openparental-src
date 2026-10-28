package androidx.core.view;

import android.view.View;

/* compiled from: NestedScrollingParent.java */
/* loaded from: classes.dex */
public interface m1 {
    int getNestedScrollAxes();

    boolean onNestedFling(@androidx.annotation.o0 View view, float f6, float f7, boolean z5);

    boolean onNestedPreFling(@androidx.annotation.o0 View view, float f6, float f7);

    void onNestedPreScroll(@androidx.annotation.o0 View view, int i5, int i6, @androidx.annotation.o0 int[] iArr);

    void onNestedScroll(@androidx.annotation.o0 View view, int i5, int i6, int i7, int i8);

    void onNestedScrollAccepted(@androidx.annotation.o0 View view, @androidx.annotation.o0 View view2, int i5);

    boolean onStartNestedScroll(@androidx.annotation.o0 View view, @androidx.annotation.o0 View view2, int i5);

    void onStopNestedScroll(@androidx.annotation.o0 View view);
}
