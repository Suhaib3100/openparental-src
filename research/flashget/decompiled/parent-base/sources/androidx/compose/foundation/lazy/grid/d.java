package androidx.compose.foundation.lazy.grid;

import java.util.Arrays;
import kotlin.Metadata;
import kotlinx.coroutines.r0;

/* compiled from: LazyGridItemPlacementAnimator.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R4\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00162\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u000e\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/lazy/grid/d;", "", "", "crossAxisSize", "crossAxisOffset", "<init>", "(II)V", "Landroidx/compose/foundation/lazy/grid/x;", "positionedItem", "Lkotlinx/coroutines/r0;", "coroutineScope", "Lkotlin/k2;", "f", "(Landroidx/compose/foundation/lazy/grid/x;Lkotlinx/coroutines/r0;)V", "a", "I", "c", "()I", "e", "(I)V", "b", "d", "", "Landroidx/compose/foundation/lazy/layout/h;", "<set-?>", "[Landroidx/compose/foundation/lazy/layout/h;", "()[Landroidx/compose/foundation/lazy/layout/h;", "animations", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int crossAxisSize;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int crossAxisOffset;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private androidx.compose.foundation.lazy.layout.h[] animations;

    public d(int i4, int i5) {
        androidx.compose.foundation.lazy.layout.h[] hVarArr;
        this.crossAxisSize = i4;
        this.crossAxisOffset = i5;
        hVarArr = m.f5783a;
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
    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    public final void d(int i4) {
        this.crossAxisOffset = i4;
    }

    public final void e(int i4) {
        this.crossAxisSize = i4;
    }

    public final void f(@fg.l x positionedItem, @fg.l r0 coroutineScope) {
        androidx.compose.foundation.lazy.layout.j c5;
        int length = this.animations.length;
        for (int o4 = positionedItem.o(); o4 < length; o4++) {
            androidx.compose.foundation.lazy.layout.h hVar = this.animations[o4];
            if (hVar != null) {
                hVar.C();
            }
        }
        if (this.animations.length != positionedItem.o()) {
            Object[] copyOf = Arrays.copyOf(this.animations, positionedItem.o());
            kotlin.jvm.internal.l0.o(copyOf, "copyOf(this, newSize)");
            this.animations = (androidx.compose.foundation.lazy.layout.h[]) copyOf;
        }
        int o5 = positionedItem.o();
        for (int i4 = 0; i4 < o5; i4++) {
            c5 = m.c(positionedItem.n(i4));
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
