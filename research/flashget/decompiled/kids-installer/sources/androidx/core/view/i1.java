package androidx.core.view;

/* compiled from: NestedScrollingChild.java */
/* loaded from: classes.dex */
public interface i1 {
    boolean dispatchNestedFling(float f6, float f7, boolean z5);

    boolean dispatchNestedPreFling(float f6, float f7);

    boolean dispatchNestedPreScroll(int i5, int i6, @androidx.annotation.q0 int[] iArr, @androidx.annotation.q0 int[] iArr2);

    boolean dispatchNestedScroll(int i5, int i6, int i7, int i8, @androidx.annotation.q0 int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z5);

    boolean startNestedScroll(int i5);

    void stopNestedScroll();
}
