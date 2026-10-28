package c1;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InstallEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/flashget/kidsdownloader/event/InstallAction;", "", "(Ljava/lang/String;I)V", "Success", "Failure", "Open_Kid_Error", "Installation_Failure", "Default", "Install_intlRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e Success = new e(ProtectedSandApp.s("\u0085"), 0);
    public static final e Failure = new e(ProtectedSandApp.s("\u0086"), 1);
    public static final e Open_Kid_Error = new e(ProtectedSandApp.s("\u0087"), 2);
    public static final e Installation_Failure = new e(ProtectedSandApp.s("\u0088"), 3);
    public static final e Default = new e(ProtectedSandApp.s("\u0089"), 4);

    private static final /* synthetic */ e[] $values() {
        return new e[]{Success, Failure, Open_Kid_Error, Installation_Failure, Default};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private e(String str, int i5) {
    }

    @d5.d
    public static EnumEntries<e> getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
