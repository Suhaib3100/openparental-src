package org.apache.http.config;

import android.support.v4.media.b;
import org.apache.http.util.Args;

/* loaded from: classes3.dex */
public class MessageConstraints implements Cloneable {
    public static final MessageConstraints DEFAULT = new Builder().build();
    private final int maxHeaderCount;
    private final int maxLineLength;

    public static class Builder {
        private int maxLineLength = -1;
        private int maxHeaderCount = -1;

        Builder() {
        }

        public MessageConstraints build() {
            return new MessageConstraints(this.maxLineLength, this.maxHeaderCount);
        }

        public Builder setMaxHeaderCount(int i4) {
            this.maxHeaderCount = i4;
            return this;
        }

        public Builder setMaxLineLength(int i4) {
            this.maxLineLength = i4;
            return this;
        }
    }

    MessageConstraints(int i4, int i5) {
        this.maxLineLength = i4;
        this.maxHeaderCount = i5;
    }

    public static Builder copy(MessageConstraints messageConstraints) {
        Args.notNull(messageConstraints, "Message constraints");
        return new Builder().setMaxHeaderCount(messageConstraints.getMaxHeaderCount()).setMaxLineLength(messageConstraints.getMaxLineLength());
    }

    public static Builder custom() {
        return new Builder();
    }

    public static MessageConstraints lineLen(int i4) {
        return new MessageConstraints(Args.notNegative(i4, "Max line length"), -1);
    }

    public int getMaxHeaderCount() {
        return this.maxHeaderCount;
    }

    public int getMaxLineLength() {
        return this.maxLineLength;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[maxLineLength=");
        sb.append(this.maxLineLength);
        sb.append(", maxHeaderCount=");
        return b.a(sb, this.maxHeaderCount, "]");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public MessageConstraints clone() throws CloneNotSupportedException {
        return (MessageConstraints) super.clone();
    }
}
