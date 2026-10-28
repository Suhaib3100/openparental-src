package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: CalendarModel.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0007\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"", "localeFormat", "Landroidx/compose/material3/q3;", "a", "(Ljava/lang/String;)Landroidx/compose/material3/q3;", "", "I", "DaysInWeek", "", "b", "J", "MillisecondsIn24Hours", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f11337a = 7;

    /* renamed from: b, reason: collision with root package name */
    public static final long f11338b = 86400000;

    @fg.l
    @f5
    public static final q3 a(@fg.l String str) {
        String g4 = kotlin.text.v.g4(kotlin.text.v.i2(new kotlin.text.r("y{1,4}").m(new kotlin.text.r("M{1,2}").m(new kotlin.text.r("d{1,2}").m(new kotlin.text.r("[^dMy/\\-.]").m(str, ""), "dd"), "MM"), "yyyy"), "My", "M/y", false, 4, null), ".");
        kotlin.text.p d5 = kotlin.text.r.d(new kotlin.text.r("[/\\-.]"), g4, 0, 2, null);
        kotlin.jvm.internal.l0.m(d5);
        kotlin.text.m mVar = d5.getGroups().get(0);
        kotlin.jvm.internal.l0.m(mVar);
        int first = mVar.e().getFirst();
        String substring = g4.substring(first, first + 1);
        kotlin.jvm.internal.l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return new q3(g4, substring.charAt(0));
    }
}
