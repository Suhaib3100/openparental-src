package androidx.compose.ui.graphics;

import android.graphics.PathEffect;
import kotlin.Metadata;

/* compiled from: AndroidPathEffect.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/w0;", "Landroidx/compose/ui/graphics/h5;", "Landroid/graphics/PathEffect;", "nativePathEffect", "<init>", "(Landroid/graphics/PathEffect;)V", "b", "Landroid/graphics/PathEffect;", "a", "()Landroid/graphics/PathEffect;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w0 implements h5 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final PathEffect nativePathEffect;

    public w0(@fg.l PathEffect pathEffect) {
        this.nativePathEffect = pathEffect;
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final PathEffect getNativePathEffect() {
        return this.nativePathEffect;
    }
}
