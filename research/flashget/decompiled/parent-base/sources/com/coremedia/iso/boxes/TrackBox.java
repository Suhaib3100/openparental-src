package com.coremedia.iso.boxes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.List;

/* loaded from: classes3.dex */
public class TrackBox extends AbstractContainerBox {
    public static final String TYPE = ProtectedSandApp.s("ቋ");
    private SampleTableBox sampleTableBox;

    public TrackBox() {
        super(ProtectedSandApp.s("ቋ"));
    }

    public MediaBox getMediaBox() {
        for (b bVar : getBoxes()) {
            if (bVar instanceof MediaBox) {
                return (MediaBox) bVar;
            }
        }
        return null;
    }

    public SampleTableBox getSampleTableBox() {
        MediaInformationBox mediaInformationBox;
        SampleTableBox sampleTableBox = this.sampleTableBox;
        if (sampleTableBox != null) {
            return sampleTableBox;
        }
        MediaBox mediaBox = getMediaBox();
        if (mediaBox == null || (mediaInformationBox = mediaBox.getMediaInformationBox()) == null) {
            return null;
        }
        SampleTableBox sampleTableBox2 = mediaInformationBox.getSampleTableBox();
        this.sampleTableBox = sampleTableBox2;
        return sampleTableBox2;
    }

    public TrackHeaderBox getTrackHeaderBox() {
        for (b bVar : getBoxes()) {
            if (bVar instanceof TrackHeaderBox) {
                return (TrackHeaderBox) bVar;
            }
        }
        return null;
    }

    @Override // com.googlecode.mp4parser.BasicContainer, com.coremedia.iso.boxes.c
    public void setBoxes(List<b> list) {
        super.setBoxes(list);
        this.sampleTableBox = null;
    }
}
