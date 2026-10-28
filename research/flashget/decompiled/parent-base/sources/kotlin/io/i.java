package kotlin.io;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FileTreeWalk.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/i;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_DOWN", "BOTTOM_UP", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class i {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i TOP_DOWN = new i(ProtectedSandApp.s("揹\u0001"), 0);
    public static final i BOTTOM_UP = new i(ProtectedSandApp.s("揺\u0001"), 1);

    private static final /* synthetic */ i[] $values() {
        return new i[]{TOP_DOWN, BOTTOM_UP};
    }

    static {
        i[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private i(String str, int i4) {
    }

    @fg.l
    public static kotlin.enums.a<i> getEntries() {
        return $ENTRIES;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
