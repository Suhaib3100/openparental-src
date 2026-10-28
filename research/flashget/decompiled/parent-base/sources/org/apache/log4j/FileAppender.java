package org.apache.log4j;

import androidx.appcompat.app.h;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.Writer;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.helpers.QuietWriter;
import org.apache.log4j.spi.ErrorHandler;

/* loaded from: classes3.dex */
public class FileAppender extends WriterAppender {
    protected int bufferSize;
    protected boolean bufferedIO;
    protected boolean fileAppend;
    protected String fileName;

    public FileAppender() {
        this.fileAppend = true;
        this.fileName = null;
        this.bufferedIO = false;
        this.bufferSize = 8192;
    }

    @Override // org.apache.log4j.WriterAppender, org.apache.log4j.AppenderSkeleton, org.apache.log4j.spi.OptionHandler
    public void activateOptions() {
        String str = this.fileName;
        if (str == null) {
            LogLog.warn("File option not set for appender [" + this.name + "].");
            LogLog.warn("Are you using FileAppender instead of ConsoleAppender?");
            return;
        }
        try {
            setFile(str, this.fileAppend, this.bufferedIO, this.bufferSize);
        } catch (IOException e4) {
            ErrorHandler errorHandler = this.errorHandler;
            StringBuilder sb = new StringBuilder("setFile(");
            sb.append(this.fileName);
            sb.append(",");
            errorHandler.error(h.a(sb, this.fileAppend, ") call failed."), e4, 4);
        }
    }

    protected void closeFile() {
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

    public boolean getAppend() {
        return this.fileAppend;
    }

    public int getBufferSize() {
        return this.bufferSize;
    }

    public boolean getBufferedIO() {
        return this.bufferedIO;
    }

    public String getFile() {
        return this.fileName;
    }

    @Override // org.apache.log4j.WriterAppender
    protected void reset() {
        closeFile();
        this.fileName = null;
        super.reset();
    }

    public void setAppend(boolean z4) {
        this.fileAppend = z4;
    }

    public void setBufferSize(int i4) {
        this.bufferSize = i4;
    }

    public void setBufferedIO(boolean z4) {
        this.bufferedIO = z4;
        if (z4) {
            this.immediateFlush = false;
        }
    }

    public void setFile(String str) {
        this.fileName = str.trim();
    }

    protected void setQWForFiles(Writer writer) {
        this.qw = new QuietWriter(writer, this.errorHandler);
    }

    public synchronized void setFile(String str, boolean z4, boolean z5, int i4) throws IOException {
        FileOutputStream fileOutputStream;
        try {
            LogLog.debug("setFile called: " + str + ", " + z4);
            if (z5) {
                setImmediateFlush(false);
            }
            reset();
            try {
                fileOutputStream = new FileOutputStream(str, z4);
            } catch (FileNotFoundException e4) {
                String parent = new File(str).getParent();
                if (parent != null) {
                    File file = new File(parent);
                    if (!file.exists() && file.mkdirs()) {
                        fileOutputStream = new FileOutputStream(str, z4);
                    } else {
                        throw e4;
                    }
                } else {
                    throw e4;
                }
            }
            Writer createWriter = createWriter(fileOutputStream);
            if (z5) {
                createWriter = new BufferedWriter(createWriter, i4);
            }
            setQWForFiles(createWriter);
            this.fileName = str;
            this.fileAppend = z4;
            this.bufferedIO = z5;
            this.bufferSize = i4;
            writeHeader();
            LogLog.debug("setFile ended");
        } catch (Throwable th) {
            throw th;
        }
    }

    public FileAppender(Layout layout, String str, boolean z4, boolean z5, int i4) throws IOException {
        this.fileAppend = true;
        this.fileName = null;
        this.bufferedIO = false;
        this.bufferSize = 8192;
        this.layout = layout;
        setFile(str, z4, z5, i4);
    }

    public FileAppender(Layout layout, String str, boolean z4) throws IOException {
        this.fileAppend = true;
        this.fileName = null;
        this.bufferedIO = false;
        this.bufferSize = 8192;
        this.layout = layout;
        setFile(str, z4, false, 8192);
    }

    public FileAppender(Layout layout, String str) throws IOException {
        this(layout, str, true);
    }
}
