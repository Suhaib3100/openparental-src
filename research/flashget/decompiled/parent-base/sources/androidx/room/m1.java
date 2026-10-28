package androidx.room;

import androidx.room.c2;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: QueryInterceptorOpenHelper.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Landroidx/room/m1;", "Lf3/e;", "Landroidx/room/p;", "delegate", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "Landroidx/room/c2$g;", "queryCallback", "<init>", "(Lf3/e;Ljava/util/concurrent/Executor;Landroidx/room/c2$g;)V", "Lkotlin/k2;", "close", "()V", "", "enabled", "setWriteAheadLoggingEnabled", "(Z)V", "b", "Lf3/e;", "getDelegate", "()Lf3/e;", "c", "Ljava/util/concurrent/Executor;", "d", "Landroidx/room/c2$g;", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lf3/d;", "O2", "()Lf3/d;", "writableDatabase", "K2", "readableDatabase", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m1 implements f3.e, p {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final f3.e delegate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Executor queryCallbackExecutor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c2.g queryCallback;

    public m1(@fg.l f3.e delegate, @fg.l Executor queryCallbackExecutor, @fg.l c2.g queryCallback) {
        kotlin.jvm.internal.l0.p(delegate, "delegate");
        kotlin.jvm.internal.l0.p(queryCallbackExecutor, "queryCallbackExecutor");
        kotlin.jvm.internal.l0.p(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.queryCallbackExecutor = queryCallbackExecutor;
        this.queryCallback = queryCallback;
    }

    @Override // f3.e
    @fg.l
    public f3.d K2() {
        return new l1(this.delegate.K2(), this.queryCallbackExecutor, this.queryCallback);
    }

    @Override // f3.e
    @fg.l
    public f3.d O2() {
        return new l1(this.delegate.O2(), this.queryCallbackExecutor, this.queryCallback);
    }

    @Override // f3.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // f3.e
    @fg.m
    /* renamed from: getDatabaseName */
    public String getName() {
        return this.delegate.getName();
    }

    @Override // androidx.room.p
    @fg.l
    public f3.e getDelegate() {
        return this.delegate;
    }

    @Override // f3.e
    @androidx.annotation.x0(api = 16)
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        this.delegate.setWriteAheadLoggingEnabled(enabled);
    }
}
