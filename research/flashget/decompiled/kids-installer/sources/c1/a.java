package c1;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DownloadEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/flashget/kidsdownloader/event/Action;", "", "(Ljava/lang/String;I)V", "Success", "Failure", "Disconnect", "TIMEOUT", "Default", "Install_intlRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a Success = new a(ProtectedSandApp.s("x"), 0);
    public static final a Failure = new a(ProtectedSandApp.s("y"), 1);
    public static final a Disconnect = new a(ProtectedSandApp.s("z"), 2);
    public static final a TIMEOUT = new a(ProtectedSandApp.s("{"), 3);
    public static final a Default = new a(ProtectedSandApp.s("|"), 4);

    private static final /* synthetic */ a[] $values() {
        return new a[]{Success, Failure, Disconnect, TIMEOUT, Default};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private a(String str, int i5) {
    }

    @d5.d
    public static EnumEntries<a> getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
