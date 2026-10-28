package com.luck.picture.lib.entity;

import java.util.ArrayList;

/* loaded from: classes6.dex */
public class MediaData {
    public ArrayList<LocalMedia> data;
    public boolean isHasNextMore;

    public MediaData() {
    }

    public MediaData(boolean z4, ArrayList<LocalMedia> arrayList) {
        this.isHasNextMore = z4;
        this.data = arrayList;
    }
}
