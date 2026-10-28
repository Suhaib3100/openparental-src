package org.apache.log4j.helpers;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;
import org.apache.log4j.spi.ErrorHandler;

/* loaded from: classes3.dex */
public class CountingQuietWriter extends QuietWriter {
    protected long count;

    public CountingQuietWriter(Writer writer, ErrorHandler errorHandler) {
        super(writer, errorHandler);
    }

    public long getCount() {
        return this.count;
    }

    public void setCount(long j4) {
        this.count = j4;
    }

    @Override // org.apache.log4j.helpers.QuietWriter, java.io.Writer
    public void write(String str) {
        try {
            ((FilterWriter) this).out.write(str);
            this.count += str.length();
        } catch (IOException e4) {
            this.errorHandler.error("Write failure.", e4, 1);
        }
    }
}
