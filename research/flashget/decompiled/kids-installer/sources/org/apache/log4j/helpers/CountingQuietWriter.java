package org.apache.log4j.helpers;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;
import org.apache.log4j.spi.ErrorHandler;

/* loaded from: classes6.dex */
public class CountingQuietWriter extends QuietWriter {
    protected long count;

    public CountingQuietWriter(Writer writer, ErrorHandler errorHandler) {
        super(writer, errorHandler);
    }

    public long getCount() {
        return this.count;
    }

    public void setCount(long j5) {
        this.count = j5;
    }

    @Override // org.apache.log4j.helpers.QuietWriter, java.io.Writer
    public void write(String str) {
        try {
            ((FilterWriter) this).out.write(str);
            this.count += str.length();
        } catch (IOException e6) {
            this.errorHandler.error("Write failure.", e6, 1);
        }
    }
}
