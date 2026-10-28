package kotlin.time;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.o2;

/* compiled from: measureTime.kt */
@o2(markerClass = {l.class})
@c1(version = "1.9")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b\u0082\u0002\u0004\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lkotlin/time/t;", "T", "", "value", "Lkotlin/time/e;", "duration", "<init>", "(Ljava/lang/Object;JLkotlin/jvm/internal/w;)V", "a", "()Ljava/lang/Object;", "b", "()J", "c", "(Ljava/lang/Object;J)Lkotlin/time/t;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "f", "J", "e", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class t<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long duration;

    public /* synthetic */ t(Object obj, long j4, w wVar) {
        this(obj, j4);
    }

    public static t d(t tVar, Object obj, long j4, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            obj = tVar.value;
        }
        if ((i4 & 2) != 0) {
            j4 = tVar.duration;
        }
        tVar.getClass();
        return new t(obj, j4);
    }

    public final T a() {
        return this.value;
    }

    /* renamed from: b, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    @fg.l
    public final t<T> c(T value, long duration) {
        return new t<>(value, duration);
    }

    public final long e() {
        return this.duration;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof t)) {
            return false;
        }
        t tVar = (t) other;
        return l0.g(this.value, tVar.value) && e.n(this.duration, tVar.duration);
    }

    public final T f() {
        return this.value;
    }

    public int hashCode() {
        T t4 = this.value;
        return e.a0(this.duration) + ((t4 == null ? 0 : t4.hashCode()) * 31);
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("蕠\u0001") + this.value + ProtectedSandApp.s("蕡\u0001") + ((Object) e.w0(this.duration)) + ')';
    }

    private t(T t4, long j4) {
        this.value = t4;
        this.duration = j4;
    }
}
