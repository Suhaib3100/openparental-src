package androidx.compose.foundation.lazy.layout;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* compiled from: LazyAnimateScroll.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/lazy/layout/e;", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "", "itemOffset", "Landroidx/compose/animation/core/m;", "", "Landroidx/compose/animation/core/o;", "previousAnimation", "<init>", "(ILandroidx/compose/animation/core/m;)V", "b", "I", "a", "()I", "c", "Landroidx/compose/animation/core/m;", "()Landroidx/compose/animation/core/m;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class e extends CancellationException {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int itemOffset;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.animation.core.m<Float, androidx.compose.animation.core.o> previousAnimation;

    public e(int i4, @fg.l androidx.compose.animation.core.m<Float, androidx.compose.animation.core.o> mVar) {
        this.itemOffset = i4;
        this.previousAnimation = mVar;
    }

    /* renamed from: a, reason: from getter */
    public final int getItemOffset() {
        return this.itemOffset;
    }

    @fg.l
    public final androidx.compose.animation.core.m<Float, androidx.compose.animation.core.o> b() {
        return this.previousAnimation;
    }
}
