package t3;

import com.annimon.stream.function.z0;
import com.annimon.stream.p;
import java.util.Calendar;

/* compiled from: EventDayUtils.java */
/* loaded from: classes3.dex */
public class m {
    public static com.annimon.stream.j<com.applandeo.materialcalendarview.m> c(final Calendar calendar, f fVar) {
        return p.N0(fVar.p()).t(new z0() { // from class: t3.l
            @Override // com.annimon.stream.function.z0
            public final boolean test(Object obj) {
                boolean e4;
                e4 = m.e(calendar, (com.applandeo.materialcalendarview.m) obj);
                return e4;
            }
        }).z();
    }

    public static boolean d(final Calendar calendar, f fVar) {
        if (fVar.p() != null || fVar.q()) {
            return p.N0(fVar.p()).b(new z0() { // from class: t3.k
                @Override // com.annimon.stream.function.z0
                public final boolean test(Object obj) {
                    boolean f4;
                    f4 = m.f(calendar, (com.applandeo.materialcalendarview.m) obj);
                    return f4;
                }
            });
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean e(Calendar calendar, com.applandeo.materialcalendarview.m mVar) {
        return mVar.a().equals(calendar) && mVar.c() != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean f(Calendar calendar, com.applandeo.materialcalendarview.m mVar) {
        return mVar.a().equals(calendar) && mVar.c() != 0;
    }
}
