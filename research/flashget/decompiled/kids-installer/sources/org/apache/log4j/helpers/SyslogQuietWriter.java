package org.apache.log4j.helpers;

import java.io.Writer;
import org.apache.log4j.spi.ErrorHandler;

/* loaded from: classes6.dex */
public class SyslogQuietWriter extends QuietWriter {
    int level;
    int syslogFacility;

    public SyslogQuietWriter(Writer writer, int i5, ErrorHandler errorHandler) {
        super(writer, errorHandler);
        this.syslogFacility = i5;
    }

    public void setLevel(int i5) {
        this.level = i5;
    }

    public void setSyslogFacility(int i5) {
        this.syslogFacility = i5;
    }

    @Override // org.apache.log4j.helpers.QuietWriter, java.io.Writer
    public void write(String str) {
        super.write("<" + (this.syslogFacility | this.level) + ">" + str);
    }
}
