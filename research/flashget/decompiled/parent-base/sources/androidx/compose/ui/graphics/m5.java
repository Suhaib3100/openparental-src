package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* compiled from: PixelMap.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\f\u001a\u00020\u0004H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/graphics/m5;", "", "", "buffer", "", "width", "height", "bufferOffset", "stride", "<init>", "([IIIII)V", "x", "y", "Landroidx/compose/ui/graphics/d2;", "a", "(II)J", "[I", "b", "()[I", "I", "f", "()I", "c", "d", "e", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m5 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final int[] buffer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int height;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int bufferOffset;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int stride;

    public m5(@fg.l int[] iArr, int i4, int i5, int i6, int i7) {
        this.buffer = iArr;
        this.width = i4;
        this.height = i5;
        this.bufferOffset = i6;
        this.stride = i7;
    }

    public final long a(@androidx.annotation.g0(from = 0) int x4, @androidx.annotation.g0(from = 0) int y4) {
        return f2.b(this.buffer[(y4 * this.stride) + this.bufferOffset + x4]);
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final int[] getBuffer() {
        return this.buffer;
    }

    /* renamed from: c, reason: from getter */
    public final int getBufferOffset() {
        return this.bufferOffset;
    }

    /* renamed from: d, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: e, reason: from getter */
    public final int getStride() {
        return this.stride;
    }

    /* renamed from: f, reason: from getter */
    public final int getWidth() {
        return this.width;
    }
}
