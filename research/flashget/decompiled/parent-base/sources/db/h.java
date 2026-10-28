package db;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: WeekData.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0012¨\u0006\u0015"}, d2 = {"Lorg/threeten/bp/g;", "startDate", "endDate", "Lorg/threeten/bp/d;", "firstDayOfWeek", "Ldb/i;", "a", "(Lorg/threeten/bp/g;Lorg/threeten/bp/g;Lorg/threeten/bp/d;)Ldb/i;", "startDateAdjusted", "", "offset", "desiredStartDate", "desiredEndDate", "Ldb/g;", "b", "(Lorg/threeten/bp/g;ILorg/threeten/bp/g;Lorg/threeten/bp/g;)Ldb/g;", "date", "c", "(Lorg/threeten/bp/g;Lorg/threeten/bp/g;)I", "endDateAdjusted", "d", "Calendar-View_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class h {
    @l
    public static final i a(@l org.threeten.bp.g gVar, @l org.threeten.bp.g gVar2, @l org.threeten.bp.d dVar) {
        l0.p(gVar, ProtectedSandApp.s("㜪\u0001"));
        l0.p(gVar2, ProtectedSandApp.s("㜫\u0001"));
        l0.p(dVar, ProtectedSandApp.s("㜬\u0001"));
        l0.o(gVar.d0(), ProtectedSandApp.s("㜭\u0001"));
        org.threeten.bp.g m02 = gVar.m0(c.a(dVar, r0));
        org.threeten.bp.g F0 = m02.H0((int) org.threeten.bp.temporal.b.WEEKS.between(m02, gVar2)).F0(6L);
        l0.m(m02);
        l0.m(F0);
        return new i(m02, F0);
    }

    @l
    public static final g b(@l org.threeten.bp.g gVar, int i4, @l org.threeten.bp.g gVar2, @l org.threeten.bp.g gVar3) {
        l0.p(gVar, ProtectedSandApp.s("㜮\u0001"));
        l0.p(gVar2, ProtectedSandApp.s("㜯\u0001"));
        l0.p(gVar3, ProtectedSandApp.s("㜰\u0001"));
        org.threeten.bp.g H0 = gVar.H0(i4);
        l0.m(H0);
        return new g(H0, gVar2, gVar3);
    }

    public static final int c(@l org.threeten.bp.g gVar, @l org.threeten.bp.g gVar2) {
        l0.p(gVar, ProtectedSandApp.s("㜮\u0001"));
        l0.p(gVar2, ProtectedSandApp.s("㜱\u0001"));
        return (int) org.threeten.bp.temporal.b.WEEKS.between(gVar, gVar2);
    }

    public static final int d(@l org.threeten.bp.g gVar, @l org.threeten.bp.g gVar2) {
        l0.p(gVar, ProtectedSandApp.s("㜮\u0001"));
        l0.p(gVar2, ProtectedSandApp.s("㜲\u0001"));
        return c(gVar, gVar2) + 1;
    }
}
