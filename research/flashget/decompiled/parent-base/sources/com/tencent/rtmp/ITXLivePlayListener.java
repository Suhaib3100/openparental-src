package com.tencent.rtmp;

import android.os.Bundle;

/* loaded from: classes7.dex */
public interface ITXLivePlayListener {
    void onNetStatus(Bundle bundle);

    void onPlayEvent(int i4, Bundle bundle);
}
