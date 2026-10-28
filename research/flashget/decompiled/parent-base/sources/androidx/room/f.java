package androidx.room;

import f3.e;
import kotlin.Metadata;

/* compiled from: AutoClosingRoomOpenHelperFactory.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/room/f;", "Lf3/e$c;", "delegate", "Landroidx/room/d;", "autoCloser", "<init>", "(Lf3/e$c;Landroidx/room/d;)V", "Lf3/e$b;", "configuration", "Landroidx/room/e;", "b", "(Lf3/e$b;)Landroidx/room/e;", "a", "Lf3/e$c;", "Landroidx/room/d;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements e.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final e.c delegate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final d autoCloser;

    public f(@fg.l e.c delegate, @fg.l d autoCloser) {
        kotlin.jvm.internal.l0.p(delegate, "delegate");
        kotlin.jvm.internal.l0.p(autoCloser, "autoCloser");
        this.delegate = delegate;
        this.autoCloser = autoCloser;
    }

    @Override // f3.e.c
    @fg.l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e a(@fg.l e.b configuration) {
        kotlin.jvm.internal.l0.p(configuration, "configuration");
        return new e(this.delegate.a(configuration), this.autoCloser);
    }
}
