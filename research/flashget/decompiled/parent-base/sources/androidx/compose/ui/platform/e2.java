package androidx.compose.ui.platform;

import android.graphics.Matrix;
import kotlin.Metadata;

/* compiled from: LayerMatrixCache.android.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B?\u00126\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0011RD\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010#\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001e\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/ui/platform/e2;", "T", "", "Lkotlin/Function2;", "Lkotlin/r0;", "name", "target", "Landroid/graphics/Matrix;", "matrix", "Lkotlin/k2;", "getMatrix", "<init>", "(Lld/p;)V", "c", "()V", "Landroidx/compose/ui/graphics/y4;", "b", "(Ljava/lang/Object;)[F", "a", "Lld/p;", "Landroid/graphics/Matrix;", "androidMatrixCache", "previousAndroidMatrix", "d", "[F", "matrixCache", "e", "inverseMatrixCache", "", "f", "Z", "isDirty", "g", "isInverseDirty", "h", "isInverseValid", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e2<T> {

    /* renamed from: i, reason: collision with root package name */
    public static final int f19820i = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.p<T, Matrix, kotlin.k2> getMatrix;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Matrix androidMatrixCache;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Matrix previousAndroidMatrix;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private float[] matrixCache;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private float[] inverseMatrixCache;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isDirty = true;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isInverseDirty = true;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isInverseValid = true;

    /* JADX WARN: Multi-variable type inference failed */
    public e2(@fg.l ld.p<? super T, ? super Matrix, kotlin.k2> pVar) {
        this.getMatrix = pVar;
    }

    @fg.m
    public final float[] a(T target) {
        float[] fArr = this.inverseMatrixCache;
        if (fArr == null) {
            fArr = androidx.compose.ui.graphics.y4.c(null, 1, null);
            this.inverseMatrixCache = fArr;
        }
        if (this.isInverseDirty) {
            this.isInverseValid = c2.a(b(target), fArr);
            this.isInverseDirty = false;
        }
        if (this.isInverseValid) {
            return fArr;
        }
        return null;
    }

    @fg.l
    public final float[] b(T target) {
        float[] fArr = this.matrixCache;
        if (fArr == null) {
            fArr = androidx.compose.ui.graphics.y4.c(null, 1, null);
            this.matrixCache = fArr;
        }
        if (!this.isDirty) {
            return fArr;
        }
        Matrix matrix = this.androidMatrixCache;
        if (matrix == null) {
            matrix = new Matrix();
            this.androidMatrixCache = matrix;
        }
        this.getMatrix.invoke(target, matrix);
        Matrix matrix2 = this.previousAndroidMatrix;
        if (matrix2 == null || !kotlin.jvm.internal.l0.g(matrix, matrix2)) {
            androidx.compose.ui.graphics.s0.b(fArr, matrix);
            this.androidMatrixCache = matrix2;
            this.previousAndroidMatrix = matrix;
        }
        this.isDirty = false;
        return fArr;
    }

    public final void c() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }
}
