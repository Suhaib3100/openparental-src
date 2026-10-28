package androidx.compose.ui.graphics;

import android.graphics.Path;
import android.graphics.PathMeasure;
import kotlin.Metadata;

/* compiled from: AndroidPathMeasure.android.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0014\u0010 \u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/y0;", "Landroidx/compose/ui/graphics/j5;", "Landroid/graphics/PathMeasure;", "internalPathMeasure", "<init>", "(Landroid/graphics/PathMeasure;)V", "", "startDistance", "stopDistance", "Landroidx/compose/ui/graphics/g5;", "destination", "", "startWithMoveTo", "b", "(FFLandroidx/compose/ui/graphics/g5;Z)Z", "path", "forceClosed", "Lkotlin/k2;", "c", "(Landroidx/compose/ui/graphics/g5;Z)V", "distance", "Li0/f;", "d", "(F)J", "a", "Landroid/graphics/PathMeasure;", "", "[F", "positionArray", "tangentArray", "getLength", "()F", "length", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAndroidPathMeasure.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,86:1\n35#2,5:87\n35#2,5:92\n*S KotlinDebug\n*F\n+ 1 AndroidPathMeasure.android.kt\nandroidx/compose/ui/graphics/AndroidPathMeasure\n*L\n43#1:87,5\n49#1:92,5\n*E\n"})
/* loaded from: classes.dex */
public final class y0 implements j5 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final PathMeasure internalPathMeasure;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private float[] positionArray;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private float[] tangentArray;

    public y0(@fg.l PathMeasure pathMeasure) {
        this.internalPathMeasure = pathMeasure;
    }

    @Override // androidx.compose.ui.graphics.j5
    public long a(float distance) {
        if (this.positionArray == null) {
            this.positionArray = new float[2];
        }
        if (this.tangentArray == null) {
            this.tangentArray = new float[2];
        }
        if (!this.internalPathMeasure.getPosTan(distance, this.positionArray, this.tangentArray)) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        float[] fArr = this.tangentArray;
        kotlin.jvm.internal.l0.m(fArr);
        float f4 = fArr[0];
        float[] fArr2 = this.tangentArray;
        kotlin.jvm.internal.l0.m(fArr2);
        return i0.g.a(f4, fArr2[1]);
    }

    @Override // androidx.compose.ui.graphics.j5
    public boolean b(float startDistance, float stopDistance, @fg.l g5 destination, boolean startWithMoveTo) {
        PathMeasure pathMeasure = this.internalPathMeasure;
        if (destination instanceof v0) {
            return pathMeasure.getSegment(startDistance, stopDistance, ((v0) destination).getInternalPath(), startWithMoveTo);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // androidx.compose.ui.graphics.j5
    public void c(@fg.m g5 path, boolean forceClosed) {
        Path path2;
        PathMeasure pathMeasure = this.internalPathMeasure;
        if (path == null) {
            path2 = null;
        } else {
            if (!(path instanceof v0)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            path2 = ((v0) path).getInternalPath();
        }
        pathMeasure.setPath(path2, forceClosed);
    }

    @Override // androidx.compose.ui.graphics.j5
    public long d(float distance) {
        if (this.positionArray == null) {
            this.positionArray = new float[2];
        }
        if (this.tangentArray == null) {
            this.tangentArray = new float[2];
        }
        if (!this.internalPathMeasure.getPosTan(distance, this.positionArray, this.tangentArray)) {
            i0.f.INSTANCE.getClass();
            return i0.f.f74149e;
        }
        float[] fArr = this.positionArray;
        kotlin.jvm.internal.l0.m(fArr);
        float f4 = fArr[0];
        float[] fArr2 = this.positionArray;
        kotlin.jvm.internal.l0.m(fArr2);
        return i0.g.a(f4, fArr2[1]);
    }

    @Override // androidx.compose.ui.graphics.j5
    public float getLength() {
        return this.internalPathMeasure.getLength();
    }
}
