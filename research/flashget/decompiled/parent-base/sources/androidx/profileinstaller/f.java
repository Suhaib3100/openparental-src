package androidx.profileinstaller;

import androidx.collection.p0;

/* compiled from: FileSectionType.java */
/* loaded from: classes3.dex */
enum f {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);

    private final long mValue;

    f(long j4) {
        this.mValue = j4;
    }

    static f fromValue(long j4) {
        f[] values = values();
        for (int i4 = 0; i4 < values.length; i4++) {
            if (values[i4].getValue() == j4) {
                return values[i4];
            }
        }
        throw new IllegalArgumentException(p0.a("Unsupported FileSection Type ", j4));
    }

    public long getValue() {
        return this.mValue;
    }
}
