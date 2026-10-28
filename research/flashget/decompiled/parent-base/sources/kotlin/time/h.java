package kotlin.time;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.o2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DurationUnitJvm.kt */
@o2(markerClass = {l.class})
@c1(version = "1.6")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/time/h;", "", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V", "Ljava/util/concurrent/TimeUnit;", "getTimeUnit$kotlin_stdlib", "()Ljava/util/concurrent/TimeUnit;", "NANOSECONDS", "MICROSECONDS", "MILLISECONDS", "SECONDS", "MINUTES", "HOURS", "DAYS", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class h {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;

    @fg.l
    private final TimeUnit timeUnit;
    public static final h NANOSECONDS = new h(ProtectedSandApp.s("蔽\u0001"), 0, TimeUnit.NANOSECONDS);
    public static final h MICROSECONDS = new h(ProtectedSandApp.s("蔾\u0001"), 1, TimeUnit.MICROSECONDS);
    public static final h MILLISECONDS = new h(ProtectedSandApp.s("蔿\u0001"), 2, TimeUnit.MILLISECONDS);
    public static final h SECONDS = new h(ProtectedSandApp.s("蕀\u0001"), 3, TimeUnit.SECONDS);
    public static final h MINUTES = new h(ProtectedSandApp.s("蕁\u0001"), 4, TimeUnit.MINUTES);
    public static final h HOURS = new h(ProtectedSandApp.s("蕂\u0001"), 5, TimeUnit.HOURS);
    public static final h DAYS = new h(ProtectedSandApp.s("蕃\u0001"), 6, TimeUnit.DAYS);

    private static final /* synthetic */ h[] $values() {
        return new h[]{NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private h(String str, int i4, TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    @fg.l
    public static kotlin.enums.a<h> getEntries() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    @fg.l
    /* renamed from: getTimeUnit$kotlin_stdlib, reason: from getter */
    public final TimeUnit getTimeUnit() {
        return this.timeUnit;
    }
}
