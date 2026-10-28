package androidx.collection;

import kotlin.Metadata;

/* compiled from: LongLongPair.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\t\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Landroidx/collection/z0;", "", "", "first", "second", "<init>", "(JJ)V", "a", "()J", "b", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "c", "d", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long first;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long second;

    public z0(long j4, long j5) {
        this.first = j4;
        this.second = j5;
    }

    /* renamed from: a, reason: from getter */
    public final long getFirst() {
        return this.first;
    }

    /* renamed from: b, reason: from getter */
    public final long getSecond() {
        return this.second;
    }

    public final long c() {
        return this.first;
    }

    public final long d() {
        return this.second;
    }

    public boolean equals(@fg.m Object other) {
        if (!(other instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) other;
        return z0Var.first == this.first && z0Var.second == this.second;
    }

    public int hashCode() {
        return Long.hashCode(this.first) ^ Long.hashCode(this.second);
    }

    @fg.l
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.first);
        sb.append(", ");
        return y0.a(sb, this.second, ')');
    }
}
