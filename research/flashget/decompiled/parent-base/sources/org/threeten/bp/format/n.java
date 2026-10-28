package org.threeten.bp.format;

/* compiled from: TextStyle.java */
/* loaded from: classes9.dex */
public enum n {
    FULL,
    FULL_STANDALONE,
    SHORT,
    SHORT_STANDALONE,
    NARROW,
    NARROW_STANDALONE;

    public n asNormal() {
        return values()[ordinal() & (-2)];
    }

    public n asStandalone() {
        return values()[ordinal() | 1];
    }

    public boolean isStandalone() {
        return (ordinal() & 1) == 1;
    }
}
