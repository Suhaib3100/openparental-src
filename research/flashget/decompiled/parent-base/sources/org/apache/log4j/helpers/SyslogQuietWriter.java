package org.apache.log4j.helpers;

import java.io.Writer;
import org.apache.log4j.spi.ErrorHandler;

/* loaded from: classes3.dex */
public class SyslogQuietWriter extends QuietWriter {
    int level;
    int syslogFacility;

    public SyslogQuietWriter(Writer writer, int i4, ErrorHandler errorHandler) {
        super(writer, errorHandler);
        this.syslogFacility = i4;
    }

    public void setLevel(int i4) {
        this.level = i4;
    }

    public void setSyslogFacility(int i4) {
        this.syslogFacility = i4;
    }

    @Override // org.apache.log4j.helpers.QuietWriter, java.io.Writer
    public void write(String str) {
        super.write("<" + (this.syslogFacility | this.level) + ">" + str);
    }
}
