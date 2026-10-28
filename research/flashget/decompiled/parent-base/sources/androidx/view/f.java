package androidx.view;

import android.os.Build;
import android.window.BackEvent;
import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.annotation.x;
import androidx.annotation.x0;
import dd.a;
import dd.e;
import fg.l;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: BackEventCompat.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \r2\u00020\u0001:\u0002\u0012\u0016B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/activity/f;", "", "", "touchX", "touchY", "progress", "", "swipeEdge", "<init>", "(FFFI)V", "Landroid/window/BackEvent;", "backEvent", "(Landroid/window/BackEvent;)V", "e", "()Landroid/window/BackEvent;", "", "toString", "()Ljava/lang/String;", "a", "F", "c", "()F", "b", "d", "I", "()I", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    public static final int f528f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f529g = 1;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float touchX;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float touchY;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float progress;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int swipeEdge;

    /* compiled from: BackEventCompat.kt */
    @Target({ElementType.TYPE_USE})
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/activity/f$b;", "", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @c1({c1.a.LIBRARY})
    @e(a.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    @dd.f(allowedTargets = {dd.b.TYPE})
    public @interface b {
    }

    @m1
    public f(float f4, float f5, @x(from = 0.0d, to = 1.0d) float f6, int i4) {
        this.touchX = f4;
        this.touchY = f5;
        this.progress = f6;
        this.swipeEdge = i4;
    }

    /* renamed from: a, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* renamed from: b, reason: from getter */
    public final int getSwipeEdge() {
        return this.swipeEdge;
    }

    /* renamed from: c, reason: from getter */
    public final float getTouchX() {
        return this.touchX;
    }

    /* renamed from: d, reason: from getter */
    public final float getTouchY() {
        return this.touchY;
    }

    @l
    @x0(34)
    public final BackEvent e() {
        if (Build.VERSION.SDK_INT >= 34) {
            return d.f524a.a(this.touchX, this.touchY, this.progress, this.swipeEdge);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 34+");
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder("BackEventCompat{touchX=");
        sb.append(this.touchX);
        sb.append(", touchY=");
        sb.append(this.touchY);
        sb.append(", progress=");
        sb.append(this.progress);
        sb.append(", swipeEdge=");
        return e.a(sb, this.swipeEdge, '}');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @androidx.annotation.x0(34)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(@fg.l android.window.BackEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.l0.p(r5, r0)
            androidx.activity.d r0 = androidx.view.d.f524a
            float r1 = r0.d(r5)
            float r2 = r0.e(r5)
            float r3 = r0.b(r5)
            int r5 = r0.c(r5)
            r4.<init>(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.view.f.<init>(android.window.BackEvent):void");
    }
}
