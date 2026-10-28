package cb;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OutDateStyle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcb/g;", "", "<init>", "(Ljava/lang/String;I)V", "EndOfRow", "EndOfGrid", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class g {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ g[] $VALUES;
    public static final g EndOfRow = new g(ProtectedSandApp.s("\uf0e0"), 0);
    public static final g EndOfGrid = new g(ProtectedSandApp.s("\uf0e1"), 1);

    private static final /* synthetic */ g[] $values() {
        return new g[]{EndOfRow, EndOfGrid};
    }

    static {
        g[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private g(String str, int i4) {
    }

    @l
    public static kotlin.enums.a<g> getEntries() {
        return $ENTRIES;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) $VALUES.clone();
    }
}
