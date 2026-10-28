package org.apache.log4j.spi;

import java.io.InputStream;
import java.net.URL;

/* loaded from: classes3.dex */
public interface Configurator {
    public static final String NULL = "null";
    public static final String INHERITED = "inherited";

    void doConfigure(InputStream inputStream, LoggerRepository loggerRepository);

    void doConfigure(URL url, LoggerRepository loggerRepository);
}
