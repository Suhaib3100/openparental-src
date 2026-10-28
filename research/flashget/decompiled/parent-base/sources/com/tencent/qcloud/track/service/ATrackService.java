package com.tencent.qcloud.track.service;

import com.tencent.qcloud.track.IReport;

/* loaded from: classes7.dex */
public abstract class ATrackService implements IReport {
    private boolean debug = false;
    private boolean isCloseReport = false;
    protected boolean isInit = false;

    public boolean isCloseReport() {
        return this.isCloseReport;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public void setDebug(boolean z4) {
        this.debug = z4;
    }

    public void setIsCloseReport(boolean z4) {
        this.isCloseReport = z4;
    }
}
