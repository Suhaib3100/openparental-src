package com.coremedia.iso.boxes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractContainerBox;

/* loaded from: classes3.dex */
public class MediaInformationBox extends AbstractContainerBox {
    public static final String TYPE = ProtectedSandApp.s("ღ");

    public MediaInformationBox() {
        super(ProtectedSandApp.s("ღ"));
    }

    public AbstractMediaHeaderBox getMediaHeaderBox() {
        for (b bVar : getBoxes()) {
            if (bVar instanceof AbstractMediaHeaderBox) {
                return (AbstractMediaHeaderBox) bVar;
            }
        }
        return null;
    }

    public SampleTableBox getSampleTableBox() {
        for (b bVar : getBoxes()) {
            if (bVar instanceof SampleTableBox) {
                return (SampleTableBox) bVar;
            }
        }
        return null;
    }
}
