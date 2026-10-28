package com.tencent.cos.xml.model.tag.eventstreaming;

import java.nio.ByteBuffer;

/* loaded from: classes7.dex */
public class SelectObjectContentEvent {

    public static class ContinuationEvent extends SelectObjectContentEvent {
        @Override // com.tencent.cos.xml.model.tag.eventstreaming.SelectObjectContentEvent
        /* renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo18clone() throws CloneNotSupportedException {
            return super.mo18clone();
        }
    }

    public static class EndEvent extends SelectObjectContentEvent {
        @Override // com.tencent.cos.xml.model.tag.eventstreaming.SelectObjectContentEvent
        /* renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo18clone() throws CloneNotSupportedException {
            return super.mo18clone();
        }
    }

    public static class ProgressEvent extends SelectObjectContentEvent {
        private Progress details;

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.SelectObjectContentEvent
        /* renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo18clone() throws CloneNotSupportedException {
            return super.mo18clone();
        }

        public Progress getDetails() {
            return this.details;
        }

        public void setDetails(Progress progress) {
            this.details = progress;
        }

        public ProgressEvent withDetails(Progress progress) {
            setDetails(progress);
            return this;
        }
    }

    public static class RecordsEvent extends SelectObjectContentEvent {
        private ByteBuffer payload;

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.SelectObjectContentEvent
        /* renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo18clone() throws CloneNotSupportedException {
            return super.mo18clone();
        }

        public ByteBuffer getPayload() {
            return this.payload;
        }

        public void setPayload(ByteBuffer byteBuffer) {
            this.payload = byteBuffer;
        }

        public RecordsEvent withPayload(ByteBuffer byteBuffer) {
            setPayload(byteBuffer);
            return this;
        }
    }

    public static class StatsEvent extends SelectObjectContentEvent {
        private Stats details;

        @Override // com.tencent.cos.xml.model.tag.eventstreaming.SelectObjectContentEvent
        /* renamed from: clone */
        public /* bridge */ /* synthetic */ Object mo18clone() throws CloneNotSupportedException {
            return super.mo18clone();
        }

        public Stats getDetails() {
            return this.details;
        }

        public void setDetails(Stats stats) {
            this.details = stats;
        }

        public StatsEvent withDetails(Stats stats) {
            setDetails(stats);
            return this;
        }
    }

    @Override // 
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SelectObjectContentEvent mo18clone() {
        try {
            return (SelectObjectContentEvent) super.clone();
        } catch (CloneNotSupportedException e4) {
            throw new RuntimeException(e4);
        }
    }
}
