package kotlin.time;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: measureTime.kt */
@SinceKotlin(version = "1.9")
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\u0005HÆ\u0003ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\bJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b!¨\u0006\u001a"}, d2 = {"Lkotlin/time/TimedValue;", "T", "", "value", "duration", "Lkotlin/time/Duration;", "(Ljava/lang/Object;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDuration-UwyO8pc", "()J", "J", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "component2-UwyO8pc", "copy", "copy-RFiDyg4", "(Ljava/lang/Object;J)Lkotlin/time/TimedValue;", "equals", "", "other", "hashCode", "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
/* renamed from: kotlin.time.t, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final /* data */ class TimedValue<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f27216a;

    /* renamed from: b, reason: collision with root package name */
    private final long f27217b;

    public /* synthetic */ TimedValue(Object obj, long j5, w wVar) {
        this(obj, j5);
    }

    public static TimedValue d(TimedValue timedValue, Object obj, long j5, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            obj = timedValue.f27216a;
        }
        if ((i5 & 2) != 0) {
            j5 = timedValue.f27217b;
        }
        timedValue.getClass();
        return new TimedValue(obj, j5);
    }

    public final T a() {
        return this.f27216a;
    }

    /* renamed from: b, reason: from getter */
    public final long getF27217b() {
        return this.f27217b;
    }

    @d5.d
    public final TimedValue<T> c(T t5, long j5) {
        return new TimedValue<>(t5, j5);
    }

    public final long e() {
        return this.f27217b;
    }

    public boolean equals(@d5.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimedValue)) {
            return false;
        }
        TimedValue timedValue = (TimedValue) other;
        return l0.g(this.f27216a, timedValue.f27216a) && Duration.x(this.f27217b, timedValue.f27217b);
    }

    public final T f() {
        return this.f27216a;
    }

    public int hashCode() {
        T t5 = this.f27216a;
        return Duration.f0(this.f27217b) + ((t5 == null ? 0 : t5.hashCode()) * 31);
    }

    @d5.d
    public String toString() {
        return ProtectedSandApp.s("屠") + this.f27216a + ProtectedSandApp.s("屡") + ((Object) Duration.A0(this.f27217b)) + ')';
    }

    private TimedValue(T t5, long j5) {
        this.f27216a = t5;
        this.f27217b = j5;
    }
}
