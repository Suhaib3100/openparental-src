package com.tencent.cos.xml.model.tag.eventstreaming;

/* loaded from: classes7.dex */
public class Progress {
    private Long bytesProcessed;
    private Long bytesReturned;
    private Long bytesScanned;

    public Progress(Long l4, Long l5, Long l6) {
        this.bytesScanned = l4;
        this.bytesReturned = l5;
        this.bytesProcessed = l6;
    }

    public Long getBytesProcessed() {
        return this.bytesProcessed;
    }

    public Long getBytesReturned() {
        return this.bytesReturned;
    }

    public Long getBytesScanned() {
        return this.bytesScanned;
    }

    public void setBytesProcessed(Long l4) {
        this.bytesProcessed = l4;
    }

    public void setBytesReturned(Long l4) {
        this.bytesReturned = l4;
    }

    public void setBytesScanned(Long l4) {
        this.bytesScanned = l4;
    }

    public Progress withBytesProcessed(Long l4) {
        setBytesProcessed(l4);
        return this;
    }

    public Progress withBytesReturned(Long l4) {
        setBytesReturned(l4);
        return this;
    }

    public Progress withBytesScanned(Long l4) {
        setBytesScanned(l4);
        return this;
    }
}
