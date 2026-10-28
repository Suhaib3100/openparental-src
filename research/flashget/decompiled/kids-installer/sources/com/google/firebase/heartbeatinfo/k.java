package com.google.firebase.heartbeatinfo;

import androidx.annotation.o0;

/* compiled from: HeartBeatInfo.java */
/* loaded from: classes2.dex */
public interface k {

    /* compiled from: HeartBeatInfo.java */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);

        private final int code;

        a(int i5) {
            this.code = i5;
        }

        public int getCode() {
            return this.code;
        }
    }

    @o0
    a b(@o0 String str);
}
