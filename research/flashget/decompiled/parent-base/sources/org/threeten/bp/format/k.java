package org.threeten.bp.format;

/* compiled from: SignStyle.java */
/* loaded from: classes9.dex */
public enum k {
    NORMAL,
    ALWAYS,
    NEVER,
    NOT_NEGATIVE,
    EXCEEDS_PAD;

    boolean parse(boolean z4, boolean z5, boolean z6) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return (z4 && z5) ? false : true;
        }
        if (ordinal == 1 || ordinal == 4) {
            return true;
        }
        return (z5 || z6) ? false : true;
    }
}
