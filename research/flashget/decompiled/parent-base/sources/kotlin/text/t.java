package kotlin.text;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Regex.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u001b\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\u000b\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/text/t;", "", "Lkotlin/text/i;", "", "value", "mask", "<init>", "(Ljava/lang/String;III)V", "I", "getValue", "()I", "getMask", "IGNORE_CASE", "MULTILINE", "LITERAL", "UNIX_LINES", "COMMENTS", "DOT_MATCHES_ALL", "CANON_EQ", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class t implements i {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t CANON_EQ;
    public static final t COMMENTS;
    public static final t DOT_MATCHES_ALL;
    public static final t IGNORE_CASE;
    public static final t LITERAL;
    public static final t MULTILINE;
    public static final t UNIX_LINES;
    private final int mask;
    private final int value;

    private static final /* synthetic */ t[] $values() {
        return new t[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    static {
        int i4 = 2;
        IGNORE_CASE = new t(ProtectedSandApp.s("蓷\u0001"), 0, i4, 0, 2, null);
        int i5 = 2;
        kotlin.jvm.internal.w wVar = null;
        int i6 = 0;
        MULTILINE = new t(ProtectedSandApp.s("蓸\u0001"), 1, 8, i6, i5, wVar);
        int i7 = 2;
        kotlin.jvm.internal.w wVar2 = null;
        int i10 = 0;
        LITERAL = new t(ProtectedSandApp.s("蓹\u0001"), i4, 16, i10, i7, wVar2);
        UNIX_LINES = new t(ProtectedSandApp.s("蓺\u0001"), 3, 1, i6, i5, wVar);
        COMMENTS = new t(ProtectedSandApp.s("蓻\u0001"), 4, 4, i10, i7, wVar2);
        DOT_MATCHES_ALL = new t(ProtectedSandApp.s("蓼\u0001"), 5, 32, i6, i5, wVar);
        CANON_EQ = new t(ProtectedSandApp.s("蓽\u0001"), 6, 128, i10, i7, wVar2);
        t[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private t(String str, int i4, int i5, int i6) {
        this.value = i5;
        this.mask = i6;
    }

    @fg.l
    public static kotlin.enums.a<t> getEntries() {
        return $ENTRIES;
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }

    @Override // kotlin.text.i
    public int getMask() {
        return this.mask;
    }

    @Override // kotlin.text.i
    public int getValue() {
        return this.value;
    }

    /* synthetic */ t(String str, int i4, int i5, int i6, int i7, kotlin.jvm.internal.w wVar) {
        this(str, i4, i5, (i7 & 2) != 0 ? i5 : i6);
    }
}
