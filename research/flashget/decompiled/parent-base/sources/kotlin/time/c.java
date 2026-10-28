package kotlin.time;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.time.r;

/* compiled from: TimeSource.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\u0003H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\b\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lkotlin/time/c;", "Lkotlin/time/r;", "mark", "Lkotlin/time/e;", "adjustment", "<init>", "(Lkotlin/time/r;JLkotlin/jvm/internal/w;)V", "a", "()J", "duration", "D", "(J)Lkotlin/time/r;", "b", "Lkotlin/time/r;", "e", "()Lkotlin/time/r;", "c", "J", "d", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
final class c implements r {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final r mark;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long adjustment;

    public /* synthetic */ c(r rVar, long j4, w wVar) {
        this(rVar, j4);
    }

    @Override // kotlin.time.r
    @fg.l
    public r D(long duration) {
        return new c(this.mark, e.i0(this.adjustment, duration));
    }

    @Override // kotlin.time.r
    @fg.l
    public r I(long j4) {
        return r.a.c(this, j4);
    }

    @Override // kotlin.time.r
    public long a() {
        return e.h0(this.mark.a(), this.adjustment);
    }

    @Override // kotlin.time.r
    public boolean b() {
        return r.a.b(this);
    }

    @Override // kotlin.time.r
    public boolean c() {
        return r.a.a(this);
    }

    /* renamed from: d, reason: from getter */
    public final long getAdjustment() {
        return this.adjustment;
    }

    @fg.l
    /* renamed from: e, reason: from getter */
    public final r getMark() {
        return this.mark;
    }

    private c(r rVar, long j4) {
        l0.p(rVar, ProtectedSandApp.s("蔒\u0001"));
        this.mark = rVar;
        this.adjustment = j4;
    }
}
