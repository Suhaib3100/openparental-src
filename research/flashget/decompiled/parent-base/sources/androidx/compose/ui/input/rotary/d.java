package androidx.compose.ui.input.rotary;

import androidx.compose.animation.l0;
import androidx.compose.runtime.internal.u;
import androidx.view.e;
import fg.l;
import fg.m;
import i0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: RotaryScrollEvent.android.kt */
@u(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/input/rotary/d;", "", "", "verticalScrollPixels", "horizontalScrollPixels", "", "uptimeMillis", "", "inputDeviceId", "<init>", "(FFJI)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "F", "d", "()F", "b", "c", "J", "()J", "I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRotaryScrollEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RotaryScrollEvent.android.kt\nandroidx/compose/ui/input/rotary/RotaryScrollEvent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final int f18888e = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float verticalScrollPixels;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float horizontalScrollPixels;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long uptimeMillis;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int inputDeviceId;

    public d(float f4, float f5, long j4, int i4) {
        this.verticalScrollPixels = f4;
        this.horizontalScrollPixels = f5;
        this.uptimeMillis = j4;
        this.inputDeviceId = i4;
    }

    /* renamed from: a, reason: from getter */
    public final float getHorizontalScrollPixels() {
        return this.horizontalScrollPixels;
    }

    /* renamed from: b, reason: from getter */
    public final int getInputDeviceId() {
        return this.inputDeviceId;
    }

    /* renamed from: c, reason: from getter */
    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    /* renamed from: d, reason: from getter */
    public final float getVerticalScrollPixels() {
        return this.verticalScrollPixels;
    }

    public boolean equals(@m Object other) {
        if (other instanceof d) {
            d dVar = (d) other;
            if (dVar.verticalScrollPixels == this.verticalScrollPixels && dVar.horizontalScrollPixels == this.horizontalScrollPixels && dVar.uptimeMillis == this.uptimeMillis && dVar.inputDeviceId == this.inputDeviceId) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Integer.hashCode(this.inputDeviceId) + k.a(this.uptimeMillis, l0.a(this.horizontalScrollPixels, Float.hashCode(this.verticalScrollPixels) * 31, 31), 31);
    }

    @l
    public String toString() {
        StringBuilder sb = new StringBuilder("RotaryScrollEvent(verticalScrollPixels=");
        sb.append(this.verticalScrollPixels);
        sb.append(",horizontalScrollPixels=");
        sb.append(this.horizontalScrollPixels);
        sb.append(",uptimeMillis=");
        sb.append(this.uptimeMillis);
        sb.append(",deviceId=");
        return e.a(sb, this.inputDeviceId, ')');
    }
}
