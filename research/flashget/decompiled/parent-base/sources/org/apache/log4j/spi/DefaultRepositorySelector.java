package org.apache.log4j.spi;

/* loaded from: classes3.dex */
public class DefaultRepositorySelector implements RepositorySelector {
    final LoggerRepository repository;

    public DefaultRepositorySelector(LoggerRepository loggerRepository) {
        this.repository = loggerRepository;
    }

    @Override // org.apache.log4j.spi.RepositorySelector
    public LoggerRepository getLoggerRepository() {
        return this.repository;
    }
}
