package com.tencent.cos.xml.common;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public class Range {
    private long end;
    private long start;

    public Range(long j4, long j5) {
        this.start = j4;
        this.end = j5;
    }

    public long getEnd() {
        return this.end;
    }

    public String getRange() {
        Long valueOf = Long.valueOf(this.start);
        long j4 = this.end;
        return String.format(ProtectedSandApp.s("㕃\u0001"), valueOf, j4 == -1 ? "" : String.valueOf(j4));
    }

    public long getStart() {
        return this.start;
    }

    public Range(long j4) {
        this(j4, -1L);
    }
}
