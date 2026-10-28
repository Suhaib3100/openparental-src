package com.bumptech.glide;

/* compiled from: MemoryCategory.java */
/* loaded from: classes.dex */
public enum g {
    LOW(0.5f),
    NORMAL(1.0f),
    HIGH(1.5f);

    private final float multiplier;

    g(float f6) {
        this.multiplier = f6;
    }

    public float getMultiplier() {
        return this.multiplier;
    }
}
