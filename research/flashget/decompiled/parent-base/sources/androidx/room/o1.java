package androidx.room;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: QueryInterceptorProgram.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0003R\"\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/room/o1;", "Lf3/f;", "<init>", "()V", "", "bindIndex", "", "value", "Lkotlin/k2;", "b", "(ILjava/lang/Object;)V", "index", "h3", "(I)V", "", "C2", "(IJ)V", "", "k0", "(ID)V", "", "c2", "(ILjava/lang/String;)V", "", "L2", "(I[B)V", "C3", "close", "", "Ljava/util/List;", "a", "()Ljava/util/List;", "bindArgsCache", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o1 implements f3.f {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final List<Object> bindArgsCache = new ArrayList();

    private final void b(int bindIndex, Object value) {
        int size;
        int i4 = bindIndex - 1;
        if (i4 >= this.bindArgsCache.size() && (size = this.bindArgsCache.size()) <= i4) {
            while (true) {
                this.bindArgsCache.add(null);
                if (size == i4) {
                    break;
                } else {
                    size++;
                }
            }
        }
        this.bindArgsCache.set(i4, value);
    }

    @Override // f3.f
    public void C2(int index, long value) {
        b(index, Long.valueOf(value));
    }

    @Override // f3.f
    public void C3() {
        this.bindArgsCache.clear();
    }

    @Override // f3.f
    public void L2(int index, @fg.l byte[] value) {
        kotlin.jvm.internal.l0.p(value, "value");
        b(index, value);
    }

    @fg.l
    public final List<Object> a() {
        return this.bindArgsCache;
    }

    @Override // f3.f
    public void c2(int index, @fg.l String value) {
        kotlin.jvm.internal.l0.p(value, "value");
        b(index, value);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // f3.f
    public void h3(int index) {
        b(index, null);
    }

    @Override // f3.f
    public void k0(int index, double value) {
        b(index, Double.valueOf(value));
    }
}
