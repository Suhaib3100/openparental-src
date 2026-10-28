package net.time4j.format;

/* compiled from: Leniency.java */
/* loaded from: classes7.dex */
public enum g {
    STRICT,
    SMART,
    LAX;

    public boolean isLax() {
        return this == LAX;
    }

    public boolean isSmart() {
        return this == SMART;
    }

    public boolean isStrict() {
        return this == STRICT;
    }
}
