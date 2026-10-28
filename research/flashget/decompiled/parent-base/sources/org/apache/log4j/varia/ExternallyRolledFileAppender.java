package org.apache.log4j.varia;

import org.apache.log4j.RollingFileAppender;

/* loaded from: classes3.dex */
public class ExternallyRolledFileAppender extends RollingFileAppender {
    HUP hup;
    int port = 0;
    public static final String ROLL_OVER = "RollOver";
    public static final String OK = "OK";

    @Override // org.apache.log4j.FileAppender, org.apache.log4j.WriterAppender, org.apache.log4j.AppenderSkeleton, org.apache.log4j.spi.OptionHandler
    public void activateOptions() {
        super.activateOptions();
        if (this.port != 0) {
            HUP hup = this.hup;
            if (hup != null) {
                hup.interrupt();
            }
            HUP hup2 = new HUP(this, this.port);
            this.hup = hup2;
            hup2.setDaemon(true);
            this.hup.start();
        }
    }

    public int getPort() {
        return this.port;
    }

    public void setPort(int i4) {
        this.port = i4;
    }
}
