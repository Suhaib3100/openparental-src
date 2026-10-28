package com.coremedia.iso.boxes.fragment;

import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractContainerBox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class MovieFragmentBox extends AbstractContainerBox {
    public static final String TYPE = ProtectedSandApp.s("ጭ");

    public MovieFragmentBox() {
        super(ProtectedSandApp.s("ጭ"));
    }

    public com.googlecode.mp4parser.a getFileChannel() {
        return this.dataSource;
    }

    public List<Long> getSyncSamples(SampleDependencyTypeBox sampleDependencyTypeBox) {
        ArrayList arrayList = new ArrayList();
        Iterator<SampleDependencyTypeBox.a> it = sampleDependencyTypeBox.getEntries().iterator();
        long j4 = 1;
        while (it.hasNext()) {
            if (it.next().c() == 2) {
                arrayList.add(Long.valueOf(j4));
            }
            j4++;
        }
        return arrayList;
    }

    public int getTrackCount() {
        return getBoxes(TrackFragmentBox.class, false).size();
    }

    public List<TrackFragmentHeaderBox> getTrackFragmentHeaderBoxes() {
        return getBoxes(TrackFragmentHeaderBox.class, true);
    }

    public long[] getTrackNumbers() {
        List boxes = getBoxes(TrackFragmentBox.class, false);
        long[] jArr = new long[boxes.size()];
        for (int i4 = 0; i4 < boxes.size(); i4++) {
            jArr[i4] = ((TrackFragmentBox) boxes.get(i4)).getTrackFragmentHeaderBox().getTrackId();
        }
        return jArr;
    }

    public List<TrackRunBox> getTrackRunBoxes() {
        return getBoxes(TrackRunBox.class, true);
    }
}
