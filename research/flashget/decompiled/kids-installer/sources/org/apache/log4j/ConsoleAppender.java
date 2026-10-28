package org.apache.log4j;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.log4j.helpers.LogLog;

/* loaded from: classes6.dex */
public class ConsoleAppender extends WriterAppender {
    private boolean follow;
    protected String target;
    public static final String SYSTEM_OUT = "System.out";
    public static final String SYSTEM_ERR = "System.err";

    /* loaded from: classes5.dex */
    private static class SystemErrStream extends OutputStream {
        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            System.err.flush();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            System.err.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i5, int i6) throws IOException {
            System.err.write(bArr, i5, i6);
        }

        @Override // java.io.OutputStream
        public void write(int i5) throws IOException {
            System.err.write(i5);
        }
    }

    /* loaded from: classes5.dex */
    private static class SystemOutStream extends OutputStream {
        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            System.out.flush();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            System.out.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i5, int i6) throws IOException {
            System.out.write(bArr, i5, i6);
        }

        @Override // java.io.OutputStream
        public void write(int i5) throws IOException {
            System.out.write(i5);
        }
    }

    public ConsoleAppender() {
        this.target = "System.out";
        this.follow = false;
    }

    @Override // org.apache.log4j.WriterAppender, org.apache.log4j.AppenderSkeleton, org.apache.log4j.spi.OptionHandler
    public void activateOptions() {
        if (this.follow) {
            if (this.target.equals("System.err")) {
                setWriter(createWriter(new SystemErrStream()));
            } else {
                setWriter(createWriter(new SystemOutStream()));
            }
        } else if (this.target.equals("System.err")) {
            setWriter(createWriter(System.err));
        } else {
            setWriter(createWriter(System.out));
        }
        super.activateOptions();
    }

    @Override // org.apache.log4j.WriterAppender
    protected final void closeWriter() {
        if (this.follow) {
            super.closeWriter();
        }
    }

    public final boolean getFollow() {
        return this.follow;
    }

    public String getTarget() {
        return this.target;
    }

    public final void setFollow(boolean z5) {
        this.follow = z5;
    }

    public void setTarget(String str) {
        String trim = str.trim();
        if ("System.out".equalsIgnoreCase(trim)) {
            this.target = "System.out";
        } else if ("System.err".equalsIgnoreCase(trim)) {
            this.target = "System.err";
        } else {
            targetWarn(str);
        }
    }

    void targetWarn(String str) {
        LogLog.warn("[" + str + "] should be System.out or System.err.");
        LogLog.warn("Using previously set target, System.out by default.");
    }

    public ConsoleAppender(Layout layout) {
        this(layout, "System.out");
    }

    public ConsoleAppender(Layout layout, String str) {
        this.target = "System.out";
        this.follow = false;
        setLayout(layout);
        setTarget(str);
        activateOptions();
    }
}
