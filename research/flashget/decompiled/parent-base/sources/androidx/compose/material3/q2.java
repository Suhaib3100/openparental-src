package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: Checkbox.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Landroidx/compose/material3/q2;", "", "Landroidx/compose/ui/graphics/g5;", "checkPath", "Landroidx/compose/ui/graphics/j5;", "pathMeasure", "pathToDraw", "<init>", "(Landroidx/compose/ui/graphics/g5;Landroidx/compose/ui/graphics/j5;Landroidx/compose/ui/graphics/g5;)V", "a", "Landroidx/compose/ui/graphics/g5;", "()Landroidx/compose/ui/graphics/g5;", "b", "Landroidx/compose/ui/graphics/j5;", "()Landroidx/compose/ui/graphics/j5;", "c", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class q2 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.graphics.g5 checkPath;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.graphics.j5 pathMeasure;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final androidx.compose.ui.graphics.g5 pathToDraw;

    public q2() {
        this(null, null, null, 7, null);
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final androidx.compose.ui.graphics.g5 getCheckPath() {
        return this.checkPath;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final androidx.compose.ui.graphics.j5 getPathMeasure() {
        return this.pathMeasure;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final androidx.compose.ui.graphics.g5 getPathToDraw() {
        return this.pathToDraw;
    }

    public q2(@fg.l androidx.compose.ui.graphics.g5 g5Var, @fg.l androidx.compose.ui.graphics.j5 j5Var, @fg.l androidx.compose.ui.graphics.g5 g5Var2) {
        this.checkPath = g5Var;
        this.pathMeasure = j5Var;
        this.pathToDraw = g5Var2;
    }

    public /* synthetic */ q2(androidx.compose.ui.graphics.g5 g5Var, androidx.compose.ui.graphics.j5 j5Var, androidx.compose.ui.graphics.g5 g5Var2, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? androidx.compose.ui.graphics.a1.a() : g5Var, (i4 & 2) != 0 ? androidx.compose.ui.graphics.z0.a() : j5Var, (i4 & 4) != 0 ? androidx.compose.ui.graphics.a1.a() : g5Var2);
    }
}
