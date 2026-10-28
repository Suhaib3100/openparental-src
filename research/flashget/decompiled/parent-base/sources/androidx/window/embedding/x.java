package androidx.window.embedding;

import android.graphics.Rect;
import android.os.Build;
import android.view.WindowMetrics;
import androidx.annotation.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SplitRule.kt */
@androidx.window.core.d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0017\u0018\u00002\u00020\u0001:\u0002\r\u0017B1\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u001c"}, d2 = {"Landroidx/window/embedding/x;", "Landroidx/window/embedding/m;", "", "minWidth", "minSmallestWidth", "", "splitRatio", "layoutDirection", "<init>", "(IIFI)V", "Landroid/view/WindowMetrics;", "parentMetrics", "", "a", "(Landroid/view/WindowMetrics;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "d", "b", "c", "F", "e", "()F", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class x extends m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int minWidth;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int minSmallestWidth;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float splitRatio;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int layoutDirection;

    /* compiled from: SplitRule.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/window/embedding/x$a;", "", "<init>", "()V", "Landroid/view/WindowMetrics;", "windowMetrics", "Landroid/graphics/Rect;", "a", "(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @x0(30)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f35776a = new a();

        private a() {
        }

        @fg.l
        @androidx.annotation.u
        public final Rect a(@fg.l WindowMetrics windowMetrics) {
            l0.p(windowMetrics, "windowMetrics");
            Rect bounds = windowMetrics.getBounds();
            l0.o(bounds, "windowMetrics.bounds");
            return bounds;
        }
    }

    /* compiled from: SplitRule.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/window/embedding/x$b;", "", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @dd.e(dd.a.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public x() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    public final boolean a(@fg.l WindowMetrics parentMetrics) {
        l0.p(parentMetrics, "parentMetrics");
        if (Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        Rect a5 = a.f35776a.a(parentMetrics);
        return (this.minWidth == 0 || a5.width() >= this.minWidth) && (this.minSmallestWidth == 0 || Math.min(a5.width(), a5.height()) >= this.minSmallestWidth);
    }

    /* renamed from: b, reason: from getter */
    public final int getLayoutDirection() {
        return this.layoutDirection;
    }

    /* renamed from: c, reason: from getter */
    public final int getMinSmallestWidth() {
        return this.minSmallestWidth;
    }

    /* renamed from: d, reason: from getter */
    public final int getMinWidth() {
        return this.minWidth;
    }

    /* renamed from: e, reason: from getter */
    public final float getSplitRatio() {
        return this.splitRatio;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof x)) {
            return false;
        }
        x xVar = (x) other;
        return this.minWidth == xVar.minWidth && this.minSmallestWidth == xVar.minSmallestWidth && this.splitRatio == xVar.splitRatio && this.layoutDirection == xVar.layoutDirection;
    }

    public int hashCode() {
        return androidx.compose.animation.l0.a(this.splitRatio, ((this.minWidth * 31) + this.minSmallestWidth) * 31, 31) + this.layoutDirection;
    }

    public /* synthetic */ x(int i4, int i5, float f4, int i6, int i7, kotlin.jvm.internal.w wVar) {
        this((i7 & 1) != 0 ? 0 : i4, (i7 & 2) != 0 ? 0 : i5, (i7 & 4) != 0 ? 0.5f : f4, (i7 & 8) != 0 ? 3 : i6);
    }

    public x(int i4, int i5, float f4, int i6) {
        this.minWidth = i4;
        this.minSmallestWidth = i5;
        this.splitRatio = f4;
        this.layoutDirection = i6;
    }
}
