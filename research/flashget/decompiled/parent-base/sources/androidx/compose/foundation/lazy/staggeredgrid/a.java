package androidx.compose.foundation.lazy.staggeredgrid;

import java.util.Arrays;
import kotlin.Metadata;
import kotlinx.coroutines.r0;

/* compiled from: LazyStaggeredGridItemPlacementAnimator.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0018\u0010\u0014R4\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00192\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00198\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u000f\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/a;", "", "", "lane", "span", "crossAxisOffset", "<init>", "(III)V", "Landroidx/compose/foundation/lazy/staggeredgrid/a0;", "positionedItem", "Lkotlinx/coroutines/r0;", "coroutineScope", "Lkotlin/k2;", "h", "(Landroidx/compose/foundation/lazy/staggeredgrid/a0;Lkotlinx/coroutines/r0;)V", "a", "I", "c", "()I", "f", "(I)V", "b", "d", "g", "e", "", "Landroidx/compose/foundation/lazy/layout/h;", "<set-?>", "[Landroidx/compose/foundation/lazy/layout/h;", "()[Landroidx/compose/foundation/lazy/layout/h;", "animations", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int lane;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int span;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int crossAxisOffset;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.foundation.lazy.layout.h[] animations;

    public a(int i4, int i5, int i6) {
        androidx.compose.foundation.lazy.layout.h[] hVarArr;
        this.lane = i4;
        this.span = i5;
        this.crossAxisOffset = i6;
        hVarArr = l.f6413a;
        this.animations = hVarArr;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final androidx.compose.foundation.lazy.layout.h[] getAnimations() {
        return this.animations;
    }

    /* renamed from: b, reason: from getter */
    public final int getCrossAxisOffset() {
        return this.crossAxisOffset;
    }

    /* renamed from: c, reason: from getter */
    public final int getLane() {
        return this.lane;
    }

    /* renamed from: d, reason: from getter */
    public final int getSpan() {
        return this.span;
    }

    public final void e(int i4) {
        this.crossAxisOffset = i4;
    }

    public final void f(int i4) {
        this.lane = i4;
    }

    public final void g(int i4) {
        this.span = i4;
    }

    public final void h(@fg.l a0 positionedItem, @fg.l r0 coroutineScope) {
        androidx.compose.foundation.lazy.layout.j c5;
        int length = this.animations.length;
        for (int n4 = positionedItem.n(); n4 < length; n4++) {
            androidx.compose.foundation.lazy.layout.h hVar = this.animations[n4];
            if (hVar != null) {
                hVar.C();
            }
        }
        if (this.animations.length != positionedItem.n()) {
            Object[] copyOf = Arrays.copyOf(this.animations, positionedItem.n());
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            this.animations = (androidx.compose.foundation.lazy.layout.h[]) copyOf;
        }
        int n5 = positionedItem.n();
        for (int i4 = 0; i4 < n5; i4++) {
            c5 = l.c(positionedItem.m(i4));
            if (c5 == null) {
                androidx.compose.foundation.lazy.layout.h hVar2 = this.animations[i4];
                if (hVar2 != null) {
                    hVar2.C();
                }
                this.animations[i4] = null;
            } else {
                androidx.compose.foundation.lazy.layout.h hVar3 = this.animations[i4];
                if (hVar3 == null) {
                    hVar3 = new androidx.compose.foundation.lazy.layout.h(coroutineScope);
                    this.animations[i4] = hVar3;
                }
                hVar3.v(c5.y7());
                hVar3.z(c5.z7());
            }
        }
    }
}
