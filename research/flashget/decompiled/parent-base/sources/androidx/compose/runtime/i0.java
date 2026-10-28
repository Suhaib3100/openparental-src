package androidx.compose.runtime;

import kotlin.Metadata;

/* compiled from: Composition.kt */
@d1
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/i0;", "", "Landroidx/compose/runtime/tooling/c;", "observer", "", "root", "<init>", "(Landroidx/compose/runtime/tooling/c;Z)V", "a", "Landroidx/compose/runtime/tooling/c;", "()Landroidx/compose/runtime/tooling/c;", "c", "(Landroidx/compose/runtime/tooling/c;)V", "b", "Z", "()Z", "d", "(Z)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final int f16452c = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private androidx.compose.runtime.tooling.c observer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean root;

    /* JADX WARN: Multi-variable type inference failed */
    public i0() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @fg.m
    /* renamed from: a, reason: from getter */
    public final androidx.compose.runtime.tooling.c getObserver() {
        return this.observer;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getRoot() {
        return this.root;
    }

    public final void c(@fg.m androidx.compose.runtime.tooling.c cVar) {
        this.observer = cVar;
    }

    public final void d(boolean z4) {
        this.root = z4;
    }

    public i0(@fg.m androidx.compose.runtime.tooling.c cVar, boolean z4) {
        this.observer = cVar;
        this.root = z4;
    }

    public /* synthetic */ i0(androidx.compose.runtime.tooling.c cVar, boolean z4, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? null : cVar, (i4 & 2) != 0 ? false : z4);
    }
}
