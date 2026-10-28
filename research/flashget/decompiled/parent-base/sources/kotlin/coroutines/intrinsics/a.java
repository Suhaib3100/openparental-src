package kotlin.coroutines.intrinsics;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.w0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Intrinsics.kt */
@c1(version = "1.3")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/coroutines/intrinsics/a;", "", "<init>", "(Ljava/lang/String;I)V", "COROUTINE_SUSPENDED", "UNDECIDED", "RESUMED", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w0
/* loaded from: classes7.dex */
public final class a {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a COROUTINE_SUSPENDED = new a(ProtectedSandApp.s("挘\u0001"), 0);
    public static final a UNDECIDED = new a(ProtectedSandApp.s("挙\u0001"), 1);
    public static final a RESUMED = new a(ProtectedSandApp.s("挚\u0001"), 2);

    private static final /* synthetic */ a[] $values() {
        return new a[]{COROUTINE_SUSPENDED, UNDECIDED, RESUMED};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private a(String str, int i4) {
    }

    @l
    public static kotlin.enums.a<a> getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
