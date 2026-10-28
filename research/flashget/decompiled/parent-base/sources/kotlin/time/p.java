package kotlin.time;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.time.s;

/* compiled from: MonoTimeSource.kt */
@c1(version = "1.3")
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0006J\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lkotlin/time/p;", "Lkotlin/time/s$c;", "<init>", "()V", "", "f", "()J", "", "toString", "()Ljava/lang/String;", "Lkotlin/time/s$b$a;", "e", "timeMark", "Lkotlin/time/e;", "d", "(J)J", "one", "another", "c", "(JJ)J", "duration", "b", "J", "zero", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class p implements s.c {

    /* renamed from: b, reason: collision with root package name */
    @fg.l
    public static final p f79222b = new p();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final long zero = System.nanoTime();

    private p() {
    }

    private final long f() {
        return System.nanoTime() - zero;
    }

    @Override // kotlin.time.s.c, kotlin.time.s
    public d a() {
        return s.b.a.d(f());
    }

    public final long b(long timeMark, long duration) {
        return m.d(timeMark, h.NANOSECONDS, duration);
    }

    public final long c(long one, long another) {
        return m.h(one, another, h.NANOSECONDS);
    }

    public final long d(long timeMark) {
        return m.f(f(), timeMark, h.NANOSECONDS);
    }

    public long e() {
        return f();
    }

    @fg.l
    public String toString() {
        return ProtectedSandApp.s("蕘\u0001");
    }

    @Override // kotlin.time.s
    public r a() {
        return s.b.a.d(f());
    }
}
