package kotlin.time;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DurationUnitJvm.kt */
@SinceKotlin(version = "1.6")
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lkotlin/time/DurationUnit;", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V", "getTimeUnit$kotlin_stdlib", "()Ljava/util/concurrent/TimeUnit;", "NANOSECONDS", "MICROSECONDS", "MILLISECONDS", "SECONDS", "MINUTES", "HOURS", "DAYS", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@WasExperimental(markerClass = {ExperimentalTime.class})
/* renamed from: kotlin.time.h, reason: from Kotlin metadata */
/* loaded from: classes5.dex */
public final class DurationUnit {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DurationUnit[] $VALUES;

    @d5.d
    private final TimeUnit timeUnit;
    public static final DurationUnit NANOSECONDS = new DurationUnit(ProtectedSandApp.s("尯"), 0, TimeUnit.NANOSECONDS);
    public static final DurationUnit MICROSECONDS = new DurationUnit(ProtectedSandApp.s("尰"), 1, TimeUnit.MICROSECONDS);
    public static final DurationUnit MILLISECONDS = new DurationUnit(ProtectedSandApp.s("就"), 2, TimeUnit.MILLISECONDS);
    public static final DurationUnit SECONDS = new DurationUnit(ProtectedSandApp.s("尲"), 3, TimeUnit.SECONDS);
    public static final DurationUnit MINUTES = new DurationUnit(ProtectedSandApp.s("尳"), 4, TimeUnit.MINUTES);
    public static final DurationUnit HOURS = new DurationUnit(ProtectedSandApp.s("尴"), 5, TimeUnit.HOURS);
    public static final DurationUnit DAYS = new DurationUnit(ProtectedSandApp.s("尵"), 6, TimeUnit.DAYS);

    private static final /* synthetic */ DurationUnit[] $values() {
        return new DurationUnit[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    static {
        DurationUnit[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private DurationUnit(String str, int i5, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    @d5.d
    public static EnumEntries<DurationUnit> getEntries() {
        return $ENTRIES;
    }

    public static DurationUnit valueOf(String str) {
        return (DurationUnit) Enum.valueOf(DurationUnit.class, str);
    }

    public static DurationUnit[] values() {
        return (DurationUnit[]) $VALUES.clone();
    }

    @d5.d
    /* renamed from: getTimeUnit$kotlin_stdlib, reason: from getter */
    public final TimeUnit getTimeUnit() {
        return this.timeUnit;
    }
}
