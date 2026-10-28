package w0;

import androidx.annotation.c1;
import androidx.compose.runtime.internal.u;
import fg.l;
import kotlin.Metadata;

/* compiled from: MathUtils.android.kt */
@u(parameters = 1)
@c1({c1.a.LIBRARY})
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\tJ5\u0010\n\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0011¨\u0006\u0012"}, d2 = {"Lw0/d;", "", "<init>", "()V", "", "start", "stop", "amount", "b", "(FFF)F", "a", "value", "c", "rangeMin", "rangeMax", "valueMin", "valueMax", "(FFFFF)F", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final d f92865a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final int f92866b = 0;

    private d() {
    }

    public final float a(float rangeMin, float rangeMax, float valueMin, float valueMax, float value) {
        return b(rangeMin, rangeMax, Math.max(0.0f, Math.min(1.0f, c(valueMin, valueMax, value))));
    }

    public final float b(float start, float stop, float amount) {
        return androidx.appcompat.graphics.drawable.d.a(stop, start, amount, start);
    }

    public final float c(float a5, float b5, float value) {
        if (a5 == b5) {
            return 0.0f;
        }
        return (value - a5) / (b5 - a5);
    }
}
