package com.google.common.cache;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RemovalCause.java */
@g
@d9.b
/* loaded from: classes6.dex */
public abstract class q {
    public static final q EXPLICIT = new a(ProtectedSandApp.s("\uf439"), 0);
    public static final q REPLACED = new q(ProtectedSandApp.s("\uf43a"), 1) { // from class: com.google.common.cache.q.b
        {
            a aVar = null;
        }

        @Override // com.google.common.cache.q
        boolean wasEvicted() {
            return false;
        }
    };
    public static final q COLLECTED = new q(ProtectedSandApp.s("\uf43b"), 2) { // from class: com.google.common.cache.q.c
        {
            a aVar = null;
        }

        @Override // com.google.common.cache.q
        boolean wasEvicted() {
            return true;
        }
    };
    public static final q EXPIRED = new q(ProtectedSandApp.s("\uf43c"), 3) { // from class: com.google.common.cache.q.d
        {
            a aVar = null;
        }

        @Override // com.google.common.cache.q
        boolean wasEvicted() {
            return true;
        }
    };
    public static final q SIZE = new q(ProtectedSandApp.s("\uf43d"), 4) { // from class: com.google.common.cache.q.e
        {
            a aVar = null;
        }

        @Override // com.google.common.cache.q
        boolean wasEvicted() {
            return true;
        }
    };
    private static final /* synthetic */ q[] $VALUES = $values();

    /* compiled from: RemovalCause.java */
    enum a extends q {
        a(String str, int i4) {
            super(str, i4, null);
        }

        @Override // com.google.common.cache.q
        boolean wasEvicted() {
            return false;
        }
    }

    private static /* synthetic */ q[] $values() {
        return new q[]{EXPLICIT, REPLACED, COLLECTED, EXPIRED, SIZE};
    }

    private q(String str, int i4) {
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }

    abstract boolean wasEvicted();

    /* synthetic */ q(String str, int i4, a aVar) {
        this(str, i4);
    }
}
