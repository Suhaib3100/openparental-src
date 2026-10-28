package org.apache.log4j;

import org.apache.log4j.helpers.FileWatchdog;

/* compiled from: PropertyConfigurator.java */
/* loaded from: classes6.dex */
class PropertyWatchdog extends FileWatchdog {
    PropertyWatchdog(String str) {
        super(str);
    }

    @Override // org.apache.log4j.helpers.FileWatchdog
    public void doOnChange() {
        new PropertyConfigurator().doConfigure(this.filename, LogManager.getLoggerRepository());
    }
}
