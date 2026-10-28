package com.tencent.qcloud.network.sonar;

/* loaded from: classes7.dex */
public class SonarResult<T> {
    private Exception exception;
    private T result;
    private final boolean success = false;
    private final SonarType type;

    public SonarResult(SonarType sonarType, T t4) {
        this.type = sonarType;
        this.result = t4;
    }

    public Exception getException() {
        return this.exception;
    }

    public T getResult() {
        return this.result;
    }

    public SonarType getType() {
        return this.type;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public SonarResult(SonarType sonarType, Exception exc) {
        this.type = sonarType;
        this.exception = exc;
    }
}
