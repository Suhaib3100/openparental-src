package androidx.core.view;

/* compiled from: NestedScrollingChild.java */
/* loaded from: classes3.dex */
public interface x0 {
    boolean dispatchNestedFling(float f4, float f5, boolean z4);

    boolean dispatchNestedPreFling(float f4, float f5);

    boolean dispatchNestedPreScroll(int i4, int i5, @androidx.annotation.q0 int[] iArr, @androidx.annotation.q0 int[] iArr2);

    boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, @androidx.annotation.q0 int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z4);

    boolean startNestedScroll(int i4);

    void stopNestedScroll();
}
