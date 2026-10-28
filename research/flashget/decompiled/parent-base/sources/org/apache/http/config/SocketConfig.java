package org.apache.http.config;

import androidx.appcompat.app.h;
import org.apache.http.annotation.Immutable;
import org.apache.http.util.Args;

@Immutable
/* loaded from: classes3.dex */
public class SocketConfig implements Cloneable {
    public static final SocketConfig DEFAULT = new Builder().build();
    private final boolean soKeepAlive;
    private final int soLinger;
    private final boolean soReuseAddress;
    private final int soTimeout;
    private final boolean tcpNoDelay;

    public static class Builder {
        private boolean soKeepAlive;
        private boolean soReuseAddress;
        private int soTimeout;
        private int soLinger = -1;
        private boolean tcpNoDelay = true;

        Builder() {
        }

        public SocketConfig build() {
            return new SocketConfig(this.soTimeout, this.soReuseAddress, this.soLinger, this.soKeepAlive, this.tcpNoDelay);
        }

        public Builder setSoKeepAlive(boolean z4) {
            this.soKeepAlive = z4;
            return this;
        }

        public Builder setSoLinger(int i4) {
            this.soLinger = i4;
            return this;
        }

        public Builder setSoReuseAddress(boolean z4) {
            this.soReuseAddress = z4;
            return this;
        }

        public Builder setSoTimeout(int i4) {
            this.soTimeout = i4;
            return this;
        }

        public Builder setTcpNoDelay(boolean z4) {
            this.tcpNoDelay = z4;
            return this;
        }
    }

    SocketConfig(int i4, boolean z4, int i5, boolean z5, boolean z6) {
        this.soTimeout = i4;
        this.soReuseAddress = z4;
        this.soLinger = i5;
        this.soKeepAlive = z5;
        this.tcpNoDelay = z6;
    }

    public static Builder copy(SocketConfig socketConfig) {
        Args.notNull(socketConfig, "Socket config");
        return new Builder().setSoTimeout(socketConfig.getSoTimeout()).setSoReuseAddress(socketConfig.isSoReuseAddress()).setSoLinger(socketConfig.getSoLinger()).setSoKeepAlive(socketConfig.isSoKeepAlive()).setTcpNoDelay(socketConfig.isTcpNoDelay());
    }

    public static Builder custom() {
        return new Builder();
    }

    public int getSoLinger() {
        return this.soLinger;
    }

    public int getSoTimeout() {
        return this.soTimeout;
    }

    public boolean isSoKeepAlive() {
        return this.soKeepAlive;
    }

    public boolean isSoReuseAddress() {
        return this.soReuseAddress;
    }

    public boolean isTcpNoDelay() {
        return this.tcpNoDelay;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[soTimeout=");
        sb.append(this.soTimeout);
        sb.append(", soReuseAddress=");
        sb.append(this.soReuseAddress);
        sb.append(", soLinger=");
        sb.append(this.soLinger);
        sb.append(", soKeepAlive=");
        sb.append(this.soKeepAlive);
        sb.append(", tcpNoDelay=");
        return h.a(sb, this.tcpNoDelay, "]");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SocketConfig clone() throws CloneNotSupportedException {
        return (SocketConfig) super.clone();
    }
}
