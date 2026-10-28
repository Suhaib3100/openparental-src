package androidx.room;

import androidx.room.c2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: QueryInterceptorStatement.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Landroidx/room/u1;", "Lf3/i;", "delegate", "", "sqlStatement", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "Landroidx/room/c2$g;", "queryCallback", "<init>", "(Lf3/i;Ljava/lang/String;Ljava/util/concurrent/Executor;Landroidx/room/c2$g;)V", "", "bindIndex", "", "value", "Lkotlin/k2;", "i", "(ILjava/lang/Object;)V", "close", "()V", "j", "h0", "()I", "", "P1", "()J", "Y1", "R0", "()Ljava/lang/String;", "index", "h3", "(I)V", "C2", "(IJ)V", "", "k0", "(ID)V", "c2", "(ILjava/lang/String;)V", "", "L2", "(I[B)V", "C3", "b", "Lf3/i;", "c", "Ljava/lang/String;", "d", "Ljava/util/concurrent/Executor;", "e", "Landroidx/room/c2$g;", "", "f", "Ljava/util/List;", "bindArgsCache", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class u1 implements f3.i {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final f3.i delegate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String sqlStatement;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Executor queryCallbackExecutor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final c2.g queryCallback;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<Object> bindArgsCache;

    public u1(@fg.l f3.i delegate, @fg.l String sqlStatement, @fg.l Executor queryCallbackExecutor, @fg.l c2.g queryCallback) {
        kotlin.jvm.internal.l0.p(delegate, "delegate");
        kotlin.jvm.internal.l0.p(sqlStatement, "sqlStatement");
        kotlin.jvm.internal.l0.p(queryCallbackExecutor, "queryCallbackExecutor");
        kotlin.jvm.internal.l0.p(queryCallback, "queryCallback");
        this.delegate = delegate;
        this.sqlStatement = sqlStatement;
        this.queryCallbackExecutor = queryCallbackExecutor;
        this.queryCallback = queryCallback;
        this.bindArgsCache = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(u1 this$0) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        this$0.queryCallback.a(this$0.sqlStatement, this$0.bindArgsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(u1 this$0) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        this$0.queryCallback.a(this$0.sqlStatement, this$0.bindArgsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(u1 this$0) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        this$0.queryCallback.a(this$0.sqlStatement, this$0.bindArgsCache);
    }

    private final void i(int bindIndex, Object value) {
        int i4 = bindIndex - 1;
        if (i4 >= this.bindArgsCache.size()) {
            int size = (i4 - this.bindArgsCache.size()) + 1;
            for (int i5 = 0; i5 < size; i5++) {
                this.bindArgsCache.add(null);
            }
        }
        this.bindArgsCache.set(i4, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(u1 this$0) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        this$0.queryCallback.a(this$0.sqlStatement, this$0.bindArgsCache);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(u1 this$0) {
        kotlin.jvm.internal.l0.p(this$0, "this$0");
        this$0.queryCallback.a(this$0.sqlStatement, this$0.bindArgsCache);
    }

    @Override // f3.f
    public void C2(int index, long value) {
        i(index, Long.valueOf(value));
        this.delegate.C2(index, value);
    }

    @Override // f3.f
    public void C3() {
        this.bindArgsCache.clear();
        this.delegate.C3();
    }

    @Override // f3.f
    public void L2(int index, @fg.l byte[] value) {
        kotlin.jvm.internal.l0.p(value, "value");
        i(index, value);
        this.delegate.L2(index, value);
    }

    @Override // f3.i
    public long P1() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.q1
            @Override // java.lang.Runnable
            public final void run() {
                u1.g(u1.this);
            }
        });
        return this.delegate.P1();
    }

    @Override // f3.i
    @fg.m
    public String R0() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.r1
            @Override // java.lang.Runnable
            public final void run() {
                u1.l(u1.this);
            }
        });
        return this.delegate.R0();
    }

    @Override // f3.i
    public long Y1() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.p1
            @Override // java.lang.Runnable
            public final void run() {
                u1.k(u1.this);
            }
        });
        return this.delegate.Y1();
    }

    @Override // f3.f
    public void c2(int index, @fg.l String value) {
        kotlin.jvm.internal.l0.p(value, "value");
        i(index, value);
        this.delegate.c2(index, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // f3.i
    public int h0() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.t1
            @Override // java.lang.Runnable
            public final void run() {
                u1.h(u1.this);
            }
        });
        return this.delegate.h0();
    }

    @Override // f3.f
    public void h3(int index) {
        i(index, null);
        this.delegate.h3(index);
    }

    @Override // f3.i
    public void j() {
        this.queryCallbackExecutor.execute(new Runnable() { // from class: androidx.room.s1
            @Override // java.lang.Runnable
            public final void run() {
                u1.f(u1.this);
            }
        });
        this.delegate.j();
    }

    @Override // f3.f
    public void k0(int index, double value) {
        i(index, Double.valueOf(value));
        this.delegate.k0(index, value);
    }
}
