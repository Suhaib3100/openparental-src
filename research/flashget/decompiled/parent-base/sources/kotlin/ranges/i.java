package kotlin.ranges;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.ranges.g;

/* compiled from: Ranges.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0012\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lkotlin/ranges/i;", "", "T", "Lkotlin/ranges/g;", "start", "endInclusive", "<init>", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/Comparable;", "c", "()Ljava/lang/Comparable;", "h", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
class i<T extends Comparable<? super T>> implements g<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final T start;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final T endInclusive;

    public i(@fg.l T t4, @fg.l T t5) {
        l0.p(t4, ProtectedSandApp.s("旖\u0001"));
        l0.p(t5, ProtectedSandApp.s("旗\u0001"));
        this.start = t4;
        this.endInclusive = t5;
    }

    @Override // kotlin.ranges.g
    public boolean b(@fg.l T t4) {
        return g.a.a(this, t4);
    }

    @Override // kotlin.ranges.g
    @fg.l
    public T c() {
        return this.start;
    }

    public boolean equals(@fg.m Object other) {
        if (other instanceof i) {
            if (!isEmpty() || !((i) other).isEmpty()) {
                i iVar = (i) other;
                if (!l0.g(c(), iVar.c()) || !l0.g(h(), iVar.h())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.g
    @fg.l
    public T h() {
        return this.endInclusive;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (c().hashCode() * 31) + h().hashCode();
    }

    @Override // kotlin.ranges.g
    public boolean isEmpty() {
        return g.a.b(this);
    }

    @fg.l
    public String toString() {
        return c() + ProtectedSandApp.s("旘\u0001") + h();
    }
}
