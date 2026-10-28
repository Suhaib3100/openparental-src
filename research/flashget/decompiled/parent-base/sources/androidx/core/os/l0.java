package androidx.core.os;

import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.x0;
import kotlin.Metadata;

/* compiled from: Profiling.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\f\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/core/os/l0;", "", "", "profilingType", "Landroid/os/Bundle;", "params", "", "tag", "Landroid/os/CancellationSignal;", "cancellationSignal", "<init>", "(ILandroid/os/Bundle;Ljava/lang/String;Landroid/os/CancellationSignal;)V", "a", "I", "c", "()I", "b", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Landroid/os/CancellationSignal;", "()Landroid/os/CancellationSignal;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(api = 35)
/* loaded from: classes3.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int profilingType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Bundle params;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String tag;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final CancellationSignal cancellationSignal;

    public l0(int i4, @fg.l Bundle params, @fg.m String str, @fg.m CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.l0.p(params, "params");
        this.profilingType = i4;
        this.params = params;
        this.tag = str;
        this.cancellationSignal = cancellationSignal;
    }

    @fg.m
    /* renamed from: a, reason: from getter */
    public final CancellationSignal getCancellationSignal() {
        return this.cancellationSignal;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final Bundle getParams() {
        return this.params;
    }

    /* renamed from: c, reason: from getter */
    public final int getProfilingType() {
        return this.profilingType;
    }

    @fg.m
    /* renamed from: d, reason: from getter */
    public final String getTag() {
        return this.tag;
    }
}
