package androidx.compose.foundation;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import kotlin.Metadata;

/* compiled from: AndroidExternalSurface.android.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R(\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/foundation/f;", "Landroidx/compose/foundation/p;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lkotlinx/coroutines/r0;", "scope", "<init>", "(Lkotlinx/coroutines/r0;)V", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "", "width", "height", "Lkotlin/k2;", "onSurfaceTextureAvailable", "(Landroid/graphics/SurfaceTexture;II)V", "onSurfaceTextureSizeChanged", "", "onSurfaceTextureDestroyed", "(Landroid/graphics/SurfaceTexture;)Z", "surface", "onSurfaceTextureUpdated", "(Landroid/graphics/SurfaceTexture;)V", "Landroidx/compose/ui/unit/u;", "g", "J", "k", "()J", "l", "(J)V", "surfaceSize", "Landroid/graphics/Matrix;", "h", "Landroid/graphics/Matrix;", "j", "()Landroid/graphics/Matrix;", "matrix", "Landroid/view/Surface;", "i", "Landroid/view/Surface;", "surfaceTextureSurface", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class f extends p implements TextureView.SurfaceTextureListener {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long surfaceSize;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Matrix matrix;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Surface surfaceTextureSurface;

    public f(@fg.l kotlinx.coroutines.r0 r0Var) {
        super(r0Var);
        androidx.compose.ui.unit.u.INSTANCE.getClass();
        this.surfaceSize = androidx.compose.ui.unit.u.f21529c;
        this.matrix = new Matrix();
    }

    @fg.l
    /* renamed from: j, reason: from getter */
    public final Matrix getMatrix() {
        return this.matrix;
    }

    /* renamed from: k, reason: from getter */
    public final long getSurfaceSize() {
        return this.surfaceSize;
    }

    public final void l(long j4) {
        this.surfaceSize = j4;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@fg.l SurfaceTexture surfaceTexture, int width, int height) {
        if (!e.a(androidx.compose.ui.unit.u.INSTANCE, this.surfaceSize)) {
            long j4 = this.surfaceSize;
            int i4 = (int) (j4 >> 32);
            height = (int) (j4 & 4294967295L);
            surfaceTexture.setDefaultBufferSize(i4, height);
            width = i4;
        }
        Surface surface = new Surface(surfaceTexture);
        this.surfaceTextureSurface = surface;
        g(surface, width, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@fg.l SurfaceTexture surfaceTexture) {
        Surface surface = this.surfaceTextureSurface;
        kotlin.jvm.internal.l0.m(surface);
        h(surface);
        this.surfaceTextureSurface = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@fg.l SurfaceTexture surfaceTexture, int width, int height) {
        if (!e.a(androidx.compose.ui.unit.u.INSTANCE, this.surfaceSize)) {
            long j4 = this.surfaceSize;
            int i4 = (int) (j4 >> 32);
            height = (int) (j4 & 4294967295L);
            surfaceTexture.setDefaultBufferSize(i4, height);
            width = i4;
        }
        Surface surface = this.surfaceTextureSurface;
        kotlin.jvm.internal.l0.m(surface);
        f(surface, width, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@fg.l SurfaceTexture surface) {
    }
}
