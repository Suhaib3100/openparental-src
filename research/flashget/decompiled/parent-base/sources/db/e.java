package db;

import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import org.threeten.bp.q;

/* compiled from: MonthData.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\u001a-\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a?\u0010\r\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a%\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lorg/threeten/bp/q;", "startMonth", "", "offset", "Lorg/threeten/bp/d;", "firstDayOfWeek", "Lcb/g;", "outDateStyle", "Ldb/d;", "a", "(Lorg/threeten/bp/q;ILorg/threeten/bp/d;Lcb/g;)Ldb/d;", "", "skipMonths", "b", "(Lorg/threeten/bp/q;ILorg/threeten/bp/d;Lcb/g;Ljava/util/List;)Ldb/d;", "d", "(Lorg/threeten/bp/q;ILorg/threeten/bp/d;)Ldb/d;", "targetMonth", "e", "(Lorg/threeten/bp/q;Lorg/threeten/bp/q;)I", "endMonth", "f", "Calendar-View_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nMonthData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonthData.kt\ncom/kizitonwose/calendar/data/MonthDataKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,144:1\n1855#2,2:145\n*S KotlinDebug\n*F\n+ 1 MonthData.kt\ncom/kizitonwose/calendar/data/MonthDataKt\n*L\n80#1:145,2\n*E\n"})
/* loaded from: classes6.dex */
public final class e {
    @l
    public static final d a(@l q qVar, int i4, @l org.threeten.bp.d dVar, @l cb.g gVar) {
        l0.p(qVar, ProtectedSandApp.s("㜘\u0001"));
        l0.p(dVar, ProtectedSandApp.s("㜙\u0001"));
        l0.p(gVar, ProtectedSandApp.s("㜚\u0001"));
        q V = qVar.V(i4);
        l0.m(V);
        org.threeten.bp.d d02 = cb.f.a(V).d0();
        l0.o(d02, ProtectedSandApp.s("㜛\u0001"));
        int a5 = c.a(dVar, d02);
        int z4 = V.z() + a5;
        int i5 = z4 % 7;
        int i6 = i5 != 0 ? 7 - i5 : 0;
        return new d(V, a5, i6 + (gVar != cb.g.EndOfRow ? (6 - ((z4 + i6) / 7)) * 7 : 0));
    }

    @l
    public static final d b(@l q qVar, int i4, @l org.threeten.bp.d dVar, @l cb.g gVar, @m List<q> list) {
        int i5;
        l0.p(qVar, ProtectedSandApp.s("㜘\u0001"));
        l0.p(dVar, ProtectedSandApp.s("㜙\u0001"));
        l0.p(gVar, ProtectedSandApp.s("㜚\u0001"));
        long j4 = i4;
        List q5 = list != null ? w.q5(list) : null;
        if (q5 != null) {
            Iterator it = q5.iterator();
            i5 = 0;
            while (it.hasNext()) {
                int e4 = e(qVar, (q) it.next());
                if (e4 >= 0 && e4 <= i4) {
                    i5++;
                }
            }
        } else {
            i5 = 0;
        }
        long j5 = j4 + i5;
        q V = qVar.V(j5);
        if (list != null) {
            while (list.contains(V)) {
                j5++;
                V = qVar.V(j5);
            }
        }
        String s4 = ProtectedSandApp.s("㜜\u0001");
        l0.o(V, s4);
        org.threeten.bp.d d02 = cb.f.a(V).d0();
        l0.o(d02, ProtectedSandApp.s("㜛\u0001"));
        int a5 = c.a(dVar, d02);
        int z4 = V.z() + a5;
        int i6 = z4 % 7;
        int i7 = i6 != 0 ? 7 - i6 : 0;
        int i10 = gVar != cb.g.EndOfRow ? (6 - ((z4 + i7) / 7)) * 7 : 0;
        l0.o(V, s4);
        return new d(V, a5, i7 + i10);
    }

    public static /* synthetic */ d c(q qVar, int i4, org.threeten.bp.d dVar, cb.g gVar, List list, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            list = null;
        }
        return b(qVar, i4, dVar, gVar, list);
    }

    @l
    public static final d d(@l q qVar, int i4, @l org.threeten.bp.d dVar) {
        int i5;
        l0.p(qVar, ProtectedSandApp.s("㜘\u0001"));
        l0.p(dVar, ProtectedSandApp.s("㜙\u0001"));
        q V = qVar.V(i4);
        l0.m(V);
        org.threeten.bp.g a5 = cb.f.a(V);
        String s4 = ProtectedSandApp.s("㜛\u0001");
        if (i4 == 0) {
            org.threeten.bp.d d02 = a5.d0();
            l0.o(d02, s4);
            i5 = c.a(dVar, d02);
        } else {
            org.threeten.bp.d d03 = a5.d0();
            l0.o(d03, s4);
            i5 = -c.a(d03, dVar);
        }
        int z4 = (V.z() + i5) % 7;
        return new d(V, i5, z4 != 0 ? 7 - z4 : 0);
    }

    public static final int e(@l q qVar, @l q qVar2) {
        l0.p(qVar, ProtectedSandApp.s("㜘\u0001"));
        l0.p(qVar2, ProtectedSandApp.s("㜝\u0001"));
        return (int) org.threeten.bp.temporal.b.MONTHS.between(qVar, qVar2);
    }

    public static final int f(@l q qVar, @l q qVar2) {
        l0.p(qVar, ProtectedSandApp.s("㜘\u0001"));
        l0.p(qVar2, ProtectedSandApp.s("㜞\u0001"));
        return e(qVar, qVar2) + 1;
    }
}
