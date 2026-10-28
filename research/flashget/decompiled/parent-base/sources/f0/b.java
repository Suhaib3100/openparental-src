package f0;

import androidx.compose.runtime.internal.u;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.w;

/* compiled from: MutableCounter.kt */
@u(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\u0005¨\u0006\u0018"}, d2 = {"Lf0/b;", "", "", "count", "<init>", "(I)V", "that", "Lkotlin/k2;", "e", "a", "()I", "b", "(I)Lf0/b;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "d", "f", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class b {

    /* renamed from: b, reason: collision with root package name */
    public static final int f73846b = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int count;

    public b() {
        this(0, 1, null);
    }

    public static b c(b bVar, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = bVar.count;
        }
        bVar.getClass();
        return new b(i4);
    }

    /* renamed from: a, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @l
    public final b b(int count) {
        return new b(count);
    }

    public final int d() {
        return this.count;
    }

    public final void e(int that) {
        this.count += that;
    }

    public boolean equals(@m Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof b) && this.count == ((b) other).count;
    }

    public final void f(int i4) {
        this.count = i4;
    }

    public int hashCode() {
        return Integer.hashCode(this.count);
    }

    @l
    public String toString() {
        return androidx.view.e.a(new StringBuilder("DeltaCounter(count="), this.count, ')');
    }

    public b(int i4) {
        this.count = i4;
    }

    public /* synthetic */ b(int i4, int i5, w wVar) {
        this((i5 & 1) != 0 ? 0 : i4);
    }
}
