package androidx.window.sidecar;

import android.graphics.Rect;
import androidx.annotation.c1;
import androidx.window.core.b;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: WindowMetrics.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/window/layout/c0;", "", "Landroidx/window/core/b;", "_bounds", "<init>", "(Landroidx/window/core/b;)V", "Landroid/graphics/Rect;", "bounds", "(Landroid/graphics/Rect;)V", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroidx/window/core/b;", "()Landroid/graphics/Rect;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final b _bounds;

    public c0(@l b _bounds) {
        l0.p(_bounds, "_bounds");
        this._bounds = _bounds;
    }

    @l
    public final Rect a() {
        return this._bounds.i();
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !l0.g(c0.class, other.getClass())) {
            return false;
        }
        return l0.g(this._bounds, ((c0) other)._bounds);
    }

    public int hashCode() {
        return this._bounds.hashCode();
    }

    @l
    public String toString() {
        return "WindowMetrics { bounds: " + this._bounds.i() + " }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @c1({c1.a.TESTS})
    public c0(@l Rect bounds) {
        this(new b(bounds));
        l0.p(bounds, "bounds");
    }
}
