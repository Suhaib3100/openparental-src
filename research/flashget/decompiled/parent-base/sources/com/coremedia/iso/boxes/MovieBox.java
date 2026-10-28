package com.coremedia.iso.boxes;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.List;

/* loaded from: classes3.dex */
public class MovieBox extends AbstractContainerBox {
    public static final String TYPE = ProtectedSandApp.s("ჩ");

    public MovieBox() {
        super(ProtectedSandApp.s("ჩ"));
    }

    public MovieHeaderBox getMovieHeaderBox() {
        for (b bVar : getBoxes()) {
            if (bVar instanceof MovieHeaderBox) {
                return (MovieHeaderBox) bVar;
            }
        }
        return null;
    }

    public int getTrackCount() {
        return getBoxes(TrackBox.class).size();
    }

    public long[] getTrackNumbers() {
        List boxes = getBoxes(TrackBox.class);
        long[] jArr = new long[boxes.size()];
        for (int i4 = 0; i4 < boxes.size(); i4++) {
            jArr[i4] = ((TrackBox) boxes.get(i4)).getTrackHeaderBox().getTrackId();
        }
        return jArr;
    }
}
