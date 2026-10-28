package org.apache.log4j.helpers;

import androidx.constraintlayout.solver.widgets.analyzer.e;
import java.io.FilterWriter;
import java.io.Writer;
import org.apache.log4j.spi.ErrorHandler;

/* loaded from: classes5.dex */
public class QuietWriter extends FilterWriter {
    protected ErrorHandler errorHandler;

    public QuietWriter(Writer writer, ErrorHandler errorHandler) {
        super(writer);
        setErrorHandler(errorHandler);
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Flushable
    public void flush() {
        try {
            ((FilterWriter) this).out.flush();
        } catch (Exception e6) {
            this.errorHandler.error("Failed to flush writer,", e6, 2);
        }
    }

    public void setErrorHandler(ErrorHandler errorHandler) {
        if (errorHandler == null) {
            throw new IllegalArgumentException("Attempted to set null ErrorHandler.");
        }
        this.errorHandler = errorHandler;
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            try {
                ((FilterWriter) this).out.write(str);
            } catch (Exception e6) {
                this.errorHandler.error(e.a("Failed to write [", str, "]."), e6, 1);
            }
        }
    }
}
