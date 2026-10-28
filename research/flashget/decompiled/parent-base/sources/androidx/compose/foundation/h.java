package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.SurfaceHolder;
import kotlin.Metadata;

/* compiled from: AndroidExternalSurface.android.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u000bR\"\u0010\u0019\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/h;", "Landroidx/compose/foundation/p;", "Landroid/view/SurfaceHolder$Callback;", "Lkotlinx/coroutines/r0;", "scope", "<init>", "(Lkotlinx/coroutines/r0;)V", "Landroid/view/SurfaceHolder;", "holder", "Lkotlin/k2;", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "", "format", "width", "height", "surfaceChanged", "(Landroid/view/SurfaceHolder;III)V", "surfaceDestroyed", "g", "I", "k", "()I", "m", "(I)V", "lastWidth", "h", "j", "l", "lastHeight", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class h extends p implements SurfaceHolder.Callback {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int lastWidth;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int lastHeight;

    public h(@fg.l kotlinx.coroutines.r0 r0Var) {
        super(r0Var);
        this.lastWidth = -1;
        this.lastHeight = -1;
    }

    /* renamed from: j, reason: from getter */
    public final int getLastHeight() {
        return this.lastHeight;
    }

    /* renamed from: k, reason: from getter */
    public final int getLastWidth() {
        return this.lastWidth;
    }

    public final void l(int i4) {
        this.lastHeight = i4;
    }

    public final void m(int i4) {
        this.lastWidth = i4;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@fg.l SurfaceHolder holder, int format, int width, int height) {
        if (this.lastWidth == width && this.lastHeight == height) {
            return;
        }
        this.lastWidth = width;
        this.lastHeight = height;
        f(holder.getSurface(), width, height);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@fg.l SurfaceHolder holder) {
        Rect surfaceFrame = holder.getSurfaceFrame();
        this.lastWidth = surfaceFrame.width();
        this.lastHeight = surfaceFrame.height();
        g(holder.getSurface(), this.lastWidth, this.lastHeight);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@fg.l SurfaceHolder holder) {
        h(holder.getSurface());
    }
}
