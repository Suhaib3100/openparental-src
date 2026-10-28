package androidx.compose.runtime;

import android.os.Trace;
import kotlin.Metadata;

/* compiled from: ActualAndroid.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/g5;", "", "<init>", "()V", "", "name", "a", "(Ljava/lang/String;)Ljava/lang/Object;", "token", "Lkotlin/k2;", "b", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g5 {

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final g5 f16432a = new g5();

    /* renamed from: b, reason: collision with root package name */
    public static final int f16433b = 0;

    private g5() {
    }

    @fg.m
    public final Object a(@fg.l String name) {
        Trace.beginSection(name);
        return null;
    }

    public final void b(@fg.m Object token) {
        Trace.endSection();
    }
}
