package androidx.compose.material3;

import kotlin.Metadata;

/* compiled from: DateInput.kt */
@androidx.compose.runtime.x4
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0001\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u001b\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010%R\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010%R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b\u001f\u0010+\"\u0004\b#\u0010,R$\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010*\u001a\u0004\b\u001d\u0010+\"\u0004\b!\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"Landroidx/compose/material3/t3;", "", "Lkotlin/ranges/l;", "yearRange", "Landroidx/compose/material3/s8;", "selectableDates", "Landroidx/compose/material3/q3;", "dateInputFormat", "Landroidx/compose/material3/x3;", "dateFormatter", "", "errorDatePattern", "errorDateOutOfYearRange", "errorInvalidNotAllowed", "errorInvalidRangeInput", "", "currentStartDateMillis", "currentEndDateMillis", "<init>", "(Lkotlin/ranges/l;Landroidx/compose/material3/s8;Landroidx/compose/material3/q3;Landroidx/compose/material3/x3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "Landroidx/compose/material3/r0;", "dateToValidate", "Landroidx/compose/material3/y5;", "inputIdentifier", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "e", "(Landroidx/compose/material3/r0;ILjava/util/Locale;)Ljava/lang/String;", "a", "Lkotlin/ranges/l;", "b", "Landroidx/compose/material3/s8;", "c", "Landroidx/compose/material3/q3;", "d", "Landroidx/compose/material3/x3;", "Ljava/lang/String;", "f", "g", "h", "i", "Ljava/lang/Long;", "()Ljava/lang/Long;", "(Ljava/lang/Long;)V", "j", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t3 {

    /* renamed from: k, reason: collision with root package name */
    public static final int f14562k = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final kotlin.ranges.l yearRange;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final s8 selectableDates;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final q3 dateInputFormat;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final x3 dateFormatter;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String errorDatePattern;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String errorDateOutOfYearRange;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String errorInvalidNotAllowed;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String errorInvalidRangeInput;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Long currentStartDateMillis;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private Long currentEndDateMillis;

    public t3(@fg.l kotlin.ranges.l lVar, @fg.l s8 s8Var, @fg.l q3 q3Var, @fg.l x3 x3Var, @fg.l String str, @fg.l String str2, @fg.l String str3, @fg.l String str4, @fg.m Long l4, @fg.m Long l5) {
        this.yearRange = lVar;
        this.selectableDates = s8Var;
        this.dateInputFormat = q3Var;
        this.dateFormatter = x3Var;
        this.errorDatePattern = str;
        this.errorDateOutOfYearRange = str2;
        this.errorInvalidNotAllowed = str3;
        this.errorInvalidRangeInput = str4;
        this.currentStartDateMillis = l4;
        this.currentEndDateMillis = l5;
    }

    @fg.m
    /* renamed from: a, reason: from getter */
    public final Long getCurrentEndDateMillis() {
        return this.currentEndDateMillis;
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final Long getCurrentStartDateMillis() {
        return this.currentStartDateMillis;
    }

    public final void c(@fg.m Long l4) {
        this.currentEndDateMillis = l4;
    }

    public final void d(@fg.m Long l4) {
        this.currentStartDateMillis = l4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        if (r0 < (r2 != null ? r2.longValue() : Long.MAX_VALUE)) goto L23;
     */
    @fg.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e(@fg.m androidx.compose.material3.r0 r9, int r10, @fg.l java.util.Locale r11) {
        /*
            r8 = this;
            r0 = 1
            java.lang.String r1 = "format(this, *args)"
            if (r9 != 0) goto L21
            java.lang.String r9 = r8.errorDatePattern
            androidx.compose.material3.q3 r10 = r8.dateInputFormat
            java.lang.String r10 = r10.f()
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r10 = r10.toUpperCase(r11)
            java.lang.String r11 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.l0.o(r10, r11)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r9 = androidx.compose.material3.s3.a(r10, r0, r9, r1)
            return r9
        L21:
            kotlin.ranges.l r2 = r8.yearRange
            int r3 = r9.l()
            boolean r2 = r2.r(r3)
            if (r2 != 0) goto L52
            java.lang.String r9 = r8.errorDateOutOfYearRange
            kotlin.ranges.l r10 = r8.yearRange
            int r2 = r10.getFirst()
            r6 = 7
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            java.lang.String r10 = androidx.compose.material3.b.d(r2, r3, r4, r5, r6, r7)
            kotlin.ranges.l r11 = r8.yearRange
            int r2 = r11.getLast()
            java.lang.String r11 = androidx.compose.material3.b.d(r2, r3, r4, r5, r6, r7)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r11}
            r11 = 2
            java.lang.String r9 = androidx.compose.material3.s3.a(r10, r11, r9, r1)
            return r9
        L52:
            androidx.compose.material3.s8 r2 = r8.selectableDates
            int r3 = r9.l()
            boolean r3 = r2.a(r3)
            if (r3 == 0) goto Lb4
            long r3 = r9.k()
            boolean r2 = r2.b(r3)
            if (r2 != 0) goto L69
            goto Lb4
        L69:
            androidx.compose.material3.y5$a r11 = androidx.compose.material3.y5.INSTANCE
            r11.getClass()
            int r0 = androidx.compose.material3.y5.c()
            boolean r0 = androidx.compose.material3.y5.g(r10, r0)
            if (r0 == 0) goto L8e
            long r0 = r9.k()
            java.lang.Long r2 = r8.currentEndDateMillis
            if (r2 == 0) goto L85
            long r2 = r2.longValue()
            goto L8a
        L85:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L8a:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto Lae
        L8e:
            r11.getClass()
            int r11 = androidx.compose.material3.y5.a()
            boolean r10 = androidx.compose.material3.y5.g(r10, r11)
            if (r10 == 0) goto Lb1
            long r9 = r9.k()
            java.lang.Long r11 = r8.currentStartDateMillis
            if (r11 == 0) goto La8
            long r0 = r11.longValue()
            goto Laa
        La8:
            r0 = -9223372036854775808
        Laa:
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 >= 0) goto Lb1
        Lae:
            java.lang.String r9 = r8.errorInvalidRangeInput
            return r9
        Lb1:
            java.lang.String r9 = ""
            return r9
        Lb4:
            java.lang.String r10 = r8.errorInvalidNotAllowed
            androidx.compose.material3.x3 r2 = r8.dateFormatter
            long r3 = r9.k()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r6 = 4
            r7 = 0
            r5 = 0
            r4 = r11
            java.lang.String r9 = androidx.compose.material3.x3.a(r2, r3, r4, r5, r6, r7)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r9 = androidx.compose.material3.s3.a(r9, r0, r10, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.t3.e(androidx.compose.material3.r0, int, java.util.Locale):java.lang.String");
    }

    public /* synthetic */ t3(kotlin.ranges.l lVar, s8 s8Var, q3 q3Var, x3 x3Var, String str, String str2, String str3, String str4, Long l4, Long l5, int i4, kotlin.jvm.internal.w wVar) {
        this(lVar, s8Var, q3Var, x3Var, str, str2, str3, str4, (i4 & 256) != 0 ? null : l4, (i4 & 512) != 0 ? null : l5);
    }
}
