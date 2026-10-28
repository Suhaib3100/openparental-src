package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.graphics.d2;
import kotlin.Metadata;

/* compiled from: Brush.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u001c\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/a6;", "Landroidx/compose/ui/graphics/t1;", "<init>", "()V", "Li0/n;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "c", "(J)Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/d5;", "p", "", "alpha", "Lkotlin/k2;", "a", "(JLandroidx/compose/ui/graphics/d5;F)V", "Landroid/graphics/Shader;", "internalShader", "d", "J", "createdSize", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nBrush.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Brush.kt\nandroidx/compose/ui/graphics/ShaderBrush\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,670:1\n1#2:671\n*E\n"})
/* loaded from: classes.dex */
public abstract class a6 extends t1 {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Shader internalShader;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long createdSize;

    public a6() {
        super(null);
        i0.n.INSTANCE.getClass();
        this.createdSize = i0.n.f74172d;
    }

    @Override // androidx.compose.ui.graphics.t1
    public final void a(long size, @fg.l d5 p4, float alpha) {
        Shader shader = this.internalShader;
        if (shader == null || !i0.n.k(this.createdSize, size)) {
            if (i0.n.v(size)) {
                shader = null;
                this.internalShader = null;
                i0.n.INSTANCE.getClass();
                this.createdSize = i0.n.f74172d;
            } else {
                shader = c(size);
                this.internalShader = shader;
                this.createdSize = size;
            }
        }
        long a5 = p4.a();
        d2.Companion companion = d2.INSTANCE;
        companion.getClass();
        if (!kotlin.a2.o(a5, d2.f17766c)) {
            companion.getClass();
            p4.m(d2.f17766c);
        }
        if (!kotlin.jvm.internal.l0.g(p4.t(), shader)) {
            p4.s(shader);
        }
        if (p4.g() == alpha) {
            return;
        }
        p4.k(alpha);
    }

    @fg.l
    public abstract Shader c(long size);
}
