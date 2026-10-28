package androidx.compose.ui.graphics;

import android.graphics.RenderEffect;
import android.os.Build;
import kotlin.Metadata;

/* compiled from: AndroidRenderEffect.android.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H%¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/s5;", "", "<init>", "()V", "Landroid/graphics/RenderEffect;", "a", "()Landroid/graphics/RenderEffect;", "b", "", "c", "()Z", "Landroid/graphics/RenderEffect;", "internalRenderEffect", "Landroidx/compose/ui/graphics/b1;", "Landroidx/compose/ui/graphics/s1;", "Landroidx/compose/ui/graphics/a5;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAndroidRenderEffect.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidRenderEffect.android.kt\nandroidx/compose/ui/graphics/RenderEffect\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,169:1\n1#2:170\n*E\n"})
/* loaded from: classes.dex */
public abstract class s5 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private RenderEffect internalRenderEffect;

    public /* synthetic */ s5(kotlin.jvm.internal.w wVar) {
        this();
    }

    @fg.l
    @androidx.annotation.x0(31)
    public final RenderEffect a() {
        RenderEffect renderEffect = this.internalRenderEffect;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect b5 = b();
        this.internalRenderEffect = b5;
        return b5;
    }

    @fg.l
    @androidx.annotation.x0(31)
    protected abstract RenderEffect b();

    public boolean c() {
        return Build.VERSION.SDK_INT >= 31;
    }

    private s5() {
    }
}
