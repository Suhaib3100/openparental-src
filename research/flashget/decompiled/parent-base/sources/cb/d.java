package cb;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DayPosition.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcb/d;", "", "<init>", "(Ljava/lang/String;I)V", "InDate", "MonthDate", "OutDate", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class d {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d InDate = new d(ProtectedSandApp.s("\uf0d4"), 0);
    public static final d MonthDate = new d(ProtectedSandApp.s("\uf0d5"), 1);
    public static final d OutDate = new d(ProtectedSandApp.s("\uf0d6"), 2);

    private static final /* synthetic */ d[] $values() {
        return new d[]{InDate, MonthDate, OutDate};
    }

    static {
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private d(String str, int i4) {
    }

    @l
    public static kotlin.enums.a<d> getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
