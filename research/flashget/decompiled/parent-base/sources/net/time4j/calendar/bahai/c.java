package net.time4j.calendar.bahai;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import net.time4j.engine.j;
import net.time4j.format.u;
import net.time4j.format.x;

/* compiled from: BadiEra.java */
/* loaded from: classes7.dex */
public enum c implements j {
    BAHAI;

    /* compiled from: BadiEra.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82407a;

        static {
            int[] iArr = new int[x.values().length];
            f82407a = iArr;
            try {
                iArr[x.WIDE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82407a[x.ABBREVIATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82407a[x.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82407a[x.NARROW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static u accessor(Locale locale, x xVar) {
        String s4;
        int i4 = a.f82407a[xVar.ordinal()];
        if (i4 == 1) {
            s4 = ProtectedSandApp.s("赃\u0001");
        } else if (i4 == 2 || i4 == 3) {
            s4 = ProtectedSandApp.s("赂\u0001");
        } else {
            if (i4 != 4) {
                throw new UnsupportedOperationException(xVar.name());
            }
            s4 = ProtectedSandApp.s("赁\u0001");
        }
        return net.time4j.format.b.d(ProtectedSandApp.s("资\u0001"), locale).p(ProtectedSandApp.s("赅\u0001"), c.class, s4);
    }

    public String getDisplayName(Locale locale, x xVar) {
        return accessor(locale, xVar).g(this);
    }
}
