package net.time4j.history.internal;

/* compiled from: HistoricVariant.java */
/* loaded from: classes7.dex */
public enum b {
    PROLEPTIC_JULIAN,
    PROLEPTIC_GREGORIAN,
    SWEDEN,
    INTRODUCTION_ON_1582_10_15,
    SINGLE_CUTOVER_DATE,
    PROLEPTIC_BYZANTINE;

    /* compiled from: HistoricVariant.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83206a;

        static {
            int[] iArr = new int[b.values().length];
            f83206a = iArr;
            try {
                iArr[b.PROLEPTIC_JULIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83206a[b.PROLEPTIC_GREGORIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83206a[b.SWEDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f83206a[b.INTRODUCTION_ON_1582_10_15.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f83206a[b.PROLEPTIC_BYZANTINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public int getSerialValue() {
        int i4 = a.f83206a[ordinal()];
        if (i4 == 1) {
            return 2;
        }
        if (i4 == 2) {
            return 1;
        }
        if (i4 == 3) {
            return 4;
        }
        if (i4 != 4) {
            return i4 != 5 ? 0 : 3;
        }
        return 7;
    }
}
