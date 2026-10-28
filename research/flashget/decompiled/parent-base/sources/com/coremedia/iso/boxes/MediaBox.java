package com.coremedia.iso.boxes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractContainerBox;

/* loaded from: classes3.dex */
public class MediaBox extends AbstractContainerBox {
    public static final String TYPE = ProtectedSandApp.s("Ⴤ");

    public MediaBox() {
        super(ProtectedSandApp.s("Ⴤ"));
    }

    public HandlerBox getHandlerBox() {
        for (b bVar : getBoxes()) {
            if (bVar instanceof HandlerBox) {
                return (HandlerBox) bVar;
            }
        }
        return null;
    }

    public MediaHeaderBox getMediaHeaderBox() {
        for (b bVar : getBoxes()) {
            if (bVar instanceof MediaHeaderBox) {
                return (MediaHeaderBox) bVar;
            }
        }
        return null;
    }

    public MediaInformationBox getMediaInformationBox() {
        for (b bVar : getBoxes()) {
            if (bVar instanceof MediaInformationBox) {
                return (MediaInformationBox) bVar;
            }
        }
        return null;
    }
}
