package org.webrtc;

import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public class DataChannel {
    private long nativeDataChannel;
    private long nativeObserver;

    public static class Buffer {
        public final boolean binary;
        public final ByteBuffer data;

        @CalledByNative("Buffer")
        public Buffer(ByteBuffer byteBuffer, boolean z4) {
            this.data = byteBuffer;
            this.binary = z4;
        }
    }

    public static class Init {
        public boolean negotiated;
        public boolean ordered = true;
        public int maxRetransmitTimeMs = -1;
        public int maxRetransmits = -1;
        public String protocol = "";

        /* renamed from: id, reason: collision with root package name */
        public int f88472id = -1;

        @CalledByNative("Init")
        int getId() {
            return this.f88472id;
        }

        @CalledByNative("Init")
        int getMaxRetransmitTimeMs() {
            return this.maxRetransmitTimeMs;
        }

        @CalledByNative("Init")
        int getMaxRetransmits() {
            return this.maxRetransmits;
        }

        @CalledByNative("Init")
        boolean getNegotiated() {
            return this.negotiated;
        }

        @CalledByNative("Init")
        boolean getOrdered() {
            return this.ordered;
        }

        @CalledByNative("Init")
        String getProtocol() {
            return this.protocol;
        }
    }

    public interface Observer {
        @CalledByNative("Observer")
        void onBufferedAmountChange(long j4);

        @CalledByNative("Observer")
        void onMessage(Buffer buffer);

        @CalledByNative("Observer")
        void onStateChange();
    }

    public enum State {
        CONNECTING,
        OPEN,
        CLOSING,
        CLOSED;

        @CalledByNative("State")
        static State fromNativeIndex(int i4) {
            return values()[i4];
        }
    }

    @CalledByNative
    public DataChannel(long j4) {
        this.nativeDataChannel = j4;
    }

    private void checkDataChannelExists() {
        if (this.nativeDataChannel == 0) {
            throw new IllegalStateException("DataChannel has been disposed.");
        }
    }

    private native long nativeBufferedAmount();

    private native void nativeClose();

    private native int nativeId();

    private native String nativeLabel();

    private native long nativeRegisterObserver(Observer observer);

    private native boolean nativeSend(byte[] bArr, boolean z4);

    private native State nativeState();

    private native void nativeUnregisterObserver(long j4);

    public long bufferedAmount() {
        checkDataChannelExists();
        return nativeBufferedAmount();
    }

    public void close() {
        checkDataChannelExists();
        nativeClose();
    }

    public void dispose() {
        checkDataChannelExists();
        JniCommon.nativeReleaseRef(this.nativeDataChannel);
        this.nativeDataChannel = 0L;
    }

    @CalledByNative
    long getNativeDataChannel() {
        return this.nativeDataChannel;
    }

    public int id() {
        checkDataChannelExists();
        return nativeId();
    }

    public String label() {
        checkDataChannelExists();
        return nativeLabel();
    }

    public void registerObserver(Observer observer) {
        checkDataChannelExists();
        long j4 = this.nativeObserver;
        if (j4 != 0) {
            nativeUnregisterObserver(j4);
        }
        this.nativeObserver = nativeRegisterObserver(observer);
    }

    public boolean send(Buffer buffer) {
        checkDataChannelExists();
        byte[] bArr = new byte[buffer.data.remaining()];
        buffer.data.get(bArr);
        return nativeSend(bArr, buffer.binary);
    }

    public State state() {
        checkDataChannelExists();
        return nativeState();
    }

    public void unregisterObserver() {
        checkDataChannelExists();
        nativeUnregisterObserver(this.nativeObserver);
        this.nativeObserver = 0L;
    }

    public boolean send(byte[] bArr) {
        return nativeSend(bArr, true);
    }
}
