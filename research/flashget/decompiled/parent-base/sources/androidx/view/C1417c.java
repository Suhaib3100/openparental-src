package androidx.view;

import androidx.annotation.x0;
import fg.l;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: CoroutineLiveData.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/c;", "", "<init>", "()V", "Ljava/time/Duration;", "timeout", "", "a", "(Ljava/time/Duration;)J", "lifecycle-livedata-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@x0(26)
/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1417c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final C1417c f30247a = new C1417c();

    private C1417c() {
    }

    public final long a(@l Duration timeout) {
        l0.p(timeout, "timeout");
        return timeout.toMillis();
    }
}
