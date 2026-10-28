package kotlin.ranges;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.ranges.r;

/* compiled from: Ranges.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0012\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lkotlin/ranges/h;", "", "T", "Lkotlin/ranges/r;", "start", "endExclusive", "<init>", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/Comparable;", "c", "()Ljava/lang/Comparable;", "i", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
class h<T extends Comparable<? super T>> implements r<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final T start;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final T endExclusive;

    public h(@fg.l T t4, @fg.l T t5) {
        l0.p(t4, ProtectedSandApp.s("旓\u0001"));
        l0.p(t5, ProtectedSandApp.s("旔\u0001"));
        this.start = t4;
        this.endExclusive = t5;
    }

    @Override // kotlin.ranges.r
    public boolean b(@fg.l T t4) {
        return r.a.a(this, t4);
    }

    @Override // kotlin.ranges.r
    @fg.l
    public T c() {
        return this.start;
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof h) {
            if (!isEmpty() || !((h) other).isEmpty()) {
                h hVar = (h) other;
                if (!l0.g(c(), hVar.c()) || !l0.g(i(), hVar.i())) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (c().hashCode() * 31) + i().hashCode();
    }

    @Override // kotlin.ranges.r
    @fg.l
    public T i() {
        return this.endExclusive;
    }

    @Override // kotlin.ranges.r
    public boolean isEmpty() {
        return r.a.b(this);
    }

    @fg.l
    public String toString() {
        return c() + ProtectedSandApp.s("旕\u0001") + i();
    }
}
