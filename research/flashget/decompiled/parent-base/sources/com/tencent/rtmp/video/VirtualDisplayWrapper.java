package com.tencent.rtmp.video;

import android.hardware.display.VirtualDisplay;

/* loaded from: classes7.dex */
public class VirtualDisplayWrapper {
    private VirtualDisplay mVirtualDisplay;

    public VirtualDisplayWrapper(VirtualDisplay virtualDisplay) {
        this.mVirtualDisplay = virtualDisplay;
    }

    public void release() {
        VirtualDisplay virtualDisplay = this.mVirtualDisplay;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.mVirtualDisplay = null;
        }
    }

    public void resize(int i4, int i5) {
        VirtualDisplay virtualDisplay = this.mVirtualDisplay;
        if (virtualDisplay != null) {
            virtualDisplay.resize(i4, i5, 1);
        }
    }
}
