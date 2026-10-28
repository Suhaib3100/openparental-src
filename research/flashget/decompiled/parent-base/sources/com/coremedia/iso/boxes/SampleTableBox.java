package com.coremedia.iso.boxes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractContainerBox;

/* loaded from: classes3.dex */
public class SampleTableBox extends AbstractContainerBox {
    public static final String TYPE = ProtectedSandApp.s("ᆻ");
    private SampleToChunkBox sampleToChunkBox;

    public SampleTableBox() {
        super(ProtectedSandApp.s("ᆻ"));
    }

    public ChunkOffsetBox getChunkOffsetBox() {
        for (b bVar : getBoxes()) {
            if (bVar instanceof ChunkOffsetBox) {
                return (ChunkOffsetBox) bVar;
            }
        }
        return null;
    }

    public CompositionTimeToSample getCompositionTimeToSample() {
        for (b bVar : getBoxes()) {
            if (bVar instanceof CompositionTimeToSample) {
                return (CompositionTimeToSample) bVar;
            }
        }
        return null;
    }

    public SampleDependencyTypeBox getSampleDependencyTypeBox() {
        for (b bVar : getBoxes()) {
            if (bVar instanceof SampleDependencyTypeBox) {
                return (SampleDependencyTypeBox) bVar;
            }
        }
        return null;
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        for (b bVar : getBoxes()) {
            if (bVar instanceof SampleDescriptionBox) {
                return (SampleDescriptionBox) bVar;
            }
        }
        return null;
    }

    public SampleSizeBox getSampleSizeBox() {
        for (b bVar : getBoxes()) {
            if (bVar instanceof SampleSizeBox) {
                return (SampleSizeBox) bVar;
            }
        }
        return null;
    }

    public SampleToChunkBox getSampleToChunkBox() {
        SampleToChunkBox sampleToChunkBox = this.sampleToChunkBox;
        if (sampleToChunkBox != null) {
            return sampleToChunkBox;
        }
        for (b bVar : getBoxes()) {
            if (bVar instanceof SampleToChunkBox) {
                SampleToChunkBox sampleToChunkBox2 = (SampleToChunkBox) bVar;
                this.sampleToChunkBox = sampleToChunkBox2;
                return sampleToChunkBox2;
            }
        }
        return null;
    }

    public SyncSampleBox getSyncSampleBox() {
        for (b bVar : getBoxes()) {
            if (bVar instanceof SyncSampleBox) {
                return (SyncSampleBox) bVar;
            }
        }
        return null;
    }

    public TimeToSampleBox getTimeToSampleBox() {
        for (b bVar : getBoxes()) {
            if (bVar instanceof TimeToSampleBox) {
                return (TimeToSampleBox) bVar;
            }
        }
        return null;
    }
}
