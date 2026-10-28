package db;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import org.threeten.bp.p;
import org.threeten.bp.q;

/* compiled from: YearData.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a-\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\f\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lorg/threeten/bp/p;", "startYear", "", "offset", "Lorg/threeten/bp/d;", "firstDayOfWeek", "Lcb/g;", "outDateStyle", "Lcb/c;", "a", "(Lorg/threeten/bp/p;ILorg/threeten/bp/d;Lcb/g;)Lcb/c;", "targetYear", "b", "(Lorg/threeten/bp/p;Lorg/threeten/bp/p;)I", "endYear", "c", "Calendar-View_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class j {

    /* compiled from: YearData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<org.threeten.bp.j> f73721a = kotlin.enums.c.c(org.threeten.bp.j.values());
    }

    @l
    public static final cb.c a(@l p pVar, int i4, @l org.threeten.bp.d dVar, @l cb.g gVar) {
        l0.p(pVar, ProtectedSandApp.s("㜸\u0001"));
        l0.p(dVar, ProtectedSandApp.s("㜹\u0001"));
        l0.p(gVar, ProtectedSandApp.s("㜺\u0001"));
        p R = pVar.R(i4);
        int size = a.f73721a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i5 = 0; i5 < size; i5++) {
            q n4 = R.n(org.threeten.bp.j.JANUARY);
            l0.o(n4, ProtectedSandApp.s("㜻\u0001"));
            arrayList.add(e.a(n4, i5, dVar, gVar).getCalendarMonth());
        }
        l0.m(R);
        return new cb.c(R, arrayList);
    }

    public static final int b(@l p pVar, @l p pVar2) {
        l0.p(pVar, ProtectedSandApp.s("㜸\u0001"));
        l0.p(pVar2, ProtectedSandApp.s("㜼\u0001"));
        return (int) org.threeten.bp.temporal.b.YEARS.between(pVar, pVar2);
    }

    public static final int c(@l p pVar, @l p pVar2) {
        l0.p(pVar, ProtectedSandApp.s("㜸\u0001"));
        l0.p(pVar2, ProtectedSandApp.s("㜽\u0001"));
        return b(pVar, pVar2) + 1;
    }
}
