package androidx.compose.foundation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import kotlin.Metadata;

/* compiled from: EdgeEffectCompat.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\u000b*\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u0012*\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u0012*\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017R\u0015\u0010\u001a\u001a\u00020\u000b*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/u0;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Landroid/widget/EdgeEffect;", "a", "(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/EdgeEffect;", "", "deltaDistance", "displacement", "d", "(Landroid/widget/EdgeEffect;FF)F", "", "velocity", "Lkotlin/k2;", "c", "(Landroid/widget/EdgeEffect;I)V", "delta", "e", "(Landroid/widget/EdgeEffect;F)V", "b", "(Landroid/widget/EdgeEffect;)F", "distanceCompat", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final u0 f9093a = new u0();

    /* renamed from: b, reason: collision with root package name */
    public static final int f9094b = 0;

    private u0() {
    }

    @fg.l
    public final EdgeEffect a(@fg.l Context context, @fg.m AttributeSet attrs) {
        return Build.VERSION.SDK_INT >= 31 ? m.f6584a.a(context, attrs) : new j1(context);
    }

    public final float b(@fg.l EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return m.f6584a.b(edgeEffect);
        }
        return 0.0f;
    }

    public final void c(@fg.l EdgeEffect edgeEffect, int i4) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i4);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i4);
        }
    }

    public final float d(@fg.l EdgeEffect edgeEffect, float f4, float f5) {
        if (Build.VERSION.SDK_INT >= 31) {
            return m.f6584a.c(edgeEffect, f4, f5);
        }
        edgeEffect.onPull(f4, f5);
        return f4;
    }

    public final void e(@fg.l EdgeEffect edgeEffect, float f4) {
        if (edgeEffect instanceof j1) {
            ((j1) edgeEffect).a(f4);
        } else {
            edgeEffect.onRelease();
        }
    }
}
