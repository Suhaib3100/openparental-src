package androidx.compose.ui.graphics;

import android.graphics.Shader;
import kotlin.Metadata;

/* compiled from: Brush.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "shader", "Landroidx/compose/ui/graphics/a6;", "a", "(Landroid/graphics/Shader;)Landroidx/compose/ui/graphics/a6;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u1 {

    /* compiled from: Brush.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\b"}, d2 = {"androidx/compose/ui/graphics/u1$a", "Landroidx/compose/ui/graphics/a6;", "Li0/n;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "c", "(J)Landroid/graphics/Shader;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends a6 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Shader f18051e;

        a(Shader shader) {
            this.f18051e = shader;
        }

        @Override // androidx.compose.ui.graphics.a6
        @fg.l
        public Shader c(long size) {
            return this.f18051e;
        }
    }

    @fg.l
    public static final a6 a(@fg.l Shader shader) {
        return new a(shader);
    }
}
