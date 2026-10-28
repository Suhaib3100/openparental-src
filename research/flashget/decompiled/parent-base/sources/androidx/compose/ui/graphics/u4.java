package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* compiled from: ImageBitmap.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aW\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a>\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/s4;", "", "startX", "startY", "width", "height", "", "buffer", "bufferOffset", "stride", "Landroidx/compose/ui/graphics/m5;", "c", "(Landroidx/compose/ui/graphics/s4;IIII[III)Landroidx/compose/ui/graphics/m5;", "Landroidx/compose/ui/graphics/t4;", "config", "", "hasAlpha", "Landroidx/compose/ui/graphics/colorspace/c;", "colorSpace", "a", "(IIIZLandroidx/compose/ui/graphics/colorspace/c;)Landroidx/compose/ui/graphics/s4;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u4 {
    @fg.l
    public static final s4 a(int i4, int i5, int i6, boolean z4, @fg.l androidx.compose.ui.graphics.colorspace.c cVar) {
        return r0.a(i4, i5, i6, z4, cVar);
    }

    public static s4 b(int i4, int i5, int i6, boolean z4, androidx.compose.ui.graphics.colorspace.c cVar, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            t4.INSTANCE.getClass();
            i6 = t4.f18042c;
        }
        if ((i7 & 8) != 0) {
            z4 = true;
        }
        if ((i7 & 16) != 0) {
            cVar = androidx.compose.ui.graphics.colorspace.g.f17689a.x();
        }
        return r0.a(i4, i5, i6, z4, cVar);
    }

    @fg.l
    public static final m5 c(@fg.l s4 s4Var, int i4, int i5, int i6, int i7, @fg.l int[] iArr, int i10, int i11) {
        s4Var.b(iArr, i4, i5, i6, i7, i10, i11);
        return new m5(iArr, i6, i7, i10, i11);
    }

    public static /* synthetic */ m5 d(s4 s4Var, int i4, int i5, int i6, int i7, int[] iArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i4 = 0;
        }
        if ((i12 & 2) != 0) {
            i5 = 0;
        }
        if ((i12 & 4) != 0) {
            i6 = s4Var.getWidth();
        }
        if ((i12 & 8) != 0) {
            i7 = s4Var.getHeight();
        }
        if ((i12 & 16) != 0) {
            iArr = new int[i6 * i7];
        }
        if ((i12 & 32) != 0) {
            i10 = 0;
        }
        if ((i12 & 64) != 0) {
            i11 = i6;
        }
        return c(s4Var, i4, i5, i6, i7, iArr, i10, i11);
    }
}
