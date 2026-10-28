package androidx.core.os;

import android.os.Bundle;
import androidx.annotation.c1;
import androidx.annotation.x0;
import kotlin.Metadata;

/* compiled from: Profiling.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0000H\u0015¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/core/os/n0;", "Landroidx/core/os/m0;", "<init>", "()V", "Landroid/os/Bundle;", "b", "()Landroid/os/Bundle;", "", "c", "()I", "g", "()Landroidx/core/os/n0;", "bufferSizeKb", "h", "(I)Landroidx/core/os/n0;", "durationMs", "i", "samplingFrequencyHz", "j", "Landroid/os/Bundle;", "mParams", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(api = 35)
/* loaded from: classes3.dex */
public final class n0 extends m0<n0> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Bundle mParams = new Bundle();

    @Override // androidx.core.os.m0
    @fg.l
    @c1({c1.a.SUBCLASSES})
    /* renamed from: b, reason: from getter */
    protected Bundle getMParams() {
        return this.mParams;
    }

    @Override // androidx.core.os.m0
    @c1({c1.a.SUBCLASSES})
    protected int c() {
        return 3;
    }

    @Override // androidx.core.os.m0
    public n0 d() {
        return this;
    }

    @fg.l
    @c1({c1.a.SUBCLASSES})
    protected n0 g() {
        return this;
    }

    @fg.l
    public final n0 h(int bufferSizeKb) {
        this.mParams.putInt("KEY_SIZE_KB", bufferSizeKb);
        return this;
    }

    @fg.l
    public final n0 i(int durationMs) {
        this.mParams.putInt("KEY_DURATION_MS", durationMs);
        return this;
    }

    @fg.l
    public final n0 j(int samplingFrequencyHz) {
        this.mParams.putInt("KEY_FREQUENCY_HZ", samplingFrequencyHz);
        return this;
    }
}
