package org.apache.log4j;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.Writer;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.helpers.QuietWriter;

/* loaded from: classes6.dex */
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
        } catch (IOException e6) {
            this.errorHandler.error("setFile(" + this.fileName + "," + this.fileAppend + ") call failed.", e6, 4);
        }
    }

    protected void closeFile() {
        QuietWriter quietWriter = this.qw;
        if (quietWriter != null) {
            try {
                quietWriter.close();
            } catch (IOException e6) {
                if (e6 instanceof InterruptedIOException) {
                    Thread.currentThread().interrupt();
                }
                LogLog.error("Could not close " + this.qw, e6);
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

    public void setAppend(boolean z5) {
        this.fileAppend = z5;
    }

    public void setBufferSize(int i5) {
        this.bufferSize = i5;
    }

    public void setBufferedIO(boolean z5) {
        this.bufferedIO = z5;
        if (z5) {
            this.immediateFlush = false;
        }
    }

    public void setFile(String str) {
        this.fileName = str.trim();
    }

    protected void setQWForFiles(Writer writer) {
        this.qw = new QuietWriter(writer, this.errorHandler);
    }

    public synchronized void setFile(String str, boolean z5, boolean z6, int i5) throws IOException {
        FileOutputStream fileOutputStream;
        LogLog.debug("setFile called: " + str + ", " + z5);
        if (z6) {
            setImmediateFlush(false);
        }
        reset();
        try {
            fileOutputStream = new FileOutputStream(str, z5);
        } catch (FileNotFoundException e6) {
            String parent = new File(str).getParent();
            if (parent != null) {
                File file = new File(parent);
                if (!file.exists() && file.mkdirs()) {
                    fileOutputStream = new FileOutputStream(str, z5);
                } else {
                    throw e6;
                }
            } else {
                throw e6;
            }
        }
        Writer createWriter = createWriter(fileOutputStream);
        if (z6) {
            createWriter = new BufferedWriter(createWriter, i5);
        }
        setQWForFiles(createWriter);
        this.fileName = str;
        this.fileAppend = z5;
        this.bufferedIO = z6;
        this.bufferSize = i5;
        writeHeader();
        LogLog.debug("setFile ended");
    }

    public FileAppender(Layout layout, String str, boolean z5, boolean z6, int i5) throws IOException {
        this.fileAppend = true;
        this.fileName = null;
        this.bufferedIO = false;
        this.bufferSize = 8192;
        this.layout = layout;
        setFile(str, z5, z6, i5);
    }

    public FileAppender(Layout layout, String str, boolean z5) throws IOException {
        this.fileAppend = true;
        this.fileName = null;
        this.bufferedIO = false;
        this.bufferSize = 8192;
        this.layout = layout;
        setFile(str, z5, false, 8192);
    }

    public FileAppender(Layout layout, String str) throws IOException {
        this(layout, str, true);
    }
}
