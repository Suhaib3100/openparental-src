package kotlin.time;

import com.flashget.kidsdownloader.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.l0;

/* compiled from: DurationUnit.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0001\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0001H\u0001¨\u0006\t"}, d2 = {"durationUnitByIsoChar", "Lkotlin/time/DurationUnit;", "isoChar", "", "isTimeComponent", "", "durationUnitByShortName", "shortName", "", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
/* loaded from: classes5.dex */
class k extends j {

    /* compiled from: DurationUnit.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27208a;

        static {
            int[] iArr = new int[DurationUnit.values().length];
            try {
                iArr[DurationUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DurationUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DurationUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DurationUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DurationUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DurationUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DurationUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f27208a = iArr;
        }
    }

    @SinceKotlin(version = "1.5")
    @d5.d
    public static final DurationUnit f(char c6, boolean z5) {
        if (!z5) {
            if (c6 == 'D') {
                return DurationUnit.DAYS;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("尾") + c6);
        }
        if (c6 == 'H') {
            return DurationUnit.HOURS;
        }
        if (c6 == 'M') {
            return DurationUnit.MINUTES;
        }
        if (c6 == 'S') {
            return DurationUnit.SECONDS;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("尿") + c6);
    }

    @SinceKotlin(version = "1.5")
    @d5.d
    public static final DurationUnit g(@d5.d String str) {
        l0.p(str, ProtectedSandApp.s("局"));
        int hashCode = str.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && str.equals(ProtectedSandApp.s("屁"))) {
                                    return DurationUnit.MICROSECONDS;
                                }
                            } else if (str.equals(ProtectedSandApp.s("层"))) {
                                return DurationUnit.NANOSECONDS;
                            }
                        } else if (str.equals(ProtectedSandApp.s("屃"))) {
                            return DurationUnit.MILLISECONDS;
                        }
                    } else if (str.equals(ProtectedSandApp.s("屄"))) {
                        return DurationUnit.SECONDS;
                    }
                } else if (str.equals(ProtectedSandApp.s("居"))) {
                    return DurationUnit.MINUTES;
                }
            } else if (str.equals(ProtectedSandApp.s("屆"))) {
                return DurationUnit.HOURS;
            }
        } else if (str.equals(ProtectedSandApp.s("屇"))) {
            return DurationUnit.DAYS;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("屈").concat(str));
    }

    @SinceKotlin(version = "1.3")
    @d5.d
    public static final String h(@d5.d DurationUnit durationUnit) {
        l0.p(durationUnit, ProtectedSandApp.s("屉"));
        switch (a.f27208a[durationUnit.ordinal()]) {
            case 1:
                return ProtectedSandApp.s("屑");
            case 2:
                return ProtectedSandApp.s("屐");
            case 3:
                return ProtectedSandApp.s("屏");
            case 4:
                return ProtectedSandApp.s("屎");
            case 5:
                return ProtectedSandApp.s("屍");
            case 6:
                return ProtectedSandApp.s("屌");
            case 7:
                return ProtectedSandApp.s("屋");
            default:
                throw new IllegalStateException((ProtectedSandApp.s("届") + durationUnit).toString());
        }
    }
}
