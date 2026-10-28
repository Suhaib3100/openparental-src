package org.apache.log4j;

import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.Writer;
import org.apache.commons.io.k;
import org.apache.log4j.helpers.CountingQuietWriter;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.helpers.OptionConverter;
import org.apache.log4j.helpers.QuietWriter;
import org.apache.log4j.spi.LoggingEvent;

/* loaded from: classes6.dex */
public class RollingFileAppender extends FileAppender {
    protected int maxBackupIndex;
    protected long maxFileSize;
    private long nextRollover;

    public RollingFileAppender() {
        this.maxFileSize = 10485760L;
        this.maxBackupIndex = 1;
        this.nextRollover = 0L;
    }

    public int getMaxBackupIndex() {
        return this.maxBackupIndex;
    }

    public long getMaximumFileSize() {
        return this.maxFileSize;
    }

    public void rollOver() {
        QuietWriter quietWriter = this.qw;
        if (quietWriter != null) {
            long count = ((CountingQuietWriter) quietWriter).getCount();
            LogLog.debug("rolling over count=" + count);
            this.nextRollover = count + this.maxFileSize;
        }
        LogLog.debug("maxBackupIndex=" + this.maxBackupIndex);
        boolean z5 = true;
        if (this.maxBackupIndex > 0) {
            File file = new File(String.valueOf(this.fileName) + k.f32026a + this.maxBackupIndex);
            boolean delete = file.exists() ? file.delete() : true;
            for (int i5 = this.maxBackupIndex - 1; i5 >= 1 && delete; i5--) {
                File file2 = new File(String.valueOf(this.fileName) + "." + i5);
                if (file2.exists()) {
                    File file3 = new File(String.valueOf(this.fileName) + k.f32026a + (i5 + 1));
                    LogLog.debug("Renaming file " + file2 + " to " + file3);
                    delete = file2.renameTo(file3);
                }
            }
            if (delete) {
                File file4 = new File(String.valueOf(this.fileName).concat(".1"));
                closeFile();
                File file5 = new File(this.fileName);
                LogLog.debug("Renaming file " + file5 + " to " + file4);
                delete = file5.renameTo(file4);
                if (!delete) {
                    try {
                        setFile(this.fileName, true, this.bufferedIO, this.bufferSize);
                    } catch (IOException e6) {
                        if (e6 instanceof InterruptedIOException) {
                            Thread.currentThread().interrupt();
                        }
                        LogLog.error("setFile(" + this.fileName + ", true) call failed.", e6);
                    }
                }
            }
            z5 = delete;
        }
        if (z5) {
            try {
                setFile(this.fileName, false, this.bufferedIO, this.bufferSize);
                this.nextRollover = 0L;
            } catch (IOException e7) {
                if (e7 instanceof InterruptedIOException) {
                    Thread.currentThread().interrupt();
                }
                LogLog.error("setFile(" + this.fileName + ", false) call failed.", e7);
            }
        }
    }

    @Override // org.apache.log4j.FileAppender
    public synchronized void setFile(String str, boolean z5, boolean z6, int i5) throws IOException {
        super.setFile(str, z5, this.bufferedIO, this.bufferSize);
        if (z5) {
            ((CountingQuietWriter) this.qw).setCount(new File(str).length());
        }
    }

    public void setMaxBackupIndex(int i5) {
        this.maxBackupIndex = i5;
    }

    public void setMaxFileSize(String str) {
        this.maxFileSize = OptionConverter.toFileSize(str, this.maxFileSize + 1);
    }

    public void setMaximumFileSize(long j5) {
        this.maxFileSize = j5;
    }

    @Override // org.apache.log4j.FileAppender
    protected void setQWForFiles(Writer writer) {
        this.qw = new CountingQuietWriter(writer, this.errorHandler);
    }

    @Override // org.apache.log4j.WriterAppender
    protected void subAppend(LoggingEvent loggingEvent) {
        QuietWriter quietWriter;
        super.subAppend(loggingEvent);
        if (this.fileName == null || (quietWriter = this.qw) == null) {
            return;
        }
        long count = ((CountingQuietWriter) quietWriter).getCount();
        if (count < this.maxFileSize || count < this.nextRollover) {
            return;
        }
        rollOver();
    }

    public RollingFileAppender(Layout layout, String str, boolean z5) throws IOException {
        super(layout, str, z5);
        this.maxFileSize = 10485760L;
        this.maxBackupIndex = 1;
        this.nextRollover = 0L;
    }

    public RollingFileAppender(Layout layout, String str) throws IOException {
        super(layout, str);
        this.maxFileSize = 10485760L;
        this.maxBackupIndex = 1;
        this.nextRollover = 0L;
    }
}
