package org.apache.log4j;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.helpers.QuietWriter;
import org.apache.log4j.spi.ErrorHandler;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes3.dex */
public class WriterAppender extends AppenderSkeleton {
    protected String encoding;
    protected boolean immediateFlush;
    protected QuietWriter qw;

    public WriterAppender() {
        this.immediateFlush = true;
    }

    @Override // org.apache.log4j.AppenderSkeleton, org.apache.log4j.spi.OptionHandler
    public void activateOptions() {
    }

    @Override // org.apache.log4j.AppenderSkeleton
    public void append(LoggingEvent loggingEvent) {
        if (checkEntryConditions()) {
            subAppend(loggingEvent);
        }
    }

    protected boolean checkEntryConditions() {
        if (this.closed) {
            LogLog.warn("Not allowed to write to a closed appender.");
            return false;
        }
        if (this.qw == null) {
            this.errorHandler.error("No output stream or file set for the appender named [" + this.name + "].");
            return false;
        }
        if (this.layout != null) {
            return true;
        }
        this.errorHandler.error("No layout set for the appender named [" + this.name + "].");
        return false;
    }

    @Override // org.apache.log4j.Appender
    public synchronized void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        writeFooter();
        reset();
    }

    protected void closeWriter() {
        QuietWriter quietWriter = this.qw;
        if (quietWriter != null) {
            try {
                quietWriter.close();
            } catch (IOException e4) {
                if (e4 instanceof InterruptedIOException) {
                    Thread.currentThread().interrupt();
                }
                LogLog.error("Could not close " + this.qw, e4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.io.OutputStreamWriter createWriter(java.io.OutputStream r3) {
        /*
            r2 = this;
            java.lang.String r0 = r2.getEncoding()
            if (r0 == 0) goto L22
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch: java.io.IOException -> Lc
            r1.<init>(r3, r0)     // Catch: java.io.IOException -> Lc
            goto L23
        Lc:
            r0 = move-exception
            boolean r0 = r0 instanceof java.io.InterruptedIOException
            if (r0 == 0) goto L18
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L18:
            java.lang.String r0 = "Error initializing output writer."
            org.apache.log4j.helpers.LogLog.warn(r0)
            java.lang.String r0 = "Unsupported encoding?"
            org.apache.log4j.helpers.LogLog.warn(r0)
        L22:
            r1 = 0
        L23:
            if (r1 != 0) goto L2a
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            r1.<init>(r3)
        L2a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.log4j.WriterAppender.createWriter(java.io.OutputStream):java.io.OutputStreamWriter");
    }

    public String getEncoding() {
        return this.encoding;
    }

    public boolean getImmediateFlush() {
        return this.immediateFlush;
    }

    @Override // org.apache.log4j.Appender
    public boolean requiresLayout() {
        return true;
    }

    protected void reset() {
        closeWriter();
        this.qw = null;
    }

    public void setEncoding(String str) {
        this.encoding = str;
    }

    @Override // org.apache.log4j.AppenderSkeleton, org.apache.log4j.Appender
    public synchronized void setErrorHandler(ErrorHandler errorHandler) {
        try {
            if (errorHandler == null) {
                LogLog.warn("You have tried to set a null error-handler.");
            } else {
                this.errorHandler = errorHandler;
                QuietWriter quietWriter = this.qw;
                if (quietWriter != null) {
                    quietWriter.setErrorHandler(errorHandler);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setImmediateFlush(boolean z4) {
        this.immediateFlush = z4;
    }

    public synchronized void setWriter(Writer writer) {
        reset();
        this.qw = new QuietWriter(writer, this.errorHandler);
        writeHeader();
    }

    protected boolean shouldFlush(LoggingEvent loggingEvent) {
        return this.immediateFlush;
    }

    protected void subAppend(LoggingEvent loggingEvent) {
        String[] throwableStrRep;
        this.qw.write(this.layout.format(loggingEvent));
        if (this.layout.ignoresThrowable() && (throwableStrRep = loggingEvent.getThrowableStrRep()) != null) {
            for (String str : throwableStrRep) {
                this.qw.write(str);
                this.qw.write(Layout.LINE_SEP);
            }
        }
        if (shouldFlush(loggingEvent)) {
            this.qw.flush();
        }
    }

    protected void writeFooter() {
        String footer;
        QuietWriter quietWriter;
        Layout layout = this.layout;
        if (layout == null || (footer = layout.getFooter()) == null || (quietWriter = this.qw) == null) {
            return;
        }
        quietWriter.write(footer);
        this.qw.flush();
    }

    protected void writeHeader() {
        String header;
        QuietWriter quietWriter;
        Layout layout = this.layout;
        if (layout == null || (header = layout.getHeader()) == null || (quietWriter = this.qw) == null) {
            return;
        }
        quietWriter.write(header);
    }

    public WriterAppender(Layout layout, OutputStream outputStream) {
        this(layout, new OutputStreamWriter(outputStream));
    }

    public WriterAppender(Layout layout, Writer writer) {
        this.immediateFlush = true;
        this.layout = layout;
        setWriter(writer);
    }
}
