package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import kotlin.Metadata;

/* compiled from: AndroidCanvas.android.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086\b¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u000e\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/w1;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "targetCanvas", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/v1;", "Lkotlin/k2;", "Lkotlin/u;", "block", "a", "(Landroid/graphics/Canvas;Lld/l;)V", "Landroidx/compose/ui/graphics/g0;", "Landroidx/compose/ui/graphics/g0;", "b", "()Landroidx/compose/ui/graphics/g0;", "c", "androidCanvas", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final g0 androidCanvas = new g0();

    @kotlin.w0
    public static /* synthetic */ void c() {
    }

    public final void a(@fg.l Canvas targetCanvas, @fg.l ld.l<? super v1, kotlin.k2> block) {
        Canvas internalCanvas = this.androidCanvas.getInternalCanvas();
        this.androidCanvas.U(targetCanvas);
        block.invoke(this.androidCanvas);
        this.androidCanvas.U(internalCanvas);
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final g0 getAndroidCanvas() {
        return this.androidCanvas;
    }
}
