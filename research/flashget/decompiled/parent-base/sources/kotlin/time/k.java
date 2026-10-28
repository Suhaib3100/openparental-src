package kotlin.time;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;

/* compiled from: DurationUnit.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/time/h;", "", "h", "(Lkotlin/time/h;)Ljava/lang/String;", "shortName", "g", "(Ljava/lang/String;)Lkotlin/time/h;", "", "isoChar", "", "isTimeComponent", "f", "(CZ)Lkotlin/time/h;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
/* loaded from: classes7.dex */
class k extends j {

    /* compiled from: DurationUnit.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f79221a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[h.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[h.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f79221a = iArr;
        }
    }

    @fg.l
    @c1(version = "1.5")
    public static final h f(char c5, boolean z4) {
        if (!z4) {
            if (c5 == 'D') {
                return h.DAYS;
            }
            throw new IllegalArgumentException(androidx.compose.ui.graphics.vector.j.a(ProtectedSandApp.s("蕇\u0001"), c5));
        }
        if (c5 == 'H') {
            return h.HOURS;
        }
        if (c5 == 'M') {
            return h.MINUTES;
        }
        if (c5 == 'S') {
            return h.SECONDS;
        }
        throw new IllegalArgumentException(androidx.compose.ui.graphics.vector.j.a(ProtectedSandApp.s("蕈\u0001"), c5));
    }

    @fg.l
    @c1(version = "1.5")
    public static final h g(@fg.l String str) {
        l0.p(str, ProtectedSandApp.s("蕉\u0001"));
        int hashCode = str.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && str.equals(ProtectedSandApp.s("蕊\u0001"))) {
                                    return h.MICROSECONDS;
                                }
                            } else if (str.equals(ProtectedSandApp.s("蕋\u0001"))) {
                                return h.NANOSECONDS;
                            }
                        } else if (str.equals(ProtectedSandApp.s("蕌\u0001"))) {
                            return h.MILLISECONDS;
                        }
                    } else if (str.equals(ProtectedSandApp.s("蕍\u0001"))) {
                        return h.SECONDS;
                    }
                } else if (str.equals(ProtectedSandApp.s("蕎\u0001"))) {
                    return h.MINUTES;
                }
            } else if (str.equals(ProtectedSandApp.s("蕏\u0001"))) {
                return h.HOURS;
            }
        } else if (str.equals(ProtectedSandApp.s("蕐\u0001"))) {
            return h.DAYS;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("蕑\u0001").concat(str));
    }

    @fg.l
    @c1(version = "1.3")
    public static final String h(@fg.l h hVar) {
        l0.p(hVar, ProtectedSandApp.s("蕒\u0001"));
        switch (a.f79221a[hVar.ordinal()]) {
            case 1:
                return ProtectedSandApp.s("蕋\u0001");
            case 2:
                return ProtectedSandApp.s("蕊\u0001");
            case 3:
                return ProtectedSandApp.s("蕌\u0001");
            case 4:
                return ProtectedSandApp.s("蕍\u0001");
            case 5:
                return ProtectedSandApp.s("蕎\u0001");
            case 6:
                return ProtectedSandApp.s("蕏\u0001");
            case 7:
                return ProtectedSandApp.s("蕐\u0001");
            default:
                throw new IllegalStateException((ProtectedSandApp.s("蕓\u0001") + hVar).toString());
        }
    }
}
