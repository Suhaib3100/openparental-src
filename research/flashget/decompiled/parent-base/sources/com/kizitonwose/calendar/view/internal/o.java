package com.kizitonwose.calendar.view.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CalendarPageSnapHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/kizitonwose/calendar/view/internal/o;", "", "<init>", "(Ljava/lang/String;I)V", "Forward", "Backward", "Layout", "Calendar-View_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class o {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ o[] $VALUES;
    public static final o Forward = new o(ProtectedSandApp.s("ᔧ\u0001"), 0);
    public static final o Backward = new o(ProtectedSandApp.s("ᔨ\u0001"), 1);
    public static final o Layout = new o(ProtectedSandApp.s("ᔩ\u0001"), 2);

    private static final /* synthetic */ o[] $values() {
        return new o[]{Forward, Backward, Layout};
    }

    static {
        o[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    private o(String str, int i4) {
    }

    @fg.l
    public static kotlin.enums.a<o> getEntries() {
        return $ENTRIES;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
