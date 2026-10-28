package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.boxes.b;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractContainerBox;

/* loaded from: classes3.dex */
public class TrackFragmentBox extends AbstractContainerBox {
    public static final String TYPE = ProtectedSandApp.s("ᎂ");

    public TrackFragmentBox() {
        super(ProtectedSandApp.s("ᎂ"));
    }

    @va.a
    public TrackFragmentHeaderBox getTrackFragmentHeaderBox() {
        for (b bVar : getBoxes()) {
            if (bVar instanceof TrackFragmentHeaderBox) {
                return (TrackFragmentHeaderBox) bVar;
            }
        }
        return null;
    }
}
