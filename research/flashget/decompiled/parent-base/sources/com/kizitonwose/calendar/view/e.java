package com.kizitonwose.calendar.view;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DaySize.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/kizitonwose/calendar/view/e;", "", "<init>", "(Ljava/lang/String;I)V", "", "getParentDecidesWidth$Calendar_View_release", "()Z", "parentDecidesWidth", "getParentDecidesHeight$Calendar_View_release", "parentDecidesHeight", "Square", "Rectangle", "SeventhWidth", "FreeForm", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class e {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e Square = new e(ProtectedSandApp.s("ᓌ\u0001"), 0);
    public static final e Rectangle = new e(ProtectedSandApp.s("ᓍ\u0001"), 1);
    public static final e SeventhWidth = new e(ProtectedSandApp.s("ᓎ\u0001"), 2);
    public static final e FreeForm = new e(ProtectedSandApp.s("ᓏ\u0001"), 3);

    private static final /* synthetic */ e[] $values() {
        return new e[]{Square, Rectangle, SeventhWidth, FreeForm};
    }

    static {
        e[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private e(String str, int i4) {
    }

    @fg.l
    public static kotlin.enums.a<e> getEntries() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final boolean getParentDecidesHeight$Calendar_View_release() {
        return this == Rectangle;
    }

    public final boolean getParentDecidesWidth$Calendar_View_release() {
        return this == Square || this == SeventhWidth || this == Rectangle;
    }
}
