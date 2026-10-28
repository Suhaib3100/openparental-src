package com.tencent.rtmp;

import android.os.Bundle;

/* loaded from: classes7.dex */
public interface ITXLivePushListener {
    void onNetStatus(Bundle bundle);

    void onPushEvent(int i4, Bundle bundle);
}
