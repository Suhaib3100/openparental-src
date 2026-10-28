package org.apache.log4j.helpers;

import java.io.File;

/* loaded from: classes5.dex */
public abstract class FileWatchdog extends Thread {
    public static final long DEFAULT_DELAY = 60000;
    protected long delay;
    File file;
    protected String filename;
    boolean interrupted;
    long lastModif;
    boolean warnedAlready;

    protected FileWatchdog(String str) {
        super("FileWatchdog");
        this.delay = DEFAULT_DELAY;
        this.lastModif = 0L;
        this.warnedAlready = false;
        this.interrupted = false;
        this.filename = str;
        this.file = new File(str);
        setDaemon(true);
        checkAndConfigure();
    }

    protected void checkAndConfigure() {
        try {
            if (this.file.exists()) {
                long lastModified = this.file.lastModified();
                if (lastModified > this.lastModif) {
                    this.lastModif = lastModified;
                    doOnChange();
                    this.warnedAlready = false;
                    return;
                }
                return;
            }
            if (this.warnedAlready) {
                return;
            }
            LogLog.debug("[" + this.filename + "] does not exist.");
            this.warnedAlready = true;
        } catch (SecurityException unused) {
            LogLog.warn("Was not allowed to read check file existance, file:[" + this.filename + "].");
            this.interrupted = true;
        }
    }

    protected abstract void doOnChange();

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (!this.interrupted) {
            try {
                Thread.sleep(this.delay);
            } catch (InterruptedException unused) {
            }
            checkAndConfigure();
        }
    }

    public void setDelay(long j5) {
        this.delay = j5;
    }
}
