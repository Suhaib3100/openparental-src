package kotlin.time;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.time.TimeMark;

/* compiled from: TimeSource.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u000b\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0007J\u0018\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lkotlin/time/AdjustedTimeMark;", "Lkotlin/time/TimeMark;", "mark", "adjustment", "Lkotlin/time/Duration;", "(Lkotlin/time/TimeMark;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAdjustment-UwyO8pc", "()J", "J", "getMark", "()Lkotlin/time/TimeMark;", "elapsedNow", "elapsedNow-UwyO8pc", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.time.c, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
final class AdjustedTimeMark implements TimeMark {

    /* renamed from: o, reason: collision with root package name */
    @d5.d
    private final TimeMark f27194o;

    /* renamed from: p, reason: collision with root package name */
    private final long f27195p;

    public /* synthetic */ AdjustedTimeMark(TimeMark timeMark, long j5, w wVar) {
        this(timeMark, j5);
    }

    /* renamed from: a, reason: from getter */
    public final long getF27195p() {
        return this.f27195p;
    }

    @d5.d
    /* renamed from: b, reason: from getter */
    public final TimeMark getF27194o() {
        return this.f27194o;
    }

    @Override // kotlin.time.TimeMark
    @d5.d
    public TimeMark c(long j5) {
        return TimeMark.a.c(this, j5);
    }

    @Override // kotlin.time.TimeMark
    @d5.d
    public TimeMark d(long j5) {
        return new AdjustedTimeMark(this.f27194o, Duration.n0(this.f27195p, j5));
    }

    @Override // kotlin.time.TimeMark
    public boolean g() {
        return TimeMark.a.b(this);
    }

    @Override // kotlin.time.TimeMark
    public long h() {
        return Duration.m0(this.f27194o.h(), this.f27195p);
    }

    @Override // kotlin.time.TimeMark
    public boolean j() {
        return TimeMark.a.a(this);
    }

    private AdjustedTimeMark(TimeMark timeMark, long j5) {
        l0.p(timeMark, ProtectedSandApp.s("寳"));
        this.f27194o = timeMark;
        this.f27195p = j5;
    }
}
